package org.microapp.membernet;

import org.springframework.beans.factory.annotation.Autowired;

import com.yoso.dev.membernet.membership.service.MembershipManager;

public class AccessManagerImpl implements AccessManager{

	@Autowired
	private MembershipManager membershipManager;
	
	public boolean canAccess(long requesterId, long targetId) {
		// TODO Auto-generated method stub
		return membershipManager.get(requesterId).isSocietyAdmin();
	}

	
	
}
