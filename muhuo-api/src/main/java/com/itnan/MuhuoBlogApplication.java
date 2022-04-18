package com.itnan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author NJY
 * @version V1.0
 * @Package PACKAGE_NAME
 * @ClassName MuhuoBlogApplication.java
 * @createTime 2022年04月15日 16:08:00
 * @Description TODO
 * @Saying 山河总静好，人事也从容
 */
@SpringBootApplication(scanBasePackages = {"com.itnan"})
public class MuhuoBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(MuhuoBlogApplication.class, args);
    }
}
