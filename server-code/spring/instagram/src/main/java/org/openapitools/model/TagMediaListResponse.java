package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MediaEntry;
import org.openapitools.model.MetaData;
import org.openapitools.model.TagPaginationInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TagMediaListResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:07.987869-04:00[America/Lower_Princes]")
public class TagMediaListResponse {

  @Valid
  private List<@Valid MediaEntry> data;

  private MetaData meta;

  private TagPaginationInfo pagination;

  public TagMediaListResponse data(List<@Valid MediaEntry> data) {
    this.data = data;
    return this;
  }

  public TagMediaListResponse addDataItem(MediaEntry dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * List of media entries with this tag
   * @return data
  */
  @Valid 
  @Schema(name = "data", description = "List of media entries with this tag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public List<@Valid MediaEntry> getData() {
    return data;
  }

  public void setData(List<@Valid MediaEntry> data) {
    this.data = data;
  }

  public TagMediaListResponse meta(MetaData meta) {
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
  public MetaData getMeta() {
    return meta;
  }

  public void setMeta(MetaData meta) {
    this.meta = meta;
  }

  public TagMediaListResponse pagination(TagPaginationInfo pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   * @return pagination
  */
  @Valid 
  @Schema(name = "pagination", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pagination")
  public TagPaginationInfo getPagination() {
    return pagination;
  }

  public void setPagination(TagPaginationInfo pagination) {
    this.pagination = pagination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagMediaListResponse tagMediaListResponse = (TagMediaListResponse) o;
    return Objects.equals(this.data, tagMediaListResponse.data) &&
        Objects.equals(this.meta, tagMediaListResponse.meta) &&
        Objects.equals(this.pagination, tagMediaListResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagMediaListResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

