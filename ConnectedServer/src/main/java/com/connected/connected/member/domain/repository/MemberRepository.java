package com.connected.connected.member.domain.repository;

import com.connected.connected.member.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByMemberEmail(String memberEmail);
    boolean existsByMemberEmail(String memberEmail);
}
