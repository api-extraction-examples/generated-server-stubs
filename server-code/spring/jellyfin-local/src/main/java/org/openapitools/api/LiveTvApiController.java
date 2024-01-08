package org.openapitools.api;

import org.openapitools.model.BaseItemDto;
import org.openapitools.model.BaseItemDtoQueryResult;
import org.openapitools.model.ChannelMappingOptionsDto;
import org.openapitools.model.ChannelType;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.GetProgramsDto;
import org.openapitools.model.GuideInfo;
import org.openapitools.model.ImageType;
import org.openapitools.model.ItemFields;
import org.openapitools.model.ListingsProviderInfo;
import org.openapitools.model.LiveTvInfo;
import org.openapitools.model.NameIdPair;
import java.time.OffsetDateTime;
import org.openapitools.model.ProblemDetails;
import org.openapitools.model.RecordingStatus;
import org.openapitools.model.SeriesTimerInfoDto;
import org.openapitools.model.SeriesTimerInfoDtoQueryResult;
import org.openapitools.model.SetChannelMappingDto;
import org.openapitools.model.SortOrder;
import org.openapitools.model.TimerInfoDto;
import org.openapitools.model.TimerInfoDtoQueryResult;
import org.openapitools.model.TunerChannelMapping;
import org.openapitools.model.TunerHostInfo;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
@Controller
@RequestMapping("${openapi.jellyfin.base-path:}")
public class LiveTvApiController implements LiveTvApi {

    private final NativeWebRequest request;

    @Autowired
    public LiveTvApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
