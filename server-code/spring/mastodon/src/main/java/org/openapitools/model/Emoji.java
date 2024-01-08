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
 * Represents a custom emoji.
 */

@Schema(name = "Emoji", description = "Represents a custom emoji.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Emoji {

  private String category;

  private String shortcode;

  private String staticUrl;

  private String url;

  private Boolean visibleInPicker;

  public Emoji() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Emoji(String shortcode, String staticUrl, String url, Boolean visibleInPicker) {
    this.shortcode = shortcode;
    this.staticUrl = staticUrl;
    this.url = url;
    this.visibleInPicker = visibleInPicker;
  }

  public Emoji category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Used for sorting custom emoji in the picker.
   * @return category
  */
  
  @Schema(name = "category", description = "Used for sorting custom emoji in the picker.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Emoji shortcode(String shortcode) {
    this.shortcode = shortcode;
    return this;
  }

  /**
   * The name of the custom emoji.
   * @return shortcode
  */
  @NotNull 
  @Schema(name = "shortcode", description = "The name of the custom emoji.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("shortcode")
  public String getShortcode() {
    return shortcode;
  }

  public void setShortcode(String shortcode) {
    this.shortcode = shortcode;
  }

  public Emoji staticUrl(String staticUrl) {
    this.staticUrl = staticUrl;
    return this;
  }

  /**
   * A link to a static copy of the custom emoji. The format is URL.
   * @return staticUrl
  */
  @NotNull 
  @Schema(name = "static_url", description = "A link to a static copy of the custom emoji. The format is URL.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("static_url")
  public String getStaticUrl() {
    return staticUrl;
  }

  public void setStaticUrl(String staticUrl) {
    this.staticUrl = staticUrl;
  }

  public Emoji url(String url) {
    this.url = url;
    return this;
  }

  /**
   * A link to the custom emoji. The format is URL.
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "A link to the custom emoji. The format is URL.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Emoji visibleInPicker(Boolean visibleInPicker) {
    this.visibleInPicker = visibleInPicker;
    return this;
  }

  /**
   * Whether this Emoji should be visible in the picker or unlisted.
   * @return visibleInPicker
  */
  @NotNull 
  @Schema(name = "visible_in_picker", description = "Whether this Emoji should be visible in the picker or unlisted.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("visible_in_picker")
  public Boolean getVisibleInPicker() {
    return visibleInPicker;
  }

  public void setVisibleInPicker(Boolean visibleInPicker) {
    this.visibleInPicker = visibleInPicker;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Emoji emoji = (Emoji) o;
    return Objects.equals(this.category, emoji.category) &&
        Objects.equals(this.shortcode, emoji.shortcode) &&
        Objects.equals(this.staticUrl, emoji.staticUrl) &&
        Objects.equals(this.url, emoji.url) &&
        Objects.equals(this.visibleInPicker, emoji.visibleInPicker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, shortcode, staticUrl, url, visibleInPicker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Emoji {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    shortcode: ").append(toIndentedString(shortcode)).append("\n");
    sb.append("    staticUrl: ").append(toIndentedString(staticUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    visibleInPicker: ").append(toIndentedString(visibleInPicker)).append("\n");
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

