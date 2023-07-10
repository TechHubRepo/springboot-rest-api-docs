package com.techhub.spring.sampleapi.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenAPIConfiguration {

	// Customization for Doc API Info
	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("Spring Test API").description("Spring Test Sample application")
						.version("v0.0.1").license(new License().name("Apache 2.0").url("http://springdoc.org")))
				.externalDocs(new ExternalDocumentation().description("Spring Test Wiki Documentation")
						.url("https://test.org/docs"));
	}

	@Bean
	public GroupedOpenApi apiGroupA() {
		return GroupedOpenApi.builder().group("API A").pathsToMatch("/api-a/**")
				.packagesToScan("com.techhub.spring.sampleapi.apia.controller").build();
	}

	@Bean
	public GroupedOpenApi apiGroupB() {
		return GroupedOpenApi.builder().group("API B").pathsToMatch("/api-b/*")
				.packagesToScan("com.techhub.spring.sampleapi.apib.controller").build();
	}
}
