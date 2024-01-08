package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MediaPathInfo;
import org.openapitools.model.TypeOptions;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LibraryOptions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class LibraryOptions {

  private Integer automaticRefreshIntervalDays;

  @Valid
  private JsonNullable<List<String>> disabledLocalMetadataReaders = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> disabledSubtitleFetchers = JsonNullable.<List<String>>undefined();

  private Boolean enableAutomaticSeriesGrouping;

  private Boolean enableChapterImageExtraction;

  private Boolean enableEmbeddedEpisodeInfos;

  private Boolean enableEmbeddedTitles;

  private Boolean enableInternetProviders;

  private Boolean enablePhotos;

  private Boolean enableRealtimeMonitor;

  private Boolean extractChapterImagesDuringLibraryScan;

  @Valid
  private JsonNullable<List<String>> localMetadataReaderOrder = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> metadataCountryCode = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> metadataSavers = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<@Valid MediaPathInfo>> pathInfos = JsonNullable.<List<@Valid MediaPathInfo>>undefined();

  private JsonNullable<String> preferredMetadataLanguage = JsonNullable.<String>undefined();

  private Boolean requirePerfectSubtitleMatch;

  private Boolean saveLocalMetadata;

  private Boolean saveSubtitlesWithMedia;

  private JsonNullable<String> seasonZeroDisplayName = JsonNullable.<String>undefined();

  private Boolean skipSubtitlesIfAudioTrackMatches;

  private Boolean skipSubtitlesIfEmbeddedSubtitlesPresent;

  @Valid
  private JsonNullable<List<String>> subtitleDownloadLanguages = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> subtitleFetcherOrder = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<@Valid TypeOptions>> typeOptions = JsonNullable.<List<@Valid TypeOptions>>undefined();

  public LibraryOptions automaticRefreshIntervalDays(Integer automaticRefreshIntervalDays) {
    this.automaticRefreshIntervalDays = automaticRefreshIntervalDays;
    return this;
  }

  /**
   * Get automaticRefreshIntervalDays
   * @return automaticRefreshIntervalDays
  */
  
  @Schema(name = "AutomaticRefreshIntervalDays", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AutomaticRefreshIntervalDays")
  public Integer getAutomaticRefreshIntervalDays() {
    return automaticRefreshIntervalDays;
  }

  public void setAutomaticRefreshIntervalDays(Integer automaticRefreshIntervalDays) {
    this.automaticRefreshIntervalDays = automaticRefreshIntervalDays;
  }

  public LibraryOptions disabledLocalMetadataReaders(List<String> disabledLocalMetadataReaders) {
    this.disabledLocalMetadataReaders = JsonNullable.of(disabledLocalMetadataReaders);
    return this;
  }

  public LibraryOptions addDisabledLocalMetadataReadersItem(String disabledLocalMetadataReadersItem) {
    if (this.disabledLocalMetadataReaders == null || !this.disabledLocalMetadataReaders.isPresent()) {
      this.disabledLocalMetadataReaders = JsonNullable.of(new ArrayList<>());
    }
    this.disabledLocalMetadataReaders.get().add(disabledLocalMetadataReadersItem);
    return this;
  }

  /**
   * Get disabledLocalMetadataReaders
   * @return disabledLocalMetadataReaders
  */
  
  @Schema(name = "DisabledLocalMetadataReaders", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DisabledLocalMetadataReaders")
  public JsonNullable<List<String>> getDisabledLocalMetadataReaders() {
    return disabledLocalMetadataReaders;
  }

  public void setDisabledLocalMetadataReaders(JsonNullable<List<String>> disabledLocalMetadataReaders) {
    this.disabledLocalMetadataReaders = disabledLocalMetadataReaders;
  }

  public LibraryOptions disabledSubtitleFetchers(List<String> disabledSubtitleFetchers) {
    this.disabledSubtitleFetchers = JsonNullable.of(disabledSubtitleFetchers);
    return this;
  }

  public LibraryOptions addDisabledSubtitleFetchersItem(String disabledSubtitleFetchersItem) {
    if (this.disabledSubtitleFetchers == null || !this.disabledSubtitleFetchers.isPresent()) {
      this.disabledSubtitleFetchers = JsonNullable.of(new ArrayList<>());
    }
    this.disabledSubtitleFetchers.get().add(disabledSubtitleFetchersItem);
    return this;
  }

  /**
   * Get disabledSubtitleFetchers
   * @return disabledSubtitleFetchers
  */
  
  @Schema(name = "DisabledSubtitleFetchers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DisabledSubtitleFetchers")
  public JsonNullable<List<String>> getDisabledSubtitleFetchers() {
    return disabledSubtitleFetchers;
  }

  public void setDisabledSubtitleFetchers(JsonNullable<List<String>> disabledSubtitleFetchers) {
    this.disabledSubtitleFetchers = disabledSubtitleFetchers;
  }

  public LibraryOptions enableAutomaticSeriesGrouping(Boolean enableAutomaticSeriesGrouping) {
    this.enableAutomaticSeriesGrouping = enableAutomaticSeriesGrouping;
    return this;
  }

  /**
   * Get enableAutomaticSeriesGrouping
   * @return enableAutomaticSeriesGrouping
  */
  
  @Schema(name = "EnableAutomaticSeriesGrouping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableAutomaticSeriesGrouping")
  public Boolean getEnableAutomaticSeriesGrouping() {
    return enableAutomaticSeriesGrouping;
  }

  public void setEnableAutomaticSeriesGrouping(Boolean enableAutomaticSeriesGrouping) {
    this.enableAutomaticSeriesGrouping = enableAutomaticSeriesGrouping;
  }

  public LibraryOptions enableChapterImageExtraction(Boolean enableChapterImageExtraction) {
    this.enableChapterImageExtraction = enableChapterImageExtraction;
    return this;
  }

  /**
   * Get enableChapterImageExtraction
   * @return enableChapterImageExtraction
  */
  
  @Schema(name = "EnableChapterImageExtraction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableChapterImageExtraction")
  public Boolean getEnableChapterImageExtraction() {
    return enableChapterImageExtraction;
  }

  public void setEnableChapterImageExtraction(Boolean enableChapterImageExtraction) {
    this.enableChapterImageExtraction = enableChapterImageExtraction;
  }

  public LibraryOptions enableEmbeddedEpisodeInfos(Boolean enableEmbeddedEpisodeInfos) {
    this.enableEmbeddedEpisodeInfos = enableEmbeddedEpisodeInfos;
    return this;
  }

  /**
   * Get enableEmbeddedEpisodeInfos
   * @return enableEmbeddedEpisodeInfos
  */
  
  @Schema(name = "EnableEmbeddedEpisodeInfos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableEmbeddedEpisodeInfos")
  public Boolean getEnableEmbeddedEpisodeInfos() {
    return enableEmbeddedEpisodeInfos;
  }

  public void setEnableEmbeddedEpisodeInfos(Boolean enableEmbeddedEpisodeInfos) {
    this.enableEmbeddedEpisodeInfos = enableEmbeddedEpisodeInfos;
  }

  public LibraryOptions enableEmbeddedTitles(Boolean enableEmbeddedTitles) {
    this.enableEmbeddedTitles = enableEmbeddedTitles;
    return this;
  }

  /**
   * Get enableEmbeddedTitles
   * @return enableEmbeddedTitles
  */
  
  @Schema(name = "EnableEmbeddedTitles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableEmbeddedTitles")
  public Boolean getEnableEmbeddedTitles() {
    return enableEmbeddedTitles;
  }

  public void setEnableEmbeddedTitles(Boolean enableEmbeddedTitles) {
    this.enableEmbeddedTitles = enableEmbeddedTitles;
  }

  public LibraryOptions enableInternetProviders(Boolean enableInternetProviders) {
    this.enableInternetProviders = enableInternetProviders;
    return this;
  }

  /**
   * Get enableInternetProviders
   * @return enableInternetProviders
  */
  
  @Schema(name = "EnableInternetProviders", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableInternetProviders")
  public Boolean getEnableInternetProviders() {
    return enableInternetProviders;
  }

  public void setEnableInternetProviders(Boolean enableInternetProviders) {
    this.enableInternetProviders = enableInternetProviders;
  }

  public LibraryOptions enablePhotos(Boolean enablePhotos) {
    this.enablePhotos = enablePhotos;
    return this;
  }

  /**
   * Get enablePhotos
   * @return enablePhotos
  */
  
  @Schema(name = "EnablePhotos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnablePhotos")
  public Boolean getEnablePhotos() {
    return enablePhotos;
  }

  public void setEnablePhotos(Boolean enablePhotos) {
    this.enablePhotos = enablePhotos;
  }

  public LibraryOptions enableRealtimeMonitor(Boolean enableRealtimeMonitor) {
    this.enableRealtimeMonitor = enableRealtimeMonitor;
    return this;
  }

  /**
   * Get enableRealtimeMonitor
   * @return enableRealtimeMonitor
  */
  
  @Schema(name = "EnableRealtimeMonitor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableRealtimeMonitor")
  public Boolean getEnableRealtimeMonitor() {
    return enableRealtimeMonitor;
  }

  public void setEnableRealtimeMonitor(Boolean enableRealtimeMonitor) {
    this.enableRealtimeMonitor = enableRealtimeMonitor;
  }

  public LibraryOptions extractChapterImagesDuringLibraryScan(Boolean extractChapterImagesDuringLibraryScan) {
    this.extractChapterImagesDuringLibraryScan = extractChapterImagesDuringLibraryScan;
    return this;
  }

  /**
   * Get extractChapterImagesDuringLibraryScan
   * @return extractChapterImagesDuringLibraryScan
  */
  
  @Schema(name = "ExtractChapterImagesDuringLibraryScan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExtractChapterImagesDuringLibraryScan")
  public Boolean getExtractChapterImagesDuringLibraryScan() {
    return extractChapterImagesDuringLibraryScan;
  }

  public void setExtractChapterImagesDuringLibraryScan(Boolean extractChapterImagesDuringLibraryScan) {
    this.extractChapterImagesDuringLibraryScan = extractChapterImagesDuringLibraryScan;
  }

  public LibraryOptions localMetadataReaderOrder(List<String> localMetadataReaderOrder) {
    this.localMetadataReaderOrder = JsonNullable.of(localMetadataReaderOrder);
    return this;
  }

  public LibraryOptions addLocalMetadataReaderOrderItem(String localMetadataReaderOrderItem) {
    if (this.localMetadataReaderOrder == null || !this.localMetadataReaderOrder.isPresent()) {
      this.localMetadataReaderOrder = JsonNullable.of(new ArrayList<>());
    }
    this.localMetadataReaderOrder.get().add(localMetadataReaderOrderItem);
    return this;
  }

  /**
   * Get localMetadataReaderOrder
   * @return localMetadataReaderOrder
  */
  
  @Schema(name = "LocalMetadataReaderOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LocalMetadataReaderOrder")
  public JsonNullable<List<String>> getLocalMetadataReaderOrder() {
    return localMetadataReaderOrder;
  }

  public void setLocalMetadataReaderOrder(JsonNullable<List<String>> localMetadataReaderOrder) {
    this.localMetadataReaderOrder = localMetadataReaderOrder;
  }

  public LibraryOptions metadataCountryCode(String metadataCountryCode) {
    this.metadataCountryCode = JsonNullable.of(metadataCountryCode);
    return this;
  }

  /**
   * Gets or sets the metadata country code.
   * @return metadataCountryCode
  */
  
  @Schema(name = "MetadataCountryCode", description = "Gets or sets the metadata country code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MetadataCountryCode")
  public JsonNullable<String> getMetadataCountryCode() {
    return metadataCountryCode;
  }

  public void setMetadataCountryCode(JsonNullable<String> metadataCountryCode) {
    this.metadataCountryCode = metadataCountryCode;
  }

  public LibraryOptions metadataSavers(List<String> metadataSavers) {
    this.metadataSavers = JsonNullable.of(metadataSavers);
    return this;
  }

  public LibraryOptions addMetadataSaversItem(String metadataSaversItem) {
    if (this.metadataSavers == null || !this.metadataSavers.isPresent()) {
      this.metadataSavers = JsonNullable.of(new ArrayList<>());
    }
    this.metadataSavers.get().add(metadataSaversItem);
    return this;
  }

  /**
   * Get metadataSavers
   * @return metadataSavers
  */
  
  @Schema(name = "MetadataSavers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MetadataSavers")
  public JsonNullable<List<String>> getMetadataSavers() {
    return metadataSavers;
  }

  public void setMetadataSavers(JsonNullable<List<String>> metadataSavers) {
    this.metadataSavers = metadataSavers;
  }

  public LibraryOptions pathInfos(List<@Valid MediaPathInfo> pathInfos) {
    this.pathInfos = JsonNullable.of(pathInfos);
    return this;
  }

  public LibraryOptions addPathInfosItem(MediaPathInfo pathInfosItem) {
    if (this.pathInfos == null || !this.pathInfos.isPresent()) {
      this.pathInfos = JsonNullable.of(new ArrayList<>());
    }
    this.pathInfos.get().add(pathInfosItem);
    return this;
  }

  /**
   * Get pathInfos
   * @return pathInfos
  */
  @Valid 
  @Schema(name = "PathInfos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PathInfos")
  public JsonNullable<List<@Valid MediaPathInfo>> getPathInfos() {
    return pathInfos;
  }

  public void setPathInfos(JsonNullable<List<@Valid MediaPathInfo>> pathInfos) {
    this.pathInfos = pathInfos;
  }

  public LibraryOptions preferredMetadataLanguage(String preferredMetadataLanguage) {
    this.preferredMetadataLanguage = JsonNullable.of(preferredMetadataLanguage);
    return this;
  }

  /**
   * Gets or sets the preferred metadata language.
   * @return preferredMetadataLanguage
  */
  
  @Schema(name = "PreferredMetadataLanguage", description = "Gets or sets the preferred metadata language.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PreferredMetadataLanguage")
  public JsonNullable<String> getPreferredMetadataLanguage() {
    return preferredMetadataLanguage;
  }

  public void setPreferredMetadataLanguage(JsonNullable<String> preferredMetadataLanguage) {
    this.preferredMetadataLanguage = preferredMetadataLanguage;
  }

  public LibraryOptions requirePerfectSubtitleMatch(Boolean requirePerfectSubtitleMatch) {
    this.requirePerfectSubtitleMatch = requirePerfectSubtitleMatch;
    return this;
  }

  /**
   * Get requirePerfectSubtitleMatch
   * @return requirePerfectSubtitleMatch
  */
  
  @Schema(name = "RequirePerfectSubtitleMatch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RequirePerfectSubtitleMatch")
  public Boolean getRequirePerfectSubtitleMatch() {
    return requirePerfectSubtitleMatch;
  }

  public void setRequirePerfectSubtitleMatch(Boolean requirePerfectSubtitleMatch) {
    this.requirePerfectSubtitleMatch = requirePerfectSubtitleMatch;
  }

  public LibraryOptions saveLocalMetadata(Boolean saveLocalMetadata) {
    this.saveLocalMetadata = saveLocalMetadata;
    return this;
  }

  /**
   * Get saveLocalMetadata
   * @return saveLocalMetadata
  */
  
  @Schema(name = "SaveLocalMetadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SaveLocalMetadata")
  public Boolean getSaveLocalMetadata() {
    return saveLocalMetadata;
  }

  public void setSaveLocalMetadata(Boolean saveLocalMetadata) {
    this.saveLocalMetadata = saveLocalMetadata;
  }

  public LibraryOptions saveSubtitlesWithMedia(Boolean saveSubtitlesWithMedia) {
    this.saveSubtitlesWithMedia = saveSubtitlesWithMedia;
    return this;
  }

  /**
   * Get saveSubtitlesWithMedia
   * @return saveSubtitlesWithMedia
  */
  
  @Schema(name = "SaveSubtitlesWithMedia", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SaveSubtitlesWithMedia")
  public Boolean getSaveSubtitlesWithMedia() {
    return saveSubtitlesWithMedia;
  }

  public void setSaveSubtitlesWithMedia(Boolean saveSubtitlesWithMedia) {
    this.saveSubtitlesWithMedia = saveSubtitlesWithMedia;
  }

  public LibraryOptions seasonZeroDisplayName(String seasonZeroDisplayName) {
    this.seasonZeroDisplayName = JsonNullable.of(seasonZeroDisplayName);
    return this;
  }

  /**
   * Get seasonZeroDisplayName
   * @return seasonZeroDisplayName
  */
  
  @Schema(name = "SeasonZeroDisplayName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SeasonZeroDisplayName")
  public JsonNullable<String> getSeasonZeroDisplayName() {
    return seasonZeroDisplayName;
  }

  public void setSeasonZeroDisplayName(JsonNullable<String> seasonZeroDisplayName) {
    this.seasonZeroDisplayName = seasonZeroDisplayName;
  }

  public LibraryOptions skipSubtitlesIfAudioTrackMatches(Boolean skipSubtitlesIfAudioTrackMatches) {
    this.skipSubtitlesIfAudioTrackMatches = skipSubtitlesIfAudioTrackMatches;
    return this;
  }

  /**
   * Get skipSubtitlesIfAudioTrackMatches
   * @return skipSubtitlesIfAudioTrackMatches
  */
  
  @Schema(name = "SkipSubtitlesIfAudioTrackMatches", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SkipSubtitlesIfAudioTrackMatches")
  public Boolean getSkipSubtitlesIfAudioTrackMatches() {
    return skipSubtitlesIfAudioTrackMatches;
  }

  public void setSkipSubtitlesIfAudioTrackMatches(Boolean skipSubtitlesIfAudioTrackMatches) {
    this.skipSubtitlesIfAudioTrackMatches = skipSubtitlesIfAudioTrackMatches;
  }

  public LibraryOptions skipSubtitlesIfEmbeddedSubtitlesPresent(Boolean skipSubtitlesIfEmbeddedSubtitlesPresent) {
    this.skipSubtitlesIfEmbeddedSubtitlesPresent = skipSubtitlesIfEmbeddedSubtitlesPresent;
    return this;
  }

  /**
   * Get skipSubtitlesIfEmbeddedSubtitlesPresent
   * @return skipSubtitlesIfEmbeddedSubtitlesPresent
  */
  
  @Schema(name = "SkipSubtitlesIfEmbeddedSubtitlesPresent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SkipSubtitlesIfEmbeddedSubtitlesPresent")
  public Boolean getSkipSubtitlesIfEmbeddedSubtitlesPresent() {
    return skipSubtitlesIfEmbeddedSubtitlesPresent;
  }

  public void setSkipSubtitlesIfEmbeddedSubtitlesPresent(Boolean skipSubtitlesIfEmbeddedSubtitlesPresent) {
    this.skipSubtitlesIfEmbeddedSubtitlesPresent = skipSubtitlesIfEmbeddedSubtitlesPresent;
  }

  public LibraryOptions subtitleDownloadLanguages(List<String> subtitleDownloadLanguages) {
    this.subtitleDownloadLanguages = JsonNullable.of(subtitleDownloadLanguages);
    return this;
  }

  public LibraryOptions addSubtitleDownloadLanguagesItem(String subtitleDownloadLanguagesItem) {
    if (this.subtitleDownloadLanguages == null || !this.subtitleDownloadLanguages.isPresent()) {
      this.subtitleDownloadLanguages = JsonNullable.of(new ArrayList<>());
    }
    this.subtitleDownloadLanguages.get().add(subtitleDownloadLanguagesItem);
    return this;
  }

  /**
   * Get subtitleDownloadLanguages
   * @return subtitleDownloadLanguages
  */
  
  @Schema(name = "SubtitleDownloadLanguages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SubtitleDownloadLanguages")
  public JsonNullable<List<String>> getSubtitleDownloadLanguages() {
    return subtitleDownloadLanguages;
  }

  public void setSubtitleDownloadLanguages(JsonNullable<List<String>> subtitleDownloadLanguages) {
    this.subtitleDownloadLanguages = subtitleDownloadLanguages;
  }

  public LibraryOptions subtitleFetcherOrder(List<String> subtitleFetcherOrder) {
    this.subtitleFetcherOrder = JsonNullable.of(subtitleFetcherOrder);
    return this;
  }

  public LibraryOptions addSubtitleFetcherOrderItem(String subtitleFetcherOrderItem) {
    if (this.subtitleFetcherOrder == null || !this.subtitleFetcherOrder.isPresent()) {
      this.subtitleFetcherOrder = JsonNullable.of(new ArrayList<>());
    }
    this.subtitleFetcherOrder.get().add(subtitleFetcherOrderItem);
    return this;
  }

  /**
   * Get subtitleFetcherOrder
   * @return subtitleFetcherOrder
  */
  
  @Schema(name = "SubtitleFetcherOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SubtitleFetcherOrder")
  public JsonNullable<List<String>> getSubtitleFetcherOrder() {
    return subtitleFetcherOrder;
  }

  public void setSubtitleFetcherOrder(JsonNullable<List<String>> subtitleFetcherOrder) {
    this.subtitleFetcherOrder = subtitleFetcherOrder;
  }

  public LibraryOptions typeOptions(List<@Valid TypeOptions> typeOptions) {
    this.typeOptions = JsonNullable.of(typeOptions);
    return this;
  }

  public LibraryOptions addTypeOptionsItem(TypeOptions typeOptionsItem) {
    if (this.typeOptions == null || !this.typeOptions.isPresent()) {
      this.typeOptions = JsonNullable.of(new ArrayList<>());
    }
    this.typeOptions.get().add(typeOptionsItem);
    return this;
  }

  /**
   * Get typeOptions
   * @return typeOptions
  */
  @Valid 
  @Schema(name = "TypeOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TypeOptions")
  public JsonNullable<List<@Valid TypeOptions>> getTypeOptions() {
    return typeOptions;
  }

  public void setTypeOptions(JsonNullable<List<@Valid TypeOptions>> typeOptions) {
    this.typeOptions = typeOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryOptions libraryOptions = (LibraryOptions) o;
    return Objects.equals(this.automaticRefreshIntervalDays, libraryOptions.automaticRefreshIntervalDays) &&
        equalsNullable(this.disabledLocalMetadataReaders, libraryOptions.disabledLocalMetadataReaders) &&
        equalsNullable(this.disabledSubtitleFetchers, libraryOptions.disabledSubtitleFetchers) &&
        Objects.equals(this.enableAutomaticSeriesGrouping, libraryOptions.enableAutomaticSeriesGrouping) &&
        Objects.equals(this.enableChapterImageExtraction, libraryOptions.enableChapterImageExtraction) &&
        Objects.equals(this.enableEmbeddedEpisodeInfos, libraryOptions.enableEmbeddedEpisodeInfos) &&
        Objects.equals(this.enableEmbeddedTitles, libraryOptions.enableEmbeddedTitles) &&
        Objects.equals(this.enableInternetProviders, libraryOptions.enableInternetProviders) &&
        Objects.equals(this.enablePhotos, libraryOptions.enablePhotos) &&
        Objects.equals(this.enableRealtimeMonitor, libraryOptions.enableRealtimeMonitor) &&
        Objects.equals(this.extractChapterImagesDuringLibraryScan, libraryOptions.extractChapterImagesDuringLibraryScan) &&
        equalsNullable(this.localMetadataReaderOrder, libraryOptions.localMetadataReaderOrder) &&
        equalsNullable(this.metadataCountryCode, libraryOptions.metadataCountryCode) &&
        equalsNullable(this.metadataSavers, libraryOptions.metadataSavers) &&
        equalsNullable(this.pathInfos, libraryOptions.pathInfos) &&
        equalsNullable(this.preferredMetadataLanguage, libraryOptions.preferredMetadataLanguage) &&
        Objects.equals(this.requirePerfectSubtitleMatch, libraryOptions.requirePerfectSubtitleMatch) &&
        Objects.equals(this.saveLocalMetadata, libraryOptions.saveLocalMetadata) &&
        Objects.equals(this.saveSubtitlesWithMedia, libraryOptions.saveSubtitlesWithMedia) &&
        equalsNullable(this.seasonZeroDisplayName, libraryOptions.seasonZeroDisplayName) &&
        Objects.equals(this.skipSubtitlesIfAudioTrackMatches, libraryOptions.skipSubtitlesIfAudioTrackMatches) &&
        Objects.equals(this.skipSubtitlesIfEmbeddedSubtitlesPresent, libraryOptions.skipSubtitlesIfEmbeddedSubtitlesPresent) &&
        equalsNullable(this.subtitleDownloadLanguages, libraryOptions.subtitleDownloadLanguages) &&
        equalsNullable(this.subtitleFetcherOrder, libraryOptions.subtitleFetcherOrder) &&
        equalsNullable(this.typeOptions, libraryOptions.typeOptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(automaticRefreshIntervalDays, hashCodeNullable(disabledLocalMetadataReaders), hashCodeNullable(disabledSubtitleFetchers), enableAutomaticSeriesGrouping, enableChapterImageExtraction, enableEmbeddedEpisodeInfos, enableEmbeddedTitles, enableInternetProviders, enablePhotos, enableRealtimeMonitor, extractChapterImagesDuringLibraryScan, hashCodeNullable(localMetadataReaderOrder), hashCodeNullable(metadataCountryCode), hashCodeNullable(metadataSavers), hashCodeNullable(pathInfos), hashCodeNullable(preferredMetadataLanguage), requirePerfectSubtitleMatch, saveLocalMetadata, saveSubtitlesWithMedia, hashCodeNullable(seasonZeroDisplayName), skipSubtitlesIfAudioTrackMatches, skipSubtitlesIfEmbeddedSubtitlesPresent, hashCodeNullable(subtitleDownloadLanguages), hashCodeNullable(subtitleFetcherOrder), hashCodeNullable(typeOptions));
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
    sb.append("class LibraryOptions {\n");
    sb.append("    automaticRefreshIntervalDays: ").append(toIndentedString(automaticRefreshIntervalDays)).append("\n");
    sb.append("    disabledLocalMetadataReaders: ").append(toIndentedString(disabledLocalMetadataReaders)).append("\n");
    sb.append("    disabledSubtitleFetchers: ").append(toIndentedString(disabledSubtitleFetchers)).append("\n");
    sb.append("    enableAutomaticSeriesGrouping: ").append(toIndentedString(enableAutomaticSeriesGrouping)).append("\n");
    sb.append("    enableChapterImageExtraction: ").append(toIndentedString(enableChapterImageExtraction)).append("\n");
    sb.append("    enableEmbeddedEpisodeInfos: ").append(toIndentedString(enableEmbeddedEpisodeInfos)).append("\n");
    sb.append("    enableEmbeddedTitles: ").append(toIndentedString(enableEmbeddedTitles)).append("\n");
    sb.append("    enableInternetProviders: ").append(toIndentedString(enableInternetProviders)).append("\n");
    sb.append("    enablePhotos: ").append(toIndentedString(enablePhotos)).append("\n");
    sb.append("    enableRealtimeMonitor: ").append(toIndentedString(enableRealtimeMonitor)).append("\n");
    sb.append("    extractChapterImagesDuringLibraryScan: ").append(toIndentedString(extractChapterImagesDuringLibraryScan)).append("\n");
    sb.append("    localMetadataReaderOrder: ").append(toIndentedString(localMetadataReaderOrder)).append("\n");
    sb.append("    metadataCountryCode: ").append(toIndentedString(metadataCountryCode)).append("\n");
    sb.append("    metadataSavers: ").append(toIndentedString(metadataSavers)).append("\n");
    sb.append("    pathInfos: ").append(toIndentedString(pathInfos)).append("\n");
    sb.append("    preferredMetadataLanguage: ").append(toIndentedString(preferredMetadataLanguage)).append("\n");
    sb.append("    requirePerfectSubtitleMatch: ").append(toIndentedString(requirePerfectSubtitleMatch)).append("\n");
    sb.append("    saveLocalMetadata: ").append(toIndentedString(saveLocalMetadata)).append("\n");
    sb.append("    saveSubtitlesWithMedia: ").append(toIndentedString(saveSubtitlesWithMedia)).append("\n");
    sb.append("    seasonZeroDisplayName: ").append(toIndentedString(seasonZeroDisplayName)).append("\n");
    sb.append("    skipSubtitlesIfAudioTrackMatches: ").append(toIndentedString(skipSubtitlesIfAudioTrackMatches)).append("\n");
    sb.append("    skipSubtitlesIfEmbeddedSubtitlesPresent: ").append(toIndentedString(skipSubtitlesIfEmbeddedSubtitlesPresent)).append("\n");
    sb.append("    subtitleDownloadLanguages: ").append(toIndentedString(subtitleDownloadLanguages)).append("\n");
    sb.append("    subtitleFetcherOrder: ").append(toIndentedString(subtitleFetcherOrder)).append("\n");
    sb.append("    typeOptions: ").append(toIndentedString(typeOptions)).append("\n");
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

