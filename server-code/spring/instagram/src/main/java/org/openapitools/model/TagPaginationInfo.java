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
 * TagPaginationInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:07.987869-04:00[America/Lower_Princes]")
public class TagPaginationInfo {

  private String deprecationWarning;

  private String minTagId;

  private String nextMaxId;

  private String nextMaxTagId;

  private String nextMinId;

  private String nextUrl;

  public TagPaginationInfo deprecationWarning(String deprecationWarning) {
    this.deprecationWarning = deprecationWarning;
    return this;
  }

  /**
   * The deprication warning, if information is available
   * @return deprecationWarning
  */
  
  @Schema(name = "deprecation_warning", description = "The deprication warning, if information is available", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deprecation_warning")
  public String getDeprecationWarning() {
    return deprecationWarning;
  }

  public void setDeprecationWarning(String deprecationWarning) {
    this.deprecationWarning = deprecationWarning;
  }

  public TagPaginationInfo minTagId(String minTagId) {
    this.minTagId = minTagId;
    return this;
  }

  /**
   * The min ID of a tag for the next page
   * @return minTagId
  */
  
  @Schema(name = "min_tag_id", description = "The min ID of a tag for the next page", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("min_tag_id")
  public String getMinTagId() {
    return minTagId;
  }

  public void setMinTagId(String minTagId) {
    this.minTagId = minTagId;
  }

  public TagPaginationInfo nextMaxId(String nextMaxId) {
    this.nextMaxId = nextMaxId;
    return this;
  }

  /**
   * Depricated. Use min_tag_id instead
   * @return nextMaxId
  */
  
  @Schema(name = "next_max_id", description = "Depricated. Use min_tag_id instead", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next_max_id")
  public String getNextMaxId() {
    return nextMaxId;
  }

  public void setNextMaxId(String nextMaxId) {
    this.nextMaxId = nextMaxId;
  }

  public TagPaginationInfo nextMaxTagId(String nextMaxTagId) {
    this.nextMaxTagId = nextMaxTagId;
    return this;
  }

  /**
   * The max ID of a tag for the next page
   * @return nextMaxTagId
  */
  
  @Schema(name = "next_max_tag_id", description = "The max ID of a tag for the next page", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next_max_tag_id")
  public String getNextMaxTagId() {
    return nextMaxTagId;
  }

  public void setNextMaxTagId(String nextMaxTagId) {
    this.nextMaxTagId = nextMaxTagId;
  }

  public TagPaginationInfo nextMinId(String nextMinId) {
    this.nextMinId = nextMinId;
    return this;
  }

  /**
   * Depricated. Use max_tag_id instead
   * @return nextMinId
  */
  
  @Schema(name = "next_min_id", description = "Depricated. Use max_tag_id instead", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next_min_id")
  public String getNextMinId() {
    return nextMinId;
  }

  public void setNextMinId(String nextMinId) {
    this.nextMinId = nextMinId;
  }

  public TagPaginationInfo nextUrl(String nextUrl) {
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
    TagPaginationInfo tagPaginationInfo = (TagPaginationInfo) o;
    return Objects.equals(this.deprecationWarning, tagPaginationInfo.deprecationWarning) &&
        Objects.equals(this.minTagId, tagPaginationInfo.minTagId) &&
        Objects.equals(this.nextMaxId, tagPaginationInfo.nextMaxId) &&
        Objects.equals(this.nextMaxTagId, tagPaginationInfo.nextMaxTagId) &&
        Objects.equals(this.nextMinId, tagPaginationInfo.nextMinId) &&
        Objects.equals(this.nextUrl, tagPaginationInfo.nextUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deprecationWarning, minTagId, nextMaxId, nextMaxTagId, nextMinId, nextUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagPaginationInfo {\n");
    sb.append("    deprecationWarning: ").append(toIndentedString(deprecationWarning)).append("\n");
    sb.append("    minTagId: ").append(toIndentedString(minTagId)).append("\n");
    sb.append("    nextMaxId: ").append(toIndentedString(nextMaxId)).append("\n");
    sb.append("    nextMaxTagId: ").append(toIndentedString(nextMaxTagId)).append("\n");
    sb.append("    nextMinId: ").append(toIndentedString(nextMinId)).append("\n");
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

