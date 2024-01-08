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
 * Address
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:25.642267-04:00[America/Lower_Princes]")
public class Address {

  private String addressAddition;

  private String city;

  private String countryIsoCode;

  private String district;

  private String street;

  private String zipCode;

  public Address addressAddition(String addressAddition) {
    this.addressAddition = addressAddition;
    return this;
  }

  /**
   * address addition
   * @return addressAddition
  */
  
  @Schema(name = "addressAddition", description = "address addition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addressAddition")
  public String getAddressAddition() {
    return addressAddition;
  }

  public void setAddressAddition(String addressAddition) {
    this.addressAddition = addressAddition;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

  /**
   * city
   * @return city
  */
  
  @Schema(name = "city", description = "city", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address countryIsoCode(String countryIsoCode) {
    this.countryIsoCode = countryIsoCode;
    return this;
  }

  /**
   * ISO A2 country code
   * @return countryIsoCode
  */
  
  @Schema(name = "countryIsoCode", description = "ISO A2 country code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countryIsoCode")
  public String getCountryIsoCode() {
    return countryIsoCode;
  }

  public void setCountryIsoCode(String countryIsoCode) {
    this.countryIsoCode = countryIsoCode;
  }

  public Address district(String district) {
    this.district = district;
    return this;
  }

  /**
   * district, area of city
   * @return district
  */
  
  @Schema(name = "district", description = "district, area of city", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("district")
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public Address street(String street) {
    this.street = street;
    return this;
  }

  /**
   * street and house number, if applicable
   * @return street
  */
  
  @Schema(name = "street", description = "street and house number, if applicable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Address zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * postal code
   * @return zipCode
  */
  
  @Schema(name = "zipCode", description = "postal code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zipCode")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addressAddition, address.addressAddition) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.countryIsoCode, address.countryIsoCode) &&
        Objects.equals(this.district, address.district) &&
        Objects.equals(this.street, address.street) &&
        Objects.equals(this.zipCode, address.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressAddition, city, countryIsoCode, district, street, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    addressAddition: ").append(toIndentedString(addressAddition)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryIsoCode: ").append(toIndentedString(countryIsoCode)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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

