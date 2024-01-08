package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Air01;
import org.openapitools.model.Air06;
import org.openapitools.model.Qp0;
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

@Schema(name = "air08", description = "Results Object")
@JsonTypeName("air08")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:47.778831-04:00[America/Lower_Princes]")
public class Air08 {

  private String badSystemIDs;

  private String cvRows;

  private Air01 clusterOutput;

  private String clusterRecords;

  private String feARows;

  @Valid
  private List<@Valid Air06> facilities;

  private String inSPRows;

  private String iconBaseURL;

  private String indianCountryRows;

  private String infFEARows;

  private String message;

  private String popUpBaseURL;

  private String queryID;

  @Valid
  private List<@Valid Qp0> queryParameters = new ArrayList<>();

  private String queryRows;

  private String svRows;

  private String serviceBaseURL;

  private String totalPenalties;

  private String v3Rows;

  public Air08() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Air08(String badSystemIDs, String cvRows, String feARows, String inSPRows, String iconBaseURL, String indianCountryRows, String infFEARows, String message, String popUpBaseURL, String queryID, List<@Valid Qp0> queryParameters, String queryRows, String svRows, String serviceBaseURL, String totalPenalties, String v3Rows) {
    this.badSystemIDs = badSystemIDs;
    this.cvRows = cvRows;
    this.feARows = feARows;
    this.inSPRows = inSPRows;
    this.iconBaseURL = iconBaseURL;
    this.indianCountryRows = indianCountryRows;
    this.infFEARows = infFEARows;
    this.message = message;
    this.popUpBaseURL = popUpBaseURL;
    this.queryID = queryID;
    this.queryParameters = queryParameters;
    this.queryRows = queryRows;
    this.svRows = svRows;
    this.serviceBaseURL = serviceBaseURL;
    this.totalPenalties = totalPenalties;
    this.v3Rows = v3Rows;
  }

