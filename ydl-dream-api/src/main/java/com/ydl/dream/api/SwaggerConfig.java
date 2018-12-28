/*
 * Copyright (C) 2015-2016 Fragment All rights reserved
 * Author: huangjinkai
 * Date: 2016年12月8日
 * Description:SwaggerConfig.java 
 */
package com.ydl.dream.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan("com.ydl.dream.api.apis")
public class SwaggerConfig {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage("com.ydl.dream.api.apis"))
				.paths(PathSelectors.any()).build();
	}

	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfoBuilder().title("壹点灵服务端接口文档").description("壹点灵接口管理").license("MIT").licenseUrl("http://opensource.org/licenses/MIT")
				.contact(new Contact("", "", "")).version("1.0").build();

		return apiInfo;
	}

}
