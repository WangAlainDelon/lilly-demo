package org.lilly.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * User: Mr.Wang
 * Date: 2020/5/31
 */
@RestController
public class LoginController {

    @GetMapping("/signIn")
    public ModelAndView signIn(String error) {
        ModelAndView modelAndView = new ModelAndView("signIn");
//        modelAndView.addObject("error", error);
        return modelAndView;
    }


}
