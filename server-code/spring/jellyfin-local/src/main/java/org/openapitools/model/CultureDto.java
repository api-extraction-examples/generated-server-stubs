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
 * Class CultureDto.
 */

@Schema(name = "CultureDto", description = "Class CultureDto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class CultureDto {

  private JsonNullable<String> displayName = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> threeLetterISOLanguageName = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> threeLetterISOLanguageNames = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> twoLetterISOLanguageName = JsonNullable.<String>undefined();

  public CultureDto displayName(String displayName) {
    this.displayName = JsonNullable.of(displayName);
    return this;
  }

  /**
   * Gets or sets the display name.
   * @return displayName
  */
  
  @Schema(name = "DisplayName", description = "Gets or sets the display name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DisplayName")
  public JsonNullable<String> getDisplayName() {
    return displayName;
  }

  public void setDisplayName(JsonNullable<String> displayName) {
    this.displayName = displayName;
  }

  public CultureDto name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets or sets the name.
   * @return name
  */
  
  @Schema(name = "Name", description = "Gets or sets the name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public CultureDto threeLetterISOLanguageName(String threeLetterISOLanguageName) {
    this.threeLetterISOLanguageName = JsonNullable.of(threeLetterISOLanguageName);
    return this;
  }

  /**
   * Gets or sets the name of the three letter ISO language.
   * @return threeLetterISOLanguageName
  */
  
  @Schema(name = "ThreeLetterISOLanguageName", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets or sets the name of the three letter ISO language.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ThreeLetterISOLanguageName")
  public JsonNullable<String> getThreeLetterISOLanguageName() {
    return threeLetterISOLanguageName;
  }

  public void setThreeLetterISOLanguageName(JsonNullable<String> threeLetterISOLanguageName) {
    this.threeLetterISOLanguageName = threeLetterISOLanguageName;
  }

  public CultureDto threeLetterISOLanguageNames(List<String> threeLetterISOLanguageNames) {
    this.threeLetterISOLanguageNames = JsonNullable.of(threeLetterISOLanguageNames);
    return this;
  }

  public CultureDto addThreeLetterISOLanguageNamesItem(String threeLetterISOLanguageNamesItem) {
    if (this.threeLetterISOLanguageNames == null || !this.threeLetterISOLanguageNames.isPresent()) {
      this.threeLetterISOLanguageNames = JsonNullable.of(new ArrayList<>());
    }
    this.threeLetterISOLanguageNames.get().add(threeLetterISOLanguageNamesItem);
    return this;
  }

  /**
   * Get threeLetterISOLanguageNames
   * @return threeLetterISOLanguageNames
  */
  
  @Schema(name = "ThreeLetterISOLanguageNames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ThreeLetterISOLanguageNames")
  public JsonNullable<List<String>> getThreeLetterISOLanguageNames() {
    return threeLetterISOLanguageNames;
  }

  public void setThreeLetterISOLanguageNames(JsonNullable<List<String>> threeLetterISOLanguageNames) {
    this.threeLetterISOLanguageNames = threeLetterISOLanguageNames;
  }

  public CultureDto twoLetterISOLanguageName(String twoLetterISOLanguageName) {
    this.twoLetterISOLanguageName = JsonNullable.of(twoLetterISOLanguageName);
    return this;
  }

  /**
   * Gets or sets the name of the two letter ISO language.
   * @return twoLetterISOLanguageName
  */
  
  @Schema(name = "TwoLetterISOLanguageName", description = "Gets or sets the name of the two letter ISO language.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TwoLetterISOLanguageName")
  public JsonNullable<String> getTwoLetterISOLanguageName() {
    return twoLetterISOLanguageName;
  }

  public void setTwoLetterISOLanguageName(JsonNullable<String> twoLetterISOLanguageName) {
    this.twoLetterISOLanguageName = twoLetterISOLanguageName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CultureDto cultureDto = (CultureDto) o;
    return equalsNullable(this.displayName, cultureDto.displayName) &&
        equalsNullable(this.name, cultureDto.name) &&
        equalsNullable(this.threeLetterISOLanguageName, cultureDto.threeLetterISOLanguageName) &&
        equalsNullable(this.threeLetterISOLanguageNames, cultureDto.threeLetterISOLanguageNames) &&
        equalsNullable(this.twoLetterISOLanguageName, cultureDto.twoLetterISOLanguageName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(displayName), hashCodeNullable(name), hashCodeNullable(threeLetterISOLanguageName), hashCodeNullable(threeLetterISOLanguageNames), hashCodeNullable(twoLetterISOLanguageName));
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
    sb.append("class CultureDto {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    threeLetterISOLanguageName: ").append(toIndentedString(threeLetterISOLanguageName)).append("\n");
    sb.append("    threeLetterISOLanguageNames: ").append(toIndentedString(threeLetterISOLanguageNames)).append("\n");
    sb.append("    twoLetterISOLanguageName: ").append(toIndentedString(twoLetterISOLanguageName)).append("\n");
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

