package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LivePlayByPlayDrivesInner;
import org.openapitools.model.LivePlayByPlayTeamsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LivePlayByPlay
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class LivePlayByPlay {

  private String clock;

  private Integer distance;

  private Integer down;

  @Valid
  private List<@Valid LivePlayByPlayDrivesInner> drives;

  private Integer id;

  private Integer period;

  private String possession;

  private String status;

  @Valid
  private List<@Valid LivePlayByPlayTeamsInner> teams;

  private Integer yardsToGoal;

  public LivePlayByPlay clock(String clock) {
    this.clock = clock;
    return this;
  }

  /**
   * Get clock
   * @return clock
  */
  
  @Schema(name = "clock", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clock")
  public String getClock() {
    return clock;
  }

  public void setClock(String clock) {
    this.clock = clock;
  }

  public LivePlayByPlay distance(Integer distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
  */
  
  @Schema(name = "distance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distance")
  public Integer getDistance() {
    return distance;
  }

  public void setDistance(Integer distance) {
    this.distance = distance;
  }

  public LivePlayByPlay down(Integer down) {
    this.down = down;
    return this;
  }

  /**
   * Get down
   * @return down
  */
  
  @Schema(name = "down", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("down")
  public Integer getDown() {
    return down;
  }

  public void setDown(Integer down) {
    this.down = down;
  }

  public LivePlayByPlay drives(List<@Valid LivePlayByPlayDrivesInner> drives) {
    this.drives = drives;
    return this;
  }

  public LivePlayByPlay addDrivesItem(LivePlayByPlayDrivesInner drivesItem) {
    if (this.drives == null) {
      this.drives = new ArrayList<>();
    }
    this.drives.add(drivesItem);
    return this;
  }

  /**
   * Get drives
   * @return drives
  */
  @Valid 
  @Schema(name = "drives", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drives")
  public List<@Valid LivePlayByPlayDrivesInner> getDrives() {
    return drives;
  }

  public void setDrives(List<@Valid LivePlayByPlayDrivesInner> drives) {
    this.drives = drives;
  }

  public LivePlayByPlay id(Integer id) {
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

  public LivePlayByPlay period(Integer period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
  */
  
  @Schema(name = "period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("period")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public LivePlayByPlay possession(String possession) {
    this.possession = possession;
    return this;
  }

  /**
   * Get possession
   * @return possession
  */
  
  @Schema(name = "possession", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("possession")
  public String getPossession() {
    return possession;
  }

  public void setPossession(String possession) {
    this.possession = possession;
  }

  public LivePlayByPlay status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public LivePlayByPlay teams(List<@Valid LivePlayByPlayTeamsInner> teams) {
    this.teams = teams;
    return this;
  }

  public LivePlayByPlay addTeamsItem(LivePlayByPlayTeamsInner teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Get teams
   * @return teams
  */
  @Valid 
  @Schema(name = "teams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("teams")
  public List<@Valid LivePlayByPlayTeamsInner> getTeams() {
    return teams;
  }

  public void setTeams(List<@Valid LivePlayByPlayTeamsInner> teams) {
    this.teams = teams;
  }

  public LivePlayByPlay yardsToGoal(Integer yardsToGoal) {
    this.yardsToGoal = yardsToGoal;
    return this;
  }

  /**
   * Get yardsToGoal
   * @return yardsToGoal
  */
  
  @Schema(name = "yardsToGoal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yardsToGoal")
  public Integer getYardsToGoal() {
    return yardsToGoal;
  }

  public void setYardsToGoal(Integer yardsToGoal) {
    this.yardsToGoal = yardsToGoal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LivePlayByPlay livePlayByPlay = (LivePlayByPlay) o;
    return Objects.equals(this.clock, livePlayByPlay.clock) &&
        Objects.equals(this.distance, livePlayByPlay.distance) &&
        Objects.equals(this.down, livePlayByPlay.down) &&
        Objects.equals(this.drives, livePlayByPlay.drives) &&
        Objects.equals(this.id, livePlayByPlay.id) &&
        Objects.equals(this.period, livePlayByPlay.period) &&
        Objects.equals(this.possession, livePlayByPlay.possession) &&
        Objects.equals(this.status, livePlayByPlay.status) &&
        Objects.equals(this.teams, livePlayByPlay.teams) &&
        Objects.equals(this.yardsToGoal, livePlayByPlay.yardsToGoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clock, distance, down, drives, id, period, possession, status, teams, yardsToGoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LivePlayByPlay {\n");
    sb.append("    clock: ").append(toIndentedString(clock)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    down: ").append(toIndentedString(down)).append("\n");
    sb.append("    drives: ").append(toIndentedString(drives)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    possession: ").append(toIndentedString(possession)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    yardsToGoal: ").append(toIndentedString(yardsToGoal)).append("\n");
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

