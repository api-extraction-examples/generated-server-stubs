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
 * Image
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class Image {

  private String id;

  private String imageType;

  private String templateUrl;

  private String type;

  public Image() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Image(String id, String imageType, String templateUrl, String type) {
    this.id = id;
    this.imageType = imageType;
    this.templateUrl = templateUrl;
    this.type = type;
  }

  public Image id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Image imageType(String imageType) {
    this.imageType = imageType;
    return this;
  }

  /**
   * Get imageType
   * @return imageType
  */
  @NotNull 
  @Schema(name = "image_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("image_type")
  public String getImageType() {
    return imageType;
  }

  public void setImageType(String imageType) {
    this.imageType = imageType;
  }

  public Image templateUrl(String templateUrl) {
    this.templateUrl = templateUrl;
    return this;
  }

  /**
   * Get templateUrl
   * @return templateUrl
  */
  @NotNull 
  @Schema(name = "template_url", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("template_url")
  public String getTemplateUrl() {
    return templateUrl;
  }

  public void setTemplateUrl(String templateUrl) {
    this.templateUrl = templateUrl;
  }

  public Image type(String type) {
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
    Image image = (Image) o;
    return Objects.equals(this.id, image.id) &&
        Objects.equals(this.imageType, image.imageType) &&
        Objects.equals(this.templateUrl, image.templateUrl) &&
        Objects.equals(this.type, image.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, imageType, templateUrl, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    templateUrl: ").append(toIndentedString(templateUrl)).append("\n");
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

