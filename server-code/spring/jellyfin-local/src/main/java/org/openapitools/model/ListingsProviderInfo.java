package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.NameValuePair;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListingsProviderInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ListingsProviderInfo {

  @Valid
  private JsonNullable<List<@Valid NameValuePair>> channelMappings = JsonNullable.<List<@Valid NameValuePair>>undefined();

  private JsonNullable<String> country = JsonNullable.<String>undefined();

  private Boolean enableAllTuners;

  @Valid
  private JsonNullable<List<String>> enabledTuners = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> id = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> kidsCategories = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> listingsId = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> movieCategories = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> moviePrefix = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> newsCategories = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> password = JsonNullable.<String>undefined();

  private JsonNullable<String> path = JsonNullable.<String>undefined();

  private JsonNullable<String> preferredLanguage = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> sportsCategories = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> type = JsonNullable.<String>undefined();

  private JsonNullable<String> userAgent = JsonNullable.<String>undefined();

  private JsonNullable<String> username = JsonNullable.<String>undefined();

  private JsonNullable<String> zipCode = JsonNullable.<String>undefined();

  public ListingsProviderInfo channelMappings(List<@Valid NameValuePair> channelMappings) {
    this.channelMappings = JsonNullable.of(channelMappings);
    return this;
  }

  public ListingsProviderInfo addChannelMappingsItem(NameValuePair channelMappingsItem) {
    if (this.channelMappings == null || !this.channelMappings.isPresent()) {
      this.channelMappings = JsonNullable.of(new ArrayList<>());
    }
    this.channelMappings.get().add(channelMappingsItem);
    return this;
  }

  /**
   * Get channelMappings
   * @return channelMappings
  */
  @Valid 
  @Schema(name = "ChannelMappings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ChannelMappings")
  public JsonNullable<List<@Valid NameValuePair>> getChannelMappings() {
    return channelMappings;
  }

  public void setChannelMappings(JsonNullable<List<@Valid NameValuePair>> channelMappings) {
    this.channelMappings = channelMappings;
  }

  public ListingsProviderInfo country(String country) {
    this.country = JsonNullable.of(country);
    return this;
  }

  /**
   * Get country
   * @return country
  */
  
  @Schema(name = "Country", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Country")
  public JsonNullable<String> getCountry() {
    return country;
  }

  public void setCountry(JsonNullable<String> country) {
    this.country = country;
  }

  public ListingsProviderInfo enableAllTuners(Boolean enableAllTuners) {
    this.enableAllTuners = enableAllTuners;
    return this;
  }

  /**
   * Get enableAllTuners
   * @return enableAllTuners
  */
  
  @Schema(name = "EnableAllTuners", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableAllTuners")
  public Boolean getEnableAllTuners() {
    return enableAllTuners;
  }

  public void setEnableAllTuners(Boolean enableAllTuners) {
    this.enableAllTuners = enableAllTuners;
  }

  public ListingsProviderInfo enabledTuners(List<String> enabledTuners) {
    this.enabledTuners = JsonNullable.of(enabledTuners);
    return this;
  }

  public ListingsProviderInfo addEnabledTunersItem(String enabledTunersItem) {
    if (this.enabledTuners == null || !this.enabledTuners.isPresent()) {
      this.enabledTuners = JsonNullable.of(new ArrayList<>());
    }
    this.enabledTuners.get().add(enabledTunersItem);
    return this;
  }

  /**
   * Get enabledTuners
   * @return enabledTuners
  */
  
  @Schema(name = "EnabledTuners", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnabledTuners")
  public JsonNullable<List<String>> getEnabledTuners() {
    return enabledTuners;
  }

  public void setEnabledTuners(JsonNullable<List<String>> enabledTuners) {
    this.enabledTuners = enabledTuners;
  }

  public ListingsProviderInfo id(String id) {
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

  public ListingsProviderInfo kidsCategories(List<String> kidsCategories) {
    this.kidsCategories = JsonNullable.of(kidsCategories);
    return this;
  }

  public ListingsProviderInfo addKidsCategoriesItem(String kidsCategoriesItem) {
    if (this.kidsCategories == null || !this.kidsCategories.isPresent()) {
      this.kidsCategories = JsonNullable.of(new ArrayList<>());
    }
    this.kidsCategories.get().add(kidsCategoriesItem);
    return this;
  }

  /**
   * Get kidsCategories
   * @return kidsCategories
  */
  
  @Schema(name = "KidsCategories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("KidsCategories")
  public JsonNullable<List<String>> getKidsCategories() {
    return kidsCategories;
  }

  public void setKidsCategories(JsonNullable<List<String>> kidsCategories) {
    this.kidsCategories = kidsCategories;
  }

  public ListingsProviderInfo listingsId(String listingsId) {
    this.listingsId = JsonNullable.of(listingsId);
    return this;
  }

  /**
   * Get listingsId
   * @return listingsId
  */
  
  @Schema(name = "ListingsId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ListingsId")
  public JsonNullable<String> getListingsId() {
    return listingsId;
  }

  public void setListingsId(JsonNullable<String> listingsId) {
    this.listingsId = listingsId;
  }

  public ListingsProviderInfo movieCategories(List<String> movieCategories) {
    this.movieCategories = JsonNullable.of(movieCategories);
    return this;
  }

  public ListingsProviderInfo addMovieCategoriesItem(String movieCategoriesItem) {
    if (this.movieCategories == null || !this.movieCategories.isPresent()) {
      this.movieCategories = JsonNullable.of(new ArrayList<>());
    }
    this.movieCategories.get().add(movieCategoriesItem);
    return this;
  }

  /**
   * Get movieCategories
   * @return movieCategories
  */
  
  @Schema(name = "MovieCategories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MovieCategories")
  public JsonNullable<List<String>> getMovieCategories() {
    return movieCategories;
  }

  public void setMovieCategories(JsonNullable<List<String>> movieCategories) {
    this.movieCategories = movieCategories;
  }

  public ListingsProviderInfo moviePrefix(String moviePrefix) {
    this.moviePrefix = JsonNullable.of(moviePrefix);
    return this;
  }

  /**
   * Get moviePrefix
   * @return moviePrefix
  */
  
  @Schema(name = "MoviePrefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MoviePrefix")
  public JsonNullable<String> getMoviePrefix() {
    return moviePrefix;
  }

  public void setMoviePrefix(JsonNullable<String> moviePrefix) {
    this.moviePrefix = moviePrefix;
  }

  public ListingsProviderInfo newsCategories(List<String> newsCategories) {
    this.newsCategories = JsonNullable.of(newsCategories);
    return this;
  }

  public ListingsProviderInfo addNewsCategoriesItem(String newsCategoriesItem) {
    if (this.newsCategories == null || !this.newsCategories.isPresent()) {
      this.newsCategories = JsonNullable.of(new ArrayList<>());
    }
    this.newsCategories.get().add(newsCategoriesItem);
    return this;
  }

  /**
   * Get newsCategories
   * @return newsCategories
  */
  
  @Schema(name = "NewsCategories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NewsCategories")
  public JsonNullable<List<String>> getNewsCategories() {
    return newsCategories;
  }

  public void setNewsCategories(JsonNullable<List<String>> newsCategories) {
    this.newsCategories = newsCategories;
  }

  public ListingsProviderInfo password(String password) {
    this.password = JsonNullable.of(password);
    return this;
  }

  /**
   * Get password
   * @return password
  */
  
  @Schema(name = "Password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Password")
  public JsonNullable<String> getPassword() {
    return password;
  }

  public void setPassword(JsonNullable<String> password) {
    this.password = password;
  }

  public ListingsProviderInfo path(String path) {
    this.path = JsonNullable.of(path);
    return this;
  }

  /**
   * Get path
   * @return path
  */
  
  @Schema(name = "Path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Path")
  public JsonNullable<String> getPath() {
    return path;
  }

  public void setPath(JsonNullable<String> path) {
    this.path = path;
  }

  public ListingsProviderInfo preferredLanguage(String preferredLanguage) {
    this.preferredLanguage = JsonNullable.of(preferredLanguage);
    return this;
  }

  /**
   * Get preferredLanguage
   * @return preferredLanguage
  */
  
  @Schema(name = "PreferredLanguage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PreferredLanguage")
  public JsonNullable<String> getPreferredLanguage() {
    return preferredLanguage;
  }

  public void setPreferredLanguage(JsonNullable<String> preferredLanguage) {
    this.preferredLanguage = preferredLanguage;
  }

  public ListingsProviderInfo sportsCategories(List<String> sportsCategories) {
    this.sportsCategories = JsonNullable.of(sportsCategories);
    return this;
  }

  public ListingsProviderInfo addSportsCategoriesItem(String sportsCategoriesItem) {
    if (this.sportsCategories == null || !this.sportsCategories.isPresent()) {
      this.sportsCategories = JsonNullable.of(new ArrayList<>());
    }
    this.sportsCategories.get().add(sportsCategoriesItem);
    return this;
  }

  /**
   * Get sportsCategories
   * @return sportsCategories
  */
  
  @Schema(name = "SportsCategories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SportsCategories")
  public JsonNullable<List<String>> getSportsCategories() {
    return sportsCategories;
  }

  public void setSportsCategories(JsonNullable<List<String>> sportsCategories) {
    this.sportsCategories = sportsCategories;
  }

  public ListingsProviderInfo type(String type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "Type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public JsonNullable<String> getType() {
    return type;
  }

  public void setType(JsonNullable<String> type) {
    this.type = type;
  }

  public ListingsProviderInfo userAgent(String userAgent) {
    this.userAgent = JsonNullable.of(userAgent);
    return this;
  }

  /**
   * Get userAgent
   * @return userAgent
  */
  
  @Schema(name = "UserAgent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserAgent")
  public JsonNullable<String> getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(JsonNullable<String> userAgent) {
    this.userAgent = userAgent;
  }

  public ListingsProviderInfo username(String username) {
    this.username = JsonNullable.of(username);
    return this;
  }

  /**
   * Get username
   * @return username
  */
  
  @Schema(name = "Username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Username")
  public JsonNullable<String> getUsername() {
    return username;
  }

  public void setUsername(JsonNullable<String> username) {
    this.username = username;
  }

  public ListingsProviderInfo zipCode(String zipCode) {
    this.zipCode = JsonNullable.of(zipCode);
    return this;
  }

  /**
   * Get zipCode
   * @return zipCode
  */
  
  @Schema(name = "ZipCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ZipCode")
  public JsonNullable<String> getZipCode() {
    return zipCode;
  }

  public void setZipCode(JsonNullable<String> zipCode) {
    this.zipCode = zipCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingsProviderInfo listingsProviderInfo = (ListingsProviderInfo) o;
    return equalsNullable(this.channelMappings, listingsProviderInfo.channelMappings) &&
        equalsNullable(this.country, listingsProviderInfo.country) &&
        Objects.equals(this.enableAllTuners, listingsProviderInfo.enableAllTuners) &&
        equalsNullable(this.enabledTuners, listingsProviderInfo.enabledTuners) &&
        equalsNullable(this.id, listingsProviderInfo.id) &&
        equalsNullable(this.kidsCategories, listingsProviderInfo.kidsCategories) &&
        equalsNullable(this.listingsId, listingsProviderInfo.listingsId) &&
        equalsNullable(this.movieCategories, listingsProviderInfo.movieCategories) &&
        equalsNullable(this.moviePrefix, listingsProviderInfo.moviePrefix) &&
        equalsNullable(this.newsCategories, listingsProviderInfo.newsCategories) &&
        equalsNullable(this.password, listingsProviderInfo.password) &&
        equalsNullable(this.path, listingsProviderInfo.path) &&
        equalsNullable(this.preferredLanguage, listingsProviderInfo.preferredLanguage) &&
        equalsNullable(this.sportsCategories, listingsProviderInfo.sportsCategories) &&
        equalsNullable(this.type, listingsProviderInfo.type) &&
        equalsNullable(this.userAgent, listingsProviderInfo.userAgent) &&
        equalsNullable(this.username, listingsProviderInfo.username) &&
        equalsNullable(this.zipCode, listingsProviderInfo.zipCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(channelMappings), hashCodeNullable(country), enableAllTuners, hashCodeNullable(enabledTuners), hashCodeNullable(id), hashCodeNullable(kidsCategories), hashCodeNullable(listingsId), hashCodeNullable(movieCategories), hashCodeNullable(moviePrefix), hashCodeNullable(newsCategories), hashCodeNullable(password), hashCodeNullable(path), hashCodeNullable(preferredLanguage), hashCodeNullable(sportsCategories), hashCodeNullable(type), hashCodeNullable(userAgent), hashCodeNullable(username), hashCodeNullable(zipCode));
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
    sb.append("class ListingsProviderInfo {\n");
    sb.append("    channelMappings: ").append(toIndentedString(channelMappings)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    enableAllTuners: ").append(toIndentedString(enableAllTuners)).append("\n");
    sb.append("    enabledTuners: ").append(toIndentedString(enabledTuners)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kidsCategories: ").append(toIndentedString(kidsCategories)).append("\n");
    sb.append("    listingsId: ").append(toIndentedString(listingsId)).append("\n");
    sb.append("    movieCategories: ").append(toIndentedString(movieCategories)).append("\n");
    sb.append("    moviePrefix: ").append(toIndentedString(moviePrefix)).append("\n");
    sb.append("    newsCategories: ").append(toIndentedString(newsCategories)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    preferredLanguage: ").append(toIndentedString(preferredLanguage)).append("\n");
    sb.append("    sportsCategories: ").append(toIndentedString(sportsCategories)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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

