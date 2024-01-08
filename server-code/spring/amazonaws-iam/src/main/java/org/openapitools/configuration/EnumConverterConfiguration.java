package org.openapitools.configuration;

import org.openapitools.model.AccessAdvisorUsageGranularityType;
import org.openapitools.model.AssignmentStatusType;
import org.openapitools.model.ContextKeyTypeEnum;
import org.openapitools.model.DeletionTaskStatusType;
import org.openapitools.model.EncodingType;
import org.openapitools.model.EntityType;
import org.openapitools.model.GlobalEndpointTokenVersion;
import org.openapitools.model.JobStatusType;
import org.openapitools.model.PermissionsBoundaryAttachmentType;
import org.openapitools.model.PolicyEvaluationDecisionType;
import org.openapitools.model.PolicyOwnerEntityType;
import org.openapitools.model.PolicyScopeType;
import org.openapitools.model.PolicySourceType;
import org.openapitools.model.PolicyType;
import org.openapitools.model.PolicyUsageType;
import org.openapitools.model.ReportFormatType;
import org.openapitools.model.ReportStateType;
import org.openapitools.model.SortKeyType;
import org.openapitools.model.StatusType;
import org.openapitools.model.SummaryKeyType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.accessAdvisorUsageGranularityTypeConverter")
    Converter<String, AccessAdvisorUsageGranularityType> accessAdvisorUsageGranularityTypeConverter() {
        return new Converter<String, AccessAdvisorUsageGranularityType>() {
            @Override
            public AccessAdvisorUsageGranularityType convert(String source) {
                return AccessAdvisorUsageGranularityType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.assignmentStatusTypeConverter")
    Converter<String, AssignmentStatusType> assignmentStatusTypeConverter() {
        return new Converter<String, AssignmentStatusType>() {
            @Override
            public AssignmentStatusType convert(String source) {
                return AssignmentStatusType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.contextKeyTypeEnumConverter")
    Converter<String, ContextKeyTypeEnum> contextKeyTypeEnumConverter() {
        return new Converter<String, ContextKeyTypeEnum>() {
            @Override
            public ContextKeyTypeEnum convert(String source) {
                return ContextKeyTypeEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.deletionTaskStatusTypeConverter")
    Converter<String, DeletionTaskStatusType> deletionTaskStatusTypeConverter() {
        return new Converter<String, DeletionTaskStatusType>() {
            @Override
            public DeletionTaskStatusType convert(String source) {
                return DeletionTaskStatusType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.encodingTypeConverter")
    Converter<String, EncodingType> encodingTypeConverter() {
        return new Converter<String, EncodingType>() {
            @Override
            public EncodingType convert(String source) {
                return EncodingType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.entityTypeConverter")
    Converter<String, EntityType> entityTypeConverter() {
        return new Converter<String, EntityType>() {
            @Override
            public EntityType convert(String source) {
                return EntityType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.globalEndpointTokenVersionConverter")
    Converter<String, GlobalEndpointTokenVersion> globalEndpointTokenVersionConverter() {
        return new Converter<String, GlobalEndpointTokenVersion>() {
            @Override
            public GlobalEndpointTokenVersion convert(String source) {
                return GlobalEndpointTokenVersion.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.jobStatusTypeConverter")
    Converter<String, JobStatusType> jobStatusTypeConverter() {
        return new Converter<String, JobStatusType>() {
            @Override
            public JobStatusType convert(String source) {
                return JobStatusType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.permissionsBoundaryAttachmentTypeConverter")
    Converter<String, PermissionsBoundaryAttachmentType> permissionsBoundaryAttachmentTypeConverter() {
        return new Converter<String, PermissionsBoundaryAttachmentType>() {
            @Override
            public PermissionsBoundaryAttachmentType convert(String source) {
                return PermissionsBoundaryAttachmentType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.policyEvaluationDecisionTypeConverter")
    Converter<String, PolicyEvaluationDecisionType> policyEvaluationDecisionTypeConverter() {
        return new Converter<String, PolicyEvaluationDecisionType>() {
            @Override
            public PolicyEvaluationDecisionType convert(String source) {
                return PolicyEvaluationDecisionType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.policyOwnerEntityTypeConverter")
    Converter<String, PolicyOwnerEntityType> policyOwnerEntityTypeConverter() {
        return new Converter<String, PolicyOwnerEntityType>() {
            @Override
            public PolicyOwnerEntityType convert(String source) {
                return PolicyOwnerEntityType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.policyScopeTypeConverter")
    Converter<String, PolicyScopeType> policyScopeTypeConverter() {
        return new Converter<String, PolicyScopeType>() {
            @Override
            public PolicyScopeType convert(String source) {
                return PolicyScopeType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.policySourceTypeConverter")
    Converter<String, PolicySourceType> policySourceTypeConverter() {
        return new Converter<String, PolicySourceType>() {
            @Override
            public PolicySourceType convert(String source) {
                return PolicySourceType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.policyTypeConverter")
    Converter<String, PolicyType> policyTypeConverter() {
        return new Converter<String, PolicyType>() {
            @Override
            public PolicyType convert(String source) {
                return PolicyType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.policyUsageTypeConverter")
    Converter<String, PolicyUsageType> policyUsageTypeConverter() {
        return new Converter<String, PolicyUsageType>() {
            @Override
            public PolicyUsageType convert(String source) {
                return PolicyUsageType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.reportFormatTypeConverter")
    Converter<String, ReportFormatType> reportFormatTypeConverter() {
        return new Converter<String, ReportFormatType>() {
            @Override
            public ReportFormatType convert(String source) {
                return ReportFormatType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.reportStateTypeConverter")
    Converter<String, ReportStateType> reportStateTypeConverter() {
        return new Converter<String, ReportStateType>() {
            @Override
            public ReportStateType convert(String source) {
                return ReportStateType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.sortKeyTypeConverter")
    Converter<String, SortKeyType> sortKeyTypeConverter() {
        return new Converter<String, SortKeyType>() {
            @Override
            public SortKeyType convert(String source) {
                return SortKeyType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.statusTypeConverter")
    Converter<String, StatusType> statusTypeConverter() {
        return new Converter<String, StatusType>() {
            @Override
            public StatusType convert(String source) {
                return StatusType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.summaryKeyTypeConverter")
    Converter<String, SummaryKeyType> summaryKeyTypeConverter() {
        return new Converter<String, SummaryKeyType>() {
            @Override
            public SummaryKeyType convert(String source) {
                return SummaryKeyType.fromValue(source);
            }
        };
    }

}
