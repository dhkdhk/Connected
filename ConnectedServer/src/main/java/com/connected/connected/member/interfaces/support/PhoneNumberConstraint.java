package com.connected.connected.member.interfaces.support;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PhoneNumberValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneNumberConstraint {
    String message() default "핸드폰 양식을 지켜주세요";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
