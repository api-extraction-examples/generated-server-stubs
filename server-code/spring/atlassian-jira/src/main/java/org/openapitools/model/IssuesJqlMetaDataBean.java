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
 * The description of the page of issues loaded by the provided JQL query.
 */

@Schema(name = "IssuesJqlMetaDataBean", description = "The description of the page of issues loaded by the provided JQL query.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssuesJqlMetaDataBean {

  private Integer count;

  private Integer maxResults;

  private Long startAt;

  private Long totalCount;

  @Valid
  private List<String> validationWarnings;

  public IssuesJqlMetaDataBean() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssuesJqlMetaDataBean(Integer count, Integer maxResults, Long startAt, Long totalCount) {
    this.count = count;
    this.maxResults = maxResults;
    this.startAt = startAt;
    this.totalCount = totalCount;
  }

  public IssuesJqlMetaDataBean count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The number of issues that were loaded in this evaluation.
   * @return count
  */
  @NotNull 
  @Schema(name = "count", description = "The number of issues that were loaded in this evaluation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public IssuesJqlMetaDataBean maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * The maximum number of issues that could be loaded in this evaluation.
   * @return maxResults
  */
  @NotNull 
  @Schema(name = "maxResults", description = "The maximum number of issues that could be loaded in this evaluation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("maxResults")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public IssuesJqlMetaDataBean startAt(Long startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * The index of the first issue.
   * @return startAt
  */
  @NotNull 
  @Schema(name = "startAt", description = "The index of the first issue.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startAt")
  public Long getStartAt() {
    return startAt;
  }

  public void setStartAt(Long startAt) {
    this.startAt = startAt;
  }

  public IssuesJqlMetaDataBean totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * The total number of issues the JQL returned.
   * @return totalCount
  */
  @NotNull 
  @Schema(name = "totalCount", description = "The total number of issues the JQL returned.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalCount")
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public IssuesJqlMetaDataBean validationWarnings(List<String> validationWarnings) {
    this.validationWarnings = validationWarnings;
    return this;
  }

  public IssuesJqlMetaDataBean addValidationWarningsItem(String validationWarningsItem) {
    if (this.validationWarnings == null) {
      this.validationWarnings = new ArrayList<>();
    }
    this.validationWarnings.add(validationWarningsItem);
    return this;
  }

  /**
   * Any warnings related to the JQL query. Present only if the validation mode was set to `warn`.
   * @return validationWarnings
  */
  
  @Schema(name = "validationWarnings", description = "Any warnings related to the JQL query. Present only if the validation mode was set to `warn`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validationWarnings")
  public List<String> getValidationWarnings() {
    return validationWarnings;
  }

  public void setValidationWarnings(List<String> validationWarnings) {
    this.validationWarnings = validationWarnings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuesJqlMetaDataBean issuesJqlMetaDataBean = (IssuesJqlMetaDataBean) o;
    return Objects.equals(this.count, issuesJqlMetaDataBean.count) &&
        Objects.equals(this.maxResults, issuesJqlMetaDataBean.maxResults) &&
        Objects.equals(this.startAt, issuesJqlMetaDataBean.startAt) &&
        Objects.equals(this.totalCount, issuesJqlMetaDataBean.totalCount) &&
        Objects.equals(this.validationWarnings, issuesJqlMetaDataBean.validationWarnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, maxResults, startAt, totalCount, validationWarnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuesJqlMetaDataBean {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    validationWarnings: ").append(toIndentedString(validationWarnings)).append("\n");
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

