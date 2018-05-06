package com.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.spring.dto.MessageBean;

@Configuration
@ComponentScan(basePackages = "com.spring.dto,com.spring.service")
@PropertySource(
        value={"classpath:customer.properties"},
        ignoreResourceNotFound = true)
public class Appconfiguration {

	@Bean
	public MessageBean messageBean() {
		MessageBean messageBean = new MessageBean();
		messageBean.setMessage("Hello From Java Congig...!");
		return messageBean;
	}
	
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
       return new PropertySourcesPlaceholderConfigurer();
    }
	
}
