package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.Air12;
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

@Schema(name = "_air_rest_services_get_qid_get_200_response", description = "Root Object")
@JsonTypeName("_air_rest_services_get_qid_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:47.778831-04:00[America/Lower_Princes]")
public class AirRestServicesGetQidGet200Response {

  private Air12 results;

  public AirRestServicesGetQidGet200Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AirRestServicesGetQidGet200Response(Air12 results) {
    this.results = results;
  }

  public AirRestServicesGetQidGet200Response results(Air12 results) {
    this.results = results;
    return this;
  }

  /**
   * Get results
   * @return results
  */
  @NotNull @Valid 
  @Schema(name = "Results", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Results")
  public Air12 getResults() {
    return results;
  }

  public void setResults(Air12 results) {
    this.results = results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirRestServicesGetQidGet200Response airRestServicesGetQidGet200Response = (AirRestServicesGetQidGet200Response) o;
    return Objects.equals(this.results, airRestServicesGetQidGet200Response.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirRestServicesGetQidGet200Response {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

