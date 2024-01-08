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
 * UserCounts
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:07.987869-04:00[America/Lower_Princes]")
public class UserCounts {

  private Integer followedBy;

  private Integer follows;

  private Integer media;

  public UserCounts followedBy(Integer followedBy) {
    this.followedBy = followedBy;
    return this;
  }

  /**
   * Number of followers of this user
   * @return followedBy
  */
  
  @Schema(name = "followed_by", description = "Number of followers of this user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followed_by")
  public Integer getFollowedBy() {
    return followedBy;
  }

  public void setFollowedBy(Integer followedBy) {
    this.followedBy = followedBy;
  }

  public UserCounts follows(Integer follows) {
    this.follows = follows;
    return this;
  }

  /**
   * Number of users followed by this user
   * @return follows
  */
  
  @Schema(name = "follows", description = "Number of users followed by this user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("follows")
  public Integer getFollows() {
    return follows;
  }

  public void setFollows(Integer follows) {
    this.follows = follows;
  }

  public UserCounts media(Integer media) {
    this.media = media;
    return this;
  }

  /**
   * Number of user media
   * @return media
  */
  
  @Schema(name = "media", description = "Number of user media", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media")
  public Integer getMedia() {
    return media;
  }

  public void setMedia(Integer media) {
    this.media = media;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCounts userCounts = (UserCounts) o;
    return Objects.equals(this.followedBy, userCounts.followedBy) &&
        Objects.equals(this.follows, userCounts.follows) &&
        Objects.equals(this.media, userCounts.media);
  }

  @Override
  public int hashCode() {
    return Objects.hash(followedBy, follows, media);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCounts {\n");
    sb.append("    followedBy: ").append(toIndentedString(followedBy)).append("\n");
    sb.append("    follows: ").append(toIndentedString(follows)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
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

