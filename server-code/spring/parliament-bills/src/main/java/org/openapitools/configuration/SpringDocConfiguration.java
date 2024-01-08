package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Bills API")
                                .description("API to get and search for information regarding Bills, their stages, associated amendments and publications.")
                                .contact(
                                        new Contact()
                                                .name("UK Parliament")
                                                .url("https://www.parliament.uk")
                                                .email("softwareengineering@parliament.uk")
                                )
                                .version("v1")
                )
        ;
    }
}