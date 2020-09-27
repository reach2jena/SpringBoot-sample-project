package com.saanvisoft.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.saanvi.config.SpringSwaggerConfig;

import io.swagger.models.Contact;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com.saanvisoft")
@EnableSwagger2
public class MasterRatingsServiceApplication {

	@Bean
	public Docket swaggerConfiguration() {

		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/ratings/*"))
				.apis(RequestHandlerSelectors.basePackage("com.saanvisoft.service")).build().apiInfo(getInfo());
	}

	private ApiInfo getInfo() {
		return new ApiInfoBuilder().description("Rating API").title("Rating API 1.0")
				.license("Free to use").version("1.0").build();

	}

	public static void main(String[] args) {
		SpringApplication.run(MasterRatingsServiceApplication.class, args);
	}

}
