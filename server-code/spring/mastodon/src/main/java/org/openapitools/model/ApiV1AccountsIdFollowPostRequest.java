package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApiV1AccountsIdFollowPostRequest
 */

@JsonTypeName("_api_v1_accounts__id__follow_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1AccountsIdFollowPostRequest {

  private Boolean notify = false;

  private Boolean reblogs = true;

  public ApiV1AccountsIdFollowPostRequest notify(Boolean notify) {
    this.notify = notify;
    return this;
  }

  /**
   * Receive notifications when this account posts a status? Defaults to false.
   * @return notify
  */
  
  @Schema(name = "notify", description = "Receive notifications when this account posts a status? Defaults to false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notify")
  public Boolean getNotify() {
    return notify;
  }

  public void setNotify(Boolean notify) {
    this.notify = notify;
  }

  public ApiV1AccountsIdFollowPostRequest reblogs(Boolean reblogs) {
    this.reblogs = reblogs;
    return this;
  }

  /**
   * Receive this account's reblogs in home timeline? Defaults to true.
   * @return reblogs
  */
  
  @Schema(name = "reblogs", description = "Receive this account's reblogs in home timeline? Defaults to true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reblogs")
  public Boolean getReblogs() {
    return reblogs;
  }

  public void setReblogs(Boolean reblogs) {
    this.reblogs = reblogs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1AccountsIdFollowPostRequest apiV1AccountsIdFollowPostRequest = (ApiV1AccountsIdFollowPostRequest) o;
    return Objects.equals(this.notify, apiV1AccountsIdFollowPostRequest.notify) &&
        Objects.equals(this.reblogs, apiV1AccountsIdFollowPostRequest.reblogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notify, reblogs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1AccountsIdFollowPostRequest {\n");
    sb.append("    notify: ").append(toIndentedString(notify)).append("\n");
    sb.append("    reblogs: ").append(toIndentedString(reblogs)).append("\n");
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

