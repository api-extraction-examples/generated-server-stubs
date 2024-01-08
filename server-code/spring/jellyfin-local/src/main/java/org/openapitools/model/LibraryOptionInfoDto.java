package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
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
 * Library option info dto.
 */

@Schema(name = "LibraryOptionInfoDto", description = "Library option info dto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class LibraryOptionInfoDto {

  private Boolean defaultEnabled;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public LibraryOptionInfoDto defaultEnabled(Boolean defaultEnabled) {
    this.defaultEnabled = defaultEnabled;
    return this;
  }

  /**
   * Gets or sets a value indicating whether default enabled.
   * @return defaultEnabled
  */
  
  @Schema(name = "DefaultEnabled", description = "Gets or sets a value indicating whether default enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DefaultEnabled")
  public Boolean getDefaultEnabled() {
    return defaultEnabled;
  }

  public void setDefaultEnabled(Boolean defaultEnabled) {
    this.defaultEnabled = defaultEnabled;
  }

  public LibraryOptionInfoDto name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets or sets name.
   * @return name
  */
  
  @Schema(name = "Name", description = "Gets or sets name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryOptionInfoDto libraryOptionInfoDto = (LibraryOptionInfoDto) o;
    return Objects.equals(this.defaultEnabled, libraryOptionInfoDto.defaultEnabled) &&
        equalsNullable(this.name, libraryOptionInfoDto.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultEnabled, hashCodeNullable(name));
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
    sb.append("class LibraryOptionInfoDto {\n");
    sb.append("    defaultEnabled: ").append(toIndentedString(defaultEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

