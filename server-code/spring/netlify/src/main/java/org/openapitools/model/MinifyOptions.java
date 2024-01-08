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
 * MinifyOptions
 */

@JsonTypeName("minifyOptions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class MinifyOptions {

  private Boolean bundle;

  private Boolean minify;

  public MinifyOptions bundle(Boolean bundle) {
    this.bundle = bundle;
    return this;
  }

  /**
   * Get bundle
   * @return bundle
  */
  
  @Schema(name = "bundle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bundle")
  public Boolean getBundle() {
    return bundle;
  }

  public void setBundle(Boolean bundle) {
    this.bundle = bundle;
  }

  public MinifyOptions minify(Boolean minify) {
    this.minify = minify;
    return this;
  }

  /**
   * Get minify
   * @return minify
  */
  
  @Schema(name = "minify", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minify")
  public Boolean getMinify() {
    return minify;
  }

  public void setMinify(Boolean minify) {
    this.minify = minify;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinifyOptions minifyOptions = (MinifyOptions) o;
    return Objects.equals(this.bundle, minifyOptions.bundle) &&
        Objects.equals(this.minify, minifyOptions.minify);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundle, minify);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinifyOptions {\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    minify: ").append(toIndentedString(minify)).append("\n");
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

