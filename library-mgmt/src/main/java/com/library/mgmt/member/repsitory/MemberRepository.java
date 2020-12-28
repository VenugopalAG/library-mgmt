package com.library.mgmt.member.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.mgmt.member.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
