package org.openapitools.api;

import org.openapitools.model.ClientCapabilitiesDto;
import org.openapitools.model.GeneralCommand;
import org.openapitools.model.GeneralCommandType;
import org.openapitools.model.PlayCommand;
import org.openapitools.model.PlaybackProgressInfo;
import org.openapitools.model.PlaybackStartInfo;
import org.openapitools.model.PlaybackStopInfo;
import org.openapitools.model.PlaystateCommand;
import org.openapitools.model.SessionInfo;
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
public class SessionsApiController implements SessionsApi {

    private final NativeWebRequest request;

    @Autowired
    public SessionsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
