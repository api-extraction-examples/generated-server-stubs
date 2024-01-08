package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Dashboard;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A page containing dashboard details.
 */

@Schema(name = "PageOfDashboards", description = "A page containing dashboard details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class PageOfDashboards {

  @Valid
  private List<@Valid Dashboard> dashboards;

  private Integer maxResults;

  private String next;

  private String prev;

  private Integer startAt;

  private Integer total;

  public PageOfDashboards dashboards(List<@Valid Dashboard> dashboards) {
    this.dashboards = dashboards;
    return this;
  }

  public PageOfDashboards addDashboardsItem(Dashboard dashboardsItem) {
    if (this.dashboards == null) {
      this.dashboards = new ArrayList<>();
    }
    this.dashboards.add(dashboardsItem);
    return this;
  }

  /**
   * List of dashboards.
   * @return dashboards
  */
  @Valid 
  @Schema(name = "dashboards", accessMode = Schema.AccessMode.READ_ONLY, description = "List of dashboards.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dashboards")
  public List<@Valid Dashboard> getDashboards() {
    return dashboards;
  }

  public void setDashboards(List<@Valid Dashboard> dashboards) {
    this.dashboards = dashboards;
  }

  public PageOfDashboards maxResults(Integer maxResults) {
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

  public PageOfDashboards next(String next) {
    this.next = next;
    return this;
  }

  /**
   * The URL of the next page of results, if any.
   * @return next
  */
  
  @Schema(name = "next", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the next page of results, if any.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public PageOfDashboards prev(String prev) {
    this.prev = prev;
    return this;
  }

  /**
   * The URL of the previous page of results, if any.
   * @return prev
  */
  
  @Schema(name = "prev", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the previous page of results, if any.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prev")
  public String getPrev() {
    return prev;
  }

  public void setPrev(String prev) {
    this.prev = prev;
  }

  public PageOfDashboards startAt(Integer startAt) {
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

  public PageOfDashboards total(Integer total) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageOfDashboards pageOfDashboards = (PageOfDashboards) o;
    return Objects.equals(this.dashboards, pageOfDashboards.dashboards) &&
        Objects.equals(this.maxResults, pageOfDashboards.maxResults) &&
        Objects.equals(this.next, pageOfDashboards.next) &&
        Objects.equals(this.prev, pageOfDashboards.prev) &&
        Objects.equals(this.startAt, pageOfDashboards.startAt) &&
        Objects.equals(this.total, pageOfDashboards.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboards, maxResults, next, prev, startAt, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOfDashboards {\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
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

