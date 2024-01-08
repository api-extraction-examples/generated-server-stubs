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
 * NetworkTitles
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class NetworkTitles {

  private String longTitle;

  private String shortTitle;

  private String type;

  public NetworkTitles() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NetworkTitles(String longTitle, String shortTitle, String type) {
    this.longTitle = longTitle;
    this.shortTitle = shortTitle;
    this.type = type;
  }

  public NetworkTitles longTitle(String longTitle) {
    this.longTitle = longTitle;
    return this;
  }

  /**
   * Get longTitle
   * @return longTitle
  */
  @NotNull 
  @Schema(name = "long_title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("long_title")
  public String getLongTitle() {
    return longTitle;
  }

  public void setLongTitle(String longTitle) {
    this.longTitle = longTitle;
  }

  public NetworkTitles shortTitle(String shortTitle) {
    this.shortTitle = shortTitle;
    return this;
  }

  /**
   * Get shortTitle
   * @return shortTitle
  */
  @NotNull 
  @Schema(name = "short_title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("short_title")
  public String getShortTitle() {
    return shortTitle;
  }

  public void setShortTitle(String shortTitle) {
    this.shortTitle = shortTitle;
  }

  public NetworkTitles type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkTitles networkTitles = (NetworkTitles) o;
    return Objects.equals(this.longTitle, networkTitles.longTitle) &&
        Objects.equals(this.shortTitle, networkTitles.shortTitle) &&
        Objects.equals(this.type, networkTitles.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longTitle, shortTitle, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkTitles {\n");
    sb.append("    longTitle: ").append(toIndentedString(longTitle)).append("\n");
    sb.append("    shortTitle: ").append(toIndentedString(shortTitle)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

