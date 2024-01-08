package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Worklog;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * Paginated list of worklog details
 */

@Schema(name = "PageOfWorklogs", description = "Paginated list of worklog details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class PageOfWorklogs {

  private Integer maxResults;

  private Integer startAt;

  private Integer total;

  @Valid
  private List<@Valid Worklog> worklogs;

  public PageOfWorklogs maxResults(Integer maxResults) {
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

  public PageOfWorklogs startAt(Integer startAt) {
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

  public PageOfWorklogs total(Integer total) {
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

  public PageOfWorklogs worklogs(List<@Valid Worklog> worklogs) {
    this.worklogs = worklogs;
    return this;
  }

  public PageOfWorklogs addWorklogsItem(Worklog worklogsItem) {
    if (this.worklogs == null) {
      this.worklogs = new ArrayList<>();
    }
    this.worklogs.add(worklogsItem);
    return this;
  }

  /**
   * List of worklogs.
   * @return worklogs
  */
  @Valid 
  @Schema(name = "worklogs", accessMode = Schema.AccessMode.READ_ONLY, description = "List of worklogs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("worklogs")
  public List<@Valid Worklog> getWorklogs() {
    return worklogs;
  }

  public void setWorklogs(List<@Valid Worklog> worklogs) {
    this.worklogs = worklogs;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public PageOfWorklogs putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageOfWorklogs pageOfWorklogs = (PageOfWorklogs) o;
    return Objects.equals(this.maxResults, pageOfWorklogs.maxResults) &&
        Objects.equals(this.startAt, pageOfWorklogs.startAt) &&
        Objects.equals(this.total, pageOfWorklogs.total) &&
        Objects.equals(this.worklogs, pageOfWorklogs.worklogs) &&
    Objects.equals(this.additionalProperties, pageOfWorklogs.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, startAt, total, worklogs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOfWorklogs {\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    worklogs: ").append(toIndentedString(worklogs)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

