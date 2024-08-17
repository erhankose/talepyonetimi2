package com.erhankose.talep_yonetimi;

import jakarta.servlet.annotation.WebServlet;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TalepYonetimiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TalepYonetimiApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper() {
		return  new ModelMapper();
	}

}
