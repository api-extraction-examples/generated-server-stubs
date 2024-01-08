package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CaptionData;
import org.openapitools.model.CommentsCollection;
import org.openapitools.model.ImagesData;
import org.openapitools.model.LikesCollection;
import org.openapitools.model.LocationInfo;
import org.openapitools.model.UserInPhoto;
import org.openapitools.model.UserShortInfo;
import org.openapitools.model.VideosData;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MediaEntry
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:07.987869-04:00[America/Lower_Princes]")
public class MediaEntry {

  private String attribution;

  private CaptionData caption;

  private CommentsCollection comments;

  private String createdTime;

  private String filter;

  private String id;

  private ImagesData images;

  private LikesCollection likes;

  private String link;

  private LocationInfo location;

  @Valid
  private List<String> tags;

  /**
   * Type of this media entry
   */
  public enum TypeEnum {
    IMAGE("image"),
    
    VIDEO("video");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private UserShortInfo user;

  private Boolean userHasLiked;

  @Valid
  private List<@Valid UserInPhoto> usersInPhoto;

  private VideosData videos;

  public MediaEntry attribution(String attribution) {
    this.attribution = attribution;
    return this;
  }

  /**
   * ??? Unknown ???
   * @return attribution
  */
  
  @Schema(name = "attribution", description = "??? Unknown ???", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attribution")
  public String getAttribution() {
    return attribution;
  }

  public void setAttribution(String attribution) {
    this.attribution = attribution;
  }

  public MediaEntry caption(CaptionData caption) {
    this.caption = caption;
    return this;
  }

  /**
   * Get caption
   * @return caption
  */
  @Valid 
  @Schema(name = "caption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caption")
  public CaptionData getCaption() {
    return caption;
  }

  public void setCaption(CaptionData caption) {
    this.caption = caption;
  }

  public MediaEntry comments(CommentsCollection comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Get comments
   * @return comments
  */
  @Valid 
  @Schema(name = "comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comments")
  public CommentsCollection getComments() {
    return comments;
  }

  public void setComments(CommentsCollection comments) {
    this.comments = comments;
  }

  public MediaEntry createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Media creation UNIX timestamp
   * @return createdTime
  */
  
  @Schema(name = "created_time", description = "Media creation UNIX timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public MediaEntry filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Filter of this media entry
   * @return filter
  */
  
  @Schema(name = "filter", description = "Filter of this media entry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter")
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public MediaEntry id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of a media entry
   * @return id
  */
  
  @Schema(name = "id", description = "ID of a media entry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MediaEntry images(ImagesData images) {
    this.images = images;
    return this;
  }

  /**
   * Get images
   * @return images
  */
  @Valid 
  @Schema(name = "images", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("images")
  public ImagesData getImages() {
    return images;
  }

  public void setImages(ImagesData images) {
    this.images = images;
  }

  public MediaEntry likes(LikesCollection likes) {
    this.likes = likes;
    return this;
  }

  /**
   * Get likes
   * @return likes
  */
  @Valid 
  @Schema(name = "likes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likes")
  public LikesCollection getLikes() {
    return likes;
  }

  public void setLikes(LikesCollection likes) {
    this.likes = likes;
  }

  public MediaEntry link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Fixed URL of this media entry
   * @return link
  */
  
  @Schema(name = "link", description = "Fixed URL of this media entry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public MediaEntry location(LocationInfo location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @Valid 
  @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public LocationInfo getLocation() {
    return location;
  }

  public void setLocation(LocationInfo location) {
    this.location = location;
  }

  public MediaEntry tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MediaEntry addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of tags assigned to this media
   * @return tags
  */
  
  @Schema(name = "tags", description = "List of tags assigned to this media", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public MediaEntry type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of this media entry
   * @return type
  */
  
  @Schema(name = "type", description = "Type of this media entry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MediaEntry user(UserShortInfo user) {
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
  public UserShortInfo getUser() {
    return user;
  }

  public void setUser(UserShortInfo user) {
    this.user = user;
  }

  public MediaEntry userHasLiked(Boolean userHasLiked) {
    this.userHasLiked = userHasLiked;
    return this;
  }

  /**
   * Indicates whether authenticated user has liked this media or not
   * @return userHasLiked
  */
  
  @Schema(name = "user_has_liked", description = "Indicates whether authenticated user has liked this media or not", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_has_liked")
  public Boolean getUserHasLiked() {
    return userHasLiked;
  }

  public void setUserHasLiked(Boolean userHasLiked) {
    this.userHasLiked = userHasLiked;
  }

  public MediaEntry usersInPhoto(List<@Valid UserInPhoto> usersInPhoto) {
    this.usersInPhoto = usersInPhoto;
    return this;
  }

  public MediaEntry addUsersInPhotoItem(UserInPhoto usersInPhotoItem) {
    if (this.usersInPhoto == null) {
      this.usersInPhoto = new ArrayList<>();
    }
    this.usersInPhoto.add(usersInPhotoItem);
    return this;
  }

  /**
   * Users located on this media entry
   * @return usersInPhoto
  */
  @Valid 
  @Schema(name = "users_in_photo", description = "Users located on this media entry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("users_in_photo")
  public List<@Valid UserInPhoto> getUsersInPhoto() {
    return usersInPhoto;
  }

  public void setUsersInPhoto(List<@Valid UserInPhoto> usersInPhoto) {
    this.usersInPhoto = usersInPhoto;
  }

  public MediaEntry videos(VideosData videos) {
    this.videos = videos;
    return this;
  }

  /**
   * Get videos
   * @return videos
  */
  @Valid 
  @Schema(name = "videos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("videos")
  public VideosData getVideos() {
    return videos;
  }

  public void setVideos(VideosData videos) {
    this.videos = videos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaEntry mediaEntry = (MediaEntry) o;
    return Objects.equals(this.attribution, mediaEntry.attribution) &&
        Objects.equals(this.caption, mediaEntry.caption) &&
        Objects.equals(this.comments, mediaEntry.comments) &&
        Objects.equals(this.createdTime, mediaEntry.createdTime) &&
        Objects.equals(this.filter, mediaEntry.filter) &&
        Objects.equals(this.id, mediaEntry.id) &&
        Objects.equals(this.images, mediaEntry.images) &&
        Objects.equals(this.likes, mediaEntry.likes) &&
        Objects.equals(this.link, mediaEntry.link) &&
        Objects.equals(this.location, mediaEntry.location) &&
        Objects.equals(this.tags, mediaEntry.tags) &&
        Objects.equals(this.type, mediaEntry.type) &&
        Objects.equals(this.user, mediaEntry.user) &&
        Objects.equals(this.userHasLiked, mediaEntry.userHasLiked) &&
        Objects.equals(this.usersInPhoto, mediaEntry.usersInPhoto) &&
        Objects.equals(this.videos, mediaEntry.videos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribution, caption, comments, createdTime, filter, id, images, likes, link, location, tags, type, user, userHasLiked, usersInPhoto, videos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaEntry {\n");
    sb.append("    attribution: ").append(toIndentedString(attribution)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userHasLiked: ").append(toIndentedString(userHasLiked)).append("\n");
    sb.append("    usersInPhoto: ").append(toIndentedString(usersInPhoto)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
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

