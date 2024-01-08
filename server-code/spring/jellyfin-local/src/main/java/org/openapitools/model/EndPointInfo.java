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
 * EndPointInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class EndPointInfo {

  private Boolean isInNetwork;

  private Boolean isLocal;

  public EndPointInfo isInNetwork(Boolean isInNetwork) {
    this.isInNetwork = isInNetwork;
    return this;
  }

  /**
   * Get isInNetwork
   * @return isInNetwork
  */
  
  @Schema(name = "IsInNetwork", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsInNetwork")
  public Boolean getIsInNetwork() {
    return isInNetwork;
  }

  public void setIsInNetwork(Boolean isInNetwork) {
    this.isInNetwork = isInNetwork;
  }

  public EndPointInfo isLocal(Boolean isLocal) {
    this.isLocal = isLocal;
    return this;
  }

  /**
   * Get isLocal
   * @return isLocal
  */
  
  @Schema(name = "IsLocal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsLocal")
  public Boolean getIsLocal() {
    return isLocal;
  }

  public void setIsLocal(Boolean isLocal) {
    this.isLocal = isLocal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndPointInfo endPointInfo = (EndPointInfo) o;
    return Objects.equals(this.isInNetwork, endPointInfo.isInNetwork) &&
        Objects.equals(this.isLocal, endPointInfo.isLocal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isInNetwork, isLocal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndPointInfo {\n");
    sb.append("    isInNetwork: ").append(toIndentedString(isInNetwork)).append("\n");
    sb.append("    isLocal: ").append(toIndentedString(isLocal)).append("\n");
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

