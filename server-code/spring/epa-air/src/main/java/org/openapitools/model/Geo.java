package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GeoJSON Geometry Object
 */

@Schema(name = "geo", description = "GeoJSON Geometry Object")
@JsonTypeName("geo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:47.778831-04:00[America/Lower_Princes]")
public class Geo {

  @Valid
  private List<BigDecimal> coordinates = new ArrayList<>();

  private String type;

  public Geo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Geo(List<BigDecimal> coordinates, String type) {
    this.coordinates = coordinates;
    this.type = type;
  }

  public Geo coordinates(List<BigDecimal> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public Geo addCoordinatesItem(BigDecimal coordinatesItem) {
    if (this.coordinates == null) {
      this.coordinates = new ArrayList<>();
    }
    this.coordinates.add(coordinatesItem);
    return this;
  }

  /**
   * Array of coordinate values in longitude, latitude format.
   * @return coordinates
  */
  @NotNull @Valid 
  @Schema(name = "coordinates", example = "-87.86253", description = "Array of coordinate values in longitude, latitude format.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("coordinates")
  public List<BigDecimal> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<BigDecimal> coordinates) {
    this.coordinates = coordinates;
  }

  public Geo type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicator of the geometry represented in the GeoJSON Feature, for Echo will always be \"Point\".
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "Point", description = "Indicator of the geometry represented in the GeoJSON Feature, for Echo will always be \"Point\".", requiredMode = Schema.RequiredMode.REQUIRED)
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
    Geo geo = (Geo) o;
    return Objects.equals(this.coordinates, geo.coordinates) &&
        Objects.equals(this.type, geo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinates, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Geo {\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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

