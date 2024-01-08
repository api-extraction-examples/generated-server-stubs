package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Provider;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetProviders200Response
 */

@JsonTypeName("get_providers_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class GetProviders200Response {

  @Valid
  private List<@Valid Provider> providers;

  private Integer totalEntries;

  public GetProviders200Response providers(List<@Valid Provider> providers) {
    this.providers = providers;
    return this;
  }

  public GetProviders200Response addProvidersItem(Provider providersItem) {
    if (this.providers == null) {
      this.providers = new ArrayList<>();
    }
    this.providers.add(providersItem);
    return this;
  }

  /**
   * Get providers
   * @return providers
  */
  @Valid 
  @Schema(name = "providers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("providers")
  public List<@Valid Provider> getProviders() {
    return providers;
  }

  public void setProviders(List<@Valid Provider> providers) {
    this.providers = providers;
  }

  public GetProviders200Response totalEntries(Integer totalEntries) {
    this.totalEntries = totalEntries;
    return this;
  }

  /**
   * Count of total objects in the current result set before pagination parameters (limit, offset) are applied. 
   * @return totalEntries
  */
  
  @Schema(name = "total_entries", description = "Count of total objects in the current result set before pagination parameters (limit, offset) are applied. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_entries")
  public Integer getTotalEntries() {
    return totalEntries;
  }

  public void setTotalEntries(Integer totalEntries) {
    this.totalEntries = totalEntries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProviders200Response getProviders200Response = (GetProviders200Response) o;
    return Objects.equals(this.providers, getProviders200Response.providers) &&
        Objects.equals(this.totalEntries, getProviders200Response.totalEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providers, totalEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProviders200Response {\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    totalEntries: ").append(toIndentedString(totalEntries)).append("\n");
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

