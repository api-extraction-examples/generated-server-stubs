package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Insights about the project.
 */

@Schema(name = "Project_insight", description = "Insights about the project.")
@JsonTypeName("Project_insight")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ProjectInsight {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastIssueUpdateTime;

  private Long totalIssueCount;

  public ProjectInsight lastIssueUpdateTime(OffsetDateTime lastIssueUpdateTime) {
    this.lastIssueUpdateTime = lastIssueUpdateTime;
    return this;
  }

  /**
   * The last issue update time.
   * @return lastIssueUpdateTime
  */
  @Valid 
  @Schema(name = "lastIssueUpdateTime", accessMode = Schema.AccessMode.READ_ONLY, description = "The last issue update time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastIssueUpdateTime")
  public OffsetDateTime getLastIssueUpdateTime() {
    return lastIssueUpdateTime;
  }

  public void setLastIssueUpdateTime(OffsetDateTime lastIssueUpdateTime) {
    this.lastIssueUpdateTime = lastIssueUpdateTime;
  }

  public ProjectInsight totalIssueCount(Long totalIssueCount) {
    this.totalIssueCount = totalIssueCount;
    return this;
  }

  /**
   * Total issue count.
   * @return totalIssueCount
  */
  
  @Schema(name = "totalIssueCount", accessMode = Schema.AccessMode.READ_ONLY, description = "Total issue count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalIssueCount")
  public Long getTotalIssueCount() {
    return totalIssueCount;
  }

  public void setTotalIssueCount(Long totalIssueCount) {
    this.totalIssueCount = totalIssueCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectInsight projectInsight = (ProjectInsight) o;
    return Objects.equals(this.lastIssueUpdateTime, projectInsight.lastIssueUpdateTime) &&
        Objects.equals(this.totalIssueCount, projectInsight.totalIssueCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastIssueUpdateTime, totalIssueCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectInsight {\n");
    sb.append("    lastIssueUpdateTime: ").append(toIndentedString(lastIssueUpdateTime)).append("\n");
    sb.append("    totalIssueCount: ").append(toIndentedString(totalIssueCount)).append("\n");
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

