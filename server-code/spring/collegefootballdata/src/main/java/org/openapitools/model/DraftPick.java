package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.DraftPickHometownInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DraftPick
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class DraftPick {

  private Integer collegeAthleteId;

  private String collegeConference;

  private Integer collegeId;

  private String collegeTeam;

  private Integer height;

  private DraftPickHometownInfo hometownInfo;

  private String name;

  private Integer nflAthleteId;

  private String nflTeam;

  private Integer overall;

  private Integer pick;

  private String position;

  private Integer preDraftGrade;

  private Integer preDraftPositionRanking;

  private Integer preDraftRanking;

  private Integer round;

  private Integer weight;

  private Integer year;

  public DraftPick collegeAthleteId(Integer collegeAthleteId) {
    this.collegeAthleteId = collegeAthleteId;
    return this;
  }

  /**
   * Get collegeAthleteId
   * @return collegeAthleteId
  */
  
  @Schema(name = "collegeAthleteId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collegeAthleteId")
  public Integer getCollegeAthleteId() {
    return collegeAthleteId;
  }

  public void setCollegeAthleteId(Integer collegeAthleteId) {
    this.collegeAthleteId = collegeAthleteId;
  }

  public DraftPick collegeConference(String collegeConference) {
    this.collegeConference = collegeConference;
    return this;
  }

  /**
   * Get collegeConference
   * @return collegeConference
  */
  
  @Schema(name = "collegeConference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collegeConference")
  public String getCollegeConference() {
    return collegeConference;
  }

  public void setCollegeConference(String collegeConference) {
    this.collegeConference = collegeConference;
  }

  public DraftPick collegeId(Integer collegeId) {
    this.collegeId = collegeId;
    return this;
  }

  /**
   * Get collegeId
   * @return collegeId
  */
  
  @Schema(name = "collegeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collegeId")
  public Integer getCollegeId() {
    return collegeId;
  }

  public void setCollegeId(Integer collegeId) {
    this.collegeId = collegeId;
  }

  public DraftPick collegeTeam(String collegeTeam) {
    this.collegeTeam = collegeTeam;
    return this;
  }

  /**
   * Get collegeTeam
   * @return collegeTeam
  */
  
  @Schema(name = "collegeTeam", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collegeTeam")
  public String getCollegeTeam() {
    return collegeTeam;
  }

  public void setCollegeTeam(String collegeTeam) {
    this.collegeTeam = collegeTeam;
  }

  public DraftPick height(Integer height) {
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

  public DraftPick hometownInfo(DraftPickHometownInfo hometownInfo) {
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
  public DraftPickHometownInfo getHometownInfo() {
    return hometownInfo;
  }

  public void setHometownInfo(DraftPickHometownInfo hometownInfo) {
    this.hometownInfo = hometownInfo;
  }

  public DraftPick name(String name) {
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

  public DraftPick nflAthleteId(Integer nflAthleteId) {
    this.nflAthleteId = nflAthleteId;
    return this;
  }

  /**
   * Get nflAthleteId
   * @return nflAthleteId
  */
  
  @Schema(name = "nflAthleteId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nflAthleteId")
  public Integer getNflAthleteId() {
    return nflAthleteId;
  }

  public void setNflAthleteId(Integer nflAthleteId) {
    this.nflAthleteId = nflAthleteId;
  }

  public DraftPick nflTeam(String nflTeam) {
    this.nflTeam = nflTeam;
    return this;
  }

  /**
   * Get nflTeam
   * @return nflTeam
  */
  
  @Schema(name = "nflTeam", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nflTeam")
  public String getNflTeam() {
    return nflTeam;
  }

  public void setNflTeam(String nflTeam) {
    this.nflTeam = nflTeam;
  }

  public DraftPick overall(Integer overall) {
    this.overall = overall;
    return this;
  }

  /**
   * Get overall
   * @return overall
  */
  
  @Schema(name = "overall", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overall")
  public Integer getOverall() {
    return overall;
  }

  public void setOverall(Integer overall) {
    this.overall = overall;
  }

  public DraftPick pick(Integer pick) {
    this.pick = pick;
    return this;
  }

  /**
   * Get pick
   * @return pick
  */
  
  @Schema(name = "pick", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pick")
  public Integer getPick() {
    return pick;
  }

  public void setPick(Integer pick) {
    this.pick = pick;
  }

  public DraftPick position(String position) {
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

  public DraftPick preDraftGrade(Integer preDraftGrade) {
    this.preDraftGrade = preDraftGrade;
    return this;
  }

  /**
   * Get preDraftGrade
   * @return preDraftGrade
  */
  
  @Schema(name = "preDraftGrade", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preDraftGrade")
  public Integer getPreDraftGrade() {
    return preDraftGrade;
  }

  public void setPreDraftGrade(Integer preDraftGrade) {
    this.preDraftGrade = preDraftGrade;
  }

  public DraftPick preDraftPositionRanking(Integer preDraftPositionRanking) {
    this.preDraftPositionRanking = preDraftPositionRanking;
    return this;
  }

  /**
   * Get preDraftPositionRanking
   * @return preDraftPositionRanking
  */
  
  @Schema(name = "preDraftPositionRanking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preDraftPositionRanking")
  public Integer getPreDraftPositionRanking() {
    return preDraftPositionRanking;
  }

  public void setPreDraftPositionRanking(Integer preDraftPositionRanking) {
    this.preDraftPositionRanking = preDraftPositionRanking;
  }

  public DraftPick preDraftRanking(Integer preDraftRanking) {
    this.preDraftRanking = preDraftRanking;
    return this;
  }

  /**
   * Get preDraftRanking
   * @return preDraftRanking
  */
  
  @Schema(name = "preDraftRanking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preDraftRanking")
  public Integer getPreDraftRanking() {
    return preDraftRanking;
  }

  public void setPreDraftRanking(Integer preDraftRanking) {
    this.preDraftRanking = preDraftRanking;
  }

  public DraftPick round(Integer round) {
    this.round = round;
    return this;
  }

  /**
   * Get round
   * @return round
  */
  
  @Schema(name = "round", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("round")
  public Integer getRound() {
    return round;
  }

  public void setRound(Integer round) {
    this.round = round;
  }

  public DraftPick weight(Integer weight) {
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

  public DraftPick year(Integer year) {
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
    DraftPick draftPick = (DraftPick) o;
    return Objects.equals(this.collegeAthleteId, draftPick.collegeAthleteId) &&
        Objects.equals(this.collegeConference, draftPick.collegeConference) &&
        Objects.equals(this.collegeId, draftPick.collegeId) &&
        Objects.equals(this.collegeTeam, draftPick.collegeTeam) &&
        Objects.equals(this.height, draftPick.height) &&
        Objects.equals(this.hometownInfo, draftPick.hometownInfo) &&
        Objects.equals(this.name, draftPick.name) &&
        Objects.equals(this.nflAthleteId, draftPick.nflAthleteId) &&
        Objects.equals(this.nflTeam, draftPick.nflTeam) &&
        Objects.equals(this.overall, draftPick.overall) &&
        Objects.equals(this.pick, draftPick.pick) &&
        Objects.equals(this.position, draftPick.position) &&
        Objects.equals(this.preDraftGrade, draftPick.preDraftGrade) &&
        Objects.equals(this.preDraftPositionRanking, draftPick.preDraftPositionRanking) &&
        Objects.equals(this.preDraftRanking, draftPick.preDraftRanking) &&
        Objects.equals(this.round, draftPick.round) &&
        Objects.equals(this.weight, draftPick.weight) &&
        Objects.equals(this.year, draftPick.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collegeAthleteId, collegeConference, collegeId, collegeTeam, height, hometownInfo, name, nflAthleteId, nflTeam, overall, pick, position, preDraftGrade, preDraftPositionRanking, preDraftRanking, round, weight, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DraftPick {\n");
    sb.append("    collegeAthleteId: ").append(toIndentedString(collegeAthleteId)).append("\n");
    sb.append("    collegeConference: ").append(toIndentedString(collegeConference)).append("\n");
    sb.append("    collegeId: ").append(toIndentedString(collegeId)).append("\n");
    sb.append("    collegeTeam: ").append(toIndentedString(collegeTeam)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    hometownInfo: ").append(toIndentedString(hometownInfo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nflAthleteId: ").append(toIndentedString(nflAthleteId)).append("\n");
    sb.append("    nflTeam: ").append(toIndentedString(nflTeam)).append("\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    pick: ").append(toIndentedString(pick)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    preDraftGrade: ").append(toIndentedString(preDraftGrade)).append("\n");
    sb.append("    preDraftPositionRanking: ").append(toIndentedString(preDraftPositionRanking)).append("\n");
    sb.append("    preDraftRanking: ").append(toIndentedString(preDraftRanking)).append("\n");
    sb.append("    round: ").append(toIndentedString(round)).append("\n");
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

