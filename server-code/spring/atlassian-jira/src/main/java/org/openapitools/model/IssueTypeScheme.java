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
 * Details of an issue type scheme.
 */

@Schema(name = "IssueTypeScheme", description = "Details of an issue type scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeScheme {

  private String defaultIssueTypeId;

  private String description;

  private String id;

  private Boolean isDefault;

  private String name;

  public IssueTypeScheme() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTypeScheme(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public IssueTypeScheme defaultIssueTypeId(String defaultIssueTypeId) {
    this.defaultIssueTypeId = defaultIssueTypeId;
    return this;
  }

  /**
   * The ID of the default issue type of the issue type scheme.
   * @return defaultIssueTypeId
  */
  
  @Schema(name = "defaultIssueTypeId", description = "The ID of the default issue type of the issue type scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultIssueTypeId")
  public String getDefaultIssueTypeId() {
    return defaultIssueTypeId;
  }

  public void setDefaultIssueTypeId(String defaultIssueTypeId) {
    this.defaultIssueTypeId = defaultIssueTypeId;
  }

  public IssueTypeScheme description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the issue type scheme.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the issue type scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IssueTypeScheme id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the issue type scheme.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the issue type scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IssueTypeScheme isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether the issue type scheme is the default.
   * @return isDefault
  */
  
  @Schema(name = "isDefault", description = "Whether the issue type scheme is the default.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDefault")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public IssueTypeScheme name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue type scheme.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the issue type scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    IssueTypeScheme issueTypeScheme = (IssueTypeScheme) o;
    return Objects.equals(this.defaultIssueTypeId, issueTypeScheme.defaultIssueTypeId) &&
        Objects.equals(this.description, issueTypeScheme.description) &&
        Objects.equals(this.id, issueTypeScheme.id) &&
        Objects.equals(this.isDefault, issueTypeScheme.isDefault) &&
        Objects.equals(this.name, issueTypeScheme.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultIssueTypeId, description, id, isDefault, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeScheme {\n");
    sb.append("    defaultIssueTypeId: ").append(toIndentedString(defaultIssueTypeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

