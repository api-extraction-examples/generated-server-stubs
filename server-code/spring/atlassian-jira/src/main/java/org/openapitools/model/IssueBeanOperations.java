package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LinkGroup;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The operations that can be performed on the issue.
 */

@Schema(name = "IssueBean_operations", description = "The operations that can be performed on the issue.")
@JsonTypeName("IssueBean_operations")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueBeanOperations {

  @Valid
  private List<@Valid LinkGroup> linkGroups;

  public IssueBeanOperations linkGroups(List<@Valid LinkGroup> linkGroups) {
    this.linkGroups = linkGroups;
    return this;
  }

  public IssueBeanOperations addLinkGroupsItem(LinkGroup linkGroupsItem) {
    if (this.linkGroups == null) {
      this.linkGroups = new ArrayList<>();
    }
    this.linkGroups.add(linkGroupsItem);
    return this;
  }

  /**
   * Details of the link groups defining issue operations.
   * @return linkGroups
  */
  @Valid 
  @Schema(name = "linkGroups", accessMode = Schema.AccessMode.READ_ONLY, description = "Details of the link groups defining issue operations.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkGroups")
  public List<@Valid LinkGroup> getLinkGroups() {
    return linkGroups;
  }

  public void setLinkGroups(List<@Valid LinkGroup> linkGroups) {
    this.linkGroups = linkGroups;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueBeanOperations issueBeanOperations = (IssueBeanOperations) o;
    return Objects.equals(this.linkGroups, issueBeanOperations.linkGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueBeanOperations {\n");
    sb.append("    linkGroups: ").append(toIndentedString(linkGroups)).append("\n");
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

