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
 * Count of issues assigned to a component.
 */

@Schema(name = "ComponentIssuesCount", description = "Count of issues assigned to a component.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ComponentIssuesCount {

  private Long issueCount;

  private URI self;

  public ComponentIssuesCount issueCount(Long issueCount) {
    this.issueCount = issueCount;
    return this;
  }

  /**
   * The count of issues assigned to a component.
   * @return issueCount
  */
  
  @Schema(name = "issueCount", accessMode = Schema.AccessMode.READ_ONLY, description = "The count of issues assigned to a component.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueCount")
  public Long getIssueCount() {
    return issueCount;
  }

  public void setIssueCount(Long issueCount) {
    this.issueCount = issueCount;
  }

  public ComponentIssuesCount self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL for this count of issues for a component.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL for this count of issues for a component.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ComponentIssuesCount componentIssuesCount = (ComponentIssuesCount) o;
    return Objects.equals(this.issueCount, componentIssuesCount.issueCount) &&
        Objects.equals(this.self, componentIssuesCount.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueCount, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentIssuesCount {\n");
    sb.append("    issueCount: ").append(toIndentedString(issueCount)).append("\n");
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

