package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets RecommendationType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public enum RecommendationType {
  
  SIMILARTORECENTLYPLAYED("SimilarToRecentlyPlayed"),
  
  SIMILARTOLIKEDITEM("SimilarToLikedItem"),
  
  HASDIRECTORFROMRECENTLYPLAYED("HasDirectorFromRecentlyPlayed"),
  
  HASACTORFROMRECENTLYPLAYED("HasActorFromRecentlyPlayed"),
  
  HASLIKEDDIRECTOR("HasLikedDirector"),
  
  HASLIKEDACTOR("HasLikedActor");

  private String value;

  RecommendationType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RecommendationType fromValue(String value) {
    for (RecommendationType b : RecommendationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

