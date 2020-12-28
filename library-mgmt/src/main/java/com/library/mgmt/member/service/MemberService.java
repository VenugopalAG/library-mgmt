package com.library.mgmt.member.service;

import java.util.List;

import com.library.mgmt.member.model.Member;

public interface MemberService {

	public Member addMember(Member member);
	
	public List<Member> getAllMembers();
	
	public Member deleteMember(Integer memberId);
	
	public Member updateMember(Member member);
	
	public Member getMember(long memberId);
	
}