  public Air08 badSystemIDs(String badSystemIDs) {
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

  public Air08 cvRows(String cvRows) {
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

  public Air08 clusterOutput(Air01 clusterOutput) {
    this.clusterOutput = clusterOutput;
    return this;
  }

  /**
   * Get clusterOutput
   * @return clusterOutput
  */
  @Valid 
  @Schema(name = "ClusterOutput", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ClusterOutput")
  public Air01 getClusterOutput() {
    return clusterOutput;
  }

  public void setClusterOutput(Air01 clusterOutput) {
    this.clusterOutput = clusterOutput;
  }

  public Air08 clusterRecords(String clusterRecords) {
    this.clusterRecords = clusterRecords;
    return this;
  }

  /**
   * Number of clusters returned.
   * @return clusterRecords
  */
  
  @Schema(name = "ClusterRecords", example = "199", description = "Number of clusters returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ClusterRecords")
  public String getClusterRecords() {
    return clusterRecords;
  }

  public void setClusterRecords(String clusterRecords) {
    this.clusterRecords = clusterRecords;
  }

  public Air08 feARows(String feARows) {
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

  public Air08 facilities(List<@Valid Air06> facilities) {
    this.facilities = facilities;
    return this;
  }

  public Air08 addFacilitiesItem(Air06 facilitiesItem) {
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
  public List<@Valid Air06> getFacilities() {
    return facilities;
  }

  public void setFacilities(List<@Valid Air06> facilities) {
    this.facilities = facilities;
  }

  public Air08 inSPRows(String inSPRows) {
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

  public Air08 iconBaseURL(String iconBaseURL) {
    this.iconBaseURL = iconBaseURL;
    return this;
  }

  /**
   * URL where all the icons are located
   * @return iconBaseURL
  */
  @NotNull 
  @Schema(name = "IconBaseURL", example = "https://echo.epa.gov/app/map/icons/", description = "URL where all the icons are located", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("IconBaseURL")
  public String getIconBaseURL() {
    return iconBaseURL;
  }

  public void setIconBaseURL(String iconBaseURL) {
    this.iconBaseURL = iconBaseURL;
  }

  public Air08 indianCountryRows(String indianCountryRows) {
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

  public Air08 infFEARows(String infFEARows) {
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

  public Air08 message(String message) {
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

  public Air08 popUpBaseURL(String popUpBaseURL) {
    this.popUpBaseURL = popUpBaseURL;
    return this;
  }

  /**
   * Combine this URL with the PUC to get popup info
   * @return popUpBaseURL
  */
  @NotNull 
  @Schema(name = "PopUpBaseURL", example = "https://echodata.epa.gov/echo/cwa_rest_services.pop_up?p_id=", description = "Combine this URL with the PUC to get popup info", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PopUpBaseURL")
  public String getPopUpBaseURL() {
    return popUpBaseURL;
  }

  public void setPopUpBaseURL(String popUpBaseURL) {
    this.popUpBaseURL = popUpBaseURL;
  }

  public Air08 queryID(String queryID) {
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

  public Air08 queryParameters(List<@Valid Qp0> queryParameters) {
    this.queryParameters = queryParameters;
    return this;
  }

  public Air08 addQueryParametersItem(Qp0 queryParametersItem) {
    if (this.queryParameters == null) {
      this.queryParameters = new ArrayList<>();
    }
    this.queryParameters.add(queryParametersItem);
    return this;
  }

  /**
   * A list of submitted query parameters and their values.
   * @return queryParameters
  */
  @NotNull @Valid 
  @Schema(name = "QueryParameters", description = "A list of submitted query parameters and their values.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("QueryParameters")
  public List<@Valid Qp0> getQueryParameters() {
    return queryParameters;
  }

  public void setQueryParameters(List<@Valid Qp0> queryParameters) {
    this.queryParameters = queryParameters;
  }

  public Air08 queryRows(String queryRows) {
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

  public Air08 svRows(String svRows) {
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

  public Air08 serviceBaseURL(String serviceBaseURL) {
    this.serviceBaseURL = serviceBaseURL;
    return this;
  }

  /**
   * The base service URL.
   * @return serviceBaseURL
  */
  @NotNull 
  @Schema(name = "ServiceBaseURL", example = "https://echodata.epa.gov/echo/echo_rest_services.get_facility_info", description = "The base service URL.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ServiceBaseURL")
  public String getServiceBaseURL() {
    return serviceBaseURL;
  }

  public void setServiceBaseURL(String serviceBaseURL) {
    this.serviceBaseURL = serviceBaseURL;
  }

  public Air08 totalPenalties(String totalPenalties) {
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

  public Air08 v3Rows(String v3Rows) {
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
    Air08 air08 = (Air08) o;
    return Objects.equals(this.badSystemIDs, air08.badSystemIDs) &&
        Objects.equals(this.cvRows, air08.cvRows) &&
        Objects.equals(this.clusterOutput, air08.clusterOutput) &&
        Objects.equals(this.clusterRecords, air08.clusterRecords) &&
        Objects.equals(this.feARows, air08.feARows) &&
        Objects.equals(this.facilities, air08.facilities) &&
        Objects.equals(this.inSPRows, air08.inSPRows) &&
        Objects.equals(this.iconBaseURL, air08.iconBaseURL) &&
        Objects.equals(this.indianCountryRows, air08.indianCountryRows) &&
        Objects.equals(this.infFEARows, air08.infFEARows) &&
        Objects.equals(this.message, air08.message) &&
        Objects.equals(this.popUpBaseURL, air08.popUpBaseURL) &&
        Objects.equals(this.queryID, air08.queryID) &&
        Objects.equals(this.queryParameters, air08.queryParameters) &&
        Objects.equals(this.queryRows, air08.queryRows) &&
        Objects.equals(this.svRows, air08.svRows) &&
        Objects.equals(this.serviceBaseURL, air08.serviceBaseURL) &&
        Objects.equals(this.totalPenalties, air08.totalPenalties) &&
        Objects.equals(this.v3Rows, air08.v3Rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(badSystemIDs, cvRows, clusterOutput, clusterRecords, feARows, facilities, inSPRows, iconBaseURL, indianCountryRows, infFEARows, message, popUpBaseURL, queryID, queryParameters, queryRows, svRows, serviceBaseURL, totalPenalties, v3Rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Air08 {\n");
    sb.append("    badSystemIDs: ").append(toIndentedString(badSystemIDs)).append("\n");
    sb.append("    cvRows: ").append(toIndentedString(cvRows)).append("\n");
    sb.append("    clusterOutput: ").append(toIndentedString(clusterOutput)).append("\n");
    sb.append("    clusterRecords: ").append(toIndentedString(clusterRecords)).append("\n");
    sb.append("    feARows: ").append(toIndentedString(feARows)).append("\n");
    sb.append("    facilities: ").append(toIndentedString(facilities)).append("\n");
    sb.append("    inSPRows: ").append(toIndentedString(inSPRows)).append("\n");
    sb.append("    iconBaseURL: ").append(toIndentedString(iconBaseURL)).append("\n");
    sb.append("    indianCountryRows: ").append(toIndentedString(indianCountryRows)).append("\n");
    sb.append("    infFEARows: ").append(toIndentedString(infFEARows)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    popUpBaseURL: ").append(toIndentedString(popUpBaseURL)).append("\n");
    sb.append("    queryID: ").append(toIndentedString(queryID)).append("\n");
    sb.append("    queryParameters: ").append(toIndentedString(queryParameters)).append("\n");
    sb.append("    queryRows: ").append(toIndentedString(queryRows)).append("\n");
    sb.append("    svRows: ").append(toIndentedString(svRows)).append("\n");
    sb.append("    serviceBaseURL: ").append(toIndentedString(serviceBaseURL)).append("\n");
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

