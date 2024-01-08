package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListServiceSpecificCredentialsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListServiceSpecificCredentialsResponse {

  private List serviceSpecificCredentials;

  public ListServiceSpecificCredentialsResponse serviceSpecificCredentials(List serviceSpecificCredentials) {
    this.serviceSpecificCredentials = serviceSpecificCredentials;
    return this;
  }

  /**
   * Get serviceSpecificCredentials
   * @return serviceSpecificCredentials
  */
  @Valid 
  @Schema(name = "ServiceSpecificCredentials", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServiceSpecificCredentials")
  public List getServiceSpecificCredentials() {
    return serviceSpecificCredentials;
  }

  public void setServiceSpecificCredentials(List serviceSpecificCredentials) {
    this.serviceSpecificCredentials = serviceSpecificCredentials;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListServiceSpecificCredentialsResponse listServiceSpecificCredentialsResponse = (ListServiceSpecificCredentialsResponse) o;
    return Objects.equals(this.serviceSpecificCredentials, listServiceSpecificCredentialsResponse.serviceSpecificCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceSpecificCredentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListServiceSpecificCredentialsResponse {\n");
    sb.append("    serviceSpecificCredentials: ").append(toIndentedString(serviceSpecificCredentials)).append("\n");
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

