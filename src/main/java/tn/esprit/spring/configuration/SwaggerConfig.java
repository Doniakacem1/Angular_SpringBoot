package tn.esprit.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
	public class SwaggerConfig {

	@Bean
	public Docket api() {
	return new Docket(DocumentationType.SWAGGER_2).select()
			.apis(RequestHandlerSelectors.any())
			.paths(PathSelectors.any())
			.build();

	}

	}

