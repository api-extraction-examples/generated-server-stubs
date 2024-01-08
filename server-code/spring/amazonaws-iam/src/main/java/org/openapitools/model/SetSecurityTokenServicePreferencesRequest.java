package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.GlobalEndpointTokenVersion;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SetSecurityTokenServicePreferencesRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class SetSecurityTokenServicePreferencesRequest {

  private GlobalEndpointTokenVersion globalEndpointTokenVersion;

  public SetSecurityTokenServicePreferencesRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SetSecurityTokenServicePreferencesRequest(GlobalEndpointTokenVersion globalEndpointTokenVersion) {
    this.globalEndpointTokenVersion = globalEndpointTokenVersion;
  }

  public SetSecurityTokenServicePreferencesRequest globalEndpointTokenVersion(GlobalEndpointTokenVersion globalEndpointTokenVersion) {
    this.globalEndpointTokenVersion = globalEndpointTokenVersion;
    return this;
  }

  /**
   * Get globalEndpointTokenVersion
   * @return globalEndpointTokenVersion
  */
  @NotNull @Valid 
  @Schema(name = "GlobalEndpointTokenVersion", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("GlobalEndpointTokenVersion")
  public GlobalEndpointTokenVersion getGlobalEndpointTokenVersion() {
    return globalEndpointTokenVersion;
  }

  public void setGlobalEndpointTokenVersion(GlobalEndpointTokenVersion globalEndpointTokenVersion) {
    this.globalEndpointTokenVersion = globalEndpointTokenVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetSecurityTokenServicePreferencesRequest setSecurityTokenServicePreferencesRequest = (SetSecurityTokenServicePreferencesRequest) o;
    return Objects.equals(this.globalEndpointTokenVersion, setSecurityTokenServicePreferencesRequest.globalEndpointTokenVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalEndpointTokenVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetSecurityTokenServicePreferencesRequest {\n");
    sb.append("    globalEndpointTokenVersion: ").append(toIndentedString(globalEndpointTokenVersion)).append("\n");
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

