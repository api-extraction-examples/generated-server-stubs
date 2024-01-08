package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A container for the watch status of a list of issues.
 */

@Schema(name = "BulkIssueIsWatching", description = "A container for the watch status of a list of issues.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class BulkIssueIsWatching {

  @Valid
  private Map<String, Boolean> issuesIsWatching = new HashMap<>();

  public BulkIssueIsWatching issuesIsWatching(Map<String, Boolean> issuesIsWatching) {
    this.issuesIsWatching = issuesIsWatching;
    return this;
  }

  public BulkIssueIsWatching putIssuesIsWatchingItem(String key, Boolean issuesIsWatchingItem) {
    if (this.issuesIsWatching == null) {
      this.issuesIsWatching = new HashMap<>();
    }
    this.issuesIsWatching.put(key, issuesIsWatchingItem);
    return this;
  }

  /**
   * The map of issue ID to boolean watch status.
   * @return issuesIsWatching
  */
  
  @Schema(name = "issuesIsWatching", accessMode = Schema.AccessMode.READ_ONLY, description = "The map of issue ID to boolean watch status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuesIsWatching")
  public Map<String, Boolean> getIssuesIsWatching() {
    return issuesIsWatching;
  }

  public void setIssuesIsWatching(Map<String, Boolean> issuesIsWatching) {
    this.issuesIsWatching = issuesIsWatching;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkIssueIsWatching bulkIssueIsWatching = (BulkIssueIsWatching) o;
    return Objects.equals(this.issuesIsWatching, bulkIssueIsWatching.issuesIsWatching);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuesIsWatching);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkIssueIsWatching {\n");
    sb.append("    issuesIsWatching: ").append(toIndentedString(issuesIsWatching)).append("\n");
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

