package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * List of issues and JQL queries.
 */

@Schema(name = "IssuesAndJQLQueries", description = "List of issues and JQL queries.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssuesAndJQLQueries {

  @Valid
  private Set<Long> issueIds = new LinkedHashSet<>();

  @Valid
  private List<String> jqls = new ArrayList<>();

  public IssuesAndJQLQueries() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssuesAndJQLQueries(Set<Long> issueIds, List<String> jqls) {
    this.issueIds = issueIds;
    this.jqls = jqls;
  }

  public IssuesAndJQLQueries issueIds(Set<Long> issueIds) {
    this.issueIds = issueIds;
    return this;
  }

  public IssuesAndJQLQueries addIssueIdsItem(Long issueIdsItem) {
    if (this.issueIds == null) {
      this.issueIds = new LinkedHashSet<>();
    }
    this.issueIds.add(issueIdsItem);
    return this;
  }

  /**
   * A list of issue IDs.
   * @return issueIds
  */
  @NotNull 
  @Schema(name = "issueIds", description = "A list of issue IDs.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueIds")
  public Set<Long> getIssueIds() {
    return issueIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setIssueIds(Set<Long> issueIds) {
    this.issueIds = issueIds;
  }

  public IssuesAndJQLQueries jqls(List<String> jqls) {
    this.jqls = jqls;
    return this;
  }

  public IssuesAndJQLQueries addJqlsItem(String jqlsItem) {
    if (this.jqls == null) {
      this.jqls = new ArrayList<>();
    }
    this.jqls.add(jqlsItem);
    return this;
  }

  /**
   * A list of JQL queries.
   * @return jqls
  */
  @NotNull 
  @Schema(name = "jqls", description = "A list of JQL queries.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("jqls")
  public List<String> getJqls() {
    return jqls;
  }

  public void setJqls(List<String> jqls) {
    this.jqls = jqls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuesAndJQLQueries issuesAndJQLQueries = (IssuesAndJQLQueries) o;
    return Objects.equals(this.issueIds, issuesAndJQLQueries.issueIds) &&
        Objects.equals(this.jqls, issuesAndJQLQueries.jqls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueIds, jqls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuesAndJQLQueries {\n");
    sb.append("    issueIds: ").append(toIndentedString(issueIds)).append("\n");
    sb.append("    jqls: ").append(toIndentedString(jqls)).append("\n");
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

