package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Cluster Data Object
 */

@Schema(name = "air00", description = "Cluster Data Object")
@JsonTypeName("air00")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:47.778831-04:00[America/Lower_Princes]")
public class Air00 {

  private String cvRows;

  private String clusterCount;

  private String clusterIcon;

  private String clusterLatitude;

  private String clusterLongitude;

  private String clusterName;

  private String clusterType;

  private String clusterValue;

  private String epARegionCode;

  private String feARows;

  private String inSPRows;

  private String indianCountryRows;

  private String infFEARows;

  private String objectId;

  private String svRows;

  private String totalPenalties;

  private String v3Rows;

  public Air00() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Air00(String cvRows, String clusterCount, String clusterIcon, String clusterLatitude, String clusterLongitude, String clusterName, String clusterType, String clusterValue, String epARegionCode, String feARows, String inSPRows, String indianCountryRows, String infFEARows, String objectId, String svRows, String totalPenalties, String v3Rows) {
    this.cvRows = cvRows;
    this.clusterCount = clusterCount;
    this.clusterIcon = clusterIcon;
    this.clusterLatitude = clusterLatitude;
    this.clusterLongitude = clusterLongitude;
    this.clusterName = clusterName;
    this.clusterType = clusterType;
    this.clusterValue = clusterValue;
    this.epARegionCode = epARegionCode;
    this.feARows = feARows;
    this.inSPRows = inSPRows;
    this.indianCountryRows = indianCountryRows;
    this.infFEARows = infFEARows;
    this.objectId = objectId;
    this.svRows = svRows;
    this.totalPenalties = totalPenalties;
    this.v3Rows = v3Rows;
  }

