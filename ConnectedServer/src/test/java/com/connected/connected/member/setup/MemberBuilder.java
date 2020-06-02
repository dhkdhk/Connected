package com.connected.connected.member.setup;

import com.connected.connected.member.domain.entity.Member;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import org.springframework.stereotype.Component;

public class MemberBuilder {

    public static Member build(){
        return EnhancedRandomBuilder
                        .aNewEnhancedRandom()
                        .nextObject(Member.class, "memberId");

    }
}
