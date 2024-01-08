package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AncestorTitles;
import org.openapitools.model.Image;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AncestorSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class AncestorSummary {

  private String ancestorType;

  private String id;

  @Valid
  private List<@Valid Image> images = new ArrayList<>();

  private AncestorTitles titles;

  private String type;

  public AncestorSummary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AncestorSummary(String ancestorType, String id, List<@Valid Image> images, AncestorTitles titles, String type) {
    this.ancestorType = ancestorType;
    this.id = id;
    this.images = images;
    this.titles = titles;
    this.type = type;
  }

  public AncestorSummary ancestorType(String ancestorType) {
    this.ancestorType = ancestorType;
    return this;
  }

  /**
   * Get ancestorType
   * @return ancestorType
  */
  @NotNull 
  @Schema(name = "ancestor_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ancestor_type")
  public String getAncestorType() {
    return ancestorType;
  }

  public void setAncestorType(String ancestorType) {
    this.ancestorType = ancestorType;
  }

  public AncestorSummary id(String id) {
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

  public AncestorSummary images(List<@Valid Image> images) {
    this.images = images;
    return this;
  }

  public AncestorSummary addImagesItem(Image imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  */
  @NotNull @Valid 
  @Schema(name = "images", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("images")
  public List<@Valid Image> getImages() {
    return images;
  }

  public void setImages(List<@Valid Image> images) {
    this.images = images;
  }

  public AncestorSummary titles(AncestorTitles titles) {
    this.titles = titles;
    return this;
  }

  /**
   * Get titles
   * @return titles
  */
  @NotNull @Valid 
  @Schema(name = "titles", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("titles")
  public AncestorTitles getTitles() {
    return titles;
  }

  public void setTitles(AncestorTitles titles) {
    this.titles = titles;
  }

  public AncestorSummary type(String type) {
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
    AncestorSummary ancestorSummary = (AncestorSummary) o;
    return Objects.equals(this.ancestorType, ancestorSummary.ancestorType) &&
        Objects.equals(this.id, ancestorSummary.id) &&
        Objects.equals(this.images, ancestorSummary.images) &&
        Objects.equals(this.titles, ancestorSummary.titles) &&
        Objects.equals(this.type, ancestorSummary.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ancestorType, id, images, titles, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AncestorSummary {\n");
    sb.append("    ancestorType: ").append(toIndentedString(ancestorType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
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

