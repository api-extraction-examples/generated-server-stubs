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
 * UserUserIdListsGet200Response
 */

@JsonTypeName("_user__user_id__lists_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class UserUserIdListsGet200Response {

  @Valid
  private List<String> lists;

  private String userId;

  public UserUserIdListsGet200Response lists(List<String> lists) {
    this.lists = lists;
    return this;
  }

  public UserUserIdListsGet200Response addListsItem(String listsItem) {
    if (this.lists == null) {
      this.lists = new ArrayList<>();
    }
    this.lists.add(listsItem);
    return this;
  }

  /**
   * Get lists
   * @return lists
  */
  
  @Schema(name = "lists", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lists")
  public List<String> getLists() {
    return lists;
  }

  public void setLists(List<String> lists) {
    this.lists = lists;
  }

  public UserUserIdListsGet200Response userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "user_id", example = "5142451174a3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUserIdListsGet200Response userUserIdListsGet200Response = (UserUserIdListsGet200Response) o;
    return Objects.equals(this.lists, userUserIdListsGet200Response.lists) &&
        Objects.equals(this.userId, userUserIdListsGet200Response.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lists, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUserIdListsGet200Response {\n");
    sb.append("    lists: ").append(toIndentedString(lists)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

