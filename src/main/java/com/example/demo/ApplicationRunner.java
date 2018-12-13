/**
 * 
 */
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author aniket
 *
 *Swagger support added 
 *To enable the swagger UI add the swagger UI dependency of swagger UI in gradle file.
 * 
 * The API docs can be viewed at - http://localhost:8090/v2/api-docs
 * 
 * The swagger UI can be viewed at -http://localhost:8090/swagger-ui.html
 * 
 *
 *
 */
@SpringBootApplication
@Configuration
@EnableSwagger2
@EnableEurekaClient
public class ApplicationRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ApplicationRunner.class, args);
	}
	
	
	@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
                .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.cloud")))
                .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.data.rest.webmvc")))
                .paths(PathSelectors.any())
                .build();
    }

}
