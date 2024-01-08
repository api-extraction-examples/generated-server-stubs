package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Container for a list of webhook IDs.
 */

@Schema(name = "ContainerForWebhookIDs", description = "Container for a list of webhook IDs.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ContainerForWebhookIDs {

  @Valid
  private List<Long> webhookIds = new ArrayList<>();

  public ContainerForWebhookIDs() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContainerForWebhookIDs(List<Long> webhookIds) {
    this.webhookIds = webhookIds;
  }

  public ContainerForWebhookIDs webhookIds(List<Long> webhookIds) {
    this.webhookIds = webhookIds;
    return this;
  }

  public ContainerForWebhookIDs addWebhookIdsItem(Long webhookIdsItem) {
    if (this.webhookIds == null) {
      this.webhookIds = new ArrayList<>();
    }
    this.webhookIds.add(webhookIdsItem);
    return this;
  }

  /**
   * A list of webhook IDs.
   * @return webhookIds
  */
  @NotNull 
  @Schema(name = "webhookIds", description = "A list of webhook IDs.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("webhookIds")
  public List<Long> getWebhookIds() {
    return webhookIds;
  }

  public void setWebhookIds(List<Long> webhookIds) {
    this.webhookIds = webhookIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerForWebhookIDs containerForWebhookIDs = (ContainerForWebhookIDs) o;
    return Objects.equals(this.webhookIds, containerForWebhookIDs.webhookIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerForWebhookIDs {\n");
    sb.append("    webhookIds: ").append(toIndentedString(webhookIds)).append("\n");
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

