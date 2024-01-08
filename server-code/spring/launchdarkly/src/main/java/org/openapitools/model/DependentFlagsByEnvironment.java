package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DependentFlag;
import org.openapitools.model.DependentFlagsLinks;
import org.openapitools.model.Site;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DependentFlagsByEnvironment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class DependentFlagsByEnvironment {

  private DependentFlagsLinks links;

  private Site site;

  @Valid
  private List<@Valid DependentFlag> items;

  public DependentFlagsByEnvironment links(DependentFlagsLinks links) {
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
  public DependentFlagsLinks getLinks() {
    return links;
  }

  public void setLinks(DependentFlagsLinks links) {
    this.links = links;
  }

  public DependentFlagsByEnvironment site(Site site) {
    this.site = site;
    return this;
  }

  /**
   * Get site
   * @return site
  */
  @Valid 
  @Schema(name = "_site", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_site")
  public Site getSite() {
    return site;
  }

  public void setSite(Site site) {
    this.site = site;
  }

  public DependentFlagsByEnvironment items(List<@Valid DependentFlag> items) {
    this.items = items;
    return this;
  }

  public DependentFlagsByEnvironment addItemsItem(DependentFlag itemsItem) {
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
  public List<@Valid DependentFlag> getItems() {
    return items;
  }

  public void setItems(List<@Valid DependentFlag> items) {
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
    DependentFlagsByEnvironment dependentFlagsByEnvironment = (DependentFlagsByEnvironment) o;
    return Objects.equals(this.links, dependentFlagsByEnvironment.links) &&
        Objects.equals(this.site, dependentFlagsByEnvironment.site) &&
        Objects.equals(this.items, dependentFlagsByEnvironment.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, site, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependentFlagsByEnvironment {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
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

