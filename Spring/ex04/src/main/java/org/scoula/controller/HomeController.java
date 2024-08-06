package org.scoula.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 자바 빈으로 등록이 된다.(이전에는 Component라는 어노테이션을 썼다.
@Controller
@Slf4j
public class HomeController {
    // getMap "/" ,메서드
    @GetMapping("/")
    public String home() {
        log.info("=========> HomeController /"); // log을 선언하지 않았는데 사용할 수 있는 ㅣ유: Slf4j: 이 어노테이션을 쓰기 위해서 build.gradle의 Logging에 패키지를 추가했기 때문에 할수 있다.
        return "index"; // view의 이름
    }
}
