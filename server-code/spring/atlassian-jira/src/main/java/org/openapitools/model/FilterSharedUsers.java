package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.User;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A paginated list of the users that the filter is shared with. This includes users that are members of the groups or can browse the projects that the filter is shared with.
 */

@Schema(name = "Filter_sharedUsers", description = "A paginated list of the users that the filter is shared with. This includes users that are members of the groups or can browse the projects that the filter is shared with.")
@JsonTypeName("Filter_sharedUsers")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FilterSharedUsers {

  private Integer endIndex;

  @Valid
  private List<@Valid User> items;

  private Integer maxResults;

  private Integer size;

  private Integer startIndex;

  public FilterSharedUsers endIndex(Integer endIndex) {
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

  public FilterSharedUsers items(List<@Valid User> items) {
    this.items = items;
    return this;
  }

  public FilterSharedUsers addItemsItem(User itemsItem) {
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
  public List<@Valid User> getItems() {
    return items;
  }

  public void setItems(List<@Valid User> items) {
    this.items = items;
  }

  public FilterSharedUsers maxResults(Integer maxResults) {
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

  public FilterSharedUsers size(Integer size) {
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

  public FilterSharedUsers startIndex(Integer startIndex) {
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
    FilterSharedUsers filterSharedUsers = (FilterSharedUsers) o;
    return Objects.equals(this.endIndex, filterSharedUsers.endIndex) &&
        Objects.equals(this.items, filterSharedUsers.items) &&
        Objects.equals(this.maxResults, filterSharedUsers.maxResults) &&
        Objects.equals(this.size, filterSharedUsers.size) &&
        Objects.equals(this.startIndex, filterSharedUsers.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endIndex, items, maxResults, size, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterSharedUsers {\n");
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

