package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.UserCounts;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:07.987869-04:00[America/Lower_Princes]")
public class UserInfo {

  private String bio;

  private UserCounts counts;

  private String fullName;

  private String id;

  private String profilePicture;

  private String username;

  private String website;

  public UserInfo bio(String bio) {
    this.bio = bio;
    return this;
  }

  /**
   * User biography
   * @return bio
  */
  
  @Schema(name = "bio", description = "User biography", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bio")
  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public UserInfo counts(UserCounts counts) {
    this.counts = counts;
    return this;
  }

  /**
   * Get counts
   * @return counts
  */
  @Valid 
  @Schema(name = "counts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("counts")
  public UserCounts getCounts() {
    return counts;
  }

  public void setCounts(UserCounts counts) {
    this.counts = counts;
  }

  public UserInfo fullName(String fullName) {
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

  public UserInfo id(String id) {
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

  public UserInfo profilePicture(String profilePicture) {
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

  public UserInfo username(String username) {
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

  public UserInfo website(String website) {
    this.website = website;
    return this;
  }

  /**
   * URL to user web-site
   * @return website
  */
  
  @Schema(name = "website", description = "URL to user web-site", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfo userInfo = (UserInfo) o;
    return Objects.equals(this.bio, userInfo.bio) &&
        Objects.equals(this.counts, userInfo.counts) &&
        Objects.equals(this.fullName, userInfo.fullName) &&
        Objects.equals(this.id, userInfo.id) &&
        Objects.equals(this.profilePicture, userInfo.profilePicture) &&
        Objects.equals(this.username, userInfo.username) &&
        Objects.equals(this.website, userInfo.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bio, counts, fullName, id, profilePicture, username, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    profilePicture: ").append(toIndentedString(profilePicture)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

