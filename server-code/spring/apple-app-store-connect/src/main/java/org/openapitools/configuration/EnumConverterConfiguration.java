package org.openapitools.configuration;

import org.openapitools.model.AppEncryptionDeclarationState;
import org.openapitools.model.AppStoreAgeRating;
import org.openapitools.model.AppStoreVersionState;
import org.openapitools.model.BetaInviteType;
import org.openapitools.model.BetaReviewState;
import org.openapitools.model.BrazilAgeRating;
import org.openapitools.model.BundleIdPlatform;
import org.openapitools.model.CapabilityType;
import org.openapitools.model.CertificateType;
import org.openapitools.model.ExternalBetaState;
import org.openapitools.model.IconAssetType;
import org.openapitools.model.InternalBetaState;
import org.openapitools.model.KidsAgeBand;
import org.openapitools.model.PhasedReleaseState;
import org.openapitools.model.Platform;
import org.openapitools.model.PreviewType;
import org.openapitools.model.ScreenshotDisplayType;
import org.openapitools.model.UserRole;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.appEncryptionDeclarationStateConverter")
    Converter<String, AppEncryptionDeclarationState> appEncryptionDeclarationStateConverter() {
        return new Converter<String, AppEncryptionDeclarationState>() {
            @Override
            public AppEncryptionDeclarationState convert(String source) {
                return AppEncryptionDeclarationState.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.appStoreAgeRatingConverter")
    Converter<String, AppStoreAgeRating> appStoreAgeRatingConverter() {
        return new Converter<String, AppStoreAgeRating>() {
            @Override
            public AppStoreAgeRating convert(String source) {
                return AppStoreAgeRating.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.appStoreVersionStateConverter")
    Converter<String, AppStoreVersionState> appStoreVersionStateConverter() {
        return new Converter<String, AppStoreVersionState>() {
            @Override
            public AppStoreVersionState convert(String source) {
                return AppStoreVersionState.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.betaInviteTypeConverter")
    Converter<String, BetaInviteType> betaInviteTypeConverter() {
        return new Converter<String, BetaInviteType>() {
            @Override
            public BetaInviteType convert(String source) {
                return BetaInviteType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.betaReviewStateConverter")
    Converter<String, BetaReviewState> betaReviewStateConverter() {
        return new Converter<String, BetaReviewState>() {
            @Override
            public BetaReviewState convert(String source) {
                return BetaReviewState.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.brazilAgeRatingConverter")
    Converter<String, BrazilAgeRating> brazilAgeRatingConverter() {
        return new Converter<String, BrazilAgeRating>() {
            @Override
            public BrazilAgeRating convert(String source) {
                return BrazilAgeRating.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.bundleIdPlatformConverter")
    Converter<String, BundleIdPlatform> bundleIdPlatformConverter() {
        return new Converter<String, BundleIdPlatform>() {
            @Override
            public BundleIdPlatform convert(String source) {
                return BundleIdPlatform.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.capabilityTypeConverter")
    Converter<String, CapabilityType> capabilityTypeConverter() {
        return new Converter<String, CapabilityType>() {
            @Override
            public CapabilityType convert(String source) {
                return CapabilityType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.certificateTypeConverter")
    Converter<String, CertificateType> certificateTypeConverter() {
        return new Converter<String, CertificateType>() {
            @Override
            public CertificateType convert(String source) {
                return CertificateType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.externalBetaStateConverter")
    Converter<String, ExternalBetaState> externalBetaStateConverter() {
        return new Converter<String, ExternalBetaState>() {
            @Override
            public ExternalBetaState convert(String source) {
                return ExternalBetaState.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.iconAssetTypeConverter")
    Converter<String, IconAssetType> iconAssetTypeConverter() {
        return new Converter<String, IconAssetType>() {
            @Override
            public IconAssetType convert(String source) {
                return IconAssetType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.internalBetaStateConverter")
    Converter<String, InternalBetaState> internalBetaStateConverter() {
        return new Converter<String, InternalBetaState>() {
            @Override
            public InternalBetaState convert(String source) {
                return InternalBetaState.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.kidsAgeBandConverter")
    Converter<String, KidsAgeBand> kidsAgeBandConverter() {
        return new Converter<String, KidsAgeBand>() {
            @Override
            public KidsAgeBand convert(String source) {
                return KidsAgeBand.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.phasedReleaseStateConverter")
    Converter<String, PhasedReleaseState> phasedReleaseStateConverter() {
        return new Converter<String, PhasedReleaseState>() {
            @Override
            public PhasedReleaseState convert(String source) {
                return PhasedReleaseState.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.platformConverter")
    Converter<String, Platform> platformConverter() {
        return new Converter<String, Platform>() {
            @Override
            public Platform convert(String source) {
                return Platform.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.previewTypeConverter")
    Converter<String, PreviewType> previewTypeConverter() {
        return new Converter<String, PreviewType>() {
            @Override
            public PreviewType convert(String source) {
                return PreviewType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.screenshotDisplayTypeConverter")
    Converter<String, ScreenshotDisplayType> screenshotDisplayTypeConverter() {
        return new Converter<String, ScreenshotDisplayType>() {
            @Override
            public ScreenshotDisplayType convert(String source) {
                return ScreenshotDisplayType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.userRoleConverter")
    Converter<String, UserRole> userRoleConverter() {
        return new Converter<String, UserRole>() {
            @Override
            public UserRole convert(String source) {
                return UserRole.fromValue(source);
            }
        };
    }

}
