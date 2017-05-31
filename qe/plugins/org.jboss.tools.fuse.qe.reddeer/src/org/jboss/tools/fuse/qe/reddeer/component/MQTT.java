package org.jboss.tools.fuse.qe.reddeer.component;

public class MQTT implements CamelComponent {

	@Override
	public String getPaletteEntry() {
		return "MQTT";
	}

	@Override
	public String getLabel() {
		return "mqtt:name";
	}

	@Override
	public String getTooltip() {
		return null;
	}

}
