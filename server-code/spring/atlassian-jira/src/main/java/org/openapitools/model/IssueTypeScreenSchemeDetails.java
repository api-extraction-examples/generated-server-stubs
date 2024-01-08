package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IssueTypeScreenSchemeMapping;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The details of an issue type screen scheme.
 */

@Schema(name = "IssueTypeScreenSchemeDetails", description = "The details of an issue type screen scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeScreenSchemeDetails {

  private String description;

  @Valid
  private List<@Valid IssueTypeScreenSchemeMapping> issueTypeMappings = new ArrayList<>();

  private String name;

  public IssueTypeScreenSchemeDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTypeScreenSchemeDetails(List<@Valid IssueTypeScreenSchemeMapping> issueTypeMappings, String name) {
    this.issueTypeMappings = issueTypeMappings;
    this.name = name;
  }

  public IssueTypeScreenSchemeDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the issue type screen scheme. The maximum length is 255 characters.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the issue type screen scheme. The maximum length is 255 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IssueTypeScreenSchemeDetails issueTypeMappings(List<@Valid IssueTypeScreenSchemeMapping> issueTypeMappings) {
    this.issueTypeMappings = issueTypeMappings;
    return this;
  }

  public IssueTypeScreenSchemeDetails addIssueTypeMappingsItem(IssueTypeScreenSchemeMapping issueTypeMappingsItem) {
    if (this.issueTypeMappings == null) {
      this.issueTypeMappings = new ArrayList<>();
    }
    this.issueTypeMappings.add(issueTypeMappingsItem);
    return this;
  }

  /**
   * The IDs of the screen schemes for the issue type IDs and *default*. A *default* entry is required to create an issue type screen scheme, it defines the mapping for all issue types without a screen scheme.
   * @return issueTypeMappings
  */
  @NotNull @Valid 
  @Schema(name = "issueTypeMappings", description = "The IDs of the screen schemes for the issue type IDs and *default*. A *default* entry is required to create an issue type screen scheme, it defines the mapping for all issue types without a screen scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueTypeMappings")
  public List<@Valid IssueTypeScreenSchemeMapping> getIssueTypeMappings() {
    return issueTypeMappings;
  }

  public void setIssueTypeMappings(List<@Valid IssueTypeScreenSchemeMapping> issueTypeMappings) {
    this.issueTypeMappings = issueTypeMappings;
  }

  public IssueTypeScreenSchemeDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue type screen scheme. The name must be unique. The maximum length is 255 characters.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the issue type screen scheme. The name must be unique. The maximum length is 255 characters.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    IssueTypeScreenSchemeDetails issueTypeScreenSchemeDetails = (IssueTypeScreenSchemeDetails) o;
    return Objects.equals(this.description, issueTypeScreenSchemeDetails.description) &&
        Objects.equals(this.issueTypeMappings, issueTypeScreenSchemeDetails.issueTypeMappings) &&
        Objects.equals(this.name, issueTypeScreenSchemeDetails.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, issueTypeMappings, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeScreenSchemeDetails {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    issueTypeMappings: ").append(toIndentedString(issueTypeMappings)).append("\n");
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

