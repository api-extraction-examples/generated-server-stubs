package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FoundGroup;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The list of groups found in a search, including header text (Showing X of Y matching groups) and total of matched groups.
 */

@Schema(name = "FoundGroups", description = "The list of groups found in a search, including header text (Showing X of Y matching groups) and total of matched groups.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FoundGroups {

  @Valid
  private List<@Valid FoundGroup> groups;

  private String header;

  private Integer total;

  public FoundGroups groups(List<@Valid FoundGroup> groups) {
    this.groups = groups;
    return this;
  }

  public FoundGroups addGroupsItem(FoundGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
  */
  @Valid 
  @Schema(name = "groups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groups")
  public List<@Valid FoundGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<@Valid FoundGroup> groups) {
    this.groups = groups;
  }

  public FoundGroups header(String header) {
    this.header = header;
    return this;
  }

  /**
   * Header text indicating the number of groups in the response and the total number of groups found in the search.
   * @return header
  */
  
  @Schema(name = "header", description = "Header text indicating the number of groups in the response and the total number of groups found in the search.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("header")
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public FoundGroups total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * The total number of groups found in the search.
   * @return total
  */
  
  @Schema(name = "total", description = "The total number of groups found in the search.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoundGroups foundGroups = (FoundGroups) o;
    return Objects.equals(this.groups, foundGroups.groups) &&
        Objects.equals(this.header, foundGroups.header) &&
        Objects.equals(this.total, foundGroups.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, header, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FoundGroups {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

