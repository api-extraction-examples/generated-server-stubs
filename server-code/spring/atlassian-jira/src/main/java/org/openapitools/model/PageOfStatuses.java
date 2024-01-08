package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.JiraStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PageOfStatuses
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class PageOfStatuses {

  private Boolean isLast;

  private Integer maxResults;

  private String nextPage;

  private String self;

  private Long startAt;

  private Long total;

  @Valid
  private List<@Valid JiraStatus> values;

  public PageOfStatuses isLast(Boolean isLast) {
    this.isLast = isLast;
    return this;
  }

  /**
   * Whether this is the last page.
   * @return isLast
  */
  
  @Schema(name = "isLast", description = "Whether this is the last page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isLast")
  public Boolean getIsLast() {
    return isLast;
  }

  public void setIsLast(Boolean isLast) {
    this.isLast = isLast;
  }

  public PageOfStatuses maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * The maximum number of items that could be returned.
   * @return maxResults
  */
  
  @Schema(name = "maxResults", description = "The maximum number of items that could be returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxResults")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public PageOfStatuses nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

  /**
   * The URL of the next page of results, if any.
   * @return nextPage
  */
  
  @Schema(name = "nextPage", description = "The URL of the next page of results, if any.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nextPage")
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }

  public PageOfStatuses self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of this page.
   * @return self
  */
  
  @Schema(name = "self", description = "The URL of this page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public PageOfStatuses startAt(Long startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * The index of the first item returned on the page.
   * @return startAt
  */
  
  @Schema(name = "startAt", description = "The index of the first item returned on the page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startAt")
  public Long getStartAt() {
    return startAt;
  }

  public void setStartAt(Long startAt) {
    this.startAt = startAt;
  }

  public PageOfStatuses total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Number of items that satisfy the search.
   * @return total
  */
  
  @Schema(name = "total", description = "Number of items that satisfy the search.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public PageOfStatuses values(List<@Valid JiraStatus> values) {
    this.values = values;
    return this;
  }

  public PageOfStatuses addValuesItem(JiraStatus valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * The list of items.
   * @return values
  */
  @Valid 
  @Schema(name = "values", description = "The list of items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("values")
  public List<@Valid JiraStatus> getValues() {
    return values;
  }

  public void setValues(List<@Valid JiraStatus> values) {
    this.values = values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageOfStatuses pageOfStatuses = (PageOfStatuses) o;
    return Objects.equals(this.isLast, pageOfStatuses.isLast) &&
        Objects.equals(this.maxResults, pageOfStatuses.maxResults) &&
        Objects.equals(this.nextPage, pageOfStatuses.nextPage) &&
        Objects.equals(this.self, pageOfStatuses.self) &&
        Objects.equals(this.startAt, pageOfStatuses.startAt) &&
        Objects.equals(this.total, pageOfStatuses.total) &&
        Objects.equals(this.values, pageOfStatuses.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLast, maxResults, nextPage, self, startAt, total, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOfStatuses {\n");
    sb.append("    isLast: ").append(toIndentedString(isLast)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

