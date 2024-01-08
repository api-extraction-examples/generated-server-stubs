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
 * The list of issue type IDs to be removed from the field configuration scheme.
 */

@Schema(name = "IssueTypeIdsToRemove", description = "The list of issue type IDs to be removed from the field configuration scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeIdsToRemove {

  @Valid
  private List<String> issueTypeIds = new ArrayList<>();

  public IssueTypeIdsToRemove() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTypeIdsToRemove(List<String> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
  }

  public IssueTypeIdsToRemove issueTypeIds(List<String> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
    return this;
  }

  public IssueTypeIdsToRemove addIssueTypeIdsItem(String issueTypeIdsItem) {
    if (this.issueTypeIds == null) {
      this.issueTypeIds = new ArrayList<>();
    }
    this.issueTypeIds.add(issueTypeIdsItem);
    return this;
  }

  /**
   * The list of issue type IDs. Must contain unique values not longer than 255 characters and not be empty. Maximum of 100 IDs.
   * @return issueTypeIds
  */
  @NotNull 
  @Schema(name = "issueTypeIds", description = "The list of issue type IDs. Must contain unique values not longer than 255 characters and not be empty. Maximum of 100 IDs.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    IssueTypeIdsToRemove issueTypeIdsToRemove = (IssueTypeIdsToRemove) o;
    return Objects.equals(this.issueTypeIds, issueTypeIdsToRemove.issueTypeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeIdsToRemove {\n");
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

