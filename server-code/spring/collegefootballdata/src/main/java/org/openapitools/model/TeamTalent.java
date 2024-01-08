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
 * TeamTalent
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class TeamTalent {

  private String school;

  private BigDecimal talent;

  private Integer year;

  public TeamTalent school(String school) {
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

  public TeamTalent talent(BigDecimal talent) {
    this.talent = talent;
    return this;
  }

  /**
   * Get talent
   * @return talent
  */
  @Valid 
  @Schema(name = "talent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("talent")
  public BigDecimal getTalent() {
    return talent;
  }

  public void setTalent(BigDecimal talent) {
    this.talent = talent;
  }

  public TeamTalent year(Integer year) {
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
    TeamTalent teamTalent = (TeamTalent) o;
    return Objects.equals(this.school, teamTalent.school) &&
        Objects.equals(this.talent, teamTalent.talent) &&
        Objects.equals(this.year, teamTalent.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(school, talent, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamTalent {\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    talent: ").append(toIndentedString(talent)).append("\n");
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

