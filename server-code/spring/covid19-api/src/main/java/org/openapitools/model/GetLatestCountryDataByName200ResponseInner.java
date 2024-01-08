package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetLatestCountryDataByName200ResponseInner
 */

@JsonTypeName("getLatestCountryDataByName_200_response_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:30.536179-04:00[America/Lower_Princes]")
public class GetLatestCountryDataByName200ResponseInner {

  private Integer confirmed;

  private String country;

  private Integer critical;

  private Integer deaths;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastChange;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdate;

  private Float latitude;

  private Float longitude;

  private Integer recovered;

  public GetLatestCountryDataByName200ResponseInner confirmed(Integer confirmed) {
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

  public GetLatestCountryDataByName200ResponseInner country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  
  @Schema(name = "country", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public GetLatestCountryDataByName200ResponseInner critical(Integer critical) {
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

  public GetLatestCountryDataByName200ResponseInner deaths(Integer deaths) {
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

  public GetLatestCountryDataByName200ResponseInner lastChange(OffsetDateTime lastChange) {
    this.lastChange = lastChange;
    return this;
  }

  /**
   * Get lastChange
   * @return lastChange
  */
  @Valid 
  @Schema(name = "lastChange", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastChange")
  public OffsetDateTime getLastChange() {
    return lastChange;
  }

  public void setLastChange(OffsetDateTime lastChange) {
    this.lastChange = lastChange;
  }

  public GetLatestCountryDataByName200ResponseInner lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Get lastUpdate
   * @return lastUpdate
  */
  @Valid 
  @Schema(name = "lastUpdate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdate")
  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public GetLatestCountryDataByName200ResponseInner latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
  */
  
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public GetLatestCountryDataByName200ResponseInner longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
  */
  
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public GetLatestCountryDataByName200ResponseInner recovered(Integer recovered) {
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
    GetLatestCountryDataByName200ResponseInner getLatestCountryDataByName200ResponseInner = (GetLatestCountryDataByName200ResponseInner) o;
    return Objects.equals(this.confirmed, getLatestCountryDataByName200ResponseInner.confirmed) &&
        Objects.equals(this.country, getLatestCountryDataByName200ResponseInner.country) &&
        Objects.equals(this.critical, getLatestCountryDataByName200ResponseInner.critical) &&
        Objects.equals(this.deaths, getLatestCountryDataByName200ResponseInner.deaths) &&
        Objects.equals(this.lastChange, getLatestCountryDataByName200ResponseInner.lastChange) &&
        Objects.equals(this.lastUpdate, getLatestCountryDataByName200ResponseInner.lastUpdate) &&
        Objects.equals(this.latitude, getLatestCountryDataByName200ResponseInner.latitude) &&
        Objects.equals(this.longitude, getLatestCountryDataByName200ResponseInner.longitude) &&
        Objects.equals(this.recovered, getLatestCountryDataByName200ResponseInner.recovered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmed, country, critical, deaths, lastChange, lastUpdate, latitude, longitude, recovered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLatestCountryDataByName200ResponseInner {\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
    sb.append("    deaths: ").append(toIndentedString(deaths)).append("\n");
    sb.append("    lastChange: ").append(toIndentedString(lastChange)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

