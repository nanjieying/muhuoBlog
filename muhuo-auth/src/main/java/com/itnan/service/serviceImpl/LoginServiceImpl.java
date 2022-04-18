package com.itnan.service.serviceImpl;

import com.itnan.service.LoginService;
import org.springframework.stereotype.Service;

/**
 * @author NJY
 * @version V1.0
 * @Package com.itnan.service.serviceImpl
 * @ClassName LoginServiceImpl.java
 * @createTime 2022年04月18日 14:40:00
 * @Description TODO
 * @Saying 山河总静好，人事也从容
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public String login() {
        return "你好，世界";
    }
}
