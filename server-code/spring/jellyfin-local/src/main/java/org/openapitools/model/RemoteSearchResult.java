package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * RemoteSearchResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class RemoteSearchResult {

  private RemoteSearchResult albumArtist;

  @Valid
  private JsonNullable<List<@Valid RemoteSearchResult>> artists = JsonNullable.<List<@Valid RemoteSearchResult>>undefined();

  private JsonNullable<String> imageUrl = JsonNullable.<String>undefined();

  private JsonNullable<Integer> indexNumber = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> indexNumberEnd = JsonNullable.<Integer>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> overview = JsonNullable.<String>undefined();

  private JsonNullable<Integer> parentIndexNumber = JsonNullable.<Integer>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> premiereDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Integer> productionYear = JsonNullable.<Integer>undefined();

  @Valid
  private JsonNullable<Map<String, String>> providerIds = JsonNullable.<Map<String, String>>undefined();

  private JsonNullable<String> searchProviderName = JsonNullable.<String>undefined();

  public RemoteSearchResult albumArtist(RemoteSearchResult albumArtist) {
    this.albumArtist = albumArtist;
    return this;
  }

  /**
   * Get albumArtist
   * @return albumArtist
  */
  @Valid 
  @Schema(name = "AlbumArtist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AlbumArtist")
  public RemoteSearchResult getAlbumArtist() {
    return albumArtist;
  }

  public void setAlbumArtist(RemoteSearchResult albumArtist) {
    this.albumArtist = albumArtist;
  }

  public RemoteSearchResult artists(List<@Valid RemoteSearchResult> artists) {
    this.artists = JsonNullable.of(artists);
    return this;
  }

  public RemoteSearchResult addArtistsItem(RemoteSearchResult artistsItem) {
    if (this.artists == null || !this.artists.isPresent()) {
      this.artists = JsonNullable.of(new ArrayList<>());
    }
    this.artists.get().add(artistsItem);
    return this;
  }

  /**
   * Get artists
   * @return artists
  */
  @Valid 
  @Schema(name = "Artists", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Artists")
  public JsonNullable<List<@Valid RemoteSearchResult>> getArtists() {
    return artists;
  }

  public void setArtists(JsonNullable<List<@Valid RemoteSearchResult>> artists) {
    this.artists = artists;
  }

  public RemoteSearchResult imageUrl(String imageUrl) {
    this.imageUrl = JsonNullable.of(imageUrl);
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  */
  
  @Schema(name = "ImageUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageUrl")
  public JsonNullable<String> getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(JsonNullable<String> imageUrl) {
    this.imageUrl = imageUrl;
  }

  public RemoteSearchResult indexNumber(Integer indexNumber) {
    this.indexNumber = JsonNullable.of(indexNumber);
    return this;
  }

  /**
   * Get indexNumber
   * @return indexNumber
  */
  
  @Schema(name = "IndexNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IndexNumber")
  public JsonNullable<Integer> getIndexNumber() {
    return indexNumber;
  }

  public void setIndexNumber(JsonNullable<Integer> indexNumber) {
    this.indexNumber = indexNumber;
  }

  public RemoteSearchResult indexNumberEnd(Integer indexNumberEnd) {
    this.indexNumberEnd = JsonNullable.of(indexNumberEnd);
    return this;
  }

  /**
   * Get indexNumberEnd
   * @return indexNumberEnd
  */
  
  @Schema(name = "IndexNumberEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IndexNumberEnd")
  public JsonNullable<Integer> getIndexNumberEnd() {
    return indexNumberEnd;
  }

  public void setIndexNumberEnd(JsonNullable<Integer> indexNumberEnd) {
    this.indexNumberEnd = indexNumberEnd;
  }

  public RemoteSearchResult name(String name) {
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

  public RemoteSearchResult overview(String overview) {
    this.overview = JsonNullable.of(overview);
    return this;
  }

  /**
   * Get overview
   * @return overview
  */
  
  @Schema(name = "Overview", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Overview")
  public JsonNullable<String> getOverview() {
    return overview;
  }

  public void setOverview(JsonNullable<String> overview) {
    this.overview = overview;
  }

  public RemoteSearchResult parentIndexNumber(Integer parentIndexNumber) {
    this.parentIndexNumber = JsonNullable.of(parentIndexNumber);
    return this;
  }

  /**
   * Get parentIndexNumber
   * @return parentIndexNumber
  */
  
  @Schema(name = "ParentIndexNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentIndexNumber")
  public JsonNullable<Integer> getParentIndexNumber() {
    return parentIndexNumber;
  }

  public void setParentIndexNumber(JsonNullable<Integer> parentIndexNumber) {
    this.parentIndexNumber = parentIndexNumber;
  }

  public RemoteSearchResult premiereDate(OffsetDateTime premiereDate) {
    this.premiereDate = JsonNullable.of(premiereDate);
    return this;
  }

  /**
   * Get premiereDate
   * @return premiereDate
  */
  @Valid 
  @Schema(name = "PremiereDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PremiereDate")
  public JsonNullable<OffsetDateTime> getPremiereDate() {
    return premiereDate;
  }

  public void setPremiereDate(JsonNullable<OffsetDateTime> premiereDate) {
    this.premiereDate = premiereDate;
  }

  public RemoteSearchResult productionYear(Integer productionYear) {
    this.productionYear = JsonNullable.of(productionYear);
    return this;
  }

  /**
   * Gets or sets the year.
   * @return productionYear
  */
  
  @Schema(name = "ProductionYear", description = "Gets or sets the year.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProductionYear")
  public JsonNullable<Integer> getProductionYear() {
    return productionYear;
  }

  public void setProductionYear(JsonNullable<Integer> productionYear) {
    this.productionYear = productionYear;
  }

  public RemoteSearchResult providerIds(Map<String, String> providerIds) {
    this.providerIds = JsonNullable.of(providerIds);
    return this;
  }

  public RemoteSearchResult putProviderIdsItem(String key, String providerIdsItem) {
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

  public RemoteSearchResult searchProviderName(String searchProviderName) {
    this.searchProviderName = JsonNullable.of(searchProviderName);
    return this;
  }

  /**
   * Get searchProviderName
   * @return searchProviderName
  */
  
  @Schema(name = "SearchProviderName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SearchProviderName")
  public JsonNullable<String> getSearchProviderName() {
    return searchProviderName;
  }

  public void setSearchProviderName(JsonNullable<String> searchProviderName) {
    this.searchProviderName = searchProviderName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteSearchResult remoteSearchResult = (RemoteSearchResult) o;
    return Objects.equals(this.albumArtist, remoteSearchResult.albumArtist) &&
        equalsNullable(this.artists, remoteSearchResult.artists) &&
        equalsNullable(this.imageUrl, remoteSearchResult.imageUrl) &&
        equalsNullable(this.indexNumber, remoteSearchResult.indexNumber) &&
        equalsNullable(this.indexNumberEnd, remoteSearchResult.indexNumberEnd) &&
        equalsNullable(this.name, remoteSearchResult.name) &&
        equalsNullable(this.overview, remoteSearchResult.overview) &&
        equalsNullable(this.parentIndexNumber, remoteSearchResult.parentIndexNumber) &&
        equalsNullable(this.premiereDate, remoteSearchResult.premiereDate) &&
        equalsNullable(this.productionYear, remoteSearchResult.productionYear) &&
        equalsNullable(this.providerIds, remoteSearchResult.providerIds) &&
        equalsNullable(this.searchProviderName, remoteSearchResult.searchProviderName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(albumArtist, hashCodeNullable(artists), hashCodeNullable(imageUrl), hashCodeNullable(indexNumber), hashCodeNullable(indexNumberEnd), hashCodeNullable(name), hashCodeNullable(overview), hashCodeNullable(parentIndexNumber), hashCodeNullable(premiereDate), hashCodeNullable(productionYear), hashCodeNullable(providerIds), hashCodeNullable(searchProviderName));
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
    sb.append("class RemoteSearchResult {\n");
    sb.append("    albumArtist: ").append(toIndentedString(albumArtist)).append("\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    indexNumber: ").append(toIndentedString(indexNumber)).append("\n");
    sb.append("    indexNumberEnd: ").append(toIndentedString(indexNumberEnd)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    parentIndexNumber: ").append(toIndentedString(parentIndexNumber)).append("\n");
    sb.append("    premiereDate: ").append(toIndentedString(premiereDate)).append("\n");
    sb.append("    productionYear: ").append(toIndentedString(productionYear)).append("\n");
    sb.append("    providerIds: ").append(toIndentedString(providerIds)).append("\n");
    sb.append("    searchProviderName: ").append(toIndentedString(searchProviderName)).append("\n");
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

