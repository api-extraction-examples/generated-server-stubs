package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CoachSeasonsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Coach
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class Coach {

  private String firstName;

  private String hireDate;

  private String lastName;

  @Valid
  private List<@Valid CoachSeasonsInner> seasons;

  public Coach firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "first_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Coach hireDate(String hireDate) {
    this.hireDate = hireDate;
    return this;
  }

  /**
   * Get hireDate
   * @return hireDate
  */
  
  @Schema(name = "hire_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hire_date")
  public String getHireDate() {
    return hireDate;
  }

  public void setHireDate(String hireDate) {
    this.hireDate = hireDate;
  }

  public Coach lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  
  @Schema(name = "last_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Coach seasons(List<@Valid CoachSeasonsInner> seasons) {
    this.seasons = seasons;
    return this;
  }

  public Coach addSeasonsItem(CoachSeasonsInner seasonsItem) {
    if (this.seasons == null) {
      this.seasons = new ArrayList<>();
    }
    this.seasons.add(seasonsItem);
    return this;
  }

  /**
   * Get seasons
   * @return seasons
  */
  @Valid 
  @Schema(name = "seasons", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seasons")
  public List<@Valid CoachSeasonsInner> getSeasons() {
    return seasons;
  }

  public void setSeasons(List<@Valid CoachSeasonsInner> seasons) {
    this.seasons = seasons;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Coach coach = (Coach) o;
    return Objects.equals(this.firstName, coach.firstName) &&
        Objects.equals(this.hireDate, coach.hireDate) &&
        Objects.equals(this.lastName, coach.lastName) &&
        Objects.equals(this.seasons, coach.seasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, hireDate, lastName, seasons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coach {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    hireDate: ").append(toIndentedString(hireDate)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    seasons: ").append(toIndentedString(seasons)).append("\n");
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

