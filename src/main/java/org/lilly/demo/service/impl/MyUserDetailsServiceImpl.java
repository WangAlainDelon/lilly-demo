package org.lilly.demo.service.impl;


import org.lilly.demo.service.MyUserDetailsService;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.social.security.SocialUser;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;
import org.springframework.stereotype.Component;

/**
 * User: Mr.Wang
 * Date: 2020/5/31
 */
@Component
public class MyUserDetailsServiceImpl implements MyUserDetailsService, SocialUserDetailsService {
    /**
     * 根据手机号查询，用户名字查询
     * @param s
     * @return
     * @throws UsernameNotFoundException
     */

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new User("admin", new BCryptPasswordEncoder().encode("admin"),
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }

//    @Override
//    public UserDetails loadUserByMobile(String mobile) throws UsernameNotFoundException {
//
//        return new User("admin", new BCryptPasswordEncoder().encode("admin"),
//                true, true, true, false,
//                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
//    }

    /**
     * 根据业务系统userId来查询用户
     * @param s
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public SocialUserDetails loadUserByUserId(String s) throws UsernameNotFoundException {
        //这里还需要加上业务系统中的userID todo
        return new SocialUser("admin", new BCryptPasswordEncoder().encode("admin"),
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}

