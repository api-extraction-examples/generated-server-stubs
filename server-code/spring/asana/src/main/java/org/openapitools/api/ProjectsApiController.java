package org.openapitools.api;

import org.openapitools.model.AddCustomFieldSettingForPortfolio200Response;
import org.openapitools.model.AddCustomFieldSettingForPortfolioRequest;
import org.openapitools.model.AddFollowersForProjectRequest;
import org.openapitools.model.AddMembersForPortfolioRequest;
import org.openapitools.model.CreateProject201Response;
import org.openapitools.model.CreateProjectRequest;
import org.openapitools.model.CreateProjectStatusForProjectRequest;
import org.openapitools.model.CreateSectionForProject201Response;
import org.openapitools.model.CreateSectionForProjectRequest;
import org.openapitools.model.DeleteAttachment200Response;
import org.openapitools.model.DuplicateProjectRequest;
import org.openapitools.model.ErrorResponse;
import org.openapitools.model.GetCustomFieldSettingsForPortfolio200Response;
import org.openapitools.model.GetItemsForPortfolio200Response;
import org.openapitools.model.GetJob200Response;
import org.openapitools.model.GetProjectBrief200Response;
import org.openapitools.model.GetProjectMembershipsForProject200Response;
import org.openapitools.model.GetProjectStatus200Response;
import org.openapitools.model.GetProjectStatusesForProject200Response;
import org.openapitools.model.GetSectionsForProject200Response;
import org.openapitools.model.GetTaskCountsForProject200Response;
import org.openapitools.model.GetTasksForProject200Response;
import org.openapitools.model.InsertSectionForProjectRequest;
import org.openapitools.model.ProjectSaveAsTemplateRequest;
import org.openapitools.model.RemoveCustomFieldSettingForPortfolioRequest;
import org.openapitools.model.RemoveFollowersForProjectRequest;
import org.openapitools.model.RemoveMembersForPortfolioRequest;
import org.openapitools.model.UpdateProjectBriefRequest;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
@Controller
@RequestMapping("${openapi.asana.base-path:/api/1.0}")
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
