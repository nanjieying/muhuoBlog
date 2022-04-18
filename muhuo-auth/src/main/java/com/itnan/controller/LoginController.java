package com.itnan.controller;

import com.itnan.service.serviceImpl.LoginServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NJY
 * @version V1.0
 * @Package com.itnan.controller
 * @ClassName LoginController.java
 * @createTime 2022年04月18日 14:38:00
 * @Description TODO
 * @Saying 山河总静好，人事也从容
 */
@RestController
@Slf4j
@RequestMapping("/auth")
public class LoginController {
    @Autowired
    private LoginServiceImpl loginService;

    @RequestMapping("/login")
    public String login() {
        String login = loginService.login();
        return login;
    }
}
