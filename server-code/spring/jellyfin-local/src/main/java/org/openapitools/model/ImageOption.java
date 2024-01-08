package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ImageType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ImageOption
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ImageOption {

  private Integer limit;

  private Integer minWidth;

  private ImageType type;

  public ImageOption limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Gets or sets the limit.
   * @return limit
  */
  
  @Schema(name = "Limit", description = "Gets or sets the limit.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ImageOption minWidth(Integer minWidth) {
    this.minWidth = minWidth;
    return this;
  }

  /**
   * Gets or sets the minimum width.
   * @return minWidth
  */
  
  @Schema(name = "MinWidth", description = "Gets or sets the minimum width.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MinWidth")
  public Integer getMinWidth() {
    return minWidth;
  }

  public void setMinWidth(Integer minWidth) {
    this.minWidth = minWidth;
  }

  public ImageOption type(ImageType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "Type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public ImageType getType() {
    return type;
  }

  public void setType(ImageType type) {
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
    ImageOption imageOption = (ImageOption) o;
    return Objects.equals(this.limit, imageOption.limit) &&
        Objects.equals(this.minWidth, imageOption.minWidth) &&
        Objects.equals(this.type, imageOption.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, minWidth, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageOption {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    minWidth: ").append(toIndentedString(minWidth)).append("\n");
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

