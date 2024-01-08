package org.openapitools.api;

import org.openapitools.model.Asset;
import org.openapitools.model.AssetPublicSignature;
import org.openapitools.model.AssetSignature;
import org.openapitools.model.Build;
import org.openapitools.model.BuildHook;
import org.openapitools.model.BuildHookSetup;
import org.openapitools.model.BuildSetup;
import org.openapitools.model.Deploy;
import org.openapitools.model.DeployFiles;
import org.openapitools.model.DeployedBranch;
import org.openapitools.model.DnsZone;
import org.openapitools.model.Error;
import org.openapitools.model.Form;
import org.openapitools.model.Plugin;
import org.openapitools.model.PluginParams;
import org.openapitools.model.PluginRun;
import org.openapitools.model.ServiceInstance;
import org.openapitools.model.Site;
import org.openapitools.model.SiteSetup;
import org.openapitools.model.SniCertificate;
import org.openapitools.model.Snippet;
import org.openapitools.model.SplitTest;
import org.openapitools.model.SplitTestSetup;
import org.openapitools.model.Submission;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
@Controller
@RequestMapping("${openapi.netlifysAPIDocumentation.base-path:/api/v1}")
public class SitesApiController implements SitesApi {

    private final NativeWebRequest request;

    @Autowired
    public SitesApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
