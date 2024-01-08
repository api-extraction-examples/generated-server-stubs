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
 * Details of an issue type.
 */

@Schema(name = "IssueTypeInfo", description = "Details of an issue type.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeInfo {

  private Long avatarId;

  private Long id;

  private String name;

  public IssueTypeInfo avatarId(Long avatarId) {
    this.avatarId = avatarId;
    return this;
  }

  /**
   * The avatar of the issue type.
   * @return avatarId
  */
  
  @Schema(name = "avatarId", accessMode = Schema.AccessMode.READ_ONLY, description = "The avatar of the issue type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatarId")
  public Long getAvatarId() {
    return avatarId;
  }

  public void setAvatarId(Long avatarId) {
    this.avatarId = avatarId;
  }

  public IssueTypeInfo id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the issue type.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the issue type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public IssueTypeInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue type.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the issue type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    IssueTypeInfo issueTypeInfo = (IssueTypeInfo) o;
    return Objects.equals(this.avatarId, issueTypeInfo.avatarId) &&
        Objects.equals(this.id, issueTypeInfo.id) &&
        Objects.equals(this.name, issueTypeInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarId, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeInfo {\n");
    sb.append("    avatarId: ").append(toIndentedString(avatarId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

