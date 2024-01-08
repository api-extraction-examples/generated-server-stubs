package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.Links;
import org.openapitools.model.UserFlagSetting;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserFlagSettings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class UserFlagSettings {

  private Links links;

  @Valid
  private Map<String, UserFlagSetting> items = new HashMap<>();

  public UserFlagSettings links(Links links) {
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
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public UserFlagSettings items(Map<String, UserFlagSetting> items) {
    this.items = items;
    return this;
  }

  public UserFlagSettings putItemsItem(String key, UserFlagSetting itemsItem) {
    if (this.items == null) {
      this.items = new HashMap<>();
    }
    this.items.put(key, itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @Valid 
  @Schema(name = "items", example = "{\"alternate.page\":{\"_links\":{\"self\":{\"href\":\"/api/v2/users/lacuna/production/Abbie_Braun/flags/alternate.page\",\"type\":\"application/json\"}},\"_value\":\"false,\"},\"sort.order\":{\"_links\":{\"_value\":true,\"self\":{\"href\":\"/api/v2/users/lacuna/production/Abbie_Braun/flags/sort.order\",\"type\":\"application/json\"}}}}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public Map<String, UserFlagSetting> getItems() {
    return items;
  }

  public void setItems(Map<String, UserFlagSetting> items) {
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
    UserFlagSettings userFlagSettings = (UserFlagSettings) o;
    return Objects.equals(this.links, userFlagSettings.links) &&
        Objects.equals(this.items, userFlagSettings.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFlagSettings {\n");
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

