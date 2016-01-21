package org.microapp.membernet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yoso.dev.membernet.membership.domain.Membership;
import com.yoso.dev.membernet.membership.service.MembershipManager;

public class MembernetManagerImpl implements MembernetManager{

	@Autowired
	private MembershipManager membershipManager;
	
	public boolean canAccess(long requesterId, long targetId) {
		// TODO Auto-generated method stub
		return membershipManager.get(requesterId).isSocietyAdmin();
	}

	public List<Membership> listAll() {
		return membershipManager.getAll();
	}

	
	
}
