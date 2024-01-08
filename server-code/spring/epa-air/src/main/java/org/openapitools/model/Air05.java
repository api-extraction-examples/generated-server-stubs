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
import org.openapitools.model.Air04;
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

@Schema(name = "air05", description = "Results Object")
@JsonTypeName("air05")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:47.778831-04:00[America/Lower_Princes]")
public class Air05 {

  private String badSystemIDs;

  private String cvRows;

  private String feARows;

  @Valid
  private List<@Valid Air03> facilities;

  private String inSPRows;

  private String indianCountryRows;

  private String infFEARows;

  private Air04 mapOutput;

  private String message;

  private String pageNo;

  private String queryID;

  private String queryRows;

  private String svRows;

  private String totalPenalties;

  private String v3Rows;

  public Air05() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Air05(String badSystemIDs, String cvRows, String feARows, String inSPRows, String indianCountryRows, String infFEARows, String message, String pageNo, String queryID, String queryRows, String svRows, String totalPenalties, String v3Rows) {
    this.badSystemIDs = badSystemIDs;
    this.cvRows = cvRows;
    this.feARows = feARows;
    this.inSPRows = inSPRows;
    this.indianCountryRows = indianCountryRows;
    this.infFEARows = infFEARows;
    this.message = message;
    this.pageNo = pageNo;
    this.queryID = queryID;
    this.queryRows = queryRows;
    this.svRows = svRows;
    this.totalPenalties = totalPenalties;
    this.v3Rows = v3Rows;
  }

  public Air05 badSystemIDs(String badSystemIDs) {
    this.badSystemIDs = badSystemIDs;
    return this;
  }

