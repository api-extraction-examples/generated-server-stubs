package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.FeatureFlagStatusLinks;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FeatureFlagStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class FeatureFlagStatus {

  private FeatureFlagStatusLinks links;

  private Object _default;

  private String lastRequested;

  /**
   * | Name     | Description | | --------:| ----------- | | new      | the feature flag was created within the last 7 days, and has not been requested yet | | active   | the feature flag was requested by your servers or clients within the last 7 days | | inactive | the feature flag was created more than 7 days ago, and hasn't been requested by your servers or clients within the past 7 days | | launched | one variation of the feature flag has been rolled out to all your users for at least 7 days | 
   */
  public enum NameEnum {
    NEW("new"),
    
    ACTIVE("active"),
    
    INACTIVE("inactive"),
    
    LAUNCHED("launched");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private NameEnum name;

  public FeatureFlagStatus links(FeatureFlagStatusLinks links) {
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

  public FeatureFlagStatus _default(Object _default) {
    this._default = _default;
    return this;
  }

  /**
   * Get _default
   * @return _default
  */
  
  @Schema(name = "default", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default")
  public Object getDefault() {
    return _default;
  }

  public void setDefault(Object _default) {
    this._default = _default;
  }

  public FeatureFlagStatus lastRequested(String lastRequested) {
    this.lastRequested = lastRequested;
    return this;
  }

  /**
   * Get lastRequested
   * @return lastRequested
  */
  
  @Schema(name = "lastRequested", example = "2016-08-16T21:10:11.886Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastRequested")
  public String getLastRequested() {
    return lastRequested;
  }

  public void setLastRequested(String lastRequested) {
    this.lastRequested = lastRequested;
  }

  public FeatureFlagStatus name(NameEnum name) {
    this.name = name;
    return this;
  }

  /**
   * | Name     | Description | | --------:| ----------- | | new      | the feature flag was created within the last 7 days, and has not been requested yet | | active   | the feature flag was requested by your servers or clients within the last 7 days | | inactive | the feature flag was created more than 7 days ago, and hasn't been requested by your servers or clients within the past 7 days | | launched | one variation of the feature flag has been rolled out to all your users for at least 7 days | 
   * @return name
  */
  
  @Schema(name = "name", description = "| Name     | Description | | --------:| ----------- | | new      | the feature flag was created within the last 7 days, and has not been requested yet | | active   | the feature flag was requested by your servers or clients within the last 7 days | | inactive | the feature flag was created more than 7 days ago, and hasn't been requested by your servers or clients within the past 7 days | | launched | one variation of the feature flag has been rolled out to all your users for at least 7 days | ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
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
    FeatureFlagStatus featureFlagStatus = (FeatureFlagStatus) o;
    return Objects.equals(this.links, featureFlagStatus.links) &&
        Objects.equals(this._default, featureFlagStatus._default) &&
        Objects.equals(this.lastRequested, featureFlagStatus.lastRequested) &&
        Objects.equals(this.name, featureFlagStatus.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, _default, lastRequested, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagStatus {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    lastRequested: ").append(toIndentedString(lastRequested)).append("\n");
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

