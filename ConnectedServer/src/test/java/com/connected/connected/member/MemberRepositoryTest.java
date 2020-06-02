package com.connected.connected.member;

import com.connected.connected.member.domain.entity.Member;
import com.connected.connected.member.domain.entity.MemberToken;
import com.connected.connected.member.domain.repository.MemberRepository;
import com.connected.connected.member.interfaces.handler.exception.MemberEmailDuplicatedException;
import com.connected.connected.member.setup.MemberBuilder;
import com.connected.connected.member.setup.MemberSetUp;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    private MemberBuilder memberBuilder;

    @Before
    public void setUp(){
        memberBuilder = new MemberBuilder();
    }


    @Test
    public void createMember() {
        //Given
        final Member member = memberBuilder.build();

        //When
        final Member savedMember = memberRepository.save(member);

        //Then
        assertThat(savedMember.getMemberId(), is(notNullValue()));
        assertEquals(savedMember.getMemberToken(), member.getMemberToken());
        assertEquals(savedMember.getMemberEmail(), member.getMemberEmail());
        assertEquals(savedMember.getAge(), member.getAge());
        assertEquals(savedMember.getMemberNickName(), member.getMemberNickName());
        assertEquals(savedMember.getPhoneNumber(), member.getPhoneNumber());
    }

}
