package com.stackoverflow.mcve.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.stackoverflow.mcve.filter.DemoFilter;

@SpringBootApplication
@EnableWebMvc
@Controller
public class WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

	@GetMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello, World!";
	}
	
	@Bean
	public FilterRegistrationBean<DemoFilter> filterBean() {
		FilterRegistrationBean<DemoFilter> frb = new FilterRegistrationBean<DemoFilter>();
		frb.setFilter(new DemoFilter());
		return frb;
	}
}
