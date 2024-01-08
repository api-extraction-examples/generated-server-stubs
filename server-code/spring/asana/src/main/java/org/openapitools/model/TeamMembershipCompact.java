package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.TeamCompact;
import org.openapitools.model.UserCompact;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TeamMembershipCompact
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class TeamMembershipCompact {

  private String gid;

  private String resourceType;

  private Boolean isGuest;

  private TeamCompact team;

  private UserCompact user;

  public TeamMembershipCompact gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
  */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public TeamMembershipCompact resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
  */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public TeamMembershipCompact isGuest(Boolean isGuest) {
    this.isGuest = isGuest;
    return this;
  }

  /**
   * Describes if the user is a guest in the team.
   * @return isGuest
  */
  
  @Schema(name = "is_guest", example = "false", description = "Describes if the user is a guest in the team.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_guest")
  public Boolean getIsGuest() {
    return isGuest;
  }

  public void setIsGuest(Boolean isGuest) {
    this.isGuest = isGuest;
  }

  public TeamMembershipCompact team(TeamCompact team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
  */
  @Valid 
  @Schema(name = "team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team")
  public TeamCompact getTeam() {
    return team;
  }

  public void setTeam(TeamCompact team) {
    this.team = team;
  }

  public TeamMembershipCompact user(UserCompact user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @Valid 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public UserCompact getUser() {
    return user;
  }

  public void setUser(UserCompact user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamMembershipCompact teamMembershipCompact = (TeamMembershipCompact) o;
    return Objects.equals(this.gid, teamMembershipCompact.gid) &&
        Objects.equals(this.resourceType, teamMembershipCompact.resourceType) &&
        Objects.equals(this.isGuest, teamMembershipCompact.isGuest) &&
        Objects.equals(this.team, teamMembershipCompact.team) &&
        Objects.equals(this.user, teamMembershipCompact.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, isGuest, team, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamMembershipCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    isGuest: ").append(toIndentedString(isGuest)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

