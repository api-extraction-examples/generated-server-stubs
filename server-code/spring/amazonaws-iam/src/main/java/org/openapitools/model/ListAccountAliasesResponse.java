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
 * Contains the response to a successful &lt;a&gt;ListAccountAliases&lt;/a&gt; request. 
 */

@Schema(name = "ListAccountAliasesResponse", description = "Contains the response to a successful <a>ListAccountAliases</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListAccountAliasesResponse {

  private List accountAliases;

  private Boolean isTruncated;

  private String marker;

  public ListAccountAliasesResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ListAccountAliasesResponse(List accountAliases) {
    this.accountAliases = accountAliases;
  }

  public ListAccountAliasesResponse accountAliases(List accountAliases) {
    this.accountAliases = accountAliases;
    return this;
  }

  /**
   * Get accountAliases
   * @return accountAliases
  */
  @NotNull @Valid 
  @Schema(name = "AccountAliases", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AccountAliases")
  public List getAccountAliases() {
    return accountAliases;
  }

  public void setAccountAliases(List accountAliases) {
    this.accountAliases = accountAliases;
  }

  public ListAccountAliasesResponse isTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
    return this;
  }

  /**
   * Get isTruncated
   * @return isTruncated
  */
  
  @Schema(name = "IsTruncated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsTruncated")
  public Boolean getIsTruncated() {
    return isTruncated;
  }

  public void setIsTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
  }

  public ListAccountAliasesResponse marker(String marker) {
    this.marker = marker;
    return this;
  }

  /**
   * Get marker
   * @return marker
  */
  
  @Schema(name = "Marker", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Marker")
  public String getMarker() {
    return marker;
  }

  public void setMarker(String marker) {
    this.marker = marker;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAccountAliasesResponse listAccountAliasesResponse = (ListAccountAliasesResponse) o;
    return Objects.equals(this.accountAliases, listAccountAliasesResponse.accountAliases) &&
        Objects.equals(this.isTruncated, listAccountAliasesResponse.isTruncated) &&
        Objects.equals(this.marker, listAccountAliasesResponse.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountAliases, isTruncated, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAccountAliasesResponse {\n");
    sb.append("    accountAliases: ").append(toIndentedString(accountAliases)).append("\n");
    sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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

