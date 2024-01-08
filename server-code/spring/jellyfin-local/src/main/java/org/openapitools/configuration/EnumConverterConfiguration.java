package org.openapitools.configuration;

import org.openapitools.model.Architecture;
import org.openapitools.model.ChannelItemSortField;
import org.openapitools.model.ChannelMediaContentType;
import org.openapitools.model.ChannelMediaType;
import org.openapitools.model.ChannelType;
import org.openapitools.model.CodecType;
import org.openapitools.model.ConfigurationPageType;
import org.openapitools.model.DayOfWeek;
import org.openapitools.model.DayPattern;
import org.openapitools.model.DeviceProfileType;
import org.openapitools.model.DlnaProfileType;
import org.openapitools.model.DynamicDayOfWeek;
import org.openapitools.model.EncodingContext;
import org.openapitools.model.ExternalIdMediaType;
import org.openapitools.model.FFmpegLocation;
import org.openapitools.model.FileSystemEntryType;
import org.openapitools.model.ForgotPasswordAction;
import org.openapitools.model.GeneralCommandType;
import org.openapitools.model.GroupQueueMode;
import org.openapitools.model.GroupRepeatMode;
import org.openapitools.model.GroupShuffleMode;
import org.openapitools.model.GroupStateType;
import org.openapitools.model.GroupUpdateType;
import org.openapitools.model.HeaderMatchType;
import org.openapitools.model.ImageFormat;
import org.openapitools.model.ImageOrientation;
import org.openapitools.model.ImageSavingConvention;
import org.openapitools.model.ImageType;
import org.openapitools.model.IsoType;
import org.openapitools.model.ItemFields;
import org.openapitools.model.ItemFilter;
import org.openapitools.model.KeepUntil;
import org.openapitools.model.LiveTvServiceStatus;
import org.openapitools.model.LocationType;
import org.openapitools.model.LogLevel;
import org.openapitools.model.MediaProtocol;
import org.openapitools.model.MediaSourceType;
import org.openapitools.model.MediaStreamType;
import org.openapitools.model.MetadataField;
import org.openapitools.model.MetadataRefreshMode;
import org.openapitools.model.NotificationLevel;
import org.openapitools.model.PlayAccess;
import org.openapitools.model.PlayCommand;
import org.openapitools.model.PlayMethod;
import org.openapitools.model.PlaybackErrorCode;
import org.openapitools.model.PlaystateCommand;
import org.openapitools.model.PluginStatus;
import org.openapitools.model.ProfileConditionType;
import org.openapitools.model.ProfileConditionValue;
import org.openapitools.model.ProgramAudio;
import org.openapitools.model.QuickConnectState;
import org.openapitools.model.RatingType;
import org.openapitools.model.RecommendationType;
import org.openapitools.model.RecordingStatus;
import org.openapitools.model.RepeatMode;
import org.openapitools.model.ScrollDirection;
import org.openapitools.model.SendCommandType;
import org.openapitools.model.SeriesStatus;
import org.openapitools.model.SortOrder;
import org.openapitools.model.SubtitleDeliveryMethod;
import org.openapitools.model.SubtitlePlaybackMode;
import org.openapitools.model.SyncPlayUserAccessType;
import org.openapitools.model.TaskCompletionStatus;
import org.openapitools.model.TaskState;
import org.openapitools.model.TranscodeReason;
import org.openapitools.model.TranscodeSeekInfo;
import org.openapitools.model.TransportStreamTimestamp;
import org.openapitools.model.UnratedItem;
import org.openapitools.model.Video3DFormat;
import org.openapitools.model.VideoType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.architectureConverter")
    Converter<String, Architecture> architectureConverter() {
        return new Converter<String, Architecture>() {
            @Override
            public Architecture convert(String source) {
                return Architecture.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.channelItemSortFieldConverter")
    Converter<String, ChannelItemSortField> channelItemSortFieldConverter() {
        return new Converter<String, ChannelItemSortField>() {
            @Override
            public ChannelItemSortField convert(String source) {
                return ChannelItemSortField.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.channelMediaContentTypeConverter")
    Converter<String, ChannelMediaContentType> channelMediaContentTypeConverter() {
        return new Converter<String, ChannelMediaContentType>() {
            @Override
            public ChannelMediaContentType convert(String source) {
                return ChannelMediaContentType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.channelMediaTypeConverter")
    Converter<String, ChannelMediaType> channelMediaTypeConverter() {
        return new Converter<String, ChannelMediaType>() {
            @Override
            public ChannelMediaType convert(String source) {
                return ChannelMediaType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.channelTypeConverter")
    Converter<String, ChannelType> channelTypeConverter() {
        return new Converter<String, ChannelType>() {
            @Override
            public ChannelType convert(String source) {
                return ChannelType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.codecTypeConverter")
    Converter<String, CodecType> codecTypeConverter() {
        return new Converter<String, CodecType>() {
            @Override
            public CodecType convert(String source) {
                return CodecType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.configurationPageTypeConverter")
    Converter<String, ConfigurationPageType> configurationPageTypeConverter() {
        return new Converter<String, ConfigurationPageType>() {
            @Override
            public ConfigurationPageType convert(String source) {
                return ConfigurationPageType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.dayOfWeekConverter")
    Converter<String, DayOfWeek> dayOfWeekConverter() {
        return new Converter<String, DayOfWeek>() {
            @Override
            public DayOfWeek convert(String source) {
                return DayOfWeek.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.dayPatternConverter")
    Converter<String, DayPattern> dayPatternConverter() {
        return new Converter<String, DayPattern>() {
            @Override
            public DayPattern convert(String source) {
                return DayPattern.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.deviceProfileTypeConverter")
    Converter<String, DeviceProfileType> deviceProfileTypeConverter() {
        return new Converter<String, DeviceProfileType>() {
            @Override
            public DeviceProfileType convert(String source) {
                return DeviceProfileType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.dlnaProfileTypeConverter")
    Converter<String, DlnaProfileType> dlnaProfileTypeConverter() {
        return new Converter<String, DlnaProfileType>() {
            @Override
            public DlnaProfileType convert(String source) {
                return DlnaProfileType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.dynamicDayOfWeekConverter")
    Converter<String, DynamicDayOfWeek> dynamicDayOfWeekConverter() {
        return new Converter<String, DynamicDayOfWeek>() {
            @Override
            public DynamicDayOfWeek convert(String source) {
                return DynamicDayOfWeek.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.encodingContextConverter")
    Converter<String, EncodingContext> encodingContextConverter() {
        return new Converter<String, EncodingContext>() {
            @Override
            public EncodingContext convert(String source) {
                return EncodingContext.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.externalIdMediaTypeConverter")
    Converter<String, ExternalIdMediaType> externalIdMediaTypeConverter() {
        return new Converter<String, ExternalIdMediaType>() {
            @Override
            public ExternalIdMediaType convert(String source) {
                return ExternalIdMediaType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.ffmpegLocationConverter")
    Converter<String, FFmpegLocation> ffmpegLocationConverter() {
        return new Converter<String, FFmpegLocation>() {
            @Override
            public FFmpegLocation convert(String source) {
                return FFmpegLocation.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.fileSystemEntryTypeConverter")
    Converter<String, FileSystemEntryType> fileSystemEntryTypeConverter() {
        return new Converter<String, FileSystemEntryType>() {
            @Override
            public FileSystemEntryType convert(String source) {
                return FileSystemEntryType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.forgotPasswordActionConverter")
    Converter<String, ForgotPasswordAction> forgotPasswordActionConverter() {
        return new Converter<String, ForgotPasswordAction>() {
            @Override
            public ForgotPasswordAction convert(String source) {
                return ForgotPasswordAction.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.generalCommandTypeConverter")
    Converter<String, GeneralCommandType> generalCommandTypeConverter() {
        return new Converter<String, GeneralCommandType>() {
            @Override
            public GeneralCommandType convert(String source) {
                return GeneralCommandType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.groupQueueModeConverter")
    Converter<String, GroupQueueMode> groupQueueModeConverter() {
        return new Converter<String, GroupQueueMode>() {
            @Override
            public GroupQueueMode convert(String source) {
                return GroupQueueMode.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.groupRepeatModeConverter")
    Converter<String, GroupRepeatMode> groupRepeatModeConverter() {
        return new Converter<String, GroupRepeatMode>() {
            @Override
            public GroupRepeatMode convert(String source) {
                return GroupRepeatMode.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.groupShuffleModeConverter")
    Converter<String, GroupShuffleMode> groupShuffleModeConverter() {
        return new Converter<String, GroupShuffleMode>() {
            @Override
            public GroupShuffleMode convert(String source) {
                return GroupShuffleMode.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.groupStateTypeConverter")
    Converter<String, GroupStateType> groupStateTypeConverter() {
        return new Converter<String, GroupStateType>() {
            @Override
            public GroupStateType convert(String source) {
                return GroupStateType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.groupUpdateTypeConverter")
    Converter<String, GroupUpdateType> groupUpdateTypeConverter() {
        return new Converter<String, GroupUpdateType>() {
            @Override
            public GroupUpdateType convert(String source) {
                return GroupUpdateType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.headerMatchTypeConverter")
    Converter<String, HeaderMatchType> headerMatchTypeConverter() {
        return new Converter<String, HeaderMatchType>() {
            @Override
            public HeaderMatchType convert(String source) {
                return HeaderMatchType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.imageFormatConverter")
    Converter<String, ImageFormat> imageFormatConverter() {
        return new Converter<String, ImageFormat>() {
            @Override
            public ImageFormat convert(String source) {
                return ImageFormat.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.imageOrientationConverter")
    Converter<String, ImageOrientation> imageOrientationConverter() {
        return new Converter<String, ImageOrientation>() {
            @Override
            public ImageOrientation convert(String source) {
                return ImageOrientation.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.imageSavingConventionConverter")
    Converter<String, ImageSavingConvention> imageSavingConventionConverter() {
        return new Converter<String, ImageSavingConvention>() {
            @Override
            public ImageSavingConvention convert(String source) {
                return ImageSavingConvention.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.imageTypeConverter")
    Converter<String, ImageType> imageTypeConverter() {
        return new Converter<String, ImageType>() {
            @Override
            public ImageType convert(String source) {
                return ImageType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.isoTypeConverter")
    Converter<String, IsoType> isoTypeConverter() {
        return new Converter<String, IsoType>() {
            @Override
            public IsoType convert(String source) {
                return IsoType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.itemFieldsConverter")
    Converter<String, ItemFields> itemFieldsConverter() {
        return new Converter<String, ItemFields>() {
            @Override
            public ItemFields convert(String source) {
                return ItemFields.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.itemFilterConverter")
    Converter<String, ItemFilter> itemFilterConverter() {
        return new Converter<String, ItemFilter>() {
            @Override
            public ItemFilter convert(String source) {
                return ItemFilter.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.keepUntilConverter")
    Converter<String, KeepUntil> keepUntilConverter() {
        return new Converter<String, KeepUntil>() {
            @Override
            public KeepUntil convert(String source) {
                return KeepUntil.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.liveTvServiceStatusConverter")
    Converter<String, LiveTvServiceStatus> liveTvServiceStatusConverter() {
        return new Converter<String, LiveTvServiceStatus>() {
            @Override
            public LiveTvServiceStatus convert(String source) {
                return LiveTvServiceStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.locationTypeConverter")
    Converter<String, LocationType> locationTypeConverter() {
        return new Converter<String, LocationType>() {
            @Override
            public LocationType convert(String source) {
                return LocationType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.logLevelConverter")
    Converter<String, LogLevel> logLevelConverter() {
        return new Converter<String, LogLevel>() {
            @Override
            public LogLevel convert(String source) {
                return LogLevel.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.mediaProtocolConverter")
    Converter<String, MediaProtocol> mediaProtocolConverter() {
        return new Converter<String, MediaProtocol>() {
            @Override
            public MediaProtocol convert(String source) {
                return MediaProtocol.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.mediaSourceTypeConverter")
    Converter<String, MediaSourceType> mediaSourceTypeConverter() {
        return new Converter<String, MediaSourceType>() {
            @Override
            public MediaSourceType convert(String source) {
                return MediaSourceType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.mediaStreamTypeConverter")
    Converter<String, MediaStreamType> mediaStreamTypeConverter() {
        return new Converter<String, MediaStreamType>() {
            @Override
            public MediaStreamType convert(String source) {
                return MediaStreamType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.metadataFieldConverter")
    Converter<String, MetadataField> metadataFieldConverter() {
        return new Converter<String, MetadataField>() {
            @Override
            public MetadataField convert(String source) {
                return MetadataField.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.metadataRefreshModeConverter")
    Converter<String, MetadataRefreshMode> metadataRefreshModeConverter() {
        return new Converter<String, MetadataRefreshMode>() {
            @Override
            public MetadataRefreshMode convert(String source) {
                return MetadataRefreshMode.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.notificationLevelConverter")
    Converter<String, NotificationLevel> notificationLevelConverter() {
        return new Converter<String, NotificationLevel>() {
            @Override
            public NotificationLevel convert(String source) {
                return NotificationLevel.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.playAccessConverter")
    Converter<String, PlayAccess> playAccessConverter() {
        return new Converter<String, PlayAccess>() {
            @Override
            public PlayAccess convert(String source) {
                return PlayAccess.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.playCommandConverter")
    Converter<String, PlayCommand> playCommandConverter() {
        return new Converter<String, PlayCommand>() {
            @Override
            public PlayCommand convert(String source) {
                return PlayCommand.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.playMethodConverter")
    Converter<String, PlayMethod> playMethodConverter() {
        return new Converter<String, PlayMethod>() {
            @Override
            public PlayMethod convert(String source) {
                return PlayMethod.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.playbackErrorCodeConverter")
    Converter<String, PlaybackErrorCode> playbackErrorCodeConverter() {
        return new Converter<String, PlaybackErrorCode>() {
            @Override
            public PlaybackErrorCode convert(String source) {
                return PlaybackErrorCode.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.playstateCommandConverter")
    Converter<String, PlaystateCommand> playstateCommandConverter() {
        return new Converter<String, PlaystateCommand>() {
            @Override
            public PlaystateCommand convert(String source) {
                return PlaystateCommand.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.pluginStatusConverter")
    Converter<String, PluginStatus> pluginStatusConverter() {
        return new Converter<String, PluginStatus>() {
            @Override
            public PluginStatus convert(String source) {
                return PluginStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.profileConditionTypeConverter")
    Converter<String, ProfileConditionType> profileConditionTypeConverter() {
        return new Converter<String, ProfileConditionType>() {
            @Override
            public ProfileConditionType convert(String source) {
                return ProfileConditionType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.profileConditionValueConverter")
    Converter<String, ProfileConditionValue> profileConditionValueConverter() {
        return new Converter<String, ProfileConditionValue>() {
            @Override
            public ProfileConditionValue convert(String source) {
                return ProfileConditionValue.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.programAudioConverter")
    Converter<String, ProgramAudio> programAudioConverter() {
        return new Converter<String, ProgramAudio>() {
            @Override
            public ProgramAudio convert(String source) {
                return ProgramAudio.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.quickConnectStateConverter")
    Converter<String, QuickConnectState> quickConnectStateConverter() {
        return new Converter<String, QuickConnectState>() {
            @Override
            public QuickConnectState convert(String source) {
                return QuickConnectState.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.ratingTypeConverter")
    Converter<String, RatingType> ratingTypeConverter() {
        return new Converter<String, RatingType>() {
            @Override
            public RatingType convert(String source) {
                return RatingType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.recommendationTypeConverter")
    Converter<String, RecommendationType> recommendationTypeConverter() {
        return new Converter<String, RecommendationType>() {
            @Override
            public RecommendationType convert(String source) {
                return RecommendationType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.recordingStatusConverter")
    Converter<String, RecordingStatus> recordingStatusConverter() {
        return new Converter<String, RecordingStatus>() {
            @Override
            public RecordingStatus convert(String source) {
                return RecordingStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.repeatModeConverter")
    Converter<String, RepeatMode> repeatModeConverter() {
        return new Converter<String, RepeatMode>() {
            @Override
            public RepeatMode convert(String source) {
                return RepeatMode.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.scrollDirectionConverter")
    Converter<String, ScrollDirection> scrollDirectionConverter() {
        return new Converter<String, ScrollDirection>() {
            @Override
            public ScrollDirection convert(String source) {
                return ScrollDirection.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.sendCommandTypeConverter")
    Converter<String, SendCommandType> sendCommandTypeConverter() {
        return new Converter<String, SendCommandType>() {
            @Override
            public SendCommandType convert(String source) {
                return SendCommandType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.seriesStatusConverter")
    Converter<String, SeriesStatus> seriesStatusConverter() {
        return new Converter<String, SeriesStatus>() {
            @Override
            public SeriesStatus convert(String source) {
                return SeriesStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.sortOrderConverter")
    Converter<String, SortOrder> sortOrderConverter() {
        return new Converter<String, SortOrder>() {
            @Override
            public SortOrder convert(String source) {
                return SortOrder.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.subtitleDeliveryMethodConverter")
    Converter<String, SubtitleDeliveryMethod> subtitleDeliveryMethodConverter() {
        return new Converter<String, SubtitleDeliveryMethod>() {
            @Override
            public SubtitleDeliveryMethod convert(String source) {
                return SubtitleDeliveryMethod.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.subtitlePlaybackModeConverter")
    Converter<String, SubtitlePlaybackMode> subtitlePlaybackModeConverter() {
        return new Converter<String, SubtitlePlaybackMode>() {
            @Override
            public SubtitlePlaybackMode convert(String source) {
                return SubtitlePlaybackMode.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.syncPlayUserAccessTypeConverter")
    Converter<String, SyncPlayUserAccessType> syncPlayUserAccessTypeConverter() {
        return new Converter<String, SyncPlayUserAccessType>() {
            @Override
            public SyncPlayUserAccessType convert(String source) {
                return SyncPlayUserAccessType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.taskCompletionStatusConverter")
    Converter<String, TaskCompletionStatus> taskCompletionStatusConverter() {
        return new Converter<String, TaskCompletionStatus>() {
            @Override
            public TaskCompletionStatus convert(String source) {
                return TaskCompletionStatus.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.transcodeReasonConverter")
    Converter<String, TranscodeReason> transcodeReasonConverter() {
        return new Converter<String, TranscodeReason>() {
            @Override
            public TranscodeReason convert(String source) {
                return TranscodeReason.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.transcodeSeekInfoConverter")
    Converter<String, TranscodeSeekInfo> transcodeSeekInfoConverter() {
        return new Converter<String, TranscodeSeekInfo>() {
            @Override
            public TranscodeSeekInfo convert(String source) {
                return TranscodeSeekInfo.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.transportStreamTimestampConverter")
    Converter<String, TransportStreamTimestamp> transportStreamTimestampConverter() {
        return new Converter<String, TransportStreamTimestamp>() {
            @Override
            public TransportStreamTimestamp convert(String source) {
                return TransportStreamTimestamp.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.unratedItemConverter")
    Converter<String, UnratedItem> unratedItemConverter() {
        return new Converter<String, UnratedItem>() {
            @Override
            public UnratedItem convert(String source) {
                return UnratedItem.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.video3DFormatConverter")
    Converter<String, Video3DFormat> video3DFormatConverter() {
        return new Converter<String, Video3DFormat>() {
            @Override
            public Video3DFormat convert(String source) {
                return Video3DFormat.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.videoTypeConverter")
    Converter<String, VideoType> videoTypeConverter() {
        return new Converter<String, VideoType>() {
            @Override
            public VideoType convert(String source) {
                return VideoType.fromValue(source);
            }
        };
    }

}
