package com.andrew.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    // 定义用户信息服务
    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("andrew").password("123").authorities("p1").build());
        manager.createUser(User.withUsername("jack").password("456").authorities("p2").build());
        return manager;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests()
                .antMatchers("/r/r1").hasAuthority("p1") // 拦截指定授权
                .antMatchers("/r/r2").hasAuthority("p2")
                .antMatchers("/r/**").authenticated() // 所有从/r/**的接口都需要认证
                .anyRequest().permitAll() // 其他接口允许
                .and()
                .formLogin() // 允许表单登录
                .successForwardUrl("/login-success"); // 登录成功后跳转接口
    }
}
