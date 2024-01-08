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
 * EnvVarUser
 */

@JsonTypeName("envVarUser")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class EnvVarUser {

  private String avatarUrl;

  private String email;

  private String fullName;

  private String id;

  public EnvVarUser avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  /**
   * A URL pointing to the user's avatar
   * @return avatarUrl
  */
  
  @Schema(name = "avatar_url", description = "A URL pointing to the user's avatar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatar_url")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public EnvVarUser email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The user's email address
   * @return email
  */
  
  @Schema(name = "email", description = "The user's email address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public EnvVarUser fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * The user's full name (first and last)
   * @return fullName
  */
  
  @Schema(name = "full_name", description = "The user's full name (first and last)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public EnvVarUser id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The user's unique identifier
   * @return id
  */
  
  @Schema(name = "id", description = "The user's unique identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvVarUser envVarUser = (EnvVarUser) o;
    return Objects.equals(this.avatarUrl, envVarUser.avatarUrl) &&
        Objects.equals(this.email, envVarUser.email) &&
        Objects.equals(this.fullName, envVarUser.fullName) &&
        Objects.equals(this.id, envVarUser.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, email, fullName, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvVarUser {\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

