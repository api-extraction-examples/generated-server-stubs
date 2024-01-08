package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The details of a custom field context.
 */

@Schema(name = "CustomFieldContext", description = "The details of a custom field context.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldContext {

  private String description;

  private String id;

  private Boolean isAnyIssueType;

  private Boolean isGlobalContext;

  private String name;

  public CustomFieldContext() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldContext(String description, String id, Boolean isAnyIssueType, Boolean isGlobalContext, String name) {
    this.description = description;
    this.id = id;
    this.isAnyIssueType = isAnyIssueType;
    this.isGlobalContext = isGlobalContext;
    this.name = name;
  }

  public CustomFieldContext description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the context.
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "The description of the context.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CustomFieldContext id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the context.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the context.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomFieldContext isAnyIssueType(Boolean isAnyIssueType) {
    this.isAnyIssueType = isAnyIssueType;
    return this;
  }

  /**
   * Whether the context apply to all issue types.
   * @return isAnyIssueType
  */
  @NotNull 
  @Schema(name = "isAnyIssueType", description = "Whether the context apply to all issue types.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isAnyIssueType")
  public Boolean getIsAnyIssueType() {
    return isAnyIssueType;
  }

  public void setIsAnyIssueType(Boolean isAnyIssueType) {
    this.isAnyIssueType = isAnyIssueType;
  }

  public CustomFieldContext isGlobalContext(Boolean isGlobalContext) {
    this.isGlobalContext = isGlobalContext;
    return this;
  }

  /**
   * Whether the context is global.
   * @return isGlobalContext
  */
  @NotNull 
  @Schema(name = "isGlobalContext", description = "Whether the context is global.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isGlobalContext")
  public Boolean getIsGlobalContext() {
    return isGlobalContext;
  }

  public void setIsGlobalContext(Boolean isGlobalContext) {
    this.isGlobalContext = isGlobalContext;
  }

  public CustomFieldContext name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the context.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the context.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContext customFieldContext = (CustomFieldContext) o;
    return Objects.equals(this.description, customFieldContext.description) &&
        Objects.equals(this.id, customFieldContext.id) &&
        Objects.equals(this.isAnyIssueType, customFieldContext.isAnyIssueType) &&
        Objects.equals(this.isGlobalContext, customFieldContext.isGlobalContext) &&
        Objects.equals(this.name, customFieldContext.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, isAnyIssueType, isGlobalContext, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContext {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAnyIssueType: ").append(toIndentedString(isAnyIssueType)).append("\n");
    sb.append("    isGlobalContext: ").append(toIndentedString(isGlobalContext)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

