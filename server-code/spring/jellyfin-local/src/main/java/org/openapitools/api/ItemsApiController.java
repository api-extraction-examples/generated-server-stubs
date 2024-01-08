package org.openapitools.api;

import org.openapitools.model.AlbumInfoRemoteSearchQuery;
import org.openapitools.model.AllThemeMediaResult;
import org.openapitools.model.ArtistInfoRemoteSearchQuery;
import org.openapitools.model.BaseItemDto;
import org.openapitools.model.BaseItemDtoQueryResult;
import org.openapitools.model.BookInfoRemoteSearchQuery;
import org.openapitools.model.BoxSetInfoRemoteSearchQuery;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.ExternalIdInfo;
import org.openapitools.model.ImageFormat;
import org.openapitools.model.ImageInfo;
import org.openapitools.model.ImageProviderInfo;
import org.openapitools.model.ImageType;
import org.openapitools.model.ItemCounts;
import org.openapitools.model.ItemFields;
import org.openapitools.model.ItemFilter;
import org.openapitools.model.LocationType;
import org.openapitools.model.MetadataEditorInfo;
import org.openapitools.model.MetadataRefreshMode;
import org.openapitools.model.MovieInfoRemoteSearchQuery;
import org.openapitools.model.MusicVideoInfoRemoteSearchQuery;
import java.time.OffsetDateTime;
import org.openapitools.model.PersonLookupInfoRemoteSearchQuery;
import org.openapitools.model.PlaybackInfoDto;
import org.openapitools.model.PlaybackInfoResponse;
import org.openapitools.model.ProblemDetails;
import org.openapitools.model.QueryFilters;
import org.openapitools.model.QueryFiltersLegacy;
import org.openapitools.model.RemoteImageResult;
import org.openapitools.model.RemoteSearchResult;
import org.openapitools.model.RemoteSubtitleInfo;
import org.openapitools.model.SeriesInfoRemoteSearchQuery;
import org.openapitools.model.SeriesStatus;
import org.openapitools.model.ThemeMediaResult;
import org.openapitools.model.TrailerInfoRemoteSearchQuery;
import java.util.UUID;
import org.openapitools.model.VideoType;


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
public class ItemsApiController implements ItemsApi {

    private final NativeWebRequest request;

    @Autowired
    public ItemsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
