package org.openapitools.api;

import org.openapitools.model.Account;
import org.openapitools.model.Activity;
import org.openapitools.model.AdminAccount;
import org.openapitools.model.AdminReport;
import org.openapitools.model.Announcement;
import org.openapitools.model.ApiV1AccountsIdFollowPostRequest;
import org.openapitools.model.ApiV1AccountsIdMutePostRequest;
import org.openapitools.model.ApiV1AccountsIdNotePostRequest;
import org.openapitools.model.ApiV1AccountsPostRequest;
import org.openapitools.model.ApiV1AccountsUpdateCredentialsPatchRequest;
import org.openapitools.model.ApiV1AdminAccountsIdActionPostRequest;
import org.openapitools.model.ApiV1AppsPost200Response;
import org.openapitools.model.ApiV1AppsPostRequest;
import org.openapitools.model.ApiV1DomainBlocksPostRequest;
import org.openapitools.model.ApiV1FeaturedTagsPostRequest;
import org.openapitools.model.ApiV1FiltersPostRequest;
import org.openapitools.model.ApiV1ListsIdAccountsPostRequest;
import org.openapitools.model.ApiV1ListsPostRequest;
import org.openapitools.model.ApiV1ListsPutRequest;
import org.openapitools.model.ApiV1MediaPostRequest;
import org.openapitools.model.ApiV1PollsIdPostRequest;
import org.openapitools.model.ApiV1PushSubscriptionPostRequest;
import org.openapitools.model.ApiV1PushSubscriptionPutRequest;
import org.openapitools.model.ApiV1ReportsPostRequest;
import org.openapitools.model.ApiV1ScheduledStatusesIdPutRequest;
import org.openapitools.model.ApiV1StatusesIdReblogPostRequest;
import org.openapitools.model.ApiV1StatusesPost200Response;
import org.openapitools.model.ApiV1StatusesPostRequestInner;
import org.openapitools.model.ApiV2SearchGet200Response;
import org.openapitools.model.Application;
import org.openapitools.model.Attachment;
import org.openapitools.model.Card;
import org.openapitools.model.Context;
import org.openapitools.model.Conversation;
import org.openapitools.model.Emoji;
import org.openapitools.model.Error;
import org.openapitools.model.FeaturedTag;
import org.openapitools.model.Filter;
import org.openapitools.model.IdentityProof;
import org.openapitools.model.Instance;
import org.openapitools.model.ModelList;
import org.openapitools.model.Notification;
import org.openapitools.model.Poll;
import org.openapitools.model.Preferences;
import org.openapitools.model.PushSubscription;
import org.openapitools.model.Relationship;
import org.openapitools.model.Report;
import org.openapitools.model.ScheduledStatus;
import org.openapitools.model.Status;
import org.openapitools.model.Tag;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
@Controller
@RequestMapping("${openapi.mastodonAPISpecificationHttpsGithubComMastodonMastodon.base-path:}")
public class ApiApiController implements ApiApi {

    private final NativeWebRequest request;

    @Autowired
    public ApiApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
