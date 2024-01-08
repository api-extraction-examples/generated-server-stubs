package org.openapitools.api;

import org.openapitools.model.Body;
import org.openapitools.model.Body1;
import org.openapitools.model.Body2;
import org.openapitools.model.Body3;
import org.openapitools.model.Body4;
import org.openapitools.model.ErrorResponse;
import org.openapitools.model.MusicExportErrorResponse;
import org.openapitools.model.MusicExportJob;
import org.openapitools.model.MusicExportPreferences;
import org.openapitools.model.MusicExportPreferencesResponse;
import org.openapitools.model.MusicExportSuccess;
import org.openapitools.model.PersonalisedCategoriesResponse;
import org.openapitools.model.PersonalisedMusicBatchRequest;
import org.openapitools.model.PersonalisedMusicErrorResponse;
import org.openapitools.model.PersonalisedMusicRequest;
import org.openapitools.model.PersonalisedMusicResponse;
import org.openapitools.model.PersonalisedMusicSuccess;
import org.openapitools.model.PersonalisedNetworksResponse;
import org.openapitools.model.PersonalisedRadioBatchRequest;
import org.openapitools.model.PersonalisedRadioErrorResponse;
import org.openapitools.model.PersonalisedRadioRequest;
import org.openapitools.model.PersonalisedRadioResponse;
import org.openapitools.model.PersonalisedRadioSuccessResponse;
import org.openapitools.model.PlayspaceContainer;
import org.openapitools.model.ProgrammesResponse;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
@Controller
@RequestMapping("${openapi.radioMusicServices.base-path:}")
public class MyApiController implements MyApi {

    private final NativeWebRequest request;

    @Autowired
    public MyApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
