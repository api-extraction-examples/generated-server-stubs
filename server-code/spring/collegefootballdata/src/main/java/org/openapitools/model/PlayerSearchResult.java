package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PlayerSearchResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class PlayerSearchResult {

  private String firstName;

  private Integer height;

  private String hometown;

  private Integer id;

  private Integer jersey;

  private String lastName;

  private String name;

  private String position;

  private String team;

  private String teamColor;

  private String teamColorSecondary;

  private Integer weight;

  public PlayerSearchResult firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "firstName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PlayerSearchResult height(Integer height) {
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

  public PlayerSearchResult hometown(String hometown) {
    this.hometown = hometown;
    return this;
  }

  /**
   * Get hometown
   * @return hometown
  */
  
  @Schema(name = "hometown", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hometown")
  public String getHometown() {
    return hometown;
  }

  public void setHometown(String hometown) {
    this.hometown = hometown;
  }

  public PlayerSearchResult id(Integer id) {
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

  public PlayerSearchResult jersey(Integer jersey) {
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

  public PlayerSearchResult lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  
  @Schema(name = "lastName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PlayerSearchResult name(String name) {
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

  public PlayerSearchResult position(String position) {
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

  public PlayerSearchResult team(String team) {
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

  public PlayerSearchResult teamColor(String teamColor) {
    this.teamColor = teamColor;
    return this;
  }

  /**
   * Get teamColor
   * @return teamColor
  */
  
  @Schema(name = "teamColor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("teamColor")
  public String getTeamColor() {
    return teamColor;
  }

  public void setTeamColor(String teamColor) {
    this.teamColor = teamColor;
  }

  public PlayerSearchResult teamColorSecondary(String teamColorSecondary) {
    this.teamColorSecondary = teamColorSecondary;
    return this;
  }

  /**
   * Get teamColorSecondary
   * @return teamColorSecondary
  */
  
  @Schema(name = "teamColorSecondary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("teamColorSecondary")
  public String getTeamColorSecondary() {
    return teamColorSecondary;
  }

  public void setTeamColorSecondary(String teamColorSecondary) {
    this.teamColorSecondary = teamColorSecondary;
  }

  public PlayerSearchResult weight(Integer weight) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerSearchResult playerSearchResult = (PlayerSearchResult) o;
    return Objects.equals(this.firstName, playerSearchResult.firstName) &&
        Objects.equals(this.height, playerSearchResult.height) &&
        Objects.equals(this.hometown, playerSearchResult.hometown) &&
        Objects.equals(this.id, playerSearchResult.id) &&
        Objects.equals(this.jersey, playerSearchResult.jersey) &&
        Objects.equals(this.lastName, playerSearchResult.lastName) &&
        Objects.equals(this.name, playerSearchResult.name) &&
        Objects.equals(this.position, playerSearchResult.position) &&
        Objects.equals(this.team, playerSearchResult.team) &&
        Objects.equals(this.teamColor, playerSearchResult.teamColor) &&
        Objects.equals(this.teamColorSecondary, playerSearchResult.teamColorSecondary) &&
        Objects.equals(this.weight, playerSearchResult.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, height, hometown, id, jersey, lastName, name, position, team, teamColor, teamColorSecondary, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerSearchResult {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    hometown: ").append(toIndentedString(hometown)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jersey: ").append(toIndentedString(jersey)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    teamColor: ").append(toIndentedString(teamColor)).append("\n");
    sb.append("    teamColorSecondary: ").append(toIndentedString(teamColorSecondary)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

