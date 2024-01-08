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
 * IdPaginationInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:07.987869-04:00[America/Lower_Princes]")
public class IdPaginationInfo {

  private String nextMaxId;

  private String nextUrl;

  public IdPaginationInfo nextMaxId(String nextMaxId) {
    this.nextMaxId = nextMaxId;
    return this;
  }

  /**
   * The max ID of the next page
   * @return nextMaxId
  */
  
  @Schema(name = "next_max_id", description = "The max ID of the next page", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next_max_id")
  public String getNextMaxId() {
    return nextMaxId;
  }

  public void setNextMaxId(String nextMaxId) {
    this.nextMaxId = nextMaxId;
  }

  public IdPaginationInfo nextUrl(String nextUrl) {
    this.nextUrl = nextUrl;
    return this;
  }

  /**
   * URL to retrieve next page of entries
   * @return nextUrl
  */
  
  @Schema(name = "next_url", description = "URL to retrieve next page of entries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next_url")
  public String getNextUrl() {
    return nextUrl;
  }

  public void setNextUrl(String nextUrl) {
    this.nextUrl = nextUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdPaginationInfo idPaginationInfo = (IdPaginationInfo) o;
    return Objects.equals(this.nextMaxId, idPaginationInfo.nextMaxId) &&
        Objects.equals(this.nextUrl, idPaginationInfo.nextUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextMaxId, nextUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdPaginationInfo {\n");
    sb.append("    nextMaxId: ").append(toIndentedString(nextMaxId)).append("\n");
    sb.append("    nextUrl: ").append(toIndentedString(nextUrl)).append("\n");
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

