package org.scoula.security.filter;

import lombok.extern.slf4j.Slf4j;
import org.scoula.security.account.dto.LoginDTO;
import org.scoula.security.handler.LoginFailureHandler;
import org.scoula.security.handler.LoginSuccessHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.http.HttpResponse;

@Slf4j
@Component
public class JwtUsernamePasswordAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    // 스프링 생성자 주입을 통해 전달
    public JwtUsernamePasswordAuthenticationFilter(
            AuthenticationManager authenticationManager, // SecurityConfig가 생성된 이후에 등록됨.
            LoginSuccessHandler loginSuccessHandler,
            LoginFailureHandler loginFailureHandler) {
        super(authenticationManager);

        setFilterProcessesUrl("/api/auth/login"); // Post 로그인 요청 url
        setAuthenticationSuccessHandler(loginSuccessHandler);
        setAuthenticationFailureHandler(loginFailureHandler);
    }
    // POST 로그인 요청 시 작동("/api/auth/login")
    // -> request 바디에서 username, password에 꺼내고, authenticationManger에게 전달하는 역할을 한다.
    // 성공하면 SuccessHandler, 실패하면 FailureHandler
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException {
        // 요청 BODY의 JSON에서 username, password  LoginDTO
        LoginDTO login = LoginDTO.of(request);

        // 인증 토큰(UsernamePasswordAuthenticationToken) 구성
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(login.getUsername(), login.getPassword());

        // AuthenticationManager에게 인증 요청
        return getAuthenticationManager().authenticate(authenticationToken);
    }
}
