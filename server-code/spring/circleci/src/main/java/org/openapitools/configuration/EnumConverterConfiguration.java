package org.openapitools.configuration;

import org.openapitools.model.Lifecycle;
import org.openapitools.model.Outcome;
import org.openapitools.model.Scope;
import org.openapitools.model.Status;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.lifecycleConverter")
    Converter<String, Lifecycle> lifecycleConverter() {
        return new Converter<String, Lifecycle>() {
            @Override
            public Lifecycle convert(String source) {
                return Lifecycle.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.outcomeConverter")
    Converter<String, Outcome> outcomeConverter() {
        return new Converter<String, Outcome>() {
            @Override
            public Outcome convert(String source) {
                return Outcome.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.scopeConverter")
    Converter<String, Scope> scopeConverter() {
        return new Converter<String, Scope>() {
            @Override
            public Scope convert(String source) {
                return Scope.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.statusConverter")
    Converter<String, Status> statusConverter() {
        return new Converter<String, Status>() {
            @Override
            public Status convert(String source) {
                return Status.fromValue(source);
            }
        };
    }

}
