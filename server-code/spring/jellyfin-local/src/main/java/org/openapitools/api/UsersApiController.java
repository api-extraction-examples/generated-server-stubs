package org.openapitools.api;

import org.openapitools.model.AuthenticateUserByName;
import org.openapitools.model.AuthenticationResult;
import org.openapitools.model.BaseItemDto;
import org.openapitools.model.BaseItemDtoQueryResult;
import org.openapitools.model.CreateUserByName;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.ForgotPasswordDto;
import org.openapitools.model.ForgotPasswordResult;
import org.openapitools.model.ImageFormat;
import org.openapitools.model.ImageType;
import org.openapitools.model.ItemFields;
import org.openapitools.model.ItemFilter;
import org.openapitools.model.LocationType;
import java.time.OffsetDateTime;
import org.openapitools.model.PinRedeemResult;
import org.openapitools.model.PlayMethod;
import org.openapitools.model.ProblemDetails;
import org.openapitools.model.QuickConnectDto;
import org.openapitools.model.RepeatMode;
import org.openapitools.model.SeriesStatus;
import org.openapitools.model.SpecialViewOptionDto;
import java.util.UUID;
import org.openapitools.model.UpdateUserEasyPassword;
import org.openapitools.model.UpdateUserPassword;
import org.openapitools.model.UserConfiguration;
import org.openapitools.model.UserDto;
import org.openapitools.model.UserItemDataDto;
import org.openapitools.model.UserPolicy;
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
public class UsersApiController implements UsersApi {

    private final NativeWebRequest request;

    @Autowired
    public UsersApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
