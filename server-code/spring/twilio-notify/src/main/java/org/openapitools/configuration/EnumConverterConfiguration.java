package org.openapitools.configuration;

import org.openapitools.model.BindingEnumBindingType;
import org.openapitools.model.CredentialEnumPushService;
import org.openapitools.model.NotificationEnumPriority;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.bindingEnumBindingTypeConverter")
    Converter<String, BindingEnumBindingType> bindingEnumBindingTypeConverter() {
        return new Converter<String, BindingEnumBindingType>() {
            @Override
            public BindingEnumBindingType convert(String source) {
                return BindingEnumBindingType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.credentialEnumPushServiceConverter")
    Converter<String, CredentialEnumPushService> credentialEnumPushServiceConverter() {
        return new Converter<String, CredentialEnumPushService>() {
            @Override
            public CredentialEnumPushService convert(String source) {
                return CredentialEnumPushService.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.notificationEnumPriorityConverter")
    Converter<String, NotificationEnumPriority> notificationEnumPriorityConverter() {
        return new Converter<String, NotificationEnumPriority>() {
            @Override
            public NotificationEnumPriority convert(String source) {
                return NotificationEnumPriority.fromValue(source);
            }
        };
    }

}
