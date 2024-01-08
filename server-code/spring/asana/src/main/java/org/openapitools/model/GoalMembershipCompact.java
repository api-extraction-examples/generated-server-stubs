package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.UserCompact;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GoalMembershipCompact
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class GoalMembershipCompact {

  private String gid;

  private String resourceType;

  private Boolean isCommenter;

  private Boolean isEditor;

  private UserCompact member;

  public GoalMembershipCompact gid(String gid) {
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

  public GoalMembershipCompact resourceType(String resourceType) {
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

  public GoalMembershipCompact isCommenter(Boolean isCommenter) {
    this.isCommenter = isCommenter;
    return this;
  }

  /**
   * Describes if the user is comment only in goal.
   * @return isCommenter
  */
  
  @Schema(name = "is_commenter", example = "false", description = "Describes if the user is comment only in goal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_commenter")
  public Boolean getIsCommenter() {
    return isCommenter;
  }

  public void setIsCommenter(Boolean isCommenter) {
    this.isCommenter = isCommenter;
  }

  public GoalMembershipCompact isEditor(Boolean isEditor) {
    this.isEditor = isEditor;
    return this;
  }

  /**
   * Describes if the user is editor in goal.
   * @return isEditor
  */
  
  @Schema(name = "is_editor", example = "false", description = "Describes if the user is editor in goal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_editor")
  public Boolean getIsEditor() {
    return isEditor;
  }

  public void setIsEditor(Boolean isEditor) {
    this.isEditor = isEditor;
  }

  public GoalMembershipCompact member(UserCompact member) {
    this.member = member;
    return this;
  }

  /**
   * Get member
   * @return member
  */
  @Valid 
  @Schema(name = "member", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("member")
  public UserCompact getMember() {
    return member;
  }

  public void setMember(UserCompact member) {
    this.member = member;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalMembershipCompact goalMembershipCompact = (GoalMembershipCompact) o;
    return Objects.equals(this.gid, goalMembershipCompact.gid) &&
        Objects.equals(this.resourceType, goalMembershipCompact.resourceType) &&
        Objects.equals(this.isCommenter, goalMembershipCompact.isCommenter) &&
        Objects.equals(this.isEditor, goalMembershipCompact.isEditor) &&
        Objects.equals(this.member, goalMembershipCompact.member);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, isCommenter, isEditor, member);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalMembershipCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    isCommenter: ").append(toIndentedString(isCommenter)).append("\n");
    sb.append("    isEditor: ").append(toIndentedString(isEditor)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
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

