package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GroupName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The groups that the user belongs to.
 */

@Schema(name = "User_groups", description = "The groups that the user belongs to.")
@JsonTypeName("User_groups")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class UserGroups {

  private Object callback;

  @Valid
  private List<@Valid GroupName> items;

  private Integer maxResults;

  private Object pagingCallback;

  private Integer size;

  public UserGroups callback(Object callback) {
    this.callback = callback;
    return this;
  }

  /**
   * Get callback
   * @return callback
  */
  
  @Schema(name = "callback", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("callback")
  public Object getCallback() {
    return callback;
  }

  public void setCallback(Object callback) {
    this.callback = callback;
  }

  public UserGroups items(List<@Valid GroupName> items) {
    this.items = items;
    return this;
  }

  public UserGroups addItemsItem(GroupName itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid GroupName> getItems() {
    return items;
  }

  public void setItems(List<@Valid GroupName> items) {
    this.items = items;
  }

  public UserGroups maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * Get maxResults
   * @return maxResults
  */
  
  @Schema(name = "max-results", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max-results")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public UserGroups pagingCallback(Object pagingCallback) {
    this.pagingCallback = pagingCallback;
    return this;
  }

  /**
   * Get pagingCallback
   * @return pagingCallback
  */
  
  @Schema(name = "pagingCallback", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pagingCallback")
  public Object getPagingCallback() {
    return pagingCallback;
  }

  public void setPagingCallback(Object pagingCallback) {
    this.pagingCallback = pagingCallback;
  }

  public UserGroups size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
  
  @Schema(name = "size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGroups userGroups = (UserGroups) o;
    return Objects.equals(this.callback, userGroups.callback) &&
        Objects.equals(this.items, userGroups.items) &&
        Objects.equals(this.maxResults, userGroups.maxResults) &&
        Objects.equals(this.pagingCallback, userGroups.pagingCallback) &&
        Objects.equals(this.size, userGroups.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callback, items, maxResults, pagingCallback, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGroups {\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    pagingCallback: ").append(toIndentedString(pagingCallback)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

