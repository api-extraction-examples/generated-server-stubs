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
 * ScoreboardGameAwayTeam
 */

@JsonTypeName("ScoreboardGame_awayTeam")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class ScoreboardGameAwayTeam {

  private String classification;

  private String conference;

  private Integer id;

  private String name;

  private Integer points;

  public ScoreboardGameAwayTeam classification(String classification) {
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

  public ScoreboardGameAwayTeam conference(String conference) {
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

  public ScoreboardGameAwayTeam id(Integer id) {
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

  public ScoreboardGameAwayTeam name(String name) {
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

  public ScoreboardGameAwayTeam points(Integer points) {
    this.points = points;
    return this;
  }

  /**
   * Get points
   * @return points
  */
  
  @Schema(name = "points", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("points")
  public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoreboardGameAwayTeam scoreboardGameAwayTeam = (ScoreboardGameAwayTeam) o;
    return Objects.equals(this.classification, scoreboardGameAwayTeam.classification) &&
        Objects.equals(this.conference, scoreboardGameAwayTeam.conference) &&
        Objects.equals(this.id, scoreboardGameAwayTeam.id) &&
        Objects.equals(this.name, scoreboardGameAwayTeam.name) &&
        Objects.equals(this.points, scoreboardGameAwayTeam.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classification, conference, id, name, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreboardGameAwayTeam {\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