  /**
   * Identifies which passed query system identifiers are invalid.
   * @return badSystemIDs
  */
  @NotNull 
  @Schema(name = "BadSystemIDs", description = "Identifies which passed query system identifiers are invalid.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("BadSystemIDs")
  public String getBadSystemIDs() {
    return badSystemIDs;
  }

  public void setBadSystemIDs(String badSystemIDs) {
    this.badSystemIDs = badSystemIDs;
  }

  public Air05 cvRows(String cvRows) {
    this.cvRows = cvRows;
    return this;
  }

  /**
   * Summary count of the number of CWA facilities or SDWA public drinking water systems with current violations.
   * @return cvRows
  */
  @NotNull 
  @Schema(name = "CVRows", example = "0", description = "Summary count of the number of CWA facilities or SDWA public drinking water systems with current violations.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CVRows")
  public String getCvRows() {
    return cvRows;
  }

  public void setCvRows(String cvRows) {
    this.cvRows = cvRows;
  }

  public Air05 feARows(String feARows) {
    this.feARows = feARows;
    return this;
  }

  /**
   * Summary count of the number of facilities with a formal enforcement action in the past five years
   * @return feARows
  */
  @NotNull 
  @Schema(name = "FEARows", example = "1", description = "Summary count of the number of facilities with a formal enforcement action in the past five years", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FEARows")
  public String getFeARows() {
    return feARows;
  }

  public void setFeARows(String feARows) {
    this.feARows = feARows;
  }

  public Air05 facilities(List<@Valid Air03> facilities) {
    this.facilities = facilities;
    return this;
  }

  public Air05 addFacilitiesItem(Air03 facilitiesItem) {
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
  @Valid 
  @Schema(name = "Facilities", description = "A complex array of facility information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Facilities")
  public List<@Valid Air03> getFacilities() {
    return facilities;
  }

  public void setFacilities(List<@Valid Air03> facilities) {
    this.facilities = facilities;
  }

  public Air05 inSPRows(String inSPRows) {
    this.inSPRows = inSPRows;
    return this;
  }

  /**
   * Number of facilities with insp_5yr_flag populated (CWP_DATE_LAST_INSPECTION)
   * @return inSPRows
  */
  @NotNull 
  @Schema(name = "INSPRows", example = "1", description = "Number of facilities with insp_5yr_flag populated (CWP_DATE_LAST_INSPECTION)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("INSPRows")
  public String getInSPRows() {
    return inSPRows;
  }

  public void setInSPRows(String inSPRows) {
    this.inSPRows = inSPRows;
  }

  public Air05 indianCountryRows(String indianCountryRows) {
    this.indianCountryRows = indianCountryRows;
    return this;
  }

  /**
   * Number of facilities with tribal_flag populated
   * @return indianCountryRows
  */
  @NotNull 
  @Schema(name = "IndianCountryRows", example = "0", description = "Number of facilities with tribal_flag populated", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("IndianCountryRows")
  public String getIndianCountryRows() {
    return indianCountryRows;
  }

  public void setIndianCountryRows(String indianCountryRows) {
    this.indianCountryRows = indianCountryRows;
  }

  public Air05 infFEARows(String infFEARows) {
    this.infFEARows = infFEARows;
    return this;
  }

  /**
   * Number of facilities with infea_5yr_flag populated (INFORMAL_ENF_ACT_COUNT > 0)
   * @return infFEARows
  */
  @NotNull 
  @Schema(name = "InfFEARows", example = "0", description = "Number of facilities with infea_5yr_flag populated (INFORMAL_ENF_ACT_COUNT > 0)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("InfFEARows")
  public String getInfFEARows() {
    return infFEARows;
  }

  public void setInfFEARows(String infFEARows) {
    this.infFEARows = infFEARows;
  }

  public Air05 mapOutput(Air04 mapOutput) {
    this.mapOutput = mapOutput;
    return this;
  }

  /**
   * Get mapOutput
   * @return mapOutput
  */
  @Valid 
  @Schema(name = "MapOutput", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MapOutput")
  public Air04 getMapOutput() {
    return mapOutput;
  }

  public void setMapOutput(Air04 mapOutput) {
    this.mapOutput = mapOutput;
  }

  public Air05 message(String message) {
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

  public Air05 pageNo(String pageNo) {
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

  public Air05 queryID(String queryID) {
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

  public Air05 queryRows(String queryRows) {
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

  public Air05 svRows(String svRows) {
    this.svRows = svRows;
    return this;
  }

  /**
   * Number of facilities with curr_sv_flag populated (CWP_STATUS = \"Significant Violation\")
   * @return svRows
  */
  @NotNull 
  @Schema(name = "SVRows", example = "0", description = "Number of facilities with curr_sv_flag populated (CWP_STATUS = \"Significant Violation\")", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SVRows")
  public String getSvRows() {
    return svRows;
  }

  public void setSvRows(String svRows) {
    this.svRows = svRows;
  }

  public Air05 totalPenalties(String totalPenalties) {
    this.totalPenalties = totalPenalties;
    return this;
  }

  /**
   * The total dollar amount of either assessed or final penalties within the five year time period
   * @return totalPenalties
  */
  @NotNull 
  @Schema(name = "TotalPenalties", example = "$963,531", description = "The total dollar amount of either assessed or final penalties within the five year time period", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TotalPenalties")
  public String getTotalPenalties() {
    return totalPenalties;
  }

  public void setTotalPenalties(String totalPenalties) {
    this.totalPenalties = totalPenalties;
  }

  public Air05 v3Rows(String v3Rows) {
    this.v3Rows = v3Rows;
    return this;
  }

  /**
   * Number of facilities having one or more quarters in non-compliance (QNC) in the last three years
   * @return v3Rows
  */
  @NotNull 
  @Schema(name = "V3Rows", example = "2", description = "Number of facilities having one or more quarters in non-compliance (QNC) in the last three years", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("V3Rows")
  public String getV3Rows() {
    return v3Rows;
  }

  public void setV3Rows(String v3Rows) {
    this.v3Rows = v3Rows;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Air05 air05 = (Air05) o;
    return Objects.equals(this.badSystemIDs, air05.badSystemIDs) &&
        Objects.equals(this.cvRows, air05.cvRows) &&
        Objects.equals(this.feARows, air05.feARows) &&
        Objects.equals(this.facilities, air05.facilities) &&
        Objects.equals(this.inSPRows, air05.inSPRows) &&
        Objects.equals(this.indianCountryRows, air05.indianCountryRows) &&
        Objects.equals(this.infFEARows, air05.infFEARows) &&
        Objects.equals(this.mapOutput, air05.mapOutput) &&
        Objects.equals(this.message, air05.message) &&
        Objects.equals(this.pageNo, air05.pageNo) &&
        Objects.equals(this.queryID, air05.queryID) &&
        Objects.equals(this.queryRows, air05.queryRows) &&
        Objects.equals(this.svRows, air05.svRows) &&
        Objects.equals(this.totalPenalties, air05.totalPenalties) &&
        Objects.equals(this.v3Rows, air05.v3Rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(badSystemIDs, cvRows, feARows, facilities, inSPRows, indianCountryRows, infFEARows, mapOutput, message, pageNo, queryID, queryRows, svRows, totalPenalties, v3Rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Air05 {\n");
    sb.append("    badSystemIDs: ").append(toIndentedString(badSystemIDs)).append("\n");
    sb.append("    cvRows: ").append(toIndentedString(cvRows)).append("\n");
    sb.append("    feARows: ").append(toIndentedString(feARows)).append("\n");
    sb.append("    facilities: ").append(toIndentedString(facilities)).append("\n");
    sb.append("    inSPRows: ").append(toIndentedString(inSPRows)).append("\n");
    sb.append("    indianCountryRows: ").append(toIndentedString(indianCountryRows)).append("\n");
    sb.append("    infFEARows: ").append(toIndentedString(infFEARows)).append("\n");
    sb.append("    mapOutput: ").append(toIndentedString(mapOutput)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    queryID: ").append(toIndentedString(queryID)).append("\n");
    sb.append("    queryRows: ").append(toIndentedString(queryRows)).append("\n");
    sb.append("    svRows: ").append(toIndentedString(svRows)).append("\n");
    sb.append("    totalPenalties: ").append(toIndentedString(totalPenalties)).append("\n");
    sb.append("    v3Rows: ").append(toIndentedString(v3Rows)).append("\n");
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

