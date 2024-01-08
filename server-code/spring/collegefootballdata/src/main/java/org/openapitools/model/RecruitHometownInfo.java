package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RecruitHometownInfo
 */

@JsonTypeName("Recruit_hometownInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class RecruitHometownInfo {

  private String countyFips;

  private BigDecimal latitude;

  private BigDecimal longitude;

  public RecruitHometownInfo countyFips(String countyFips) {
    this.countyFips = countyFips;
    return this;
  }

  /**
   * Get countyFips
   * @return countyFips
  */
  
  @Schema(name = "countyFips", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countyFips")
  public String getCountyFips() {
    return countyFips;
  }

  public void setCountyFips(String countyFips) {
    this.countyFips = countyFips;
  }

  public RecruitHometownInfo latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
  */
  @Valid 
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public RecruitHometownInfo longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
  */
  @Valid 
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecruitHometownInfo recruitHometownInfo = (RecruitHometownInfo) o;
    return Objects.equals(this.countyFips, recruitHometownInfo.countyFips) &&
        Objects.equals(this.latitude, recruitHometownInfo.latitude) &&
        Objects.equals(this.longitude, recruitHometownInfo.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countyFips, latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecruitHometownInfo {\n");
    sb.append("    countyFips: ").append(toIndentedString(countyFips)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

