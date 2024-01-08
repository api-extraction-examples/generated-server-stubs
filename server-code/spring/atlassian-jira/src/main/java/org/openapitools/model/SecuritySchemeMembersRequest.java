package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SecuritySchemeLevelMemberBean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of issue security scheme level new members.
 */

@Schema(name = "SecuritySchemeMembersRequest", description = "Details of issue security scheme level new members.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SecuritySchemeMembersRequest {

  @Valid
  private List<@Valid SecuritySchemeLevelMemberBean> members;

  public SecuritySchemeMembersRequest members(List<@Valid SecuritySchemeLevelMemberBean> members) {
    this.members = members;
    return this;
  }

  public SecuritySchemeMembersRequest addMembersItem(SecuritySchemeLevelMemberBean membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * The list of level members which should be added to the issue security scheme level.
   * @return members
  */
  @Valid 
  @Schema(name = "members", description = "The list of level members which should be added to the issue security scheme level.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("members")
  public List<@Valid SecuritySchemeLevelMemberBean> getMembers() {
    return members;
  }

  public void setMembers(List<@Valid SecuritySchemeLevelMemberBean> members) {
    this.members = members;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritySchemeMembersRequest securitySchemeMembersRequest = (SecuritySchemeMembersRequest) o;
    return Objects.equals(this.members, securitySchemeMembersRequest.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritySchemeMembersRequest {\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

