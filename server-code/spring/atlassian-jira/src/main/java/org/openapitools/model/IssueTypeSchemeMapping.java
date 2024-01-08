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
 * Issue type scheme item.
 */

@Schema(name = "IssueTypeSchemeMapping", description = "Issue type scheme item.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeSchemeMapping {

  private String issueTypeId;

  private String issueTypeSchemeId;

  public IssueTypeSchemeMapping() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTypeSchemeMapping(String issueTypeId, String issueTypeSchemeId) {
    this.issueTypeId = issueTypeId;
    this.issueTypeSchemeId = issueTypeSchemeId;
  }

  public IssueTypeSchemeMapping issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

  /**
   * The ID of the issue type.
   * @return issueTypeId
  */
  @NotNull 
  @Schema(name = "issueTypeId", description = "The ID of the issue type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueTypeId")
  public String getIssueTypeId() {
    return issueTypeId;
  }

  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }

  public IssueTypeSchemeMapping issueTypeSchemeId(String issueTypeSchemeId) {
    this.issueTypeSchemeId = issueTypeSchemeId;
    return this;
  }

  /**
   * The ID of the issue type scheme.
   * @return issueTypeSchemeId
  */
  @NotNull 
  @Schema(name = "issueTypeSchemeId", description = "The ID of the issue type scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueTypeSchemeId")
  public String getIssueTypeSchemeId() {
    return issueTypeSchemeId;
  }

  public void setIssueTypeSchemeId(String issueTypeSchemeId) {
    this.issueTypeSchemeId = issueTypeSchemeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeSchemeMapping issueTypeSchemeMapping = (IssueTypeSchemeMapping) o;
    return Objects.equals(this.issueTypeId, issueTypeSchemeMapping.issueTypeId) &&
        Objects.equals(this.issueTypeSchemeId, issueTypeSchemeMapping.issueTypeSchemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeId, issueTypeSchemeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeSchemeMapping {\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
    sb.append("    issueTypeSchemeId: ").append(toIndentedString(issueTypeSchemeId)).append("\n");
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

