package org.scoula.config;
// 웹과 무관한 설정 ex) 데이터베이스 설정

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
// "org.scoula" 패키지 안에 있는 component을 본다. 싱글톤처럼 리턴이 된다.
@ComponentScan(basePackages={"org.scoula"})
public class RootConfig {
}
