package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Link;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UsageLinks
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class UsageLinks {

  private Link parent;

  private Link self;

  @Valid
  private List<@Valid Link> subseries;

  public UsageLinks parent(Link parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
  */
  @Valid 
  @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent")
  public Link getParent() {
    return parent;
  }

  public void setParent(Link parent) {
    this.parent = parent;
  }

  public UsageLinks self(Link self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  */
  @Valid 
  @Schema(name = "self", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public Link getSelf() {
    return self;
  }

  public void setSelf(Link self) {
    this.self = self;
  }

  public UsageLinks subseries(List<@Valid Link> subseries) {
    this.subseries = subseries;
    return this;
  }

  public UsageLinks addSubseriesItem(Link subseriesItem) {
    if (this.subseries == null) {
      this.subseries = new ArrayList<>();
    }
    this.subseries.add(subseriesItem);
    return this;
  }

  /**
   * The following links that are in the response.
   * @return subseries
  */
  @Valid 
  @Schema(name = "subseries", description = "The following links that are in the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subseries")
  public List<@Valid Link> getSubseries() {
    return subseries;
  }

  public void setSubseries(List<@Valid Link> subseries) {
    this.subseries = subseries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageLinks usageLinks = (UsageLinks) o;
    return Objects.equals(this.parent, usageLinks.parent) &&
        Objects.equals(this.self, usageLinks.self) &&
        Objects.equals(this.subseries, usageLinks.subseries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, self, subseries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageLinks {\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    subseries: ").append(toIndentedString(subseries)).append("\n");
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

