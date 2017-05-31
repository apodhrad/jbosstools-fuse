package org.jboss.tools.fuse.qe.reddeer.requirement;

import org.jboss.tools.fuse.qe.reddeer.runtime.ServerBase;

public enum ServerConnType {

	LOCAL, REMOTE, ANY;

	public boolean matches(ServerBase serverBase) {
		boolean isRemote = serverBase.isRemote();
		switch (this) {
		case LOCAL:
			return !isRemote;
		case REMOTE:
			return isRemote;
		default:
			return true;
		}
	}

}
