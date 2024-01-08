package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseItemDtoImageBlurHashes;
import org.openapitools.model.BaseItemPerson;
import org.openapitools.model.ChannelType;
import org.openapitools.model.ChapterInfo;
import org.openapitools.model.DayOfWeek;
import org.openapitools.model.ExternalUrl;
import org.openapitools.model.ImageOrientation;
import org.openapitools.model.IsoType;
import org.openapitools.model.LocationType;
import org.openapitools.model.MediaSourceInfo;
import org.openapitools.model.MediaStream;
import org.openapitools.model.MediaUrl;
import org.openapitools.model.MetadataField;
import org.openapitools.model.NameGuidPair;
import org.openapitools.model.PlayAccess;
import org.openapitools.model.ProgramAudio;
import org.openapitools.model.UserItemDataDto;
import org.openapitools.model.Video3DFormat;
import org.openapitools.model.VideoType;
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
 * This is strictly used as a data transfer object from the api layer.  This holds information about a BaseItem in a format that is convenient for the client.
 */

@Schema(name = "BaseItemDto", description = "This is strictly used as a data transfer object from the api layer.  This holds information about a BaseItem in a format that is convenient for the client.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class BaseItemDto {

  @Valid
  private JsonNullable<List<@Valid DayOfWeek>> airDays = JsonNullable.<List<@Valid DayOfWeek>>undefined();

  private JsonNullable<String> airTime = JsonNullable.<String>undefined();

  private JsonNullable<Integer> airsAfterSeasonNumber = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> airsBeforeEpisodeNumber = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> airsBeforeSeasonNumber = JsonNullable.<Integer>undefined();

  private JsonNullable<String> album = JsonNullable.<String>undefined();

  private JsonNullable<String> albumArtist = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid NameGuidPair>> albumArtists = JsonNullable.<List<@Valid NameGuidPair>>undefined();

  private JsonNullable<Integer> albumCount = JsonNullable.<Integer>undefined();

  private JsonNullable<UUID> albumId = JsonNullable.<UUID>undefined();

  private JsonNullable<String> albumPrimaryImageTag = JsonNullable.<String>undefined();

  private JsonNullable<Double> altitude = JsonNullable.<Double>undefined();

  private JsonNullable<Double> aperture = JsonNullable.<Double>undefined();

  private JsonNullable<Integer> artistCount = JsonNullable.<Integer>undefined();

  @Valid
  private JsonNullable<List<@Valid NameGuidPair>> artistItems = JsonNullable.<List<@Valid NameGuidPair>>undefined();

  @Valid
  private JsonNullable<List<String>> artists = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> aspectRatio = JsonNullable.<String>undefined();

  private ProgramAudio audio;

  @Valid
  private JsonNullable<List<String>> backdropImageTags = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> cameraMake = JsonNullable.<String>undefined();

  private JsonNullable<String> cameraModel = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> canDelete = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> canDownload = JsonNullable.<Boolean>undefined();

  private JsonNullable<UUID> channelId = JsonNullable.<UUID>undefined();

  private JsonNullable<String> channelName = JsonNullable.<String>undefined();

  private JsonNullable<String> channelNumber = JsonNullable.<String>undefined();

  private JsonNullable<String> channelPrimaryImageTag = JsonNullable.<String>undefined();

  private ChannelType channelType;

  @Valid
  private JsonNullable<List<@Valid ChapterInfo>> chapters = JsonNullable.<List<@Valid ChapterInfo>>undefined();

  private JsonNullable<Integer> childCount = JsonNullable.<Integer>undefined();

  private JsonNullable<String> collectionType = JsonNullable.<String>undefined();

  private JsonNullable<Float> communityRating = JsonNullable.<Float>undefined();

  private JsonNullable<Double> completionPercentage = JsonNullable.<Double>undefined();

  private JsonNullable<String> container = JsonNullable.<String>undefined();

  private JsonNullable<Float> criticRating = JsonNullable.<Float>undefined();

  private JsonNullable<Long> cumulativeRunTimeTicks = JsonNullable.<Long>undefined();

  private BaseItemDto currentProgram;

  private JsonNullable<String> customRating = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dateCreated = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dateLastMediaAdded = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> displayOrder = JsonNullable.<String>undefined();

  private JsonNullable<String> displayPreferencesId = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> enableMediaSourceDisplay = JsonNullable.<Boolean>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> endDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Integer> episodeCount = JsonNullable.<Integer>undefined();

  private JsonNullable<String> episodeTitle = JsonNullable.<String>undefined();

  private JsonNullable<String> etag = JsonNullable.<String>undefined();

  private JsonNullable<Double> exposureTime = JsonNullable.<Double>undefined();

  @Valid
  private JsonNullable<List<@Valid ExternalUrl>> externalUrls = JsonNullable.<List<@Valid ExternalUrl>>undefined();

  private JsonNullable<String> extraType = JsonNullable.<String>undefined();

  private JsonNullable<Double> focalLength = JsonNullable.<Double>undefined();

  private JsonNullable<String> forcedSortName = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid NameGuidPair>> genreItems = JsonNullable.<List<@Valid NameGuidPair>>undefined();

  @Valid
  private JsonNullable<List<String>> genres = JsonNullable.<List<String>>undefined();

  private JsonNullable<Boolean> hasSubtitles = JsonNullable.<Boolean>undefined();

  private JsonNullable<Integer> height = JsonNullable.<Integer>undefined();

  private UUID id;

  private JsonNullable<BaseItemDtoImageBlurHashes> imageBlurHashes = JsonNullable.<BaseItemDtoImageBlurHashes>undefined();

  private ImageOrientation imageOrientation;

  @Valid
  private JsonNullable<Map<String, String>> imageTags = JsonNullable.<Map<String, String>>undefined();

  private JsonNullable<Integer> indexNumber = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> indexNumberEnd = JsonNullable.<Integer>undefined();

  private JsonNullable<Boolean> isFolder = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isHD = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isKids = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isLive = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isMovie = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isNews = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isPlaceHolder = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isPremiere = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isRepeat = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isSeries = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isSports = JsonNullable.<Boolean>undefined();

  private JsonNullable<Integer> isoSpeedRating = JsonNullable.<Integer>undefined();

  private IsoType isoType;

  private JsonNullable<Double> latitude = JsonNullable.<Double>undefined();

  private JsonNullable<Integer> localTrailerCount = JsonNullable.<Integer>undefined();

  private LocationType locationType;

  private JsonNullable<Boolean> lockData = JsonNullable.<Boolean>undefined();

  @Valid
  private JsonNullable<List<@Valid MetadataField>> lockedFields = JsonNullable.<List<@Valid MetadataField>>undefined();

  private JsonNullable<Double> longitude = JsonNullable.<Double>undefined();

  private JsonNullable<Integer> mediaSourceCount = JsonNullable.<Integer>undefined();

  @Valid
  private JsonNullable<List<@Valid MediaSourceInfo>> mediaSources = JsonNullable.<List<@Valid MediaSourceInfo>>undefined();

  @Valid
  private JsonNullable<List<@Valid MediaStream>> mediaStreams = JsonNullable.<List<@Valid MediaStream>>undefined();

  private JsonNullable<String> mediaType = JsonNullable.<String>undefined();

  private JsonNullable<Integer> movieCount = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> musicVideoCount = JsonNullable.<Integer>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> number = JsonNullable.<String>undefined();

  private JsonNullable<String> officialRating = JsonNullable.<String>undefined();

  private JsonNullable<String> originalTitle = JsonNullable.<String>undefined();

  private JsonNullable<String> overview = JsonNullable.<String>undefined();

  private JsonNullable<String> parentArtImageTag = JsonNullable.<String>undefined();

  private JsonNullable<String> parentArtItemId = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> parentBackdropImageTags = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> parentBackdropItemId = JsonNullable.<String>undefined();

  private JsonNullable<UUID> parentId = JsonNullable.<UUID>undefined();

  private JsonNullable<Integer> parentIndexNumber = JsonNullable.<Integer>undefined();

  private JsonNullable<String> parentLogoImageTag = JsonNullable.<String>undefined();

  private JsonNullable<String> parentLogoItemId = JsonNullable.<String>undefined();

  private JsonNullable<String> parentPrimaryImageItemId = JsonNullable.<String>undefined();

  private JsonNullable<String> parentPrimaryImageTag = JsonNullable.<String>undefined();

  private JsonNullable<String> parentThumbImageTag = JsonNullable.<String>undefined();

  private JsonNullable<String> parentThumbItemId = JsonNullable.<String>undefined();

  private JsonNullable<Integer> partCount = JsonNullable.<Integer>undefined();

  private JsonNullable<String> path = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid BaseItemPerson>> people = JsonNullable.<List<@Valid BaseItemPerson>>undefined();

  private PlayAccess playAccess;

  private JsonNullable<String> playlistItemId = JsonNullable.<String>undefined();

  private JsonNullable<String> preferredMetadataCountryCode = JsonNullable.<String>undefined();

  private JsonNullable<String> preferredMetadataLanguage = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> premiereDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Double> primaryImageAspectRatio = JsonNullable.<Double>undefined();

  @Valid
  private JsonNullable<List<String>> productionLocations = JsonNullable.<List<String>>undefined();

  private JsonNullable<Integer> productionYear = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> programCount = JsonNullable.<Integer>undefined();

  private JsonNullable<String> programId = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<Map<String, String>> providerIds = JsonNullable.<Map<String, String>>undefined();

  private JsonNullable<Integer> recursiveItemCount = JsonNullable.<Integer>undefined();

  @Valid
  private JsonNullable<List<@Valid MediaUrl>> remoteTrailers = JsonNullable.<List<@Valid MediaUrl>>undefined();

  private JsonNullable<Long> runTimeTicks = JsonNullable.<Long>undefined();

  @Valid
  private JsonNullable<List<String>> screenshotImageTags = JsonNullable.<List<String>>undefined();

  private JsonNullable<UUID> seasonId = JsonNullable.<UUID>undefined();

  private JsonNullable<String> seasonName = JsonNullable.<String>undefined();

  private JsonNullable<Integer> seriesCount = JsonNullable.<Integer>undefined();

  private JsonNullable<UUID> seriesId = JsonNullable.<UUID>undefined();

  private JsonNullable<String> seriesName = JsonNullable.<String>undefined();

  private JsonNullable<String> seriesPrimaryImageTag = JsonNullable.<String>undefined();

  private JsonNullable<String> seriesStudio = JsonNullable.<String>undefined();

  private JsonNullable<String> seriesThumbImageTag = JsonNullable.<String>undefined();

  private JsonNullable<String> seriesTimerId = JsonNullable.<String>undefined();

  private JsonNullable<String> serverId = JsonNullable.<String>undefined();

  private JsonNullable<Double> shutterSpeed = JsonNullable.<Double>undefined();

  private JsonNullable<String> software = JsonNullable.<String>undefined();

  private JsonNullable<Integer> songCount = JsonNullable.<Integer>undefined();

  private JsonNullable<String> sortName = JsonNullable.<String>undefined();

  private JsonNullable<String> sourceType = JsonNullable.<String>undefined();

  private JsonNullable<Integer> specialFeatureCount = JsonNullable.<Integer>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> startDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> status = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid NameGuidPair>> studios = JsonNullable.<List<@Valid NameGuidPair>>undefined();

  private JsonNullable<Boolean> supportsSync = JsonNullable.<Boolean>undefined();

  @Valid
  private JsonNullable<List<String>> taglines = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> timerId = JsonNullable.<String>undefined();

  private JsonNullable<Integer> trailerCount = JsonNullable.<Integer>undefined();

  private JsonNullable<String> type = JsonNullable.<String>undefined();

  private UserItemDataDto userData;

  private Video3DFormat video3DFormat;

  private VideoType videoType;

  private JsonNullable<Integer> width = JsonNullable.<Integer>undefined();

  public BaseItemDto airDays(List<@Valid DayOfWeek> airDays) {
    this.airDays = JsonNullable.of(airDays);
    return this;
  }

  public BaseItemDto addAirDaysItem(DayOfWeek airDaysItem) {
    if (this.airDays == null || !this.airDays.isPresent()) {
      this.airDays = JsonNullable.of(new ArrayList<>());
    }
    this.airDays.get().add(airDaysItem);
    return this;
  }

  /**
   * Gets or sets the air days.
   * @return airDays
  */
  @Valid 
  @Schema(name = "AirDays", description = "Gets or sets the air days.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AirDays")
  public JsonNullable<List<@Valid DayOfWeek>> getAirDays() {
    return airDays;
  }

  public void setAirDays(JsonNullable<List<@Valid DayOfWeek>> airDays) {
    this.airDays = airDays;
  }

  public BaseItemDto airTime(String airTime) {
    this.airTime = JsonNullable.of(airTime);
    return this;
  }

  /**
   * Gets or sets the air time.
   * @return airTime
  */
  
  @Schema(name = "AirTime", description = "Gets or sets the air time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AirTime")
  public JsonNullable<String> getAirTime() {
    return airTime;
  }

  public void setAirTime(JsonNullable<String> airTime) {
    this.airTime = airTime;
  }

  public BaseItemDto airsAfterSeasonNumber(Integer airsAfterSeasonNumber) {
    this.airsAfterSeasonNumber = JsonNullable.of(airsAfterSeasonNumber);
    return this;
  }

  /**
   * Get airsAfterSeasonNumber
   * @return airsAfterSeasonNumber
  */
  
  @Schema(name = "AirsAfterSeasonNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AirsAfterSeasonNumber")
  public JsonNullable<Integer> getAirsAfterSeasonNumber() {
    return airsAfterSeasonNumber;
  }

  public void setAirsAfterSeasonNumber(JsonNullable<Integer> airsAfterSeasonNumber) {
    this.airsAfterSeasonNumber = airsAfterSeasonNumber;
  }

  public BaseItemDto airsBeforeEpisodeNumber(Integer airsBeforeEpisodeNumber) {
    this.airsBeforeEpisodeNumber = JsonNullable.of(airsBeforeEpisodeNumber);
    return this;
  }

  /**
   * Get airsBeforeEpisodeNumber
   * @return airsBeforeEpisodeNumber
  */
  
  @Schema(name = "AirsBeforeEpisodeNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AirsBeforeEpisodeNumber")
  public JsonNullable<Integer> getAirsBeforeEpisodeNumber() {
    return airsBeforeEpisodeNumber;
  }

  public void setAirsBeforeEpisodeNumber(JsonNullable<Integer> airsBeforeEpisodeNumber) {
    this.airsBeforeEpisodeNumber = airsBeforeEpisodeNumber;
  }

  public BaseItemDto airsBeforeSeasonNumber(Integer airsBeforeSeasonNumber) {
    this.airsBeforeSeasonNumber = JsonNullable.of(airsBeforeSeasonNumber);
    return this;
  }

  /**
   * Get airsBeforeSeasonNumber
   * @return airsBeforeSeasonNumber
  */
  
  @Schema(name = "AirsBeforeSeasonNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AirsBeforeSeasonNumber")
  public JsonNullable<Integer> getAirsBeforeSeasonNumber() {
    return airsBeforeSeasonNumber;
  }

  public void setAirsBeforeSeasonNumber(JsonNullable<Integer> airsBeforeSeasonNumber) {
    this.airsBeforeSeasonNumber = airsBeforeSeasonNumber;
  }

  public BaseItemDto album(String album) {
    this.album = JsonNullable.of(album);
    return this;
  }

  /**
   * Gets or sets the album.
   * @return album
  */
  
  @Schema(name = "Album", description = "Gets or sets the album.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Album")
  public JsonNullable<String> getAlbum() {
    return album;
  }

  public void setAlbum(JsonNullable<String> album) {
    this.album = album;
  }

  public BaseItemDto albumArtist(String albumArtist) {
    this.albumArtist = JsonNullable.of(albumArtist);
    return this;
  }

  /**
   * Gets or sets the album artist.
   * @return albumArtist
  */
  
  @Schema(name = "AlbumArtist", description = "Gets or sets the album artist.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AlbumArtist")
  public JsonNullable<String> getAlbumArtist() {
    return albumArtist;
  }

  public void setAlbumArtist(JsonNullable<String> albumArtist) {
    this.albumArtist = albumArtist;
  }

  public BaseItemDto albumArtists(List<@Valid NameGuidPair> albumArtists) {
    this.albumArtists = JsonNullable.of(albumArtists);
    return this;
  }

  public BaseItemDto addAlbumArtistsItem(NameGuidPair albumArtistsItem) {
    if (this.albumArtists == null || !this.albumArtists.isPresent()) {
      this.albumArtists = JsonNullable.of(new ArrayList<>());
    }
    this.albumArtists.get().add(albumArtistsItem);
    return this;
  }

  /**
   * Gets or sets the album artists.
   * @return albumArtists
  */
  @Valid 
  @Schema(name = "AlbumArtists", description = "Gets or sets the album artists.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AlbumArtists")
  public JsonNullable<List<@Valid NameGuidPair>> getAlbumArtists() {
    return albumArtists;
  }

  public void setAlbumArtists(JsonNullable<List<@Valid NameGuidPair>> albumArtists) {
    this.albumArtists = albumArtists;
  }

  public BaseItemDto albumCount(Integer albumCount) {
    this.albumCount = JsonNullable.of(albumCount);
    return this;
  }

  /**
   * Gets or sets the album count.
   * @return albumCount
  */
  
  @Schema(name = "AlbumCount", description = "Gets or sets the album count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AlbumCount")
  public JsonNullable<Integer> getAlbumCount() {
    return albumCount;
  }

  public void setAlbumCount(JsonNullable<Integer> albumCount) {
    this.albumCount = albumCount;
  }

  public BaseItemDto albumId(UUID albumId) {
    this.albumId = JsonNullable.of(albumId);
    return this;
  }

  /**
   * Gets or sets the album id.
   * @return albumId
  */
  @Valid 
  @Schema(name = "AlbumId", description = "Gets or sets the album id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AlbumId")
  public JsonNullable<UUID> getAlbumId() {
    return albumId;
  }

  public void setAlbumId(JsonNullable<UUID> albumId) {
    this.albumId = albumId;
  }

  public BaseItemDto albumPrimaryImageTag(String albumPrimaryImageTag) {
    this.albumPrimaryImageTag = JsonNullable.of(albumPrimaryImageTag);
    return this;
  }

  /**
   * Gets or sets the album image tag.
   * @return albumPrimaryImageTag
  */
  
  @Schema(name = "AlbumPrimaryImageTag", description = "Gets or sets the album image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AlbumPrimaryImageTag")
  public JsonNullable<String> getAlbumPrimaryImageTag() {
    return albumPrimaryImageTag;
  }

  public void setAlbumPrimaryImageTag(JsonNullable<String> albumPrimaryImageTag) {
    this.albumPrimaryImageTag = albumPrimaryImageTag;
  }

  public BaseItemDto altitude(Double altitude) {
    this.altitude = JsonNullable.of(altitude);
    return this;
  }

  /**
   * Get altitude
   * @return altitude
  */
  
  @Schema(name = "Altitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Altitude")
  public JsonNullable<Double> getAltitude() {
    return altitude;
  }

  public void setAltitude(JsonNullable<Double> altitude) {
    this.altitude = altitude;
  }

  public BaseItemDto aperture(Double aperture) {
    this.aperture = JsonNullable.of(aperture);
    return this;
  }

  /**
   * Get aperture
   * @return aperture
  */
  
  @Schema(name = "Aperture", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Aperture")
  public JsonNullable<Double> getAperture() {
    return aperture;
  }

  public void setAperture(JsonNullable<Double> aperture) {
    this.aperture = aperture;
  }

  public BaseItemDto artistCount(Integer artistCount) {
    this.artistCount = JsonNullable.of(artistCount);
    return this;
  }

  /**
   * Get artistCount
   * @return artistCount
  */
  
  @Schema(name = "ArtistCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ArtistCount")
  public JsonNullable<Integer> getArtistCount() {
    return artistCount;
  }

  public void setArtistCount(JsonNullable<Integer> artistCount) {
    this.artistCount = artistCount;
  }

  public BaseItemDto artistItems(List<@Valid NameGuidPair> artistItems) {
    this.artistItems = JsonNullable.of(artistItems);
    return this;
  }

  public BaseItemDto addArtistItemsItem(NameGuidPair artistItemsItem) {
    if (this.artistItems == null || !this.artistItems.isPresent()) {
      this.artistItems = JsonNullable.of(new ArrayList<>());
    }
    this.artistItems.get().add(artistItemsItem);
    return this;
  }

  /**
   * Gets or sets the artist items.
   * @return artistItems
  */
  @Valid 
  @Schema(name = "ArtistItems", description = "Gets or sets the artist items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ArtistItems")
  public JsonNullable<List<@Valid NameGuidPair>> getArtistItems() {
    return artistItems;
  }

  public void setArtistItems(JsonNullable<List<@Valid NameGuidPair>> artistItems) {
    this.artistItems = artistItems;
  }

  public BaseItemDto artists(List<String> artists) {
    this.artists = JsonNullable.of(artists);
    return this;
  }

  public BaseItemDto addArtistsItem(String artistsItem) {
    if (this.artists == null || !this.artists.isPresent()) {
      this.artists = JsonNullable.of(new ArrayList<>());
    }
    this.artists.get().add(artistsItem);
    return this;
  }

  /**
   * Gets or sets the artists.
   * @return artists
  */
  
  @Schema(name = "Artists", description = "Gets or sets the artists.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Artists")
  public JsonNullable<List<String>> getArtists() {
    return artists;
  }

  public void setArtists(JsonNullable<List<String>> artists) {
    this.artists = artists;
  }

  public BaseItemDto aspectRatio(String aspectRatio) {
    this.aspectRatio = JsonNullable.of(aspectRatio);
    return this;
  }

  /**
   * Gets or sets the aspect ratio.
   * @return aspectRatio
  */
  
  @Schema(name = "AspectRatio", description = "Gets or sets the aspect ratio.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AspectRatio")
  public JsonNullable<String> getAspectRatio() {
    return aspectRatio;
  }

  public void setAspectRatio(JsonNullable<String> aspectRatio) {
    this.aspectRatio = aspectRatio;
  }

  public BaseItemDto audio(ProgramAudio audio) {
    this.audio = audio;
    return this;
  }

  /**
   * Get audio
   * @return audio
  */
  @Valid 
  @Schema(name = "Audio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Audio")
  public ProgramAudio getAudio() {
    return audio;
  }

  public void setAudio(ProgramAudio audio) {
    this.audio = audio;
  }

  public BaseItemDto backdropImageTags(List<String> backdropImageTags) {
    this.backdropImageTags = JsonNullable.of(backdropImageTags);
    return this;
  }

  public BaseItemDto addBackdropImageTagsItem(String backdropImageTagsItem) {
    if (this.backdropImageTags == null || !this.backdropImageTags.isPresent()) {
      this.backdropImageTags = JsonNullable.of(new ArrayList<>());
    }
    this.backdropImageTags.get().add(backdropImageTagsItem);
    return this;
  }

  /**
   * Gets or sets the backdrop image tags.
   * @return backdropImageTags
  */
  
  @Schema(name = "BackdropImageTags", description = "Gets or sets the backdrop image tags.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BackdropImageTags")
  public JsonNullable<List<String>> getBackdropImageTags() {
    return backdropImageTags;
  }

  public void setBackdropImageTags(JsonNullable<List<String>> backdropImageTags) {
    this.backdropImageTags = backdropImageTags;
  }

  public BaseItemDto cameraMake(String cameraMake) {
    this.cameraMake = JsonNullable.of(cameraMake);
    return this;
  }

  /**
   * Get cameraMake
   * @return cameraMake
  */
  
  @Schema(name = "CameraMake", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CameraMake")
  public JsonNullable<String> getCameraMake() {
    return cameraMake;
  }

  public void setCameraMake(JsonNullable<String> cameraMake) {
    this.cameraMake = cameraMake;
  }

  public BaseItemDto cameraModel(String cameraModel) {
    this.cameraModel = JsonNullable.of(cameraModel);
    return this;
  }

  /**
   * Get cameraModel
   * @return cameraModel
  */
  
  @Schema(name = "CameraModel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CameraModel")
  public JsonNullable<String> getCameraModel() {
    return cameraModel;
  }

  public void setCameraModel(JsonNullable<String> cameraModel) {
    this.cameraModel = cameraModel;
  }

  public BaseItemDto canDelete(Boolean canDelete) {
    this.canDelete = JsonNullable.of(canDelete);
    return this;
  }

  /**
   * Get canDelete
   * @return canDelete
  */
  
  @Schema(name = "CanDelete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CanDelete")
  public JsonNullable<Boolean> getCanDelete() {
    return canDelete;
  }

  public void setCanDelete(JsonNullable<Boolean> canDelete) {
    this.canDelete = canDelete;
  }

  public BaseItemDto canDownload(Boolean canDownload) {
    this.canDownload = JsonNullable.of(canDownload);
    return this;
  }

  /**
   * Get canDownload
   * @return canDownload
  */
  
  @Schema(name = "CanDownload", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CanDownload")
  public JsonNullable<Boolean> getCanDownload() {
    return canDownload;
  }

  public void setCanDownload(JsonNullable<Boolean> canDownload) {
    this.canDownload = canDownload;
  }

  public BaseItemDto channelId(UUID channelId) {
    this.channelId = JsonNullable.of(channelId);
    return this;
  }

  /**
   * Gets or sets the channel identifier.
   * @return channelId
  */
  @Valid 
  @Schema(name = "ChannelId", description = "Gets or sets the channel identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ChannelId")
  public JsonNullable<UUID> getChannelId() {
    return channelId;
  }

  public void setChannelId(JsonNullable<UUID> channelId) {
    this.channelId = channelId;
  }

  public BaseItemDto channelName(String channelName) {
    this.channelName = JsonNullable.of(channelName);
    return this;
  }

  /**
   * Get channelName
   * @return channelName
  */
  
  @Schema(name = "ChannelName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ChannelName")
  public JsonNullable<String> getChannelName() {
    return channelName;
  }

  public void setChannelName(JsonNullable<String> channelName) {
    this.channelName = channelName;
  }

  public BaseItemDto channelNumber(String channelNumber) {
    this.channelNumber = JsonNullable.of(channelNumber);
    return this;
  }

  /**
   * Get channelNumber
   * @return channelNumber
  */
  
  @Schema(name = "ChannelNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ChannelNumber")
  public JsonNullable<String> getChannelNumber() {
    return channelNumber;
  }

  public void setChannelNumber(JsonNullable<String> channelNumber) {
    this.channelNumber = channelNumber;
  }

  public BaseItemDto channelPrimaryImageTag(String channelPrimaryImageTag) {
    this.channelPrimaryImageTag = JsonNullable.of(channelPrimaryImageTag);
    return this;
  }

  /**
   * Gets or sets the channel primary image tag.
   * @return channelPrimaryImageTag
  */
  
  @Schema(name = "ChannelPrimaryImageTag", description = "Gets or sets the channel primary image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ChannelPrimaryImageTag")
  public JsonNullable<String> getChannelPrimaryImageTag() {
    return channelPrimaryImageTag;
  }

  public void setChannelPrimaryImageTag(JsonNullable<String> channelPrimaryImageTag) {
    this.channelPrimaryImageTag = channelPrimaryImageTag;
  }

  public BaseItemDto channelType(ChannelType channelType) {
    this.channelType = channelType;
    return this;
  }

  /**
   * Get channelType
   * @return channelType
  */
  @Valid 
  @Schema(name = "ChannelType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ChannelType")
  public ChannelType getChannelType() {
    return channelType;
  }

  public void setChannelType(ChannelType channelType) {
    this.channelType = channelType;
  }

  public BaseItemDto chapters(List<@Valid ChapterInfo> chapters) {
    this.chapters = JsonNullable.of(chapters);
    return this;
  }

  public BaseItemDto addChaptersItem(ChapterInfo chaptersItem) {
    if (this.chapters == null || !this.chapters.isPresent()) {
      this.chapters = JsonNullable.of(new ArrayList<>());
    }
    this.chapters.get().add(chaptersItem);
    return this;
  }

  /**
   * Gets or sets the chapters.
   * @return chapters
  */
  @Valid 
  @Schema(name = "Chapters", description = "Gets or sets the chapters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Chapters")
  public JsonNullable<List<@Valid ChapterInfo>> getChapters() {
    return chapters;
  }

  public void setChapters(JsonNullable<List<@Valid ChapterInfo>> chapters) {
    this.chapters = chapters;
  }

  public BaseItemDto childCount(Integer childCount) {
    this.childCount = JsonNullable.of(childCount);
    return this;
  }

  /**
   * Gets or sets the child count.
   * @return childCount
  */
  
  @Schema(name = "ChildCount", description = "Gets or sets the child count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ChildCount")
  public JsonNullable<Integer> getChildCount() {
    return childCount;
  }

  public void setChildCount(JsonNullable<Integer> childCount) {
    this.childCount = childCount;
  }

  public BaseItemDto collectionType(String collectionType) {
    this.collectionType = JsonNullable.of(collectionType);
    return this;
  }

  /**
   * Gets or sets the type of the collection.
   * @return collectionType
  */
  
  @Schema(name = "CollectionType", description = "Gets or sets the type of the collection.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CollectionType")
  public JsonNullable<String> getCollectionType() {
    return collectionType;
  }

  public void setCollectionType(JsonNullable<String> collectionType) {
    this.collectionType = collectionType;
  }

  public BaseItemDto communityRating(Float communityRating) {
    this.communityRating = JsonNullable.of(communityRating);
    return this;
  }

  /**
   * Gets or sets the community rating.
   * @return communityRating
  */
  
  @Schema(name = "CommunityRating", description = "Gets or sets the community rating.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CommunityRating")
  public JsonNullable<Float> getCommunityRating() {
    return communityRating;
  }

  public void setCommunityRating(JsonNullable<Float> communityRating) {
    this.communityRating = communityRating;
  }

  public BaseItemDto completionPercentage(Double completionPercentage) {
    this.completionPercentage = JsonNullable.of(completionPercentage);
    return this;
  }

  /**
   * Gets or sets the completion percentage.
   * @return completionPercentage
  */
  
  @Schema(name = "CompletionPercentage", description = "Gets or sets the completion percentage.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CompletionPercentage")
  public JsonNullable<Double> getCompletionPercentage() {
    return completionPercentage;
  }

  public void setCompletionPercentage(JsonNullable<Double> completionPercentage) {
    this.completionPercentage = completionPercentage;
  }

  public BaseItemDto container(String container) {
    this.container = JsonNullable.of(container);
    return this;
  }

  /**
   * Get container
   * @return container
  */
  
  @Schema(name = "Container", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Container")
  public JsonNullable<String> getContainer() {
    return container;
  }

  public void setContainer(JsonNullable<String> container) {
    this.container = container;
  }

  public BaseItemDto criticRating(Float criticRating) {
    this.criticRating = JsonNullable.of(criticRating);
    return this;
  }

  /**
   * Gets or sets the critic rating.
   * @return criticRating
  */
  
  @Schema(name = "CriticRating", description = "Gets or sets the critic rating.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CriticRating")
  public JsonNullable<Float> getCriticRating() {
    return criticRating;
  }

  public void setCriticRating(JsonNullable<Float> criticRating) {
    this.criticRating = criticRating;
  }

  public BaseItemDto cumulativeRunTimeTicks(Long cumulativeRunTimeTicks) {
    this.cumulativeRunTimeTicks = JsonNullable.of(cumulativeRunTimeTicks);
    return this;
  }

  /**
   * Gets or sets the cumulative run time ticks.
   * @return cumulativeRunTimeTicks
  */
  
  @Schema(name = "CumulativeRunTimeTicks", description = "Gets or sets the cumulative run time ticks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CumulativeRunTimeTicks")
  public JsonNullable<Long> getCumulativeRunTimeTicks() {
    return cumulativeRunTimeTicks;
  }

  public void setCumulativeRunTimeTicks(JsonNullable<Long> cumulativeRunTimeTicks) {
    this.cumulativeRunTimeTicks = cumulativeRunTimeTicks;
  }

  public BaseItemDto currentProgram(BaseItemDto currentProgram) {
    this.currentProgram = currentProgram;
    return this;
  }

  /**
   * Get currentProgram
   * @return currentProgram
  */
  @Valid 
  @Schema(name = "CurrentProgram", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CurrentProgram")
  public BaseItemDto getCurrentProgram() {
    return currentProgram;
  }

  public void setCurrentProgram(BaseItemDto currentProgram) {
    this.currentProgram = currentProgram;
  }

  public BaseItemDto customRating(String customRating) {
    this.customRating = JsonNullable.of(customRating);
    return this;
  }

  /**
   * Gets or sets the custom rating.
   * @return customRating
  */
  
  @Schema(name = "CustomRating", description = "Gets or sets the custom rating.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CustomRating")
  public JsonNullable<String> getCustomRating() {
    return customRating;
  }

  public void setCustomRating(JsonNullable<String> customRating) {
    this.customRating = customRating;
  }

  public BaseItemDto dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = JsonNullable.of(dateCreated);
    return this;
  }

  /**
   * Gets or sets the date created.
   * @return dateCreated
  */
  @Valid 
  @Schema(name = "DateCreated", description = "Gets or sets the date created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DateCreated")
  public JsonNullable<OffsetDateTime> getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(JsonNullable<OffsetDateTime> dateCreated) {
    this.dateCreated = dateCreated;
  }

  public BaseItemDto dateLastMediaAdded(OffsetDateTime dateLastMediaAdded) {
    this.dateLastMediaAdded = JsonNullable.of(dateLastMediaAdded);
    return this;
  }

  /**
   * Get dateLastMediaAdded
   * @return dateLastMediaAdded
  */
  @Valid 
  @Schema(name = "DateLastMediaAdded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DateLastMediaAdded")
  public JsonNullable<OffsetDateTime> getDateLastMediaAdded() {
    return dateLastMediaAdded;
  }

  public void setDateLastMediaAdded(JsonNullable<OffsetDateTime> dateLastMediaAdded) {
    this.dateLastMediaAdded = dateLastMediaAdded;
  }

  public BaseItemDto displayOrder(String displayOrder) {
    this.displayOrder = JsonNullable.of(displayOrder);
    return this;
  }

  /**
   * Gets or sets the display order.
   * @return displayOrder
  */
  
  @Schema(name = "DisplayOrder", description = "Gets or sets the display order.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DisplayOrder")
  public JsonNullable<String> getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(JsonNullable<String> displayOrder) {
    this.displayOrder = displayOrder;
  }

  public BaseItemDto displayPreferencesId(String displayPreferencesId) {
    this.displayPreferencesId = JsonNullable.of(displayPreferencesId);
    return this;
  }

  /**
   * Gets or sets the display preferences id.
   * @return displayPreferencesId
  */
  
  @Schema(name = "DisplayPreferencesId", description = "Gets or sets the display preferences id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DisplayPreferencesId")
  public JsonNullable<String> getDisplayPreferencesId() {
    return displayPreferencesId;
  }

  public void setDisplayPreferencesId(JsonNullable<String> displayPreferencesId) {
    this.displayPreferencesId = displayPreferencesId;
  }

  public BaseItemDto enableMediaSourceDisplay(Boolean enableMediaSourceDisplay) {
    this.enableMediaSourceDisplay = JsonNullable.of(enableMediaSourceDisplay);
    return this;
  }

  /**
   * Get enableMediaSourceDisplay
   * @return enableMediaSourceDisplay
  */
  
  @Schema(name = "EnableMediaSourceDisplay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableMediaSourceDisplay")
  public JsonNullable<Boolean> getEnableMediaSourceDisplay() {
    return enableMediaSourceDisplay;
  }

  public void setEnableMediaSourceDisplay(JsonNullable<Boolean> enableMediaSourceDisplay) {
    this.enableMediaSourceDisplay = enableMediaSourceDisplay;
  }

  public BaseItemDto endDate(OffsetDateTime endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * Gets or sets the end date.
   * @return endDate
  */
  @Valid 
  @Schema(name = "EndDate", description = "Gets or sets the end date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EndDate")
  public JsonNullable<OffsetDateTime> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<OffsetDateTime> endDate) {
    this.endDate = endDate;
  }

  public BaseItemDto episodeCount(Integer episodeCount) {
    this.episodeCount = JsonNullable.of(episodeCount);
    return this;
  }

  /**
   * Gets or sets the episode count.
   * @return episodeCount
  */
  
  @Schema(name = "EpisodeCount", description = "Gets or sets the episode count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EpisodeCount")
  public JsonNullable<Integer> getEpisodeCount() {
    return episodeCount;
  }

  public void setEpisodeCount(JsonNullable<Integer> episodeCount) {
    this.episodeCount = episodeCount;
  }

  public BaseItemDto episodeTitle(String episodeTitle) {
    this.episodeTitle = JsonNullable.of(episodeTitle);
    return this;
  }

  /**
   * Gets or sets the episode title.
   * @return episodeTitle
  */
  
  @Schema(name = "EpisodeTitle", description = "Gets or sets the episode title.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EpisodeTitle")
  public JsonNullable<String> getEpisodeTitle() {
    return episodeTitle;
  }

  public void setEpisodeTitle(JsonNullable<String> episodeTitle) {
    this.episodeTitle = episodeTitle;
  }

  public BaseItemDto etag(String etag) {
    this.etag = JsonNullable.of(etag);
    return this;
  }

  /**
   * Gets or sets the etag.
   * @return etag
  */
  
  @Schema(name = "Etag", description = "Gets or sets the etag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Etag")
  public JsonNullable<String> getEtag() {
    return etag;
  }

  public void setEtag(JsonNullable<String> etag) {
    this.etag = etag;
  }

  public BaseItemDto exposureTime(Double exposureTime) {
    this.exposureTime = JsonNullable.of(exposureTime);
    return this;
  }

  /**
   * Get exposureTime
   * @return exposureTime
  */
  
  @Schema(name = "ExposureTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExposureTime")
  public JsonNullable<Double> getExposureTime() {
    return exposureTime;
  }

  public void setExposureTime(JsonNullable<Double> exposureTime) {
    this.exposureTime = exposureTime;
  }

  public BaseItemDto externalUrls(List<@Valid ExternalUrl> externalUrls) {
    this.externalUrls = JsonNullable.of(externalUrls);
    return this;
  }

  public BaseItemDto addExternalUrlsItem(ExternalUrl externalUrlsItem) {
    if (this.externalUrls == null || !this.externalUrls.isPresent()) {
      this.externalUrls = JsonNullable.of(new ArrayList<>());
    }
    this.externalUrls.get().add(externalUrlsItem);
    return this;
  }

  /**
   * Gets or sets the external urls.
   * @return externalUrls
  */
  @Valid 
  @Schema(name = "ExternalUrls", description = "Gets or sets the external urls.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExternalUrls")
  public JsonNullable<List<@Valid ExternalUrl>> getExternalUrls() {
    return externalUrls;
  }

  public void setExternalUrls(JsonNullable<List<@Valid ExternalUrl>> externalUrls) {
    this.externalUrls = externalUrls;
  }

  public BaseItemDto extraType(String extraType) {
    this.extraType = JsonNullable.of(extraType);
    return this;
  }

  /**
   * Get extraType
   * @return extraType
  */
  
  @Schema(name = "ExtraType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExtraType")
  public JsonNullable<String> getExtraType() {
    return extraType;
  }

  public void setExtraType(JsonNullable<String> extraType) {
    this.extraType = extraType;
  }

  public BaseItemDto focalLength(Double focalLength) {
    this.focalLength = JsonNullable.of(focalLength);
    return this;
  }

  /**
   * Get focalLength
   * @return focalLength
  */
  
  @Schema(name = "FocalLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FocalLength")
  public JsonNullable<Double> getFocalLength() {
    return focalLength;
  }

  public void setFocalLength(JsonNullable<Double> focalLength) {
    this.focalLength = focalLength;
  }

  public BaseItemDto forcedSortName(String forcedSortName) {
    this.forcedSortName = JsonNullable.of(forcedSortName);
    return this;
  }

  /**
   * Get forcedSortName
   * @return forcedSortName
  */
  
  @Schema(name = "ForcedSortName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ForcedSortName")
  public JsonNullable<String> getForcedSortName() {
    return forcedSortName;
  }

  public void setForcedSortName(JsonNullable<String> forcedSortName) {
    this.forcedSortName = forcedSortName;
  }

  public BaseItemDto genreItems(List<@Valid NameGuidPair> genreItems) {
    this.genreItems = JsonNullable.of(genreItems);
    return this;
  }

  public BaseItemDto addGenreItemsItem(NameGuidPair genreItemsItem) {
    if (this.genreItems == null || !this.genreItems.isPresent()) {
      this.genreItems = JsonNullable.of(new ArrayList<>());
    }
    this.genreItems.get().add(genreItemsItem);
    return this;
  }

  /**
   * Get genreItems
   * @return genreItems
  */
  @Valid 
  @Schema(name = "GenreItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GenreItems")
  public JsonNullable<List<@Valid NameGuidPair>> getGenreItems() {
    return genreItems;
  }

  public void setGenreItems(JsonNullable<List<@Valid NameGuidPair>> genreItems) {
    this.genreItems = genreItems;
  }

  public BaseItemDto genres(List<String> genres) {
    this.genres = JsonNullable.of(genres);
    return this;
  }

  public BaseItemDto addGenresItem(String genresItem) {
    if (this.genres == null || !this.genres.isPresent()) {
      this.genres = JsonNullable.of(new ArrayList<>());
    }
    this.genres.get().add(genresItem);
    return this;
  }

  /**
   * Gets or sets the genres.
   * @return genres
  */
  
  @Schema(name = "Genres", description = "Gets or sets the genres.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Genres")
  public JsonNullable<List<String>> getGenres() {
    return genres;
  }

  public void setGenres(JsonNullable<List<String>> genres) {
    this.genres = genres;
  }

  public BaseItemDto hasSubtitles(Boolean hasSubtitles) {
    this.hasSubtitles = JsonNullable.of(hasSubtitles);
    return this;
  }

  /**
   * Get hasSubtitles
   * @return hasSubtitles
  */
  
  @Schema(name = "HasSubtitles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HasSubtitles")
  public JsonNullable<Boolean> getHasSubtitles() {
    return hasSubtitles;
  }

  public void setHasSubtitles(JsonNullable<Boolean> hasSubtitles) {
    this.hasSubtitles = hasSubtitles;
  }

  public BaseItemDto height(Integer height) {
    this.height = JsonNullable.of(height);
    return this;
  }

  /**
   * Get height
   * @return height
  */
  
  @Schema(name = "Height", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Height")
  public JsonNullable<Integer> getHeight() {
    return height;
  }

  public void setHeight(JsonNullable<Integer> height) {
    this.height = height;
  }

  public BaseItemDto id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Gets or sets the id.
   * @return id
  */
  @Valid 
  @Schema(name = "Id", description = "Gets or sets the id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public BaseItemDto imageBlurHashes(BaseItemDtoImageBlurHashes imageBlurHashes) {
    this.imageBlurHashes = JsonNullable.of(imageBlurHashes);
    return this;
  }

  /**
   * Get imageBlurHashes
   * @return imageBlurHashes
  */
  @Valid 
  @Schema(name = "ImageBlurHashes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageBlurHashes")
  public JsonNullable<BaseItemDtoImageBlurHashes> getImageBlurHashes() {
    return imageBlurHashes;
  }

  public void setImageBlurHashes(JsonNullable<BaseItemDtoImageBlurHashes> imageBlurHashes) {
    this.imageBlurHashes = imageBlurHashes;
  }

  public BaseItemDto imageOrientation(ImageOrientation imageOrientation) {
    this.imageOrientation = imageOrientation;
    return this;
  }

  /**
   * Get imageOrientation
   * @return imageOrientation
  */
  @Valid 
  @Schema(name = "ImageOrientation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageOrientation")
  public ImageOrientation getImageOrientation() {
    return imageOrientation;
  }

  public void setImageOrientation(ImageOrientation imageOrientation) {
    this.imageOrientation = imageOrientation;
  }

  public BaseItemDto imageTags(Map<String, String> imageTags) {
    this.imageTags = JsonNullable.of(imageTags);
    return this;
  }

  public BaseItemDto putImageTagsItem(String key, String imageTagsItem) {
    if (this.imageTags == null || !this.imageTags.isPresent()) {
      this.imageTags = JsonNullable.of(new HashMap<>());
    }
    this.imageTags.get().put(key, imageTagsItem);
    return this;
  }

  /**
   * Gets or sets the image tags.
   * @return imageTags
  */
  
  @Schema(name = "ImageTags", description = "Gets or sets the image tags.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageTags")
  public JsonNullable<Map<String, String>> getImageTags() {
    return imageTags;
  }

  public void setImageTags(JsonNullable<Map<String, String>> imageTags) {
    this.imageTags = imageTags;
  }

  public BaseItemDto indexNumber(Integer indexNumber) {
    this.indexNumber = JsonNullable.of(indexNumber);
    return this;
  }

  /**
   * Gets or sets the index number.
   * @return indexNumber
  */
  
  @Schema(name = "IndexNumber", description = "Gets or sets the index number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IndexNumber")
  public JsonNullable<Integer> getIndexNumber() {
    return indexNumber;
  }

  public void setIndexNumber(JsonNullable<Integer> indexNumber) {
    this.indexNumber = indexNumber;
  }

  public BaseItemDto indexNumberEnd(Integer indexNumberEnd) {
    this.indexNumberEnd = JsonNullable.of(indexNumberEnd);
    return this;
  }

  /**
   * Gets or sets the index number end.
   * @return indexNumberEnd
  */
  
  @Schema(name = "IndexNumberEnd", description = "Gets or sets the index number end.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IndexNumberEnd")
  public JsonNullable<Integer> getIndexNumberEnd() {
    return indexNumberEnd;
  }

  public void setIndexNumberEnd(JsonNullable<Integer> indexNumberEnd) {
    this.indexNumberEnd = indexNumberEnd;
  }

  public BaseItemDto isFolder(Boolean isFolder) {
    this.isFolder = JsonNullable.of(isFolder);
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is folder.
   * @return isFolder
  */
  
  @Schema(name = "IsFolder", description = "Gets or sets a value indicating whether this instance is folder.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsFolder")
  public JsonNullable<Boolean> getIsFolder() {
    return isFolder;
  }

  public void setIsFolder(JsonNullable<Boolean> isFolder) {
    this.isFolder = isFolder;
  }

  public BaseItemDto isHD(Boolean isHD) {
    this.isHD = JsonNullable.of(isHD);
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is HD.
   * @return isHD
  */
  
  @Schema(name = "IsHD", description = "Gets or sets a value indicating whether this instance is HD.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsHD")
  public JsonNullable<Boolean> getIsHD() {
    return isHD;
  }

  public void setIsHD(JsonNullable<Boolean> isHD) {
    this.isHD = isHD;
  }

  public BaseItemDto isKids(Boolean isKids) {
    this.isKids = JsonNullable.of(isKids);
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is kids.
   * @return isKids
  */
  
  @Schema(name = "IsKids", description = "Gets or sets a value indicating whether this instance is kids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsKids")
  public JsonNullable<Boolean> getIsKids() {
    return isKids;
  }

  public void setIsKids(JsonNullable<Boolean> isKids) {
    this.isKids = isKids;
  }

  public BaseItemDto isLive(Boolean isLive) {
    this.isLive = JsonNullable.of(isLive);
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is live.
   * @return isLive
  */
  
  @Schema(name = "IsLive", description = "Gets or sets a value indicating whether this instance is live.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsLive")
  public JsonNullable<Boolean> getIsLive() {
    return isLive;
  }

  public void setIsLive(JsonNullable<Boolean> isLive) {
    this.isLive = isLive;
  }

  public BaseItemDto isMovie(Boolean isMovie) {
    this.isMovie = JsonNullable.of(isMovie);
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is movie.
   * @return isMovie
  */
  
  @Schema(name = "IsMovie", description = "Gets or sets a value indicating whether this instance is movie.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsMovie")
  public JsonNullable<Boolean> getIsMovie() {
    return isMovie;
  }

  public void setIsMovie(JsonNullable<Boolean> isMovie) {
    this.isMovie = isMovie;
  }

  public BaseItemDto isNews(Boolean isNews) {
    this.isNews = JsonNullable.of(isNews);
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is news.
   * @return isNews
  */
  
  @Schema(name = "IsNews", description = "Gets or sets a value indicating whether this instance is news.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsNews")
  public JsonNullable<Boolean> getIsNews() {
    return isNews;
  }

  public void setIsNews(JsonNullable<Boolean> isNews) {
    this.isNews = isNews;
  }

  public BaseItemDto isPlaceHolder(Boolean isPlaceHolder) {
    this.isPlaceHolder = JsonNullable.of(isPlaceHolder);
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is place holder.
   * @return isPlaceHolder
  */
  
  @Schema(name = "IsPlaceHolder", description = "Gets or sets a value indicating whether this instance is place holder.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsPlaceHolder")
  public JsonNullable<Boolean> getIsPlaceHolder() {
    return isPlaceHolder;
  }

  public void setIsPlaceHolder(JsonNullable<Boolean> isPlaceHolder) {
    this.isPlaceHolder = isPlaceHolder;
  }

  public BaseItemDto isPremiere(Boolean isPremiere) {
    this.isPremiere = JsonNullable.of(isPremiere);
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is premiere.
   * @return isPremiere
  */
  
  @Schema(name = "IsPremiere", description = "Gets or sets a value indicating whether this instance is premiere.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsPremiere")
  public JsonNullable<Boolean> getIsPremiere() {
    return isPremiere;
  }

  public void setIsPremiere(JsonNullable<Boolean> isPremiere) {
    this.isPremiere = isPremiere;
  }

  public BaseItemDto isRepeat(Boolean isRepeat) {
    this.isRepeat = JsonNullable.of(isRepeat);
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is repeat.
   * @return isRepeat
  */
  
  @Schema(name = "IsRepeat", description = "Gets or sets a value indicating whether this instance is repeat.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsRepeat")
  public JsonNullable<Boolean> getIsRepeat() {
    return isRepeat;
  }

  public void setIsRepeat(JsonNullable<Boolean> isRepeat) {
    this.isRepeat = isRepeat;
  }

  public BaseItemDto isSeries(Boolean isSeries) {
    this.isSeries = JsonNullable.of(isSeries);
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is series.
   * @return isSeries
  */
  
  @Schema(name = "IsSeries", description = "Gets or sets a value indicating whether this instance is series.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsSeries")
  public JsonNullable<Boolean> getIsSeries() {
    return isSeries;
  }

  public void setIsSeries(JsonNullable<Boolean> isSeries) {
    this.isSeries = isSeries;
  }

  public BaseItemDto isSports(Boolean isSports) {
    this.isSports = JsonNullable.of(isSports);
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is sports.
   * @return isSports
  */
  
  @Schema(name = "IsSports", description = "Gets or sets a value indicating whether this instance is sports.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsSports")
  public JsonNullable<Boolean> getIsSports() {
    return isSports;
  }

  public void setIsSports(JsonNullable<Boolean> isSports) {
    this.isSports = isSports;
  }

  public BaseItemDto isoSpeedRating(Integer isoSpeedRating) {
    this.isoSpeedRating = JsonNullable.of(isoSpeedRating);
    return this;
  }

  /**
   * Get isoSpeedRating
   * @return isoSpeedRating
  */
  
  @Schema(name = "IsoSpeedRating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsoSpeedRating")
  public JsonNullable<Integer> getIsoSpeedRating() {
    return isoSpeedRating;
  }

  public void setIsoSpeedRating(JsonNullable<Integer> isoSpeedRating) {
    this.isoSpeedRating = isoSpeedRating;
  }

  public BaseItemDto isoType(IsoType isoType) {
    this.isoType = isoType;
    return this;
  }

  /**
   * Get isoType
   * @return isoType
  */
  @Valid 
  @Schema(name = "IsoType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsoType")
  public IsoType getIsoType() {
    return isoType;
  }

  public void setIsoType(IsoType isoType) {
    this.isoType = isoType;
  }

  public BaseItemDto latitude(Double latitude) {
    this.latitude = JsonNullable.of(latitude);
    return this;
  }

  /**
   * Get latitude
   * @return latitude
  */
  
  @Schema(name = "Latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Latitude")
  public JsonNullable<Double> getLatitude() {
    return latitude;
  }

  public void setLatitude(JsonNullable<Double> latitude) {
    this.latitude = latitude;
  }

  public BaseItemDto localTrailerCount(Integer localTrailerCount) {
    this.localTrailerCount = JsonNullable.of(localTrailerCount);
    return this;
  }

  /**
   * Gets or sets the local trailer count.
   * @return localTrailerCount
  */
  
  @Schema(name = "LocalTrailerCount", description = "Gets or sets the local trailer count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LocalTrailerCount")
  public JsonNullable<Integer> getLocalTrailerCount() {
    return localTrailerCount;
  }

  public void setLocalTrailerCount(JsonNullable<Integer> localTrailerCount) {
    this.localTrailerCount = localTrailerCount;
  }

  public BaseItemDto locationType(LocationType locationType) {
    this.locationType = locationType;
    return this;
  }

  /**
   * Get locationType
   * @return locationType
  */
  @Valid 
  @Schema(name = "LocationType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LocationType")
  public LocationType getLocationType() {
    return locationType;
  }

  public void setLocationType(LocationType locationType) {
    this.locationType = locationType;
  }

  public BaseItemDto lockData(Boolean lockData) {
    this.lockData = JsonNullable.of(lockData);
    return this;
  }

  /**
   * Gets or sets a value indicating whether [enable internet providers].
   * @return lockData
  */
  
  @Schema(name = "LockData", description = "Gets or sets a value indicating whether [enable internet providers].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LockData")
  public JsonNullable<Boolean> getLockData() {
    return lockData;
  }

  public void setLockData(JsonNullable<Boolean> lockData) {
    this.lockData = lockData;
  }

  public BaseItemDto lockedFields(List<@Valid MetadataField> lockedFields) {
    this.lockedFields = JsonNullable.of(lockedFields);
    return this;
  }

  public BaseItemDto addLockedFieldsItem(MetadataField lockedFieldsItem) {
    if (this.lockedFields == null || !this.lockedFields.isPresent()) {
      this.lockedFields = JsonNullable.of(new ArrayList<>());
    }
    this.lockedFields.get().add(lockedFieldsItem);
    return this;
  }

  /**
   * Gets or sets the locked fields.
   * @return lockedFields
  */
  @Valid 
  @Schema(name = "LockedFields", description = "Gets or sets the locked fields.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LockedFields")
  public JsonNullable<List<@Valid MetadataField>> getLockedFields() {
    return lockedFields;
  }

  public void setLockedFields(JsonNullable<List<@Valid MetadataField>> lockedFields) {
    this.lockedFields = lockedFields;
  }

  public BaseItemDto longitude(Double longitude) {
    this.longitude = JsonNullable.of(longitude);
    return this;
  }

  /**
   * Get longitude
   * @return longitude
  */
  
  @Schema(name = "Longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Longitude")
  public JsonNullable<Double> getLongitude() {
    return longitude;
  }

  public void setLongitude(JsonNullable<Double> longitude) {
    this.longitude = longitude;
  }

  public BaseItemDto mediaSourceCount(Integer mediaSourceCount) {
    this.mediaSourceCount = JsonNullable.of(mediaSourceCount);
    return this;
  }

  /**
   * Get mediaSourceCount
   * @return mediaSourceCount
  */
  
  @Schema(name = "MediaSourceCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MediaSourceCount")
  public JsonNullable<Integer> getMediaSourceCount() {
    return mediaSourceCount;
  }

  public void setMediaSourceCount(JsonNullable<Integer> mediaSourceCount) {
    this.mediaSourceCount = mediaSourceCount;
  }

  public BaseItemDto mediaSources(List<@Valid MediaSourceInfo> mediaSources) {
    this.mediaSources = JsonNullable.of(mediaSources);
    return this;
  }

  public BaseItemDto addMediaSourcesItem(MediaSourceInfo mediaSourcesItem) {
    if (this.mediaSources == null || !this.mediaSources.isPresent()) {
      this.mediaSources = JsonNullable.of(new ArrayList<>());
    }
    this.mediaSources.get().add(mediaSourcesItem);
    return this;
  }

  /**
   * Gets or sets the media versions.
   * @return mediaSources
  */
  @Valid 
  @Schema(name = "MediaSources", description = "Gets or sets the media versions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MediaSources")
  public JsonNullable<List<@Valid MediaSourceInfo>> getMediaSources() {
    return mediaSources;
  }

  public void setMediaSources(JsonNullable<List<@Valid MediaSourceInfo>> mediaSources) {
    this.mediaSources = mediaSources;
  }

  public BaseItemDto mediaStreams(List<@Valid MediaStream> mediaStreams) {
    this.mediaStreams = JsonNullable.of(mediaStreams);
    return this;
  }

  public BaseItemDto addMediaStreamsItem(MediaStream mediaStreamsItem) {
    if (this.mediaStreams == null || !this.mediaStreams.isPresent()) {
      this.mediaStreams = JsonNullable.of(new ArrayList<>());
    }
    this.mediaStreams.get().add(mediaStreamsItem);
    return this;
  }

  /**
   * Gets or sets the media streams.
   * @return mediaStreams
  */
  @Valid 
  @Schema(name = "MediaStreams", description = "Gets or sets the media streams.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MediaStreams")
  public JsonNullable<List<@Valid MediaStream>> getMediaStreams() {
    return mediaStreams;
  }

  public void setMediaStreams(JsonNullable<List<@Valid MediaStream>> mediaStreams) {
    this.mediaStreams = mediaStreams;
  }

  public BaseItemDto mediaType(String mediaType) {
    this.mediaType = JsonNullable.of(mediaType);
    return this;
  }

  /**
   * Gets or sets the type of the media.
   * @return mediaType
  */
  
  @Schema(name = "MediaType", description = "Gets or sets the type of the media.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MediaType")
  public JsonNullable<String> getMediaType() {
    return mediaType;
  }

  public void setMediaType(JsonNullable<String> mediaType) {
    this.mediaType = mediaType;
  }

  public BaseItemDto movieCount(Integer movieCount) {
    this.movieCount = JsonNullable.of(movieCount);
    return this;
  }

  /**
   * Gets or sets the movie count.
   * @return movieCount
  */
  
  @Schema(name = "MovieCount", description = "Gets or sets the movie count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MovieCount")
  public JsonNullable<Integer> getMovieCount() {
    return movieCount;
  }

  public void setMovieCount(JsonNullable<Integer> movieCount) {
    this.movieCount = movieCount;
  }

  public BaseItemDto musicVideoCount(Integer musicVideoCount) {
    this.musicVideoCount = JsonNullable.of(musicVideoCount);
    return this;
  }

  /**
   * Gets or sets the music video count.
   * @return musicVideoCount
  */
  
  @Schema(name = "MusicVideoCount", description = "Gets or sets the music video count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MusicVideoCount")
  public JsonNullable<Integer> getMusicVideoCount() {
    return musicVideoCount;
  }

  public void setMusicVideoCount(JsonNullable<Integer> musicVideoCount) {
    this.musicVideoCount = musicVideoCount;
  }

  public BaseItemDto name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets or sets the name.
   * @return name
  */
  
  @Schema(name = "Name", description = "Gets or sets the name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public BaseItemDto number(String number) {
    this.number = JsonNullable.of(number);
    return this;
  }

  /**
   * Gets or sets the number.
   * @return number
  */
  
  @Schema(name = "Number", description = "Gets or sets the number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Number")
  public JsonNullable<String> getNumber() {
    return number;
  }

  public void setNumber(JsonNullable<String> number) {
    this.number = number;
  }

  public BaseItemDto officialRating(String officialRating) {
    this.officialRating = JsonNullable.of(officialRating);
    return this;
  }

  /**
   * Gets or sets the official rating.
   * @return officialRating
  */
  
  @Schema(name = "OfficialRating", description = "Gets or sets the official rating.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OfficialRating")
  public JsonNullable<String> getOfficialRating() {
    return officialRating;
  }

  public void setOfficialRating(JsonNullable<String> officialRating) {
    this.officialRating = officialRating;
  }

  public BaseItemDto originalTitle(String originalTitle) {
    this.originalTitle = JsonNullable.of(originalTitle);
    return this;
  }

  /**
   * Get originalTitle
   * @return originalTitle
  */
  
  @Schema(name = "OriginalTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OriginalTitle")
  public JsonNullable<String> getOriginalTitle() {
    return originalTitle;
  }

  public void setOriginalTitle(JsonNullable<String> originalTitle) {
    this.originalTitle = originalTitle;
  }

  public BaseItemDto overview(String overview) {
    this.overview = JsonNullable.of(overview);
    return this;
  }

  /**
   * Gets or sets the overview.
   * @return overview
  */
  
  @Schema(name = "Overview", description = "Gets or sets the overview.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Overview")
  public JsonNullable<String> getOverview() {
    return overview;
  }

  public void setOverview(JsonNullable<String> overview) {
    this.overview = overview;
  }

  public BaseItemDto parentArtImageTag(String parentArtImageTag) {
    this.parentArtImageTag = JsonNullable.of(parentArtImageTag);
    return this;
  }

  /**
   * Gets or sets the parent art image tag.
   * @return parentArtImageTag
  */
  
  @Schema(name = "ParentArtImageTag", description = "Gets or sets the parent art image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentArtImageTag")
  public JsonNullable<String> getParentArtImageTag() {
    return parentArtImageTag;
  }

  public void setParentArtImageTag(JsonNullable<String> parentArtImageTag) {
    this.parentArtImageTag = parentArtImageTag;
  }

  public BaseItemDto parentArtItemId(String parentArtItemId) {
    this.parentArtItemId = JsonNullable.of(parentArtItemId);
    return this;
  }

  /**
   * If the item does not have a art, this will hold the Id of the Parent that has one.
   * @return parentArtItemId
  */
  
  @Schema(name = "ParentArtItemId", description = "If the item does not have a art, this will hold the Id of the Parent that has one.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentArtItemId")
  public JsonNullable<String> getParentArtItemId() {
    return parentArtItemId;
  }

  public void setParentArtItemId(JsonNullable<String> parentArtItemId) {
    this.parentArtItemId = parentArtItemId;
  }

  public BaseItemDto parentBackdropImageTags(List<String> parentBackdropImageTags) {
    this.parentBackdropImageTags = JsonNullable.of(parentBackdropImageTags);
    return this;
  }

  public BaseItemDto addParentBackdropImageTagsItem(String parentBackdropImageTagsItem) {
    if (this.parentBackdropImageTags == null || !this.parentBackdropImageTags.isPresent()) {
      this.parentBackdropImageTags = JsonNullable.of(new ArrayList<>());
    }
    this.parentBackdropImageTags.get().add(parentBackdropImageTagsItem);
    return this;
  }

  /**
   * Gets or sets the parent backdrop image tags.
   * @return parentBackdropImageTags
  */
  
  @Schema(name = "ParentBackdropImageTags", description = "Gets or sets the parent backdrop image tags.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentBackdropImageTags")
  public JsonNullable<List<String>> getParentBackdropImageTags() {
    return parentBackdropImageTags;
  }

  public void setParentBackdropImageTags(JsonNullable<List<String>> parentBackdropImageTags) {
    this.parentBackdropImageTags = parentBackdropImageTags;
  }

  public BaseItemDto parentBackdropItemId(String parentBackdropItemId) {
    this.parentBackdropItemId = JsonNullable.of(parentBackdropItemId);
    return this;
  }

  /**
   * If the item does not have any backdrops, this will hold the Id of the Parent that has one.
   * @return parentBackdropItemId
  */
  
  @Schema(name = "ParentBackdropItemId", description = "If the item does not have any backdrops, this will hold the Id of the Parent that has one.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentBackdropItemId")
  public JsonNullable<String> getParentBackdropItemId() {
    return parentBackdropItemId;
  }

  public void setParentBackdropItemId(JsonNullable<String> parentBackdropItemId) {
    this.parentBackdropItemId = parentBackdropItemId;
  }

  public BaseItemDto parentId(UUID parentId) {
    this.parentId = JsonNullable.of(parentId);
    return this;
  }

  /**
   * Gets or sets the parent id.
   * @return parentId
  */
  @Valid 
  @Schema(name = "ParentId", description = "Gets or sets the parent id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentId")
  public JsonNullable<UUID> getParentId() {
    return parentId;
  }

  public void setParentId(JsonNullable<UUID> parentId) {
    this.parentId = parentId;
  }

  public BaseItemDto parentIndexNumber(Integer parentIndexNumber) {
    this.parentIndexNumber = JsonNullable.of(parentIndexNumber);
    return this;
  }

  /**
   * Gets or sets the parent index number.
   * @return parentIndexNumber
  */
  
  @Schema(name = "ParentIndexNumber", description = "Gets or sets the parent index number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentIndexNumber")
  public JsonNullable<Integer> getParentIndexNumber() {
    return parentIndexNumber;
  }

  public void setParentIndexNumber(JsonNullable<Integer> parentIndexNumber) {
    this.parentIndexNumber = parentIndexNumber;
  }

  public BaseItemDto parentLogoImageTag(String parentLogoImageTag) {
    this.parentLogoImageTag = JsonNullable.of(parentLogoImageTag);
    return this;
  }

  /**
   * Gets or sets the parent logo image tag.
   * @return parentLogoImageTag
  */
  
  @Schema(name = "ParentLogoImageTag", description = "Gets or sets the parent logo image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentLogoImageTag")
  public JsonNullable<String> getParentLogoImageTag() {
    return parentLogoImageTag;
  }

  public void setParentLogoImageTag(JsonNullable<String> parentLogoImageTag) {
    this.parentLogoImageTag = parentLogoImageTag;
  }

  public BaseItemDto parentLogoItemId(String parentLogoItemId) {
    this.parentLogoItemId = JsonNullable.of(parentLogoItemId);
    return this;
  }

  /**
   * If the item does not have a logo, this will hold the Id of the Parent that has one.
   * @return parentLogoItemId
  */
  
  @Schema(name = "ParentLogoItemId", description = "If the item does not have a logo, this will hold the Id of the Parent that has one.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentLogoItemId")
  public JsonNullable<String> getParentLogoItemId() {
    return parentLogoItemId;
  }

  public void setParentLogoItemId(JsonNullable<String> parentLogoItemId) {
    this.parentLogoItemId = parentLogoItemId;
  }

  public BaseItemDto parentPrimaryImageItemId(String parentPrimaryImageItemId) {
    this.parentPrimaryImageItemId = JsonNullable.of(parentPrimaryImageItemId);
    return this;
  }

  /**
   * Gets or sets the parent primary image item identifier.
   * @return parentPrimaryImageItemId
  */
  
  @Schema(name = "ParentPrimaryImageItemId", description = "Gets or sets the parent primary image item identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentPrimaryImageItemId")
  public JsonNullable<String> getParentPrimaryImageItemId() {
    return parentPrimaryImageItemId;
  }

  public void setParentPrimaryImageItemId(JsonNullable<String> parentPrimaryImageItemId) {
    this.parentPrimaryImageItemId = parentPrimaryImageItemId;
  }

  public BaseItemDto parentPrimaryImageTag(String parentPrimaryImageTag) {
    this.parentPrimaryImageTag = JsonNullable.of(parentPrimaryImageTag);
    return this;
  }

  /**
   * Gets or sets the parent primary image tag.
   * @return parentPrimaryImageTag
  */
  
  @Schema(name = "ParentPrimaryImageTag", description = "Gets or sets the parent primary image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentPrimaryImageTag")
  public JsonNullable<String> getParentPrimaryImageTag() {
    return parentPrimaryImageTag;
  }

  public void setParentPrimaryImageTag(JsonNullable<String> parentPrimaryImageTag) {
    this.parentPrimaryImageTag = parentPrimaryImageTag;
  }

  public BaseItemDto parentThumbImageTag(String parentThumbImageTag) {
    this.parentThumbImageTag = JsonNullable.of(parentThumbImageTag);
    return this;
  }

  /**
   * Gets or sets the parent thumb image tag.
   * @return parentThumbImageTag
  */
  
  @Schema(name = "ParentThumbImageTag", description = "Gets or sets the parent thumb image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentThumbImageTag")
  public JsonNullable<String> getParentThumbImageTag() {
    return parentThumbImageTag;
  }

  public void setParentThumbImageTag(JsonNullable<String> parentThumbImageTag) {
    this.parentThumbImageTag = parentThumbImageTag;
  }

  public BaseItemDto parentThumbItemId(String parentThumbItemId) {
    this.parentThumbItemId = JsonNullable.of(parentThumbItemId);
    return this;
  }

  /**
   * Gets or sets the parent thumb item id.
   * @return parentThumbItemId
  */
  
  @Schema(name = "ParentThumbItemId", description = "Gets or sets the parent thumb item id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentThumbItemId")
  public JsonNullable<String> getParentThumbItemId() {
    return parentThumbItemId;
  }

  public void setParentThumbItemId(JsonNullable<String> parentThumbItemId) {
    this.parentThumbItemId = parentThumbItemId;
  }

  public BaseItemDto partCount(Integer partCount) {
    this.partCount = JsonNullable.of(partCount);
    return this;
  }

  /**
   * Gets or sets the part count.
   * @return partCount
  */
  
  @Schema(name = "PartCount", description = "Gets or sets the part count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PartCount")
  public JsonNullable<Integer> getPartCount() {
    return partCount;
  }

  public void setPartCount(JsonNullable<Integer> partCount) {
    this.partCount = partCount;
  }

  public BaseItemDto path(String path) {
    this.path = JsonNullable.of(path);
    return this;
  }

  /**
   * Gets or sets the path.
   * @return path
  */
  
  @Schema(name = "Path", description = "Gets or sets the path.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Path")
  public JsonNullable<String> getPath() {
    return path;
  }

  public void setPath(JsonNullable<String> path) {
    this.path = path;
  }

  public BaseItemDto people(List<@Valid BaseItemPerson> people) {
    this.people = JsonNullable.of(people);
    return this;
  }

  public BaseItemDto addPeopleItem(BaseItemPerson peopleItem) {
    if (this.people == null || !this.people.isPresent()) {
      this.people = JsonNullable.of(new ArrayList<>());
    }
    this.people.get().add(peopleItem);
    return this;
  }

  /**
   * Gets or sets the people.
   * @return people
  */
  @Valid 
  @Schema(name = "People", description = "Gets or sets the people.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("People")
  public JsonNullable<List<@Valid BaseItemPerson>> getPeople() {
    return people;
  }

  public void setPeople(JsonNullable<List<@Valid BaseItemPerson>> people) {
    this.people = people;
  }

  public BaseItemDto playAccess(PlayAccess playAccess) {
    this.playAccess = playAccess;
    return this;
  }

  /**
   * Get playAccess
   * @return playAccess
  */
  @Valid 
  @Schema(name = "PlayAccess", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlayAccess")
  public PlayAccess getPlayAccess() {
    return playAccess;
  }

  public void setPlayAccess(PlayAccess playAccess) {
    this.playAccess = playAccess;
  }

  public BaseItemDto playlistItemId(String playlistItemId) {
    this.playlistItemId = JsonNullable.of(playlistItemId);
    return this;
  }

  /**
   * Gets or sets the playlist item identifier.
   * @return playlistItemId
  */
  
  @Schema(name = "PlaylistItemId", description = "Gets or sets the playlist item identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlaylistItemId")
  public JsonNullable<String> getPlaylistItemId() {
    return playlistItemId;
  }

  public void setPlaylistItemId(JsonNullable<String> playlistItemId) {
    this.playlistItemId = playlistItemId;
  }

  public BaseItemDto preferredMetadataCountryCode(String preferredMetadataCountryCode) {
    this.preferredMetadataCountryCode = JsonNullable.of(preferredMetadataCountryCode);
    return this;
  }

  /**
   * Get preferredMetadataCountryCode
   * @return preferredMetadataCountryCode
  */
  
  @Schema(name = "PreferredMetadataCountryCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PreferredMetadataCountryCode")
  public JsonNullable<String> getPreferredMetadataCountryCode() {
    return preferredMetadataCountryCode;
  }

  public void setPreferredMetadataCountryCode(JsonNullable<String> preferredMetadataCountryCode) {
    this.preferredMetadataCountryCode = preferredMetadataCountryCode;
  }

  public BaseItemDto preferredMetadataLanguage(String preferredMetadataLanguage) {
    this.preferredMetadataLanguage = JsonNullable.of(preferredMetadataLanguage);
    return this;
  }

  /**
   * Get preferredMetadataLanguage
   * @return preferredMetadataLanguage
  */
  
  @Schema(name = "PreferredMetadataLanguage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PreferredMetadataLanguage")
  public JsonNullable<String> getPreferredMetadataLanguage() {
    return preferredMetadataLanguage;
  }

  public void setPreferredMetadataLanguage(JsonNullable<String> preferredMetadataLanguage) {
    this.preferredMetadataLanguage = preferredMetadataLanguage;
  }

  public BaseItemDto premiereDate(OffsetDateTime premiereDate) {
    this.premiereDate = JsonNullable.of(premiereDate);
    return this;
  }

  /**
   * Gets or sets the premiere date.
   * @return premiereDate
  */
  @Valid 
  @Schema(name = "PremiereDate", description = "Gets or sets the premiere date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PremiereDate")
  public JsonNullable<OffsetDateTime> getPremiereDate() {
    return premiereDate;
  }

  public void setPremiereDate(JsonNullable<OffsetDateTime> premiereDate) {
    this.premiereDate = premiereDate;
  }

  public BaseItemDto primaryImageAspectRatio(Double primaryImageAspectRatio) {
    this.primaryImageAspectRatio = JsonNullable.of(primaryImageAspectRatio);
    return this;
  }

  /**
   * Gets or sets the primary image aspect ratio, after image enhancements.
   * @return primaryImageAspectRatio
  */
  
  @Schema(name = "PrimaryImageAspectRatio", description = "Gets or sets the primary image aspect ratio, after image enhancements.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PrimaryImageAspectRatio")
  public JsonNullable<Double> getPrimaryImageAspectRatio() {
    return primaryImageAspectRatio;
  }

  public void setPrimaryImageAspectRatio(JsonNullable<Double> primaryImageAspectRatio) {
    this.primaryImageAspectRatio = primaryImageAspectRatio;
  }

  public BaseItemDto productionLocations(List<String> productionLocations) {
    this.productionLocations = JsonNullable.of(productionLocations);
    return this;
  }

  public BaseItemDto addProductionLocationsItem(String productionLocationsItem) {
    if (this.productionLocations == null || !this.productionLocations.isPresent()) {
      this.productionLocations = JsonNullable.of(new ArrayList<>());
    }
    this.productionLocations.get().add(productionLocationsItem);
    return this;
  }

  /**
   * Get productionLocations
   * @return productionLocations
  */
  
  @Schema(name = "ProductionLocations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProductionLocations")
  public JsonNullable<List<String>> getProductionLocations() {
    return productionLocations;
  }

  public void setProductionLocations(JsonNullable<List<String>> productionLocations) {
    this.productionLocations = productionLocations;
  }

  public BaseItemDto productionYear(Integer productionYear) {
    this.productionYear = JsonNullable.of(productionYear);
    return this;
  }

  /**
   * Gets or sets the production year.
   * @return productionYear
  */
  
  @Schema(name = "ProductionYear", description = "Gets or sets the production year.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProductionYear")
  public JsonNullable<Integer> getProductionYear() {
    return productionYear;
  }

  public void setProductionYear(JsonNullable<Integer> productionYear) {
    this.productionYear = productionYear;
  }

  public BaseItemDto programCount(Integer programCount) {
    this.programCount = JsonNullable.of(programCount);
    return this;
  }

  /**
   * Get programCount
   * @return programCount
  */
  
  @Schema(name = "ProgramCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProgramCount")
  public JsonNullable<Integer> getProgramCount() {
    return programCount;
  }

  public void setProgramCount(JsonNullable<Integer> programCount) {
    this.programCount = programCount;
  }

  public BaseItemDto programId(String programId) {
    this.programId = JsonNullable.of(programId);
    return this;
  }

  /**
   * Gets or sets the program identifier.
   * @return programId
  */
  
  @Schema(name = "ProgramId", description = "Gets or sets the program identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProgramId")
  public JsonNullable<String> getProgramId() {
    return programId;
  }

  public void setProgramId(JsonNullable<String> programId) {
    this.programId = programId;
  }

  public BaseItemDto providerIds(Map<String, String> providerIds) {
    this.providerIds = JsonNullable.of(providerIds);
    return this;
  }

  public BaseItemDto putProviderIdsItem(String key, String providerIdsItem) {
    if (this.providerIds == null || !this.providerIds.isPresent()) {
      this.providerIds = JsonNullable.of(new HashMap<>());
    }
    this.providerIds.get().put(key, providerIdsItem);
    return this;
  }

  /**
   * Gets or sets the provider ids.
   * @return providerIds
  */
  
  @Schema(name = "ProviderIds", description = "Gets or sets the provider ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProviderIds")
  public JsonNullable<Map<String, String>> getProviderIds() {
    return providerIds;
  }

  public void setProviderIds(JsonNullable<Map<String, String>> providerIds) {
    this.providerIds = providerIds;
  }

  public BaseItemDto recursiveItemCount(Integer recursiveItemCount) {
    this.recursiveItemCount = JsonNullable.of(recursiveItemCount);
    return this;
  }

  /**
   * Gets or sets the recursive item count.
   * @return recursiveItemCount
  */
  
  @Schema(name = "RecursiveItemCount", description = "Gets or sets the recursive item count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RecursiveItemCount")
  public JsonNullable<Integer> getRecursiveItemCount() {
    return recursiveItemCount;
  }

  public void setRecursiveItemCount(JsonNullable<Integer> recursiveItemCount) {
    this.recursiveItemCount = recursiveItemCount;
  }

  public BaseItemDto remoteTrailers(List<@Valid MediaUrl> remoteTrailers) {
    this.remoteTrailers = JsonNullable.of(remoteTrailers);
    return this;
  }

  public BaseItemDto addRemoteTrailersItem(MediaUrl remoteTrailersItem) {
    if (this.remoteTrailers == null || !this.remoteTrailers.isPresent()) {
      this.remoteTrailers = JsonNullable.of(new ArrayList<>());
    }
    this.remoteTrailers.get().add(remoteTrailersItem);
    return this;
  }

  /**
   * Gets or sets the trailer urls.
   * @return remoteTrailers
  */
  @Valid 
  @Schema(name = "RemoteTrailers", description = "Gets or sets the trailer urls.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RemoteTrailers")
  public JsonNullable<List<@Valid MediaUrl>> getRemoteTrailers() {
    return remoteTrailers;
  }

  public void setRemoteTrailers(JsonNullable<List<@Valid MediaUrl>> remoteTrailers) {
    this.remoteTrailers = remoteTrailers;
  }

  public BaseItemDto runTimeTicks(Long runTimeTicks) {
    this.runTimeTicks = JsonNullable.of(runTimeTicks);
    return this;
  }

  /**
   * Gets or sets the run time ticks.
   * @return runTimeTicks
  */
  
  @Schema(name = "RunTimeTicks", description = "Gets or sets the run time ticks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RunTimeTicks")
  public JsonNullable<Long> getRunTimeTicks() {
    return runTimeTicks;
  }

  public void setRunTimeTicks(JsonNullable<Long> runTimeTicks) {
    this.runTimeTicks = runTimeTicks;
  }

  public BaseItemDto screenshotImageTags(List<String> screenshotImageTags) {
    this.screenshotImageTags = JsonNullable.of(screenshotImageTags);
    return this;
  }

  public BaseItemDto addScreenshotImageTagsItem(String screenshotImageTagsItem) {
    if (this.screenshotImageTags == null || !this.screenshotImageTags.isPresent()) {
      this.screenshotImageTags = JsonNullable.of(new ArrayList<>());
    }
    this.screenshotImageTags.get().add(screenshotImageTagsItem);
    return this;
  }

  /**
   * Gets or sets the screenshot image tags.
   * @return screenshotImageTags
  */
  
  @Schema(name = "ScreenshotImageTags", description = "Gets or sets the screenshot image tags.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ScreenshotImageTags")
  public JsonNullable<List<String>> getScreenshotImageTags() {
    return screenshotImageTags;
  }

  public void setScreenshotImageTags(JsonNullable<List<String>> screenshotImageTags) {
    this.screenshotImageTags = screenshotImageTags;
  }

  public BaseItemDto seasonId(UUID seasonId) {
    this.seasonId = JsonNullable.of(seasonId);
    return this;
  }

  /**
   * Gets or sets the season identifier.
   * @return seasonId
  */
  @Valid 
  @Schema(name = "SeasonId", description = "Gets or sets the season identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SeasonId")
  public JsonNullable<UUID> getSeasonId() {
    return seasonId;
  }

  public void setSeasonId(JsonNullable<UUID> seasonId) {
    this.seasonId = seasonId;
  }

  public BaseItemDto seasonName(String seasonName) {
    this.seasonName = JsonNullable.of(seasonName);
    return this;
  }

  /**
   * Gets or sets the name of the season.
   * @return seasonName
  */
  
  @Schema(name = "SeasonName", description = "Gets or sets the name of the season.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SeasonName")
  public JsonNullable<String> getSeasonName() {
    return seasonName;
  }

  public void setSeasonName(JsonNullable<String> seasonName) {
    this.seasonName = seasonName;
  }

  public BaseItemDto seriesCount(Integer seriesCount) {
    this.seriesCount = JsonNullable.of(seriesCount);
    return this;
  }

  /**
   * Gets or sets the series count.
   * @return seriesCount
  */
  
  @Schema(name = "SeriesCount", description = "Gets or sets the series count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SeriesCount")
  public JsonNullable<Integer> getSeriesCount() {
    return seriesCount;
  }

  public void setSeriesCount(JsonNullable<Integer> seriesCount) {
    this.seriesCount = seriesCount;
  }

  public BaseItemDto seriesId(UUID seriesId) {
    this.seriesId = JsonNullable.of(seriesId);
    return this;
  }

  /**
   * Gets or sets the series id.
   * @return seriesId
  */
  @Valid 
  @Schema(name = "SeriesId", description = "Gets or sets the series id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SeriesId")
  public JsonNullable<UUID> getSeriesId() {
    return seriesId;
  }

  public void setSeriesId(JsonNullable<UUID> seriesId) {
    this.seriesId = seriesId;
  }

  public BaseItemDto seriesName(String seriesName) {
    this.seriesName = JsonNullable.of(seriesName);
    return this;
  }

  /**
   * Gets or sets the name of the series.
   * @return seriesName
  */
  
  @Schema(name = "SeriesName", description = "Gets or sets the name of the series.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SeriesName")
  public JsonNullable<String> getSeriesName() {
    return seriesName;
  }

  public void setSeriesName(JsonNullable<String> seriesName) {
    this.seriesName = seriesName;
  }

  public BaseItemDto seriesPrimaryImageTag(String seriesPrimaryImageTag) {
    this.seriesPrimaryImageTag = JsonNullable.of(seriesPrimaryImageTag);
    return this;
  }

  /**
   * Gets or sets the series primary image tag.
   * @return seriesPrimaryImageTag
  */
  
  @Schema(name = "SeriesPrimaryImageTag", description = "Gets or sets the series primary image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SeriesPrimaryImageTag")
  public JsonNullable<String> getSeriesPrimaryImageTag() {
    return seriesPrimaryImageTag;
  }

  public void setSeriesPrimaryImageTag(JsonNullable<String> seriesPrimaryImageTag) {
    this.seriesPrimaryImageTag = seriesPrimaryImageTag;
  }

  public BaseItemDto seriesStudio(String seriesStudio) {
    this.seriesStudio = JsonNullable.of(seriesStudio);
    return this;
  }

  /**
   * Gets or sets the series studio.
   * @return seriesStudio
  */
  
  @Schema(name = "SeriesStudio", description = "Gets or sets the series studio.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SeriesStudio")
  public JsonNullable<String> getSeriesStudio() {
    return seriesStudio;
  }

  public void setSeriesStudio(JsonNullable<String> seriesStudio) {
    this.seriesStudio = seriesStudio;
  }

  public BaseItemDto seriesThumbImageTag(String seriesThumbImageTag) {
    this.seriesThumbImageTag = JsonNullable.of(seriesThumbImageTag);
    return this;
  }

  /**
   * Gets or sets the series thumb image tag.
   * @return seriesThumbImageTag
  */
  
  @Schema(name = "SeriesThumbImageTag", description = "Gets or sets the series thumb image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SeriesThumbImageTag")
  public JsonNullable<String> getSeriesThumbImageTag() {
    return seriesThumbImageTag;
  }

  public void setSeriesThumbImageTag(JsonNullable<String> seriesThumbImageTag) {
    this.seriesThumbImageTag = seriesThumbImageTag;
  }

  public BaseItemDto seriesTimerId(String seriesTimerId) {
    this.seriesTimerId = JsonNullable.of(seriesTimerId);
    return this;
  }

  /**
   * Gets or sets the series timer identifier.
   * @return seriesTimerId
  */
  
  @Schema(name = "SeriesTimerId", description = "Gets or sets the series timer identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SeriesTimerId")
  public JsonNullable<String> getSeriesTimerId() {
    return seriesTimerId;
  }

  public void setSeriesTimerId(JsonNullable<String> seriesTimerId) {
    this.seriesTimerId = seriesTimerId;
  }

  public BaseItemDto serverId(String serverId) {
    this.serverId = JsonNullable.of(serverId);
    return this;
  }

  /**
   * Gets or sets the server identifier.
   * @return serverId
  */
  
  @Schema(name = "ServerId", description = "Gets or sets the server identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServerId")
  public JsonNullable<String> getServerId() {
    return serverId;
  }

  public void setServerId(JsonNullable<String> serverId) {
    this.serverId = serverId;
  }

  public BaseItemDto shutterSpeed(Double shutterSpeed) {
    this.shutterSpeed = JsonNullable.of(shutterSpeed);
    return this;
  }

  /**
   * Get shutterSpeed
   * @return shutterSpeed
  */
  
  @Schema(name = "ShutterSpeed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ShutterSpeed")
  public JsonNullable<Double> getShutterSpeed() {
    return shutterSpeed;
  }

  public void setShutterSpeed(JsonNullable<Double> shutterSpeed) {
    this.shutterSpeed = shutterSpeed;
  }

  public BaseItemDto software(String software) {
    this.software = JsonNullable.of(software);
    return this;
  }

  /**
   * Get software
   * @return software
  */
  
  @Schema(name = "Software", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Software")
  public JsonNullable<String> getSoftware() {
    return software;
  }

  public void setSoftware(JsonNullable<String> software) {
    this.software = software;
  }

  public BaseItemDto songCount(Integer songCount) {
    this.songCount = JsonNullable.of(songCount);
    return this;
  }

  /**
   * Gets or sets the song count.
   * @return songCount
  */
  
  @Schema(name = "SongCount", description = "Gets or sets the song count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SongCount")
  public JsonNullable<Integer> getSongCount() {
    return songCount;
  }

  public void setSongCount(JsonNullable<Integer> songCount) {
    this.songCount = songCount;
  }

  public BaseItemDto sortName(String sortName) {
    this.sortName = JsonNullable.of(sortName);
    return this;
  }

  /**
   * Gets or sets the name of the sort.
   * @return sortName
  */
  
  @Schema(name = "SortName", description = "Gets or sets the name of the sort.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SortName")
  public JsonNullable<String> getSortName() {
    return sortName;
  }

  public void setSortName(JsonNullable<String> sortName) {
    this.sortName = sortName;
  }

  public BaseItemDto sourceType(String sourceType) {
    this.sourceType = JsonNullable.of(sourceType);
    return this;
  }

  /**
   * Gets or sets the type of the source.
   * @return sourceType
  */
  
  @Schema(name = "SourceType", description = "Gets or sets the type of the source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SourceType")
  public JsonNullable<String> getSourceType() {
    return sourceType;
  }

  public void setSourceType(JsonNullable<String> sourceType) {
    this.sourceType = sourceType;
  }

  public BaseItemDto specialFeatureCount(Integer specialFeatureCount) {
    this.specialFeatureCount = JsonNullable.of(specialFeatureCount);
    return this;
  }

  /**
   * Gets or sets the special feature count.
   * @return specialFeatureCount
  */
  
  @Schema(name = "SpecialFeatureCount", description = "Gets or sets the special feature count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SpecialFeatureCount")
  public JsonNullable<Integer> getSpecialFeatureCount() {
    return specialFeatureCount;
  }

  public void setSpecialFeatureCount(JsonNullable<Integer> specialFeatureCount) {
    this.specialFeatureCount = specialFeatureCount;
  }

  public BaseItemDto startDate(OffsetDateTime startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * The start date of the recording, in UTC.
   * @return startDate
  */
  @Valid 
  @Schema(name = "StartDate", description = "The start date of the recording, in UTC.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartDate")
  public JsonNullable<OffsetDateTime> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<OffsetDateTime> startDate) {
    this.startDate = startDate;
  }

  public BaseItemDto status(String status) {
    this.status = JsonNullable.of(status);
    return this;
  }

  /**
   * Gets or sets the status.
   * @return status
  */
  
  @Schema(name = "Status", description = "Gets or sets the status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Status")
  public JsonNullable<String> getStatus() {
    return status;
  }

  public void setStatus(JsonNullable<String> status) {
    this.status = status;
  }

  public BaseItemDto studios(List<@Valid NameGuidPair> studios) {
    this.studios = JsonNullable.of(studios);
    return this;
  }

  public BaseItemDto addStudiosItem(NameGuidPair studiosItem) {
    if (this.studios == null || !this.studios.isPresent()) {
      this.studios = JsonNullable.of(new ArrayList<>());
    }
    this.studios.get().add(studiosItem);
    return this;
  }

  /**
   * Gets or sets the studios.
   * @return studios
  */
  @Valid 
  @Schema(name = "Studios", description = "Gets or sets the studios.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Studios")
  public JsonNullable<List<@Valid NameGuidPair>> getStudios() {
    return studios;
  }

  public void setStudios(JsonNullable<List<@Valid NameGuidPair>> studios) {
    this.studios = studios;
  }

  public BaseItemDto supportsSync(Boolean supportsSync) {
    this.supportsSync = JsonNullable.of(supportsSync);
    return this;
  }

  /**
   * Gets or sets a value indicating whether [supports synchronize].
   * @return supportsSync
  */
  
  @Schema(name = "SupportsSync", description = "Gets or sets a value indicating whether [supports synchronize].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsSync")
  public JsonNullable<Boolean> getSupportsSync() {
    return supportsSync;
  }

  public void setSupportsSync(JsonNullable<Boolean> supportsSync) {
    this.supportsSync = supportsSync;
  }

  public BaseItemDto taglines(List<String> taglines) {
    this.taglines = JsonNullable.of(taglines);
    return this;
  }

  public BaseItemDto addTaglinesItem(String taglinesItem) {
    if (this.taglines == null || !this.taglines.isPresent()) {
      this.taglines = JsonNullable.of(new ArrayList<>());
    }
    this.taglines.get().add(taglinesItem);
    return this;
  }

  /**
   * Gets or sets the taglines.
   * @return taglines
  */
  
  @Schema(name = "Taglines", description = "Gets or sets the taglines.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Taglines")
  public JsonNullable<List<String>> getTaglines() {
    return taglines;
  }

  public void setTaglines(JsonNullable<List<String>> taglines) {
    this.taglines = taglines;
  }

  public BaseItemDto tags(List<String> tags) {
    this.tags = JsonNullable.of(tags);
    return this;
  }

  public BaseItemDto addTagsItem(String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.of(new ArrayList<>());
    }
    this.tags.get().add(tagsItem);
    return this;
  }

  /**
   * Gets or sets the tags.
   * @return tags
  */
  
  @Schema(name = "Tags", description = "Gets or sets the tags.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Tags")
  public JsonNullable<List<String>> getTags() {
    return tags;
  }

  public void setTags(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }

  public BaseItemDto timerId(String timerId) {
    this.timerId = JsonNullable.of(timerId);
    return this;
  }

  /**
   * Gets or sets the timer identifier.
   * @return timerId
  */
  
  @Schema(name = "TimerId", description = "Gets or sets the timer identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TimerId")
  public JsonNullable<String> getTimerId() {
    return timerId;
  }

  public void setTimerId(JsonNullable<String> timerId) {
    this.timerId = timerId;
  }

  public BaseItemDto trailerCount(Integer trailerCount) {
    this.trailerCount = JsonNullable.of(trailerCount);
    return this;
  }

  /**
   * Gets or sets the trailer count.
   * @return trailerCount
  */
  
  @Schema(name = "TrailerCount", description = "Gets or sets the trailer count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TrailerCount")
  public JsonNullable<Integer> getTrailerCount() {
    return trailerCount;
  }

  public void setTrailerCount(JsonNullable<Integer> trailerCount) {
    this.trailerCount = trailerCount;
  }

  public BaseItemDto type(String type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Gets or sets the type.
   * @return type
  */
  
  @Schema(name = "Type", description = "Gets or sets the type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public JsonNullable<String> getType() {
    return type;
  }

  public void setType(JsonNullable<String> type) {
    this.type = type;
  }

  public BaseItemDto userData(UserItemDataDto userData) {
    this.userData = userData;
    return this;
  }

  /**
   * Get userData
   * @return userData
  */
  @Valid 
  @Schema(name = "UserData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserData")
  public UserItemDataDto getUserData() {
    return userData;
  }

  public void setUserData(UserItemDataDto userData) {
    this.userData = userData;
  }

  public BaseItemDto video3DFormat(Video3DFormat video3DFormat) {
    this.video3DFormat = video3DFormat;
    return this;
  }

  /**
   * Get video3DFormat
   * @return video3DFormat
  */
  @Valid 
  @Schema(name = "Video3DFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Video3DFormat")
  public Video3DFormat getVideo3DFormat() {
    return video3DFormat;
  }

  public void setVideo3DFormat(Video3DFormat video3DFormat) {
    this.video3DFormat = video3DFormat;
  }

  public BaseItemDto videoType(VideoType videoType) {
    this.videoType = videoType;
    return this;
  }

  /**
   * Get videoType
   * @return videoType
  */
  @Valid 
  @Schema(name = "VideoType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VideoType")
  public VideoType getVideoType() {
    return videoType;
  }

  public void setVideoType(VideoType videoType) {
    this.videoType = videoType;
  }

  public BaseItemDto width(Integer width) {
    this.width = JsonNullable.of(width);
    return this;
  }

  /**
   * Get width
   * @return width
  */
  
  @Schema(name = "Width", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    BaseItemDto baseItemDto = (BaseItemDto) o;
    return equalsNullable(this.airDays, baseItemDto.airDays) &&
        equalsNullable(this.airTime, baseItemDto.airTime) &&
        equalsNullable(this.airsAfterSeasonNumber, baseItemDto.airsAfterSeasonNumber) &&
        equalsNullable(this.airsBeforeEpisodeNumber, baseItemDto.airsBeforeEpisodeNumber) &&
        equalsNullable(this.airsBeforeSeasonNumber, baseItemDto.airsBeforeSeasonNumber) &&
        equalsNullable(this.album, baseItemDto.album) &&
        equalsNullable(this.albumArtist, baseItemDto.albumArtist) &&
        equalsNullable(this.albumArtists, baseItemDto.albumArtists) &&
        equalsNullable(this.albumCount, baseItemDto.albumCount) &&
        equalsNullable(this.albumId, baseItemDto.albumId) &&
        equalsNullable(this.albumPrimaryImageTag, baseItemDto.albumPrimaryImageTag) &&
        equalsNullable(this.altitude, baseItemDto.altitude) &&
        equalsNullable(this.aperture, baseItemDto.aperture) &&
        equalsNullable(this.artistCount, baseItemDto.artistCount) &&
        equalsNullable(this.artistItems, baseItemDto.artistItems) &&
        equalsNullable(this.artists, baseItemDto.artists) &&
        equalsNullable(this.aspectRatio, baseItemDto.aspectRatio) &&
        Objects.equals(this.audio, baseItemDto.audio) &&
        equalsNullable(this.backdropImageTags, baseItemDto.backdropImageTags) &&
        equalsNullable(this.cameraMake, baseItemDto.cameraMake) &&
        equalsNullable(this.cameraModel, baseItemDto.cameraModel) &&
        equalsNullable(this.canDelete, baseItemDto.canDelete) &&
        equalsNullable(this.canDownload, baseItemDto.canDownload) &&
        equalsNullable(this.channelId, baseItemDto.channelId) &&
        equalsNullable(this.channelName, baseItemDto.channelName) &&
        equalsNullable(this.channelNumber, baseItemDto.channelNumber) &&
        equalsNullable(this.channelPrimaryImageTag, baseItemDto.channelPrimaryImageTag) &&
        Objects.equals(this.channelType, baseItemDto.channelType) &&
        equalsNullable(this.chapters, baseItemDto.chapters) &&
        equalsNullable(this.childCount, baseItemDto.childCount) &&
        equalsNullable(this.collectionType, baseItemDto.collectionType) &&
        equalsNullable(this.communityRating, baseItemDto.communityRating) &&
        equalsNullable(this.completionPercentage, baseItemDto.completionPercentage) &&
        equalsNullable(this.container, baseItemDto.container) &&
        equalsNullable(this.criticRating, baseItemDto.criticRating) &&
        equalsNullable(this.cumulativeRunTimeTicks, baseItemDto.cumulativeRunTimeTicks) &&
        Objects.equals(this.currentProgram, baseItemDto.currentProgram) &&
        equalsNullable(this.customRating, baseItemDto.customRating) &&
        equalsNullable(this.dateCreated, baseItemDto.dateCreated) &&
        equalsNullable(this.dateLastMediaAdded, baseItemDto.dateLastMediaAdded) &&
        equalsNullable(this.displayOrder, baseItemDto.displayOrder) &&
        equalsNullable(this.displayPreferencesId, baseItemDto.displayPreferencesId) &&
        equalsNullable(this.enableMediaSourceDisplay, baseItemDto.enableMediaSourceDisplay) &&
        equalsNullable(this.endDate, baseItemDto.endDate) &&
        equalsNullable(this.episodeCount, baseItemDto.episodeCount) &&
        equalsNullable(this.episodeTitle, baseItemDto.episodeTitle) &&
        equalsNullable(this.etag, baseItemDto.etag) &&
        equalsNullable(this.exposureTime, baseItemDto.exposureTime) &&
        equalsNullable(this.externalUrls, baseItemDto.externalUrls) &&
        equalsNullable(this.extraType, baseItemDto.extraType) &&
        equalsNullable(this.focalLength, baseItemDto.focalLength) &&
        equalsNullable(this.forcedSortName, baseItemDto.forcedSortName) &&
        equalsNullable(this.genreItems, baseItemDto.genreItems) &&
        equalsNullable(this.genres, baseItemDto.genres) &&
        equalsNullable(this.hasSubtitles, baseItemDto.hasSubtitles) &&
        equalsNullable(this.height, baseItemDto.height) &&
        Objects.equals(this.id, baseItemDto.id) &&
        equalsNullable(this.imageBlurHashes, baseItemDto.imageBlurHashes) &&
        Objects.equals(this.imageOrientation, baseItemDto.imageOrientation) &&
        equalsNullable(this.imageTags, baseItemDto.imageTags) &&
        equalsNullable(this.indexNumber, baseItemDto.indexNumber) &&
        equalsNullable(this.indexNumberEnd, baseItemDto.indexNumberEnd) &&
        equalsNullable(this.isFolder, baseItemDto.isFolder) &&
        equalsNullable(this.isHD, baseItemDto.isHD) &&
        equalsNullable(this.isKids, baseItemDto.isKids) &&
        equalsNullable(this.isLive, baseItemDto.isLive) &&
        equalsNullable(this.isMovie, baseItemDto.isMovie) &&
        equalsNullable(this.isNews, baseItemDto.isNews) &&
        equalsNullable(this.isPlaceHolder, baseItemDto.isPlaceHolder) &&
        equalsNullable(this.isPremiere, baseItemDto.isPremiere) &&
        equalsNullable(this.isRepeat, baseItemDto.isRepeat) &&
        equalsNullable(this.isSeries, baseItemDto.isSeries) &&
        equalsNullable(this.isSports, baseItemDto.isSports) &&
        equalsNullable(this.isoSpeedRating, baseItemDto.isoSpeedRating) &&
        Objects.equals(this.isoType, baseItemDto.isoType) &&
        equalsNullable(this.latitude, baseItemDto.latitude) &&
        equalsNullable(this.localTrailerCount, baseItemDto.localTrailerCount) &&
        Objects.equals(this.locationType, baseItemDto.locationType) &&
        equalsNullable(this.lockData, baseItemDto.lockData) &&
        equalsNullable(this.lockedFields, baseItemDto.lockedFields) &&
        equalsNullable(this.longitude, baseItemDto.longitude) &&
        equalsNullable(this.mediaSourceCount, baseItemDto.mediaSourceCount) &&
        equalsNullable(this.mediaSources, baseItemDto.mediaSources) &&
        equalsNullable(this.mediaStreams, baseItemDto.mediaStreams) &&
        equalsNullable(this.mediaType, baseItemDto.mediaType) &&
        equalsNullable(this.movieCount, baseItemDto.movieCount) &&
        equalsNullable(this.musicVideoCount, baseItemDto.musicVideoCount) &&
        equalsNullable(this.name, baseItemDto.name) &&
        equalsNullable(this.number, baseItemDto.number) &&
        equalsNullable(this.officialRating, baseItemDto.officialRating) &&
        equalsNullable(this.originalTitle, baseItemDto.originalTitle) &&
        equalsNullable(this.overview, baseItemDto.overview) &&
        equalsNullable(this.parentArtImageTag, baseItemDto.parentArtImageTag) &&
        equalsNullable(this.parentArtItemId, baseItemDto.parentArtItemId) &&
        equalsNullable(this.parentBackdropImageTags, baseItemDto.parentBackdropImageTags) &&
        equalsNullable(this.parentBackdropItemId, baseItemDto.parentBackdropItemId) &&
        equalsNullable(this.parentId, baseItemDto.parentId) &&
        equalsNullable(this.parentIndexNumber, baseItemDto.parentIndexNumber) &&
        equalsNullable(this.parentLogoImageTag, baseItemDto.parentLogoImageTag) &&
        equalsNullable(this.parentLogoItemId, baseItemDto.parentLogoItemId) &&
        equalsNullable(this.parentPrimaryImageItemId, baseItemDto.parentPrimaryImageItemId) &&
        equalsNullable(this.parentPrimaryImageTag, baseItemDto.parentPrimaryImageTag) &&
        equalsNullable(this.parentThumbImageTag, baseItemDto.parentThumbImageTag) &&
        equalsNullable(this.parentThumbItemId, baseItemDto.parentThumbItemId) &&
        equalsNullable(this.partCount, baseItemDto.partCount) &&
        equalsNullable(this.path, baseItemDto.path) &&
        equalsNullable(this.people, baseItemDto.people) &&
        Objects.equals(this.playAccess, baseItemDto.playAccess) &&
        equalsNullable(this.playlistItemId, baseItemDto.playlistItemId) &&
        equalsNullable(this.preferredMetadataCountryCode, baseItemDto.preferredMetadataCountryCode) &&
        equalsNullable(this.preferredMetadataLanguage, baseItemDto.preferredMetadataLanguage) &&
        equalsNullable(this.premiereDate, baseItemDto.premiereDate) &&
        equalsNullable(this.primaryImageAspectRatio, baseItemDto.primaryImageAspectRatio) &&
        equalsNullable(this.productionLocations, baseItemDto.productionLocations) &&
        equalsNullable(this.productionYear, baseItemDto.productionYear) &&
        equalsNullable(this.programCount, baseItemDto.programCount) &&
        equalsNullable(this.programId, baseItemDto.programId) &&
        equalsNullable(this.providerIds, baseItemDto.providerIds) &&
        equalsNullable(this.recursiveItemCount, baseItemDto.recursiveItemCount) &&
        equalsNullable(this.remoteTrailers, baseItemDto.remoteTrailers) &&
        equalsNullable(this.runTimeTicks, baseItemDto.runTimeTicks) &&
        equalsNullable(this.screenshotImageTags, baseItemDto.screenshotImageTags) &&
        equalsNullable(this.seasonId, baseItemDto.seasonId) &&
        equalsNullable(this.seasonName, baseItemDto.seasonName) &&
        equalsNullable(this.seriesCount, baseItemDto.seriesCount) &&
        equalsNullable(this.seriesId, baseItemDto.seriesId) &&
        equalsNullable(this.seriesName, baseItemDto.seriesName) &&
        equalsNullable(this.seriesPrimaryImageTag, baseItemDto.seriesPrimaryImageTag) &&
        equalsNullable(this.seriesStudio, baseItemDto.seriesStudio) &&
        equalsNullable(this.seriesThumbImageTag, baseItemDto.seriesThumbImageTag) &&
        equalsNullable(this.seriesTimerId, baseItemDto.seriesTimerId) &&
        equalsNullable(this.serverId, baseItemDto.serverId) &&
        equalsNullable(this.shutterSpeed, baseItemDto.shutterSpeed) &&
        equalsNullable(this.software, baseItemDto.software) &&
        equalsNullable(this.songCount, baseItemDto.songCount) &&
        equalsNullable(this.sortName, baseItemDto.sortName) &&
        equalsNullable(this.sourceType, baseItemDto.sourceType) &&
        equalsNullable(this.specialFeatureCount, baseItemDto.specialFeatureCount) &&
        equalsNullable(this.startDate, baseItemDto.startDate) &&
        equalsNullable(this.status, baseItemDto.status) &&
        equalsNullable(this.studios, baseItemDto.studios) &&
        equalsNullable(this.supportsSync, baseItemDto.supportsSync) &&
        equalsNullable(this.taglines, baseItemDto.taglines) &&
        equalsNullable(this.tags, baseItemDto.tags) &&
        equalsNullable(this.timerId, baseItemDto.timerId) &&
        equalsNullable(this.trailerCount, baseItemDto.trailerCount) &&
        equalsNullable(this.type, baseItemDto.type) &&
        Objects.equals(this.userData, baseItemDto.userData) &&
        Objects.equals(this.video3DFormat, baseItemDto.video3DFormat) &&
        Objects.equals(this.videoType, baseItemDto.videoType) &&
        equalsNullable(this.width, baseItemDto.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(airDays), hashCodeNullable(airTime), hashCodeNullable(airsAfterSeasonNumber), hashCodeNullable(airsBeforeEpisodeNumber), hashCodeNullable(airsBeforeSeasonNumber), hashCodeNullable(album), hashCodeNullable(albumArtist), hashCodeNullable(albumArtists), hashCodeNullable(albumCount), hashCodeNullable(albumId), hashCodeNullable(albumPrimaryImageTag), hashCodeNullable(altitude), hashCodeNullable(aperture), hashCodeNullable(artistCount), hashCodeNullable(artistItems), hashCodeNullable(artists), hashCodeNullable(aspectRatio), audio, hashCodeNullable(backdropImageTags), hashCodeNullable(cameraMake), hashCodeNullable(cameraModel), hashCodeNullable(canDelete), hashCodeNullable(canDownload), hashCodeNullable(channelId), hashCodeNullable(channelName), hashCodeNullable(channelNumber), hashCodeNullable(channelPrimaryImageTag), channelType, hashCodeNullable(chapters), hashCodeNullable(childCount), hashCodeNullable(collectionType), hashCodeNullable(communityRating), hashCodeNullable(completionPercentage), hashCodeNullable(container), hashCodeNullable(criticRating), hashCodeNullable(cumulativeRunTimeTicks), currentProgram, hashCodeNullable(customRating), hashCodeNullable(dateCreated), hashCodeNullable(dateLastMediaAdded), hashCodeNullable(displayOrder), hashCodeNullable(displayPreferencesId), hashCodeNullable(enableMediaSourceDisplay), hashCodeNullable(endDate), hashCodeNullable(episodeCount), hashCodeNullable(episodeTitle), hashCodeNullable(etag), hashCodeNullable(exposureTime), hashCodeNullable(externalUrls), hashCodeNullable(extraType), hashCodeNullable(focalLength), hashCodeNullable(forcedSortName), hashCodeNullable(genreItems), hashCodeNullable(genres), hashCodeNullable(hasSubtitles), hashCodeNullable(height), id, hashCodeNullable(imageBlurHashes), imageOrientation, hashCodeNullable(imageTags), hashCodeNullable(indexNumber), hashCodeNullable(indexNumberEnd), hashCodeNullable(isFolder), hashCodeNullable(isHD), hashCodeNullable(isKids), hashCodeNullable(isLive), hashCodeNullable(isMovie), hashCodeNullable(isNews), hashCodeNullable(isPlaceHolder), hashCodeNullable(isPremiere), hashCodeNullable(isRepeat), hashCodeNullable(isSeries), hashCodeNullable(isSports), hashCodeNullable(isoSpeedRating), isoType, hashCodeNullable(latitude), hashCodeNullable(localTrailerCount), locationType, hashCodeNullable(lockData), hashCodeNullable(lockedFields), hashCodeNullable(longitude), hashCodeNullable(mediaSourceCount), hashCodeNullable(mediaSources), hashCodeNullable(mediaStreams), hashCodeNullable(mediaType), hashCodeNullable(movieCount), hashCodeNullable(musicVideoCount), hashCodeNullable(name), hashCodeNullable(number), hashCodeNullable(officialRating), hashCodeNullable(originalTitle), hashCodeNullable(overview), hashCodeNullable(parentArtImageTag), hashCodeNullable(parentArtItemId), hashCodeNullable(parentBackdropImageTags), hashCodeNullable(parentBackdropItemId), hashCodeNullable(parentId), hashCodeNullable(parentIndexNumber), hashCodeNullable(parentLogoImageTag), hashCodeNullable(parentLogoItemId), hashCodeNullable(parentPrimaryImageItemId), hashCodeNullable(parentPrimaryImageTag), hashCodeNullable(parentThumbImageTag), hashCodeNullable(parentThumbItemId), hashCodeNullable(partCount), hashCodeNullable(path), hashCodeNullable(people), playAccess, hashCodeNullable(playlistItemId), hashCodeNullable(preferredMetadataCountryCode), hashCodeNullable(preferredMetadataLanguage), hashCodeNullable(premiereDate), hashCodeNullable(primaryImageAspectRatio), hashCodeNullable(productionLocations), hashCodeNullable(productionYear), hashCodeNullable(programCount), hashCodeNullable(programId), hashCodeNullable(providerIds), hashCodeNullable(recursiveItemCount), hashCodeNullable(remoteTrailers), hashCodeNullable(runTimeTicks), hashCodeNullable(screenshotImageTags), hashCodeNullable(seasonId), hashCodeNullable(seasonName), hashCodeNullable(seriesCount), hashCodeNullable(seriesId), hashCodeNullable(seriesName), hashCodeNullable(seriesPrimaryImageTag), hashCodeNullable(seriesStudio), hashCodeNullable(seriesThumbImageTag), hashCodeNullable(seriesTimerId), hashCodeNullable(serverId), hashCodeNullable(shutterSpeed), hashCodeNullable(software), hashCodeNullable(songCount), hashCodeNullable(sortName), hashCodeNullable(sourceType), hashCodeNullable(specialFeatureCount), hashCodeNullable(startDate), hashCodeNullable(status), hashCodeNullable(studios), hashCodeNullable(supportsSync), hashCodeNullable(taglines), hashCodeNullable(tags), hashCodeNullable(timerId), hashCodeNullable(trailerCount), hashCodeNullable(type), userData, video3DFormat, videoType, hashCodeNullable(width));
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
    sb.append("class BaseItemDto {\n");
    sb.append("    airDays: ").append(toIndentedString(airDays)).append("\n");
    sb.append("    airTime: ").append(toIndentedString(airTime)).append("\n");
    sb.append("    airsAfterSeasonNumber: ").append(toIndentedString(airsAfterSeasonNumber)).append("\n");
    sb.append("    airsBeforeEpisodeNumber: ").append(toIndentedString(airsBeforeEpisodeNumber)).append("\n");
    sb.append("    airsBeforeSeasonNumber: ").append(toIndentedString(airsBeforeSeasonNumber)).append("\n");
    sb.append("    album: ").append(toIndentedString(album)).append("\n");
    sb.append("    albumArtist: ").append(toIndentedString(albumArtist)).append("\n");
    sb.append("    albumArtists: ").append(toIndentedString(albumArtists)).append("\n");
    sb.append("    albumCount: ").append(toIndentedString(albumCount)).append("\n");
    sb.append("    albumId: ").append(toIndentedString(albumId)).append("\n");
    sb.append("    albumPrimaryImageTag: ").append(toIndentedString(albumPrimaryImageTag)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    aperture: ").append(toIndentedString(aperture)).append("\n");
    sb.append("    artistCount: ").append(toIndentedString(artistCount)).append("\n");
    sb.append("    artistItems: ").append(toIndentedString(artistItems)).append("\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    backdropImageTags: ").append(toIndentedString(backdropImageTags)).append("\n");
    sb.append("    cameraMake: ").append(toIndentedString(cameraMake)).append("\n");
    sb.append("    cameraModel: ").append(toIndentedString(cameraModel)).append("\n");
    sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
    sb.append("    canDownload: ").append(toIndentedString(canDownload)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    channelNumber: ").append(toIndentedString(channelNumber)).append("\n");
    sb.append("    channelPrimaryImageTag: ").append(toIndentedString(channelPrimaryImageTag)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    chapters: ").append(toIndentedString(chapters)).append("\n");
    sb.append("    childCount: ").append(toIndentedString(childCount)).append("\n");
    sb.append("    collectionType: ").append(toIndentedString(collectionType)).append("\n");
    sb.append("    communityRating: ").append(toIndentedString(communityRating)).append("\n");
    sb.append("    completionPercentage: ").append(toIndentedString(completionPercentage)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    criticRating: ").append(toIndentedString(criticRating)).append("\n");
    sb.append("    cumulativeRunTimeTicks: ").append(toIndentedString(cumulativeRunTimeTicks)).append("\n");
    sb.append("    currentProgram: ").append(toIndentedString(currentProgram)).append("\n");
    sb.append("    customRating: ").append(toIndentedString(customRating)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateLastMediaAdded: ").append(toIndentedString(dateLastMediaAdded)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    displayPreferencesId: ").append(toIndentedString(displayPreferencesId)).append("\n");
    sb.append("    enableMediaSourceDisplay: ").append(toIndentedString(enableMediaSourceDisplay)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    episodeCount: ").append(toIndentedString(episodeCount)).append("\n");
    sb.append("    episodeTitle: ").append(toIndentedString(episodeTitle)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    exposureTime: ").append(toIndentedString(exposureTime)).append("\n");
    sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
    sb.append("    extraType: ").append(toIndentedString(extraType)).append("\n");
    sb.append("    focalLength: ").append(toIndentedString(focalLength)).append("\n");
    sb.append("    forcedSortName: ").append(toIndentedString(forcedSortName)).append("\n");
    sb.append("    genreItems: ").append(toIndentedString(genreItems)).append("\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    hasSubtitles: ").append(toIndentedString(hasSubtitles)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageBlurHashes: ").append(toIndentedString(imageBlurHashes)).append("\n");
    sb.append("    imageOrientation: ").append(toIndentedString(imageOrientation)).append("\n");
    sb.append("    imageTags: ").append(toIndentedString(imageTags)).append("\n");
    sb.append("    indexNumber: ").append(toIndentedString(indexNumber)).append("\n");
    sb.append("    indexNumberEnd: ").append(toIndentedString(indexNumberEnd)).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
    sb.append("    isHD: ").append(toIndentedString(isHD)).append("\n");
    sb.append("    isKids: ").append(toIndentedString(isKids)).append("\n");
    sb.append("    isLive: ").append(toIndentedString(isLive)).append("\n");
    sb.append("    isMovie: ").append(toIndentedString(isMovie)).append("\n");
    sb.append("    isNews: ").append(toIndentedString(isNews)).append("\n");
    sb.append("    isPlaceHolder: ").append(toIndentedString(isPlaceHolder)).append("\n");
    sb.append("    isPremiere: ").append(toIndentedString(isPremiere)).append("\n");
    sb.append("    isRepeat: ").append(toIndentedString(isRepeat)).append("\n");
    sb.append("    isSeries: ").append(toIndentedString(isSeries)).append("\n");
    sb.append("    isSports: ").append(toIndentedString(isSports)).append("\n");
    sb.append("    isoSpeedRating: ").append(toIndentedString(isoSpeedRating)).append("\n");
    sb.append("    isoType: ").append(toIndentedString(isoType)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    localTrailerCount: ").append(toIndentedString(localTrailerCount)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    lockData: ").append(toIndentedString(lockData)).append("\n");
    sb.append("    lockedFields: ").append(toIndentedString(lockedFields)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    mediaSourceCount: ").append(toIndentedString(mediaSourceCount)).append("\n");
    sb.append("    mediaSources: ").append(toIndentedString(mediaSources)).append("\n");
    sb.append("    mediaStreams: ").append(toIndentedString(mediaStreams)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    movieCount: ").append(toIndentedString(movieCount)).append("\n");
    sb.append("    musicVideoCount: ").append(toIndentedString(musicVideoCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    officialRating: ").append(toIndentedString(officialRating)).append("\n");
    sb.append("    originalTitle: ").append(toIndentedString(originalTitle)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    parentArtImageTag: ").append(toIndentedString(parentArtImageTag)).append("\n");
    sb.append("    parentArtItemId: ").append(toIndentedString(parentArtItemId)).append("\n");
    sb.append("    parentBackdropImageTags: ").append(toIndentedString(parentBackdropImageTags)).append("\n");
    sb.append("    parentBackdropItemId: ").append(toIndentedString(parentBackdropItemId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentIndexNumber: ").append(toIndentedString(parentIndexNumber)).append("\n");
    sb.append("    parentLogoImageTag: ").append(toIndentedString(parentLogoImageTag)).append("\n");
    sb.append("    parentLogoItemId: ").append(toIndentedString(parentLogoItemId)).append("\n");
    sb.append("    parentPrimaryImageItemId: ").append(toIndentedString(parentPrimaryImageItemId)).append("\n");
    sb.append("    parentPrimaryImageTag: ").append(toIndentedString(parentPrimaryImageTag)).append("\n");
    sb.append("    parentThumbImageTag: ").append(toIndentedString(parentThumbImageTag)).append("\n");
    sb.append("    parentThumbItemId: ").append(toIndentedString(parentThumbItemId)).append("\n");
    sb.append("    partCount: ").append(toIndentedString(partCount)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    people: ").append(toIndentedString(people)).append("\n");
    sb.append("    playAccess: ").append(toIndentedString(playAccess)).append("\n");
    sb.append("    playlistItemId: ").append(toIndentedString(playlistItemId)).append("\n");
    sb.append("    preferredMetadataCountryCode: ").append(toIndentedString(preferredMetadataCountryCode)).append("\n");
    sb.append("    preferredMetadataLanguage: ").append(toIndentedString(preferredMetadataLanguage)).append("\n");
    sb.append("    premiereDate: ").append(toIndentedString(premiereDate)).append("\n");
    sb.append("    primaryImageAspectRatio: ").append(toIndentedString(primaryImageAspectRatio)).append("\n");
    sb.append("    productionLocations: ").append(toIndentedString(productionLocations)).append("\n");
    sb.append("    productionYear: ").append(toIndentedString(productionYear)).append("\n");
    sb.append("    programCount: ").append(toIndentedString(programCount)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    providerIds: ").append(toIndentedString(providerIds)).append("\n");
    sb.append("    recursiveItemCount: ").append(toIndentedString(recursiveItemCount)).append("\n");
    sb.append("    remoteTrailers: ").append(toIndentedString(remoteTrailers)).append("\n");
    sb.append("    runTimeTicks: ").append(toIndentedString(runTimeTicks)).append("\n");
    sb.append("    screenshotImageTags: ").append(toIndentedString(screenshotImageTags)).append("\n");
    sb.append("    seasonId: ").append(toIndentedString(seasonId)).append("\n");
    sb.append("    seasonName: ").append(toIndentedString(seasonName)).append("\n");
    sb.append("    seriesCount: ").append(toIndentedString(seriesCount)).append("\n");
    sb.append("    seriesId: ").append(toIndentedString(seriesId)).append("\n");
    sb.append("    seriesName: ").append(toIndentedString(seriesName)).append("\n");
    sb.append("    seriesPrimaryImageTag: ").append(toIndentedString(seriesPrimaryImageTag)).append("\n");
    sb.append("    seriesStudio: ").append(toIndentedString(seriesStudio)).append("\n");
    sb.append("    seriesThumbImageTag: ").append(toIndentedString(seriesThumbImageTag)).append("\n");
    sb.append("    seriesTimerId: ").append(toIndentedString(seriesTimerId)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    shutterSpeed: ").append(toIndentedString(shutterSpeed)).append("\n");
    sb.append("    software: ").append(toIndentedString(software)).append("\n");
    sb.append("    songCount: ").append(toIndentedString(songCount)).append("\n");
    sb.append("    sortName: ").append(toIndentedString(sortName)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    specialFeatureCount: ").append(toIndentedString(specialFeatureCount)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    studios: ").append(toIndentedString(studios)).append("\n");
    sb.append("    supportsSync: ").append(toIndentedString(supportsSync)).append("\n");
    sb.append("    taglines: ").append(toIndentedString(taglines)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timerId: ").append(toIndentedString(timerId)).append("\n");
    sb.append("    trailerCount: ").append(toIndentedString(trailerCount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    video3DFormat: ").append(toIndentedString(video3DFormat)).append("\n");
    sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
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

