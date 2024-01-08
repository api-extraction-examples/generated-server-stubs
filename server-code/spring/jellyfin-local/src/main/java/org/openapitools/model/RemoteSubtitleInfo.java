package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RemoteSubtitleInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class RemoteSubtitleInfo {

  private JsonNullable<String> author = JsonNullable.<String>undefined();

  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  private JsonNullable<Float> communityRating = JsonNullable.<Float>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dateCreated = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Integer> downloadCount = JsonNullable.<Integer>undefined();

  private JsonNullable<String> format = JsonNullable.<String>undefined();

  private JsonNullable<String> id = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> isHashMatch = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> providerName = JsonNullable.<String>undefined();

  private JsonNullable<String> threeLetterISOLanguageName = JsonNullable.<String>undefined();

  public RemoteSubtitleInfo author(String author) {
    this.author = JsonNullable.of(author);
    return this;
  }

  /**
   * Get author
   * @return author
  */
  
  @Schema(name = "Author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Author")
  public JsonNullable<String> getAuthor() {
    return author;
  }

  public void setAuthor(JsonNullable<String> author) {
    this.author = author;
  }

  public RemoteSubtitleInfo comment(String comment) {
    this.comment = JsonNullable.of(comment);
    return this;
  }

  /**
   * Get comment
   * @return comment
  */
  
  @Schema(name = "Comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Comment")
  public JsonNullable<String> getComment() {
    return comment;
  }

  public void setComment(JsonNullable<String> comment) {
    this.comment = comment;
  }

  public RemoteSubtitleInfo communityRating(Float communityRating) {
    this.communityRating = JsonNullable.of(communityRating);
    return this;
  }

  /**
   * Get communityRating
   * @return communityRating
  */
  
  @Schema(name = "CommunityRating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CommunityRating")
  public JsonNullable<Float> getCommunityRating() {
    return communityRating;
  }

  public void setCommunityRating(JsonNullable<Float> communityRating) {
    this.communityRating = communityRating;
  }

  public RemoteSubtitleInfo dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = JsonNullable.of(dateCreated);
    return this;
  }

  /**
   * Get dateCreated
   * @return dateCreated
  */
  @Valid 
  @Schema(name = "DateCreated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DateCreated")
  public JsonNullable<OffsetDateTime> getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(JsonNullable<OffsetDateTime> dateCreated) {
    this.dateCreated = dateCreated;
  }

  public RemoteSubtitleInfo downloadCount(Integer downloadCount) {
    this.downloadCount = JsonNullable.of(downloadCount);
    return this;
  }

  /**
   * Get downloadCount
   * @return downloadCount
  */
  
  @Schema(name = "DownloadCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DownloadCount")
  public JsonNullable<Integer> getDownloadCount() {
    return downloadCount;
  }

  public void setDownloadCount(JsonNullable<Integer> downloadCount) {
    this.downloadCount = downloadCount;
  }

  public RemoteSubtitleInfo format(String format) {
    this.format = JsonNullable.of(format);
    return this;
  }

  /**
   * Get format
   * @return format
  */
  
  @Schema(name = "Format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Format")
  public JsonNullable<String> getFormat() {
    return format;
  }

  public void setFormat(JsonNullable<String> format) {
    this.format = format;
  }

  public RemoteSubtitleInfo id(String id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "Id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public JsonNullable<String> getId() {
    return id;
  }

  public void setId(JsonNullable<String> id) {
    this.id = id;
  }

  public RemoteSubtitleInfo isHashMatch(Boolean isHashMatch) {
    this.isHashMatch = JsonNullable.of(isHashMatch);
    return this;
  }

  /**
   * Get isHashMatch
   * @return isHashMatch
  */
  
  @Schema(name = "IsHashMatch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsHashMatch")
  public JsonNullable<Boolean> getIsHashMatch() {
    return isHashMatch;
  }

  public void setIsHashMatch(JsonNullable<Boolean> isHashMatch) {
    this.isHashMatch = isHashMatch;
  }

  public RemoteSubtitleInfo name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public RemoteSubtitleInfo providerName(String providerName) {
    this.providerName = JsonNullable.of(providerName);
    return this;
  }

  /**
   * Get providerName
   * @return providerName
  */
  
  @Schema(name = "ProviderName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProviderName")
  public JsonNullable<String> getProviderName() {
    return providerName;
  }

  public void setProviderName(JsonNullable<String> providerName) {
    this.providerName = providerName;
  }

  public RemoteSubtitleInfo threeLetterISOLanguageName(String threeLetterISOLanguageName) {
    this.threeLetterISOLanguageName = JsonNullable.of(threeLetterISOLanguageName);
    return this;
  }

  /**
   * Get threeLetterISOLanguageName
   * @return threeLetterISOLanguageName
  */
  
  @Schema(name = "ThreeLetterISOLanguageName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ThreeLetterISOLanguageName")
  public JsonNullable<String> getThreeLetterISOLanguageName() {
    return threeLetterISOLanguageName;
  }

  public void setThreeLetterISOLanguageName(JsonNullable<String> threeLetterISOLanguageName) {
    this.threeLetterISOLanguageName = threeLetterISOLanguageName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteSubtitleInfo remoteSubtitleInfo = (RemoteSubtitleInfo) o;
    return equalsNullable(this.author, remoteSubtitleInfo.author) &&
        equalsNullable(this.comment, remoteSubtitleInfo.comment) &&
        equalsNullable(this.communityRating, remoteSubtitleInfo.communityRating) &&
        equalsNullable(this.dateCreated, remoteSubtitleInfo.dateCreated) &&
        equalsNullable(this.downloadCount, remoteSubtitleInfo.downloadCount) &&
        equalsNullable(this.format, remoteSubtitleInfo.format) &&
        equalsNullable(this.id, remoteSubtitleInfo.id) &&
        equalsNullable(this.isHashMatch, remoteSubtitleInfo.isHashMatch) &&
        equalsNullable(this.name, remoteSubtitleInfo.name) &&
        equalsNullable(this.providerName, remoteSubtitleInfo.providerName) &&
        equalsNullable(this.threeLetterISOLanguageName, remoteSubtitleInfo.threeLetterISOLanguageName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(author), hashCodeNullable(comment), hashCodeNullable(communityRating), hashCodeNullable(dateCreated), hashCodeNullable(downloadCount), hashCodeNullable(format), hashCodeNullable(id), hashCodeNullable(isHashMatch), hashCodeNullable(name), hashCodeNullable(providerName), hashCodeNullable(threeLetterISOLanguageName));
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
    sb.append("class RemoteSubtitleInfo {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    communityRating: ").append(toIndentedString(communityRating)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    downloadCount: ").append(toIndentedString(downloadCount)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isHashMatch: ").append(toIndentedString(isHashMatch)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    threeLetterISOLanguageName: ").append(toIndentedString(threeLetterISOLanguageName)).append("\n");
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

