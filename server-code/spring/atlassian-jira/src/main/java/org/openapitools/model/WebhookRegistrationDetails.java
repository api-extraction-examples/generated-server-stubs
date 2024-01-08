package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WebhookDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of webhooks to register.
 */

@Schema(name = "WebhookRegistrationDetails", description = "Details of webhooks to register.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WebhookRegistrationDetails {

  private String url;

  @Valid
  private List<@Valid WebhookDetails> webhooks = new ArrayList<>();

  public WebhookRegistrationDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WebhookRegistrationDetails(String url, List<@Valid WebhookDetails> webhooks) {
    this.url = url;
    this.webhooks = webhooks;
  }

  public WebhookRegistrationDetails url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL that specifies where to send the webhooks. This URL must use the same base URL as the Connect app. Only a single URL per app is allowed to be registered.
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "The URL that specifies where to send the webhooks. This URL must use the same base URL as the Connect app. Only a single URL per app is allowed to be registered.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public WebhookRegistrationDetails webhooks(List<@Valid WebhookDetails> webhooks) {
    this.webhooks = webhooks;
    return this;
  }

  public WebhookRegistrationDetails addWebhooksItem(WebhookDetails webhooksItem) {
    if (this.webhooks == null) {
      this.webhooks = new ArrayList<>();
    }
    this.webhooks.add(webhooksItem);
    return this;
  }

  /**
   * A list of webhooks.
   * @return webhooks
  */
  @NotNull @Valid 
  @Schema(name = "webhooks", description = "A list of webhooks.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("webhooks")
  public List<@Valid WebhookDetails> getWebhooks() {
    return webhooks;
  }

  public void setWebhooks(List<@Valid WebhookDetails> webhooks) {
    this.webhooks = webhooks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookRegistrationDetails webhookRegistrationDetails = (WebhookRegistrationDetails) o;
    return Objects.equals(this.url, webhookRegistrationDetails.url) &&
        Objects.equals(this.webhooks, webhookRegistrationDetails.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, webhooks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookRegistrationDetails {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
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

