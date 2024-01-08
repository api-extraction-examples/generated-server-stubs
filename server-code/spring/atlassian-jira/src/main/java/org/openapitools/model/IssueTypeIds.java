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
 * The list of issue type IDs.
 */

@Schema(name = "IssueTypeIds", description = "The list of issue type IDs.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeIds {

  @Valid
  private List<String> issueTypeIds = new ArrayList<>();

  public IssueTypeIds() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTypeIds(List<String> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
  }

  public IssueTypeIds issueTypeIds(List<String> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
    return this;
  }

  public IssueTypeIds addIssueTypeIdsItem(String issueTypeIdsItem) {
    if (this.issueTypeIds == null) {
      this.issueTypeIds = new ArrayList<>();
    }
    this.issueTypeIds.add(issueTypeIdsItem);
    return this;
  }

  /**
   * The list of issue type IDs.
   * @return issueTypeIds
  */
  @NotNull 
  @Schema(name = "issueTypeIds", description = "The list of issue type IDs.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueTypeIds")
  public List<String> getIssueTypeIds() {
    return issueTypeIds;
  }

  public void setIssueTypeIds(List<String> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeIds issueTypeIds = (IssueTypeIds) o;
    return Objects.equals(this.issueTypeIds, issueTypeIds.issueTypeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeIds {\n");
    sb.append("    issueTypeIds: ").append(toIndentedString(issueTypeIds)).append("\n");
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

