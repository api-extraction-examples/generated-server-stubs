package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MusicRecordAudio;
import org.openapitools.model.MusicTrackArtist;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MusicPopularityTrack
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class MusicPopularityTrack {

  private String album;

  private String artistGid;

  private String artistName;

  @Valid
  private List<@Valid MusicTrackArtist> artists;

  private String baseTitle;

  private Boolean classical;

  private String id;

  @Valid
  private List<String> mergedIds;

  private MusicRecordAudio preferredMultiplayRecordAudio;

  private MusicRecordAudio preferredRecordAudio;

  private Boolean radioEdit;

  @Valid
  private List<@Valid MusicRecordAudio> recordAudio;

  private String recordImageHref;

  private String recordImagePid;

  private Integer score;

  private String title;

  private String type;

  public MusicPopularityTrack() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MusicPopularityTrack(String id, Integer score) {
    this.id = id;
    this.score = score;
  }

  public MusicPopularityTrack album(String album) {
    this.album = album;
    return this;
  }

  /**
   * Get album
   * @return album
  */
  
  @Schema(name = "album", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("album")
  public String getAlbum() {
    return album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  public MusicPopularityTrack artistGid(String artistGid) {
    this.artistGid = artistGid;
    return this;
  }

  /**
   * Get artistGid
   * @return artistGid
  */
  
  @Schema(name = "artistGid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("artistGid")
  public String getArtistGid() {
    return artistGid;
  }

  public void setArtistGid(String artistGid) {
    this.artistGid = artistGid;
  }

  public MusicPopularityTrack artistName(String artistName) {
    this.artistName = artistName;
    return this;
  }

  /**
   * Get artistName
   * @return artistName
  */
  
  @Schema(name = "artistName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("artistName")
  public String getArtistName() {
    return artistName;
  }

  public void setArtistName(String artistName) {
    this.artistName = artistName;
  }

  public MusicPopularityTrack artists(List<@Valid MusicTrackArtist> artists) {
    this.artists = artists;
    return this;
  }

  public MusicPopularityTrack addArtistsItem(MusicTrackArtist artistsItem) {
    if (this.artists == null) {
      this.artists = new ArrayList<>();
    }
    this.artists.add(artistsItem);
    return this;
  }

  /**
   * Get artists
   * @return artists
  */
  @Valid 
  @Schema(name = "artists", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("artists")
  public List<@Valid MusicTrackArtist> getArtists() {
    return artists;
  }

  public void setArtists(List<@Valid MusicTrackArtist> artists) {
    this.artists = artists;
  }

  public MusicPopularityTrack baseTitle(String baseTitle) {
    this.baseTitle = baseTitle;
    return this;
  }

  /**
   * Get baseTitle
   * @return baseTitle
  */
  
  @Schema(name = "baseTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("baseTitle")
  public String getBaseTitle() {
    return baseTitle;
  }

  public void setBaseTitle(String baseTitle) {
    this.baseTitle = baseTitle;
  }

  public MusicPopularityTrack classical(Boolean classical) {
    this.classical = classical;
    return this;
  }

  /**
   * Get classical
   * @return classical
  */
  
  @Schema(name = "classical", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("classical")
  public Boolean getClassical() {
    return classical;
  }

  public void setClassical(Boolean classical) {
    this.classical = classical;
  }

  public MusicPopularityTrack id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MusicPopularityTrack mergedIds(List<String> mergedIds) {
    this.mergedIds = mergedIds;
    return this;
  }

  public MusicPopularityTrack addMergedIdsItem(String mergedIdsItem) {
    if (this.mergedIds == null) {
      this.mergedIds = new ArrayList<>();
    }
    this.mergedIds.add(mergedIdsItem);
    return this;
  }

  /**
   * Get mergedIds
   * @return mergedIds
  */
  
  @Schema(name = "mergedIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mergedIds")
  public List<String> getMergedIds() {
    return mergedIds;
  }

  public void setMergedIds(List<String> mergedIds) {
    this.mergedIds = mergedIds;
  }

  public MusicPopularityTrack preferredMultiplayRecordAudio(MusicRecordAudio preferredMultiplayRecordAudio) {
    this.preferredMultiplayRecordAudio = preferredMultiplayRecordAudio;
    return this;
  }

  /**
   * Get preferredMultiplayRecordAudio
   * @return preferredMultiplayRecordAudio
  */
  @Valid 
  @Schema(name = "preferredMultiplayRecordAudio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredMultiplayRecordAudio")
  public MusicRecordAudio getPreferredMultiplayRecordAudio() {
    return preferredMultiplayRecordAudio;
  }

  public void setPreferredMultiplayRecordAudio(MusicRecordAudio preferredMultiplayRecordAudio) {
    this.preferredMultiplayRecordAudio = preferredMultiplayRecordAudio;
  }

  public MusicPopularityTrack preferredRecordAudio(MusicRecordAudio preferredRecordAudio) {
    this.preferredRecordAudio = preferredRecordAudio;
    return this;
  }

  /**
   * Get preferredRecordAudio
   * @return preferredRecordAudio
  */
  @Valid 
  @Schema(name = "preferredRecordAudio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredRecordAudio")
  public MusicRecordAudio getPreferredRecordAudio() {
    return preferredRecordAudio;
  }

  public void setPreferredRecordAudio(MusicRecordAudio preferredRecordAudio) {
    this.preferredRecordAudio = preferredRecordAudio;
  }

  public MusicPopularityTrack radioEdit(Boolean radioEdit) {
    this.radioEdit = radioEdit;
    return this;
  }

  /**
   * Get radioEdit
   * @return radioEdit
  */
  
  @Schema(name = "radioEdit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("radioEdit")
  public Boolean getRadioEdit() {
    return radioEdit;
  }

  public void setRadioEdit(Boolean radioEdit) {
    this.radioEdit = radioEdit;
  }

  public MusicPopularityTrack recordAudio(List<@Valid MusicRecordAudio> recordAudio) {
    this.recordAudio = recordAudio;
    return this;
  }

  public MusicPopularityTrack addRecordAudioItem(MusicRecordAudio recordAudioItem) {
    if (this.recordAudio == null) {
      this.recordAudio = new ArrayList<>();
    }
    this.recordAudio.add(recordAudioItem);
    return this;
  }

  /**
   * Get recordAudio
   * @return recordAudio
  */
  @Valid 
  @Schema(name = "recordAudio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recordAudio")
  public List<@Valid MusicRecordAudio> getRecordAudio() {
    return recordAudio;
  }

  public void setRecordAudio(List<@Valid MusicRecordAudio> recordAudio) {
    this.recordAudio = recordAudio;
  }

  public MusicPopularityTrack recordImageHref(String recordImageHref) {
    this.recordImageHref = recordImageHref;
    return this;
  }

  /**
   * Get recordImageHref
   * @return recordImageHref
  */
  
  @Schema(name = "recordImageHref", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recordImageHref")
  public String getRecordImageHref() {
    return recordImageHref;
  }

  public void setRecordImageHref(String recordImageHref) {
    this.recordImageHref = recordImageHref;
  }

  public MusicPopularityTrack recordImagePid(String recordImagePid) {
    this.recordImagePid = recordImagePid;
    return this;
  }

  /**
   * Get recordImagePid
   * @return recordImagePid
  */
  
  @Schema(name = "recordImagePid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recordImagePid")
  public String getRecordImagePid() {
    return recordImagePid;
  }

  public void setRecordImagePid(String recordImagePid) {
    this.recordImagePid = recordImagePid;
  }

  public MusicPopularityTrack score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
  */
  @NotNull 
  @Schema(name = "score", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("score")
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public MusicPopularityTrack title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MusicPopularityTrack type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MusicPopularityTrack musicPopularityTrack = (MusicPopularityTrack) o;
    return Objects.equals(this.album, musicPopularityTrack.album) &&
        Objects.equals(this.artistGid, musicPopularityTrack.artistGid) &&
        Objects.equals(this.artistName, musicPopularityTrack.artistName) &&
        Objects.equals(this.artists, musicPopularityTrack.artists) &&
        Objects.equals(this.baseTitle, musicPopularityTrack.baseTitle) &&
        Objects.equals(this.classical, musicPopularityTrack.classical) &&
        Objects.equals(this.id, musicPopularityTrack.id) &&
        Objects.equals(this.mergedIds, musicPopularityTrack.mergedIds) &&
        Objects.equals(this.preferredMultiplayRecordAudio, musicPopularityTrack.preferredMultiplayRecordAudio) &&
        Objects.equals(this.preferredRecordAudio, musicPopularityTrack.preferredRecordAudio) &&
        Objects.equals(this.radioEdit, musicPopularityTrack.radioEdit) &&
        Objects.equals(this.recordAudio, musicPopularityTrack.recordAudio) &&
        Objects.equals(this.recordImageHref, musicPopularityTrack.recordImageHref) &&
        Objects.equals(this.recordImagePid, musicPopularityTrack.recordImagePid) &&
        Objects.equals(this.score, musicPopularityTrack.score) &&
        Objects.equals(this.title, musicPopularityTrack.title) &&
        Objects.equals(this.type, musicPopularityTrack.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(album, artistGid, artistName, artists, baseTitle, classical, id, mergedIds, preferredMultiplayRecordAudio, preferredRecordAudio, radioEdit, recordAudio, recordImageHref, recordImagePid, score, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MusicPopularityTrack {\n");
    sb.append("    album: ").append(toIndentedString(album)).append("\n");
    sb.append("    artistGid: ").append(toIndentedString(artistGid)).append("\n");
    sb.append("    artistName: ").append(toIndentedString(artistName)).append("\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
    sb.append("    baseTitle: ").append(toIndentedString(baseTitle)).append("\n");
    sb.append("    classical: ").append(toIndentedString(classical)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mergedIds: ").append(toIndentedString(mergedIds)).append("\n");
    sb.append("    preferredMultiplayRecordAudio: ").append(toIndentedString(preferredMultiplayRecordAudio)).append("\n");
    sb.append("    preferredRecordAudio: ").append(toIndentedString(preferredRecordAudio)).append("\n");
    sb.append("    radioEdit: ").append(toIndentedString(radioEdit)).append("\n");
    sb.append("    recordAudio: ").append(toIndentedString(recordAudio)).append("\n");
    sb.append("    recordImageHref: ").append(toIndentedString(recordImageHref)).append("\n");
    sb.append("    recordImagePid: ").append(toIndentedString(recordImagePid)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

