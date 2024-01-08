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
 * PodcastSynopses
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PodcastSynopses {

  private String _long;

  private String medium;

  private String _short;

  private String type;

  public PodcastSynopses() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PodcastSynopses(String _long, String medium, String _short, String type) {
    this._long = _long;
    this.medium = medium;
    this._short = _short;
    this.type = type;
  }

  public PodcastSynopses _long(String _long) {
    this._long = _long;
    return this;
  }

  /**
   * Get _long
   * @return _long
  */
  @NotNull 
  @Schema(name = "long", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("long")
  public String getLong() {
    return _long;
  }

  public void setLong(String _long) {
    this._long = _long;
  }

  public PodcastSynopses medium(String medium) {
    this.medium = medium;
    return this;
  }

  /**
   * Get medium
   * @return medium
  */
  @NotNull 
  @Schema(name = "medium", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("medium")
  public String getMedium() {
    return medium;
  }

  public void setMedium(String medium) {
    this.medium = medium;
  }

  public PodcastSynopses _short(String _short) {
    this._short = _short;
    return this;
  }

  /**
   * Get _short
   * @return _short
  */
  @NotNull 
  @Schema(name = "short", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("short")
  public String getShort() {
    return _short;
  }

  public void setShort(String _short) {
    this._short = _short;
  }

  public PodcastSynopses type(String type) {
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
    PodcastSynopses podcastSynopses = (PodcastSynopses) o;
    return Objects.equals(this._long, podcastSynopses._long) &&
        Objects.equals(this.medium, podcastSynopses.medium) &&
        Objects.equals(this._short, podcastSynopses._short) &&
        Objects.equals(this.type, podcastSynopses.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_long, medium, _short, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodcastSynopses {\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    _short: ").append(toIndentedString(_short)).append("\n");
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

