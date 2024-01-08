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
 * A list of issue type screen scheme mappings.
 */

@Schema(name = "IssueTypeScreenSchemeMappingDetails", description = "A list of issue type screen scheme mappings.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeScreenSchemeMappingDetails {

  @Valid
  private List<@Valid IssueTypeScreenSchemeMapping> issueTypeMappings = new ArrayList<>();

  public IssueTypeScreenSchemeMappingDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTypeScreenSchemeMappingDetails(List<@Valid IssueTypeScreenSchemeMapping> issueTypeMappings) {
    this.issueTypeMappings = issueTypeMappings;
  }

  public IssueTypeScreenSchemeMappingDetails issueTypeMappings(List<@Valid IssueTypeScreenSchemeMapping> issueTypeMappings) {
    this.issueTypeMappings = issueTypeMappings;
    return this;
  }

  public IssueTypeScreenSchemeMappingDetails addIssueTypeMappingsItem(IssueTypeScreenSchemeMapping issueTypeMappingsItem) {
    if (this.issueTypeMappings == null) {
      this.issueTypeMappings = new ArrayList<>();
    }
    this.issueTypeMappings.add(issueTypeMappingsItem);
    return this;
  }

  /**
   * The list of issue type to screen scheme mappings. A *default* entry cannot be specified because a default entry is added when an issue type screen scheme is created.
   * @return issueTypeMappings
  */
  @NotNull @Valid 
  @Schema(name = "issueTypeMappings", description = "The list of issue type to screen scheme mappings. A *default* entry cannot be specified because a default entry is added when an issue type screen scheme is created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueTypeMappings")
  public List<@Valid IssueTypeScreenSchemeMapping> getIssueTypeMappings() {
    return issueTypeMappings;
  }

  public void setIssueTypeMappings(List<@Valid IssueTypeScreenSchemeMapping> issueTypeMappings) {
    this.issueTypeMappings = issueTypeMappings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeScreenSchemeMappingDetails issueTypeScreenSchemeMappingDetails = (IssueTypeScreenSchemeMappingDetails) o;
    return Objects.equals(this.issueTypeMappings, issueTypeScreenSchemeMappingDetails.issueTypeMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeScreenSchemeMappingDetails {\n");
    sb.append("    issueTypeMappings: ").append(toIndentedString(issueTypeMappings)).append("\n");
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

