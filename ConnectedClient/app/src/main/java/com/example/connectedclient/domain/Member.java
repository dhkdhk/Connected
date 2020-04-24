package com.example.connectedclient.domain;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder @Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Member {

    private String memberEmail;
    private String memberNickName;
    private int age;
    private String phoneNumber;
    private MemberToken token;

    public void setMemberToken(MemberToken token){
        this.token = token;
    }
}
