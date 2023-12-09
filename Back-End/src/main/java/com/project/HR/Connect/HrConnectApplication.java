package com.project.HR.Connect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class HrConnectApplication {

	public static void main(String[] args){

//		if (System.getenv("GOOGLE_APPLICATION_CREDENTIALS") == null){
//			System.out.println("Please set GOOGLE_APPLICATION_CREDENTIALS environment variable to <path to credentials.json>");
//			return;
//		}
		SpringApplication.run(HrConnectApplication.class, args);

	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("http://localhost:4200")
						.allowedMethods("GET", "POST", "PUT", "DELETE")
						.allowedHeaders("*")
						.allowCredentials(true)
						.maxAge(3600000);
			}
		};
	}

}
