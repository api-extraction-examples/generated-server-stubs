package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.Air10;
import org.openapitools.model.Geo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GeoJSON Feature Object
 */

@Schema(name = "air09", description = "GeoJSON Feature Object")
@JsonTypeName("air09")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:47.778831-04:00[America/Lower_Princes]")
public class Air09 {

  private Geo geometry;

  private Air10 properties;

  private String type;

  public Air09() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Air09(Geo geometry, Air10 properties, String type) {
    this.geometry = geometry;
    this.properties = properties;
    this.type = type;
  }

  public Air09 geometry(Geo geometry) {
    this.geometry = geometry;
    return this;
  }

  /**
   * Get geometry
   * @return geometry
  */
  @NotNull @Valid 
  @Schema(name = "geometry", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("geometry")
  public Geo getGeometry() {
    return geometry;
  }

  public void setGeometry(Geo geometry) {
    this.geometry = geometry;
  }

  public Air09 properties(Air10 properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Get properties
   * @return properties
  */
  @NotNull @Valid 
  @Schema(name = "properties", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("properties")
  public Air10 getProperties() {
    return properties;
  }

  public void setProperties(Air10 properties) {
    this.properties = properties;
  }

  public Air09 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Static marker indicating object is a GeoJSON Feature.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "Feature", description = "Static marker indicating object is a GeoJSON Feature.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    Air09 air09 = (Air09) o;
    return Objects.equals(this.geometry, air09.geometry) &&
        Objects.equals(this.properties, air09.properties) &&
        Objects.equals(this.type, air09.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geometry, properties, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Air09 {\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

