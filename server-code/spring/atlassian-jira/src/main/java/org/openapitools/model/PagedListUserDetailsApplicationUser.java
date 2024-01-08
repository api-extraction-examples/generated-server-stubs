package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UserDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A paged list. To access additional details append &#x60;[start-index:end-index]&#x60; to the expand request. For example, &#x60;?expand&#x3D;sharedUsers[10:40]&#x60; returns a list starting at item 10 and finishing at item 40.
 */

@Schema(name = "PagedListUserDetailsApplicationUser", description = "A paged list. To access additional details append `[start-index:end-index]` to the expand request. For example, `?expand=sharedUsers[10:40]` returns a list starting at item 10 and finishing at item 40.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class PagedListUserDetailsApplicationUser {

  private Integer endIndex;

  @Valid
  private List<@Valid UserDetails> items;

  private Integer maxResults;

  private Integer size;

  private Integer startIndex;

  public PagedListUserDetailsApplicationUser endIndex(Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

  /**
   * The index of the last item returned on the page.
   * @return endIndex
  */
  
  @Schema(name = "end-index", accessMode = Schema.AccessMode.READ_ONLY, description = "The index of the last item returned on the page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end-index")
  public Integer getEndIndex() {
    return endIndex;
  }

  public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }

  public PagedListUserDetailsApplicationUser items(List<@Valid UserDetails> items) {
    this.items = items;
    return this;
  }

  public PagedListUserDetailsApplicationUser addItemsItem(UserDetails itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * The list of items.
   * @return items
  */
  @Valid 
  @Schema(name = "items", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid UserDetails> getItems() {
    return items;
  }

  public void setItems(List<@Valid UserDetails> items) {
    this.items = items;
  }

  public PagedListUserDetailsApplicationUser maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * The maximum number of results that could be on the page.
   * @return maxResults
  */
  
  @Schema(name = "max-results", accessMode = Schema.AccessMode.READ_ONLY, description = "The maximum number of results that could be on the page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max-results")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public PagedListUserDetailsApplicationUser size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * The number of items on the page.
   * @return size
  */
  
  @Schema(name = "size", accessMode = Schema.AccessMode.READ_ONLY, description = "The number of items on the page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public PagedListUserDetailsApplicationUser startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * The index of the first item returned on the page.
   * @return startIndex
  */
  
  @Schema(name = "start-index", accessMode = Schema.AccessMode.READ_ONLY, description = "The index of the first item returned on the page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start-index")
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedListUserDetailsApplicationUser pagedListUserDetailsApplicationUser = (PagedListUserDetailsApplicationUser) o;
    return Objects.equals(this.endIndex, pagedListUserDetailsApplicationUser.endIndex) &&
        Objects.equals(this.items, pagedListUserDetailsApplicationUser.items) &&
        Objects.equals(this.maxResults, pagedListUserDetailsApplicationUser.maxResults) &&
        Objects.equals(this.size, pagedListUserDetailsApplicationUser.size) &&
        Objects.equals(this.startIndex, pagedListUserDetailsApplicationUser.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endIndex, items, maxResults, size, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedListUserDetailsApplicationUser {\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

