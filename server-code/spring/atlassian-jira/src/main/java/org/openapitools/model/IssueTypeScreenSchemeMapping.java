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
 * The IDs of the screen schemes for the issue type IDs.
 */

@Schema(name = "IssueTypeScreenSchemeMapping", description = "The IDs of the screen schemes for the issue type IDs.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeScreenSchemeMapping {

  private String issueTypeId;

  private String screenSchemeId;

  public IssueTypeScreenSchemeMapping() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTypeScreenSchemeMapping(String issueTypeId, String screenSchemeId) {
    this.issueTypeId = issueTypeId;
    this.screenSchemeId = screenSchemeId;
  }

  public IssueTypeScreenSchemeMapping issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

  /**
   * The ID of the issue type or *default*. Only issue types used in classic projects are accepted. An entry for *default* must be provided and defines the mapping for all issue types without a screen scheme.
   * @return issueTypeId
  */
  @NotNull 
  @Schema(name = "issueTypeId", description = "The ID of the issue type or *default*. Only issue types used in classic projects are accepted. An entry for *default* must be provided and defines the mapping for all issue types without a screen scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueTypeId")
  public String getIssueTypeId() {
    return issueTypeId;
  }

  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }

  public IssueTypeScreenSchemeMapping screenSchemeId(String screenSchemeId) {
    this.screenSchemeId = screenSchemeId;
    return this;
  }

  /**
   * The ID of the screen scheme. Only screen schemes used in classic projects are accepted.
   * @return screenSchemeId
  */
  @NotNull 
  @Schema(name = "screenSchemeId", description = "The ID of the screen scheme. Only screen schemes used in classic projects are accepted.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("screenSchemeId")
  public String getScreenSchemeId() {
    return screenSchemeId;
  }

  public void setScreenSchemeId(String screenSchemeId) {
    this.screenSchemeId = screenSchemeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeScreenSchemeMapping issueTypeScreenSchemeMapping = (IssueTypeScreenSchemeMapping) o;
    return Objects.equals(this.issueTypeId, issueTypeScreenSchemeMapping.issueTypeId) &&
        Objects.equals(this.screenSchemeId, issueTypeScreenSchemeMapping.screenSchemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeId, screenSchemeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeScreenSchemeMapping {\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
    sb.append("    screenSchemeId: ").append(toIndentedString(screenSchemeId)).append("\n");
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

