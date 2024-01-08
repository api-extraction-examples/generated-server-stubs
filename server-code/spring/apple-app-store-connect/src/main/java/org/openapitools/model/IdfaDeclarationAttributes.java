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
 * IdfaDeclarationAttributes
 */

@JsonTypeName("IdfaDeclaration_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class IdfaDeclarationAttributes {

  private Boolean attributesActionWithPreviousAd;

  private Boolean attributesAppInstallationToPreviousAd;

  private Boolean honorsLimitedAdTracking;

  private Boolean servesAds;

  public IdfaDeclarationAttributes attributesActionWithPreviousAd(Boolean attributesActionWithPreviousAd) {
    this.attributesActionWithPreviousAd = attributesActionWithPreviousAd;
    return this;
  }

  /**
   * Get attributesActionWithPreviousAd
   * @return attributesActionWithPreviousAd
  */
  
  @Schema(name = "attributesActionWithPreviousAd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributesActionWithPreviousAd")
  public Boolean getAttributesActionWithPreviousAd() {
    return attributesActionWithPreviousAd;
  }

  public void setAttributesActionWithPreviousAd(Boolean attributesActionWithPreviousAd) {
    this.attributesActionWithPreviousAd = attributesActionWithPreviousAd;
  }

  public IdfaDeclarationAttributes attributesAppInstallationToPreviousAd(Boolean attributesAppInstallationToPreviousAd) {
    this.attributesAppInstallationToPreviousAd = attributesAppInstallationToPreviousAd;
    return this;
  }

  /**
   * Get attributesAppInstallationToPreviousAd
   * @return attributesAppInstallationToPreviousAd
  */
  
  @Schema(name = "attributesAppInstallationToPreviousAd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributesAppInstallationToPreviousAd")
  public Boolean getAttributesAppInstallationToPreviousAd() {
    return attributesAppInstallationToPreviousAd;
  }

  public void setAttributesAppInstallationToPreviousAd(Boolean attributesAppInstallationToPreviousAd) {
    this.attributesAppInstallationToPreviousAd = attributesAppInstallationToPreviousAd;
  }

  public IdfaDeclarationAttributes honorsLimitedAdTracking(Boolean honorsLimitedAdTracking) {
    this.honorsLimitedAdTracking = honorsLimitedAdTracking;
    return this;
  }

  /**
   * Get honorsLimitedAdTracking
   * @return honorsLimitedAdTracking
  */
  
  @Schema(name = "honorsLimitedAdTracking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("honorsLimitedAdTracking")
  public Boolean getHonorsLimitedAdTracking() {
    return honorsLimitedAdTracking;
  }

  public void setHonorsLimitedAdTracking(Boolean honorsLimitedAdTracking) {
    this.honorsLimitedAdTracking = honorsLimitedAdTracking;
  }

  public IdfaDeclarationAttributes servesAds(Boolean servesAds) {
    this.servesAds = servesAds;
    return this;
  }

  /**
   * Get servesAds
   * @return servesAds
  */
  
  @Schema(name = "servesAds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    IdfaDeclarationAttributes idfaDeclarationAttributes = (IdfaDeclarationAttributes) o;
    return Objects.equals(this.attributesActionWithPreviousAd, idfaDeclarationAttributes.attributesActionWithPreviousAd) &&
        Objects.equals(this.attributesAppInstallationToPreviousAd, idfaDeclarationAttributes.attributesAppInstallationToPreviousAd) &&
        Objects.equals(this.honorsLimitedAdTracking, idfaDeclarationAttributes.honorsLimitedAdTracking) &&
        Objects.equals(this.servesAds, idfaDeclarationAttributes.servesAds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributesActionWithPreviousAd, attributesAppInstallationToPreviousAd, honorsLimitedAdTracking, servesAds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdfaDeclarationAttributes {\n");
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

