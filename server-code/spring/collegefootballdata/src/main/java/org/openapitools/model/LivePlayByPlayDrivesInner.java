package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LivePlayByPlayDrivesInnerPlaysInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LivePlayByPlayDrivesInner
 */

@JsonTypeName("LivePlayByPlay_drives_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class LivePlayByPlayDrivesInner {

  private String defense;

  private Integer defenseId;

  private String duration;

  private String endClock;

  private Integer endPeriod;

  private Integer endYardsToGoal;

  private Integer id;

  private String offense;

  private Integer offenseId;

  private Integer playCount;

  @Valid
  private List<@Valid LivePlayByPlayDrivesInnerPlaysInner> plays;

  private Boolean scoringOpportunity;

  private String startClock;

  private Integer startPeriod;

  private Integer startYardsToGoal;

  private Integer yards;

  public LivePlayByPlayDrivesInner defense(String defense) {
    this.defense = defense;
    return this;
  }

  /**
   * Get defense
   * @return defense
  */
  
  @Schema(name = "defense", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defense")
  public String getDefense() {
    return defense;
  }

  public void setDefense(String defense) {
    this.defense = defense;
  }

  public LivePlayByPlayDrivesInner defenseId(Integer defenseId) {
    this.defenseId = defenseId;
    return this;
  }

  /**
   * Get defenseId
   * @return defenseId
  */
  
  @Schema(name = "defenseId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defenseId")
  public Integer getDefenseId() {
    return defenseId;
  }

  public void setDefenseId(Integer defenseId) {
    this.defenseId = defenseId;
  }

  public LivePlayByPlayDrivesInner duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  */
  
  @Schema(name = "duration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public LivePlayByPlayDrivesInner endClock(String endClock) {
    this.endClock = endClock;
    return this;
  }

  /**
   * Get endClock
   * @return endClock
  */
  
  @Schema(name = "endClock", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endClock")
  public String getEndClock() {
    return endClock;
  }

  public void setEndClock(String endClock) {
    this.endClock = endClock;
  }

  public LivePlayByPlayDrivesInner endPeriod(Integer endPeriod) {
    this.endPeriod = endPeriod;
    return this;
  }

  /**
   * Get endPeriod
   * @return endPeriod
  */
  
  @Schema(name = "endPeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endPeriod")
  public Integer getEndPeriod() {
    return endPeriod;
  }

  public void setEndPeriod(Integer endPeriod) {
    this.endPeriod = endPeriod;
  }

  public LivePlayByPlayDrivesInner endYardsToGoal(Integer endYardsToGoal) {
    this.endYardsToGoal = endYardsToGoal;
    return this;
  }

  /**
   * Get endYardsToGoal
   * @return endYardsToGoal
  */
  
  @Schema(name = "endYardsToGoal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endYardsToGoal")
  public Integer getEndYardsToGoal() {
    return endYardsToGoal;
  }

  public void setEndYardsToGoal(Integer endYardsToGoal) {
    this.endYardsToGoal = endYardsToGoal;
  }

  public LivePlayByPlayDrivesInner id(Integer id) {
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

  public LivePlayByPlayDrivesInner offense(String offense) {
    this.offense = offense;
    return this;
  }

  /**
   * Get offense
   * @return offense
  */
  
  @Schema(name = "offense", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offense")
  public String getOffense() {
    return offense;
  }

  public void setOffense(String offense) {
    this.offense = offense;
  }

  public LivePlayByPlayDrivesInner offenseId(Integer offenseId) {
    this.offenseId = offenseId;
    return this;
  }

  /**
   * Get offenseId
   * @return offenseId
  */
  
  @Schema(name = "offenseId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offenseId")
  public Integer getOffenseId() {
    return offenseId;
  }

  public void setOffenseId(Integer offenseId) {
    this.offenseId = offenseId;
  }

  public LivePlayByPlayDrivesInner playCount(Integer playCount) {
    this.playCount = playCount;
    return this;
  }

  /**
   * Get playCount
   * @return playCount
  */
  
  @Schema(name = "playCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("playCount")
  public Integer getPlayCount() {
    return playCount;
  }

  public void setPlayCount(Integer playCount) {
    this.playCount = playCount;
  }

  public LivePlayByPlayDrivesInner plays(List<@Valid LivePlayByPlayDrivesInnerPlaysInner> plays) {
    this.plays = plays;
    return this;
  }

  public LivePlayByPlayDrivesInner addPlaysItem(LivePlayByPlayDrivesInnerPlaysInner playsItem) {
    if (this.plays == null) {
      this.plays = new ArrayList<>();
    }
    this.plays.add(playsItem);
    return this;
  }

  /**
   * Get plays
   * @return plays
  */
  @Valid 
  @Schema(name = "plays", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("plays")
  public List<@Valid LivePlayByPlayDrivesInnerPlaysInner> getPlays() {
    return plays;
  }

  public void setPlays(List<@Valid LivePlayByPlayDrivesInnerPlaysInner> plays) {
    this.plays = plays;
  }

  public LivePlayByPlayDrivesInner scoringOpportunity(Boolean scoringOpportunity) {
    this.scoringOpportunity = scoringOpportunity;
    return this;
  }

  /**
   * Get scoringOpportunity
   * @return scoringOpportunity
  */
  
  @Schema(name = "scoringOpportunity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scoringOpportunity")
  public Boolean getScoringOpportunity() {
    return scoringOpportunity;
  }

  public void setScoringOpportunity(Boolean scoringOpportunity) {
    this.scoringOpportunity = scoringOpportunity;
  }

  public LivePlayByPlayDrivesInner startClock(String startClock) {
    this.startClock = startClock;
    return this;
  }

  /**
   * Get startClock
   * @return startClock
  */
  
  @Schema(name = "startClock", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startClock")
  public String getStartClock() {
    return startClock;
  }

  public void setStartClock(String startClock) {
    this.startClock = startClock;
  }

  public LivePlayByPlayDrivesInner startPeriod(Integer startPeriod) {
    this.startPeriod = startPeriod;
    return this;
  }

  /**
   * Get startPeriod
   * @return startPeriod
  */
  
  @Schema(name = "startPeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startPeriod")
  public Integer getStartPeriod() {
    return startPeriod;
  }

  public void setStartPeriod(Integer startPeriod) {
    this.startPeriod = startPeriod;
  }

  public LivePlayByPlayDrivesInner startYardsToGoal(Integer startYardsToGoal) {
    this.startYardsToGoal = startYardsToGoal;
    return this;
  }

  /**
   * Get startYardsToGoal
   * @return startYardsToGoal
  */
  
  @Schema(name = "startYardsToGoal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startYardsToGoal")
  public Integer getStartYardsToGoal() {
    return startYardsToGoal;
  }

  public void setStartYardsToGoal(Integer startYardsToGoal) {
    this.startYardsToGoal = startYardsToGoal;
  }

  public LivePlayByPlayDrivesInner yards(Integer yards) {
    this.yards = yards;
    return this;
  }

  /**
   * Get yards
   * @return yards
  */
  
  @Schema(name = "yards", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yards")
  public Integer getYards() {
    return yards;
  }

  public void setYards(Integer yards) {
    this.yards = yards;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LivePlayByPlayDrivesInner livePlayByPlayDrivesInner = (LivePlayByPlayDrivesInner) o;
    return Objects.equals(this.defense, livePlayByPlayDrivesInner.defense) &&
        Objects.equals(this.defenseId, livePlayByPlayDrivesInner.defenseId) &&
        Objects.equals(this.duration, livePlayByPlayDrivesInner.duration) &&
        Objects.equals(this.endClock, livePlayByPlayDrivesInner.endClock) &&
        Objects.equals(this.endPeriod, livePlayByPlayDrivesInner.endPeriod) &&
        Objects.equals(this.endYardsToGoal, livePlayByPlayDrivesInner.endYardsToGoal) &&
        Objects.equals(this.id, livePlayByPlayDrivesInner.id) &&
        Objects.equals(this.offense, livePlayByPlayDrivesInner.offense) &&
        Objects.equals(this.offenseId, livePlayByPlayDrivesInner.offenseId) &&
        Objects.equals(this.playCount, livePlayByPlayDrivesInner.playCount) &&
        Objects.equals(this.plays, livePlayByPlayDrivesInner.plays) &&
        Objects.equals(this.scoringOpportunity, livePlayByPlayDrivesInner.scoringOpportunity) &&
        Objects.equals(this.startClock, livePlayByPlayDrivesInner.startClock) &&
        Objects.equals(this.startPeriod, livePlayByPlayDrivesInner.startPeriod) &&
        Objects.equals(this.startYardsToGoal, livePlayByPlayDrivesInner.startYardsToGoal) &&
        Objects.equals(this.yards, livePlayByPlayDrivesInner.yards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defense, defenseId, duration, endClock, endPeriod, endYardsToGoal, id, offense, offenseId, playCount, plays, scoringOpportunity, startClock, startPeriod, startYardsToGoal, yards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LivePlayByPlayDrivesInner {\n");
    sb.append("    defense: ").append(toIndentedString(defense)).append("\n");
    sb.append("    defenseId: ").append(toIndentedString(defenseId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endClock: ").append(toIndentedString(endClock)).append("\n");
    sb.append("    endPeriod: ").append(toIndentedString(endPeriod)).append("\n");
    sb.append("    endYardsToGoal: ").append(toIndentedString(endYardsToGoal)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offense: ").append(toIndentedString(offense)).append("\n");
    sb.append("    offenseId: ").append(toIndentedString(offenseId)).append("\n");
    sb.append("    playCount: ").append(toIndentedString(playCount)).append("\n");
    sb.append("    plays: ").append(toIndentedString(plays)).append("\n");
    sb.append("    scoringOpportunity: ").append(toIndentedString(scoringOpportunity)).append("\n");
    sb.append("    startClock: ").append(toIndentedString(startClock)).append("\n");
    sb.append("    startPeriod: ").append(toIndentedString(startPeriod)).append("\n");
    sb.append("    startYardsToGoal: ").append(toIndentedString(startYardsToGoal)).append("\n");
    sb.append("    yards: ").append(toIndentedString(yards)).append("\n");
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

