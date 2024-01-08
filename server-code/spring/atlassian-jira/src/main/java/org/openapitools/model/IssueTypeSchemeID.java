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
 * The ID of an issue type scheme.
 */

@Schema(name = "IssueTypeSchemeID", description = "The ID of an issue type scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeSchemeID {

  private String issueTypeSchemeId;

  public IssueTypeSchemeID() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTypeSchemeID(String issueTypeSchemeId) {
    this.issueTypeSchemeId = issueTypeSchemeId;
  }

  public IssueTypeSchemeID issueTypeSchemeId(String issueTypeSchemeId) {
    this.issueTypeSchemeId = issueTypeSchemeId;
    return this;
  }

  /**
   * The ID of the issue type scheme.
   * @return issueTypeSchemeId
  */
  
  @Schema(name = "issueTypeSchemeId", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the issue type scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    IssueTypeSchemeID issueTypeSchemeID = (IssueTypeSchemeID) o;
    return Objects.equals(this.issueTypeSchemeId, issueTypeSchemeID.issueTypeSchemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeSchemeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeSchemeID {\n");
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

