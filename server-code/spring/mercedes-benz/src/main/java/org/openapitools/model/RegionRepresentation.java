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
 * RegionRepresentation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:25.642267-04:00[America/Lower_Princes]")
public class RegionRepresentation {

  private String region;

  private String subRegion;

  public RegionRepresentation region(String region) {
    this.region = region;
    return this;
  }

  /**
   * region
   * @return region
  */
  
  @Schema(name = "region", description = "region", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public RegionRepresentation subRegion(String subRegion) {
    this.subRegion = subRegion;
    return this;
  }

  /**
   * subregion
   * @return subRegion
  */
  
  @Schema(name = "subRegion", description = "subregion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subRegion")
  public String getSubRegion() {
    return subRegion;
  }

  public void setSubRegion(String subRegion) {
    this.subRegion = subRegion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegionRepresentation regionRepresentation = (RegionRepresentation) o;
    return Objects.equals(this.region, regionRepresentation.region) &&
        Objects.equals(this.subRegion, regionRepresentation.subRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, subRegion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionRepresentation {\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    subRegion: ").append(toIndentedString(subRegion)).append("\n");
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

