package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PlayerGameTeamsInnerCategoriesInnerTypesInnerAthletesInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PlayerGameTeamsInnerCategoriesInnerTypesInner
 */

@JsonTypeName("PlayerGame_teams_inner_categories_inner_types_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class PlayerGameTeamsInnerCategoriesInnerTypesInner {

  @Valid
  private List<@Valid PlayerGameTeamsInnerCategoriesInnerTypesInnerAthletesInner> athletes;

  private String name;

  public PlayerGameTeamsInnerCategoriesInnerTypesInner athletes(List<@Valid PlayerGameTeamsInnerCategoriesInnerTypesInnerAthletesInner> athletes) {
    this.athletes = athletes;
    return this;
  }

  public PlayerGameTeamsInnerCategoriesInnerTypesInner addAthletesItem(PlayerGameTeamsInnerCategoriesInnerTypesInnerAthletesInner athletesItem) {
    if (this.athletes == null) {
      this.athletes = new ArrayList<>();
    }
    this.athletes.add(athletesItem);
    return this;
  }

  /**
   * Get athletes
   * @return athletes
  */
  @Valid 
  @Schema(name = "athletes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("athletes")
  public List<@Valid PlayerGameTeamsInnerCategoriesInnerTypesInnerAthletesInner> getAthletes() {
    return athletes;
  }

  public void setAthletes(List<@Valid PlayerGameTeamsInnerCategoriesInnerTypesInnerAthletesInner> athletes) {
    this.athletes = athletes;
  }

  public PlayerGameTeamsInnerCategoriesInnerTypesInner name(String name) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerGameTeamsInnerCategoriesInnerTypesInner playerGameTeamsInnerCategoriesInnerTypesInner = (PlayerGameTeamsInnerCategoriesInnerTypesInner) o;
    return Objects.equals(this.athletes, playerGameTeamsInnerCategoriesInnerTypesInner.athletes) &&
        Objects.equals(this.name, playerGameTeamsInnerCategoriesInnerTypesInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(athletes, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerGameTeamsInnerCategoriesInnerTypesInner {\n");
    sb.append("    athletes: ").append(toIndentedString(athletes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

