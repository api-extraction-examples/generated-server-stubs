package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserUserIdGet200Response
 */

@JsonTypeName("_user__user_id__get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class UserUserIdGet200Response {

  private Boolean allowNotes;

  private String bio;

  private Integer followersCount;

  private Integer followingCount;

  private String fullname;

  private Boolean hasList;

  private String id;

  private String imageUrl;

  private Boolean isBookAuthor;

  private Boolean isSuspended;

  private Boolean isWriterProgramEnrolled;

  private String mediumMemberAt;

  @Valid
  private List<String> topWriterIn;

  private String twitterUsername;

  private String username;

  public UserUserIdGet200Response allowNotes(Boolean allowNotes) {
    this.allowNotes = allowNotes;
    return this;
  }

  /**
   * Get allowNotes
   * @return allowNotes
  */
  
  @Schema(name = "allow_notes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allow_notes")
  public Boolean getAllowNotes() {
    return allowNotes;
  }

  public void setAllowNotes(Boolean allowNotes) {
    this.allowNotes = allowNotes;
  }

  public UserUserIdGet200Response bio(String bio) {
    this.bio = bio;
    return this;
  }

  /**
   * Get bio
   * @return bio
  */
  
  @Schema(name = "bio", example = "Obsessed with Tech Biz Arts &amp; Words; Does NOT dumb down the writing; Skilled Wordsmith; Delivers the best", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bio")
  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public UserUserIdGet200Response followersCount(Integer followersCount) {
    this.followersCount = followersCount;
    return this;
  }

  /**
   * Get followersCount
   * @return followersCount
  */
  
  @Schema(name = "followers_count", example = "450", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followers_count")
  public Integer getFollowersCount() {
    return followersCount;
  }

  public void setFollowersCount(Integer followersCount) {
    this.followersCount = followersCount;
  }

  public UserUserIdGet200Response followingCount(Integer followingCount) {
    this.followingCount = followingCount;
    return this;
  }

  /**
   * Get followingCount
   * @return followingCount
  */
  
  @Schema(name = "following_count", example = "4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("following_count")
  public Integer getFollowingCount() {
    return followingCount;
  }

  public void setFollowingCount(Integer followingCount) {
    this.followingCount = followingCount;
  }

  public UserUserIdGet200Response fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

  /**
   * Get fullname
   * @return fullname
  */
  
  @Schema(name = "fullname", example = "Nishu Jain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fullname")
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public UserUserIdGet200Response hasList(Boolean hasList) {
    this.hasList = hasList;
    return this;
  }

  /**
   * Get hasList
   * @return hasList
  */
  
  @Schema(name = "has_list", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_list")
  public Boolean getHasList() {
    return hasList;
  }

  public void setHasList(Boolean hasList) {
    this.hasList = hasList;
  }

  public UserUserIdGet200Response id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "1985b61817c3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserUserIdGet200Response imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  */
  
  @Schema(name = "image_url", example = "https://miro.medium.com/1*C92Hx7k9nRM7TPlrmhgW9w.jpeg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_url")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public UserUserIdGet200Response isBookAuthor(Boolean isBookAuthor) {
    this.isBookAuthor = isBookAuthor;
    return this;
  }

  /**
   * Get isBookAuthor
   * @return isBookAuthor
  */
  
  @Schema(name = "is_book_author", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_book_author")
  public Boolean getIsBookAuthor() {
    return isBookAuthor;
  }

  public void setIsBookAuthor(Boolean isBookAuthor) {
    this.isBookAuthor = isBookAuthor;
  }

  public UserUserIdGet200Response isSuspended(Boolean isSuspended) {
    this.isSuspended = isSuspended;
    return this;
  }

  /**
   * Get isSuspended
   * @return isSuspended
  */
  
  @Schema(name = "is_suspended", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_suspended")
  public Boolean getIsSuspended() {
    return isSuspended;
  }

  public void setIsSuspended(Boolean isSuspended) {
    this.isSuspended = isSuspended;
  }

  public UserUserIdGet200Response isWriterProgramEnrolled(Boolean isWriterProgramEnrolled) {
    this.isWriterProgramEnrolled = isWriterProgramEnrolled;
    return this;
  }

  /**
   * Get isWriterProgramEnrolled
   * @return isWriterProgramEnrolled
  */
  
  @Schema(name = "is_writer_program_enrolled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_writer_program_enrolled")
  public Boolean getIsWriterProgramEnrolled() {
    return isWriterProgramEnrolled;
  }

  public void setIsWriterProgramEnrolled(Boolean isWriterProgramEnrolled) {
    this.isWriterProgramEnrolled = isWriterProgramEnrolled;
  }

  public UserUserIdGet200Response mediumMemberAt(String mediumMemberAt) {
    this.mediumMemberAt = mediumMemberAt;
    return this;
  }

  /**
   * Get mediumMemberAt
   * @return mediumMemberAt
  */
  
  @Schema(name = "medium_member_at", example = "2020-06-24 16:05:46", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("medium_member_at")
  public String getMediumMemberAt() {
    return mediumMemberAt;
  }

  public void setMediumMemberAt(String mediumMemberAt) {
    this.mediumMemberAt = mediumMemberAt;
  }

  public UserUserIdGet200Response topWriterIn(List<String> topWriterIn) {
    this.topWriterIn = topWriterIn;
    return this;
  }

  public UserUserIdGet200Response addTopWriterInItem(String topWriterInItem) {
    if (this.topWriterIn == null) {
      this.topWriterIn = new ArrayList<>();
    }
    this.topWriterIn.add(topWriterInItem);
    return this;
  }

  /**
   * Get topWriterIn
   * @return topWriterIn
  */
  
  @Schema(name = "top_writer_in", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("top_writer_in")
  public List<String> getTopWriterIn() {
    return topWriterIn;
  }

  public void setTopWriterIn(List<String> topWriterIn) {
    this.topWriterIn = topWriterIn;
  }

  public UserUserIdGet200Response twitterUsername(String twitterUsername) {
    this.twitterUsername = twitterUsername;
    return this;
  }

  /**
   * Get twitterUsername
   * @return twitterUsername
  */
  
  @Schema(name = "twitter_username", example = "one_anachronism", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("twitter_username")
  public String getTwitterUsername() {
    return twitterUsername;
  }

  public void setTwitterUsername(String twitterUsername) {
    this.twitterUsername = twitterUsername;
  }

  public UserUserIdGet200Response username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  
  @Schema(name = "username", example = "nishu-jain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    UserUserIdGet200Response userUserIdGet200Response = (UserUserIdGet200Response) o;
    return Objects.equals(this.allowNotes, userUserIdGet200Response.allowNotes) &&
        Objects.equals(this.bio, userUserIdGet200Response.bio) &&
        Objects.equals(this.followersCount, userUserIdGet200Response.followersCount) &&
        Objects.equals(this.followingCount, userUserIdGet200Response.followingCount) &&
        Objects.equals(this.fullname, userUserIdGet200Response.fullname) &&
        Objects.equals(this.hasList, userUserIdGet200Response.hasList) &&
        Objects.equals(this.id, userUserIdGet200Response.id) &&
        Objects.equals(this.imageUrl, userUserIdGet200Response.imageUrl) &&
        Objects.equals(this.isBookAuthor, userUserIdGet200Response.isBookAuthor) &&
        Objects.equals(this.isSuspended, userUserIdGet200Response.isSuspended) &&
        Objects.equals(this.isWriterProgramEnrolled, userUserIdGet200Response.isWriterProgramEnrolled) &&
        Objects.equals(this.mediumMemberAt, userUserIdGet200Response.mediumMemberAt) &&
        Objects.equals(this.topWriterIn, userUserIdGet200Response.topWriterIn) &&
        Objects.equals(this.twitterUsername, userUserIdGet200Response.twitterUsername) &&
        Objects.equals(this.username, userUserIdGet200Response.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowNotes, bio, followersCount, followingCount, fullname, hasList, id, imageUrl, isBookAuthor, isSuspended, isWriterProgramEnrolled, mediumMemberAt, topWriterIn, twitterUsername, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUserIdGet200Response {\n");
    sb.append("    allowNotes: ").append(toIndentedString(allowNotes)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    followersCount: ").append(toIndentedString(followersCount)).append("\n");
    sb.append("    followingCount: ").append(toIndentedString(followingCount)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    hasList: ").append(toIndentedString(hasList)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    isBookAuthor: ").append(toIndentedString(isBookAuthor)).append("\n");
    sb.append("    isSuspended: ").append(toIndentedString(isSuspended)).append("\n");
    sb.append("    isWriterProgramEnrolled: ").append(toIndentedString(isWriterProgramEnrolled)).append("\n");
    sb.append("    mediumMemberAt: ").append(toIndentedString(mediumMemberAt)).append("\n");
    sb.append("    topWriterIn: ").append(toIndentedString(topWriterIn)).append("\n");
    sb.append("    twitterUsername: ").append(toIndentedString(twitterUsername)).append("\n");
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

