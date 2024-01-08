package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageType;
import org.openapitools.model.RatingType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class RemoteImageInfo.
 */

@Schema(name = "RemoteImageInfo", description = "Class RemoteImageInfo.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class RemoteImageInfo {

  private JsonNullable<Double> communityRating = JsonNullable.<Double>undefined();

  private JsonNullable<Integer> height = JsonNullable.<Integer>undefined();

  private JsonNullable<String> language = JsonNullable.<String>undefined();

  private JsonNullable<String> providerName = JsonNullable.<String>undefined();

  private RatingType ratingType;

  private JsonNullable<String> thumbnailUrl = JsonNullable.<String>undefined();

  private ImageType type;

  private JsonNullable<String> url = JsonNullable.<String>undefined();

  private JsonNullable<Integer> voteCount = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> width = JsonNullable.<Integer>undefined();

  public RemoteImageInfo communityRating(Double communityRating) {
    this.communityRating = JsonNullable.of(communityRating);
    return this;
  }

  /**
   * Gets or sets the community rating.
   * @return communityRating
  */
  
  @Schema(name = "CommunityRating", description = "Gets or sets the community rating.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CommunityRating")
  public JsonNullable<Double> getCommunityRating() {
    return communityRating;
  }

  public void setCommunityRating(JsonNullable<Double> communityRating) {
    this.communityRating = communityRating;
  }

  public RemoteImageInfo height(Integer height) {
    this.height = JsonNullable.of(height);
    return this;
  }

  /**
   * Gets or sets the height.
   * @return height
  */
  
  @Schema(name = "Height", description = "Gets or sets the height.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Height")
  public JsonNullable<Integer> getHeight() {
    return height;
  }

  public void setHeight(JsonNullable<Integer> height) {
    this.height = height;
  }

  public RemoteImageInfo language(String language) {
    this.language = JsonNullable.of(language);
    return this;
  }

  /**
   * Gets or sets the language.
   * @return language
  */
  
  @Schema(name = "Language", description = "Gets or sets the language.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Language")
  public JsonNullable<String> getLanguage() {
    return language;
  }

  public void setLanguage(JsonNullable<String> language) {
    this.language = language;
  }

  public RemoteImageInfo providerName(String providerName) {
    this.providerName = JsonNullable.of(providerName);
    return this;
  }

  /**
   * Gets or sets the name of the provider.
   * @return providerName
  */
  
  @Schema(name = "ProviderName", description = "Gets or sets the name of the provider.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProviderName")
  public JsonNullable<String> getProviderName() {
    return providerName;
  }

  public void setProviderName(JsonNullable<String> providerName) {
    this.providerName = providerName;
  }

  public RemoteImageInfo ratingType(RatingType ratingType) {
    this.ratingType = ratingType;
    return this;
  }

  /**
   * Get ratingType
   * @return ratingType
  */
  @Valid 
  @Schema(name = "RatingType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RatingType")
  public RatingType getRatingType() {
    return ratingType;
  }

  public void setRatingType(RatingType ratingType) {
    this.ratingType = ratingType;
  }

  public RemoteImageInfo thumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = JsonNullable.of(thumbnailUrl);
    return this;
  }

  /**
   * Gets a url used for previewing a smaller version.
   * @return thumbnailUrl
  */
  
  @Schema(name = "ThumbnailUrl", description = "Gets a url used for previewing a smaller version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ThumbnailUrl")
  public JsonNullable<String> getThumbnailUrl() {
    return thumbnailUrl;
  }

  public void setThumbnailUrl(JsonNullable<String> thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  public RemoteImageInfo type(ImageType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "Type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public ImageType getType() {
    return type;
  }

  public void setType(ImageType type) {
    this.type = type;
  }

  public RemoteImageInfo url(String url) {
    this.url = JsonNullable.of(url);
    return this;
  }

  /**
   * Gets or sets the URL.
   * @return url
  */
  
  @Schema(name = "Url", description = "Gets or sets the URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Url")
  public JsonNullable<String> getUrl() {
    return url;
  }

  public void setUrl(JsonNullable<String> url) {
    this.url = url;
  }

  public RemoteImageInfo voteCount(Integer voteCount) {
    this.voteCount = JsonNullable.of(voteCount);
    return this;
  }

  /**
   * Gets or sets the vote count.
   * @return voteCount
  */
  
  @Schema(name = "VoteCount", description = "Gets or sets the vote count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VoteCount")
  public JsonNullable<Integer> getVoteCount() {
    return voteCount;
  }

  public void setVoteCount(JsonNullable<Integer> voteCount) {
    this.voteCount = voteCount;
  }

  public RemoteImageInfo width(Integer width) {
    this.width = JsonNullable.of(width);
    return this;
  }

  /**
   * Gets or sets the width.
   * @return width
  */
  
  @Schema(name = "Width", description = "Gets or sets the width.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Width")
  public JsonNullable<Integer> getWidth() {
    return width;
  }

  public void setWidth(JsonNullable<Integer> width) {
    this.width = width;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteImageInfo remoteImageInfo = (RemoteImageInfo) o;
    return equalsNullable(this.communityRating, remoteImageInfo.communityRating) &&
        equalsNullable(this.height, remoteImageInfo.height) &&
        equalsNullable(this.language, remoteImageInfo.language) &&
        equalsNullable(this.providerName, remoteImageInfo.providerName) &&
        Objects.equals(this.ratingType, remoteImageInfo.ratingType) &&
        equalsNullable(this.thumbnailUrl, remoteImageInfo.thumbnailUrl) &&
        Objects.equals(this.type, remoteImageInfo.type) &&
        equalsNullable(this.url, remoteImageInfo.url) &&
        equalsNullable(this.voteCount, remoteImageInfo.voteCount) &&
        equalsNullable(this.width, remoteImageInfo.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(communityRating), hashCodeNullable(height), hashCodeNullable(language), hashCodeNullable(providerName), ratingType, hashCodeNullable(thumbnailUrl), type, hashCodeNullable(url), hashCodeNullable(voteCount), hashCodeNullable(width));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteImageInfo {\n");
    sb.append("    communityRating: ").append(toIndentedString(communityRating)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    ratingType: ").append(toIndentedString(ratingType)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

