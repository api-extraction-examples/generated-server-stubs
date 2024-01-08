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
 * AmendmentLine
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:54:38.614249-04:00[America/Lower_Princes]")
public class AmendmentLine {

  private JsonNullable<String> hangingIndentation = JsonNullable.<String>undefined();

  private JsonNullable<String> imageType = JsonNullable.<String>undefined();

  private Integer indentation;

  private Boolean isImage;

  private JsonNullable<String> text = JsonNullable.<String>undefined();

  public AmendmentLine hangingIndentation(String hangingIndentation) {
    this.hangingIndentation = JsonNullable.of(hangingIndentation);
    return this;
  }

  /**
   * Get hangingIndentation
   * @return hangingIndentation
  */
  
  @Schema(name = "hangingIndentation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hangingIndentation")
  public JsonNullable<String> getHangingIndentation() {
    return hangingIndentation;
  }

  public void setHangingIndentation(JsonNullable<String> hangingIndentation) {
    this.hangingIndentation = hangingIndentation;
  }

  public AmendmentLine imageType(String imageType) {
    this.imageType = JsonNullable.of(imageType);
    return this;
  }

  /**
   * Get imageType
   * @return imageType
  */
  
  @Schema(name = "imageType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageType")
  public JsonNullable<String> getImageType() {
    return imageType;
  }

  public void setImageType(JsonNullable<String> imageType) {
    this.imageType = imageType;
  }

  public AmendmentLine indentation(Integer indentation) {
    this.indentation = indentation;
    return this;
  }

  /**
   * Get indentation
   * @return indentation
  */
  
  @Schema(name = "indentation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indentation")
  public Integer getIndentation() {
    return indentation;
  }

  public void setIndentation(Integer indentation) {
    this.indentation = indentation;
  }

  public AmendmentLine isImage(Boolean isImage) {
    this.isImage = isImage;
    return this;
  }

  /**
   * Get isImage
   * @return isImage
  */
  
  @Schema(name = "isImage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isImage")
  public Boolean getIsImage() {
    return isImage;
  }

  public void setIsImage(Boolean isImage) {
    this.isImage = isImage;
  }

  public AmendmentLine text(String text) {
    this.text = JsonNullable.of(text);
    return this;
  }

  /**
   * Get text
   * @return text
  */
  
  @Schema(name = "text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public JsonNullable<String> getText() {
    return text;
  }

  public void setText(JsonNullable<String> text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmendmentLine amendmentLine = (AmendmentLine) o;
    return equalsNullable(this.hangingIndentation, amendmentLine.hangingIndentation) &&
        equalsNullable(this.imageType, amendmentLine.imageType) &&
        Objects.equals(this.indentation, amendmentLine.indentation) &&
        Objects.equals(this.isImage, amendmentLine.isImage) &&
        equalsNullable(this.text, amendmentLine.text);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(hangingIndentation), hashCodeNullable(imageType), indentation, isImage, hashCodeNullable(text));
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
    sb.append("class AmendmentLine {\n");
    sb.append("    hangingIndentation: ").append(toIndentedString(hangingIndentation)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    indentation: ").append(toIndentedString(indentation)).append("\n");
    sb.append("    isImage: ").append(toIndentedString(isImage)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

