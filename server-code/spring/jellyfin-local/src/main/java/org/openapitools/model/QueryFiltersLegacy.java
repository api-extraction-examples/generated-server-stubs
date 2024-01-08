package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * QueryFiltersLegacy
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class QueryFiltersLegacy {

  @Valid
  private JsonNullable<List<String>> genres = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> officialRatings = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<Integer>> years = JsonNullable.<List<Integer>>undefined();

  public QueryFiltersLegacy genres(List<String> genres) {
    this.genres = JsonNullable.of(genres);
    return this;
  }

  public QueryFiltersLegacy addGenresItem(String genresItem) {
    if (this.genres == null || !this.genres.isPresent()) {
      this.genres = JsonNullable.of(new ArrayList<>());
    }
    this.genres.get().add(genresItem);
    return this;
  }

  /**
   * Get genres
   * @return genres
  */
  
  @Schema(name = "Genres", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Genres")
  public JsonNullable<List<String>> getGenres() {
    return genres;
  }

  public void setGenres(JsonNullable<List<String>> genres) {
    this.genres = genres;
  }

  public QueryFiltersLegacy officialRatings(List<String> officialRatings) {
    this.officialRatings = JsonNullable.of(officialRatings);
    return this;
  }

  public QueryFiltersLegacy addOfficialRatingsItem(String officialRatingsItem) {
    if (this.officialRatings == null || !this.officialRatings.isPresent()) {
      this.officialRatings = JsonNullable.of(new ArrayList<>());
    }
    this.officialRatings.get().add(officialRatingsItem);
    return this;
  }

  /**
   * Get officialRatings
   * @return officialRatings
  */
  
  @Schema(name = "OfficialRatings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OfficialRatings")
  public JsonNullable<List<String>> getOfficialRatings() {
    return officialRatings;
  }

  public void setOfficialRatings(JsonNullable<List<String>> officialRatings) {
    this.officialRatings = officialRatings;
  }

  public QueryFiltersLegacy tags(List<String> tags) {
    this.tags = JsonNullable.of(tags);
    return this;
  }

  public QueryFiltersLegacy addTagsItem(String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.of(new ArrayList<>());
    }
    this.tags.get().add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  
  @Schema(name = "Tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Tags")
  public JsonNullable<List<String>> getTags() {
    return tags;
  }

  public void setTags(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }

  public QueryFiltersLegacy years(List<Integer> years) {
    this.years = JsonNullable.of(years);
    return this;
  }

  public QueryFiltersLegacy addYearsItem(Integer yearsItem) {
    if (this.years == null || !this.years.isPresent()) {
      this.years = JsonNullable.of(new ArrayList<>());
    }
    this.years.get().add(yearsItem);
    return this;
  }

  /**
   * Get years
   * @return years
  */
  
  @Schema(name = "Years", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Years")
  public JsonNullable<List<Integer>> getYears() {
    return years;
  }

  public void setYears(JsonNullable<List<Integer>> years) {
    this.years = years;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryFiltersLegacy queryFiltersLegacy = (QueryFiltersLegacy) o;
    return equalsNullable(this.genres, queryFiltersLegacy.genres) &&
        equalsNullable(this.officialRatings, queryFiltersLegacy.officialRatings) &&
        equalsNullable(this.tags, queryFiltersLegacy.tags) &&
        equalsNullable(this.years, queryFiltersLegacy.years);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(genres), hashCodeNullable(officialRatings), hashCodeNullable(tags), hashCodeNullable(years));
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
    sb.append("class QueryFiltersLegacy {\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    officialRatings: ").append(toIndentedString(officialRatings)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    years: ").append(toIndentedString(years)).append("\n");
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

