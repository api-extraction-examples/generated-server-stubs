package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Country
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:25.642267-04:00[America/Lower_Princes]")
public class Country {

  private String countryId;

  private String isoCode;

  private String name;

  public Country() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Country(String countryId, String isoCode, String name) {
    this.countryId = countryId;
    this.isoCode = isoCode;
    this.name = name;
  }

  public Country countryId(String countryId) {
    this.countryId = countryId;
    return this;
  }

  /**
   * the country id
   * @return countryId
  */
  @NotNull 
  @Schema(name = "countryId", description = "the country id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("countryId")
  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }

  public Country isoCode(String isoCode) {
    this.isoCode = isoCode;
    return this;
  }

  /**
   * the country iso code
   * @return isoCode
  */
  @NotNull 
  @Schema(name = "isoCode", description = "the country iso code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isoCode")
  public String getIsoCode() {
    return isoCode;
  }

  public void setIsoCode(String isoCode) {
    this.isoCode = isoCode;
  }

  public Country name(String name) {
    this.name = name;
    return this;
  }

  /**
   * the country name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "the country name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
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
    Country country = (Country) o;
    return Objects.equals(this.countryId, country.countryId) &&
        Objects.equals(this.isoCode, country.isoCode) &&
        Objects.equals(this.name, country.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryId, isoCode, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    isoCode: ").append(toIndentedString(isoCode)).append("\n");
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

