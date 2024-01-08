package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeatureFlagStatus;
import org.openapitools.model.FeatureFlagStatusLinks;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FeatureFlagStatuses
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class FeatureFlagStatuses {

  private FeatureFlagStatusLinks links;

  @Valid
  private List<@Valid FeatureFlagStatus> items;

  public FeatureFlagStatuses links(FeatureFlagStatusLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_links")
  public FeatureFlagStatusLinks getLinks() {
    return links;
  }

  public void setLinks(FeatureFlagStatusLinks links) {
    this.links = links;
  }

  public FeatureFlagStatuses items(List<@Valid FeatureFlagStatus> items) {
    this.items = items;
    return this;
  }

  public FeatureFlagStatuses addItemsItem(FeatureFlagStatus itemsItem) {
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
  public List<@Valid FeatureFlagStatus> getItems() {
    return items;
  }

  public void setItems(List<@Valid FeatureFlagStatus> items) {
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
    FeatureFlagStatuses featureFlagStatuses = (FeatureFlagStatuses) o;
    return Objects.equals(this.links, featureFlagStatuses.links) &&
        Objects.equals(this.items, featureFlagStatuses.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagStatuses {\n");
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

