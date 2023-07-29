package com.taewoo.loltrack.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/api/hello")
    public String test() {
        return "스프링-리엑트 연동 성공. LOL TRACK 예시 사이트 잘 만들어보자.";
    }
}
