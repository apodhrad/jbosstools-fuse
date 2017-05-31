package org.jboss.tools.fuse.qe.reddeer.component;

public class Netty implements CamelComponent {

	@Override
	public String getPaletteEntry() {
		return "Netty";
	}

	@Override
	public String getLabel() {
		return "netty:protocol:host:port";
	}

	@Override
	public String getTooltip() {
		return null;
	}

}
