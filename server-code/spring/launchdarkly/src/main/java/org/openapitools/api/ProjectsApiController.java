package org.openapitools.api;

import org.openapitools.model.ApprovalRequest;
import org.openapitools.model.ApprovalRequests;
import org.openapitools.model.Environment;
import org.openapitools.model.EnvironmentPost;
import org.openapitools.model.FeatureFlagScheduledChange;
import org.openapitools.model.FeatureFlagScheduledChanges;
import org.openapitools.model.FeatureFlagScheduledChangesConflicts;
import org.openapitools.model.GetFlagConfigScheduledChangesConflictsRequest;
import org.openapitools.model.PatchFlagConfigScheduledChangeRequest;
import org.openapitools.model.PatchOperation;
import org.openapitools.model.PostApplyApprovalRequestRequest;
import org.openapitools.model.PostApprovalRequestRequest;
import org.openapitools.model.PostFlagConfigScheduledChangesRequest;
import org.openapitools.model.PostProjectRequest;
import org.openapitools.model.PostReviewApprovalRequestRequest;
import org.openapitools.model.Project;
import org.openapitools.model.Projects;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
@Controller
@RequestMapping("${openapi.launchDarklyREST.base-path:/api/v2}")
public class ProjectsApiController implements ProjectsApi {

    private final NativeWebRequest request;

    @Autowired
    public ProjectsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
