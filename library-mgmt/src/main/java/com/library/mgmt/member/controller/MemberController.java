package com.library.mgmt.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.library.mgmt.member.model.Member;
import com.library.mgmt.member.service.MemberService;

/**
 * 
 * @author venugopal
 *
 */

@RestController
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@PostMapping("/member")
	public Member addMember(@RequestBody Member member) {
		memberService.addMember(member);
		return member;
	}
	
	@GetMapping("/member/{memberId}")
	public Member getMember(@PathVariable Long memberId) {
		return memberService.getMember(memberId);
	}
	
}
