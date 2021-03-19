package com.andrew.study;

import com.andrew.study.service.IUserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SecurityApplication.class)
public class Test {

    @Autowired
    private IUserService userService;

    @org.junit.Test
    public void test() {
        boolean andrew = userService.updateByName("andrew");
    }

}
