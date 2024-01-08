package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PositionGroupRecruitingRating
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class PositionGroupRecruitingRating {

  private BigDecimal averageRating;

  private BigDecimal averageStars;

  private BigDecimal commits;

  private String conference;

  private String positionGroup;

  private String team;

  private BigDecimal totalRating;

  public PositionGroupRecruitingRating averageRating(BigDecimal averageRating) {
    this.averageRating = averageRating;
    return this;
  }

  /**
   * Get averageRating
   * @return averageRating
  */
  @Valid 
  @Schema(name = "averageRating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("averageRating")
  public BigDecimal getAverageRating() {
    return averageRating;
  }

  public void setAverageRating(BigDecimal averageRating) {
    this.averageRating = averageRating;
  }

  public PositionGroupRecruitingRating averageStars(BigDecimal averageStars) {
    this.averageStars = averageStars;
    return this;
  }

  /**
   * Get averageStars
   * @return averageStars
  */
  @Valid 
  @Schema(name = "averageStars", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("averageStars")
  public BigDecimal getAverageStars() {
    return averageStars;
  }

  public void setAverageStars(BigDecimal averageStars) {
    this.averageStars = averageStars;
  }

  public PositionGroupRecruitingRating commits(BigDecimal commits) {
    this.commits = commits;
    return this;
  }

  /**
   * Get commits
   * @return commits
  */
  @Valid 
  @Schema(name = "commits", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commits")
  public BigDecimal getCommits() {
    return commits;
  }

  public void setCommits(BigDecimal commits) {
    this.commits = commits;
  }

  public PositionGroupRecruitingRating conference(String conference) {
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

  public PositionGroupRecruitingRating positionGroup(String positionGroup) {
    this.positionGroup = positionGroup;
    return this;
  }

  /**
   * Get positionGroup
   * @return positionGroup
  */
  
  @Schema(name = "positionGroup", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("positionGroup")
  public String getPositionGroup() {
    return positionGroup;
  }

  public void setPositionGroup(String positionGroup) {
    this.positionGroup = positionGroup;
  }

  public PositionGroupRecruitingRating team(String team) {
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

  public PositionGroupRecruitingRating totalRating(BigDecimal totalRating) {
    this.totalRating = totalRating;
    return this;
  }

  /**
   * Get totalRating
   * @return totalRating
  */
  @Valid 
  @Schema(name = "totalRating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalRating")
  public BigDecimal getTotalRating() {
    return totalRating;
  }

  public void setTotalRating(BigDecimal totalRating) {
    this.totalRating = totalRating;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionGroupRecruitingRating positionGroupRecruitingRating = (PositionGroupRecruitingRating) o;
    return Objects.equals(this.averageRating, positionGroupRecruitingRating.averageRating) &&
        Objects.equals(this.averageStars, positionGroupRecruitingRating.averageStars) &&
        Objects.equals(this.commits, positionGroupRecruitingRating.commits) &&
        Objects.equals(this.conference, positionGroupRecruitingRating.conference) &&
        Objects.equals(this.positionGroup, positionGroupRecruitingRating.positionGroup) &&
        Objects.equals(this.team, positionGroupRecruitingRating.team) &&
        Objects.equals(this.totalRating, positionGroupRecruitingRating.totalRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageRating, averageStars, commits, conference, positionGroup, team, totalRating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionGroupRecruitingRating {\n");
    sb.append("    averageRating: ").append(toIndentedString(averageRating)).append("\n");
    sb.append("    averageStars: ").append(toIndentedString(averageStars)).append("\n");
    sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    positionGroup: ").append(toIndentedString(positionGroup)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    totalRating: ").append(toIndentedString(totalRating)).append("\n");
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

