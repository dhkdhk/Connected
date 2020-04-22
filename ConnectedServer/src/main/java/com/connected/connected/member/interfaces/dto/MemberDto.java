package com.connected.connected.member.interfaces.dto;


import com.connected.connected.member.domain.Account;
import com.connected.connected.member.interfaces.dto.validation.PhoneNumberConstraint;
import lombok.*;

import javax.validation.constraints.Email;


@Builder @Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PRIVATE)
public class MemberDto {

    @Email(message = "올바른 Email 형식이 아닙니다.")
    private String memberEmail;
    private String memberNickName;
    private int age;

    @PhoneNumberConstraint
    private String phoneNumber;
    private Account account;

}
