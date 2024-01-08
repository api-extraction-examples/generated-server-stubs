package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WebhookRequestFiltersInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * WebhookRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class WebhookRequest {

  @Valid
  private List<@Valid WebhookRequestFiltersInner> filters;

  private String resource;

  private URI target;

  public WebhookRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WebhookRequest(String resource, URI target) {
    this.resource = resource;
    this.target = target;
  }

  public WebhookRequest filters(List<@Valid WebhookRequestFiltersInner> filters) {
    this.filters = filters;
    return this;
  }

  public WebhookRequest addFiltersItem(WebhookRequestFiltersInner filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * An array of WebhookFilter objects to specify a whitelist of filters to apply to events from this webhook. If a webhook event passes any of the filters the event will be delivered; otherwise no event will be sent to the receiving server.
   * @return filters
  */
  @Valid 
  @Schema(name = "filters", description = "An array of WebhookFilter objects to specify a whitelist of filters to apply to events from this webhook. If a webhook event passes any of the filters the event will be delivered; otherwise no event will be sent to the receiving server.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filters")
  public List<@Valid WebhookRequestFiltersInner> getFilters() {
    return filters;
  }

  public void setFilters(List<@Valid WebhookRequestFiltersInner> filters) {
    this.filters = filters;
  }

  public WebhookRequest resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * A resource ID to subscribe to. Many Asana resources are valid to create webhooks on, but higher-level resources require filters.
   * @return resource
  */
  @NotNull 
  @Schema(name = "resource", example = "12345", description = "A resource ID to subscribe to. Many Asana resources are valid to create webhooks on, but higher-level resources require filters.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resource")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public WebhookRequest target(URI target) {
    this.target = target;
    return this;
  }

  /**
   * The URL to receive the HTTP POST. The full URL will be used to deliver events from this webhook (including parameters) which allows encoding of application-specific state when the webhook is created.
   * @return target
  */
  @NotNull @Valid 
  @Schema(name = "target", example = "https://example.com/receive-webhook/7654?app_specific_param=app_specific_value", description = "The URL to receive the HTTP POST. The full URL will be used to deliver events from this webhook (including parameters) which allows encoding of application-specific state when the webhook is created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("target")
  public URI getTarget() {
    return target;
  }

  public void setTarget(URI target) {
    this.target = target;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookRequest webhookRequest = (WebhookRequest) o;
    return Objects.equals(this.filters, webhookRequest.filters) &&
        Objects.equals(this.resource, webhookRequest.resource) &&
        Objects.equals(this.target, webhookRequest.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, resource, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookRequest {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

