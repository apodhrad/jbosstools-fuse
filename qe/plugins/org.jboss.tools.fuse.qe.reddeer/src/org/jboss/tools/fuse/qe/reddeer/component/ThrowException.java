package org.jboss.tools.fuse.qe.reddeer.component;

/**
 * 
 * @author apodhrad
 *
 */
public class ThrowException implements CamelComponent {

	@Override
	public String getPaletteEntry() {
		return "Throw Exception";
	}

	@Override
	public String getLabel() {
		return "throwException";
	}

	@Override
	public String getTooltip() {
		return null;
	}

}
