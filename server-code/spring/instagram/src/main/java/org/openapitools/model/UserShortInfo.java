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
 * UserShortInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:07.987869-04:00[America/Lower_Princes]")
public class UserShortInfo {

  private String fullName;

  private String id;

  private String profilePicture;

  private String username;

  public UserShortInfo fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * User full name
   * @return fullName
  */
  
  @Schema(name = "full_name", description = "User full name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public UserShortInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * User ID
   * @return id
  */
  
  @Schema(name = "id", description = "User ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserShortInfo profilePicture(String profilePicture) {
    this.profilePicture = profilePicture;
    return this;
  }

  /**
   * URL to user profile picture
   * @return profilePicture
  */
  
  @Schema(name = "profile_picture", description = "URL to user profile picture", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profile_picture")
  public String getProfilePicture() {
    return profilePicture;
  }

  public void setProfilePicture(String profilePicture) {
    this.profilePicture = profilePicture;
  }

  public UserShortInfo username(String username) {
    this.username = username;
    return this;
  }

  /**
   * User name, nickname
   * @return username
  */
  
  @Schema(name = "username", description = "User name, nickname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserShortInfo userShortInfo = (UserShortInfo) o;
    return Objects.equals(this.fullName, userShortInfo.fullName) &&
        Objects.equals(this.id, userShortInfo.id) &&
        Objects.equals(this.profilePicture, userShortInfo.profilePicture) &&
        Objects.equals(this.username, userShortInfo.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, id, profilePicture, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserShortInfo {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    profilePicture: ").append(toIndentedString(profilePicture)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

