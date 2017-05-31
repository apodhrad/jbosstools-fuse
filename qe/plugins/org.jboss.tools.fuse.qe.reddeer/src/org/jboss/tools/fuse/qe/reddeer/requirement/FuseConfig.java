package org.jboss.tools.fuse.qe.reddeer.requirement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.jboss.tools.fuse.qe.reddeer.runtime.Namespaces;

/**
 * @author tsedmik
 */
@XmlRootElement(name = "fuse-requirement", namespace = Namespaces.SOA_REQ)
@XmlAccessorType(XmlAccessType.FIELD)
public class FuseConfig extends ServerConfig {

	@XmlElement(name = "camelVersion", namespace = Namespaces.SOA_REQ)
	private String camelVersion;

	public String getCamelVersion() {
		return camelVersion;
	}

	public void setCamelVersion(String camelVersion) {
		this.camelVersion = camelVersion;
	}
}
