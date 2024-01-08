package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.User;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserRecord
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class UserRecord {

  private String avatar;

  private String environmentId;

  private String lastPing;

  private String ownerId;

  private User user;

  public UserRecord avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

  /**
   * Get avatar
   * @return avatar
  */
  
  @Schema(name = "avatar", example = "https://s3.amazonaws.com/uifaces/faces/twitter/shylockjoy/73.jpg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatar")
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public UserRecord environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  /**
   * Get environmentId
   * @return environmentId
  */
  
  @Schema(name = "environmentId", example = "54ac2d97de674204ddd61096", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("environmentId")
  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public UserRecord lastPing(String lastPing) {
    this.lastPing = lastPing;
    return this;
  }

  /**
   * Get lastPing
   * @return lastPing
  */
  
  @Schema(name = "lastPing", example = "2015-03-03T02:37:22.492Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastPing")
  public String getLastPing() {
    return lastPing;
  }

  public void setLastPing(String lastPing) {
    this.lastPing = lastPing;
  }

  public UserRecord ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * The unique resource id.
   * @return ownerId
  */
  
  @Schema(name = "ownerId", example = "5a580a01b4ff89217bdf9dc1", description = "The unique resource id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerId")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public UserRecord user(User user) {
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
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
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
    UserRecord userRecord = (UserRecord) o;
    return Objects.equals(this.avatar, userRecord.avatar) &&
        Objects.equals(this.environmentId, userRecord.environmentId) &&
        Objects.equals(this.lastPing, userRecord.lastPing) &&
        Objects.equals(this.ownerId, userRecord.ownerId) &&
        Objects.equals(this.user, userRecord.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatar, environmentId, lastPing, ownerId, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRecord {\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    lastPing: ").append(toIndentedString(lastPing)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

