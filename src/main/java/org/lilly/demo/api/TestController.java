package org.lilly.demo.api;

import org.lilly.demo.dto.UserDTO;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * User: Mr.Wang
 * Date: 2020/5/31
 */
@Controller
public class TestController {

    //    /**
//     * 登陆成功跳转这里
//     */
//    @PostMapping("/hello")
//    public String test() {
//        System.out.println("hello security");
//        return "index";
//    }
    @GetMapping("/preLogin.html")
    public String hello() {
        System.out.println("hello security");
        return "preLogin";
    }

    /**
     * 对外公开
     *
     * @return
     */
    @GetMapping("/index")
    public String login() {
        System.out.println("123");
        return "index";
    }

    @GetMapping("/user.html")
    @ResponseBody
    public List<UserDTO> getUserList() {
        UserDTO userDTO1 = new UserDTO();
        userDTO1.setId(1L);
        userDTO1.setName("user1");
        UserDTO userDTO2 = new UserDTO();
        userDTO2.setId(1L);
        userDTO2.setName("user2");
        return Arrays.asList(userDTO1, userDTO2);
    }

    @GetMapping("/user/1.html")
    @ResponseBody
    public UserDTO getUser() {
        UserDTO userDTO1 = new UserDTO();
        userDTO1.setId(1L);
        userDTO1.setName("user1");
        return userDTO1;
    }


    @GetMapping("/user/1")
    @ResponseBody
    public UserDTO getUser1() {
        UserDTO userDTO1 = new UserDTO();
        userDTO1.setId(1L);
        userDTO1.setName("user1");
        return userDTO1;
    }


    /**
     * 标准注册页面
     */
    @GetMapping("/demo-signUp")
    public String standardSigUp() {
        return "demo-signUp";
    }
}
