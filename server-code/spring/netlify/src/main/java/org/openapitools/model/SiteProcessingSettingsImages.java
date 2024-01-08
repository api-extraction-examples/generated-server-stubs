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
 * SiteProcessingSettingsImages
 */

@JsonTypeName("site_processing_settings_images")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class SiteProcessingSettingsImages {

  private Boolean optimize;

  public SiteProcessingSettingsImages optimize(Boolean optimize) {
    this.optimize = optimize;
    return this;
  }

  /**
   * Get optimize
   * @return optimize
  */
  
  @Schema(name = "optimize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optimize")
  public Boolean getOptimize() {
    return optimize;
  }

  public void setOptimize(Boolean optimize) {
    this.optimize = optimize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteProcessingSettingsImages siteProcessingSettingsImages = (SiteProcessingSettingsImages) o;
    return Objects.equals(this.optimize, siteProcessingSettingsImages.optimize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optimize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteProcessingSettingsImages {\n");
    sb.append("    optimize: ").append(toIndentedString(optimize)).append("\n");
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

