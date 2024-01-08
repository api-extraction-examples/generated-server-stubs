package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.Air11;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Root Object
 */

@Schema(name = "_air_rest_services_get_map_get_200_response", description = "Root Object")
@JsonTypeName("_air_rest_services_get_map_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:47.778831-04:00[America/Lower_Princes]")
public class AirRestServicesGetMapGet200Response {

  private Air11 mapOutput;

  public AirRestServicesGetMapGet200Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AirRestServicesGetMapGet200Response(Air11 mapOutput) {
    this.mapOutput = mapOutput;
  }

  public AirRestServicesGetMapGet200Response mapOutput(Air11 mapOutput) {
    this.mapOutput = mapOutput;
    return this;
  }

  /**
   * Get mapOutput
   * @return mapOutput
  */
  @NotNull @Valid 
  @Schema(name = "MapOutput", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("MapOutput")
  public Air11 getMapOutput() {
    return mapOutput;
  }

  public void setMapOutput(Air11 mapOutput) {
    this.mapOutput = mapOutput;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirRestServicesGetMapGet200Response airRestServicesGetMapGet200Response = (AirRestServicesGetMapGet200Response) o;
    return Objects.equals(this.mapOutput, airRestServicesGetMapGet200Response.mapOutput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapOutput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirRestServicesGetMapGet200Response {\n");
    sb.append("    mapOutput: ").append(toIndentedString(mapOutput)).append("\n");
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

