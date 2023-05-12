package com.example;

import com.example.domain.User;
import com.example.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@SpringBootTest
class SpringsecuritydemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Test
    public void testUserMapper() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    public void testBCryptPasswordEncoder(){
        String encode = passwordEncoder.encode("123456");
        System.out.println(encode);
		/*boolean matches = passwordEncoder.matches("1234", "$2a$10$TkkXrauHrYmGeLiearildOg1VkMePGs.VLc4arrDLAKxfhwF1qb.y");
		System.out.println(matches);*/
    }

}
