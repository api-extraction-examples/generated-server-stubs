package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BuildSetup
 */

@JsonTypeName("buildSetup")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class BuildSetup {

  private Boolean clearCache;

  private String image;

  public BuildSetup clearCache(Boolean clearCache) {
    this.clearCache = clearCache;
    return this;
  }

  /**
   * Get clearCache
   * @return clearCache
  */
  
  @Schema(name = "clear_cache", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clear_cache")
  public Boolean getClearCache() {
    return clearCache;
  }

  public void setClearCache(Boolean clearCache) {
    this.clearCache = clearCache;
  }

  public BuildSetup image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  */
  
  @Schema(name = "image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildSetup buildSetup = (BuildSetup) o;
    return Objects.equals(this.clearCache, buildSetup.clearCache) &&
        Objects.equals(this.image, buildSetup.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clearCache, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildSetup {\n");
    sb.append("    clearCache: ").append(toIndentedString(clearCache)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

