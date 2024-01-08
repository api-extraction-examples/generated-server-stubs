package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.UserFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Defaults for a Forge user custom field.
 */

@Schema(name = "CustomFieldContextDefaultValueForgeUserField", description = "Defaults for a Forge user custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldContextDefaultValueForgeUserField implements CustomFieldContextDefaultValue {

  private String accountId;

  private String contextId;

  private String type;

  private UserFilter userFilter;

  public CustomFieldContextDefaultValueForgeUserField() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldContextDefaultValueForgeUserField(String accountId, String contextId, String type, UserFilter userFilter) {
    this.accountId = accountId;
    this.contextId = contextId;
    this.type = type;
    this.userFilter = userFilter;
  }

  public CustomFieldContextDefaultValueForgeUserField accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The ID of the default user.
   * @return accountId
  */
  @NotNull 
  @Schema(name = "accountId", description = "The ID of the default user.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public CustomFieldContextDefaultValueForgeUserField contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  /**
   * The ID of the context.
   * @return contextId
  */
  @NotNull 
  @Schema(name = "contextId", description = "The ID of the context.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  public CustomFieldContextDefaultValueForgeUserField type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CustomFieldContextDefaultValueForgeUserField userFilter(UserFilter userFilter) {
    this.userFilter = userFilter;
    return this;
  }

  /**
   * Get userFilter
   * @return userFilter
  */
  @NotNull @Valid 
  @Schema(name = "userFilter", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userFilter")
  public UserFilter getUserFilter() {
    return userFilter;
  }

  public void setUserFilter(UserFilter userFilter) {
    this.userFilter = userFilter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueForgeUserField customFieldContextDefaultValueForgeUserField = (CustomFieldContextDefaultValueForgeUserField) o;
    return Objects.equals(this.accountId, customFieldContextDefaultValueForgeUserField.accountId) &&
        Objects.equals(this.contextId, customFieldContextDefaultValueForgeUserField.contextId) &&
        Objects.equals(this.type, customFieldContextDefaultValueForgeUserField.type) &&
        Objects.equals(this.userFilter, customFieldContextDefaultValueForgeUserField.userFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, contextId, type, userFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueForgeUserField {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userFilter: ").append(toIndentedString(userFilter)).append("\n");
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

