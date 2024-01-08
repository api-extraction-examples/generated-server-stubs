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
 * SecuritySchemeLevelBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SecuritySchemeLevelBean {

  private String description;

  private Boolean isDefault;

  @Valid
  private List<@Valid SecuritySchemeLevelMemberBean> members;

  private String name;

  public SecuritySchemeLevelBean() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SecuritySchemeLevelBean(String name) {
    this.name = name;
  }

  public SecuritySchemeLevelBean description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the issue security scheme level.
   * @return description
  */
  @Size(max = 4000) 
  @Schema(name = "description", description = "The description of the issue security scheme level.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SecuritySchemeLevelBean isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Specifies whether the level is the default level. False by default.
   * @return isDefault
  */
  
  @Schema(name = "isDefault", description = "Specifies whether the level is the default level. False by default.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDefault")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public SecuritySchemeLevelBean members(List<@Valid SecuritySchemeLevelMemberBean> members) {
    this.members = members;
    return this;
  }

  public SecuritySchemeLevelBean addMembersItem(SecuritySchemeLevelMemberBean membersItem) {
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

  public SecuritySchemeLevelBean name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue security scheme level. Must be unique.
   * @return name
  */
  @NotNull @Size(max = 255) 
  @Schema(name = "name", description = "The name of the issue security scheme level. Must be unique.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    SecuritySchemeLevelBean securitySchemeLevelBean = (SecuritySchemeLevelBean) o;
    return Objects.equals(this.description, securitySchemeLevelBean.description) &&
        Objects.equals(this.isDefault, securitySchemeLevelBean.isDefault) &&
        Objects.equals(this.members, securitySchemeLevelBean.members) &&
        Objects.equals(this.name, securitySchemeLevelBean.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isDefault, members, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritySchemeLevelBean {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

