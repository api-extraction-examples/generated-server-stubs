package org.openapitools.api;

import org.openapitools.model.ApiError;
import org.openapitools.model.CancellationCostError;
import org.openapitools.model.CancellationRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.Location;
import java.time.OffsetDateTime;
import org.openapitools.model.RatingRequest;
import org.openapitools.model.Ride;
import org.openapitools.model.RideDetail;
import org.openapitools.model.RideReceipt;
import org.openapitools.model.RideRequest;
import org.openapitools.model.RideRequestError;
import org.openapitools.model.RidesResponse;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
@Controller
@RequestMapping("${openapi.lyft.base-path:/v1}")
public class RidesApiController implements RidesApi {

    private final NativeWebRequest request;

    @Autowired
    public RidesApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
