package org.openapitools.configuration;

import org.openapitools.model.ApprovalRequestReviewStatus;
import org.openapitools.model.CopyActions;
import org.openapitools.model.Role;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.approvalRequestReviewStatusConverter")
    Converter<String, ApprovalRequestReviewStatus> approvalRequestReviewStatusConverter() {
        return new Converter<String, ApprovalRequestReviewStatus>() {
            @Override
            public ApprovalRequestReviewStatus convert(String source) {
                return ApprovalRequestReviewStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.copyActionsConverter")
    Converter<String, CopyActions> copyActionsConverter() {
        return new Converter<String, CopyActions>() {
            @Override
            public CopyActions convert(String source) {
                return CopyActions.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.roleConverter")
    Converter<String, Role> roleConverter() {
        return new Converter<String, Role>() {
            @Override
            public Role convert(String source) {
                return Role.fromValue(source);
            }
        };
    }

}
