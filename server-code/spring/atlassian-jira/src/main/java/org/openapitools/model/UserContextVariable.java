package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A [user](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user) specified as an Atlassian account ID.
 */

@Schema(name = "UserContextVariable", description = "A [user](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user) specified as an Atlassian account ID.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class UserContextVariable implements CustomContextVariable {

  private String accountId;

  private String type;

  public UserContextVariable() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserContextVariable(String accountId, String type) {
    this.accountId = accountId;
    this.type = type;
  }

  public UserContextVariable accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account ID of the user.
   * @return accountId
  */
  @NotNull 
  @Schema(name = "accountId", description = "The account ID of the user.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public UserContextVariable type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of custom context variable.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "Type of custom context variable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserContextVariable userContextVariable = (UserContextVariable) o;
    return Objects.equals(this.accountId, userContextVariable.accountId) &&
        Objects.equals(this.type, userContextVariable.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserContextVariable {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

