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
 * Details of the name, description, and default issue type for an issue type scheme.
 */

@Schema(name = "IssueTypeSchemeUpdateDetails", description = "Details of the name, description, and default issue type for an issue type scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeSchemeUpdateDetails {

  private String defaultIssueTypeId;

  private String description;

  private String name;

  public IssueTypeSchemeUpdateDetails defaultIssueTypeId(String defaultIssueTypeId) {
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

  public IssueTypeSchemeUpdateDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the issue type scheme. The maximum length is 4000 characters.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the issue type scheme. The maximum length is 4000 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IssueTypeSchemeUpdateDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    IssueTypeSchemeUpdateDetails issueTypeSchemeUpdateDetails = (IssueTypeSchemeUpdateDetails) o;
    return Objects.equals(this.defaultIssueTypeId, issueTypeSchemeUpdateDetails.defaultIssueTypeId) &&
        Objects.equals(this.description, issueTypeSchemeUpdateDetails.description) &&
        Objects.equals(this.name, issueTypeSchemeUpdateDetails.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultIssueTypeId, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeSchemeUpdateDetails {\n");
    sb.append("    defaultIssueTypeId: ").append(toIndentedString(defaultIssueTypeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

