package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.model.VenueLocation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Venue
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class Venue {

  private Integer capacity;

  private String city;

  private String countryCode;

  private Boolean dome;

  private BigDecimal elevation;

  private Boolean grass;

  private Integer id;

  private VenueLocation location;

  private String name;

  private String state;

  private String timezone;

  private Integer yearConstructed;

  private String zip;

  public Venue capacity(Integer capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
  */
  
  @Schema(name = "capacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("capacity")
  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public Venue city(String city) {
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

  public Venue countryCode(String countryCode) {
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

  public Venue dome(Boolean dome) {
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

  public Venue elevation(BigDecimal elevation) {
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

  public Venue grass(Boolean grass) {
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

  public Venue id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Venue location(VenueLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @Valid 
  @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public VenueLocation getLocation() {
    return location;
  }

  public void setLocation(VenueLocation location) {
    this.location = location;
  }

  public Venue name(String name) {
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

  public Venue state(String state) {
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

  public Venue timezone(String timezone) {
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

  public Venue yearConstructed(Integer yearConstructed) {
    this.yearConstructed = yearConstructed;
    return this;
  }

  /**
   * Get yearConstructed
   * @return yearConstructed
  */
  
  @Schema(name = "year_constructed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("year_constructed")
  public Integer getYearConstructed() {
    return yearConstructed;
  }

  public void setYearConstructed(Integer yearConstructed) {
    this.yearConstructed = yearConstructed;
  }

  public Venue zip(String zip) {
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
    Venue venue = (Venue) o;
    return Objects.equals(this.capacity, venue.capacity) &&
        Objects.equals(this.city, venue.city) &&
        Objects.equals(this.countryCode, venue.countryCode) &&
        Objects.equals(this.dome, venue.dome) &&
        Objects.equals(this.elevation, venue.elevation) &&
        Objects.equals(this.grass, venue.grass) &&
        Objects.equals(this.id, venue.id) &&
        Objects.equals(this.location, venue.location) &&
        Objects.equals(this.name, venue.name) &&
        Objects.equals(this.state, venue.state) &&
        Objects.equals(this.timezone, venue.timezone) &&
        Objects.equals(this.yearConstructed, venue.yearConstructed) &&
        Objects.equals(this.zip, venue.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, city, countryCode, dome, elevation, grass, id, location, name, state, timezone, yearConstructed, zip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Venue {\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    dome: ").append(toIndentedString(dome)).append("\n");
    sb.append("    elevation: ").append(toIndentedString(elevation)).append("\n");
    sb.append("    grass: ").append(toIndentedString(grass)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

