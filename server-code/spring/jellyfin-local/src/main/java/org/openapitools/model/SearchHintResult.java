package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SearchHint;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class SearchHintResult.
 */

@Schema(name = "SearchHintResult", description = "Class SearchHintResult.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class SearchHintResult {

  @Valid
  private JsonNullable<List<@Valid SearchHint>> searchHints = JsonNullable.<List<@Valid SearchHint>>undefined();

  private Integer totalRecordCount;

  public SearchHintResult searchHints(List<@Valid SearchHint> searchHints) {
    this.searchHints = JsonNullable.of(searchHints);
    return this;
  }

  public SearchHintResult addSearchHintsItem(SearchHint searchHintsItem) {
    if (this.searchHints == null || !this.searchHints.isPresent()) {
      this.searchHints = JsonNullable.of(new ArrayList<>());
    }
    this.searchHints.get().add(searchHintsItem);
    return this;
  }

  /**
   * Gets or sets the search hints.
   * @return searchHints
  */
  @Valid 
  @Schema(name = "SearchHints", description = "Gets or sets the search hints.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SearchHints")
  public JsonNullable<List<@Valid SearchHint>> getSearchHints() {
    return searchHints;
  }

  public void setSearchHints(JsonNullable<List<@Valid SearchHint>> searchHints) {
    this.searchHints = searchHints;
  }

  public SearchHintResult totalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
    return this;
  }

  /**
   * Gets or sets the total record count.
   * @return totalRecordCount
  */
  
  @Schema(name = "TotalRecordCount", description = "Gets or sets the total record count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    SearchHintResult searchHintResult = (SearchHintResult) o;
    return equalsNullable(this.searchHints, searchHintResult.searchHints) &&
        Objects.equals(this.totalRecordCount, searchHintResult.totalRecordCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(searchHints), totalRecordCount);
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
    sb.append("class SearchHintResult {\n");
    sb.append("    searchHints: ").append(toIndentedString(searchHints)).append("\n");
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

