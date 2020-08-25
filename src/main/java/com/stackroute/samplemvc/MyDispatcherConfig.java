package com.stackroute.samplemvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.stackroute.samplemvc")

public class MyDispatcherConfig {

	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver isr=new InternalResourceViewResolver();
		isr.setPrefix("/WEB-INF/views/");
		isr.setSuffix(".jsp");
		return isr;
	}
	
}
