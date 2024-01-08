package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Defaults for a Forge collection of users custom field.
 */

@Schema(name = "CustomFieldContextDefaultValueForgeMultiUserField", description = "Defaults for a Forge collection of users custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldContextDefaultValueForgeMultiUserField implements CustomFieldContextDefaultValue {

  @Valid
  private List<String> accountIds = new ArrayList<>();

  private String contextId;

  private String type;

  public CustomFieldContextDefaultValueForgeMultiUserField() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldContextDefaultValueForgeMultiUserField(List<String> accountIds, String contextId, String type) {
    this.accountIds = accountIds;
    this.contextId = contextId;
    this.type = type;
  }

  public CustomFieldContextDefaultValueForgeMultiUserField accountIds(List<String> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public CustomFieldContextDefaultValueForgeMultiUserField addAccountIdsItem(String accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

  /**
   * The IDs of the default users.
   * @return accountIds
  */
  @NotNull 
  @Schema(name = "accountIds", description = "The IDs of the default users.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accountIds")
  public List<String> getAccountIds() {
    return accountIds;
  }

  public void setAccountIds(List<String> accountIds) {
    this.accountIds = accountIds;
  }

  public CustomFieldContextDefaultValueForgeMultiUserField contextId(String contextId) {
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

  public CustomFieldContextDefaultValueForgeMultiUserField type(String type) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueForgeMultiUserField customFieldContextDefaultValueForgeMultiUserField = (CustomFieldContextDefaultValueForgeMultiUserField) o;
    return Objects.equals(this.accountIds, customFieldContextDefaultValueForgeMultiUserField.accountIds) &&
        Objects.equals(this.contextId, customFieldContextDefaultValueForgeMultiUserField.contextId) &&
        Objects.equals(this.type, customFieldContextDefaultValueForgeMultiUserField.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds, contextId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueForgeMultiUserField {\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
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

