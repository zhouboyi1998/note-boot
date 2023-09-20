package com.cafe.config

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc

/**
 * @Project: note-boot
 * @Package: com.cafe.config
 * @Author: zhouboyi
 * @Date: 2023/9/19 17:01
 * @Description: Swagger 配置类
 */
@Profile("dev")
@Configuration
@EnableKnife4j
@EnableSwagger2WebMvc
class SwaggerConfig {

    @Bean
    fun docket(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.cafe"))
            .paths(PathSelectors.any())
            .build()
    }

    private fun apiInfo(): ApiInfo {
        return ApiInfoBuilder()
            .title("note-boot")
            .description("note-boot")
            .contact(Contact("zhouboyi", "https://github.com/zhouboyi1998", "1144188685@qq.com"))
            .termsOfServiceUrl("https://github.com/zhouboyi1998/note-boot")
            .version("version 1.0")
            .license("MIT")
            .licenseUrl("https://opensource.org/licenses/MIT")
            .build()
    }
}
