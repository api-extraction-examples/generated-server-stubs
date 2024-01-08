package org.openapitools.api;

import org.openapitools.model.AddUserForWorkspace200Response;
import org.openapitools.model.AddUserForWorkspaceRequest;
import org.openapitools.model.CreateProject201Response;
import org.openapitools.model.CreateProjectRequest;
import org.openapitools.model.CreateTag201Response;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.DeleteAttachment200Response;
import org.openapitools.model.ErrorResponse;
import org.openapitools.model.GetAuditLogEvents200Response;
import org.openapitools.model.GetCustomFieldsForWorkspace200Response;
import org.openapitools.model.GetItemsForPortfolio200Response;
import org.openapitools.model.GetTags200Response;
import org.openapitools.model.GetTasksForProject200Response;
import org.openapitools.model.GetTeamsForUser200Response;
import org.openapitools.model.GetUsersForTeam200Response;
import org.openapitools.model.GetWorkspace200Response;
import org.openapitools.model.GetWorkspaceMembershipsForUser200Response;
import org.openapitools.model.GetWorkspaces200Response;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapitools.model.RemoveUserForWorkspaceRequest;
import org.openapitools.model.TypeaheadForWorkspace200Response;
import org.openapitools.model.UpdateWorkspaceRequest;


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
public class WorkspacesApiController implements WorkspacesApi {

    private final NativeWebRequest request;

    @Autowired
    public WorkspacesApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
