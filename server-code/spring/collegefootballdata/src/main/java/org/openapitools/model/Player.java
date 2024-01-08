package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Player
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class Player {

  private String firstName;

  private Integer height;

  private String homeCity;

  private String homeCountry;

  private String homeCountyFips;

  private BigDecimal homeLatitude;

  private BigDecimal homeLongitude;

  private String homeState;

  private Integer id;

  private Integer jersey;

  private String lastName;

  private String position;

  @Valid
  private List<Integer> recruitIds;

  private String team;

  private Integer weight;

  private Integer year;

  public Player firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "first_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Player height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  */
  
  @Schema(name = "height", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public Player homeCity(String homeCity) {
    this.homeCity = homeCity;
    return this;
  }

  /**
   * Get homeCity
   * @return homeCity
  */
  
  @Schema(name = "home_city", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("home_city")
  public String getHomeCity() {
    return homeCity;
  }

  public void setHomeCity(String homeCity) {
    this.homeCity = homeCity;
  }

  public Player homeCountry(String homeCountry) {
    this.homeCountry = homeCountry;
    return this;
  }

  /**
   * Get homeCountry
   * @return homeCountry
  */
  
  @Schema(name = "home_country", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("home_country")
  public String getHomeCountry() {
    return homeCountry;
  }

  public void setHomeCountry(String homeCountry) {
    this.homeCountry = homeCountry;
  }

  public Player homeCountyFips(String homeCountyFips) {
    this.homeCountyFips = homeCountyFips;
    return this;
  }

  /**
   * Get homeCountyFips
   * @return homeCountyFips
  */
  
  @Schema(name = "home_county_fips", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("home_county_fips")
  public String getHomeCountyFips() {
    return homeCountyFips;
  }

  public void setHomeCountyFips(String homeCountyFips) {
    this.homeCountyFips = homeCountyFips;
  }

  public Player homeLatitude(BigDecimal homeLatitude) {
    this.homeLatitude = homeLatitude;
    return this;
  }

  /**
   * Get homeLatitude
   * @return homeLatitude
  */
  @Valid 
  @Schema(name = "home_latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("home_latitude")
  public BigDecimal getHomeLatitude() {
    return homeLatitude;
  }

  public void setHomeLatitude(BigDecimal homeLatitude) {
    this.homeLatitude = homeLatitude;
  }

  public Player homeLongitude(BigDecimal homeLongitude) {
    this.homeLongitude = homeLongitude;
    return this;
  }

  /**
   * Get homeLongitude
   * @return homeLongitude
  */
  @Valid 
  @Schema(name = "home_longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("home_longitude")
  public BigDecimal getHomeLongitude() {
    return homeLongitude;
  }

  public void setHomeLongitude(BigDecimal homeLongitude) {
    this.homeLongitude = homeLongitude;
  }

  public Player homeState(String homeState) {
    this.homeState = homeState;
    return this;
  }

  /**
   * Get homeState
   * @return homeState
  */
  
  @Schema(name = "home_state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("home_state")
  public String getHomeState() {
    return homeState;
  }

  public void setHomeState(String homeState) {
    this.homeState = homeState;
  }

  public Player id(Integer id) {
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

  public Player jersey(Integer jersey) {
    this.jersey = jersey;
    return this;
  }

  /**
   * Get jersey
   * @return jersey
  */
  
  @Schema(name = "jersey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jersey")
  public Integer getJersey() {
    return jersey;
  }

  public void setJersey(Integer jersey) {
    this.jersey = jersey;
  }

  public Player lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  
  @Schema(name = "last_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Player position(String position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
  */
  
  @Schema(name = "position", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("position")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public Player recruitIds(List<Integer> recruitIds) {
    this.recruitIds = recruitIds;
    return this;
  }

  public Player addRecruitIdsItem(Integer recruitIdsItem) {
    if (this.recruitIds == null) {
      this.recruitIds = new ArrayList<>();
    }
    this.recruitIds.add(recruitIdsItem);
    return this;
  }

  /**
   * Get recruitIds
   * @return recruitIds
  */
  
  @Schema(name = "recruit_ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recruit_ids")
  public List<Integer> getRecruitIds() {
    return recruitIds;
  }

  public void setRecruitIds(List<Integer> recruitIds) {
    this.recruitIds = recruitIds;
  }

  public Player team(String team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
  */
  
  @Schema(name = "team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team")
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public Player weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
  */
  
  @Schema(name = "weight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weight")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public Player year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  */
  
  @Schema(name = "year", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("year")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Player player = (Player) o;
    return Objects.equals(this.firstName, player.firstName) &&
        Objects.equals(this.height, player.height) &&
        Objects.equals(this.homeCity, player.homeCity) &&
        Objects.equals(this.homeCountry, player.homeCountry) &&
        Objects.equals(this.homeCountyFips, player.homeCountyFips) &&
        Objects.equals(this.homeLatitude, player.homeLatitude) &&
        Objects.equals(this.homeLongitude, player.homeLongitude) &&
        Objects.equals(this.homeState, player.homeState) &&
        Objects.equals(this.id, player.id) &&
        Objects.equals(this.jersey, player.jersey) &&
        Objects.equals(this.lastName, player.lastName) &&
        Objects.equals(this.position, player.position) &&
        Objects.equals(this.recruitIds, player.recruitIds) &&
        Objects.equals(this.team, player.team) &&
        Objects.equals(this.weight, player.weight) &&
        Objects.equals(this.year, player.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, height, homeCity, homeCountry, homeCountyFips, homeLatitude, homeLongitude, homeState, id, jersey, lastName, position, recruitIds, team, weight, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Player {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    homeCity: ").append(toIndentedString(homeCity)).append("\n");
    sb.append("    homeCountry: ").append(toIndentedString(homeCountry)).append("\n");
    sb.append("    homeCountyFips: ").append(toIndentedString(homeCountyFips)).append("\n");
    sb.append("    homeLatitude: ").append(toIndentedString(homeLatitude)).append("\n");
    sb.append("    homeLongitude: ").append(toIndentedString(homeLongitude)).append("\n");
    sb.append("    homeState: ").append(toIndentedString(homeState)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jersey: ").append(toIndentedString(jersey)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    recruitIds: ").append(toIndentedString(recruitIds)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

