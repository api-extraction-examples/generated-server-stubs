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
 * PortfolioAddItemRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class PortfolioAddItemRequest {

  private String insertAfter;

  private String insertBefore;

  private String item;

  public PortfolioAddItemRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PortfolioAddItemRequest(String item) {
    this.item = item;
  }

  public PortfolioAddItemRequest insertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
    return this;
  }

  /**
   * An id of an item in this portfolio. The new item will be added after the one specified here. `insert_before` and `insert_after` parameters cannot both be specified.
   * @return insertAfter
  */
  
  @Schema(name = "insert_after", example = "1331", description = "An id of an item in this portfolio. The new item will be added after the one specified here. `insert_before` and `insert_after` parameters cannot both be specified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_after")
  public String getInsertAfter() {
    return insertAfter;
  }

  public void setInsertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
  }

  public PortfolioAddItemRequest insertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
    return this;
  }

  /**
   * An id of an item in this portfolio. The new item will be added before the one specified here. `insert_before` and `insert_after` parameters cannot both be specified.
   * @return insertBefore
  */
  
  @Schema(name = "insert_before", example = "1331", description = "An id of an item in this portfolio. The new item will be added before the one specified here. `insert_before` and `insert_after` parameters cannot both be specified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_before")
  public String getInsertBefore() {
    return insertBefore;
  }

  public void setInsertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
  }

  public PortfolioAddItemRequest item(String item) {
    this.item = item;
    return this;
  }

  /**
   * The item to add to the portfolio.
   * @return item
  */
  @NotNull 
  @Schema(name = "item", example = "1331", description = "The item to add to the portfolio.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item")
  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioAddItemRequest portfolioAddItemRequest = (PortfolioAddItemRequest) o;
    return Objects.equals(this.insertAfter, portfolioAddItemRequest.insertAfter) &&
        Objects.equals(this.insertBefore, portfolioAddItemRequest.insertBefore) &&
        Objects.equals(this.item, portfolioAddItemRequest.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insertAfter, insertBefore, item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioAddItemRequest {\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
    sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

