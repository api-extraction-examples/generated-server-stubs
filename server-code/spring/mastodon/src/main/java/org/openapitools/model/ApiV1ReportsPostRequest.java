package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApiV1ReportsPostRequest
 */

@JsonTypeName("_api_v1_reports_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1ReportsPostRequest {

  private String accountId;

  private String comment;

  private Boolean forward;

  @Valid
  private List<String> statusIds;

  public ApiV1ReportsPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApiV1ReportsPostRequest(String accountId) {
    this.accountId = accountId;
  }

  public ApiV1ReportsPostRequest accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * ID of the account to report
   * @return accountId
  */
  @NotNull 
  @Schema(name = "account_id", description = "ID of the account to report", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("account_id")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public ApiV1ReportsPostRequest comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Reason for the report (default max 1000 characters)
   * @return comment
  */
  
  @Schema(name = "comment", description = "Reason for the report (default max 1000 characters)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public ApiV1ReportsPostRequest forward(Boolean forward) {
    this.forward = forward;
    return this;
  }

  /**
   * If the account is remote, should the report be forwarded to the remote admin?
   * @return forward
  */
  
  @Schema(name = "forward", description = "If the account is remote, should the report be forwarded to the remote admin?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("forward")
  public Boolean getForward() {
    return forward;
  }

  public void setForward(Boolean forward) {
    this.forward = forward;
  }

  public ApiV1ReportsPostRequest statusIds(List<String> statusIds) {
    this.statusIds = statusIds;
    return this;
  }

  public ApiV1ReportsPostRequest addStatusIdsItem(String statusIdsItem) {
    if (this.statusIds == null) {
      this.statusIds = new ArrayList<>();
    }
    this.statusIds.add(statusIdsItem);
    return this;
  }

  /**
   * Array of Statuses to attach to the report, for context
   * @return statusIds
  */
  
  @Schema(name = "status_ids", description = "Array of Statuses to attach to the report, for context", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status_ids")
  public List<String> getStatusIds() {
    return statusIds;
  }

  public void setStatusIds(List<String> statusIds) {
    this.statusIds = statusIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1ReportsPostRequest apiV1ReportsPostRequest = (ApiV1ReportsPostRequest) o;
    return Objects.equals(this.accountId, apiV1ReportsPostRequest.accountId) &&
        Objects.equals(this.comment, apiV1ReportsPostRequest.comment) &&
        Objects.equals(this.forward, apiV1ReportsPostRequest.forward) &&
        Objects.equals(this.statusIds, apiV1ReportsPostRequest.statusIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, comment, forward, statusIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1ReportsPostRequest {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    forward: ").append(toIndentedString(forward)).append("\n");
    sb.append("    statusIds: ").append(toIndentedString(statusIds)).append("\n");
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

