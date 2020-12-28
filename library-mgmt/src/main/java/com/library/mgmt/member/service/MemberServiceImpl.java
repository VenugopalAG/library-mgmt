package com.library.mgmt.member.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.mgmt.member.model.Member;
import com.library.mgmt.member.repsitory.MemberRepository;
/**
 * 
 * @author venugopal
 *
 */
@Service
@Transactional
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	public Member addMember(Member member) {
		memberRepository.save(member);
		return member;
	}

	@Override
	public List<Member> getAllMembers() {
		return memberRepository.findAll();
	}

	@Override
	public Member deleteMember(Integer memberId) {
		return null;
	}

	@Override
	public Member updateMember(Member member) {
		return null;
	}

	@Override
	public Member getMember(long memberId) {
		Optional<Member> member = memberRepository.findById(memberId);
		if(member.isPresent()) {
			return member.get();
		}
		return null;
	}

}
