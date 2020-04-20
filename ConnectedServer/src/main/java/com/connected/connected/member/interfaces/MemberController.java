package com.connected.connected.member.interfaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Controller
public class MemberController {

    @PostMapping(value = "/members")
    public void memberSignUp(@RequestBody @Valid MemberDto memberDto){


    }
}
