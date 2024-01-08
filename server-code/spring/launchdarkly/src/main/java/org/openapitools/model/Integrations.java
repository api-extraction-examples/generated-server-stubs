package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IntegrationSubscription;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Integrations
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class Integrations {

  private Object links;

  @Valid
  private List<@Valid IntegrationSubscription> items;

  public Integrations links(Object links) {
    this.links = links;
    return this;
  }

  /**
   * A mapping of integration types to their respective API endpoints.
   * @return links
  */
  
  @Schema(name = "_links", example = "{\"appdynamics\":{\"href\":\"/api/v2/integrations/appdynamics\",\"type\":\"application/json\"},\"splunk\":{\"href\":\"/api/v2/integrations/splunk\",\"type\":\"application/json\"}}", description = "A mapping of integration types to their respective API endpoints.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_links")
  public Object getLinks() {
    return links;
  }

  public void setLinks(Object links) {
    this.links = links;
  }

  public Integrations items(List<@Valid IntegrationSubscription> items) {
    this.items = items;
    return this;
  }

  public Integrations addItemsItem(IntegrationSubscription itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid IntegrationSubscription> getItems() {
    return items;
  }

  public void setItems(List<@Valid IntegrationSubscription> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Integrations integrations = (Integrations) o;
    return Objects.equals(this.links, integrations.links) &&
        Objects.equals(this.items, integrations.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Integrations {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

