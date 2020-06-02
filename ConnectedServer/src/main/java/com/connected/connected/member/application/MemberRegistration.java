package com.connected.connected.member.application;

import com.connected.connected.member.domain.entity.Member;
import com.connected.connected.member.domain.repository.MemberRepository;
import com.connected.connected.member.interfaces.handler.exception.MemberEmailDuplicatedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberRegistration implements MemberService {

    private final MemberRepository memberRepository;

    public MemberRegistration(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Override
    public Member createMember(Member member) {
        validationExsistedMemberEmail(member.getMemberEmail());
        return memberRepository.save(member);
    }

    private void validationExsistedMemberEmail(final String memberEmail) {
        if(memberRepository.existsByMemberEmail(memberEmail)){
            throw new MemberEmailDuplicatedException(memberEmail);
        }
    }
}
