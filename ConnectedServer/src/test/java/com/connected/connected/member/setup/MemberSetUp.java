package com.connected.connected.member.setup;

import com.connected.connected.member.domain.Member;
import com.connected.connected.member.domain.repository.MemberRepository;
import org.springframework.stereotype.Component;

@Component
public class MemberSetUp {

    private final MemberRepository memberRepository;

    public MemberSetUp(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    public Member save(){
        return memberRepository.save(MemberBuilder.build());
    }


}
