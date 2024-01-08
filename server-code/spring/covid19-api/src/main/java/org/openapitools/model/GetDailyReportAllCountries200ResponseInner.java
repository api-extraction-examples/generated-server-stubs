package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GetDailyReportAllCountries200ResponseInnerProvinceInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetDailyReportAllCountries200ResponseInner
 */

@JsonTypeName("getDailyReportAllCountries_200_response_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:30.536179-04:00[America/Lower_Princes]")
public class GetDailyReportAllCountries200ResponseInner {

  private String country;

  private String date;

  private Float latitude;

  private Float longitude;

  @Valid
  private List<@Valid GetDailyReportAllCountries200ResponseInnerProvinceInner> province;

  public GetDailyReportAllCountries200ResponseInner country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  
  @Schema(name = "country", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public GetDailyReportAllCountries200ResponseInner date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  
  @Schema(name = "date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public GetDailyReportAllCountries200ResponseInner latitude(Float latitude) {
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

  public GetDailyReportAllCountries200ResponseInner longitude(Float longitude) {
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

  public GetDailyReportAllCountries200ResponseInner province(List<@Valid GetDailyReportAllCountries200ResponseInnerProvinceInner> province) {
    this.province = province;
    return this;
  }

  public GetDailyReportAllCountries200ResponseInner addProvinceItem(GetDailyReportAllCountries200ResponseInnerProvinceInner provinceItem) {
    if (this.province == null) {
      this.province = new ArrayList<>();
    }
    this.province.add(provinceItem);
    return this;
  }

  /**
   * Get province
   * @return province
  */
  @Valid 
  @Schema(name = "province", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("province")
  public List<@Valid GetDailyReportAllCountries200ResponseInnerProvinceInner> getProvince() {
    return province;
  }

  public void setProvince(List<@Valid GetDailyReportAllCountries200ResponseInnerProvinceInner> province) {
    this.province = province;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDailyReportAllCountries200ResponseInner getDailyReportAllCountries200ResponseInner = (GetDailyReportAllCountries200ResponseInner) o;
    return Objects.equals(this.country, getDailyReportAllCountries200ResponseInner.country) &&
        Objects.equals(this.date, getDailyReportAllCountries200ResponseInner.date) &&
        Objects.equals(this.latitude, getDailyReportAllCountries200ResponseInner.latitude) &&
        Objects.equals(this.longitude, getDailyReportAllCountries200ResponseInner.longitude) &&
        Objects.equals(this.province, getDailyReportAllCountries200ResponseInner.province);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, date, latitude, longitude, province);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDailyReportAllCountries200ResponseInner {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
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

