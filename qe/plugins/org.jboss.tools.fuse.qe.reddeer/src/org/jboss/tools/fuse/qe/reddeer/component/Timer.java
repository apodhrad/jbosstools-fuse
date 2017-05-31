package org.jboss.tools.fuse.qe.reddeer.component;

public class Timer implements CamelComponent {

	@Override
	public String getPaletteEntry() {
		return "Timer";
	}

	@Override
	public String getLabel() {
		return "timer:timerName";
	}

	@Override
	public String getTooltip() {
		return null;
	}

}
