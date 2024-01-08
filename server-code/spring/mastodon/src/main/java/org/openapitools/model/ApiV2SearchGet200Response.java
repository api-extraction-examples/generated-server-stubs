package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Status;
import org.openapitools.model.Tag;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApiV2SearchGet200Response
 */

@JsonTypeName("_api_v2_search_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV2SearchGet200Response {

  @Valid
  private List<@Valid Account> accounts;

  @Valid
  private List<@Valid Status> hashtags;

  @Valid
  private List<@Valid Tag> statuses;

  public ApiV2SearchGet200Response accounts(List<@Valid Account> accounts) {
    this.accounts = accounts;
    return this;
  }

  public ApiV2SearchGet200Response addAccountsItem(Account accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * Get accounts
   * @return accounts
  */
  @Valid 
  @Schema(name = "accounts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accounts")
  public List<@Valid Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<@Valid Account> accounts) {
    this.accounts = accounts;
  }

  public ApiV2SearchGet200Response hashtags(List<@Valid Status> hashtags) {
    this.hashtags = hashtags;
    return this;
  }

  public ApiV2SearchGet200Response addHashtagsItem(Status hashtagsItem) {
    if (this.hashtags == null) {
      this.hashtags = new ArrayList<>();
    }
    this.hashtags.add(hashtagsItem);
    return this;
  }

  /**
   * Get hashtags
   * @return hashtags
  */
  @Valid 
  @Schema(name = "hashtags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hashtags")
  public List<@Valid Status> getHashtags() {
    return hashtags;
  }

  public void setHashtags(List<@Valid Status> hashtags) {
    this.hashtags = hashtags;
  }

  public ApiV2SearchGet200Response statuses(List<@Valid Tag> statuses) {
    this.statuses = statuses;
    return this;
  }

  public ApiV2SearchGet200Response addStatusesItem(Tag statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * Get statuses
   * @return statuses
  */
  @Valid 
  @Schema(name = "statuses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statuses")
  public List<@Valid Tag> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<@Valid Tag> statuses) {
    this.statuses = statuses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2SearchGet200Response apiV2SearchGet200Response = (ApiV2SearchGet200Response) o;
    return Objects.equals(this.accounts, apiV2SearchGet200Response.accounts) &&
        Objects.equals(this.hashtags, apiV2SearchGet200Response.hashtags) &&
        Objects.equals(this.statuses, apiV2SearchGet200Response.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, hashtags, statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV2SearchGet200Response {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    hashtags: ").append(toIndentedString(hashtags)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

