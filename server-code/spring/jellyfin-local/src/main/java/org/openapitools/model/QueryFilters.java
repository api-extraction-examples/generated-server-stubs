package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.NameGuidPair;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * QueryFilters
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class QueryFilters {

  @Valid
  private JsonNullable<List<@Valid NameGuidPair>> genres = JsonNullable.<List<@Valid NameGuidPair>>undefined();

  @Valid
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public QueryFilters genres(List<@Valid NameGuidPair> genres) {
    this.genres = JsonNullable.of(genres);
    return this;
  }

  public QueryFilters addGenresItem(NameGuidPair genresItem) {
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
  @Valid 
  @Schema(name = "Genres", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Genres")
  public JsonNullable<List<@Valid NameGuidPair>> getGenres() {
    return genres;
  }

  public void setGenres(JsonNullable<List<@Valid NameGuidPair>> genres) {
    this.genres = genres;
  }

  public QueryFilters tags(List<String> tags) {
    this.tags = JsonNullable.of(tags);
    return this;
  }

  public QueryFilters addTagsItem(String tagsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryFilters queryFilters = (QueryFilters) o;
    return equalsNullable(this.genres, queryFilters.genres) &&
        equalsNullable(this.tags, queryFilters.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(genres), hashCodeNullable(tags));
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
    sb.append("class QueryFilters {\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

