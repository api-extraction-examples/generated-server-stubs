package org.openapitools.configuration;

import org.openapitools.model.RideProfileEnum;
import org.openapitools.model.RideStatusEnum;
import org.openapitools.model.RideTypeEnum;
import org.openapitools.model.RideTypeEnumWithOther;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.rideProfileEnumConverter")
    Converter<String, RideProfileEnum> rideProfileEnumConverter() {
        return new Converter<String, RideProfileEnum>() {
            @Override
            public RideProfileEnum convert(String source) {
                return RideProfileEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.rideStatusEnumConverter")
    Converter<String, RideStatusEnum> rideStatusEnumConverter() {
        return new Converter<String, RideStatusEnum>() {
            @Override
            public RideStatusEnum convert(String source) {
                return RideStatusEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.rideTypeEnumConverter")
    Converter<String, RideTypeEnum> rideTypeEnumConverter() {
        return new Converter<String, RideTypeEnum>() {
            @Override
            public RideTypeEnum convert(String source) {
                return RideTypeEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.rideTypeEnumWithOtherConverter")
    Converter<String, RideTypeEnumWithOther> rideTypeEnumWithOtherConverter() {
        return new Converter<String, RideTypeEnumWithOther>() {
            @Override
            public RideTypeEnumWithOther convert(String source) {
                return RideTypeEnumWithOther.fromValue(source);
            }
        };
    }

}
