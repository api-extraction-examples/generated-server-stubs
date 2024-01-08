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
 * PlayerGameTeamsInnerCategoriesInnerTypesInnerAthletesInner
 */

@JsonTypeName("PlayerGame_teams_inner_categories_inner_types_inner_athletes_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class PlayerGameTeamsInnerCategoriesInnerTypesInnerAthletesInner {

  private Integer id;

  private String name;

  private String stat;

  public PlayerGameTeamsInnerCategoriesInnerTypesInnerAthletesInner id(Integer id) {
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

  public PlayerGameTeamsInnerCategoriesInnerTypesInnerAthletesInner name(String name) {
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

  public PlayerGameTeamsInnerCategoriesInnerTypesInnerAthletesInner stat(String stat) {
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
    PlayerGameTeamsInnerCategoriesInnerTypesInnerAthletesInner playerGameTeamsInnerCategoriesInnerTypesInnerAthletesInner = (PlayerGameTeamsInnerCategoriesInnerTypesInnerAthletesInner) o;
    return Objects.equals(this.id, playerGameTeamsInnerCategoriesInnerTypesInnerAthletesInner.id) &&
        Objects.equals(this.name, playerGameTeamsInnerCategoriesInnerTypesInnerAthletesInner.name) &&
        Objects.equals(this.stat, playerGameTeamsInnerCategoriesInnerTypesInnerAthletesInner.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, stat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerGameTeamsInnerCategoriesInnerTypesInnerAthletesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

