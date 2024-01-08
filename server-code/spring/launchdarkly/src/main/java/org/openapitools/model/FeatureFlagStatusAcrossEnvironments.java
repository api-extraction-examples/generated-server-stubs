package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.FeatureFlagStatusForQueriedEnvironment;
import org.openapitools.model.FeatureFlagStatusLinks;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FeatureFlagStatusAcrossEnvironments
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class FeatureFlagStatusAcrossEnvironments {

  private FeatureFlagStatusLinks links;

  @Valid
  private Map<String, FeatureFlagStatusForQueriedEnvironment> environments = new HashMap<>();

  private String key;

  public FeatureFlagStatusAcrossEnvironments links(FeatureFlagStatusLinks links) {
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

  public FeatureFlagStatusAcrossEnvironments environments(Map<String, FeatureFlagStatusForQueriedEnvironment> environments) {
    this.environments = environments;
    return this;
  }

  public FeatureFlagStatusAcrossEnvironments putEnvironmentsItem(String key, FeatureFlagStatusForQueriedEnvironment environmentsItem) {
    if (this.environments == null) {
      this.environments = new HashMap<>();
    }
    this.environments.put(key, environmentsItem);
    return this;
  }

  /**
   * Get environments
   * @return environments
  */
  @Valid 
  @Schema(name = "environments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("environments")
  public Map<String, FeatureFlagStatusForQueriedEnvironment> getEnvironments() {
    return environments;
  }

  public void setEnvironments(Map<String, FeatureFlagStatusForQueriedEnvironment> environments) {
    this.environments = environments;
  }

  public FeatureFlagStatusAcrossEnvironments key(String key) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagStatusAcrossEnvironments featureFlagStatusAcrossEnvironments = (FeatureFlagStatusAcrossEnvironments) o;
    return Objects.equals(this.links, featureFlagStatusAcrossEnvironments.links) &&
        Objects.equals(this.environments, featureFlagStatusAcrossEnvironments.environments) &&
        Objects.equals(this.key, featureFlagStatusAcrossEnvironments.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, environments, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagStatusAcrossEnvironments {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

