package org.jboss.tools.fuse.qe.reddeer.component;

public class Atom implements CamelComponent {

	@Override
	public String getPaletteEntry() {
		return "Atom";
	}

	@Override
	public String getLabel() {
		return "atom:feedUri";
	}

	@Override
	public String getTooltip() {
		return "An Atom Component.";
	}

}
