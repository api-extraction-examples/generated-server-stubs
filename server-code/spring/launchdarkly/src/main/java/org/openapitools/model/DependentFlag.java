package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.DependentFlagLinks;
import org.openapitools.model.Site;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DependentFlag
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class DependentFlag {

  private DependentFlagLinks links;

  private Site site;

  private String key;

  private String name;

  public DependentFlag links(DependentFlagLinks links) {
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
  public DependentFlagLinks getLinks() {
    return links;
  }

  public void setLinks(DependentFlagLinks links) {
    this.links = links;
  }

  public DependentFlag site(Site site) {
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

  public DependentFlag key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  
  @Schema(name = "key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public DependentFlag name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependentFlag dependentFlag = (DependentFlag) o;
    return Objects.equals(this.links, dependentFlag.links) &&
        Objects.equals(this.site, dependentFlag.site) &&
        Objects.equals(this.key, dependentFlag.key) &&
        Objects.equals(this.name, dependentFlag.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, site, key, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependentFlag {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

