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
 * RankingWeekPollsInnerRanksInner
 */

@JsonTypeName("RankingWeek_polls_inner_ranks_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class RankingWeekPollsInnerRanksInner {

  private String conference;

  private Integer firstPlaceVotes;

  private Integer points;

  private Integer rank;

  private String school;

  public RankingWeekPollsInnerRanksInner conference(String conference) {
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

  public RankingWeekPollsInnerRanksInner firstPlaceVotes(Integer firstPlaceVotes) {
    this.firstPlaceVotes = firstPlaceVotes;
    return this;
  }

  /**
   * Get firstPlaceVotes
   * @return firstPlaceVotes
  */
  
  @Schema(name = "firstPlaceVotes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstPlaceVotes")
  public Integer getFirstPlaceVotes() {
    return firstPlaceVotes;
  }

  public void setFirstPlaceVotes(Integer firstPlaceVotes) {
    this.firstPlaceVotes = firstPlaceVotes;
  }

  public RankingWeekPollsInnerRanksInner points(Integer points) {
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

  public RankingWeekPollsInnerRanksInner rank(Integer rank) {
    this.rank = rank;
    return this;
  }

  /**
   * Get rank
   * @return rank
  */
  
  @Schema(name = "rank", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rank")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public RankingWeekPollsInnerRanksInner school(String school) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RankingWeekPollsInnerRanksInner rankingWeekPollsInnerRanksInner = (RankingWeekPollsInnerRanksInner) o;
    return Objects.equals(this.conference, rankingWeekPollsInnerRanksInner.conference) &&
        Objects.equals(this.firstPlaceVotes, rankingWeekPollsInnerRanksInner.firstPlaceVotes) &&
        Objects.equals(this.points, rankingWeekPollsInnerRanksInner.points) &&
        Objects.equals(this.rank, rankingWeekPollsInnerRanksInner.rank) &&
        Objects.equals(this.school, rankingWeekPollsInnerRanksInner.school);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conference, firstPlaceVotes, points, rank, school);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RankingWeekPollsInnerRanksInner {\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    firstPlaceVotes: ").append(toIndentedString(firstPlaceVotes)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
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

