package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a rich preview card that is generated using OpenGraph tags from a URL.
 */

@Schema(name = "Card", description = "Represents a rich preview card that is generated using OpenGraph tags from a URL.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Card {

  private String authorName;

  private String authorUrl;

  private String blurhash;

  private String description;

  private Integer height;

  private String html;

  private String image;

  private String providerName;

  private String providerUrl;

  private String title;

  /**
   * The type of the preview card. String (Enumerable, oneOf).
   */
  public enum TypeEnum {
    LINK("link"),
    
    PHOTO("photo"),
    
    VIDEO("video"),
    
    RICH("rich");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private String url;

  private Integer width;

  public Card() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Card(String description, String title, TypeEnum type, String url) {
    this.description = description;
    this.title = title;
    this.type = type;
    this.url = url;
  }

  public Card authorName(String authorName) {
    this.authorName = authorName;
    return this;
  }

  /**
   * The author of the original resource.
   * @return authorName
  */
  
  @Schema(name = "author_name", description = "The author of the original resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author_name")
  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public Card authorUrl(String authorUrl) {
    this.authorUrl = authorUrl;
    return this;
  }

  /**
   * A link to the author of the original resource.
   * @return authorUrl
  */
  
  @Schema(name = "author_url", description = "A link to the author of the original resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author_url")
  public String getAuthorUrl() {
    return authorUrl;
  }

  public void setAuthorUrl(String authorUrl) {
    this.authorUrl = authorUrl;
  }

  public Card blurhash(String blurhash) {
    this.blurhash = blurhash;
    return this;
  }

  /**
   * A hash computed by the [BlurHash algorithm](https://github.com/woltapp/blurhash), for generating colorful preview thumbnails when media has not been downloaded yet.
   * @return blurhash
  */
  
  @Schema(name = "blurhash", description = "A hash computed by the [BlurHash algorithm](https://github.com/woltapp/blurhash), for generating colorful preview thumbnails when media has not been downloaded yet.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blurhash")
  public String getBlurhash() {
    return blurhash;
  }

  public void setBlurhash(String blurhash) {
    this.blurhash = blurhash;
  }

  public Card description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of preview.
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "Description of preview.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Card height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Height of preview, in pixels.
   * @return height
  */
  
  @Schema(name = "height", description = "Height of preview, in pixels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public Card html(String html) {
    this.html = html;
    return this;
  }

  /**
   * HTML to be used for generating the preview card.
   * @return html
  */
  
  @Schema(name = "html", description = "HTML to be used for generating the preview card.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html")
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }

  public Card image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Preview thumbnail (URL).
   * @return image
  */
  
  @Schema(name = "image", description = "Preview thumbnail (URL).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Card providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * The provider of the original resource.
   * @return providerName
  */
  
  @Schema(name = "provider_name", description = "The provider of the original resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider_name")
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public Card providerUrl(String providerUrl) {
    this.providerUrl = providerUrl;
    return this;
  }

  /**
   * A link to the provider of the original resource.
   * @return providerUrl
  */
  
  @Schema(name = "provider_url", description = "A link to the provider of the original resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider_url")
  public String getProviderUrl() {
    return providerUrl;
  }

  public void setProviderUrl(String providerUrl) {
    this.providerUrl = providerUrl;
  }

  public Card title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of linked resource.
   * @return title
  */
  @NotNull 
  @Schema(name = "title", description = "Title of linked resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Card type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the preview card. String (Enumerable, oneOf).
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "The type of the preview card. String (Enumerable, oneOf).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Card url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Location of linked resource.
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "Location of linked resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Card width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Width of preview, in pixels.
   * @return width
  */
  
  @Schema(name = "width", description = "Width of preview, in pixels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.authorName, card.authorName) &&
        Objects.equals(this.authorUrl, card.authorUrl) &&
        Objects.equals(this.blurhash, card.blurhash) &&
        Objects.equals(this.description, card.description) &&
        Objects.equals(this.height, card.height) &&
        Objects.equals(this.html, card.html) &&
        Objects.equals(this.image, card.image) &&
        Objects.equals(this.providerName, card.providerName) &&
        Objects.equals(this.providerUrl, card.providerUrl) &&
        Objects.equals(this.title, card.title) &&
        Objects.equals(this.type, card.type) &&
        Objects.equals(this.url, card.url) &&
        Objects.equals(this.width, card.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorName, authorUrl, blurhash, description, height, html, image, providerName, providerUrl, title, type, url, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    authorUrl: ").append(toIndentedString(authorUrl)).append("\n");
    sb.append("    blurhash: ").append(toIndentedString(blurhash)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerUrl: ").append(toIndentedString(providerUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

