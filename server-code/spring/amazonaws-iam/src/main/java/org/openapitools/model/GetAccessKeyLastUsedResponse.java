package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.GetAccessKeyLastUsedResponseAccessKeyLastUsed;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;GetAccessKeyLastUsed&lt;/a&gt; request. It is also returned as a member of the &lt;a&gt;AccessKeyMetaData&lt;/a&gt; structure returned by the &lt;a&gt;ListAccessKeys&lt;/a&gt; action.
 */

@Schema(name = "GetAccessKeyLastUsedResponse", description = "Contains the response to a successful <a>GetAccessKeyLastUsed</a> request. It is also returned as a member of the <a>AccessKeyMetaData</a> structure returned by the <a>ListAccessKeys</a> action.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetAccessKeyLastUsedResponse {

  private String userName;

  private GetAccessKeyLastUsedResponseAccessKeyLastUsed accessKeyLastUsed;

  public GetAccessKeyLastUsedResponse userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  */
  
  @Schema(name = "UserName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public GetAccessKeyLastUsedResponse accessKeyLastUsed(GetAccessKeyLastUsedResponseAccessKeyLastUsed accessKeyLastUsed) {
    this.accessKeyLastUsed = accessKeyLastUsed;
    return this;
  }

  /**
   * Get accessKeyLastUsed
   * @return accessKeyLastUsed
  */
  @Valid 
  @Schema(name = "AccessKeyLastUsed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AccessKeyLastUsed")
  public GetAccessKeyLastUsedResponseAccessKeyLastUsed getAccessKeyLastUsed() {
    return accessKeyLastUsed;
  }

  public void setAccessKeyLastUsed(GetAccessKeyLastUsedResponseAccessKeyLastUsed accessKeyLastUsed) {
    this.accessKeyLastUsed = accessKeyLastUsed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccessKeyLastUsedResponse getAccessKeyLastUsedResponse = (GetAccessKeyLastUsedResponse) o;
    return Objects.equals(this.userName, getAccessKeyLastUsedResponse.userName) &&
        Objects.equals(this.accessKeyLastUsed, getAccessKeyLastUsedResponse.accessKeyLastUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, accessKeyLastUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccessKeyLastUsedResponse {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    accessKeyLastUsed: ").append(toIndentedString(accessKeyLastUsed)).append("\n");
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

