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
 * GetDailyReportTotals200ResponseInner
 */

@JsonTypeName("getDailyReportTotals_200_response_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:30.536179-04:00[America/Lower_Princes]")
public class GetDailyReportTotals200ResponseInner {

  private Integer active;

  private Integer confirmed;

  private Integer critical;

  private String date;

  private Integer deaths;

  private Integer recovered;

  public GetDailyReportTotals200ResponseInner active(Integer active) {
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

  public GetDailyReportTotals200ResponseInner confirmed(Integer confirmed) {
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

  public GetDailyReportTotals200ResponseInner critical(Integer critical) {
    this.critical = critical;
    return this;
  }

  /**
   * Get critical
   * @return critical
  */
  
  @Schema(name = "critical", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("critical")
  public Integer getCritical() {
    return critical;
  }

  public void setCritical(Integer critical) {
    this.critical = critical;
  }

  public GetDailyReportTotals200ResponseInner date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  
  @Schema(name = "date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public GetDailyReportTotals200ResponseInner deaths(Integer deaths) {
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

  public GetDailyReportTotals200ResponseInner recovered(Integer recovered) {
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
    GetDailyReportTotals200ResponseInner getDailyReportTotals200ResponseInner = (GetDailyReportTotals200ResponseInner) o;
    return Objects.equals(this.active, getDailyReportTotals200ResponseInner.active) &&
        Objects.equals(this.confirmed, getDailyReportTotals200ResponseInner.confirmed) &&
        Objects.equals(this.critical, getDailyReportTotals200ResponseInner.critical) &&
        Objects.equals(this.date, getDailyReportTotals200ResponseInner.date) &&
        Objects.equals(this.deaths, getDailyReportTotals200ResponseInner.deaths) &&
        Objects.equals(this.recovered, getDailyReportTotals200ResponseInner.recovered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, confirmed, critical, date, deaths, recovered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDailyReportTotals200ResponseInner {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

