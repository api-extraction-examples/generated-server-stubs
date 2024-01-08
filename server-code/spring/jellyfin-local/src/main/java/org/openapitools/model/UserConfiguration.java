package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SubtitlePlaybackMode;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class UserConfiguration.
 */

@Schema(name = "UserConfiguration", description = "Class UserConfiguration.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class UserConfiguration {

  private JsonNullable<String> audioLanguagePreference = JsonNullable.<String>undefined();

  private Boolean displayCollectionsView;

  private Boolean displayMissingEpisodes;

  private Boolean enableLocalPassword;

  private Boolean enableNextEpisodeAutoPlay;

  @Valid
  private JsonNullable<List<String>> groupedFolders = JsonNullable.<List<String>>undefined();

  private Boolean hidePlayedInLatest;

  @Valid
  private JsonNullable<List<String>> latestItemsExcludes = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> myMediaExcludes = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> orderedViews = JsonNullable.<List<String>>undefined();

  private Boolean playDefaultAudioTrack;

  private Boolean rememberAudioSelections;

  private Boolean rememberSubtitleSelections;

  private JsonNullable<String> subtitleLanguagePreference = JsonNullable.<String>undefined();

  private SubtitlePlaybackMode subtitleMode;

  public UserConfiguration audioLanguagePreference(String audioLanguagePreference) {
    this.audioLanguagePreference = JsonNullable.of(audioLanguagePreference);
    return this;
  }

  /**
   * Gets or sets the audio language preference.
   * @return audioLanguagePreference
  */
  
  @Schema(name = "AudioLanguagePreference", description = "Gets or sets the audio language preference.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AudioLanguagePreference")
  public JsonNullable<String> getAudioLanguagePreference() {
    return audioLanguagePreference;
  }

  public void setAudioLanguagePreference(JsonNullable<String> audioLanguagePreference) {
    this.audioLanguagePreference = audioLanguagePreference;
  }

  public UserConfiguration displayCollectionsView(Boolean displayCollectionsView) {
    this.displayCollectionsView = displayCollectionsView;
    return this;
  }

  /**
   * Get displayCollectionsView
   * @return displayCollectionsView
  */
  
  @Schema(name = "DisplayCollectionsView", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DisplayCollectionsView")
  public Boolean getDisplayCollectionsView() {
    return displayCollectionsView;
  }

  public void setDisplayCollectionsView(Boolean displayCollectionsView) {
    this.displayCollectionsView = displayCollectionsView;
  }

  public UserConfiguration displayMissingEpisodes(Boolean displayMissingEpisodes) {
    this.displayMissingEpisodes = displayMissingEpisodes;
    return this;
  }

  /**
   * Get displayMissingEpisodes
   * @return displayMissingEpisodes
  */
  
  @Schema(name = "DisplayMissingEpisodes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DisplayMissingEpisodes")
  public Boolean getDisplayMissingEpisodes() {
    return displayMissingEpisodes;
  }

  public void setDisplayMissingEpisodes(Boolean displayMissingEpisodes) {
    this.displayMissingEpisodes = displayMissingEpisodes;
  }

  public UserConfiguration enableLocalPassword(Boolean enableLocalPassword) {
    this.enableLocalPassword = enableLocalPassword;
    return this;
  }

  /**
   * Get enableLocalPassword
   * @return enableLocalPassword
  */
  
  @Schema(name = "EnableLocalPassword", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableLocalPassword")
  public Boolean getEnableLocalPassword() {
    return enableLocalPassword;
  }

  public void setEnableLocalPassword(Boolean enableLocalPassword) {
    this.enableLocalPassword = enableLocalPassword;
  }

  public UserConfiguration enableNextEpisodeAutoPlay(Boolean enableNextEpisodeAutoPlay) {
    this.enableNextEpisodeAutoPlay = enableNextEpisodeAutoPlay;
    return this;
  }

  /**
   * Get enableNextEpisodeAutoPlay
   * @return enableNextEpisodeAutoPlay
  */
  
  @Schema(name = "EnableNextEpisodeAutoPlay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableNextEpisodeAutoPlay")
  public Boolean getEnableNextEpisodeAutoPlay() {
    return enableNextEpisodeAutoPlay;
  }

  public void setEnableNextEpisodeAutoPlay(Boolean enableNextEpisodeAutoPlay) {
    this.enableNextEpisodeAutoPlay = enableNextEpisodeAutoPlay;
  }

  public UserConfiguration groupedFolders(List<String> groupedFolders) {
    this.groupedFolders = JsonNullable.of(groupedFolders);
    return this;
  }

  public UserConfiguration addGroupedFoldersItem(String groupedFoldersItem) {
    if (this.groupedFolders == null || !this.groupedFolders.isPresent()) {
      this.groupedFolders = JsonNullable.of(new ArrayList<>());
    }
    this.groupedFolders.get().add(groupedFoldersItem);
    return this;
  }

  /**
   * Get groupedFolders
   * @return groupedFolders
  */
  
  @Schema(name = "GroupedFolders", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GroupedFolders")
  public JsonNullable<List<String>> getGroupedFolders() {
    return groupedFolders;
  }

  public void setGroupedFolders(JsonNullable<List<String>> groupedFolders) {
    this.groupedFolders = groupedFolders;
  }

  public UserConfiguration hidePlayedInLatest(Boolean hidePlayedInLatest) {
    this.hidePlayedInLatest = hidePlayedInLatest;
    return this;
  }

  /**
   * Get hidePlayedInLatest
   * @return hidePlayedInLatest
  */
  
  @Schema(name = "HidePlayedInLatest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HidePlayedInLatest")
  public Boolean getHidePlayedInLatest() {
    return hidePlayedInLatest;
  }

  public void setHidePlayedInLatest(Boolean hidePlayedInLatest) {
    this.hidePlayedInLatest = hidePlayedInLatest;
  }

  public UserConfiguration latestItemsExcludes(List<String> latestItemsExcludes) {
    this.latestItemsExcludes = JsonNullable.of(latestItemsExcludes);
    return this;
  }

  public UserConfiguration addLatestItemsExcludesItem(String latestItemsExcludesItem) {
    if (this.latestItemsExcludes == null || !this.latestItemsExcludes.isPresent()) {
      this.latestItemsExcludes = JsonNullable.of(new ArrayList<>());
    }
    this.latestItemsExcludes.get().add(latestItemsExcludesItem);
    return this;
  }

  /**
   * Get latestItemsExcludes
   * @return latestItemsExcludes
  */
  
  @Schema(name = "LatestItemsExcludes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LatestItemsExcludes")
  public JsonNullable<List<String>> getLatestItemsExcludes() {
    return latestItemsExcludes;
  }

  public void setLatestItemsExcludes(JsonNullable<List<String>> latestItemsExcludes) {
    this.latestItemsExcludes = latestItemsExcludes;
  }

  public UserConfiguration myMediaExcludes(List<String> myMediaExcludes) {
    this.myMediaExcludes = JsonNullable.of(myMediaExcludes);
    return this;
  }

  public UserConfiguration addMyMediaExcludesItem(String myMediaExcludesItem) {
    if (this.myMediaExcludes == null || !this.myMediaExcludes.isPresent()) {
      this.myMediaExcludes = JsonNullable.of(new ArrayList<>());
    }
    this.myMediaExcludes.get().add(myMediaExcludesItem);
    return this;
  }

  /**
   * Get myMediaExcludes
   * @return myMediaExcludes
  */
  
  @Schema(name = "MyMediaExcludes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MyMediaExcludes")
  public JsonNullable<List<String>> getMyMediaExcludes() {
    return myMediaExcludes;
  }

  public void setMyMediaExcludes(JsonNullable<List<String>> myMediaExcludes) {
    this.myMediaExcludes = myMediaExcludes;
  }

  public UserConfiguration orderedViews(List<String> orderedViews) {
    this.orderedViews = JsonNullable.of(orderedViews);
    return this;
  }

  public UserConfiguration addOrderedViewsItem(String orderedViewsItem) {
    if (this.orderedViews == null || !this.orderedViews.isPresent()) {
      this.orderedViews = JsonNullable.of(new ArrayList<>());
    }
    this.orderedViews.get().add(orderedViewsItem);
    return this;
  }

  /**
   * Get orderedViews
   * @return orderedViews
  */
  
  @Schema(name = "OrderedViews", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OrderedViews")
  public JsonNullable<List<String>> getOrderedViews() {
    return orderedViews;
  }

  public void setOrderedViews(JsonNullable<List<String>> orderedViews) {
    this.orderedViews = orderedViews;
  }

  public UserConfiguration playDefaultAudioTrack(Boolean playDefaultAudioTrack) {
    this.playDefaultAudioTrack = playDefaultAudioTrack;
    return this;
  }

  /**
   * Gets or sets a value indicating whether [play default audio track].
   * @return playDefaultAudioTrack
  */
  
  @Schema(name = "PlayDefaultAudioTrack", description = "Gets or sets a value indicating whether [play default audio track].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlayDefaultAudioTrack")
  public Boolean getPlayDefaultAudioTrack() {
    return playDefaultAudioTrack;
  }

  public void setPlayDefaultAudioTrack(Boolean playDefaultAudioTrack) {
    this.playDefaultAudioTrack = playDefaultAudioTrack;
  }

  public UserConfiguration rememberAudioSelections(Boolean rememberAudioSelections) {
    this.rememberAudioSelections = rememberAudioSelections;
    return this;
  }

  /**
   * Get rememberAudioSelections
   * @return rememberAudioSelections
  */
  
  @Schema(name = "RememberAudioSelections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RememberAudioSelections")
  public Boolean getRememberAudioSelections() {
    return rememberAudioSelections;
  }

  public void setRememberAudioSelections(Boolean rememberAudioSelections) {
    this.rememberAudioSelections = rememberAudioSelections;
  }

  public UserConfiguration rememberSubtitleSelections(Boolean rememberSubtitleSelections) {
    this.rememberSubtitleSelections = rememberSubtitleSelections;
    return this;
  }

  /**
   * Get rememberSubtitleSelections
   * @return rememberSubtitleSelections
  */
  
  @Schema(name = "RememberSubtitleSelections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RememberSubtitleSelections")
  public Boolean getRememberSubtitleSelections() {
    return rememberSubtitleSelections;
  }

  public void setRememberSubtitleSelections(Boolean rememberSubtitleSelections) {
    this.rememberSubtitleSelections = rememberSubtitleSelections;
  }

  public UserConfiguration subtitleLanguagePreference(String subtitleLanguagePreference) {
    this.subtitleLanguagePreference = JsonNullable.of(subtitleLanguagePreference);
    return this;
  }

  /**
   * Gets or sets the subtitle language preference.
   * @return subtitleLanguagePreference
  */
  
  @Schema(name = "SubtitleLanguagePreference", description = "Gets or sets the subtitle language preference.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SubtitleLanguagePreference")
  public JsonNullable<String> getSubtitleLanguagePreference() {
    return subtitleLanguagePreference;
  }

  public void setSubtitleLanguagePreference(JsonNullable<String> subtitleLanguagePreference) {
    this.subtitleLanguagePreference = subtitleLanguagePreference;
  }

  public UserConfiguration subtitleMode(SubtitlePlaybackMode subtitleMode) {
    this.subtitleMode = subtitleMode;
    return this;
  }

  /**
   * Get subtitleMode
   * @return subtitleMode
  */
  @Valid 
  @Schema(name = "SubtitleMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SubtitleMode")
  public SubtitlePlaybackMode getSubtitleMode() {
    return subtitleMode;
  }

  public void setSubtitleMode(SubtitlePlaybackMode subtitleMode) {
    this.subtitleMode = subtitleMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserConfiguration userConfiguration = (UserConfiguration) o;
    return equalsNullable(this.audioLanguagePreference, userConfiguration.audioLanguagePreference) &&
        Objects.equals(this.displayCollectionsView, userConfiguration.displayCollectionsView) &&
        Objects.equals(this.displayMissingEpisodes, userConfiguration.displayMissingEpisodes) &&
        Objects.equals(this.enableLocalPassword, userConfiguration.enableLocalPassword) &&
        Objects.equals(this.enableNextEpisodeAutoPlay, userConfiguration.enableNextEpisodeAutoPlay) &&
        equalsNullable(this.groupedFolders, userConfiguration.groupedFolders) &&
        Objects.equals(this.hidePlayedInLatest, userConfiguration.hidePlayedInLatest) &&
        equalsNullable(this.latestItemsExcludes, userConfiguration.latestItemsExcludes) &&
        equalsNullable(this.myMediaExcludes, userConfiguration.myMediaExcludes) &&
        equalsNullable(this.orderedViews, userConfiguration.orderedViews) &&
        Objects.equals(this.playDefaultAudioTrack, userConfiguration.playDefaultAudioTrack) &&
        Objects.equals(this.rememberAudioSelections, userConfiguration.rememberAudioSelections) &&
        Objects.equals(this.rememberSubtitleSelections, userConfiguration.rememberSubtitleSelections) &&
        equalsNullable(this.subtitleLanguagePreference, userConfiguration.subtitleLanguagePreference) &&
        Objects.equals(this.subtitleMode, userConfiguration.subtitleMode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(audioLanguagePreference), displayCollectionsView, displayMissingEpisodes, enableLocalPassword, enableNextEpisodeAutoPlay, hashCodeNullable(groupedFolders), hidePlayedInLatest, hashCodeNullable(latestItemsExcludes), hashCodeNullable(myMediaExcludes), hashCodeNullable(orderedViews), playDefaultAudioTrack, rememberAudioSelections, rememberSubtitleSelections, hashCodeNullable(subtitleLanguagePreference), subtitleMode);
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
    sb.append("class UserConfiguration {\n");
    sb.append("    audioLanguagePreference: ").append(toIndentedString(audioLanguagePreference)).append("\n");
    sb.append("    displayCollectionsView: ").append(toIndentedString(displayCollectionsView)).append("\n");
    sb.append("    displayMissingEpisodes: ").append(toIndentedString(displayMissingEpisodes)).append("\n");
    sb.append("    enableLocalPassword: ").append(toIndentedString(enableLocalPassword)).append("\n");
    sb.append("    enableNextEpisodeAutoPlay: ").append(toIndentedString(enableNextEpisodeAutoPlay)).append("\n");
    sb.append("    groupedFolders: ").append(toIndentedString(groupedFolders)).append("\n");
    sb.append("    hidePlayedInLatest: ").append(toIndentedString(hidePlayedInLatest)).append("\n");
    sb.append("    latestItemsExcludes: ").append(toIndentedString(latestItemsExcludes)).append("\n");
    sb.append("    myMediaExcludes: ").append(toIndentedString(myMediaExcludes)).append("\n");
    sb.append("    orderedViews: ").append(toIndentedString(orderedViews)).append("\n");
    sb.append("    playDefaultAudioTrack: ").append(toIndentedString(playDefaultAudioTrack)).append("\n");
    sb.append("    rememberAudioSelections: ").append(toIndentedString(rememberAudioSelections)).append("\n");
    sb.append("    rememberSubtitleSelections: ").append(toIndentedString(rememberSubtitleSelections)).append("\n");
    sb.append("    subtitleLanguagePreference: ").append(toIndentedString(subtitleLanguagePreference)).append("\n");
    sb.append("    subtitleMode: ").append(toIndentedString(subtitleMode)).append("\n");
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

