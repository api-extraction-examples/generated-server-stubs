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
 * GetDailyReportAllCountries200ResponseInnerProvinceInner
 */

@JsonTypeName("getDailyReportAllCountries_200_response_inner_province_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:30.536179-04:00[America/Lower_Princes]")
public class GetDailyReportAllCountries200ResponseInnerProvinceInner {

  private Integer active;

  private Integer confirmed;

  private Integer deaths;

  private Integer recovered;

  public GetDailyReportAllCountries200ResponseInnerProvinceInner active(Integer active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public Integer getActive() {
    return active;
  }

  public void setActive(Integer active) {
    this.active = active;
  }

  public GetDailyReportAllCountries200ResponseInnerProvinceInner confirmed(Integer confirmed) {
    this.confirmed = confirmed;
    return this;
  }

  /**
   * Get confirmed
   * @return confirmed
  */
  
  @Schema(name = "confirmed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("confirmed")
  public Integer getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Integer confirmed) {
    this.confirmed = confirmed;
  }

  public GetDailyReportAllCountries200ResponseInnerProvinceInner deaths(Integer deaths) {
    this.deaths = deaths;
    return this;
  }

  /**
   * Get deaths
   * @return deaths
  */
  
  @Schema(name = "deaths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deaths")
  public Integer getDeaths() {
    return deaths;
  }

  public void setDeaths(Integer deaths) {
    this.deaths = deaths;
  }

  public GetDailyReportAllCountries200ResponseInnerProvinceInner recovered(Integer recovered) {
    this.recovered = recovered;
    return this;
  }

  /**
   * Get recovered
   * @return recovered
  */
  
  @Schema(name = "recovered", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recovered")
  public Integer getRecovered() {
    return recovered;
  }

  public void setRecovered(Integer recovered) {
    this.recovered = recovered;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDailyReportAllCountries200ResponseInnerProvinceInner getDailyReportAllCountries200ResponseInnerProvinceInner = (GetDailyReportAllCountries200ResponseInnerProvinceInner) o;
    return Objects.equals(this.active, getDailyReportAllCountries200ResponseInnerProvinceInner.active) &&
        Objects.equals(this.confirmed, getDailyReportAllCountries200ResponseInnerProvinceInner.confirmed) &&
        Objects.equals(this.deaths, getDailyReportAllCountries200ResponseInnerProvinceInner.deaths) &&
        Objects.equals(this.recovered, getDailyReportAllCountries200ResponseInnerProvinceInner.recovered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, confirmed, deaths, recovered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDailyReportAllCountries200ResponseInnerProvinceInner {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    deaths: ").append(toIndentedString(deaths)).append("\n");
    sb.append("    recovered: ").append(toIndentedString(recovered)).append("\n");
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

