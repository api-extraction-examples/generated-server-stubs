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
 * PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress
 */

@JsonTypeName("postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments_debtorAddress")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress {

  private String buildingNumber;

  private String city;

  private String country;

  private String countrySubDivision;

  private String postalCode;

  private String street;

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  /**
   * Get buildingNumber
   * @return buildingNumber
  */
  @Size(min = 1, max = 256) 
  @Schema(name = "buildingNumber", example = "15", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buildingNumber")
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  @Size(min = 1, max = 256) 
  @Schema(name = "city", example = "City", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * ISO 3166 ALPHA2 country code
   * @return country
  */
  @Pattern(regexp = "^[A-Z]{2}$") 
  @Schema(name = "country", example = "CC", description = "ISO 3166 ALPHA2 country code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress countrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

  /**
   * Get countrySubDivision
   * @return countrySubDivision
  */
  @Size(min = 1, max = 256) 
  @Schema(name = "countrySubDivision", example = "Division", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countrySubDivision")
  public String getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
  */
  @Size(min = 1, max = 256) 
  @Schema(name = "postalCode", example = "PostCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Get street
   * @return street
  */
  @Size(min = 1, max = 70) 
  @Schema(name = "street", example = "Street", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress = (PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress) o;
    return Objects.equals(this.buildingNumber, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress.buildingNumber) &&
        Objects.equals(this.city, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress.city) &&
        Objects.equals(this.country, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress.country) &&
        Objects.equals(this.countrySubDivision, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress.countrySubDivision) &&
        Objects.equals(this.postalCode, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress.postalCode) &&
        Objects.equals(this.street, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildingNumber, city, country, countrySubDivision, postalCode, street);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress {\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
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

