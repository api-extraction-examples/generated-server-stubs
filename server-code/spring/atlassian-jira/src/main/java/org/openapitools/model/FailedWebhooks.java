package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FailedWebhook;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A page of failed webhooks.
 */

@Schema(name = "FailedWebhooks", description = "A page of failed webhooks.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FailedWebhooks {

  private Integer maxResults;

  private URI next;

  @Valid
  private List<@Valid FailedWebhook> values = new ArrayList<>();

  public FailedWebhooks() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FailedWebhooks(Integer maxResults, List<@Valid FailedWebhook> values) {
    this.maxResults = maxResults;
    this.values = values;
  }

  public FailedWebhooks maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * The maximum number of items on the page. If the list of values is shorter than this number, then there are no more pages.
   * @return maxResults
  */
  @NotNull 
  @Schema(name = "maxResults", description = "The maximum number of items on the page. If the list of values is shorter than this number, then there are no more pages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("maxResults")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public FailedWebhooks next(URI next) {
    this.next = next;
    return this;
  }

  /**
   * The URL to the next page of results. Present only if the request returned at least one result.The next page may be empty at the time of receiving the response, but new failed webhooks may appear in time. You can save the URL to the next page and query for new results periodically (for example, every hour).
   * @return next
  */
  @Valid 
  @Schema(name = "next", description = "The URL to the next page of results. Present only if the request returned at least one result.The next page may be empty at the time of receiving the response, but new failed webhooks may appear in time. You can save the URL to the next page and query for new results periodically (for example, every hour).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next")
  public URI getNext() {
    return next;
  }

  public void setNext(URI next) {
    this.next = next;
  }

  public FailedWebhooks values(List<@Valid FailedWebhook> values) {
    this.values = values;
    return this;
  }

  public FailedWebhooks addValuesItem(FailedWebhook valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * The list of webhooks.
   * @return values
  */
  @NotNull @Valid 
  @Schema(name = "values", description = "The list of webhooks.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("values")
  public List<@Valid FailedWebhook> getValues() {
    return values;
  }

  public void setValues(List<@Valid FailedWebhook> values) {
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
    FailedWebhooks failedWebhooks = (FailedWebhooks) o;
    return Objects.equals(this.maxResults, failedWebhooks.maxResults) &&
        Objects.equals(this.next, failedWebhooks.next) &&
        Objects.equals(this.values, failedWebhooks.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, next, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedWebhooks {\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

