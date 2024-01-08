package org.openapitools.api;

import org.openapitools.model.AddFollowersRequest;
import org.openapitools.model.AddSupportingRelationshipRequest;
import org.openapitools.model.CreateGoal201Response;
import org.openapitools.model.CreateGoalMetricRequest;
import org.openapitools.model.CreateGoalRequest;
import org.openapitools.model.DeleteAttachment200Response;
import org.openapitools.model.ErrorResponse;
import org.openapitools.model.GetGoalRelationship200Response;
import org.openapitools.model.GetGoals200Response;
import org.openapitools.model.RemoveSupportingRelationshipRequest;
import org.openapitools.model.UpdateGoalMetricRequest;


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
public class GoalsApiController implements GoalsApi {

    private final NativeWebRequest request;

    @Autowired
    public GoalsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
