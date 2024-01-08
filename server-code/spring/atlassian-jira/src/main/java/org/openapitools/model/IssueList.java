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
 * A list of issue IDs.
 */

@Schema(name = "IssueList", description = "A list of issue IDs.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueList {

  @Valid
  private List<String> issueIds = new ArrayList<>();

  public IssueList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueList(List<String> issueIds) {
    this.issueIds = issueIds;
  }

  public IssueList issueIds(List<String> issueIds) {
    this.issueIds = issueIds;
    return this;
  }

  public IssueList addIssueIdsItem(String issueIdsItem) {
    if (this.issueIds == null) {
      this.issueIds = new ArrayList<>();
    }
    this.issueIds.add(issueIdsItem);
    return this;
  }

  /**
   * The list of issue IDs.
   * @return issueIds
  */
  @NotNull 
  @Schema(name = "issueIds", description = "The list of issue IDs.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueIds")
  public List<String> getIssueIds() {
    return issueIds;
  }

  public void setIssueIds(List<String> issueIds) {
    this.issueIds = issueIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueList issueList = (IssueList) o;
    return Objects.equals(this.issueIds, issueList.issueIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueList {\n");
    sb.append("    issueIds: ").append(toIndentedString(issueIds)).append("\n");
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

