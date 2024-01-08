package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Air09;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GeoJSON Feature Collection Object
 */

@Schema(name = "_air_rest_services_get_geojson_get_200_response", description = "GeoJSON Feature Collection Object")
@JsonTypeName("_air_rest_services_get_geojson_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:47.778831-04:00[America/Lower_Princes]")
public class AirRestServicesGetGeojsonGet200Response {

  @Valid
  private List<@Valid Air09> features = new ArrayList<>();

  private String type;

  public AirRestServicesGetGeojsonGet200Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AirRestServicesGetGeojsonGet200Response(List<@Valid Air09> features, String type) {
    this.features = features;
    this.type = type;
  }

  public AirRestServicesGetGeojsonGet200Response features(List<@Valid Air09> features) {
    this.features = features;
    return this;
  }

  public AirRestServicesGetGeojsonGet200Response addFeaturesItem(Air09 featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

  /**
   * Array of features in the feature collection.
   * @return features
  */
  @NotNull @Valid 
  @Schema(name = "features", description = "Array of features in the feature collection.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("features")
  public List<@Valid Air09> getFeatures() {
    return features;
  }

  public void setFeatures(List<@Valid Air09> features) {
    this.features = features;
  }

  public AirRestServicesGetGeojsonGet200Response type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Static marker indicating object is a GeoJSON Feature Collection.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "FeatureCollection", description = "Static marker indicating object is a GeoJSON Feature Collection.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    AirRestServicesGetGeojsonGet200Response airRestServicesGetGeojsonGet200Response = (AirRestServicesGetGeojsonGet200Response) o;
    return Objects.equals(this.features, airRestServicesGetGeojsonGet200Response.features) &&
        Objects.equals(this.type, airRestServicesGetGeojsonGet200Response.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(features, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirRestServicesGetGeojsonGet200Response {\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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

