package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DependentFlagEnvironment;
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
 * MultiEnvironmentDependentFlag
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class MultiEnvironmentDependentFlag {

  private DependentFlagsLinks links;

  private Site site;

  @Valid
  private List<@Valid DependentFlagEnvironment> environments;

  private String key;

  private String name;

  public MultiEnvironmentDependentFlag links(DependentFlagsLinks links) {
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

  public MultiEnvironmentDependentFlag site(Site site) {
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

  public MultiEnvironmentDependentFlag environments(List<@Valid DependentFlagEnvironment> environments) {
    this.environments = environments;
    return this;
  }

  public MultiEnvironmentDependentFlag addEnvironmentsItem(DependentFlagEnvironment environmentsItem) {
    if (this.environments == null) {
      this.environments = new ArrayList<>();
    }
    this.environments.add(environmentsItem);
    return this;
  }

  /**
   * Get environments
   * @return environments
  */
  @Valid 
  @Schema(name = "environments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("environments")
  public List<@Valid DependentFlagEnvironment> getEnvironments() {
    return environments;
  }

  public void setEnvironments(List<@Valid DependentFlagEnvironment> environments) {
    this.environments = environments;
  }

  public MultiEnvironmentDependentFlag key(String key) {
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

  public MultiEnvironmentDependentFlag name(String name) {
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
    MultiEnvironmentDependentFlag multiEnvironmentDependentFlag = (MultiEnvironmentDependentFlag) o;
    return Objects.equals(this.links, multiEnvironmentDependentFlag.links) &&
        Objects.equals(this.site, multiEnvironmentDependentFlag.site) &&
        Objects.equals(this.environments, multiEnvironmentDependentFlag.environments) &&
        Objects.equals(this.key, multiEnvironmentDependentFlag.key) &&
        Objects.equals(this.name, multiEnvironmentDependentFlag.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, site, environments, key, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiEnvironmentDependentFlag {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
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

