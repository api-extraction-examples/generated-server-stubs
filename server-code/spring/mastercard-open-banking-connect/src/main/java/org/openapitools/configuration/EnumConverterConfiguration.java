package org.openapitools.configuration;

import org.openapitools.model.AdditionalDataField;
import org.openapitools.model.LogoFileType;
import org.openapitools.model.SignatureValidationStatus;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.additionalDataFieldConverter")
    Converter<String, AdditionalDataField> additionalDataFieldConverter() {
        return new Converter<String, AdditionalDataField>() {
            @Override
            public AdditionalDataField convert(String source) {
                return AdditionalDataField.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.logoFileTypeConverter")
    Converter<String, LogoFileType> logoFileTypeConverter() {
        return new Converter<String, LogoFileType>() {
            @Override
            public LogoFileType convert(String source) {
                return LogoFileType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.signatureValidationStatusConverter")
    Converter<String, SignatureValidationStatus> signatureValidationStatusConverter() {
        return new Converter<String, SignatureValidationStatus>() {
            @Override
            public SignatureValidationStatus convert(String source) {
                return SignatureValidationStatus.fromValue(source);
            }
        };
    }

}
