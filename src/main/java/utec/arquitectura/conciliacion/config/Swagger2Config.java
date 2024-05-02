package utec.arquitectura.conciliacion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
public class Swagger2Config {

    @Bean
    public Docket infoApiAvailabilityHub() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("utec.arquitectura.conciliacion.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo("Cursos API REST",
                "API REST de registro de alunos.",
                "1.0",
                "Terms of Service",new Contact("Romulo Sorato", "https://www.linkedin.com/in/r%C3%B4mulo-sorato-domingos-a6524437/",
                "romulosorato@hotmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<>());
    }
}