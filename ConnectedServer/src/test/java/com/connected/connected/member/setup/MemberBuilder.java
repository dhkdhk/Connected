package com.connected.connected.member.setup;

import com.connected.connected.member.domain.Member;
import io.github.benas.randombeans.EnhancedRandomBuilder;

public class MemberBuilder {

    public static Member build(){
        return EnhancedRandomBuilder
                        .aNewEnhancedRandom()
                        .nextObject(Member.class, "memberId");

    }
}
