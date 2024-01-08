package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
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
 * 
 */

@Schema(name = "Country-read", description = "")
@JsonTypeName("Country-read")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:30.536179-04:00[America/Lower_Princes]")
public class CountryRead {

  private Integer confirmed;

  private Integer critical;

  private Integer deaths;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastChange;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdate;

  private BigDecimal latitude;

  private BigDecimal longitude;

  private String name;

  private Integer recovered;

  public CountryRead confirmed(Integer confirmed) {
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

  public CountryRead critical(Integer critical) {
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

  public CountryRead deaths(Integer deaths) {
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

  public CountryRead lastChange(OffsetDateTime lastChange) {
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

  public CountryRead lastUpdate(OffsetDateTime lastUpdate) {
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

  public CountryRead latitude(BigDecimal latitude) {
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

  public CountryRead longitude(BigDecimal longitude) {
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

  public CountryRead name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CountryRead recovered(Integer recovered) {
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
    CountryRead countryRead = (CountryRead) o;
    return Objects.equals(this.confirmed, countryRead.confirmed) &&
        Objects.equals(this.critical, countryRead.critical) &&
        Objects.equals(this.deaths, countryRead.deaths) &&
        Objects.equals(this.lastChange, countryRead.lastChange) &&
        Objects.equals(this.lastUpdate, countryRead.lastUpdate) &&
        Objects.equals(this.latitude, countryRead.latitude) &&
        Objects.equals(this.longitude, countryRead.longitude) &&
        Objects.equals(this.name, countryRead.name) &&
        Objects.equals(this.recovered, countryRead.recovered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmed, critical, deaths, lastChange, lastUpdate, latitude, longitude, name, recovered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryRead {\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
    sb.append("    deaths: ").append(toIndentedString(deaths)).append("\n");
    sb.append("    lastChange: ").append(toIndentedString(lastChange)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

