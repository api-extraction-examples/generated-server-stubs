package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Air03;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Results Object
 */

@Schema(name = "air12", description = "Results Object")
@JsonTypeName("air12")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:47.778831-04:00[America/Lower_Princes]")
public class Air12 {

  @Valid
  private List<@Valid Air03> facilities = new ArrayList<>();

  private String message;

  private String pageNo;

  private String queryID;

  private String queryRows;

  public Air12() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Air12(List<@Valid Air03> facilities, String message, String pageNo, String queryID, String queryRows) {
    this.facilities = facilities;
    this.message = message;
    this.pageNo = pageNo;
    this.queryID = queryID;
    this.queryRows = queryRows;
  }

  public Air12 facilities(List<@Valid Air03> facilities) {
    this.facilities = facilities;
    return this;
  }

  public Air12 addFacilitiesItem(Air03 facilitiesItem) {
    if (this.facilities == null) {
      this.facilities = new ArrayList<>();
    }
    this.facilities.add(facilitiesItem);
    return this;
  }

  /**
   * A complex array of facility information.
   * @return facilities
  */
  @NotNull @Valid 
  @Schema(name = "Facilities", description = "A complex array of facility information.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Facilities")
  public List<@Valid Air03> getFacilities() {
    return facilities;
  }

  public void setFacilities(List<@Valid Air03> facilities) {
    this.facilities = facilities;
  }

  public Air12 message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Field to record messages (typically performance-related) about packet processing
   * @return message
  */
  @NotNull 
  @Schema(name = "Message", example = "Success", description = "Field to record messages (typically performance-related) about packet processing", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Air12 pageNo(String pageNo) {
    this.pageNo = pageNo;
    return this;
  }

  /**
   * The number of pages of results returned
   * @return pageNo
  */
  @NotNull 
  @Schema(name = "PageNo", example = "1", description = "The number of pages of results returned", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PageNo")
  public String getPageNo() {
    return pageNo;
  }

  public void setPageNo(String pageNo) {
    this.pageNo = pageNo;
  }

  public Air12 queryID(String queryID) {
    this.queryID = queryID;
    return this;
  }

  /**
   * Sequential number assigned to entire search result
   * @return queryID
  */
  @NotNull 
  @Schema(name = "QueryID", example = "245", description = "Sequential number assigned to entire search result", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("QueryID")
  public String getQueryID() {
    return queryID;
  }

  public void setQueryID(String queryID) {
    this.queryID = queryID;
  }

  public Air12 queryRows(String queryRows) {
    this.queryRows = queryRows;
    return this;
  }

  /**
   * Number of query results returned
   * @return queryRows
  */
  @NotNull 
  @Schema(name = "QueryRows", example = "5", description = "Number of query results returned", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("QueryRows")
  public String getQueryRows() {
    return queryRows;
  }

  public void setQueryRows(String queryRows) {
    this.queryRows = queryRows;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Air12 air12 = (Air12) o;
    return Objects.equals(this.facilities, air12.facilities) &&
        Objects.equals(this.message, air12.message) &&
        Objects.equals(this.pageNo, air12.pageNo) &&
        Objects.equals(this.queryID, air12.queryID) &&
        Objects.equals(this.queryRows, air12.queryRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facilities, message, pageNo, queryID, queryRows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Air12 {\n");
    sb.append("    facilities: ").append(toIndentedString(facilities)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    queryID: ").append(toIndentedString(queryID)).append("\n");
    sb.append("    queryRows: ").append(toIndentedString(queryRows)).append("\n");
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

