package com.connected.connected.member.domain.entity;

import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity @Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Member {

    @Id @GeneratedValue
    private Long memberId;
    private String memberEmail;
    private String memberNickName;
    private int age;
    private String phoneNumber;
    @Embedded
    private MemberToken memberToken;

}
