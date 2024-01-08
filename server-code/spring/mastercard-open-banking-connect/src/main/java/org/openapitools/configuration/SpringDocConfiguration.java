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
                                .title("Open Banking - Payments initiation service")
                                .description("Open Banking - Payments initiation service")
                                .contact(
                                        new Contact()
                                                .name("Open Banking Connect Support")
                                                .url("https://developer.mastercard.com/product/open-banking-connect-api-product")
                                                .email("apisupport@mastercard.com")
                                )
                                .version("1.16.0")
                )
        ;
    }
}