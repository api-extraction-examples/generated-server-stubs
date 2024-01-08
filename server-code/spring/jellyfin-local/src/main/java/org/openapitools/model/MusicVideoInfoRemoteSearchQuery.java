package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MusicVideoInfo;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MusicVideoInfoRemoteSearchQuery
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class MusicVideoInfoRemoteSearchQuery {

  private Boolean includeDisabledProviders;

  private UUID itemId;

  private MusicVideoInfo searchInfo;

  private JsonNullable<String> searchProviderName = JsonNullable.<String>undefined();

  public MusicVideoInfoRemoteSearchQuery includeDisabledProviders(Boolean includeDisabledProviders) {
    this.includeDisabledProviders = includeDisabledProviders;
    return this;
  }

  /**
   * Gets or sets a value indicating whether disabled providers should be included.
   * @return includeDisabledProviders
  */
  
  @Schema(name = "IncludeDisabledProviders", description = "Gets or sets a value indicating whether disabled providers should be included.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IncludeDisabledProviders")
  public Boolean getIncludeDisabledProviders() {
    return includeDisabledProviders;
  }

  public void setIncludeDisabledProviders(Boolean includeDisabledProviders) {
    this.includeDisabledProviders = includeDisabledProviders;
  }

  public MusicVideoInfoRemoteSearchQuery itemId(UUID itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Get itemId
   * @return itemId
  */
  @Valid 
  @Schema(name = "ItemId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ItemId")
  public UUID getItemId() {
    return itemId;
  }

  public void setItemId(UUID itemId) {
    this.itemId = itemId;
  }

  public MusicVideoInfoRemoteSearchQuery searchInfo(MusicVideoInfo searchInfo) {
    this.searchInfo = searchInfo;
    return this;
  }

  /**
   * Get searchInfo
   * @return searchInfo
  */
  @Valid 
  @Schema(name = "SearchInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SearchInfo")
  public MusicVideoInfo getSearchInfo() {
    return searchInfo;
  }

  public void setSearchInfo(MusicVideoInfo searchInfo) {
    this.searchInfo = searchInfo;
  }

  public MusicVideoInfoRemoteSearchQuery searchProviderName(String searchProviderName) {
    this.searchProviderName = JsonNullable.of(searchProviderName);
    return this;
  }

  /**
   * Will only search within the given provider when set.
   * @return searchProviderName
  */
  
  @Schema(name = "SearchProviderName", description = "Will only search within the given provider when set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    MusicVideoInfoRemoteSearchQuery musicVideoInfoRemoteSearchQuery = (MusicVideoInfoRemoteSearchQuery) o;
    return Objects.equals(this.includeDisabledProviders, musicVideoInfoRemoteSearchQuery.includeDisabledProviders) &&
        Objects.equals(this.itemId, musicVideoInfoRemoteSearchQuery.itemId) &&
        Objects.equals(this.searchInfo, musicVideoInfoRemoteSearchQuery.searchInfo) &&
        equalsNullable(this.searchProviderName, musicVideoInfoRemoteSearchQuery.searchProviderName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeDisabledProviders, itemId, searchInfo, hashCodeNullable(searchProviderName));
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
    sb.append("class MusicVideoInfoRemoteSearchQuery {\n");
    sb.append("    includeDisabledProviders: ").append(toIndentedString(includeDisabledProviders)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    searchInfo: ").append(toIndentedString(searchInfo)).append("\n");
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

