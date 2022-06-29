package com.example.springbootdocker;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public FilterRegistrationBean errorFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new ErrorFilter());
        bean.addUrlPatterns("/*");
        bean.setOrder(1);
        return bean;
    }

}
