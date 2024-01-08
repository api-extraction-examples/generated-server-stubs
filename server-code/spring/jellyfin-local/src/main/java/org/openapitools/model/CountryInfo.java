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
 * Class CountryInfo.
 */

@Schema(name = "CountryInfo", description = "Class CountryInfo.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class CountryInfo {

  private JsonNullable<String> displayName = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> threeLetterISORegionName = JsonNullable.<String>undefined();

  private JsonNullable<String> twoLetterISORegionName = JsonNullable.<String>undefined();

  public CountryInfo displayName(String displayName) {
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

  public CountryInfo name(String name) {
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

  public CountryInfo threeLetterISORegionName(String threeLetterISORegionName) {
    this.threeLetterISORegionName = JsonNullable.of(threeLetterISORegionName);
    return this;
  }

  /**
   * Gets or sets the name of the three letter ISO region.
   * @return threeLetterISORegionName
  */
  
  @Schema(name = "ThreeLetterISORegionName", description = "Gets or sets the name of the three letter ISO region.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ThreeLetterISORegionName")
  public JsonNullable<String> getThreeLetterISORegionName() {
    return threeLetterISORegionName;
  }

  public void setThreeLetterISORegionName(JsonNullable<String> threeLetterISORegionName) {
    this.threeLetterISORegionName = threeLetterISORegionName;
  }

  public CountryInfo twoLetterISORegionName(String twoLetterISORegionName) {
    this.twoLetterISORegionName = JsonNullable.of(twoLetterISORegionName);
    return this;
  }

  /**
   * Gets or sets the name of the two letter ISO region.
   * @return twoLetterISORegionName
  */
  
  @Schema(name = "TwoLetterISORegionName", description = "Gets or sets the name of the two letter ISO region.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TwoLetterISORegionName")
  public JsonNullable<String> getTwoLetterISORegionName() {
    return twoLetterISORegionName;
  }

  public void setTwoLetterISORegionName(JsonNullable<String> twoLetterISORegionName) {
    this.twoLetterISORegionName = twoLetterISORegionName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryInfo countryInfo = (CountryInfo) o;
    return equalsNullable(this.displayName, countryInfo.displayName) &&
        equalsNullable(this.name, countryInfo.name) &&
        equalsNullable(this.threeLetterISORegionName, countryInfo.threeLetterISORegionName) &&
        equalsNullable(this.twoLetterISORegionName, countryInfo.twoLetterISORegionName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(displayName), hashCodeNullable(name), hashCodeNullable(threeLetterISORegionName), hashCodeNullable(twoLetterISORegionName));
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
    sb.append("class CountryInfo {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    threeLetterISORegionName: ").append(toIndentedString(threeLetterISORegionName)).append("\n");
    sb.append("    twoLetterISORegionName: ").append(toIndentedString(twoLetterISORegionName)).append("\n");
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

