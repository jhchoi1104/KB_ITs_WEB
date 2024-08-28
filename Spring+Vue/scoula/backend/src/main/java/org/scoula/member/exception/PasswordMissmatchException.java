package org.scoula.member.exception;

import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordMissmatchException extends RuntimeException {
    public PasswordMissmatchException() {
        super("비밀번호가 일치하지 않습니다.");
    }
}
