package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Count of a version&#39;s unresolved issues.
 */

@Schema(name = "VersionUnresolvedIssuesCount", description = "Count of a version's unresolved issues.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class VersionUnresolvedIssuesCount {

  private Long issuesCount;

  private Long issuesUnresolvedCount;

  private URI self;

  public VersionUnresolvedIssuesCount issuesCount(Long issuesCount) {
    this.issuesCount = issuesCount;
    return this;
  }

  /**
   * Count of issues.
   * @return issuesCount
  */
  
  @Schema(name = "issuesCount", accessMode = Schema.AccessMode.READ_ONLY, description = "Count of issues.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuesCount")
  public Long getIssuesCount() {
    return issuesCount;
  }

  public void setIssuesCount(Long issuesCount) {
    this.issuesCount = issuesCount;
  }

  public VersionUnresolvedIssuesCount issuesUnresolvedCount(Long issuesUnresolvedCount) {
    this.issuesUnresolvedCount = issuesUnresolvedCount;
    return this;
  }

  /**
   * Count of unresolved issues.
   * @return issuesUnresolvedCount
  */
  
  @Schema(name = "issuesUnresolvedCount", accessMode = Schema.AccessMode.READ_ONLY, description = "Count of unresolved issues.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuesUnresolvedCount")
  public Long getIssuesUnresolvedCount() {
    return issuesUnresolvedCount;
  }

  public void setIssuesUnresolvedCount(Long issuesUnresolvedCount) {
    this.issuesUnresolvedCount = issuesUnresolvedCount;
  }

  public VersionUnresolvedIssuesCount self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of these count details.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of these count details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionUnresolvedIssuesCount versionUnresolvedIssuesCount = (VersionUnresolvedIssuesCount) o;
    return Objects.equals(this.issuesCount, versionUnresolvedIssuesCount.issuesCount) &&
        Objects.equals(this.issuesUnresolvedCount, versionUnresolvedIssuesCount.issuesUnresolvedCount) &&
        Objects.equals(this.self, versionUnresolvedIssuesCount.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuesCount, issuesUnresolvedCount, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionUnresolvedIssuesCount {\n");
    sb.append("    issuesCount: ").append(toIndentedString(issuesCount)).append("\n");
    sb.append("    issuesUnresolvedCount: ").append(toIndentedString(issuesUnresolvedCount)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

