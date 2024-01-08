package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class MediaAttachment.
 */

@Schema(name = "MediaAttachment", description = "Class MediaAttachment.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class MediaAttachment {

  private JsonNullable<String> codec = JsonNullable.<String>undefined();

  private JsonNullable<String> codecTag = JsonNullable.<String>undefined();

  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  private JsonNullable<String> deliveryUrl = JsonNullable.<String>undefined();

  private JsonNullable<String> fileName = JsonNullable.<String>undefined();

  private Integer index;

  private JsonNullable<String> mimeType = JsonNullable.<String>undefined();

  public MediaAttachment codec(String codec) {
    this.codec = JsonNullable.of(codec);
    return this;
  }

  /**
   * Gets or sets the codec.
   * @return codec
  */
  
  @Schema(name = "Codec", description = "Gets or sets the codec.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Codec")
  public JsonNullable<String> getCodec() {
    return codec;
  }

  public void setCodec(JsonNullable<String> codec) {
    this.codec = codec;
  }

  public MediaAttachment codecTag(String codecTag) {
    this.codecTag = JsonNullable.of(codecTag);
    return this;
  }

  /**
   * Gets or sets the codec tag.
   * @return codecTag
  */
  
  @Schema(name = "CodecTag", description = "Gets or sets the codec tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CodecTag")
  public JsonNullable<String> getCodecTag() {
    return codecTag;
  }

  public void setCodecTag(JsonNullable<String> codecTag) {
    this.codecTag = codecTag;
  }

  public MediaAttachment comment(String comment) {
    this.comment = JsonNullable.of(comment);
    return this;
  }

  /**
   * Gets or sets the comment.
   * @return comment
  */
  
  @Schema(name = "Comment", description = "Gets or sets the comment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Comment")
  public JsonNullable<String> getComment() {
    return comment;
  }

  public void setComment(JsonNullable<String> comment) {
    this.comment = comment;
  }

  public MediaAttachment deliveryUrl(String deliveryUrl) {
    this.deliveryUrl = JsonNullable.of(deliveryUrl);
    return this;
  }

  /**
   * Gets or sets the delivery URL.
   * @return deliveryUrl
  */
  
  @Schema(name = "DeliveryUrl", description = "Gets or sets the delivery URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryUrl")
  public JsonNullable<String> getDeliveryUrl() {
    return deliveryUrl;
  }

  public void setDeliveryUrl(JsonNullable<String> deliveryUrl) {
    this.deliveryUrl = deliveryUrl;
  }

  public MediaAttachment fileName(String fileName) {
    this.fileName = JsonNullable.of(fileName);
    return this;
  }

  /**
   * Gets or sets the filename.
   * @return fileName
  */
  
  @Schema(name = "FileName", description = "Gets or sets the filename.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FileName")
  public JsonNullable<String> getFileName() {
    return fileName;
  }

  public void setFileName(JsonNullable<String> fileName) {
    this.fileName = fileName;
  }

  public MediaAttachment index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Gets or sets the index.
   * @return index
  */
  
  @Schema(name = "Index", description = "Gets or sets the index.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public MediaAttachment mimeType(String mimeType) {
    this.mimeType = JsonNullable.of(mimeType);
    return this;
  }

  /**
   * Gets or sets the MIME type.
   * @return mimeType
  */
  
  @Schema(name = "MimeType", description = "Gets or sets the MIME type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MimeType")
  public JsonNullable<String> getMimeType() {
    return mimeType;
  }

  public void setMimeType(JsonNullable<String> mimeType) {
    this.mimeType = mimeType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaAttachment mediaAttachment = (MediaAttachment) o;
    return equalsNullable(this.codec, mediaAttachment.codec) &&
        equalsNullable(this.codecTag, mediaAttachment.codecTag) &&
        equalsNullable(this.comment, mediaAttachment.comment) &&
        equalsNullable(this.deliveryUrl, mediaAttachment.deliveryUrl) &&
        equalsNullable(this.fileName, mediaAttachment.fileName) &&
        Objects.equals(this.index, mediaAttachment.index) &&
        equalsNullable(this.mimeType, mediaAttachment.mimeType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(codec), hashCodeNullable(codecTag), hashCodeNullable(comment), hashCodeNullable(deliveryUrl), hashCodeNullable(fileName), index, hashCodeNullable(mimeType));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaAttachment {\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    codecTag: ").append(toIndentedString(codecTag)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    deliveryUrl: ").append(toIndentedString(deliveryUrl)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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

