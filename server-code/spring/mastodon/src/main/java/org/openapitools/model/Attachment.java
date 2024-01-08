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
 * Represents a file or media attachment that can be added to a status.
 */

@Schema(name = "Attachment", description = "Represents a file or media attachment that can be added to a status.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Attachment {

  private String blurhash;

  private String description;

  private String id;

  private Object meta;

  private String previewUrl;

  private String remoteUrl;

  @Deprecated
  private String textUrl;

  /**
   * The type of the attachment.
   */
  public enum TypeEnum {
    UNKNOWN("unknown"),
    
    IMAGE("image"),
    
    GIFV("gifv"),
    
    VIDEO("video"),
    
    AUDIO("audio");

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

  public Attachment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Attachment(String id, String previewUrl, TypeEnum type, String url) {
    this.id = id;
    this.previewUrl = previewUrl;
    this.type = type;
    this.url = url;
  }

  public Attachment blurhash(String blurhash) {
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

  public Attachment description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Alternate text that describes what is in the media attachment, to be used for the visually impaired or when media attachments do not load.
   * @return description
  */
  
  @Schema(name = "description", description = "Alternate text that describes what is in the media attachment, to be used for the visually impaired or when media attachments do not load.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Attachment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the attachment in the database. Cast from an integer but not guaranteed to be a number
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the attachment in the database. Cast from an integer but not guaranteed to be a number", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Attachment meta(Object meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Metadata returned by Paperclip.
   * @return meta
  */
  
  @Schema(name = "meta", description = "Metadata returned by Paperclip.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meta")
  public Object getMeta() {
    return meta;
  }

  public void setMeta(Object meta) {
    this.meta = meta;
  }

  public Attachment previewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
    return this;
  }

  /**
   * The location of a scaled-down preview of the attachment.
   * @return previewUrl
  */
  @NotNull 
  @Schema(name = "preview_url", description = "The location of a scaled-down preview of the attachment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("preview_url")
  public String getPreviewUrl() {
    return previewUrl;
  }

  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }

  public Attachment remoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
    return this;
  }

  /**
   * The location of the full-size original attachment on the remote website. String or null if the attachment is local.
   * @return remoteUrl
  */
  
  @Schema(name = "remote_url", description = "The location of the full-size original attachment on the remote website. String or null if the attachment is local.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remote_url")
  public String getRemoteUrl() {
    return remoteUrl;
  }

  public void setRemoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
  }

  public Attachment textUrl(String textUrl) {
    this.textUrl = textUrl;
    return this;
  }

  /**
   * A shorter URL for the attachment.
   * @return textUrl
   * @deprecated
  */
  
  @Schema(name = "text_url", description = "A shorter URL for the attachment.", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text_url")
  @Deprecated
  public String getTextUrl() {
    return textUrl;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setTextUrl(String textUrl) {
    this.textUrl = textUrl;
  }

  public Attachment type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the attachment.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "The type of the attachment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Attachment url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The location of the original full-size attachment.
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "The location of the original full-size attachment.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.blurhash, attachment.blurhash) &&
        Objects.equals(this.description, attachment.description) &&
        Objects.equals(this.id, attachment.id) &&
        Objects.equals(this.meta, attachment.meta) &&
        Objects.equals(this.previewUrl, attachment.previewUrl) &&
        Objects.equals(this.remoteUrl, attachment.remoteUrl) &&
        Objects.equals(this.textUrl, attachment.textUrl) &&
        Objects.equals(this.type, attachment.type) &&
        Objects.equals(this.url, attachment.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blurhash, description, id, meta, previewUrl, remoteUrl, textUrl, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    sb.append("    blurhash: ").append(toIndentedString(blurhash)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
    sb.append("    remoteUrl: ").append(toIndentedString(remoteUrl)).append("\n");
    sb.append("    textUrl: ").append(toIndentedString(textUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

