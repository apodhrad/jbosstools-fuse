package org.jboss.tools.fuse.qe.reddeer.component;

import static org.jboss.tools.fuse.qe.reddeer.component.SAPLabels.APPLICATION_RELEASE;
import static org.jboss.tools.fuse.qe.reddeer.component.SAPLabels.DESTINATION;
import static org.jboss.tools.fuse.qe.reddeer.component.SAPLabels.IDOC_TYPE;
import static org.jboss.tools.fuse.qe.reddeer.component.SAPLabels.IDOC_TYPE_EXTENSION;
import static org.jboss.tools.fuse.qe.reddeer.component.SAPLabels.SYSTEM_RELEASE;

/**
 * 
 * @author apodhrad
 *
 */
public class SAPIDocDestination extends AbstractURICamelComponent {

	public SAPIDocDestination() {
		super("sap-idoc-destination");
		addProperty(DESTINATION, "destination");
		addProperty(IDOC_TYPE, "idocType");
		addProperty(IDOC_TYPE_EXTENSION, "idocTypeExtension");
		addProperty(SYSTEM_RELEASE, "systemRelease");
		addProperty(APPLICATION_RELEASE, "applicationRelease");
	}

	@Override
	public String getPaletteEntry() {
		return "SAP IDoc Destination";
	}

}
