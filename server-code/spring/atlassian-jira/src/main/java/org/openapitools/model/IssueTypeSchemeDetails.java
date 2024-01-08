package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Details of an issue type scheme and its associated issue types.
 */

@Schema(name = "IssueTypeSchemeDetails", description = "Details of an issue type scheme and its associated issue types.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeSchemeDetails {

  private String defaultIssueTypeId;

  private String description;

  @Valid
  private List<String> issueTypeIds = new ArrayList<>();

  private String name;

  public IssueTypeSchemeDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTypeSchemeDetails(List<String> issueTypeIds, String name) {
    this.issueTypeIds = issueTypeIds;
    this.name = name;
  }

  public IssueTypeSchemeDetails defaultIssueTypeId(String defaultIssueTypeId) {
    this.defaultIssueTypeId = defaultIssueTypeId;
    return this;
  }

  /**
   * The ID of the default issue type of the issue type scheme. This ID must be included in `issueTypeIds`.
   * @return defaultIssueTypeId
  */
  
  @Schema(name = "defaultIssueTypeId", description = "The ID of the default issue type of the issue type scheme. This ID must be included in `issueTypeIds`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultIssueTypeId")
  public String getDefaultIssueTypeId() {
    return defaultIssueTypeId;
  }

  public void setDefaultIssueTypeId(String defaultIssueTypeId) {
    this.defaultIssueTypeId = defaultIssueTypeId;
  }

  public IssueTypeSchemeDetails description(String description) {
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

  public IssueTypeSchemeDetails issueTypeIds(List<String> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
    return this;
  }

  public IssueTypeSchemeDetails addIssueTypeIdsItem(String issueTypeIdsItem) {
    if (this.issueTypeIds == null) {
      this.issueTypeIds = new ArrayList<>();
    }
    this.issueTypeIds.add(issueTypeIdsItem);
    return this;
  }

  /**
   * The list of issue types IDs of the issue type scheme. At least one standard issue type ID is required.
   * @return issueTypeIds
  */
  @NotNull 
  @Schema(name = "issueTypeIds", description = "The list of issue types IDs of the issue type scheme. At least one standard issue type ID is required.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueTypeIds")
  public List<String> getIssueTypeIds() {
    return issueTypeIds;
  }

  public void setIssueTypeIds(List<String> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
  }

  public IssueTypeSchemeDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    IssueTypeSchemeDetails issueTypeSchemeDetails = (IssueTypeSchemeDetails) o;
    return Objects.equals(this.defaultIssueTypeId, issueTypeSchemeDetails.defaultIssueTypeId) &&
        Objects.equals(this.description, issueTypeSchemeDetails.description) &&
        Objects.equals(this.issueTypeIds, issueTypeSchemeDetails.issueTypeIds) &&
        Objects.equals(this.name, issueTypeSchemeDetails.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultIssueTypeId, description, issueTypeIds, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeSchemeDetails {\n");
    sb.append("    defaultIssueTypeId: ").append(toIndentedString(defaultIssueTypeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    issueTypeIds: ").append(toIndentedString(issueTypeIds)).append("\n");
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

