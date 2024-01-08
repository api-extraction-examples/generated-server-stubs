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
 * ClientSideAvailability
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class ClientSideAvailability {

  private Boolean usingEnvironmentId;

  private Boolean usingMobileKey;

  public ClientSideAvailability usingEnvironmentId(Boolean usingEnvironmentId) {
    this.usingEnvironmentId = usingEnvironmentId;
    return this;
  }

  /**
   * When set to true, this flag will be available to SDKs using the client-side id.
   * @return usingEnvironmentId
  */
  
  @Schema(name = "usingEnvironmentId", description = "When set to true, this flag will be available to SDKs using the client-side id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usingEnvironmentId")
  public Boolean getUsingEnvironmentId() {
    return usingEnvironmentId;
  }

  public void setUsingEnvironmentId(Boolean usingEnvironmentId) {
    this.usingEnvironmentId = usingEnvironmentId;
  }

  public ClientSideAvailability usingMobileKey(Boolean usingMobileKey) {
    this.usingMobileKey = usingMobileKey;
    return this;
  }

  /**
   * When set to true, this flag will be available to SDKS using a mobile key.
   * @return usingMobileKey
  */
  
  @Schema(name = "usingMobileKey", description = "When set to true, this flag will be available to SDKS using a mobile key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usingMobileKey")
  public Boolean getUsingMobileKey() {
    return usingMobileKey;
  }

  public void setUsingMobileKey(Boolean usingMobileKey) {
    this.usingMobileKey = usingMobileKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientSideAvailability clientSideAvailability = (ClientSideAvailability) o;
    return Objects.equals(this.usingEnvironmentId, clientSideAvailability.usingEnvironmentId) &&
        Objects.equals(this.usingMobileKey, clientSideAvailability.usingMobileKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usingEnvironmentId, usingMobileKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientSideAvailability {\n");
    sb.append("    usingEnvironmentId: ").append(toIndentedString(usingEnvironmentId)).append("\n");
    sb.append("    usingMobileKey: ").append(toIndentedString(usingMobileKey)).append("\n");
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

