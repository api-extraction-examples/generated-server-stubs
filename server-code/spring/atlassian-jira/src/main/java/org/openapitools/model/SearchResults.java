package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.IssueBean;
import org.openapitools.model.JsonTypeBean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The result of a JQL search.
 */

@Schema(name = "SearchResults", description = "The result of a JQL search.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SearchResults {

  private String expand;

  @Valid
  private List<@Valid IssueBean> issues;

  private Integer maxResults;

  @Valid
  private Map<String, String> names = new HashMap<>();

  @Valid
  private Map<String, JsonTypeBean> schema = new HashMap<>();

  private Integer startAt;

  private Integer total;

  @Valid
  private List<String> warningMessages;

  public SearchResults expand(String expand) {
    this.expand = expand;
    return this;
  }

  /**
   * Expand options that include additional search result details in the response.
   * @return expand
  */
  
  @Schema(name = "expand", accessMode = Schema.AccessMode.READ_ONLY, description = "Expand options that include additional search result details in the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expand")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public SearchResults issues(List<@Valid IssueBean> issues) {
    this.issues = issues;
    return this;
  }

  public SearchResults addIssuesItem(IssueBean issuesItem) {
    if (this.issues == null) {
      this.issues = new ArrayList<>();
    }
    this.issues.add(issuesItem);
    return this;
  }

  /**
   * The list of issues found by the search.
   * @return issues
  */
  @Valid 
  @Schema(name = "issues", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of issues found by the search.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issues")
  public List<@Valid IssueBean> getIssues() {
    return issues;
  }

  public void setIssues(List<@Valid IssueBean> issues) {
    this.issues = issues;
  }

  public SearchResults maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * The maximum number of results that could be on the page.
   * @return maxResults
  */
  
  @Schema(name = "maxResults", accessMode = Schema.AccessMode.READ_ONLY, description = "The maximum number of results that could be on the page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxResults")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public SearchResults names(Map<String, String> names) {
    this.names = names;
    return this;
  }

  public SearchResults putNamesItem(String key, String namesItem) {
    if (this.names == null) {
      this.names = new HashMap<>();
    }
    this.names.put(key, namesItem);
    return this;
  }

  /**
   * The ID and name of each field in the search results.
   * @return names
  */
  
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID and name of each field in the search results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("names")
  public Map<String, String> getNames() {
    return names;
  }

  public void setNames(Map<String, String> names) {
    this.names = names;
  }

  public SearchResults schema(Map<String, JsonTypeBean> schema) {
    this.schema = schema;
    return this;
  }

  public SearchResults putSchemaItem(String key, JsonTypeBean schemaItem) {
    if (this.schema == null) {
      this.schema = new HashMap<>();
    }
    this.schema.put(key, schemaItem);
    return this;
  }

  /**
   * The schema describing the field types in the search results.
   * @return schema
  */
  @Valid 
  @Schema(name = "schema", accessMode = Schema.AccessMode.READ_ONLY, description = "The schema describing the field types in the search results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schema")
  public Map<String, JsonTypeBean> getSchema() {
    return schema;
  }

  public void setSchema(Map<String, JsonTypeBean> schema) {
    this.schema = schema;
  }

  public SearchResults startAt(Integer startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * The index of the first item returned on the page.
   * @return startAt
  */
  
  @Schema(name = "startAt", accessMode = Schema.AccessMode.READ_ONLY, description = "The index of the first item returned on the page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startAt")
  public Integer getStartAt() {
    return startAt;
  }

  public void setStartAt(Integer startAt) {
    this.startAt = startAt;
  }

  public SearchResults total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * The number of results on the page.
   * @return total
  */
  
  @Schema(name = "total", accessMode = Schema.AccessMode.READ_ONLY, description = "The number of results on the page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public SearchResults warningMessages(List<String> warningMessages) {
    this.warningMessages = warningMessages;
    return this;
  }

  public SearchResults addWarningMessagesItem(String warningMessagesItem) {
    if (this.warningMessages == null) {
      this.warningMessages = new ArrayList<>();
    }
    this.warningMessages.add(warningMessagesItem);
    return this;
  }

  /**
   * Any warnings related to the JQL query.
   * @return warningMessages
  */
  
  @Schema(name = "warningMessages", accessMode = Schema.AccessMode.READ_ONLY, description = "Any warnings related to the JQL query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warningMessages")
  public List<String> getWarningMessages() {
    return warningMessages;
  }

  public void setWarningMessages(List<String> warningMessages) {
    this.warningMessages = warningMessages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResults searchResults = (SearchResults) o;
    return Objects.equals(this.expand, searchResults.expand) &&
        Objects.equals(this.issues, searchResults.issues) &&
        Objects.equals(this.maxResults, searchResults.maxResults) &&
        Objects.equals(this.names, searchResults.names) &&
        Objects.equals(this.schema, searchResults.schema) &&
        Objects.equals(this.startAt, searchResults.startAt) &&
        Objects.equals(this.total, searchResults.total) &&
        Objects.equals(this.warningMessages, searchResults.warningMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, issues, maxResults, names, schema, startAt, total, warningMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResults {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    warningMessages: ").append(toIndentedString(warningMessages)).append("\n");
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

