package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PlayerGameTeamsInnerCategoriesInner;
import org.openapitools.model.PlayerGameTeamsInnerSchool;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PlayerGameTeamsInner
 */

@JsonTypeName("PlayerGame_teams_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class PlayerGameTeamsInner {

  @Valid
  private List<@Valid PlayerGameTeamsInnerCategoriesInner> categories;

  private Boolean homeAway;

  private Integer points;

  private PlayerGameTeamsInnerSchool school;

  public PlayerGameTeamsInner categories(List<@Valid PlayerGameTeamsInnerCategoriesInner> categories) {
    this.categories = categories;
    return this;
  }

  public PlayerGameTeamsInner addCategoriesItem(PlayerGameTeamsInnerCategoriesInner categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
  */
  @Valid 
  @Schema(name = "categories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categories")
  public List<@Valid PlayerGameTeamsInnerCategoriesInner> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid PlayerGameTeamsInnerCategoriesInner> categories) {
    this.categories = categories;
  }

  public PlayerGameTeamsInner homeAway(Boolean homeAway) {
    this.homeAway = homeAway;
    return this;
  }

  /**
   * Get homeAway
   * @return homeAway
  */
  
  @Schema(name = "homeAway", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeAway")
  public Boolean getHomeAway() {
    return homeAway;
  }

  public void setHomeAway(Boolean homeAway) {
    this.homeAway = homeAway;
  }

  public PlayerGameTeamsInner points(Integer points) {
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

  public PlayerGameTeamsInner school(PlayerGameTeamsInnerSchool school) {
    this.school = school;
    return this;
  }

  /**
   * Get school
   * @return school
  */
  @Valid 
  @Schema(name = "school", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("school")
  public PlayerGameTeamsInnerSchool getSchool() {
    return school;
  }

  public void setSchool(PlayerGameTeamsInnerSchool school) {
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
    PlayerGameTeamsInner playerGameTeamsInner = (PlayerGameTeamsInner) o;
    return Objects.equals(this.categories, playerGameTeamsInner.categories) &&
        Objects.equals(this.homeAway, playerGameTeamsInner.homeAway) &&
        Objects.equals(this.points, playerGameTeamsInner.points) &&
        Objects.equals(this.school, playerGameTeamsInner.school);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, homeAway, points, school);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerGameTeamsInner {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    homeAway: ").append(toIndentedString(homeAway)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

