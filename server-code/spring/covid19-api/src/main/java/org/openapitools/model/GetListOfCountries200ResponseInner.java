package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetListOfCountries200ResponseInner
 */

@JsonTypeName("getListOfCountries_200_response_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:30.536179-04:00[America/Lower_Princes]")
public class GetListOfCountries200ResponseInner {

  private String alpha2Code;

  private String alpha3Code;

  private Float latitude;

  private Float longitude;

  private String name;

  public GetListOfCountries200ResponseInner alpha2Code(String alpha2Code) {
    this.alpha2Code = alpha2Code;
    return this;
  }

  /**
   * Get alpha2Code
   * @return alpha2Code
  */
  
  @Schema(name = "alpha-2-code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alpha-2-code")
  public String getAlpha2Code() {
    return alpha2Code;
  }

  public void setAlpha2Code(String alpha2Code) {
    this.alpha2Code = alpha2Code;
  }

  public GetListOfCountries200ResponseInner alpha3Code(String alpha3Code) {
    this.alpha3Code = alpha3Code;
    return this;
  }

  /**
   * Get alpha3Code
   * @return alpha3Code
  */
  
  @Schema(name = "alpha-3-code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alpha-3-code")
  public String getAlpha3Code() {
    return alpha3Code;
  }

  public void setAlpha3Code(String alpha3Code) {
    this.alpha3Code = alpha3Code;
  }

  public GetListOfCountries200ResponseInner latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
  */
  
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public GetListOfCountries200ResponseInner longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
  */
  
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public GetListOfCountries200ResponseInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    GetListOfCountries200ResponseInner getListOfCountries200ResponseInner = (GetListOfCountries200ResponseInner) o;
    return Objects.equals(this.alpha2Code, getListOfCountries200ResponseInner.alpha2Code) &&
        Objects.equals(this.alpha3Code, getListOfCountries200ResponseInner.alpha3Code) &&
        Objects.equals(this.latitude, getListOfCountries200ResponseInner.latitude) &&
        Objects.equals(this.longitude, getListOfCountries200ResponseInner.longitude) &&
        Objects.equals(this.name, getListOfCountries200ResponseInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alpha2Code, alpha3Code, latitude, longitude, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetListOfCountries200ResponseInner {\n");
    sb.append("    alpha2Code: ").append(toIndentedString(alpha2Code)).append("\n");
    sb.append("    alpha3Code: ").append(toIndentedString(alpha3Code)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

