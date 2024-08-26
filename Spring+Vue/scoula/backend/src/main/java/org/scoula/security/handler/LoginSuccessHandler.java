package org.scoula.security.handler;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.scoula.security.account.domain.CustomUser;
import org.scoula.security.account.dto.AuthResultDTO;
import org.scoula.security.account.dto.UserInfoDTO;
import org.scoula.security.util.JsonResponse;
import org.scoula.security.util.JwtProcessor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Log4j
@Component
@RequiredArgsConstructor
public class LoginSuccessHandler implements AuthenticationSuccessHandler {
    // 성공했을 때 의존 객체를 만들어야 함. 생성자 주입을 위해서 final 키워드를 넣어야 한다.
    private final JwtProcessor jwtProcessor;

    private AuthResultDTO makeAuthResult(CustomUser user) {
        String username = user.getUsername();

        String token = jwtProcessor.generateToken(username);

        return new AuthResultDTO(token, UserInfoDTO.of(user.getMember()));
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        // authentication.getPrincipal()의 리턴타입: UserDetails
        CustomUser user = (CustomUser) authentication.getPrincipal();

        AuthResultDTO result = makeAuthResult(user);
        JsonResponse.send(response, result);
    }

}
