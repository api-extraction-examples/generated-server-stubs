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
 * Contains the response to a successful &lt;a&gt;ListSAMLProviders&lt;/a&gt; request. 
 */

@Schema(name = "ListSAMLProvidersResponse", description = "Contains the response to a successful <a>ListSAMLProviders</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListSAMLProvidersResponse {

  private List saMLProviderList;

  public ListSAMLProvidersResponse saMLProviderList(List saMLProviderList) {
    this.saMLProviderList = saMLProviderList;
    return this;
  }

  /**
   * Get saMLProviderList
   * @return saMLProviderList
  */
  @Valid 
  @Schema(name = "SAMLProviderList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SAMLProviderList")
  public List getSaMLProviderList() {
    return saMLProviderList;
  }

  public void setSaMLProviderList(List saMLProviderList) {
    this.saMLProviderList = saMLProviderList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSAMLProvidersResponse listSAMLProvidersResponse = (ListSAMLProvidersResponse) o;
    return Objects.equals(this.saMLProviderList, listSAMLProvidersResponse.saMLProviderList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saMLProviderList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSAMLProvidersResponse {\n");
    sb.append("    saMLProviderList: ").append(toIndentedString(saMLProviderList)).append("\n");
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

