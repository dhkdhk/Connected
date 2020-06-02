package com.connected.connected.member;

import com.connected.connected.member.application.MemberRegistration;
import com.connected.connected.member.application.MemberService;
import com.connected.connected.member.domain.entity.Member;
import com.connected.connected.member.domain.repository.MemberRepository;
import com.connected.connected.member.interfaces.handler.exception.MemberEmailDuplicatedException;
import com.connected.connected.member.setup.MemberBuilder;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class MemberServiceTest {

    @InjectMocks
    private MemberRegistration memberService;

    @Mock
    private MemberRepository memberRepository;

    @Test
    public void createMember(){
        //Given
        final Member member = MemberBuilder.build();

        //When
        when(memberService.createMember(member)).thenReturn(member);
        Member savedMember = memberService.createMember(member);

        verify(memberRepository, atLeastOnce()).save(member);
        assertThat(member).isNotNull();
        assertThat(savedMember.getMemberId()).isEqualTo(member.getMemberId());
    }

    @Test(expected = MemberEmailDuplicatedException.class)
    @DisplayName("기존 회원 이메일이 있을 경우")
    public void exsistedMember(){
        //Given
        final Member member = MemberBuilder.build();
        memberService.createMember(member);

        //When
        memberService.createMember(member);

    }
}
