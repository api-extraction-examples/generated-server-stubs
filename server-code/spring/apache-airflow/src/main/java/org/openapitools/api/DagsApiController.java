package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.ClearDagRun;
import org.openapitools.model.ClearDagRun200Response;
import org.openapitools.model.ClearTaskInstances;
import org.openapitools.model.DAG;
import org.openapitools.model.DAGCollection;
import org.openapitools.model.DAGDetail;
import org.openapitools.model.DAGRun;
import org.openapitools.model.DAGRunCollection;
import org.openapitools.model.DatasetEventCollection;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.Error;
import org.openapitools.model.ExtraLinkCollection;
import org.openapitools.model.GetLog200Response;
import org.openapitools.model.ListDagRunsForm;
import org.openapitools.model.ListTaskInstanceForm;
import java.time.OffsetDateTime;
import org.openapitools.model.SetDagRunNote;
import org.openapitools.model.SetTaskInstanceNote;
import org.openapitools.model.Task;
import org.openapitools.model.TaskCollection;
import org.openapitools.model.TaskInstance;
import org.openapitools.model.TaskInstanceCollection;
import org.openapitools.model.TaskInstanceReference;
import org.openapitools.model.TaskInstanceReferenceCollection;
import org.openapitools.model.UpdateDagRunState;
import org.openapitools.model.UpdateTaskInstance;
import org.openapitools.model.UpdateTaskInstancesState;
import org.openapitools.model.XCom;
import org.openapitools.model.XComCollection;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
@Controller
@RequestMapping("${openapi.airflowAPIStable.base-path:/api/v1}")
public class DagsApiController implements DagsApi {

    private final NativeWebRequest request;

    @Autowired
    public DagsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
