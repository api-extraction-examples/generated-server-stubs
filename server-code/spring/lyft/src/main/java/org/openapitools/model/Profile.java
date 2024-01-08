package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents the general information about a user.
 */

@Schema(name = "Profile", description = "Represents the general information about a user.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class Profile {

  private String firstName;

  private Boolean hasTakenARide;

  private String id;

  private String lastName;

  public Profile() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Profile(String firstName, Boolean hasTakenARide, String id, String lastName) {
    this.firstName = firstName;
    this.hasTakenARide = hasTakenARide;
    this.id = id;
    this.lastName = lastName;
  }

  public Profile firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of this user
   * @return firstName
  */
  @NotNull 
  @Schema(name = "first_name", description = "The first name of this user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Profile hasTakenARide(Boolean hasTakenARide) {
    this.hasTakenARide = hasTakenARide;
    return this;
  }

  /**
   * Indicates whether this user has taken at least one Lyft ride
   * @return hasTakenARide
  */
  @NotNull 
  @Schema(name = "has_taken_a_ride", description = "Indicates whether this user has taken at least one Lyft ride", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("has_taken_a_ride")
  public Boolean getHasTakenARide() {
    return hasTakenARide;
  }

  public void setHasTakenARide(Boolean hasTakenARide) {
    this.hasTakenARide = hasTakenARide;
  }

  public Profile id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID of this user
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The unique ID of this user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Profile lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of this user
   * @return lastName
  */
  @NotNull 
  @Schema(name = "last_name", description = "The last name of this user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.firstName, profile.firstName) &&
        Objects.equals(this.hasTakenARide, profile.hasTakenARide) &&
        Objects.equals(this.id, profile.id) &&
        Objects.equals(this.lastName, profile.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, hasTakenARide, id, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    hasTakenARide: ").append(toIndentedString(hasTakenARide)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

