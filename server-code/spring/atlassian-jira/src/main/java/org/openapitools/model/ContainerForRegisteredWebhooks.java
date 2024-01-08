package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RegisteredWebhook;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Container for a list of registered webhooks. Webhook details are returned in the same order as the request.
 */

@Schema(name = "ContainerForRegisteredWebhooks", description = "Container for a list of registered webhooks. Webhook details are returned in the same order as the request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ContainerForRegisteredWebhooks {

  @Valid
  private List<@Valid RegisteredWebhook> webhookRegistrationResult;

  public ContainerForRegisteredWebhooks webhookRegistrationResult(List<@Valid RegisteredWebhook> webhookRegistrationResult) {
    this.webhookRegistrationResult = webhookRegistrationResult;
    return this;
  }

  public ContainerForRegisteredWebhooks addWebhookRegistrationResultItem(RegisteredWebhook webhookRegistrationResultItem) {
    if (this.webhookRegistrationResult == null) {
      this.webhookRegistrationResult = new ArrayList<>();
    }
    this.webhookRegistrationResult.add(webhookRegistrationResultItem);
    return this;
  }

  /**
   * A list of registered webhooks.
   * @return webhookRegistrationResult
  */
  @Valid 
  @Schema(name = "webhookRegistrationResult", description = "A list of registered webhooks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("webhookRegistrationResult")
  public List<@Valid RegisteredWebhook> getWebhookRegistrationResult() {
    return webhookRegistrationResult;
  }

  public void setWebhookRegistrationResult(List<@Valid RegisteredWebhook> webhookRegistrationResult) {
    this.webhookRegistrationResult = webhookRegistrationResult;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerForRegisteredWebhooks containerForRegisteredWebhooks = (ContainerForRegisteredWebhooks) o;
    return Objects.equals(this.webhookRegistrationResult, containerForRegisteredWebhooks.webhookRegistrationResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookRegistrationResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerForRegisteredWebhooks {\n");
    sb.append("    webhookRegistrationResult: ").append(toIndentedString(webhookRegistrationResult)).append("\n");
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

