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
 * TeamLocation
 */

@JsonTypeName("Team_location")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class TeamLocation {

  private BigDecimal capacity;

  private String city;

  private String countryCode;

  private Boolean dome;

  private BigDecimal elevation;

  private Boolean grass;

  private BigDecimal latitude;

  private BigDecimal longitude;

  private String name;

  private String state;

  private String timezone;

  private Integer venueId;

  private BigDecimal yearConstructed;

  private String zip;

  public TeamLocation capacity(BigDecimal capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
  */
  @Valid 
  @Schema(name = "capacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("capacity")
  public BigDecimal getCapacity() {
    return capacity;
  }

  public void setCapacity(BigDecimal capacity) {
    this.capacity = capacity;
  }

  public TeamLocation city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  
  @Schema(name = "city", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public TeamLocation countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
  */
  
  @Schema(name = "country_code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country_code")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public TeamLocation dome(Boolean dome) {
    this.dome = dome;
    return this;
  }

  /**
   * Get dome
   * @return dome
  */
  
  @Schema(name = "dome", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dome")
  public Boolean getDome() {
    return dome;
  }

  public void setDome(Boolean dome) {
    this.dome = dome;
  }

  public TeamLocation elevation(BigDecimal elevation) {
    this.elevation = elevation;
    return this;
  }

  /**
   * Get elevation
   * @return elevation
  */
  @Valid 
  @Schema(name = "elevation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elevation")
  public BigDecimal getElevation() {
    return elevation;
  }

  public void setElevation(BigDecimal elevation) {
    this.elevation = elevation;
  }

  public TeamLocation grass(Boolean grass) {
    this.grass = grass;
    return this;
  }

  /**
   * Get grass
   * @return grass
  */
  
  @Schema(name = "grass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("grass")
  public Boolean getGrass() {
    return grass;
  }

  public void setGrass(Boolean grass) {
    this.grass = grass;
  }

  public TeamLocation latitude(BigDecimal latitude) {
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

  public TeamLocation longitude(BigDecimal longitude) {
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

  public TeamLocation name(String name) {
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

  public TeamLocation state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public TeamLocation timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Get timezone
   * @return timezone
  */
  
  @Schema(name = "timezone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public TeamLocation venueId(Integer venueId) {
    this.venueId = venueId;
    return this;
  }

  /**
   * Get venueId
   * @return venueId
  */
  
  @Schema(name = "venue_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("venue_id")
  public Integer getVenueId() {
    return venueId;
  }

  public void setVenueId(Integer venueId) {
    this.venueId = venueId;
  }

  public TeamLocation yearConstructed(BigDecimal yearConstructed) {
    this.yearConstructed = yearConstructed;
    return this;
  }

  /**
   * Get yearConstructed
   * @return yearConstructed
  */
  @Valid 
  @Schema(name = "year_constructed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("year_constructed")
  public BigDecimal getYearConstructed() {
    return yearConstructed;
  }

  public void setYearConstructed(BigDecimal yearConstructed) {
    this.yearConstructed = yearConstructed;
  }

  public TeamLocation zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * Get zip
   * @return zip
  */
  
  @Schema(name = "zip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zip")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamLocation teamLocation = (TeamLocation) o;
    return Objects.equals(this.capacity, teamLocation.capacity) &&
        Objects.equals(this.city, teamLocation.city) &&
        Objects.equals(this.countryCode, teamLocation.countryCode) &&
        Objects.equals(this.dome, teamLocation.dome) &&
        Objects.equals(this.elevation, teamLocation.elevation) &&
        Objects.equals(this.grass, teamLocation.grass) &&
        Objects.equals(this.latitude, teamLocation.latitude) &&
        Objects.equals(this.longitude, teamLocation.longitude) &&
        Objects.equals(this.name, teamLocation.name) &&
        Objects.equals(this.state, teamLocation.state) &&
        Objects.equals(this.timezone, teamLocation.timezone) &&
        Objects.equals(this.venueId, teamLocation.venueId) &&
        Objects.equals(this.yearConstructed, teamLocation.yearConstructed) &&
        Objects.equals(this.zip, teamLocation.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, city, countryCode, dome, elevation, grass, latitude, longitude, name, state, timezone, venueId, yearConstructed, zip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamLocation {\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    dome: ").append(toIndentedString(dome)).append("\n");
    sb.append("    elevation: ").append(toIndentedString(elevation)).append("\n");
    sb.append("    grass: ").append(toIndentedString(grass)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    venueId: ").append(toIndentedString(venueId)).append("\n");
    sb.append("    yearConstructed: ").append(toIndentedString(yearConstructed)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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

