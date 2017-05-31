package org.jboss.tools.fuse.qe.reddeer.component;

public class Scheduler implements CamelComponent {

	@Override
	public String getPaletteEntry() {
		return "Scheduler";
	}

	@Override
	public String getLabel() {
		return "scheduler:name";
	}

	@Override
	public String getTooltip() {
		return null;
	}

}
