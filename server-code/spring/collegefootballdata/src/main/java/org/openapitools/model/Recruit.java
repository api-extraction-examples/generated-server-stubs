package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.model.RecruitHometownInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Recruit
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class Recruit {

  private Integer athleteId;

  private String city;

  private String committedTo;

  private String country;

  private BigDecimal height;

  private RecruitHometownInfo hometownInfo;

  private Integer id;

  private String name;

  private String position;

  private Integer ranking;

  private BigDecimal rating;

  private String recruitType;

  private String school;

  private Integer stars;

  private String stateProvince;

  private Integer weight;

  private Integer year;

  public Recruit athleteId(Integer athleteId) {
    this.athleteId = athleteId;
    return this;
  }

  /**
   * Get athleteId
   * @return athleteId
  */
  
  @Schema(name = "athleteId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("athleteId")
  public Integer getAthleteId() {
    return athleteId;
  }

  public void setAthleteId(Integer athleteId) {
    this.athleteId = athleteId;
  }

  public Recruit city(String city) {
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

  public Recruit committedTo(String committedTo) {
    this.committedTo = committedTo;
    return this;
  }

  /**
   * Get committedTo
   * @return committedTo
  */
  
  @Schema(name = "committedTo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("committedTo")
  public String getCommittedTo() {
    return committedTo;
  }

  public void setCommittedTo(String committedTo) {
    this.committedTo = committedTo;
  }

  public Recruit country(String country) {
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

  public Recruit height(BigDecimal height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  */
  @Valid 
  @Schema(name = "height", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public Recruit hometownInfo(RecruitHometownInfo hometownInfo) {
    this.hometownInfo = hometownInfo;
    return this;
  }

  /**
   * Get hometownInfo
   * @return hometownInfo
  */
  @Valid 
  @Schema(name = "hometownInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hometownInfo")
  public RecruitHometownInfo getHometownInfo() {
    return hometownInfo;
  }

  public void setHometownInfo(RecruitHometownInfo hometownInfo) {
    this.hometownInfo = hometownInfo;
  }

  public Recruit id(Integer id) {
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

  public Recruit name(String name) {
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

  public Recruit position(String position) {
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

  public Recruit ranking(Integer ranking) {
    this.ranking = ranking;
    return this;
  }

  /**
   * Get ranking
   * @return ranking
  */
  
  @Schema(name = "ranking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ranking")
  public Integer getRanking() {
    return ranking;
  }

  public void setRanking(Integer ranking) {
    this.ranking = ranking;
  }

  public Recruit rating(BigDecimal rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  */
  @Valid 
  @Schema(name = "rating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rating")
  public BigDecimal getRating() {
    return rating;
  }

  public void setRating(BigDecimal rating) {
    this.rating = rating;
  }

  public Recruit recruitType(String recruitType) {
    this.recruitType = recruitType;
    return this;
  }

  /**
   * Get recruitType
   * @return recruitType
  */
  
  @Schema(name = "recruitType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recruitType")
  public String getRecruitType() {
    return recruitType;
  }

  public void setRecruitType(String recruitType) {
    this.recruitType = recruitType;
  }

  public Recruit school(String school) {
    this.school = school;
    return this;
  }

  /**
   * Get school
   * @return school
  */
  
  @Schema(name = "school", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("school")
  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public Recruit stars(Integer stars) {
    this.stars = stars;
    return this;
  }

  /**
   * Get stars
   * @return stars
  */
  
  @Schema(name = "stars", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stars")
  public Integer getStars() {
    return stars;
  }

  public void setStars(Integer stars) {
    this.stars = stars;
  }

  public Recruit stateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
    return this;
  }

  /**
   * Get stateProvince
   * @return stateProvince
  */
  
  @Schema(name = "stateProvince", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateProvince")
  public String getStateProvince() {
    return stateProvince;
  }

  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }

  public Recruit weight(Integer weight) {
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

  public Recruit year(Integer year) {
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
    Recruit recruit = (Recruit) o;
    return Objects.equals(this.athleteId, recruit.athleteId) &&
        Objects.equals(this.city, recruit.city) &&
        Objects.equals(this.committedTo, recruit.committedTo) &&
        Objects.equals(this.country, recruit.country) &&
        Objects.equals(this.height, recruit.height) &&
        Objects.equals(this.hometownInfo, recruit.hometownInfo) &&
        Objects.equals(this.id, recruit.id) &&
        Objects.equals(this.name, recruit.name) &&
        Objects.equals(this.position, recruit.position) &&
        Objects.equals(this.ranking, recruit.ranking) &&
        Objects.equals(this.rating, recruit.rating) &&
        Objects.equals(this.recruitType, recruit.recruitType) &&
        Objects.equals(this.school, recruit.school) &&
        Objects.equals(this.stars, recruit.stars) &&
        Objects.equals(this.stateProvince, recruit.stateProvince) &&
        Objects.equals(this.weight, recruit.weight) &&
        Objects.equals(this.year, recruit.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(athleteId, city, committedTo, country, height, hometownInfo, id, name, position, ranking, rating, recruitType, school, stars, stateProvince, weight, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recruit {\n");
    sb.append("    athleteId: ").append(toIndentedString(athleteId)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    committedTo: ").append(toIndentedString(committedTo)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    hometownInfo: ").append(toIndentedString(hometownInfo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    recruitType: ").append(toIndentedString(recruitType)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
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

