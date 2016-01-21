package org.microapp.membernet;

import java.util.List;

import com.yoso.dev.membernet.membership.domain.Membership;

public interface MembernetManager {
	
	public boolean canAccess(long requesterId, long targetId);
	
	public List<Membership> listAll();
}
