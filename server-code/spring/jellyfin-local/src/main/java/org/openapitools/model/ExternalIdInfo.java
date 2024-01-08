package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ExternalIdMediaType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents the external id information for serialization to the client.
 */

@Schema(name = "ExternalIdInfo", description = "Represents the external id information for serialization to the client.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ExternalIdInfo {

  private JsonNullable<String> key = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private ExternalIdMediaType type;

  private JsonNullable<String> urlFormatString = JsonNullable.<String>undefined();

  public ExternalIdInfo key(String key) {
    this.key = JsonNullable.of(key);
    return this;
  }

  /**
   * Gets or sets the unique key for this id. This key should be unique across all providers.
   * @return key
  */
  
  @Schema(name = "Key", description = "Gets or sets the unique key for this id. This key should be unique across all providers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Key")
  public JsonNullable<String> getKey() {
    return key;
  }

  public void setKey(JsonNullable<String> key) {
    this.key = key;
  }

  public ExternalIdInfo name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets or sets the display name of the external id provider (IE: IMDB, MusicBrainz, etc).
   * @return name
  */
  
  @Schema(name = "Name", description = "Gets or sets the display name of the external id provider (IE: IMDB, MusicBrainz, etc).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public ExternalIdInfo type(ExternalIdMediaType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "Type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public ExternalIdMediaType getType() {
    return type;
  }

  public void setType(ExternalIdMediaType type) {
    this.type = type;
  }

  public ExternalIdInfo urlFormatString(String urlFormatString) {
    this.urlFormatString = JsonNullable.of(urlFormatString);
    return this;
  }

  /**
   * Gets or sets the URL format string.
   * @return urlFormatString
  */
  
  @Schema(name = "UrlFormatString", description = "Gets or sets the URL format string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UrlFormatString")
  public JsonNullable<String> getUrlFormatString() {
    return urlFormatString;
  }

  public void setUrlFormatString(JsonNullable<String> urlFormatString) {
    this.urlFormatString = urlFormatString;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalIdInfo externalIdInfo = (ExternalIdInfo) o;
    return equalsNullable(this.key, externalIdInfo.key) &&
        equalsNullable(this.name, externalIdInfo.name) &&
        Objects.equals(this.type, externalIdInfo.type) &&
        equalsNullable(this.urlFormatString, externalIdInfo.urlFormatString);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(key), hashCodeNullable(name), type, hashCodeNullable(urlFormatString));
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
    sb.append("class ExternalIdInfo {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    urlFormatString: ").append(toIndentedString(urlFormatString)).append("\n");
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

