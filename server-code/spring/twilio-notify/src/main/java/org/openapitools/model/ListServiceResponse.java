package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ListCredentialResponseMeta;
import org.openapitools.model.NotifyV1Service;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListServiceResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:55:49.917798-04:00[America/Lower_Princes]")
public class ListServiceResponse {

  private ListCredentialResponseMeta meta;

  @Valid
  private List<@Valid NotifyV1Service> services;

  public ListServiceResponse meta(ListCredentialResponseMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  */
  @Valid 
  @Schema(name = "meta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meta")
  public ListCredentialResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(ListCredentialResponseMeta meta) {
    this.meta = meta;
  }

  public ListServiceResponse services(List<@Valid NotifyV1Service> services) {
    this.services = services;
    return this;
  }

  public ListServiceResponse addServicesItem(NotifyV1Service servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * Get services
   * @return services
  */
  @Valid 
  @Schema(name = "services", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("services")
  public List<@Valid NotifyV1Service> getServices() {
    return services;
  }

  public void setServices(List<@Valid NotifyV1Service> services) {
    this.services = services;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListServiceResponse listServiceResponse = (ListServiceResponse) o;
    return Objects.equals(this.meta, listServiceResponse.meta) &&
        Objects.equals(this.services, listServiceResponse.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListServiceResponse {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

