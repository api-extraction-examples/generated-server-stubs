package org.openapitools.configuration;

import org.openapitools.model.AmendmentDecision;
import org.openapitools.model.AmendmentType;
import org.openapitools.model.BillSortOrder;
import org.openapitools.model.BillTypeCategory;
import org.openapitools.model.CommitteeHouse;
import org.openapitools.model.Decision;
import org.openapitools.model.House;
import org.openapitools.model.OriginatingHouse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.amendmentDecisionConverter")
    Converter<String, AmendmentDecision> amendmentDecisionConverter() {
        return new Converter<String, AmendmentDecision>() {
            @Override
            public AmendmentDecision convert(String source) {
                return AmendmentDecision.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.amendmentTypeConverter")
    Converter<String, AmendmentType> amendmentTypeConverter() {
        return new Converter<String, AmendmentType>() {
            @Override
            public AmendmentType convert(String source) {
                return AmendmentType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.billSortOrderConverter")
    Converter<String, BillSortOrder> billSortOrderConverter() {
        return new Converter<String, BillSortOrder>() {
            @Override
            public BillSortOrder convert(String source) {
                return BillSortOrder.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.billTypeCategoryConverter")
    Converter<String, BillTypeCategory> billTypeCategoryConverter() {
        return new Converter<String, BillTypeCategory>() {
            @Override
            public BillTypeCategory convert(String source) {
                return BillTypeCategory.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.committeeHouseConverter")
    Converter<String, CommitteeHouse> committeeHouseConverter() {
        return new Converter<String, CommitteeHouse>() {
            @Override
            public CommitteeHouse convert(String source) {
                return CommitteeHouse.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.decisionConverter")
    Converter<String, Decision> decisionConverter() {
        return new Converter<String, Decision>() {
            @Override
            public Decision convert(String source) {
                return Decision.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.houseConverter")
    Converter<String, House> houseConverter() {
        return new Converter<String, House>() {
            @Override
            public House convert(String source) {
                return House.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.originatingHouseConverter")
    Converter<String, OriginatingHouse> originatingHouseConverter() {
        return new Converter<String, OriginatingHouse>() {
            @Override
            public OriginatingHouse convert(String source) {
                return OriginatingHouse.fromValue(source);
            }
        };
    }

}
