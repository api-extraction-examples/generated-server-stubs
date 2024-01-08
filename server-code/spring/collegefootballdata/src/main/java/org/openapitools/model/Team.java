package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TeamLocation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Team
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class Team {

  private String abbreviation;

  private String altColor;

  private String altName1;

  private String altName2;

  private String altName3;

  private String classification;

  private String color;

  private String conference;

  private String division;

  private Integer id;

  private TeamLocation location;

  @Valid
  private List<String> logos;

  private String mascot;

  private String school;

  private String twitter;

  public Team abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

  /**
   * Get abbreviation
   * @return abbreviation
  */
  
  @Schema(name = "abbreviation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("abbreviation")
  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public Team altColor(String altColor) {
    this.altColor = altColor;
    return this;
  }

  /**
   * Get altColor
   * @return altColor
  */
  
  @Schema(name = "alt_color", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alt_color")
  public String getAltColor() {
    return altColor;
  }

  public void setAltColor(String altColor) {
    this.altColor = altColor;
  }

  public Team altName1(String altName1) {
    this.altName1 = altName1;
    return this;
  }

  /**
   * Get altName1
   * @return altName1
  */
  
  @Schema(name = "alt_name_1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alt_name_1")
  public String getAltName1() {
    return altName1;
  }

  public void setAltName1(String altName1) {
    this.altName1 = altName1;
  }

  public Team altName2(String altName2) {
    this.altName2 = altName2;
    return this;
  }

  /**
   * Get altName2
   * @return altName2
  */
  
  @Schema(name = "alt_name_2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alt_name_2")
  public String getAltName2() {
    return altName2;
  }

  public void setAltName2(String altName2) {
    this.altName2 = altName2;
  }

  public Team altName3(String altName3) {
    this.altName3 = altName3;
    return this;
  }

  /**
   * Get altName3
   * @return altName3
  */
  
  @Schema(name = "alt_name_3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alt_name_3")
  public String getAltName3() {
    return altName3;
  }

  public void setAltName3(String altName3) {
    this.altName3 = altName3;
  }

  public Team classification(String classification) {
    this.classification = classification;
    return this;
  }

  /**
   * Get classification
   * @return classification
  */
  
  @Schema(name = "classification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("classification")
  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }

  public Team color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
  */
  
  @Schema(name = "color", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Team conference(String conference) {
    this.conference = conference;
    return this;
  }

  /**
   * Get conference
   * @return conference
  */
  
  @Schema(name = "conference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conference")
  public String getConference() {
    return conference;
  }

  public void setConference(String conference) {
    this.conference = conference;
  }

  public Team division(String division) {
    this.division = division;
    return this;
  }

  /**
   * Get division
   * @return division
  */
  
  @Schema(name = "division", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("division")
  public String getDivision() {
    return division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  public Team id(Integer id) {
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

  public Team location(TeamLocation location) {
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
  public TeamLocation getLocation() {
    return location;
  }

  public void setLocation(TeamLocation location) {
    this.location = location;
  }

  public Team logos(List<String> logos) {
    this.logos = logos;
    return this;
  }

  public Team addLogosItem(String logosItem) {
    if (this.logos == null) {
      this.logos = new ArrayList<>();
    }
    this.logos.add(logosItem);
    return this;
  }

  /**
   * Get logos
   * @return logos
  */
  
  @Schema(name = "logos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logos")
  public List<String> getLogos() {
    return logos;
  }

  public void setLogos(List<String> logos) {
    this.logos = logos;
  }

  public Team mascot(String mascot) {
    this.mascot = mascot;
    return this;
  }

  /**
   * Get mascot
   * @return mascot
  */
  
  @Schema(name = "mascot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mascot")
  public String getMascot() {
    return mascot;
  }

  public void setMascot(String mascot) {
    this.mascot = mascot;
  }

  public Team school(String school) {
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

  public Team twitter(String twitter) {
    this.twitter = twitter;
    return this;
  }

  /**
   * Get twitter
   * @return twitter
  */
  
  @Schema(name = "twitter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("twitter")
  public String getTwitter() {
    return twitter;
  }

  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Team team = (Team) o;
    return Objects.equals(this.abbreviation, team.abbreviation) &&
        Objects.equals(this.altColor, team.altColor) &&
        Objects.equals(this.altName1, team.altName1) &&
        Objects.equals(this.altName2, team.altName2) &&
        Objects.equals(this.altName3, team.altName3) &&
        Objects.equals(this.classification, team.classification) &&
        Objects.equals(this.color, team.color) &&
        Objects.equals(this.conference, team.conference) &&
        Objects.equals(this.division, team.division) &&
        Objects.equals(this.id, team.id) &&
        Objects.equals(this.location, team.location) &&
        Objects.equals(this.logos, team.logos) &&
        Objects.equals(this.mascot, team.mascot) &&
        Objects.equals(this.school, team.school) &&
        Objects.equals(this.twitter, team.twitter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbreviation, altColor, altName1, altName2, altName3, classification, color, conference, division, id, location, logos, mascot, school, twitter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Team {\n");
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    altColor: ").append(toIndentedString(altColor)).append("\n");
    sb.append("    altName1: ").append(toIndentedString(altName1)).append("\n");
    sb.append("    altName2: ").append(toIndentedString(altName2)).append("\n");
    sb.append("    altName3: ").append(toIndentedString(altName3)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    logos: ").append(toIndentedString(logos)).append("\n");
    sb.append("    mascot: ").append(toIndentedString(mascot)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
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