  public Air00 cvRows(String cvRows) {
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

  public Air00 clusterCount(String clusterCount) {
    this.clusterCount = clusterCount;
    return this;
  }

  /**
   * The number of facilities or cases in the cluster.
   * @return clusterCount
  */
  @NotNull 
  @Schema(name = "ClusterCount", description = "The number of facilities or cases in the cluster.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ClusterCount")
  public String getClusterCount() {
    return clusterCount;
  }

  public void setClusterCount(String clusterCount) {
    this.clusterCount = clusterCount;
  }

  public Air00 clusterIcon(String clusterIcon) {
    this.clusterIcon = clusterIcon;
    return this;
  }

  /**
   * The icon file used to reprsent the cluster.
   * @return clusterIcon
  */
  @NotNull 
  @Schema(name = "ClusterIcon", description = "The icon file used to reprsent the cluster.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ClusterIcon")
  public String getClusterIcon() {
    return clusterIcon;
  }

  public void setClusterIcon(String clusterIcon) {
    this.clusterIcon = clusterIcon;
  }

  public Air00 clusterLatitude(String clusterLatitude) {
    this.clusterLatitude = clusterLatitude;
    return this;
  }

  /**
   * The latitude in decimal degrees expressed using the NAD83 horizontal datum.
   * @return clusterLatitude
  */
  @NotNull 
  @Schema(name = "ClusterLatitude", example = "38.904149", description = "The latitude in decimal degrees expressed using the NAD83 horizontal datum.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ClusterLatitude")
  public String getClusterLatitude() {
    return clusterLatitude;
  }

  public void setClusterLatitude(String clusterLatitude) {
    this.clusterLatitude = clusterLatitude;
  }

  public Air00 clusterLongitude(String clusterLongitude) {
    this.clusterLongitude = clusterLongitude;
    return this;
  }

  /**
   * The longitude in decimal degrees expressed using the NAD83 horizontal datum.
   * @return clusterLongitude
  */
  @NotNull 
  @Schema(name = "ClusterLongitude", example = "-77.017094", description = "The longitude in decimal degrees expressed using the NAD83 horizontal datum.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ClusterLongitude")
  public String getClusterLongitude() {
    return clusterLongitude;
  }

  public void setClusterLongitude(String clusterLongitude) {
    this.clusterLongitude = clusterLongitude;
  }

  public Air00 clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * THe name or the identifier of the geographic area used for clustering.  Examples:  Alaska, Fairfax County, 22314
   * @return clusterName
  */
  @NotNull 
  @Schema(name = "ClusterName", description = "THe name or the identifier of the geographic area used for clustering.  Examples:  Alaska, Fairfax County, 22314", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ClusterName")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public Air00 clusterType(String clusterType) {
    this.clusterType = clusterType;
    return this;
  }

  /**
   * The representative geographic area used for clustering.  Examples:  State, County, Zip Code
   * @return clusterType
  */
  @NotNull 
  @Schema(name = "ClusterType", description = "The representative geographic area used for clustering.  Examples:  State, County, Zip Code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ClusterType")
  public String getClusterType() {
    return clusterType;
  }

  public void setClusterType(String clusterType) {
    this.clusterType = clusterType;
  }

  public Air00 clusterValue(String clusterValue) {
    this.clusterValue = clusterValue;
    return this;
  }

  /**
   * The value, internal to the database report object, that represents this cluster, like a state abbreviation, zip code, or county FIPS code.  Examples: AK, 22314, 50011
   * @return clusterValue
  */
  @NotNull 
  @Schema(name = "ClusterValue", description = "The value, internal to the database report object, that represents this cluster, like a state abbreviation, zip code, or county FIPS code.  Examples: AK, 22314, 50011", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ClusterValue")
  public String getClusterValue() {
    return clusterValue;
  }

  public void setClusterValue(String clusterValue) {
    this.clusterValue = clusterValue;
  }

  public Air00 epARegionCode(String epARegionCode) {
    this.epARegionCode = epARegionCode;
    return this;
  }

  /**
   * The EPA region where the facility is located. EPA has 10 regional offices that execute programs within several states and territories
   * @return epARegionCode
  */
  @NotNull 
  @Schema(name = "EPARegionCode", example = "03", description = "The EPA region where the facility is located. EPA has 10 regional offices that execute programs within several states and territories", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("EPARegionCode")
  public String getEpARegionCode() {
    return epARegionCode;
  }

  public void setEpARegionCode(String epARegionCode) {
    this.epARegionCode = epARegionCode;
  }

  public Air00 feARows(String feARows) {
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

  public Air00 inSPRows(String inSPRows) {
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

  public Air00 indianCountryRows(String indianCountryRows) {
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

  public Air00 infFEARows(String infFEARows) {
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

  public Air00 objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * Sequential number assigned to each facility or cluster returned.
   * @return objectId
  */
  @NotNull 
  @Schema(name = "ObjectId", example = "1", description = "Sequential number assigned to each facility or cluster returned.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ObjectId")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public Air00 svRows(String svRows) {
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

  public Air00 totalPenalties(String totalPenalties) {
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

  public Air00 v3Rows(String v3Rows) {
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
    Air00 air00 = (Air00) o;
    return Objects.equals(this.cvRows, air00.cvRows) &&
        Objects.equals(this.clusterCount, air00.clusterCount) &&
        Objects.equals(this.clusterIcon, air00.clusterIcon) &&
        Objects.equals(this.clusterLatitude, air00.clusterLatitude) &&
        Objects.equals(this.clusterLongitude, air00.clusterLongitude) &&
        Objects.equals(this.clusterName, air00.clusterName) &&
        Objects.equals(this.clusterType, air00.clusterType) &&
        Objects.equals(this.clusterValue, air00.clusterValue) &&
        Objects.equals(this.epARegionCode, air00.epARegionCode) &&
        Objects.equals(this.feARows, air00.feARows) &&
        Objects.equals(this.inSPRows, air00.inSPRows) &&
        Objects.equals(this.indianCountryRows, air00.indianCountryRows) &&
        Objects.equals(this.infFEARows, air00.infFEARows) &&
        Objects.equals(this.objectId, air00.objectId) &&
        Objects.equals(this.svRows, air00.svRows) &&
        Objects.equals(this.totalPenalties, air00.totalPenalties) &&
        Objects.equals(this.v3Rows, air00.v3Rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cvRows, clusterCount, clusterIcon, clusterLatitude, clusterLongitude, clusterName, clusterType, clusterValue, epARegionCode, feARows, inSPRows, indianCountryRows, infFEARows, objectId, svRows, totalPenalties, v3Rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Air00 {\n");
    sb.append("    cvRows: ").append(toIndentedString(cvRows)).append("\n");
    sb.append("    clusterCount: ").append(toIndentedString(clusterCount)).append("\n");
    sb.append("    clusterIcon: ").append(toIndentedString(clusterIcon)).append("\n");
    sb.append("    clusterLatitude: ").append(toIndentedString(clusterLatitude)).append("\n");
    sb.append("    clusterLongitude: ").append(toIndentedString(clusterLongitude)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
    sb.append("    clusterValue: ").append(toIndentedString(clusterValue)).append("\n");
    sb.append("    epARegionCode: ").append(toIndentedString(epARegionCode)).append("\n");
    sb.append("    feARows: ").append(toIndentedString(feARows)).append("\n");
    sb.append("    inSPRows: ").append(toIndentedString(inSPRows)).append("\n");
    sb.append("    indianCountryRows: ").append(toIndentedString(indianCountryRows)).append("\n");
    sb.append("    infFEARows: ").append(toIndentedString(infFEARows)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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

