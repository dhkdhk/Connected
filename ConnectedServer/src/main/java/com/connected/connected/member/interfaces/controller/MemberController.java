package com.connected.connected.member.interfaces.controller;

import com.connected.connected.member.interfaces.dto.MemberDto;
import com.connected.connected.member.interfaces.handler.ErrorResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Controller
public class MemberController {

    @PostMapping(value = "/members")
    public ResponseEntity memberSignUp(@RequestBody @Valid MemberDto memberDto, Errors errors){

        if(errors.hasErrors()){
            ErrorResource errorResource = new ErrorResource(errors);
            return ResponseEntity.badRequest().body(errorResource.getErrorResources());
        }



        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
