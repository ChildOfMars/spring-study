package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan("com")
public class SpringMvcConfiguration implements WebMvcConfigurer{
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		return new InternalResourceViewResolver("WEB-INF/pages/", ".html");
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	public CommonsMultipartResolver multipartResolver() {
		return new CommonsMultipartResolver();
	}

//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		MyInterceptor myInterceptor = new MyInterceptor();
//		registry.addInterceptor(myInterceptor).addPathPatterns("/*")
//			.excludePathPatterns(new String[] {"/login","/loginForm","/registForm","/regist","/error","/findAll"});
//	}
	@Bean
	public SimpleMappingExceptionResolver smer() {
		SimpleMappingExceptionResolver simpleMappingExceptionResolver = new SimpleMappingExceptionResolver();
		simpleMappingExceptionResolver.setDefaultErrorView("error");
		return simpleMappingExceptionResolver;
	}

}
