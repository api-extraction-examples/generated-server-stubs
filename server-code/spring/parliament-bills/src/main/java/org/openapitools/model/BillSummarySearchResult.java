package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BillSummary;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BillSummarySearchResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:54:38.614249-04:00[America/Lower_Princes]")
public class BillSummarySearchResult {

  @Valid
  private JsonNullable<List<@Valid BillSummary>> items = JsonNullable.<List<@Valid BillSummary>>undefined();

  private Integer itemsPerPage;

  private Integer totalResults;

  public BillSummarySearchResult items(List<@Valid BillSummary> items) {
    this.items = JsonNullable.of(items);
    return this;
  }

  public BillSummarySearchResult addItemsItem(BillSummary itemsItem) {
    if (this.items == null || !this.items.isPresent()) {
      this.items = JsonNullable.of(new ArrayList<>());
    }
    this.items.get().add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public JsonNullable<List<@Valid BillSummary>> getItems() {
    return items;
  }

  public void setItems(JsonNullable<List<@Valid BillSummary>> items) {
    this.items = items;
  }

  public BillSummarySearchResult itemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

  /**
   * Get itemsPerPage
   * @return itemsPerPage
  */
  
  @Schema(name = "itemsPerPage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemsPerPage")
  public Integer getItemsPerPage() {
    return itemsPerPage;
  }

  public void setItemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }

  public BillSummarySearchResult totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  /**
   * Get totalResults
   * @return totalResults
  */
  
  @Schema(name = "totalResults", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalResults")
  public Integer getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillSummarySearchResult billSummarySearchResult = (BillSummarySearchResult) o;
    return equalsNullable(this.items, billSummarySearchResult.items) &&
        Objects.equals(this.itemsPerPage, billSummarySearchResult.itemsPerPage) &&
        Objects.equals(this.totalResults, billSummarySearchResult.totalResults);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(items), itemsPerPage, totalResults);
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
    sb.append("class BillSummarySearchResult {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
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

