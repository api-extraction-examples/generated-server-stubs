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
                                .title("Medium API")
                                .description("Medium API helps you to quickly extract data from Medium's Website (https://medium.com).   You can gather data related to users, publications, articles (including its textual content), latest posts &amp; top writers within a topic/niche, etc… ")
                                .termsOfService("https://github.com/weeping-angel/medium-apis/raw/pages/terms_of_use.pdf")
                                .contact(
                                        new Contact()
                                                .name("Nishu Jain")
                                                .url("https://mediumapi.com")
                                                .email("nishu@mediumapi.com")
                                )
                                .version("1.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("ApiHost", new SecurityScheme()
                                        .type(SecurityScheme.Type.APIKEY)
                                        .in(SecurityScheme.In.HEADER)
                                        .name("x-rapidapi-host")
                                )
                                .addSecuritySchemes("ApiKey", new SecurityScheme()
                                        .type(SecurityScheme.Type.APIKEY)
                                        .in(SecurityScheme.In.HEADER)
                                        .name("x-rapidapi-key")
                                )
                )
        ;
    }
}