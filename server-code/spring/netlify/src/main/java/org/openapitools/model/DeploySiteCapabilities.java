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
 * DeploySiteCapabilities
 */

@JsonTypeName("deploy_site_capabilities")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class DeploySiteCapabilities {

  private Boolean largeMediaEnabled;

  public DeploySiteCapabilities largeMediaEnabled(Boolean largeMediaEnabled) {
    this.largeMediaEnabled = largeMediaEnabled;
    return this;
  }

  /**
   * Get largeMediaEnabled
   * @return largeMediaEnabled
  */
  
  @Schema(name = "large_media_enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("large_media_enabled")
  public Boolean getLargeMediaEnabled() {
    return largeMediaEnabled;
  }

  public void setLargeMediaEnabled(Boolean largeMediaEnabled) {
    this.largeMediaEnabled = largeMediaEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploySiteCapabilities deploySiteCapabilities = (DeploySiteCapabilities) o;
    return Objects.equals(this.largeMediaEnabled, deploySiteCapabilities.largeMediaEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(largeMediaEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploySiteCapabilities {\n");
    sb.append("    largeMediaEnabled: ").append(toIndentedString(largeMediaEnabled)).append("\n");
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

