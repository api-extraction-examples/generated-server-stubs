/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.LiveStreamResponse;
import org.openapitools.model.OpenLiveStreamDto;
import java.util.UUID;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "MediaInfo", description = "the MediaInfo API")
public interface LiveStreamsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /LiveStreams/Close : Closes a media source.
     *
     * @param liveStreamId The livestream id. (required)
     * @return Livestream closed. (status code 204)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     */
    @Operation(
        operationId = "closeLiveStream",
        summary = "Closes a media source.",
        tags = { "MediaInfo" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Livestream closed."),
            @ApiResponse(responseCode = "401", description = "Unauthorized"),
            @ApiResponse(responseCode = "403", description = "Forbidden")
        },
        security = {
            @SecurityRequirement(name = "CustomAuthentication")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/LiveStreams/Close"
    )
    
    default ResponseEntity<Void> closeLiveStream(
        @NotNull @Parameter(name = "liveStreamId", description = "The livestream id.", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "liveStreamId", required = true) String liveStreamId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /LiveStreams/Open : Opens a media source.
     *
     * @param openToken The open token. (optional)
     * @param userId The user id. (optional)
     * @param playSessionId The play session id. (optional)
     * @param maxStreamingBitrate The maximum streaming bitrate. (optional)
     * @param startTimeTicks The start time in ticks. (optional)
     * @param audioStreamIndex The audio stream index. (optional)
     * @param subtitleStreamIndex The subtitle stream index. (optional)
     * @param maxAudioChannels The maximum number of audio channels. (optional)
     * @param itemId The item id. (optional)
     * @param enableDirectPlay Whether to enable direct play. Default: true. (optional)
     * @param enableDirectStream Whether to enable direct stream. Default: true. (optional)
     * @param openLiveStreamDto The open live stream dto. (optional)
     * @return Media source opened. (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     */
    @Operation(
        operationId = "openLiveStream",
        summary = "Opens a media source.",
        tags = { "MediaInfo" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Media source opened.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LiveStreamResponse.class)),
                @Content(mediaType = "application/json; profile=CamelCase", schema = @Schema(implementation = LiveStreamResponse.class)),
                @Content(mediaType = "application/json; profile=PascalCase", schema = @Schema(implementation = LiveStreamResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "Unauthorized"),
            @ApiResponse(responseCode = "403", description = "Forbidden")
        },
        security = {
            @SecurityRequirement(name = "CustomAuthentication")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/LiveStreams/Open",
        produces = { "application/json", "application/json; profile=CamelCase", "application/json; profile=PascalCase" },
        consumes = { "application/*+json", "application/json", "text/json" }
    )
    
    default ResponseEntity<LiveStreamResponse> openLiveStream(
        @Parameter(name = "openToken", description = "The open token.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "openToken", required = false) String openToken,
        @Parameter(name = "userId", description = "The user id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "userId", required = false) UUID userId,
        @Parameter(name = "playSessionId", description = "The play session id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "playSessionId", required = false) String playSessionId,
        @Parameter(name = "maxStreamingBitrate", description = "The maximum streaming bitrate.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "maxStreamingBitrate", required = false) Integer maxStreamingBitrate,
        @Parameter(name = "startTimeTicks", description = "The start time in ticks.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "startTimeTicks", required = false) Long startTimeTicks,
        @Parameter(name = "audioStreamIndex", description = "The audio stream index.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "audioStreamIndex", required = false) Integer audioStreamIndex,
        @Parameter(name = "subtitleStreamIndex", description = "The subtitle stream index.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "subtitleStreamIndex", required = false) Integer subtitleStreamIndex,
        @Parameter(name = "maxAudioChannels", description = "The maximum number of audio channels.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "maxAudioChannels", required = false) Integer maxAudioChannels,
        @Parameter(name = "itemId", description = "The item id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "itemId", required = false) UUID itemId,
        @Parameter(name = "enableDirectPlay", description = "Whether to enable direct play. Default: true.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "enableDirectPlay", required = false) Boolean enableDirectPlay,
        @Parameter(name = "enableDirectStream", description = "Whether to enable direct stream. Default: true.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "enableDirectStream", required = false) Boolean enableDirectStream,
        @Parameter(name = "OpenLiveStreamDto", description = "The open live stream dto.") @Valid @RequestBody(required = false) OpenLiveStreamDto openLiveStreamDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"MediaSource\" : { \"EncoderPath\" : \"EncoderPath\", \"RequiredHttpHeaders\" : { \"key\" : \"RequiredHttpHeaders\" }, \"RunTimeTicks\" : 7, \"MediaStreams\" : [ { \"VideoRange\" : \"VideoRange\", \"CodecTimeBase\" : \"CodecTimeBase\", \"ColorSpace\" : \"ColorSpace\", \"Index\" : 3, \"ColorRange\" : \"ColorRange\", \"localizedForced\" : \"localizedForced\", \"BitDepth\" : 6, \"Channels\" : 6, \"Profile\" : \"Profile\", \"SupportsExternalStream\" : true, \"DeliveryUrl\" : \"DeliveryUrl\", \"localizedDefault\" : \"localizedDefault\", \"Codec\" : \"Codec\", \"ColorPrimaries\" : \"ColorPrimaries\", \"SampleRate\" : 0, \"IsTextSubtitleStream\" : true, \"Language\" : \"Language\", \"IsAnamorphic\" : true, \"Height\" : 3, \"NalLengthSize\" : \"NalLengthSize\", \"PixelFormat\" : \"PixelFormat\", \"RefFrames\" : 6, \"IsAVC\" : true, \"Width\" : 8, \"TimeBase\" : \"TimeBase\", \"ColorTransfer\" : \"ColorTransfer\", \"CodecTag\" : \"CodecTag\", \"IsDefault\" : true, \"Path\" : \"Path\", \"Comment\" : \"Comment\", \"IsExternalUrl\" : true, \"DisplayTitle\" : \"DisplayTitle\", \"IsForced\" : true, \"ChannelLayout\" : \"ChannelLayout\", \"PacketLength\" : 0, \"localizedUndefined\" : \"localizedUndefined\", \"Title\" : \"Title\", \"RealFrameRate\" : 7.05877, \"AspectRatio\" : \"AspectRatio\", \"AverageFrameRate\" : 6.778325, \"Score\" : 4, \"IsExternal\" : true, \"IsInterlaced\" : true, \"Level\" : 7.143538047012306, \"BitRate\" : 5 }, { \"VideoRange\" : \"VideoRange\", \"CodecTimeBase\" : \"CodecTimeBase\", \"ColorSpace\" : \"ColorSpace\", \"Index\" : 3, \"ColorRange\" : \"ColorRange\", \"localizedForced\" : \"localizedForced\", \"BitDepth\" : 6, \"Channels\" : 6, \"Profile\" : \"Profile\", \"SupportsExternalStream\" : true, \"DeliveryUrl\" : \"DeliveryUrl\", \"localizedDefault\" : \"localizedDefault\", \"Codec\" : \"Codec\", \"ColorPrimaries\" : \"ColorPrimaries\", \"SampleRate\" : 0, \"IsTextSubtitleStream\" : true, \"Language\" : \"Language\", \"IsAnamorphic\" : true, \"Height\" : 3, \"NalLengthSize\" : \"NalLengthSize\", \"PixelFormat\" : \"PixelFormat\", \"RefFrames\" : 6, \"IsAVC\" : true, \"Width\" : 8, \"TimeBase\" : \"TimeBase\", \"ColorTransfer\" : \"ColorTransfer\", \"CodecTag\" : \"CodecTag\", \"IsDefault\" : true, \"Path\" : \"Path\", \"Comment\" : \"Comment\", \"IsExternalUrl\" : true, \"DisplayTitle\" : \"DisplayTitle\", \"IsForced\" : true, \"ChannelLayout\" : \"ChannelLayout\", \"PacketLength\" : 0, \"localizedUndefined\" : \"localizedUndefined\", \"Title\" : \"Title\", \"RealFrameRate\" : 7.05877, \"AspectRatio\" : \"AspectRatio\", \"AverageFrameRate\" : 6.778325, \"Score\" : 4, \"IsExternal\" : true, \"IsInterlaced\" : true, \"Level\" : 7.143538047012306, \"BitRate\" : 5 } ], \"Size\" : 3, \"BufferMs\" : 3, \"Name\" : \"Name\", \"RequiresOpening\" : true, \"SupportsDirectStream\" : true, \"RequiresClosing\" : true, \"Container\" : \"Container\", \"LiveStreamId\" : \"LiveStreamId\", \"RequiresLooping\" : true, \"DefaultSubtitleStreamIndex\" : 1, \"GenPtsInput\" : true, \"IsInfiniteStream\" : true, \"Path\" : \"Path\", \"IsRemote\" : true, \"IgnoreIndex\" : true, \"SupportsDirectPlay\" : true, \"TranscodingSubProtocol\" : \"TranscodingSubProtocol\", \"AnalyzeDurationMs\" : 9, \"Formats\" : [ \"Formats\", \"Formats\" ], \"Bitrate\" : 6, \"OpenToken\" : \"OpenToken\", \"SupportsProbing\" : true, \"MediaAttachments\" : [ { \"CodecTag\" : \"CodecTag\", \"Comment\" : \"Comment\", \"DeliveryUrl\" : \"DeliveryUrl\", \"Codec\" : \"Codec\", \"FileName\" : \"FileName\", \"Index\" : 2, \"MimeType\" : \"MimeType\" }, { \"CodecTag\" : \"CodecTag\", \"Comment\" : \"Comment\", \"DeliveryUrl\" : \"DeliveryUrl\", \"Codec\" : \"Codec\", \"FileName\" : \"FileName\", \"Index\" : 2, \"MimeType\" : \"MimeType\" } ], \"ReadAtNativeFramerate\" : true, \"ETag\" : \"ETag\", \"TranscodingContainer\" : \"TranscodingContainer\", \"IgnoreDts\" : true, \"TranscodingUrl\" : \"TranscodingUrl\", \"Id\" : \"Id\", \"SupportsTranscoding\" : true, \"DefaultAudioStreamIndex\" : 6 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json; profile="CamelCase""))) {
                    String exampleString = "{ \"MediaSource\" : { \"EncoderPath\" : \"EncoderPath\", \"RequiredHttpHeaders\" : { \"key\" : \"RequiredHttpHeaders\" }, \"RunTimeTicks\" : 7, \"MediaStreams\" : [ { \"VideoRange\" : \"VideoRange\", \"CodecTimeBase\" : \"CodecTimeBase\", \"ColorSpace\" : \"ColorSpace\", \"Index\" : 3, \"ColorRange\" : \"ColorRange\", \"localizedForced\" : \"localizedForced\", \"BitDepth\" : 6, \"Channels\" : 6, \"Profile\" : \"Profile\", \"SupportsExternalStream\" : true, \"DeliveryUrl\" : \"DeliveryUrl\", \"localizedDefault\" : \"localizedDefault\", \"Codec\" : \"Codec\", \"ColorPrimaries\" : \"ColorPrimaries\", \"SampleRate\" : 0, \"IsTextSubtitleStream\" : true, \"Language\" : \"Language\", \"IsAnamorphic\" : true, \"Height\" : 3, \"NalLengthSize\" : \"NalLengthSize\", \"PixelFormat\" : \"PixelFormat\", \"RefFrames\" : 6, \"IsAVC\" : true, \"Width\" : 8, \"TimeBase\" : \"TimeBase\", \"ColorTransfer\" : \"ColorTransfer\", \"CodecTag\" : \"CodecTag\", \"IsDefault\" : true, \"Path\" : \"Path\", \"Comment\" : \"Comment\", \"IsExternalUrl\" : true, \"DisplayTitle\" : \"DisplayTitle\", \"IsForced\" : true, \"ChannelLayout\" : \"ChannelLayout\", \"PacketLength\" : 0, \"localizedUndefined\" : \"localizedUndefined\", \"Title\" : \"Title\", \"RealFrameRate\" : 7.05877, \"AspectRatio\" : \"AspectRatio\", \"AverageFrameRate\" : 6.778325, \"Score\" : 4, \"IsExternal\" : true, \"IsInterlaced\" : true, \"Level\" : 7.143538047012306, \"BitRate\" : 5 }, { \"VideoRange\" : \"VideoRange\", \"CodecTimeBase\" : \"CodecTimeBase\", \"ColorSpace\" : \"ColorSpace\", \"Index\" : 3, \"ColorRange\" : \"ColorRange\", \"localizedForced\" : \"localizedForced\", \"BitDepth\" : 6, \"Channels\" : 6, \"Profile\" : \"Profile\", \"SupportsExternalStream\" : true, \"DeliveryUrl\" : \"DeliveryUrl\", \"localizedDefault\" : \"localizedDefault\", \"Codec\" : \"Codec\", \"ColorPrimaries\" : \"ColorPrimaries\", \"SampleRate\" : 0, \"IsTextSubtitleStream\" : true, \"Language\" : \"Language\", \"IsAnamorphic\" : true, \"Height\" : 3, \"NalLengthSize\" : \"NalLengthSize\", \"PixelFormat\" : \"PixelFormat\", \"RefFrames\" : 6, \"IsAVC\" : true, \"Width\" : 8, \"TimeBase\" : \"TimeBase\", \"ColorTransfer\" : \"ColorTransfer\", \"CodecTag\" : \"CodecTag\", \"IsDefault\" : true, \"Path\" : \"Path\", \"Comment\" : \"Comment\", \"IsExternalUrl\" : true, \"DisplayTitle\" : \"DisplayTitle\", \"IsForced\" : true, \"ChannelLayout\" : \"ChannelLayout\", \"PacketLength\" : 0, \"localizedUndefined\" : \"localizedUndefined\", \"Title\" : \"Title\", \"RealFrameRate\" : 7.05877, \"AspectRatio\" : \"AspectRatio\", \"AverageFrameRate\" : 6.778325, \"Score\" : 4, \"IsExternal\" : true, \"IsInterlaced\" : true, \"Level\" : 7.143538047012306, \"BitRate\" : 5 } ], \"Size\" : 3, \"BufferMs\" : 3, \"Name\" : \"Name\", \"RequiresOpening\" : true, \"SupportsDirectStream\" : true, \"RequiresClosing\" : true, \"Container\" : \"Container\", \"LiveStreamId\" : \"LiveStreamId\", \"RequiresLooping\" : true, \"DefaultSubtitleStreamIndex\" : 1, \"GenPtsInput\" : true, \"IsInfiniteStream\" : true, \"Path\" : \"Path\", \"IsRemote\" : true, \"IgnoreIndex\" : true, \"SupportsDirectPlay\" : true, \"TranscodingSubProtocol\" : \"TranscodingSubProtocol\", \"AnalyzeDurationMs\" : 9, \"Formats\" : [ \"Formats\", \"Formats\" ], \"Bitrate\" : 6, \"OpenToken\" : \"OpenToken\", \"SupportsProbing\" : true, \"MediaAttachments\" : [ { \"CodecTag\" : \"CodecTag\", \"Comment\" : \"Comment\", \"DeliveryUrl\" : \"DeliveryUrl\", \"Codec\" : \"Codec\", \"FileName\" : \"FileName\", \"Index\" : 2, \"MimeType\" : \"MimeType\" }, { \"CodecTag\" : \"CodecTag\", \"Comment\" : \"Comment\", \"DeliveryUrl\" : \"DeliveryUrl\", \"Codec\" : \"Codec\", \"FileName\" : \"FileName\", \"Index\" : 2, \"MimeType\" : \"MimeType\" } ], \"ReadAtNativeFramerate\" : true, \"ETag\" : \"ETag\", \"TranscodingContainer\" : \"TranscodingContainer\", \"IgnoreDts\" : true, \"TranscodingUrl\" : \"TranscodingUrl\", \"Id\" : \"Id\", \"SupportsTranscoding\" : true, \"DefaultAudioStreamIndex\" : 6 } }";
                    ApiUtil.setExampleResponse(request, "application/json; profile="CamelCase"", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json; profile="PascalCase""))) {
                    String exampleString = "{ \"MediaSource\" : { \"EncoderPath\" : \"EncoderPath\", \"RequiredHttpHeaders\" : { \"key\" : \"RequiredHttpHeaders\" }, \"RunTimeTicks\" : 7, \"MediaStreams\" : [ { \"VideoRange\" : \"VideoRange\", \"CodecTimeBase\" : \"CodecTimeBase\", \"ColorSpace\" : \"ColorSpace\", \"Index\" : 3, \"ColorRange\" : \"ColorRange\", \"localizedForced\" : \"localizedForced\", \"BitDepth\" : 6, \"Channels\" : 6, \"Profile\" : \"Profile\", \"SupportsExternalStream\" : true, \"DeliveryUrl\" : \"DeliveryUrl\", \"localizedDefault\" : \"localizedDefault\", \"Codec\" : \"Codec\", \"ColorPrimaries\" : \"ColorPrimaries\", \"SampleRate\" : 0, \"IsTextSubtitleStream\" : true, \"Language\" : \"Language\", \"IsAnamorphic\" : true, \"Height\" : 3, \"NalLengthSize\" : \"NalLengthSize\", \"PixelFormat\" : \"PixelFormat\", \"RefFrames\" : 6, \"IsAVC\" : true, \"Width\" : 8, \"TimeBase\" : \"TimeBase\", \"ColorTransfer\" : \"ColorTransfer\", \"CodecTag\" : \"CodecTag\", \"IsDefault\" : true, \"Path\" : \"Path\", \"Comment\" : \"Comment\", \"IsExternalUrl\" : true, \"DisplayTitle\" : \"DisplayTitle\", \"IsForced\" : true, \"ChannelLayout\" : \"ChannelLayout\", \"PacketLength\" : 0, \"localizedUndefined\" : \"localizedUndefined\", \"Title\" : \"Title\", \"RealFrameRate\" : 7.05877, \"AspectRatio\" : \"AspectRatio\", \"AverageFrameRate\" : 6.778325, \"Score\" : 4, \"IsExternal\" : true, \"IsInterlaced\" : true, \"Level\" : 7.143538047012306, \"BitRate\" : 5 }, { \"VideoRange\" : \"VideoRange\", \"CodecTimeBase\" : \"CodecTimeBase\", \"ColorSpace\" : \"ColorSpace\", \"Index\" : 3, \"ColorRange\" : \"ColorRange\", \"localizedForced\" : \"localizedForced\", \"BitDepth\" : 6, \"Channels\" : 6, \"Profile\" : \"Profile\", \"SupportsExternalStream\" : true, \"DeliveryUrl\" : \"DeliveryUrl\", \"localizedDefault\" : \"localizedDefault\", \"Codec\" : \"Codec\", \"ColorPrimaries\" : \"ColorPrimaries\", \"SampleRate\" : 0, \"IsTextSubtitleStream\" : true, \"Language\" : \"Language\", \"IsAnamorphic\" : true, \"Height\" : 3, \"NalLengthSize\" : \"NalLengthSize\", \"PixelFormat\" : \"PixelFormat\", \"RefFrames\" : 6, \"IsAVC\" : true, \"Width\" : 8, \"TimeBase\" : \"TimeBase\", \"ColorTransfer\" : \"ColorTransfer\", \"CodecTag\" : \"CodecTag\", \"IsDefault\" : true, \"Path\" : \"Path\", \"Comment\" : \"Comment\", \"IsExternalUrl\" : true, \"DisplayTitle\" : \"DisplayTitle\", \"IsForced\" : true, \"ChannelLayout\" : \"ChannelLayout\", \"PacketLength\" : 0, \"localizedUndefined\" : \"localizedUndefined\", \"Title\" : \"Title\", \"RealFrameRate\" : 7.05877, \"AspectRatio\" : \"AspectRatio\", \"AverageFrameRate\" : 6.778325, \"Score\" : 4, \"IsExternal\" : true, \"IsInterlaced\" : true, \"Level\" : 7.143538047012306, \"BitRate\" : 5 } ], \"Size\" : 3, \"BufferMs\" : 3, \"Name\" : \"Name\", \"RequiresOpening\" : true, \"SupportsDirectStream\" : true, \"RequiresClosing\" : true, \"Container\" : \"Container\", \"LiveStreamId\" : \"LiveStreamId\", \"RequiresLooping\" : true, \"DefaultSubtitleStreamIndex\" : 1, \"GenPtsInput\" : true, \"IsInfiniteStream\" : true, \"Path\" : \"Path\", \"IsRemote\" : true, \"IgnoreIndex\" : true, \"SupportsDirectPlay\" : true, \"TranscodingSubProtocol\" : \"TranscodingSubProtocol\", \"AnalyzeDurationMs\" : 9, \"Formats\" : [ \"Formats\", \"Formats\" ], \"Bitrate\" : 6, \"OpenToken\" : \"OpenToken\", \"SupportsProbing\" : true, \"MediaAttachments\" : [ { \"CodecTag\" : \"CodecTag\", \"Comment\" : \"Comment\", \"DeliveryUrl\" : \"DeliveryUrl\", \"Codec\" : \"Codec\", \"FileName\" : \"FileName\", \"Index\" : 2, \"MimeType\" : \"MimeType\" }, { \"CodecTag\" : \"CodecTag\", \"Comment\" : \"Comment\", \"DeliveryUrl\" : \"DeliveryUrl\", \"Codec\" : \"Codec\", \"FileName\" : \"FileName\", \"Index\" : 2, \"MimeType\" : \"MimeType\" } ], \"ReadAtNativeFramerate\" : true, \"ETag\" : \"ETag\", \"TranscodingContainer\" : \"TranscodingContainer\", \"IgnoreDts\" : true, \"TranscodingUrl\" : \"TranscodingUrl\", \"Id\" : \"Id\", \"SupportsTranscoding\" : true, \"DefaultAudioStreamIndex\" : 6 } }";
                    ApiUtil.setExampleResponse(request, "application/json; profile="PascalCase"", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}