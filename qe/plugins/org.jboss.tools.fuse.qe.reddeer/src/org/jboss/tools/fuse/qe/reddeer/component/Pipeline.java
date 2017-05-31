package org.jboss.tools.fuse.qe.reddeer.component;

/**
 * 
 * @author apodhrad
 *
 */
public class Pipeline implements CamelComponent {

	@Override
	public String getPaletteEntry() {
		return "Pipeline";
	}

	@Override
	public String getLabel() {
		return "pipeline";
	}

	@Override
	public String getTooltip() {
		return null;
	}

}
