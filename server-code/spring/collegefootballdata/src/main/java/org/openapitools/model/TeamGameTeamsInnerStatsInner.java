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
 * TeamGameTeamsInnerStatsInner
 */

@JsonTypeName("TeamGame_teams_inner_stats_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class TeamGameTeamsInnerStatsInner {

  private String category;

  private String stat;

  public TeamGameTeamsInnerStatsInner category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  
  @Schema(name = "category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public TeamGameTeamsInnerStatsInner stat(String stat) {
    this.stat = stat;
    return this;
  }

  /**
   * Get stat
   * @return stat
  */
  
  @Schema(name = "stat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stat")
  public String getStat() {
    return stat;
  }

  public void setStat(String stat) {
    this.stat = stat;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamGameTeamsInnerStatsInner teamGameTeamsInnerStatsInner = (TeamGameTeamsInnerStatsInner) o;
    return Objects.equals(this.category, teamGameTeamsInnerStatsInner.category) &&
        Objects.equals(this.stat, teamGameTeamsInnerStatsInner.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, stat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamGameTeamsInnerStatsInner {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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

