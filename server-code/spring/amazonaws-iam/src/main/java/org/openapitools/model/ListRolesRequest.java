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
 * ListRolesRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListRolesRequest {

  private String pathPrefix;

  private String marker;

  private Integer maxItems;

  public ListRolesRequest pathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
    return this;
  }

  /**
   * Get pathPrefix
   * @return pathPrefix
  */
  
  @Schema(name = "PathPrefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PathPrefix")
  public String getPathPrefix() {
    return pathPrefix;
  }

  public void setPathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
  }

  public ListRolesRequest marker(String marker) {
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

  public ListRolesRequest maxItems(Integer maxItems) {
    this.maxItems = maxItems;
    return this;
  }

  /**
   * Get maxItems
   * @return maxItems
  */
  
  @Schema(name = "MaxItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxItems")
  public Integer getMaxItems() {
    return maxItems;
  }

  public void setMaxItems(Integer maxItems) {
    this.maxItems = maxItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRolesRequest listRolesRequest = (ListRolesRequest) o;
    return Objects.equals(this.pathPrefix, listRolesRequest.pathPrefix) &&
        Objects.equals(this.marker, listRolesRequest.marker) &&
        Objects.equals(this.maxItems, listRolesRequest.maxItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathPrefix, marker, maxItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRolesRequest {\n");
    sb.append("    pathPrefix: ").append(toIndentedString(pathPrefix)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
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

