package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RankingWeekPollsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RankingWeek
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class RankingWeek {

  @Valid
  private List<@Valid RankingWeekPollsInner> polls;

  private Integer season;

  private String seasonType;

  private Integer week;

  public RankingWeek polls(List<@Valid RankingWeekPollsInner> polls) {
    this.polls = polls;
    return this;
  }

  public RankingWeek addPollsItem(RankingWeekPollsInner pollsItem) {
    if (this.polls == null) {
      this.polls = new ArrayList<>();
    }
    this.polls.add(pollsItem);
    return this;
  }

  /**
   * Get polls
   * @return polls
  */
  @Valid 
  @Schema(name = "polls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("polls")
  public List<@Valid RankingWeekPollsInner> getPolls() {
    return polls;
  }

  public void setPolls(List<@Valid RankingWeekPollsInner> polls) {
    this.polls = polls;
  }

  public RankingWeek season(Integer season) {
    this.season = season;
    return this;
  }

  /**
   * Get season
   * @return season
  */
  
  @Schema(name = "season", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("season")
  public Integer getSeason() {
    return season;
  }

  public void setSeason(Integer season) {
    this.season = season;
  }

  public RankingWeek seasonType(String seasonType) {
    this.seasonType = seasonType;
    return this;
  }

  /**
   * Get seasonType
   * @return seasonType
  */
  
  @Schema(name = "seasonType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seasonType")
  public String getSeasonType() {
    return seasonType;
  }

  public void setSeasonType(String seasonType) {
    this.seasonType = seasonType;
  }

  public RankingWeek week(Integer week) {
    this.week = week;
    return this;
  }

  /**
   * Get week
   * @return week
  */
  
  @Schema(name = "week", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("week")
  public Integer getWeek() {
    return week;
  }

  public void setWeek(Integer week) {
    this.week = week;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RankingWeek rankingWeek = (RankingWeek) o;
    return Objects.equals(this.polls, rankingWeek.polls) &&
        Objects.equals(this.season, rankingWeek.season) &&
        Objects.equals(this.seasonType, rankingWeek.seasonType) &&
        Objects.equals(this.week, rankingWeek.week);
  }

  @Override
  public int hashCode() {
    return Objects.hash(polls, season, seasonType, week);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RankingWeek {\n");
    sb.append("    polls: ").append(toIndentedString(polls)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    seasonType: ").append(toIndentedString(seasonType)).append("\n");
    sb.append("    week: ").append(toIndentedString(week)).append("\n");
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

