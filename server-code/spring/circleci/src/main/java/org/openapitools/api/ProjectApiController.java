package org.openapitools.api;

import org.openapitools.model.Artifact;
import org.openapitools.model.Build;
import org.openapitools.model.BuildDetail;
import org.openapitools.model.BuildSummary;
import org.openapitools.model.Envvar;
import org.openapitools.model.Key;
import org.openapitools.model.ProjectUsernameProjectBuildCacheDelete200Response;
import org.openapitools.model.ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response;
import org.openapitools.model.ProjectUsernameProjectPostRequest;
import org.openapitools.model.ProjectUsernameProjectSshKeyPostDefaultResponse;
import org.openapitools.model.ProjectUsernameProjectSshKeyPostRequest;
import org.openapitools.model.ProjectUsernameProjectTreeBranchPostRequest;
import org.openapitools.model.Tests;
import java.net.URI;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:13.970205-04:00[America/Lower_Princes]")
@Controller
@RequestMapping("${openapi.circleCIREST.base-path:/api/v1}")
public class ProjectApiController implements ProjectApi {

    private final NativeWebRequest request;

    @Autowired
    public ProjectApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
