package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppRelationshipsAppInfos;
import org.openapitools.model.AppRelationshipsAppStoreVersions;
import org.openapitools.model.AppRelationshipsAvailableTerritories;
import org.openapitools.model.AppRelationshipsBetaAppLocalizations;
import org.openapitools.model.AppRelationshipsBetaAppReviewDetail;
import org.openapitools.model.AppRelationshipsBetaGroups;
import org.openapitools.model.AppRelationshipsBetaLicenseAgreement;
import org.openapitools.model.AppRelationshipsBuilds;
import org.openapitools.model.AppRelationshipsEndUserLicenseAgreement;
import org.openapitools.model.AppRelationshipsGameCenterEnabledVersions;
import org.openapitools.model.AppRelationshipsInAppPurchases;
import org.openapitools.model.AppRelationshipsPreOrder;
import org.openapitools.model.AppRelationshipsPreReleaseVersions;
import org.openapitools.model.AppRelationshipsPrices;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppRelationships
 */

@JsonTypeName("App_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppRelationships {

  private AppRelationshipsAppInfos appInfos;

  private AppRelationshipsAppStoreVersions appStoreVersions;

  private AppRelationshipsAvailableTerritories availableTerritories;

  private AppRelationshipsBetaAppLocalizations betaAppLocalizations;

  private AppRelationshipsBetaAppReviewDetail betaAppReviewDetail;

  private AppRelationshipsBetaGroups betaGroups;

  private AppRelationshipsBetaLicenseAgreement betaLicenseAgreement;

  private AppRelationshipsBuilds builds;

  private AppRelationshipsEndUserLicenseAgreement endUserLicenseAgreement;

  private AppRelationshipsGameCenterEnabledVersions gameCenterEnabledVersions;

  private AppRelationshipsInAppPurchases inAppPurchases;

  private AppRelationshipsPreOrder preOrder;

  private AppRelationshipsPreReleaseVersions preReleaseVersions;

  private AppRelationshipsPrices prices;

  public AppRelationships appInfos(AppRelationshipsAppInfos appInfos) {
    this.appInfos = appInfos;
    return this;
  }

  /**
   * Get appInfos
   * @return appInfos
  */
  @Valid 
  @Schema(name = "appInfos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appInfos")
  public AppRelationshipsAppInfos getAppInfos() {
    return appInfos;
  }

  public void setAppInfos(AppRelationshipsAppInfos appInfos) {
    this.appInfos = appInfos;
  }

  public AppRelationships appStoreVersions(AppRelationshipsAppStoreVersions appStoreVersions) {
    this.appStoreVersions = appStoreVersions;
    return this;
  }

  /**
   * Get appStoreVersions
   * @return appStoreVersions
  */
  @Valid 
  @Schema(name = "appStoreVersions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appStoreVersions")
  public AppRelationshipsAppStoreVersions getAppStoreVersions() {
    return appStoreVersions;
  }

  public void setAppStoreVersions(AppRelationshipsAppStoreVersions appStoreVersions) {
    this.appStoreVersions = appStoreVersions;
  }

  public AppRelationships availableTerritories(AppRelationshipsAvailableTerritories availableTerritories) {
    this.availableTerritories = availableTerritories;
    return this;
  }

  /**
   * Get availableTerritories
   * @return availableTerritories
  */
  @Valid 
  @Schema(name = "availableTerritories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availableTerritories")
  public AppRelationshipsAvailableTerritories getAvailableTerritories() {
    return availableTerritories;
  }

  public void setAvailableTerritories(AppRelationshipsAvailableTerritories availableTerritories) {
    this.availableTerritories = availableTerritories;
  }

  public AppRelationships betaAppLocalizations(AppRelationshipsBetaAppLocalizations betaAppLocalizations) {
    this.betaAppLocalizations = betaAppLocalizations;
    return this;
  }

  /**
   * Get betaAppLocalizations
   * @return betaAppLocalizations
  */
  @Valid 
  @Schema(name = "betaAppLocalizations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("betaAppLocalizations")
  public AppRelationshipsBetaAppLocalizations getBetaAppLocalizations() {
    return betaAppLocalizations;
  }

  public void setBetaAppLocalizations(AppRelationshipsBetaAppLocalizations betaAppLocalizations) {
    this.betaAppLocalizations = betaAppLocalizations;
  }

  public AppRelationships betaAppReviewDetail(AppRelationshipsBetaAppReviewDetail betaAppReviewDetail) {
    this.betaAppReviewDetail = betaAppReviewDetail;
    return this;
  }

  /**
   * Get betaAppReviewDetail
   * @return betaAppReviewDetail
  */
  @Valid 
  @Schema(name = "betaAppReviewDetail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("betaAppReviewDetail")
  public AppRelationshipsBetaAppReviewDetail getBetaAppReviewDetail() {
    return betaAppReviewDetail;
  }

  public void setBetaAppReviewDetail(AppRelationshipsBetaAppReviewDetail betaAppReviewDetail) {
    this.betaAppReviewDetail = betaAppReviewDetail;
  }

  public AppRelationships betaGroups(AppRelationshipsBetaGroups betaGroups) {
    this.betaGroups = betaGroups;
    return this;
  }

  /**
   * Get betaGroups
   * @return betaGroups
  */
  @Valid 
  @Schema(name = "betaGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("betaGroups")
  public AppRelationshipsBetaGroups getBetaGroups() {
    return betaGroups;
  }

  public void setBetaGroups(AppRelationshipsBetaGroups betaGroups) {
    this.betaGroups = betaGroups;
  }

  public AppRelationships betaLicenseAgreement(AppRelationshipsBetaLicenseAgreement betaLicenseAgreement) {
    this.betaLicenseAgreement = betaLicenseAgreement;
    return this;
  }

  /**
   * Get betaLicenseAgreement
   * @return betaLicenseAgreement
  */
  @Valid 
  @Schema(name = "betaLicenseAgreement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("betaLicenseAgreement")
  public AppRelationshipsBetaLicenseAgreement getBetaLicenseAgreement() {
    return betaLicenseAgreement;
  }

  public void setBetaLicenseAgreement(AppRelationshipsBetaLicenseAgreement betaLicenseAgreement) {
    this.betaLicenseAgreement = betaLicenseAgreement;
  }

  public AppRelationships builds(AppRelationshipsBuilds builds) {
    this.builds = builds;
    return this;
  }

  /**
   * Get builds
   * @return builds
  */
  @Valid 
  @Schema(name = "builds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("builds")
  public AppRelationshipsBuilds getBuilds() {
    return builds;
  }

  public void setBuilds(AppRelationshipsBuilds builds) {
    this.builds = builds;
  }

  public AppRelationships endUserLicenseAgreement(AppRelationshipsEndUserLicenseAgreement endUserLicenseAgreement) {
    this.endUserLicenseAgreement = endUserLicenseAgreement;
    return this;
  }

  /**
   * Get endUserLicenseAgreement
   * @return endUserLicenseAgreement
  */
  @Valid 
  @Schema(name = "endUserLicenseAgreement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endUserLicenseAgreement")
  public AppRelationshipsEndUserLicenseAgreement getEndUserLicenseAgreement() {
    return endUserLicenseAgreement;
  }

  public void setEndUserLicenseAgreement(AppRelationshipsEndUserLicenseAgreement endUserLicenseAgreement) {
    this.endUserLicenseAgreement = endUserLicenseAgreement;
  }

  public AppRelationships gameCenterEnabledVersions(AppRelationshipsGameCenterEnabledVersions gameCenterEnabledVersions) {
    this.gameCenterEnabledVersions = gameCenterEnabledVersions;
    return this;
  }

  /**
   * Get gameCenterEnabledVersions
   * @return gameCenterEnabledVersions
  */
  @Valid 
  @Schema(name = "gameCenterEnabledVersions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameCenterEnabledVersions")
  public AppRelationshipsGameCenterEnabledVersions getGameCenterEnabledVersions() {
    return gameCenterEnabledVersions;
  }

  public void setGameCenterEnabledVersions(AppRelationshipsGameCenterEnabledVersions gameCenterEnabledVersions) {
    this.gameCenterEnabledVersions = gameCenterEnabledVersions;
  }

  public AppRelationships inAppPurchases(AppRelationshipsInAppPurchases inAppPurchases) {
    this.inAppPurchases = inAppPurchases;
    return this;
  }

  /**
   * Get inAppPurchases
   * @return inAppPurchases
  */
  @Valid 
  @Schema(name = "inAppPurchases", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inAppPurchases")
  public AppRelationshipsInAppPurchases getInAppPurchases() {
    return inAppPurchases;
  }

  public void setInAppPurchases(AppRelationshipsInAppPurchases inAppPurchases) {
    this.inAppPurchases = inAppPurchases;
  }

  public AppRelationships preOrder(AppRelationshipsPreOrder preOrder) {
    this.preOrder = preOrder;
    return this;
  }

  /**
   * Get preOrder
   * @return preOrder
  */
  @Valid 
  @Schema(name = "preOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preOrder")
  public AppRelationshipsPreOrder getPreOrder() {
    return preOrder;
  }

  public void setPreOrder(AppRelationshipsPreOrder preOrder) {
    this.preOrder = preOrder;
  }

  public AppRelationships preReleaseVersions(AppRelationshipsPreReleaseVersions preReleaseVersions) {
    this.preReleaseVersions = preReleaseVersions;
    return this;
  }

  /**
   * Get preReleaseVersions
   * @return preReleaseVersions
  */
  @Valid 
  @Schema(name = "preReleaseVersions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preReleaseVersions")
  public AppRelationshipsPreReleaseVersions getPreReleaseVersions() {
    return preReleaseVersions;
  }

  public void setPreReleaseVersions(AppRelationshipsPreReleaseVersions preReleaseVersions) {
    this.preReleaseVersions = preReleaseVersions;
  }

  public AppRelationships prices(AppRelationshipsPrices prices) {
    this.prices = prices;
    return this;
  }

  /**
   * Get prices
   * @return prices
  */
  @Valid 
  @Schema(name = "prices", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prices")
  public AppRelationshipsPrices getPrices() {
    return prices;
  }

  public void setPrices(AppRelationshipsPrices prices) {
    this.prices = prices;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppRelationships appRelationships = (AppRelationships) o;
    return Objects.equals(this.appInfos, appRelationships.appInfos) &&
        Objects.equals(this.appStoreVersions, appRelationships.appStoreVersions) &&
        Objects.equals(this.availableTerritories, appRelationships.availableTerritories) &&
        Objects.equals(this.betaAppLocalizations, appRelationships.betaAppLocalizations) &&
        Objects.equals(this.betaAppReviewDetail, appRelationships.betaAppReviewDetail) &&
        Objects.equals(this.betaGroups, appRelationships.betaGroups) &&
        Objects.equals(this.betaLicenseAgreement, appRelationships.betaLicenseAgreement) &&
        Objects.equals(this.builds, appRelationships.builds) &&
        Objects.equals(this.endUserLicenseAgreement, appRelationships.endUserLicenseAgreement) &&
        Objects.equals(this.gameCenterEnabledVersions, appRelationships.gameCenterEnabledVersions) &&
        Objects.equals(this.inAppPurchases, appRelationships.inAppPurchases) &&
        Objects.equals(this.preOrder, appRelationships.preOrder) &&
        Objects.equals(this.preReleaseVersions, appRelationships.preReleaseVersions) &&
        Objects.equals(this.prices, appRelationships.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appInfos, appStoreVersions, availableTerritories, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, builds, endUserLicenseAgreement, gameCenterEnabledVersions, inAppPurchases, preOrder, preReleaseVersions, prices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppRelationships {\n");
    sb.append("    appInfos: ").append(toIndentedString(appInfos)).append("\n");
    sb.append("    appStoreVersions: ").append(toIndentedString(appStoreVersions)).append("\n");
    sb.append("    availableTerritories: ").append(toIndentedString(availableTerritories)).append("\n");
    sb.append("    betaAppLocalizations: ").append(toIndentedString(betaAppLocalizations)).append("\n");
    sb.append("    betaAppReviewDetail: ").append(toIndentedString(betaAppReviewDetail)).append("\n");
    sb.append("    betaGroups: ").append(toIndentedString(betaGroups)).append("\n");
    sb.append("    betaLicenseAgreement: ").append(toIndentedString(betaLicenseAgreement)).append("\n");
    sb.append("    builds: ").append(toIndentedString(builds)).append("\n");
    sb.append("    endUserLicenseAgreement: ").append(toIndentedString(endUserLicenseAgreement)).append("\n");
    sb.append("    gameCenterEnabledVersions: ").append(toIndentedString(gameCenterEnabledVersions)).append("\n");
    sb.append("    inAppPurchases: ").append(toIndentedString(inAppPurchases)).append("\n");
    sb.append("    preOrder: ").append(toIndentedString(preOrder)).append("\n");
    sb.append("    preReleaseVersions: ").append(toIndentedString(preReleaseVersions)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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

