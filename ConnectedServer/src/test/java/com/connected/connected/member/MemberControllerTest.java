package com.connected.connected.member;


import com.connected.connected.member.interfaces.dto.MemberDto;
import com.connected.connected.member.setup.MemberBuilder;
import com.connected.connected.member.setup.MemberSetUp;
import com.connected.connected.support.ControllerSupport;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


public class MemberControllerTest extends ControllerSupport {



    @Test
    public void signUpValidationCheck() throws Exception{
        //Given
        MemberDto memberDto = MemberDto.builder()
                .memberEmail("WrongEmail")
                .memberNickName("닉네임")
                .phoneNumber("010-3781")
                .age(5)
                .build();

        //When & Then
        postApi("/members", memberDto)
                .andDo(print())
                .andExpect(jsonPath("$", hasSize(2)));
    }
}
