package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Platform;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppCategoryAttributes
 */

@JsonTypeName("AppCategory_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppCategoryAttributes {

  @Valid
  private List<@Valid Platform> platforms;

  public AppCategoryAttributes platforms(List<@Valid Platform> platforms) {
    this.platforms = platforms;
    return this;
  }

  public AppCategoryAttributes addPlatformsItem(Platform platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

  /**
   * Get platforms
   * @return platforms
  */
  @Valid 
  @Schema(name = "platforms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platforms")
  public List<@Valid Platform> getPlatforms() {
    return platforms;
  }

  public void setPlatforms(List<@Valid Platform> platforms) {
    this.platforms = platforms;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppCategoryAttributes appCategoryAttributes = (AppCategoryAttributes) o;
    return Objects.equals(this.platforms, appCategoryAttributes.platforms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platforms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppCategoryAttributes {\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
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

