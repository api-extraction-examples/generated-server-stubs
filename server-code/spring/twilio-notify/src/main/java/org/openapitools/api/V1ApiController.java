package org.openapitools.api;

import org.openapitools.model.BindingEnumBindingType;
import org.openapitools.model.CredentialEnumPushService;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.ListBindingResponse;
import org.openapitools.model.ListCredentialResponse;
import org.openapitools.model.ListServiceResponse;
import java.time.LocalDate;
import org.openapitools.model.NotificationEnumPriority;
import org.openapitools.model.NotifyV1Credential;
import org.openapitools.model.NotifyV1Service;
import org.openapitools.model.NotifyV1ServiceBinding;
import org.openapitools.model.NotifyV1ServiceNotification;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:55:49.917798-04:00[America/Lower_Princes]")
@Controller
@RequestMapping("${openapi.twilioNotify.base-path:}")
public class V1ApiController implements V1Api {

    private final NativeWebRequest request;

    @Autowired
    public V1ApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
