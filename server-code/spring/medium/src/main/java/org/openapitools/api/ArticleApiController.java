package org.openapitools.api;

import org.openapitools.model.ArticleArticleIdContentGet200Response;
import org.openapitools.model.ArticleArticleIdFansGet200Response;
import org.openapitools.model.ArticleArticleIdGet200Response;
import org.openapitools.model.ArticleArticleIdMarkdownGet200Response;
import org.openapitools.model.ArticleArticleIdRelatedGet200Response;
import org.openapitools.model.ArticleArticleIdResponsesGet200Response;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
@Controller
@RequestMapping("${openapi.medium.base-path:}")
public class ArticleApiController implements ArticleApi {

    private final NativeWebRequest request;

    @Autowired
    public ArticleApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
