package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IssueTypeSchemeProjects;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A page of items.
 */

@Schema(name = "PageBeanIssueTypeSchemeProjects", description = "A page of items.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class PageBeanIssueTypeSchemeProjects {

  private Boolean isLast;

  private Integer maxResults;

  private URI nextPage;

  private URI self;

  private Long startAt;

  private Long total;

  @Valid
  private List<@Valid IssueTypeSchemeProjects> values;

  public PageBeanIssueTypeSchemeProjects isLast(Boolean isLast) {
    this.isLast = isLast;
    return this;
  }

  /**
   * Whether this is the last page.
   * @return isLast
  */
  
  @Schema(name = "isLast", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether this is the last page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isLast")
  public Boolean getIsLast() {
    return isLast;
  }

  public void setIsLast(Boolean isLast) {
    this.isLast = isLast;
  }

  public PageBeanIssueTypeSchemeProjects maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * The maximum number of items that could be returned.
   * @return maxResults
  */
  
  @Schema(name = "maxResults", accessMode = Schema.AccessMode.READ_ONLY, description = "The maximum number of items that could be returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxResults")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public PageBeanIssueTypeSchemeProjects nextPage(URI nextPage) {
    this.nextPage = nextPage;
    return this;
  }

  /**
   * If there is another page of results, the URL of the next page.
   * @return nextPage
  */
  @Valid 
  @Schema(name = "nextPage", accessMode = Schema.AccessMode.READ_ONLY, description = "If there is another page of results, the URL of the next page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nextPage")
  public URI getNextPage() {
    return nextPage;
  }

  public void setNextPage(URI nextPage) {
    this.nextPage = nextPage;
  }

  public PageBeanIssueTypeSchemeProjects self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the page.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public PageBeanIssueTypeSchemeProjects startAt(Long startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * The index of the first item returned.
   * @return startAt
  */
  
  @Schema(name = "startAt", accessMode = Schema.AccessMode.READ_ONLY, description = "The index of the first item returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startAt")
  public Long getStartAt() {
    return startAt;
  }

  public void setStartAt(Long startAt) {
    this.startAt = startAt;
  }

  public PageBeanIssueTypeSchemeProjects total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * The number of items returned.
   * @return total
  */
  
  @Schema(name = "total", accessMode = Schema.AccessMode.READ_ONLY, description = "The number of items returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public PageBeanIssueTypeSchemeProjects values(List<@Valid IssueTypeSchemeProjects> values) {
    this.values = values;
    return this;
  }

  public PageBeanIssueTypeSchemeProjects addValuesItem(IssueTypeSchemeProjects valuesItem) {
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
  @Schema(name = "values", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("values")
  public List<@Valid IssueTypeSchemeProjects> getValues() {
    return values;
  }

  public void setValues(List<@Valid IssueTypeSchemeProjects> values) {
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
    PageBeanIssueTypeSchemeProjects pageBeanIssueTypeSchemeProjects = (PageBeanIssueTypeSchemeProjects) o;
    return Objects.equals(this.isLast, pageBeanIssueTypeSchemeProjects.isLast) &&
        Objects.equals(this.maxResults, pageBeanIssueTypeSchemeProjects.maxResults) &&
        Objects.equals(this.nextPage, pageBeanIssueTypeSchemeProjects.nextPage) &&
        Objects.equals(this.self, pageBeanIssueTypeSchemeProjects.self) &&
        Objects.equals(this.startAt, pageBeanIssueTypeSchemeProjects.startAt) &&
        Objects.equals(this.total, pageBeanIssueTypeSchemeProjects.total) &&
        Objects.equals(this.values, pageBeanIssueTypeSchemeProjects.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLast, maxResults, nextPage, self, startAt, total, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageBeanIssueTypeSchemeProjects {\n");
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

