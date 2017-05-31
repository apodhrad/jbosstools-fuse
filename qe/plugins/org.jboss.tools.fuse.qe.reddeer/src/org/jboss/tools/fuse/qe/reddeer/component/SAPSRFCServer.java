package org.jboss.tools.fuse.qe.reddeer.component;

import static org.jboss.tools.fuse.qe.reddeer.component.SAPLabels.RFC;
import static org.jboss.tools.fuse.qe.reddeer.component.SAPLabels.SERVER;

/**
 * 
 * @author apodhrad
 *
 */
public class SAPSRFCServer extends AbstractURICamelComponent {

	public SAPSRFCServer() {
		super("sap-srfc-server");
		addProperty(SERVER, "server");
		addProperty(RFC, "rfc");
	}

	@Override
	public String getPaletteEntry() {
		return "SAP sRFC Server";
	}

}
