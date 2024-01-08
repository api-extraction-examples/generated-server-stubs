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
 * ApiV1ListsIdAccountsPostRequest
 */

@JsonTypeName("_api_v1_lists__id__accounts_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1ListsIdAccountsPostRequest {

  @Valid
  private List<String> accountIds = new ArrayList<>();

  public ApiV1ListsIdAccountsPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApiV1ListsIdAccountsPostRequest(List<String> accountIds) {
    this.accountIds = accountIds;
  }

  public ApiV1ListsIdAccountsPostRequest accountIds(List<String> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public ApiV1ListsIdAccountsPostRequest addAccountIdsItem(String accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

  /**
   * Array of account IDs to add to the list.
   * @return accountIds
  */
  @NotNull 
  @Schema(name = "account_ids", description = "Array of account IDs to add to the list.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("account_ids")
  public List<String> getAccountIds() {
    return accountIds;
  }

  public void setAccountIds(List<String> accountIds) {
    this.accountIds = accountIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1ListsIdAccountsPostRequest apiV1ListsIdAccountsPostRequest = (ApiV1ListsIdAccountsPostRequest) o;
    return Objects.equals(this.accountIds, apiV1ListsIdAccountsPostRequest.accountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1ListsIdAccountsPostRequest {\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
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

