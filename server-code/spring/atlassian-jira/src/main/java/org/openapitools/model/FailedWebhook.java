package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a failed webhook.
 */

@Schema(name = "FailedWebhook", description = "Details about a failed webhook.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FailedWebhook {

  private String body;

  private Long failureTime;

  private String id;

  private String url;

  public FailedWebhook() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FailedWebhook(Long failureTime, String id, String url) {
    this.failureTime = failureTime;
    this.id = id;
    this.url = url;
  }

  public FailedWebhook body(String body) {
    this.body = body;
    return this;
  }

  /**
   * The webhook body.
   * @return body
  */
  
  @Schema(name = "body", description = "The webhook body.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("body")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public FailedWebhook failureTime(Long failureTime) {
    this.failureTime = failureTime;
    return this;
  }

  /**
   * The time the webhook was added to the list of failed webhooks (that is, the time of the last failed retry).
   * @return failureTime
  */
  @NotNull 
  @Schema(name = "failureTime", description = "The time the webhook was added to the list of failed webhooks (that is, the time of the last failed retry).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("failureTime")
  public Long getFailureTime() {
    return failureTime;
  }

  public void setFailureTime(Long failureTime) {
    this.failureTime = failureTime;
  }

  public FailedWebhook id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The webhook ID, as sent in the `X-Atlassian-Webhook-Identifier` header with the webhook.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The webhook ID, as sent in the `X-Atlassian-Webhook-Identifier` header with the webhook.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FailedWebhook url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The original webhook destination.
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "The original webhook destination.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailedWebhook failedWebhook = (FailedWebhook) o;
    return Objects.equals(this.body, failedWebhook.body) &&
        Objects.equals(this.failureTime, failedWebhook.failureTime) &&
        Objects.equals(this.id, failedWebhook.id) &&
        Objects.equals(this.url, failedWebhook.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, failureTime, id, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedWebhook {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    failureTime: ").append(toIndentedString(failureTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

