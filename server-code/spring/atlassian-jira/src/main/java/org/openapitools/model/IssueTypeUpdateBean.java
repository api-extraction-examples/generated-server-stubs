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
 * IssueTypeUpdateBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeUpdateBean {

  private Long avatarId;

  private String description;

  private String name;

  public IssueTypeUpdateBean avatarId(Long avatarId) {
    this.avatarId = avatarId;
    return this;
  }

  /**
   * The ID of an issue type avatar.
   * @return avatarId
  */
  
  @Schema(name = "avatarId", description = "The ID of an issue type avatar.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatarId")
  public Long getAvatarId() {
    return avatarId;
  }

  public void setAvatarId(Long avatarId) {
    this.avatarId = avatarId;
  }

  public IssueTypeUpdateBean description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the issue type.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the issue type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IssueTypeUpdateBean name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The unique name for the issue type. The maximum length is 60 characters.
   * @return name
  */
  
  @Schema(name = "name", description = "The unique name for the issue type. The maximum length is 60 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    IssueTypeUpdateBean issueTypeUpdateBean = (IssueTypeUpdateBean) o;
    return Objects.equals(this.avatarId, issueTypeUpdateBean.avatarId) &&
        Objects.equals(this.description, issueTypeUpdateBean.description) &&
        Objects.equals(this.name, issueTypeUpdateBean.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarId, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeUpdateBean {\n");
    sb.append("    avatarId: ").append(toIndentedString(avatarId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

