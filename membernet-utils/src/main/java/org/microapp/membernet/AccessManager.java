package org.microapp.membernet;

public interface AccessManager {
	
	public boolean canAccess(long requesterId, long targetId);
}
