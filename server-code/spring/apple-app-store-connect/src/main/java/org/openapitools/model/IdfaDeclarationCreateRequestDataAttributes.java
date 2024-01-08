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
 * IdfaDeclarationCreateRequestDataAttributes
 */

@JsonTypeName("IdfaDeclarationCreateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class IdfaDeclarationCreateRequestDataAttributes {

  private Boolean attributesActionWithPreviousAd;

  private Boolean attributesAppInstallationToPreviousAd;

  private Boolean honorsLimitedAdTracking;

  private Boolean servesAds;

  public IdfaDeclarationCreateRequestDataAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IdfaDeclarationCreateRequestDataAttributes(Boolean attributesActionWithPreviousAd, Boolean attributesAppInstallationToPreviousAd, Boolean honorsLimitedAdTracking, Boolean servesAds) {
    this.attributesActionWithPreviousAd = attributesActionWithPreviousAd;
    this.attributesAppInstallationToPreviousAd = attributesAppInstallationToPreviousAd;
    this.honorsLimitedAdTracking = honorsLimitedAdTracking;
    this.servesAds = servesAds;
  }

  public IdfaDeclarationCreateRequestDataAttributes attributesActionWithPreviousAd(Boolean attributesActionWithPreviousAd) {
    this.attributesActionWithPreviousAd = attributesActionWithPreviousAd;
    return this;
  }

  /**
   * Get attributesActionWithPreviousAd
   * @return attributesActionWithPreviousAd
  */
  @NotNull 
  @Schema(name = "attributesActionWithPreviousAd", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attributesActionWithPreviousAd")
  public Boolean getAttributesActionWithPreviousAd() {
    return attributesActionWithPreviousAd;
  }

  public void setAttributesActionWithPreviousAd(Boolean attributesActionWithPreviousAd) {
    this.attributesActionWithPreviousAd = attributesActionWithPreviousAd;
  }

  public IdfaDeclarationCreateRequestDataAttributes attributesAppInstallationToPreviousAd(Boolean attributesAppInstallationToPreviousAd) {
    this.attributesAppInstallationToPreviousAd = attributesAppInstallationToPreviousAd;
    return this;
  }

  /**
   * Get attributesAppInstallationToPreviousAd
   * @return attributesAppInstallationToPreviousAd
  */
  @NotNull 
  @Schema(name = "attributesAppInstallationToPreviousAd", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attributesAppInstallationToPreviousAd")
  public Boolean getAttributesAppInstallationToPreviousAd() {
    return attributesAppInstallationToPreviousAd;
  }

  public void setAttributesAppInstallationToPreviousAd(Boolean attributesAppInstallationToPreviousAd) {
    this.attributesAppInstallationToPreviousAd = attributesAppInstallationToPreviousAd;
  }

  public IdfaDeclarationCreateRequestDataAttributes honorsLimitedAdTracking(Boolean honorsLimitedAdTracking) {
    this.honorsLimitedAdTracking = honorsLimitedAdTracking;
    return this;
  }

  /**
   * Get honorsLimitedAdTracking
   * @return honorsLimitedAdTracking
  */
  @NotNull 
  @Schema(name = "honorsLimitedAdTracking", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("honorsLimitedAdTracking")
  public Boolean getHonorsLimitedAdTracking() {
    return honorsLimitedAdTracking;
  }

  public void setHonorsLimitedAdTracking(Boolean honorsLimitedAdTracking) {
    this.honorsLimitedAdTracking = honorsLimitedAdTracking;
  }

  public IdfaDeclarationCreateRequestDataAttributes servesAds(Boolean servesAds) {
    this.servesAds = servesAds;
    return this;
  }

  /**
   * Get servesAds
   * @return servesAds
  */
  @NotNull 
  @Schema(name = "servesAds", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("servesAds")
  public Boolean getServesAds() {
    return servesAds;
  }

  public void setServesAds(Boolean servesAds) {
    this.servesAds = servesAds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdfaDeclarationCreateRequestDataAttributes idfaDeclarationCreateRequestDataAttributes = (IdfaDeclarationCreateRequestDataAttributes) o;
    return Objects.equals(this.attributesActionWithPreviousAd, idfaDeclarationCreateRequestDataAttributes.attributesActionWithPreviousAd) &&
        Objects.equals(this.attributesAppInstallationToPreviousAd, idfaDeclarationCreateRequestDataAttributes.attributesAppInstallationToPreviousAd) &&
        Objects.equals(this.honorsLimitedAdTracking, idfaDeclarationCreateRequestDataAttributes.honorsLimitedAdTracking) &&
        Objects.equals(this.servesAds, idfaDeclarationCreateRequestDataAttributes.servesAds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributesActionWithPreviousAd, attributesAppInstallationToPreviousAd, honorsLimitedAdTracking, servesAds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdfaDeclarationCreateRequestDataAttributes {\n");
    sb.append("    attributesActionWithPreviousAd: ").append(toIndentedString(attributesActionWithPreviousAd)).append("\n");
    sb.append("    attributesAppInstallationToPreviousAd: ").append(toIndentedString(attributesAppInstallationToPreviousAd)).append("\n");
    sb.append("    honorsLimitedAdTracking: ").append(toIndentedString(honorsLimitedAdTracking)).append("\n");
    sb.append("    servesAds: ").append(toIndentedString(servesAds)).append("\n");
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

