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
 * The screen scheme for an issue type.
 */

@Schema(name = "IssueTypeScreenSchemeItem", description = "The screen scheme for an issue type.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeScreenSchemeItem {

  private String issueTypeId;

  private String issueTypeScreenSchemeId;

  private String screenSchemeId;

  public IssueTypeScreenSchemeItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTypeScreenSchemeItem(String issueTypeId, String issueTypeScreenSchemeId, String screenSchemeId) {
    this.issueTypeId = issueTypeId;
    this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
    this.screenSchemeId = screenSchemeId;
  }

  public IssueTypeScreenSchemeItem issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

  /**
   * The ID of the issue type or *default*. Only issue types used in classic projects are accepted. When creating an issue screen scheme, an entry for *default* must be provided and defines the mapping for all issue types without a screen scheme. Otherwise, a *default* entry can't be provided.
   * @return issueTypeId
  */
  @NotNull 
  @Schema(name = "issueTypeId", description = "The ID of the issue type or *default*. Only issue types used in classic projects are accepted. When creating an issue screen scheme, an entry for *default* must be provided and defines the mapping for all issue types without a screen scheme. Otherwise, a *default* entry can't be provided.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueTypeId")
  public String getIssueTypeId() {
    return issueTypeId;
  }

  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }

  public IssueTypeScreenSchemeItem issueTypeScreenSchemeId(String issueTypeScreenSchemeId) {
    this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
    return this;
  }

  /**
   * The ID of the issue type screen scheme.
   * @return issueTypeScreenSchemeId
  */
  @NotNull 
  @Schema(name = "issueTypeScreenSchemeId", description = "The ID of the issue type screen scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueTypeScreenSchemeId")
  public String getIssueTypeScreenSchemeId() {
    return issueTypeScreenSchemeId;
  }

  public void setIssueTypeScreenSchemeId(String issueTypeScreenSchemeId) {
    this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
  }

  public IssueTypeScreenSchemeItem screenSchemeId(String screenSchemeId) {
    this.screenSchemeId = screenSchemeId;
    return this;
  }

  /**
   * The ID of the screen scheme.
   * @return screenSchemeId
  */
  @NotNull 
  @Schema(name = "screenSchemeId", description = "The ID of the screen scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    IssueTypeScreenSchemeItem issueTypeScreenSchemeItem = (IssueTypeScreenSchemeItem) o;
    return Objects.equals(this.issueTypeId, issueTypeScreenSchemeItem.issueTypeId) &&
        Objects.equals(this.issueTypeScreenSchemeId, issueTypeScreenSchemeItem.issueTypeScreenSchemeId) &&
        Objects.equals(this.screenSchemeId, issueTypeScreenSchemeItem.screenSchemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeId, issueTypeScreenSchemeId, screenSchemeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeScreenSchemeItem {\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
    sb.append("    issueTypeScreenSchemeId: ").append(toIndentedString(issueTypeScreenSchemeId)).append("\n");
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

