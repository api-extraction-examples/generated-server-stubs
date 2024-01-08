package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageType;
import org.openapitools.model.ItemFields;
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
 * Get programs dto.
 */

@Schema(name = "GetProgramsDto", description = "Get programs dto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class GetProgramsDto {

  @Valid
  private JsonNullable<List<UUID>> channelIds = JsonNullable.<List<UUID>>undefined();

  @Valid
  private JsonNullable<List<@Valid ImageType>> enableImageTypes = JsonNullable.<List<@Valid ImageType>>undefined();

  private JsonNullable<Boolean> enableImages = JsonNullable.<Boolean>undefined();

  private Boolean enableTotalRecordCount;

  private JsonNullable<Boolean> enableUserData = JsonNullable.<Boolean>undefined();

  @Valid
  private JsonNullable<List<@Valid ItemFields>> fields = JsonNullable.<List<@Valid ItemFields>>undefined();

  @Valid
  private JsonNullable<List<UUID>> genreIds = JsonNullable.<List<UUID>>undefined();

  @Valid
  private JsonNullable<List<String>> genres = JsonNullable.<List<String>>undefined();

  private JsonNullable<Boolean> hasAired = JsonNullable.<Boolean>undefined();

  private JsonNullable<Integer> imageTypeLimit = JsonNullable.<Integer>undefined();

  private JsonNullable<Boolean> isAiring = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isKids = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isMovie = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isNews = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isSeries = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isSports = JsonNullable.<Boolean>undefined();

  private UUID librarySeriesId;

  private JsonNullable<Integer> limit = JsonNullable.<Integer>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> maxEndDate = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> maxStartDate = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> minEndDate = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> minStartDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> seriesTimerId = JsonNullable.<String>undefined();

  private JsonNullable<String> sortBy = JsonNullable.<String>undefined();

  private JsonNullable<String> sortOrder = JsonNullable.<String>undefined();

  private JsonNullable<Integer> startIndex = JsonNullable.<Integer>undefined();

  private UUID userId;

  public GetProgramsDto channelIds(List<UUID> channelIds) {
    this.channelIds = JsonNullable.of(channelIds);
    return this;
  }

  public GetProgramsDto addChannelIdsItem(UUID channelIdsItem) {
    if (this.channelIds == null || !this.channelIds.isPresent()) {
      this.channelIds = JsonNullable.of(new ArrayList<>());
    }
    this.channelIds.get().add(channelIdsItem);
    return this;
  }

  /**
   * Gets or sets the channels to return guide information for.
   * @return channelIds
  */
  @Valid 
  @Schema(name = "ChannelIds", description = "Gets or sets the channels to return guide information for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ChannelIds")
  public JsonNullable<List<UUID>> getChannelIds() {
    return channelIds;
  }

  public void setChannelIds(JsonNullable<List<UUID>> channelIds) {
    this.channelIds = channelIds;
  }

  public GetProgramsDto enableImageTypes(List<@Valid ImageType> enableImageTypes) {
    this.enableImageTypes = JsonNullable.of(enableImageTypes);
    return this;
  }

  public GetProgramsDto addEnableImageTypesItem(ImageType enableImageTypesItem) {
    if (this.enableImageTypes == null || !this.enableImageTypes.isPresent()) {
      this.enableImageTypes = JsonNullable.of(new ArrayList<>());
    }
    this.enableImageTypes.get().add(enableImageTypesItem);
    return this;
  }

  /**
   * Gets or sets the image types to include in the output.  Optional.
   * @return enableImageTypes
  */
  @Valid 
  @Schema(name = "EnableImageTypes", description = "Gets or sets the image types to include in the output.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableImageTypes")
  public JsonNullable<List<@Valid ImageType>> getEnableImageTypes() {
    return enableImageTypes;
  }

  public void setEnableImageTypes(JsonNullable<List<@Valid ImageType>> enableImageTypes) {
    this.enableImageTypes = enableImageTypes;
  }

  public GetProgramsDto enableImages(Boolean enableImages) {
    this.enableImages = JsonNullable.of(enableImages);
    return this;
  }

  /**
   * Gets or sets include image information in output.  Optional.
   * @return enableImages
  */
  
  @Schema(name = "EnableImages", description = "Gets or sets include image information in output.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableImages")
  public JsonNullable<Boolean> getEnableImages() {
    return enableImages;
  }

  public void setEnableImages(JsonNullable<Boolean> enableImages) {
    this.enableImages = enableImages;
  }

  public GetProgramsDto enableTotalRecordCount(Boolean enableTotalRecordCount) {
    this.enableTotalRecordCount = enableTotalRecordCount;
    return this;
  }

  /**
   * Gets or sets a value indicating whether retrieve total record count.
   * @return enableTotalRecordCount
  */
  
  @Schema(name = "EnableTotalRecordCount", description = "Gets or sets a value indicating whether retrieve total record count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableTotalRecordCount")
  public Boolean getEnableTotalRecordCount() {
    return enableTotalRecordCount;
  }

  public void setEnableTotalRecordCount(Boolean enableTotalRecordCount) {
    this.enableTotalRecordCount = enableTotalRecordCount;
  }

  public GetProgramsDto enableUserData(Boolean enableUserData) {
    this.enableUserData = JsonNullable.of(enableUserData);
    return this;
  }

  /**
   * Gets or sets include user data.  Optional.
   * @return enableUserData
  */
  
  @Schema(name = "EnableUserData", description = "Gets or sets include user data.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableUserData")
  public JsonNullable<Boolean> getEnableUserData() {
    return enableUserData;
  }

  public void setEnableUserData(JsonNullable<Boolean> enableUserData) {
    this.enableUserData = enableUserData;
  }

  public GetProgramsDto fields(List<@Valid ItemFields> fields) {
    this.fields = JsonNullable.of(fields);
    return this;
  }

  public GetProgramsDto addFieldsItem(ItemFields fieldsItem) {
    if (this.fields == null || !this.fields.isPresent()) {
      this.fields = JsonNullable.of(new ArrayList<>());
    }
    this.fields.get().add(fieldsItem);
    return this;
  }

  /**
   * Gets or sets specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines.  Optional.
   * @return fields
  */
  @Valid 
  @Schema(name = "Fields", description = "Gets or sets specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Fields")
  public JsonNullable<List<@Valid ItemFields>> getFields() {
    return fields;
  }

  public void setFields(JsonNullable<List<@Valid ItemFields>> fields) {
    this.fields = fields;
  }

  public GetProgramsDto genreIds(List<UUID> genreIds) {
    this.genreIds = JsonNullable.of(genreIds);
    return this;
  }

  public GetProgramsDto addGenreIdsItem(UUID genreIdsItem) {
    if (this.genreIds == null || !this.genreIds.isPresent()) {
      this.genreIds = JsonNullable.of(new ArrayList<>());
    }
    this.genreIds.get().add(genreIdsItem);
    return this;
  }

  /**
   * Gets or sets the genre ids to return guide information for.
   * @return genreIds
  */
  @Valid 
  @Schema(name = "GenreIds", description = "Gets or sets the genre ids to return guide information for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GenreIds")
  public JsonNullable<List<UUID>> getGenreIds() {
    return genreIds;
  }

  public void setGenreIds(JsonNullable<List<UUID>> genreIds) {
    this.genreIds = genreIds;
  }

  public GetProgramsDto genres(List<String> genres) {
    this.genres = JsonNullable.of(genres);
    return this;
  }

  public GetProgramsDto addGenresItem(String genresItem) {
    if (this.genres == null || !this.genres.isPresent()) {
      this.genres = JsonNullable.of(new ArrayList<>());
    }
    this.genres.get().add(genresItem);
    return this;
  }

  /**
   * Gets or sets the genres to return guide information for.
   * @return genres
  */
  
  @Schema(name = "Genres", description = "Gets or sets the genres to return guide information for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Genres")
  public JsonNullable<List<String>> getGenres() {
    return genres;
  }

  public void setGenres(JsonNullable<List<String>> genres) {
    this.genres = genres;
  }

  public GetProgramsDto hasAired(Boolean hasAired) {
    this.hasAired = JsonNullable.of(hasAired);
    return this;
  }

  /**
   * Gets or sets filter by programs that have completed airing, or not.  Optional.
   * @return hasAired
  */
  
  @Schema(name = "HasAired", description = "Gets or sets filter by programs that have completed airing, or not.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HasAired")
  public JsonNullable<Boolean> getHasAired() {
    return hasAired;
  }

  public void setHasAired(JsonNullable<Boolean> hasAired) {
    this.hasAired = hasAired;
  }

  public GetProgramsDto imageTypeLimit(Integer imageTypeLimit) {
    this.imageTypeLimit = JsonNullable.of(imageTypeLimit);
    return this;
  }

  /**
   * Gets or sets the max number of images to return, per image type.  Optional.
   * @return imageTypeLimit
  */
  
  @Schema(name = "ImageTypeLimit", description = "Gets or sets the max number of images to return, per image type.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageTypeLimit")
  public JsonNullable<Integer> getImageTypeLimit() {
    return imageTypeLimit;
  }

  public void setImageTypeLimit(JsonNullable<Integer> imageTypeLimit) {
    this.imageTypeLimit = imageTypeLimit;
  }

  public GetProgramsDto isAiring(Boolean isAiring) {
    this.isAiring = JsonNullable.of(isAiring);
    return this;
  }

  /**
   * Gets or sets filter by programs that are currently airing, or not.  Optional.
   * @return isAiring
  */
  
  @Schema(name = "IsAiring", description = "Gets or sets filter by programs that are currently airing, or not.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsAiring")
  public JsonNullable<Boolean> getIsAiring() {
    return isAiring;
  }

  public void setIsAiring(JsonNullable<Boolean> isAiring) {
    this.isAiring = isAiring;
  }

  public GetProgramsDto isKids(Boolean isKids) {
    this.isKids = JsonNullable.of(isKids);
    return this;
  }

  /**
   * Gets or sets filter for kids.  Optional.
   * @return isKids
  */
  
  @Schema(name = "IsKids", description = "Gets or sets filter for kids.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsKids")
  public JsonNullable<Boolean> getIsKids() {
    return isKids;
  }

  public void setIsKids(JsonNullable<Boolean> isKids) {
    this.isKids = isKids;
  }

  public GetProgramsDto isMovie(Boolean isMovie) {
    this.isMovie = JsonNullable.of(isMovie);
    return this;
  }

  /**
   * Gets or sets filter for movies.  Optional.
   * @return isMovie
  */
  
  @Schema(name = "IsMovie", description = "Gets or sets filter for movies.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsMovie")
  public JsonNullable<Boolean> getIsMovie() {
    return isMovie;
  }

  public void setIsMovie(JsonNullable<Boolean> isMovie) {
    this.isMovie = isMovie;
  }

  public GetProgramsDto isNews(Boolean isNews) {
    this.isNews = JsonNullable.of(isNews);
    return this;
  }

  /**
   * Gets or sets filter for news.  Optional.
   * @return isNews
  */
  
  @Schema(name = "IsNews", description = "Gets or sets filter for news.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsNews")
  public JsonNullable<Boolean> getIsNews() {
    return isNews;
  }

  public void setIsNews(JsonNullable<Boolean> isNews) {
    this.isNews = isNews;
  }

  public GetProgramsDto isSeries(Boolean isSeries) {
    this.isSeries = JsonNullable.of(isSeries);
    return this;
  }

  /**
   * Gets or sets filter for series.  Optional.
   * @return isSeries
  */
  
  @Schema(name = "IsSeries", description = "Gets or sets filter for series.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsSeries")
  public JsonNullable<Boolean> getIsSeries() {
    return isSeries;
  }

  public void setIsSeries(JsonNullable<Boolean> isSeries) {
    this.isSeries = isSeries;
  }

  public GetProgramsDto isSports(Boolean isSports) {
    this.isSports = JsonNullable.of(isSports);
    return this;
  }

  /**
   * Gets or sets filter for sports.  Optional.
   * @return isSports
  */
  
  @Schema(name = "IsSports", description = "Gets or sets filter for sports.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsSports")
  public JsonNullable<Boolean> getIsSports() {
    return isSports;
  }

  public void setIsSports(JsonNullable<Boolean> isSports) {
    this.isSports = isSports;
  }

  public GetProgramsDto librarySeriesId(UUID librarySeriesId) {
    this.librarySeriesId = librarySeriesId;
    return this;
  }

  /**
   * Gets or sets filter by library series id.  Optional.
   * @return librarySeriesId
  */
  @Valid 
  @Schema(name = "LibrarySeriesId", description = "Gets or sets filter by library series id.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LibrarySeriesId")
  public UUID getLibrarySeriesId() {
    return librarySeriesId;
  }

  public void setLibrarySeriesId(UUID librarySeriesId) {
    this.librarySeriesId = librarySeriesId;
  }

  public GetProgramsDto limit(Integer limit) {
    this.limit = JsonNullable.of(limit);
    return this;
  }

  /**
   * Gets or sets the maximum number of records to return.  Optional.
   * @return limit
  */
  
  @Schema(name = "Limit", description = "Gets or sets the maximum number of records to return.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Limit")
  public JsonNullable<Integer> getLimit() {
    return limit;
  }

  public void setLimit(JsonNullable<Integer> limit) {
    this.limit = limit;
  }

  public GetProgramsDto maxEndDate(OffsetDateTime maxEndDate) {
    this.maxEndDate = JsonNullable.of(maxEndDate);
    return this;
  }

  /**
   * Gets or sets the maximum premiere end date.  Optional.
   * @return maxEndDate
  */
  @Valid 
  @Schema(name = "MaxEndDate", description = "Gets or sets the maximum premiere end date.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxEndDate")
  public JsonNullable<OffsetDateTime> getMaxEndDate() {
    return maxEndDate;
  }

  public void setMaxEndDate(JsonNullable<OffsetDateTime> maxEndDate) {
    this.maxEndDate = maxEndDate;
  }

  public GetProgramsDto maxStartDate(OffsetDateTime maxStartDate) {
    this.maxStartDate = JsonNullable.of(maxStartDate);
    return this;
  }

  /**
   * Gets or sets the maximum premiere start date.  Optional.
   * @return maxStartDate
  */
  @Valid 
  @Schema(name = "MaxStartDate", description = "Gets or sets the maximum premiere start date.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxStartDate")
  public JsonNullable<OffsetDateTime> getMaxStartDate() {
    return maxStartDate;
  }

  public void setMaxStartDate(JsonNullable<OffsetDateTime> maxStartDate) {
    this.maxStartDate = maxStartDate;
  }

  public GetProgramsDto minEndDate(OffsetDateTime minEndDate) {
    this.minEndDate = JsonNullable.of(minEndDate);
    return this;
  }

  /**
   * Gets or sets the minimum premiere end date.  Optional.
   * @return minEndDate
  */
  @Valid 
  @Schema(name = "MinEndDate", description = "Gets or sets the minimum premiere end date.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MinEndDate")
  public JsonNullable<OffsetDateTime> getMinEndDate() {
    return minEndDate;
  }

  public void setMinEndDate(JsonNullable<OffsetDateTime> minEndDate) {
    this.minEndDate = minEndDate;
  }

  public GetProgramsDto minStartDate(OffsetDateTime minStartDate) {
    this.minStartDate = JsonNullable.of(minStartDate);
    return this;
  }

  /**
   * Gets or sets the minimum premiere start date.  Optional.
   * @return minStartDate
  */
  @Valid 
  @Schema(name = "MinStartDate", description = "Gets or sets the minimum premiere start date.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MinStartDate")
  public JsonNullable<OffsetDateTime> getMinStartDate() {
    return minStartDate;
  }

  public void setMinStartDate(JsonNullable<OffsetDateTime> minStartDate) {
    this.minStartDate = minStartDate;
  }

  public GetProgramsDto seriesTimerId(String seriesTimerId) {
    this.seriesTimerId = JsonNullable.of(seriesTimerId);
    return this;
  }

  /**
   * Gets or sets filter by series timer id.  Optional.
   * @return seriesTimerId
  */
  
  @Schema(name = "SeriesTimerId", description = "Gets or sets filter by series timer id.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SeriesTimerId")
  public JsonNullable<String> getSeriesTimerId() {
    return seriesTimerId;
  }

  public void setSeriesTimerId(JsonNullable<String> seriesTimerId) {
    this.seriesTimerId = seriesTimerId;
  }

  public GetProgramsDto sortBy(String sortBy) {
    this.sortBy = JsonNullable.of(sortBy);
    return this;
  }

  /**
   * Gets or sets specify one or more sort orders, comma delimited. Options: Name, StartDate.  Optional.
   * @return sortBy
  */
  
  @Schema(name = "SortBy", description = "Gets or sets specify one or more sort orders, comma delimited. Options: Name, StartDate.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SortBy")
  public JsonNullable<String> getSortBy() {
    return sortBy;
  }

  public void setSortBy(JsonNullable<String> sortBy) {
    this.sortBy = sortBy;
  }

  public GetProgramsDto sortOrder(String sortOrder) {
    this.sortOrder = JsonNullable.of(sortOrder);
    return this;
  }

  /**
   * Gets or sets sort Order - Ascending,Descending.
   * @return sortOrder
  */
  
  @Schema(name = "SortOrder", description = "Gets or sets sort Order - Ascending,Descending.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SortOrder")
  public JsonNullable<String> getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(JsonNullable<String> sortOrder) {
    this.sortOrder = sortOrder;
  }

  public GetProgramsDto startIndex(Integer startIndex) {
    this.startIndex = JsonNullable.of(startIndex);
    return this;
  }

  /**
   * Gets or sets the record index to start at. All items with a lower index will be dropped from the results.  Optional.
   * @return startIndex
  */
  
  @Schema(name = "StartIndex", description = "Gets or sets the record index to start at. All items with a lower index will be dropped from the results.  Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartIndex")
  public JsonNullable<Integer> getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(JsonNullable<Integer> startIndex) {
    this.startIndex = startIndex;
  }

  public GetProgramsDto userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Gets or sets optional. Filter by user id.
   * @return userId
  */
  @Valid 
  @Schema(name = "UserId", description = "Gets or sets optional. Filter by user id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserId")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProgramsDto getProgramsDto = (GetProgramsDto) o;
    return equalsNullable(this.channelIds, getProgramsDto.channelIds) &&
        equalsNullable(this.enableImageTypes, getProgramsDto.enableImageTypes) &&
        equalsNullable(this.enableImages, getProgramsDto.enableImages) &&
        Objects.equals(this.enableTotalRecordCount, getProgramsDto.enableTotalRecordCount) &&
        equalsNullable(this.enableUserData, getProgramsDto.enableUserData) &&
        equalsNullable(this.fields, getProgramsDto.fields) &&
        equalsNullable(this.genreIds, getProgramsDto.genreIds) &&
        equalsNullable(this.genres, getProgramsDto.genres) &&
        equalsNullable(this.hasAired, getProgramsDto.hasAired) &&
        equalsNullable(this.imageTypeLimit, getProgramsDto.imageTypeLimit) &&
        equalsNullable(this.isAiring, getProgramsDto.isAiring) &&
        equalsNullable(this.isKids, getProgramsDto.isKids) &&
        equalsNullable(this.isMovie, getProgramsDto.isMovie) &&
        equalsNullable(this.isNews, getProgramsDto.isNews) &&
        equalsNullable(this.isSeries, getProgramsDto.isSeries) &&
        equalsNullable(this.isSports, getProgramsDto.isSports) &&
        Objects.equals(this.librarySeriesId, getProgramsDto.librarySeriesId) &&
        equalsNullable(this.limit, getProgramsDto.limit) &&
        equalsNullable(this.maxEndDate, getProgramsDto.maxEndDate) &&
        equalsNullable(this.maxStartDate, getProgramsDto.maxStartDate) &&
        equalsNullable(this.minEndDate, getProgramsDto.minEndDate) &&
        equalsNullable(this.minStartDate, getProgramsDto.minStartDate) &&
        equalsNullable(this.seriesTimerId, getProgramsDto.seriesTimerId) &&
        equalsNullable(this.sortBy, getProgramsDto.sortBy) &&
        equalsNullable(this.sortOrder, getProgramsDto.sortOrder) &&
        equalsNullable(this.startIndex, getProgramsDto.startIndex) &&
        Objects.equals(this.userId, getProgramsDto.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(channelIds), hashCodeNullable(enableImageTypes), hashCodeNullable(enableImages), enableTotalRecordCount, hashCodeNullable(enableUserData), hashCodeNullable(fields), hashCodeNullable(genreIds), hashCodeNullable(genres), hashCodeNullable(hasAired), hashCodeNullable(imageTypeLimit), hashCodeNullable(isAiring), hashCodeNullable(isKids), hashCodeNullable(isMovie), hashCodeNullable(isNews), hashCodeNullable(isSeries), hashCodeNullable(isSports), librarySeriesId, hashCodeNullable(limit), hashCodeNullable(maxEndDate), hashCodeNullable(maxStartDate), hashCodeNullable(minEndDate), hashCodeNullable(minStartDate), hashCodeNullable(seriesTimerId), hashCodeNullable(sortBy), hashCodeNullable(sortOrder), hashCodeNullable(startIndex), userId);
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
    sb.append("class GetProgramsDto {\n");
    sb.append("    channelIds: ").append(toIndentedString(channelIds)).append("\n");
    sb.append("    enableImageTypes: ").append(toIndentedString(enableImageTypes)).append("\n");
    sb.append("    enableImages: ").append(toIndentedString(enableImages)).append("\n");
    sb.append("    enableTotalRecordCount: ").append(toIndentedString(enableTotalRecordCount)).append("\n");
    sb.append("    enableUserData: ").append(toIndentedString(enableUserData)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    genreIds: ").append(toIndentedString(genreIds)).append("\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    hasAired: ").append(toIndentedString(hasAired)).append("\n");
    sb.append("    imageTypeLimit: ").append(toIndentedString(imageTypeLimit)).append("\n");
    sb.append("    isAiring: ").append(toIndentedString(isAiring)).append("\n");
    sb.append("    isKids: ").append(toIndentedString(isKids)).append("\n");
    sb.append("    isMovie: ").append(toIndentedString(isMovie)).append("\n");
    sb.append("    isNews: ").append(toIndentedString(isNews)).append("\n");
    sb.append("    isSeries: ").append(toIndentedString(isSeries)).append("\n");
    sb.append("    isSports: ").append(toIndentedString(isSports)).append("\n");
    sb.append("    librarySeriesId: ").append(toIndentedString(librarySeriesId)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    maxEndDate: ").append(toIndentedString(maxEndDate)).append("\n");
    sb.append("    maxStartDate: ").append(toIndentedString(maxStartDate)).append("\n");
    sb.append("    minEndDate: ").append(toIndentedString(minEndDate)).append("\n");
    sb.append("    minStartDate: ").append(toIndentedString(minStartDate)).append("\n");
    sb.append("    seriesTimerId: ").append(toIndentedString(seriesTimerId)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

