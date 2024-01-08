package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about the time tracking provider.
 */

@Schema(name = "TimeTrackingProvider", description = "Details about the time tracking provider.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class TimeTrackingProvider {

  private String key;

  private String name;

  private String url;

  public TimeTrackingProvider() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TimeTrackingProvider(String key) {
    this.key = key;
  }

  public TimeTrackingProvider key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key for the time tracking provider. For example, *JIRA*.
   * @return key
  */
  @NotNull 
  @Schema(name = "key", description = "The key for the time tracking provider. For example, *JIRA*.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public TimeTrackingProvider name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the time tracking provider. For example, *JIRA provided time tracking*.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the time tracking provider. For example, *JIRA provided time tracking*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TimeTrackingProvider url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL of the configuration page for the time tracking provider app. For example, *_/example/config/url*. This property is only returned if the `adminPageKey` property is set in the module descriptor of the time tracking provider app.
   * @return url
  */
  
  @Schema(name = "url", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the configuration page for the time tracking provider app. For example, *_/example/config/url*. This property is only returned if the `adminPageKey` property is set in the module descriptor of the time tracking provider app.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeTrackingProvider timeTrackingProvider = (TimeTrackingProvider) o;
    return Objects.equals(this.key, timeTrackingProvider.key) &&
        Objects.equals(this.name, timeTrackingProvider.name) &&
        Objects.equals(this.url, timeTrackingProvider.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeTrackingProvider {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

