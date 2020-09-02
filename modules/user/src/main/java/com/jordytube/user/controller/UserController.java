package com.jordytube.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String test() {
        return "whow!!!";
    }




    // 사용자용
    // 가입 신청
    // 비밀번호 변경
    // id , password 일치 체크 알려주는 API
    //
    // 운영자용
    // 가입 승인 -->
    // 사용자 정보 전반적으로 수정
}
