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
 * Contains the response to a successful &lt;a&gt;ListOpenIDConnectProviders&lt;/a&gt; request. 
 */

@Schema(name = "ListOpenIDConnectProvidersResponse", description = "Contains the response to a successful <a>ListOpenIDConnectProviders</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListOpenIDConnectProvidersResponse {

  private List openIDConnectProviderList;

  public ListOpenIDConnectProvidersResponse openIDConnectProviderList(List openIDConnectProviderList) {
    this.openIDConnectProviderList = openIDConnectProviderList;
    return this;
  }

  /**
   * Get openIDConnectProviderList
   * @return openIDConnectProviderList
  */
  @Valid 
  @Schema(name = "OpenIDConnectProviderList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OpenIDConnectProviderList")
  public List getOpenIDConnectProviderList() {
    return openIDConnectProviderList;
  }

  public void setOpenIDConnectProviderList(List openIDConnectProviderList) {
    this.openIDConnectProviderList = openIDConnectProviderList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOpenIDConnectProvidersResponse listOpenIDConnectProvidersResponse = (ListOpenIDConnectProvidersResponse) o;
    return Objects.equals(this.openIDConnectProviderList, listOpenIDConnectProvidersResponse.openIDConnectProviderList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openIDConnectProviderList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOpenIDConnectProvidersResponse {\n");
    sb.append("    openIDConnectProviderList: ").append(toIndentedString(openIDConnectProviderList)).append("\n");
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

