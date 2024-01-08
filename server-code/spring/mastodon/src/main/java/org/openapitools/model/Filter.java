package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a user-defined filter for determining which statuses should not be shown to the user.
 */

@Schema(name = "Filter", description = "Represents a user-defined filter for determining which statuses should not be shown to the user.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Filter {

  /**
   * Gets or Sets context
   */
  public enum ContextEnum {
    HOME("home"),
    
    NOTIFICATIONS("notifications"),
    
    PUBLIC("public"),
    
    THREAD("thread");

    private String value;

    ContextEnum(String value) {
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
    public static ContextEnum fromValue(String value) {
      for (ContextEnum b : ContextEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<ContextEnum> context;

  private String expiresAt;

  private String id;

  private Boolean irreversible;

  private String phrase;

  private Boolean wholeWord;

  public Filter context(List<ContextEnum> context) {
    this.context = context;
    return this;
  }

  public Filter addContextItem(ContextEnum contextItem) {
    if (this.context == null) {
      this.context = new ArrayList<>();
    }
    this.context.add(contextItem);
    return this;
  }

  /**
   * The contexts in which the filter should be applied.
   * @return context
  */
  
  @Schema(name = "context", description = "The contexts in which the filter should be applied.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("context")
  public List<ContextEnum> getContext() {
    return context;
  }

  public void setContext(List<ContextEnum> context) {
    this.context = context;
  }

  public Filter expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * When the filter should no longer be applied. ISO 8601 Datetime, or null if the filter does not expire
   * @return expiresAt
  */
  
  @Schema(name = "expires_at", description = "When the filter should no longer be applied. ISO 8601 Datetime, or null if the filter does not expire", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expires_at")
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Filter id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the filter in the database. Cast from an integer, but not guaranteed to be a number.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the filter in the database. Cast from an integer, but not guaranteed to be a number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Filter irreversible(Boolean irreversible) {
    this.irreversible = irreversible;
    return this;
  }

  /**
   * Should matching entities in home and notifications be dropped by the server?
   * @return irreversible
  */
  
  @Schema(name = "irreversible", description = "Should matching entities in home and notifications be dropped by the server?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("irreversible")
  public Boolean getIrreversible() {
    return irreversible;
  }

  public void setIrreversible(Boolean irreversible) {
    this.irreversible = irreversible;
  }

  public Filter phrase(String phrase) {
    this.phrase = phrase;
    return this;
  }

  /**
   * The text to be filtered.
   * @return phrase
  */
  
  @Schema(name = "phrase", description = "The text to be filtered.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phrase")
  public String getPhrase() {
    return phrase;
  }

  public void setPhrase(String phrase) {
    this.phrase = phrase;
  }

  public Filter wholeWord(Boolean wholeWord) {
    this.wholeWord = wholeWord;
    return this;
  }

  /**
   * Should the filter consider word boundaries?
   * @return wholeWord
  */
  
  @Schema(name = "whole_word", description = "Should the filter consider word boundaries?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("whole_word")
  public Boolean getWholeWord() {
    return wholeWord;
  }

  public void setWholeWord(Boolean wholeWord) {
    this.wholeWord = wholeWord;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filter filter = (Filter) o;
    return Objects.equals(this.context, filter.context) &&
        Objects.equals(this.expiresAt, filter.expiresAt) &&
        Objects.equals(this.id, filter.id) &&
        Objects.equals(this.irreversible, filter.irreversible) &&
        Objects.equals(this.phrase, filter.phrase) &&
        Objects.equals(this.wholeWord, filter.wholeWord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, expiresAt, id, irreversible, phrase, wholeWord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    irreversible: ").append(toIndentedString(irreversible)).append("\n");
    sb.append("    phrase: ").append(toIndentedString(phrase)).append("\n");
    sb.append("    wholeWord: ").append(toIndentedString(wholeWord)).append("\n");
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

