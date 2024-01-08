package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PlayerGameTeamsInnerCategoriesInnerTypesInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PlayerGameTeamsInnerCategoriesInner
 */

@JsonTypeName("PlayerGame_teams_inner_categories_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class PlayerGameTeamsInnerCategoriesInner {

  private String name;

  @Valid
  private List<@Valid PlayerGameTeamsInnerCategoriesInnerTypesInner> types;

  public PlayerGameTeamsInnerCategoriesInner name(String name) {
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

  public PlayerGameTeamsInnerCategoriesInner types(List<@Valid PlayerGameTeamsInnerCategoriesInnerTypesInner> types) {
    this.types = types;
    return this;
  }

  public PlayerGameTeamsInnerCategoriesInner addTypesItem(PlayerGameTeamsInnerCategoriesInnerTypesInner typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * Get types
   * @return types
  */
  @Valid 
  @Schema(name = "types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("types")
  public List<@Valid PlayerGameTeamsInnerCategoriesInnerTypesInner> getTypes() {
    return types;
  }

  public void setTypes(List<@Valid PlayerGameTeamsInnerCategoriesInnerTypesInner> types) {
    this.types = types;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerGameTeamsInnerCategoriesInner playerGameTeamsInnerCategoriesInner = (PlayerGameTeamsInnerCategoriesInner) o;
    return Objects.equals(this.name, playerGameTeamsInnerCategoriesInner.name) &&
        Objects.equals(this.types, playerGameTeamsInnerCategoriesInner.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerGameTeamsInnerCategoriesInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

