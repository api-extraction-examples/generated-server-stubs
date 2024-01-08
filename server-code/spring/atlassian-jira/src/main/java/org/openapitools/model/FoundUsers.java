package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UserPickerUser;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The list of users found in a search, including header text (Showing X of Y matching users) and total of matched users.
 */

@Schema(name = "FoundUsers", description = "The list of users found in a search, including header text (Showing X of Y matching users) and total of matched users.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FoundUsers {

  private String header;

  private Integer total;

  @Valid
  private List<@Valid UserPickerUser> users;

  public FoundUsers header(String header) {
    this.header = header;
    return this;
  }

  /**
   * Header text indicating the number of users in the response and the total number of users found in the search.
   * @return header
  */
  
  @Schema(name = "header", description = "Header text indicating the number of users in the response and the total number of users found in the search.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("header")
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public FoundUsers total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * The total number of users found in the search.
   * @return total
  */
  
  @Schema(name = "total", description = "The total number of users found in the search.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public FoundUsers users(List<@Valid UserPickerUser> users) {
    this.users = users;
    return this;
  }

  public FoundUsers addUsersItem(UserPickerUser usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
  */
  @Valid 
  @Schema(name = "users", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("users")
  public List<@Valid UserPickerUser> getUsers() {
    return users;
  }

  public void setUsers(List<@Valid UserPickerUser> users) {
    this.users = users;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoundUsers foundUsers = (FoundUsers) o;
    return Objects.equals(this.header, foundUsers.header) &&
        Objects.equals(this.total, foundUsers.total) &&
        Objects.equals(this.users, foundUsers.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, total, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FoundUsers {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

