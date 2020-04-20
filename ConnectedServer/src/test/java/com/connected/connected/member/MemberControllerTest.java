package com.connected.connected.member;


import com.connected.connected.member.domain.Account;
import com.connected.connected.member.interfaces.MemberDto;
import com.connected.connected.support.ControllerSupport;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
public class MemberControllerTest extends ControllerSupport {

    private Account account;

    @Before
    public void setUp(){
        account = EnhancedRandomBuilder.aNewEnhancedRandom().nextObject(Account.class);
    }

    @Test
    public void signUpValidationCheck() throws Exception{
        //Given
        MemberDto memberDto = MemberDto.builder()
                .memberEmail("MemberEMailsaskjlgas")
                .memberNickName("닉네임")
                .phoneNumber("010-2389-3781")
                .age(5)
                .account(account)
                .build();

        //When
        postApi("/members", memberDto)
                .andDo(print())
                .andExpect(status().isBadRequest());

    }

}
