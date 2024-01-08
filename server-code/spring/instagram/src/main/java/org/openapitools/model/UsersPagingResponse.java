package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CursorPaginationInfo;
import org.openapitools.model.MetaData;
import org.openapitools.model.UserShortInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UsersPagingResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:07.987869-04:00[America/Lower_Princes]")
public class UsersPagingResponse {

  @Valid
  private List<@Valid UserShortInfo> data;

  private MetaData meta;

  private CursorPaginationInfo pagination;

  public UsersPagingResponse data(List<@Valid UserShortInfo> data) {
    this.data = data;
    return this;
  }

  public UsersPagingResponse addDataItem(UserShortInfo dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * List of user short information entries
   * @return data
  */
  @Valid 
  @Schema(name = "data", description = "List of user short information entries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public List<@Valid UserShortInfo> getData() {
    return data;
  }

  public void setData(List<@Valid UserShortInfo> data) {
    this.data = data;
  }

  public UsersPagingResponse meta(MetaData meta) {
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

  public UsersPagingResponse pagination(CursorPaginationInfo pagination) {
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
  public CursorPaginationInfo getPagination() {
    return pagination;
  }

  public void setPagination(CursorPaginationInfo pagination) {
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
    UsersPagingResponse usersPagingResponse = (UsersPagingResponse) o;
    return Objects.equals(this.data, usersPagingResponse.data) &&
        Objects.equals(this.meta, usersPagingResponse.meta) &&
        Objects.equals(this.pagination, usersPagingResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersPagingResponse {\n");
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

