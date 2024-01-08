package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a user&#39;s preferences.
 */

@Schema(name = "Preferences", description = "Represents a user's preferences.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Preferences {

  private String postingColonDefaultColonLanguage;

  private Boolean postingColonDefaultColonSensitive;

  /**
   * Default visibility for new posts. Equivalent to [Source#privacy](https://docs.joinmastodon.org/entities/source/#privacy).
   */
  public enum PostingColonDefaultColonVisibilityEnum {
    PUBLIC("public"),
    
    UNLISTED("unlisted"),
    
    PRIVATE("private"),
    
    DIRECT("direct");

    private String value;

    PostingColonDefaultColonVisibilityEnum(String value) {
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
    public static PostingColonDefaultColonVisibilityEnum fromValue(String value) {
      for (PostingColonDefaultColonVisibilityEnum b : PostingColonDefaultColonVisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PostingColonDefaultColonVisibilityEnum postingColonDefaultColonVisibility;

  /**
   * Whether media attachments should be automatically displayed or blurred/hidden.
   */
  public enum ReadingColonExpandColonMediaEnum {
    DEFAULT("default"),
    
    SHOW_ALL("show_all"),
    
    HIDE_ALL("hide_all");

    private String value;

    ReadingColonExpandColonMediaEnum(String value) {
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
    public static ReadingColonExpandColonMediaEnum fromValue(String value) {
      for (ReadingColonExpandColonMediaEnum b : ReadingColonExpandColonMediaEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ReadingColonExpandColonMediaEnum readingColonExpandColonMedia;

  private Boolean readingColonExpandColonSpoilers;

  public Preferences postingColonDefaultColonLanguage(String postingColonDefaultColonLanguage) {
    this.postingColonDefaultColonLanguage = postingColonDefaultColonLanguage;
    return this;
  }

  /**
   * Default language for new posts. Equivalent to [Source#language](https://docs.joinmastodon.org/entities/source/#language). ISO 639-1 language two-letter code, or null
   * @return postingColonDefaultColonLanguage
  */
  
  @Schema(name = "posting:default:language", description = "Default language for new posts. Equivalent to [Source#language](https://docs.joinmastodon.org/entities/source/#language). ISO 639-1 language two-letter code, or null", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("posting:default:language")
  public String getPostingColonDefaultColonLanguage() {
    return postingColonDefaultColonLanguage;
  }

  public void setPostingColonDefaultColonLanguage(String postingColonDefaultColonLanguage) {
    this.postingColonDefaultColonLanguage = postingColonDefaultColonLanguage;
  }

  public Preferences postingColonDefaultColonSensitive(Boolean postingColonDefaultColonSensitive) {
    this.postingColonDefaultColonSensitive = postingColonDefaultColonSensitive;
    return this;
  }

  /**
   * Default sensitivity flag for new posts. Equivalent to [Source#sensitive](https://docs.joinmastodon.org/entities/source/#sensitive).
   * @return postingColonDefaultColonSensitive
  */
  
  @Schema(name = "posting:default:sensitive", description = "Default sensitivity flag for new posts. Equivalent to [Source#sensitive](https://docs.joinmastodon.org/entities/source/#sensitive).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("posting:default:sensitive")
  public Boolean getPostingColonDefaultColonSensitive() {
    return postingColonDefaultColonSensitive;
  }

  public void setPostingColonDefaultColonSensitive(Boolean postingColonDefaultColonSensitive) {
    this.postingColonDefaultColonSensitive = postingColonDefaultColonSensitive;
  }

  public Preferences postingColonDefaultColonVisibility(PostingColonDefaultColonVisibilityEnum postingColonDefaultColonVisibility) {
    this.postingColonDefaultColonVisibility = postingColonDefaultColonVisibility;
    return this;
  }

  /**
   * Default visibility for new posts. Equivalent to [Source#privacy](https://docs.joinmastodon.org/entities/source/#privacy).
   * @return postingColonDefaultColonVisibility
  */
  
  @Schema(name = "posting:default:visibility", description = "Default visibility for new posts. Equivalent to [Source#privacy](https://docs.joinmastodon.org/entities/source/#privacy).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("posting:default:visibility")
  public PostingColonDefaultColonVisibilityEnum getPostingColonDefaultColonVisibility() {
    return postingColonDefaultColonVisibility;
  }

  public void setPostingColonDefaultColonVisibility(PostingColonDefaultColonVisibilityEnum postingColonDefaultColonVisibility) {
    this.postingColonDefaultColonVisibility = postingColonDefaultColonVisibility;
  }

  public Preferences readingColonExpandColonMedia(ReadingColonExpandColonMediaEnum readingColonExpandColonMedia) {
    this.readingColonExpandColonMedia = readingColonExpandColonMedia;
    return this;
  }

  /**
   * Whether media attachments should be automatically displayed or blurred/hidden.
   * @return readingColonExpandColonMedia
  */
  
  @Schema(name = "reading:expand:media", description = "Whether media attachments should be automatically displayed or blurred/hidden.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reading:expand:media")
  public ReadingColonExpandColonMediaEnum getReadingColonExpandColonMedia() {
    return readingColonExpandColonMedia;
  }

  public void setReadingColonExpandColonMedia(ReadingColonExpandColonMediaEnum readingColonExpandColonMedia) {
    this.readingColonExpandColonMedia = readingColonExpandColonMedia;
  }

  public Preferences readingColonExpandColonSpoilers(Boolean readingColonExpandColonSpoilers) {
    this.readingColonExpandColonSpoilers = readingColonExpandColonSpoilers;
    return this;
  }

  /**
   * Whether CWs should be expanded by default.
   * @return readingColonExpandColonSpoilers
  */
  
  @Schema(name = "reading:expand:spoilers", description = "Whether CWs should be expanded by default.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reading:expand:spoilers")
  public Boolean getReadingColonExpandColonSpoilers() {
    return readingColonExpandColonSpoilers;
  }

  public void setReadingColonExpandColonSpoilers(Boolean readingColonExpandColonSpoilers) {
    this.readingColonExpandColonSpoilers = readingColonExpandColonSpoilers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Preferences preferences = (Preferences) o;
    return Objects.equals(this.postingColonDefaultColonLanguage, preferences.postingColonDefaultColonLanguage) &&
        Objects.equals(this.postingColonDefaultColonSensitive, preferences.postingColonDefaultColonSensitive) &&
        Objects.equals(this.postingColonDefaultColonVisibility, preferences.postingColonDefaultColonVisibility) &&
        Objects.equals(this.readingColonExpandColonMedia, preferences.readingColonExpandColonMedia) &&
        Objects.equals(this.readingColonExpandColonSpoilers, preferences.readingColonExpandColonSpoilers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postingColonDefaultColonLanguage, postingColonDefaultColonSensitive, postingColonDefaultColonVisibility, readingColonExpandColonMedia, readingColonExpandColonSpoilers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Preferences {\n");
    sb.append("    postingColonDefaultColonLanguage: ").append(toIndentedString(postingColonDefaultColonLanguage)).append("\n");
    sb.append("    postingColonDefaultColonSensitive: ").append(toIndentedString(postingColonDefaultColonSensitive)).append("\n");
    sb.append("    postingColonDefaultColonVisibility: ").append(toIndentedString(postingColonDefaultColonVisibility)).append("\n");
    sb.append("    readingColonExpandColonMedia: ").append(toIndentedString(readingColonExpandColonMedia)).append("\n");
    sb.append("    readingColonExpandColonSpoilers: ").append(toIndentedString(readingColonExpandColonSpoilers)).append("\n");
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

