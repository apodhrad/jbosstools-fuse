package org.jboss.tools.fuse.qe.reddeer.component;

public class FTPS implements CamelComponent {

	@Override
	public String getPaletteEntry() {
		return "FTPS";
	}

	@Override
	public String getLabel() {
		return "ftps:host:port/directoryName";
	}

	@Override
	public String getTooltip() {
		return "FTP Secure (FTP over SSL/TLS) Component.";
	}

}
