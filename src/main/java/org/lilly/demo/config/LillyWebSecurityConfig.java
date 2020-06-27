//package org.lilly.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
///**
// * User: Mr.Wang
// * Date: 2020/5/31
// */
//
//@Configuration
//@EnableWebSecurity
//public class LillyWebSecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
////        http.formLogin() 								// 定义当需要用户登录时候，转到的登录页面。
////                .loginPage("/lilly-login")	 					// 设置登录页面
////                .loginProcessingUrl("/user/login") 			// 自定义的登录接口
////                .defaultSuccessUrl("/home").permitAll()		// 登录成功之后，默认跳转的页面
////                .and().authorizeRequests()					// 定义哪些URL需要被保护、哪些不需要被保护
////                .antMatchers("/v1/hello", "/index","/user/login").permitAll()		// 设置所有人都可以访问登录页面
////                .anyRequest().authenticated() ;				// 任何请求,登录后可以访问
////
////                .and().csrf().disable(); 					// 关闭csrf防护
////        http.authorizeRequests().antMatchers("/user/*").permitAll();
//
////        http.formLogin() // 表单登录。跳转到security默认的登录表单页
////                .loginPage("/login").permitAll()
////                .and()
////                .authorizeRequests() // 对请求授权
////                .antMatchers("/index/hello").permitAll() //允许所有人访问/noAuth
////                .anyRequest() // 任何请求
////                .authenticated();// 需要身份认证
//
//
//        //关闭打开的csrf保护
////        http.cors().and().csrf().disable();
//        http
//                //使用form表单post方式进行登录
//                .formLogin()
//                //登录页面为自定义的登录页面
//                .loginPage("/login")
//                .loginProcessingUrl("/authentication/form") //表单提交登录请求的验证路径
//                //设置登录成功跳转页面，error=true控制页面错误信息的展示
//                .successForwardUrl("/hello").failureUrl("/login?error=true")
//                .permitAll()
//                .and()
//                //允许不登陆就可以访问的方法，多个用逗号分隔
//                .authorizeRequests().antMatchers("/index").permitAll()
//                //其他的需要授权后访问
//                .anyRequest().authenticated();
//    }
//
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
