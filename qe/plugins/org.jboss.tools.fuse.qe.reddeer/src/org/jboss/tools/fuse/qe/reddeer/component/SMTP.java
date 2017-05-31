package org.jboss.tools.fuse.qe.reddeer.component;

public class SMTP implements CamelComponent {

	@Override
	public String getPaletteEntry() {
		return "SMTP";
	}

	@Override
	public String getLabel() {
		return "smtp:host:port";
	}

	@Override
	public String getTooltip() {
		return null;
	}

}
