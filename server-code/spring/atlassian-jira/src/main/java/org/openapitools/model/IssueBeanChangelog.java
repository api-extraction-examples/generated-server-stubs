package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Changelog;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of changelogs associated with the issue.
 */

@Schema(name = "IssueBean_changelog", description = "Details of changelogs associated with the issue.")
@JsonTypeName("IssueBean_changelog")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueBeanChangelog {

  @Valid
  private List<@Valid Changelog> histories;

  private Integer maxResults;

  private Integer startAt;

  private Integer total;

  public IssueBeanChangelog histories(List<@Valid Changelog> histories) {
    this.histories = histories;
    return this;
  }

  public IssueBeanChangelog addHistoriesItem(Changelog historiesItem) {
    if (this.histories == null) {
      this.histories = new ArrayList<>();
    }
    this.histories.add(historiesItem);
    return this;
  }

  /**
   * The list of changelogs.
   * @return histories
  */
  @Valid 
  @Schema(name = "histories", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of changelogs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("histories")
  public List<@Valid Changelog> getHistories() {
    return histories;
  }

  public void setHistories(List<@Valid Changelog> histories) {
    this.histories = histories;
  }

  public IssueBeanChangelog maxResults(Integer maxResults) {
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

  public IssueBeanChangelog startAt(Integer startAt) {
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

  public IssueBeanChangelog total(Integer total) {
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
    IssueBeanChangelog issueBeanChangelog = (IssueBeanChangelog) o;
    return Objects.equals(this.histories, issueBeanChangelog.histories) &&
        Objects.equals(this.maxResults, issueBeanChangelog.maxResults) &&
        Objects.equals(this.startAt, issueBeanChangelog.startAt) &&
        Objects.equals(this.total, issueBeanChangelog.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(histories, maxResults, startAt, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueBeanChangelog {\n");
    sb.append("    histories: ").append(toIndentedString(histories)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
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

