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
 * Map Data Object
 */

@Schema(name = "air02", description = "Map Data Object")
@JsonTypeName("air02")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:47.778831-04:00[America/Lower_Princes]")
public class Air02 {

  private String caAstatus;

  private String formalCount;

  private String ICON;

  private String informalCount;

  private String LAT;

  private String LON;

  private String lastInsp;

  private String NAME;

  private String PUV;

  private String TYPE;

  public Air02() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Air02(String caAstatus, String formalCount, String ICON, String informalCount, String LAT, String LON, String lastInsp, String NAME, String PUV, String TYPE) {
    this.caAstatus = caAstatus;
    this.formalCount = formalCount;
    this.ICON = ICON;
    this.informalCount = informalCount;
    this.LAT = LAT;
    this.LON = LON;
    this.lastInsp = lastInsp;
    this.NAME = NAME;
    this.PUV = PUV;
    this.TYPE = TYPE;
  }

  public Air02 caAstatus(String caAstatus) {
    this.caAstatus = caAstatus;
    return this;
  }

  /**
   * The facility's 3-year compliance status history by quarter (3-month period). Each character represents a quarter of compliance, going from oldest to most recent. Character values correspond to the following compliance statuses: _ -�No Violation Identified V -�Violation Identified S -�High Priority Violation U - Undetermined
   * @return caAstatus
  */
  @NotNull 
  @Schema(name = "CAAstatus", example = "______UUUUUU", description = "The facility's 3-year compliance status history by quarter (3-month period). Each character represents a quarter of compliance, going from oldest to most recent. Character values correspond to the following compliance statuses: _ -�No Violation Identified V -�Violation Identified S -�High Priority Violation U - Undetermined", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CAAstatus")
  public String getCaAstatus() {
    return caAstatus;
  }

  public void setCaAstatus(String caAstatus) {
    this.caAstatus = caAstatus;
  }

  public Air02 formalCount(String formalCount) {
    this.formalCount = formalCount;
    return this;
  }

  /**
   * The number of formal enforcement actions that have been taken against the facility
   * @return formalCount
  */
  @NotNull 
  @Schema(name = "FormalCount", example = "1", description = "The number of formal enforcement actions that have been taken against the facility", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FormalCount")
  public String getFormalCount() {
    return formalCount;
  }

  public void setFormalCount(String formalCount) {
    this.formalCount = formalCount;
  }

  public Air02 ICON(String ICON) {
    this.ICON = ICON;
    return this;
  }

  /**
   * Name of each individual icon file within the URL base
   * @return ICON
  */
  @NotNull 
  @Schema(name = "ICON", example = "CAA-IC-MN-N.png", description = "Name of each individual icon file within the URL base", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ICON")
  public String getICON() {
    return ICON;
  }

  public void setICON(String ICON) {
    this.ICON = ICON;
  }

  public Air02 informalCount(String informalCount) {
    this.informalCount = informalCount;
    return this;
  }

  /**
   * The number of informal enforcement actions that have been taken against the facility
   * @return informalCount
  */
  @NotNull 
  @Schema(name = "InformalCount", example = "1", description = "The number of informal enforcement actions that have been taken against the facility", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("InformalCount")
  public String getInformalCount() {
    return informalCount;
  }

  public void setInformalCount(String informalCount) {
    this.informalCount = informalCount;
  }

  public Air02 LAT(String LAT) {
    this.LAT = LAT;
    return this;
  }

  /**
   * The latitude of the facility in degrees, to four decimal places
   * @return LAT
  */
  @NotNull 
  @Schema(name = "LAT", example = "38.798026", description = "The latitude of the facility in degrees, to four decimal places", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("LAT")
  public String getLAT() {
    return LAT;
  }

  public void setLAT(String LAT) {
    this.LAT = LAT;
  }

  public Air02 LON(String LON) {
    this.LON = LON;
    return this;
  }

  /**
   * The longitude of the facility in degrees, to four decimal places
   * @return LON
  */
  @NotNull 
  @Schema(name = "LON", example = "-77.062981", description = "The longitude of the facility in degrees, to four decimal places", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("LON")
  public String getLON() {
    return LON;
  }

  public void setLON(String LON) {
    this.LON = LON;
  }

  public Air02 lastInsp(String lastInsp) {
    this.lastInsp = lastInsp;
    return this;
  }

  /**
   * The unique identifier for the last inspection
   * @return lastInsp
  */
  @NotNull 
  @Schema(name = "LastInsp", example = "901", description = "The unique identifier for the last inspection", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("LastInsp")
  public String getLastInsp() {
    return lastInsp;
  }

  public void setLastInsp(String lastInsp) {
    this.lastInsp = lastInsp;
  }

  public Air02 NAME(String NAME) {
    this.NAME = NAME;
    return this;
  }

  /**
   * For DFR, this is the Facility name. The name corresponds to the TYPE value
   * @return NAME
  */
  @NotNull 
  @Schema(name = "NAME", example = "VIRGINIA CONCRETE ALEXANDRIA PLANT", description = "For DFR, this is the Facility name. The name corresponds to the TYPE value", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("NAME")
  public String getNAME() {
    return NAME;
  }

  public void setNAME(String NAME) {
    this.NAME = NAME;
  }

  public Air02 PUV(String PUV) {
    this.PUV = PUV;
    return this;
  }

  /**
   * Pop up value. Combine with PopUpBaseURL to give the popup for the facility
   * @return PUV
  */
  @NotNull 
  @Schema(name = "PUV", example = "110001891506", description = "Pop up value. Combine with PopUpBaseURL to give the popup for the facility", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PUV")
  public String getPUV() {
    return PUV;
  }

  public void setPUV(String PUV) {
    this.PUV = PUV;
  }

  public Air02 TYPE(String TYPE) {
    this.TYPE = TYPE;
    return this;
  }

  /**
   * For DFR, this is always facility
   * @return TYPE
  */
  @NotNull 
  @Schema(name = "TYPE", example = "Facility", description = "For DFR, this is always facility", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TYPE")
  public String getTYPE() {
    return TYPE;
  }

  public void setTYPE(String TYPE) {
    this.TYPE = TYPE;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Air02 air02 = (Air02) o;
    return Objects.equals(this.caAstatus, air02.caAstatus) &&
        Objects.equals(this.formalCount, air02.formalCount) &&
        Objects.equals(this.ICON, air02.ICON) &&
        Objects.equals(this.informalCount, air02.informalCount) &&
        Objects.equals(this.LAT, air02.LAT) &&
        Objects.equals(this.LON, air02.LON) &&
        Objects.equals(this.lastInsp, air02.lastInsp) &&
        Objects.equals(this.NAME, air02.NAME) &&
        Objects.equals(this.PUV, air02.PUV) &&
        Objects.equals(this.TYPE, air02.TYPE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caAstatus, formalCount, ICON, informalCount, LAT, LON, lastInsp, NAME, PUV, TYPE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Air02 {\n");
    sb.append("    caAstatus: ").append(toIndentedString(caAstatus)).append("\n");
    sb.append("    formalCount: ").append(toIndentedString(formalCount)).append("\n");
    sb.append("    ICON: ").append(toIndentedString(ICON)).append("\n");
    sb.append("    informalCount: ").append(toIndentedString(informalCount)).append("\n");
    sb.append("    LAT: ").append(toIndentedString(LAT)).append("\n");
    sb.append("    LON: ").append(toIndentedString(LON)).append("\n");
    sb.append("    lastInsp: ").append(toIndentedString(lastInsp)).append("\n");
    sb.append("    NAME: ").append(toIndentedString(NAME)).append("\n");
    sb.append("    PUV: ").append(toIndentedString(PUV)).append("\n");
    sb.append("    TYPE: ").append(toIndentedString(TYPE)).append("\n");
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

