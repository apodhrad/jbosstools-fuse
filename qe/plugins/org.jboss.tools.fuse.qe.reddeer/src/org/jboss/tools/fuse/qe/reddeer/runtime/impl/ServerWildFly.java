package org.jboss.tools.fuse.qe.reddeer.runtime.impl;

import javax.xml.bind.annotation.XmlRootElement;

import org.jboss.tools.fuse.qe.reddeer.runtime.Namespaces;

/**
 * WildFly Server
 * 
 * @author apodhrad
 * 
 */
@XmlRootElement(name = "wildfly", namespace = Namespaces.SOA_REQ)
public class ServerWildFly extends ServerAS {

	private final String category = "JBoss Community";

	private final String label = "WildFly";

	@Override
	public String getCategory() {
		return category;
	}

	@Override
	public String getServerType() {
		return label + "  " + getVersion();
	}

	@Override
	public String getRuntimeType() {
		return label + "  " + getVersion() + " Runtime";
	}

}
