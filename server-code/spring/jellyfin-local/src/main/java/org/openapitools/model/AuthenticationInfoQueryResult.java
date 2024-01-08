package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AuthenticationInfo;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AuthenticationInfoQueryResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class AuthenticationInfoQueryResult {

  @Valid
  private JsonNullable<List<@Valid AuthenticationInfo>> items = JsonNullable.<List<@Valid AuthenticationInfo>>undefined();

  private Integer startIndex;

  private Integer totalRecordCount;

  public AuthenticationInfoQueryResult items(List<@Valid AuthenticationInfo> items) {
    this.items = JsonNullable.of(items);
    return this;
  }

  public AuthenticationInfoQueryResult addItemsItem(AuthenticationInfo itemsItem) {
    if (this.items == null || !this.items.isPresent()) {
      this.items = JsonNullable.of(new ArrayList<>());
    }
    this.items.get().add(itemsItem);
    return this;
  }

  /**
   * Gets or sets the items.
   * @return items
  */
  @Valid 
  @Schema(name = "Items", description = "Gets or sets the items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Items")
  public JsonNullable<List<@Valid AuthenticationInfo>> getItems() {
    return items;
  }

  public void setItems(JsonNullable<List<@Valid AuthenticationInfo>> items) {
    this.items = items;
  }

  public AuthenticationInfoQueryResult startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * The index of the first record in Items.
   * @return startIndex
  */
  
  @Schema(name = "StartIndex", description = "The index of the first record in Items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartIndex")
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public AuthenticationInfoQueryResult totalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
    return this;
  }

  /**
   * The total number of records available.
   * @return totalRecordCount
  */
  
  @Schema(name = "TotalRecordCount", description = "The total number of records available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalRecordCount")
  public Integer getTotalRecordCount() {
    return totalRecordCount;
  }

  public void setTotalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationInfoQueryResult authenticationInfoQueryResult = (AuthenticationInfoQueryResult) o;
    return equalsNullable(this.items, authenticationInfoQueryResult.items) &&
        Objects.equals(this.startIndex, authenticationInfoQueryResult.startIndex) &&
        Objects.equals(this.totalRecordCount, authenticationInfoQueryResult.totalRecordCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(items), startIndex, totalRecordCount);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationInfoQueryResult {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    totalRecordCount: ").append(toIndentedString(totalRecordCount)).append("\n");
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

