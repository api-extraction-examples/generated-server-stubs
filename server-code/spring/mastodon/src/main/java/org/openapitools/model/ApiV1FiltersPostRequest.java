package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ApiV1FiltersPostRequest
 */

@JsonTypeName("_api_v1_filters_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1FiltersPostRequest {

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
  private List<ContextEnum> context = new ArrayList<>();

  private Integer expiresIn;

  private Boolean irreversible;

  private String phrase;

  private Boolean wholeWord;

  public ApiV1FiltersPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApiV1FiltersPostRequest(List<ContextEnum> context, String phrase) {
    this.context = context;
    this.phrase = phrase;
  }

  public ApiV1FiltersPostRequest context(List<ContextEnum> context) {
    this.context = context;
    return this;
  }

  public ApiV1FiltersPostRequest addContextItem(ContextEnum contextItem) {
    if (this.context == null) {
      this.context = new ArrayList<>();
    }
    this.context.add(contextItem);
    return this;
  }

  /**
   * Array of enumerable strings `home`, `notifications`, `public`, `thread`. At least one context must be specified.
   * @return context
  */
  @NotNull 
  @Schema(name = "context", description = "Array of enumerable strings `home`, `notifications`, `public`, `thread`. At least one context must be specified.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("context")
  public List<ContextEnum> getContext() {
    return context;
  }

  public void setContext(List<ContextEnum> context) {
    this.context = context;
  }

  public ApiV1FiltersPostRequest expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * Number of seconds from now the filter should expire. Otherwise, null for a filter that doesn't expire.
   * @return expiresIn
  */
  
  @Schema(name = "expires_in", description = "Number of seconds from now the filter should expire. Otherwise, null for a filter that doesn't expire.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expires_in")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public ApiV1FiltersPostRequest irreversible(Boolean irreversible) {
    this.irreversible = irreversible;
    return this;
  }

  /**
   * Should the server irreversibly drop matching entities from home and notifications?
   * @return irreversible
  */
  
  @Schema(name = "irreversible", description = "Should the server irreversibly drop matching entities from home and notifications?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("irreversible")
  public Boolean getIrreversible() {
    return irreversible;
  }

  public void setIrreversible(Boolean irreversible) {
    this.irreversible = irreversible;
  }

  public ApiV1FiltersPostRequest phrase(String phrase) {
    this.phrase = phrase;
    return this;
  }

  /**
   * Text to be filtered.
   * @return phrase
  */
  @NotNull 
  @Schema(name = "phrase", description = "Text to be filtered.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("phrase")
  public String getPhrase() {
    return phrase;
  }

  public void setPhrase(String phrase) {
    this.phrase = phrase;
  }

  public ApiV1FiltersPostRequest wholeWord(Boolean wholeWord) {
    this.wholeWord = wholeWord;
    return this;
  }

  /**
   * Consider word boundaries?
   * @return wholeWord
  */
  
  @Schema(name = "whole_word", description = "Consider word boundaries?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ApiV1FiltersPostRequest apiV1FiltersPostRequest = (ApiV1FiltersPostRequest) o;
    return Objects.equals(this.context, apiV1FiltersPostRequest.context) &&
        Objects.equals(this.expiresIn, apiV1FiltersPostRequest.expiresIn) &&
        Objects.equals(this.irreversible, apiV1FiltersPostRequest.irreversible) &&
        Objects.equals(this.phrase, apiV1FiltersPostRequest.phrase) &&
        Objects.equals(this.wholeWord, apiV1FiltersPostRequest.wholeWord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, expiresIn, irreversible, phrase, wholeWord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1FiltersPostRequest {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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

