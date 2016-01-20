/*******************************************************************************
 * Copyright (c) 2014 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.fuse.transformation.core.model;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Model {

    private Class<?> modelClass;
    private String name;
    private String type;
    private Model parent;
    private HashMap<String, Model> children = new HashMap<String, Model>();
    private boolean isCollection;

    public Model(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Model addChild(String name, String type) {
        Model node = new Model(name, type);
        node.parent = this;
        node.name = name;
        node.type = type;
        children.put(name, node);
        return node;
    }

    public void print(PrintStream out) {
        printModel(this, 0, out);
    }

    public Model get(String nodeName) {
        Model model = null;
        if (nodeName.contains(".")) {
            if (hasChildren()) {
                int idx = nodeName.indexOf(".");
                String parent = nodeName.substring(0, idx);
                String child = nodeName.substring(idx + 1, nodeName.length());
                Model parentModel = children.get(parent);
                if (parentModel != null) {
                    model = parentModel.get(child);
                }
            }
        } else {
            return children.get(nodeName);
        }
        return model;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Model getParent() {
        return parent;
    }

    public boolean isCollection() {
        return isCollection;
    }
    
    public boolean hasChildren() {
        return children.size() > 0;
    }

    public Model setIsCollection(boolean isCollection) {
        this.isCollection = isCollection;
        return this;
    }

    public List<Model> getChildren() {
        return new ArrayList<Model>(children.values());
    }

    public List<String> listFields() {
        List<String> fields = new LinkedList<String>();
        return listFields(fields, this.children.values(), "");
    }

    public List<String> listFields(List<String> fieldList, 
            Collection<Model> fields, String prefix) {
        for (Model field : fields) {
            fieldList.add(prefix + field.getName());
            listFields(fieldList, field.children.values(), prefix + field.getName() + ".");
        }
        return fieldList;
    }

    @Override
    public String toString() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        print(new PrintStream(bos, true));
        return bos.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Model)) {
            return false;
        } else if (obj == this) {
            return true;
        }
        Model comp = (Model) obj;
        return isEqual(modelClass, comp.getModelClass())
                && isEqual(name, comp.getName())
                && isEqual(type, comp.type)
                && isEqual(children, comp.children);
    }

    @Override
    public int hashCode() {
        return hash(modelClass, name, type, children);
    }

    public Class<?> getModelClass() {
        return modelClass;
    }

    public void setModelClass(Class<?> modelClass) {
        this.modelClass = modelClass;
    }

    private void printModel(Model node, int depth, PrintStream out) {
        out.println(format(node, depth));
        for (Model child : node.children.values()) {
            printModel(child, depth + 1, out);
        }
    }

    private String format(Model node, int depth) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < depth; i++) {
            sb.append("  ");
        }
        sb.append(node.children.isEmpty() ? "- " : "* ");
        sb.append(node.name + " : " + node.type);
        return sb.toString();
    }

    private boolean isEqual(Object objA, Object objB) {
        // basic checks
        if (objA == null && objB == null) {
            return true;
        } else if (objA == null || objB == null) {
            return false;
        } else {
            return objA.equals(objB);
        }
    }

    private int hash(Object... vals) {
        int hash = 7;
        for (Object val : vals) {
            if (val != null) {
                hash = hash * 37 + val.hashCode();
            }
        }
        return hash;
    }
}