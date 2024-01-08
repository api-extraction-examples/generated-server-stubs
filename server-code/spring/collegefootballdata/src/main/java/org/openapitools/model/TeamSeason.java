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
 * TeamSeason
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class TeamSeason {

  private Integer games;

  private Integer losses;

  private Integer postseasonRank;

  private Integer preseasonRank;

  private String school;

  private BigDecimal spDefense;

  private BigDecimal spOffense;

  private BigDecimal spOverall;

  private BigDecimal srs;

  private Integer ties;

  private Integer wins;

  private String year;

  public TeamSeason games(Integer games) {
    this.games = games;
    return this;
  }

  /**
   * Get games
   * @return games
  */
  
  @Schema(name = "games", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("games")
  public Integer getGames() {
    return games;
  }

  public void setGames(Integer games) {
    this.games = games;
  }

  public TeamSeason losses(Integer losses) {
    this.losses = losses;
    return this;
  }

  /**
   * Get losses
   * @return losses
  */
  
  @Schema(name = "losses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("losses")
  public Integer getLosses() {
    return losses;
  }

  public void setLosses(Integer losses) {
    this.losses = losses;
  }

  public TeamSeason postseasonRank(Integer postseasonRank) {
    this.postseasonRank = postseasonRank;
    return this;
  }

  /**
   * Final ranking in the AP poll
   * @return postseasonRank
  */
  
  @Schema(name = "postseason_rank", description = "Final ranking in the AP poll", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postseason_rank")
  public Integer getPostseasonRank() {
    return postseasonRank;
  }

  public void setPostseasonRank(Integer postseasonRank) {
    this.postseasonRank = postseasonRank;
  }

  public TeamSeason preseasonRank(Integer preseasonRank) {
    this.preseasonRank = preseasonRank;
    return this;
  }

  /**
   * Rank in the AP preseason poll
   * @return preseasonRank
  */
  
  @Schema(name = "preseason_rank", description = "Rank in the AP preseason poll", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preseason_rank")
  public Integer getPreseasonRank() {
    return preseasonRank;
  }

  public void setPreseasonRank(Integer preseasonRank) {
    this.preseasonRank = preseasonRank;
  }

  public TeamSeason school(String school) {
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

  public TeamSeason spDefense(BigDecimal spDefense) {
    this.spDefense = spDefense;
    return this;
  }

  /**
   * Final SP+ defensive rating
   * @return spDefense
  */
  @Valid 
  @Schema(name = "sp_defense", description = "Final SP+ defensive rating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sp_defense")
  public BigDecimal getSpDefense() {
    return spDefense;
  }

  public void setSpDefense(BigDecimal spDefense) {
    this.spDefense = spDefense;
  }

  public TeamSeason spOffense(BigDecimal spOffense) {
    this.spOffense = spOffense;
    return this;
  }

  /**
   * Final SP+ offensive rating
   * @return spOffense
  */
  @Valid 
  @Schema(name = "sp_offense", description = "Final SP+ offensive rating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sp_offense")
  public BigDecimal getSpOffense() {
    return spOffense;
  }

  public void setSpOffense(BigDecimal spOffense) {
    this.spOffense = spOffense;
  }

  public TeamSeason spOverall(BigDecimal spOverall) {
    this.spOverall = spOverall;
    return this;
  }

  /**
   * Final overall SP+ rating
   * @return spOverall
  */
  @Valid 
  @Schema(name = "sp_overall", description = "Final overall SP+ rating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sp_overall")
  public BigDecimal getSpOverall() {
    return spOverall;
  }

  public void setSpOverall(BigDecimal spOverall) {
    this.spOverall = spOverall;
  }

  public TeamSeason srs(BigDecimal srs) {
    this.srs = srs;
    return this;
  }

  /**
   * Final SRS rankings
   * @return srs
  */
  @Valid 
  @Schema(name = "srs", description = "Final SRS rankings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("srs")
  public BigDecimal getSrs() {
    return srs;
  }

  public void setSrs(BigDecimal srs) {
    this.srs = srs;
  }

  public TeamSeason ties(Integer ties) {
    this.ties = ties;
    return this;
  }

  /**
   * Get ties
   * @return ties
  */
  
  @Schema(name = "ties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ties")
  public Integer getTies() {
    return ties;
  }

  public void setTies(Integer ties) {
    this.ties = ties;
  }

  public TeamSeason wins(Integer wins) {
    this.wins = wins;
    return this;
  }

  /**
   * Get wins
   * @return wins
  */
  
  @Schema(name = "wins", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wins")
  public Integer getWins() {
    return wins;
  }

  public void setWins(Integer wins) {
    this.wins = wins;
  }

  public TeamSeason year(String year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  */
  
  @Schema(name = "year", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("year")
  public String getYear() {
    return year;
  }

  public void setYear(String year) {
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
    TeamSeason teamSeason = (TeamSeason) o;
    return Objects.equals(this.games, teamSeason.games) &&
        Objects.equals(this.losses, teamSeason.losses) &&
        Objects.equals(this.postseasonRank, teamSeason.postseasonRank) &&
        Objects.equals(this.preseasonRank, teamSeason.preseasonRank) &&
        Objects.equals(this.school, teamSeason.school) &&
        Objects.equals(this.spDefense, teamSeason.spDefense) &&
        Objects.equals(this.spOffense, teamSeason.spOffense) &&
        Objects.equals(this.spOverall, teamSeason.spOverall) &&
        Objects.equals(this.srs, teamSeason.srs) &&
        Objects.equals(this.ties, teamSeason.ties) &&
        Objects.equals(this.wins, teamSeason.wins) &&
        Objects.equals(this.year, teamSeason.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(games, losses, postseasonRank, preseasonRank, school, spDefense, spOffense, spOverall, srs, ties, wins, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamSeason {\n");
    sb.append("    games: ").append(toIndentedString(games)).append("\n");
    sb.append("    losses: ").append(toIndentedString(losses)).append("\n");
    sb.append("    postseasonRank: ").append(toIndentedString(postseasonRank)).append("\n");
    sb.append("    preseasonRank: ").append(toIndentedString(preseasonRank)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    spDefense: ").append(toIndentedString(spDefense)).append("\n");
    sb.append("    spOffense: ").append(toIndentedString(spOffense)).append("\n");
    sb.append("    spOverall: ").append(toIndentedString(spOverall)).append("\n");
    sb.append("    srs: ").append(toIndentedString(srs)).append("\n");
    sb.append("    ties: ").append(toIndentedString(ties)).append("\n");
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
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

