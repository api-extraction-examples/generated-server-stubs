package org.openapitools.configuration;

import org.openapitools.model.DagState;
import org.openapitools.model.HealthStatus;
import org.openapitools.model.TaskState;
import org.openapitools.model.TriggerRule;
import org.openapitools.model.WeightRule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.dagStateConverter")
    Converter<String, DagState> dagStateConverter() {
        return new Converter<String, DagState>() {
            @Override
            public DagState convert(String source) {
                return DagState.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.healthStatusConverter")
    Converter<String, HealthStatus> healthStatusConverter() {
        return new Converter<String, HealthStatus>() {
            @Override
            public HealthStatus convert(String source) {
                return HealthStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.taskStateConverter")
    Converter<String, TaskState> taskStateConverter() {
        return new Converter<String, TaskState>() {
            @Override
            public TaskState convert(String source) {
                return TaskState.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.triggerRuleConverter")
    Converter<String, TriggerRule> triggerRuleConverter() {
        return new Converter<String, TriggerRule>() {
            @Override
            public TriggerRule convert(String source) {
                return TriggerRule.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.weightRuleConverter")
    Converter<String, WeightRule> weightRuleConverter() {
        return new Converter<String, WeightRule>() {
            @Override
            public WeightRule convert(String source) {
                return WeightRule.fromValue(source);
            }
        };
    }

}
