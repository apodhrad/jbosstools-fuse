package org.jboss.tools.fuse.qe.reddeer.component;

public class File implements CamelComponent {

	@Override
	public String getPaletteEntry() {
		return "File";
	}

	@Override
	public String getLabel() {
		return "file:directoryName";
	}

	@Override
	public String getTooltip() {
		return "The File Component provides access to file systems";
	}

}
