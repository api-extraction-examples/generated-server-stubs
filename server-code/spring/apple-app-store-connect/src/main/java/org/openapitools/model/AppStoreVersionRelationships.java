package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppEncryptionDeclarationRelationshipsApp;
import org.openapitools.model.AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail;
import org.openapitools.model.AppStoreVersionRelationshipsAgeRatingDeclaration;
import org.openapitools.model.AppStoreVersionRelationshipsAppStoreVersionLocalizations;
import org.openapitools.model.AppStoreVersionRelationshipsAppStoreVersionPhasedRelease;
import org.openapitools.model.AppStoreVersionRelationshipsAppStoreVersionSubmission;
import org.openapitools.model.AppStoreVersionRelationshipsBuild;
import org.openapitools.model.AppStoreVersionRelationshipsIdfaDeclaration;
import org.openapitools.model.AppStoreVersionRelationshipsRoutingAppCoverage;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppStoreVersionRelationships
 */

@JsonTypeName("AppStoreVersion_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppStoreVersionRelationships {

  @Deprecated
  private AppStoreVersionRelationshipsAgeRatingDeclaration ageRatingDeclaration;

  private AppEncryptionDeclarationRelationshipsApp app;

  private AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail appStoreReviewDetail;

  private AppStoreVersionRelationshipsAppStoreVersionLocalizations appStoreVersionLocalizations;

  private AppStoreVersionRelationshipsAppStoreVersionPhasedRelease appStoreVersionPhasedRelease;

  private AppStoreVersionRelationshipsAppStoreVersionSubmission appStoreVersionSubmission;

  private AppStoreVersionRelationshipsBuild build;

  private AppStoreVersionRelationshipsIdfaDeclaration idfaDeclaration;

  private AppStoreVersionRelationshipsRoutingAppCoverage routingAppCoverage;

  public AppStoreVersionRelationships ageRatingDeclaration(AppStoreVersionRelationshipsAgeRatingDeclaration ageRatingDeclaration) {
    this.ageRatingDeclaration = ageRatingDeclaration;
    return this;
  }

  /**
   * Get ageRatingDeclaration
   * @return ageRatingDeclaration
   * @deprecated
  */
  @Valid 
  @Schema(name = "ageRatingDeclaration", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ageRatingDeclaration")
  @Deprecated
  public AppStoreVersionRelationshipsAgeRatingDeclaration getAgeRatingDeclaration() {
    return ageRatingDeclaration;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setAgeRatingDeclaration(AppStoreVersionRelationshipsAgeRatingDeclaration ageRatingDeclaration) {
    this.ageRatingDeclaration = ageRatingDeclaration;
  }

  public AppStoreVersionRelationships app(AppEncryptionDeclarationRelationshipsApp app) {
    this.app = app;
    return this;
  }

  /**
   * Get app
   * @return app
  */
  @Valid 
  @Schema(name = "app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app")
  public AppEncryptionDeclarationRelationshipsApp getApp() {
    return app;
  }

  public void setApp(AppEncryptionDeclarationRelationshipsApp app) {
    this.app = app;
  }

  public AppStoreVersionRelationships appStoreReviewDetail(AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail appStoreReviewDetail) {
    this.appStoreReviewDetail = appStoreReviewDetail;
    return this;
  }

  /**
   * Get appStoreReviewDetail
   * @return appStoreReviewDetail
  */
  @Valid 
  @Schema(name = "appStoreReviewDetail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appStoreReviewDetail")
  public AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail getAppStoreReviewDetail() {
    return appStoreReviewDetail;
  }

  public void setAppStoreReviewDetail(AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail appStoreReviewDetail) {
    this.appStoreReviewDetail = appStoreReviewDetail;
  }

  public AppStoreVersionRelationships appStoreVersionLocalizations(AppStoreVersionRelationshipsAppStoreVersionLocalizations appStoreVersionLocalizations) {
    this.appStoreVersionLocalizations = appStoreVersionLocalizations;
    return this;
  }

  /**
   * Get appStoreVersionLocalizations
   * @return appStoreVersionLocalizations
  */
  @Valid 
  @Schema(name = "appStoreVersionLocalizations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appStoreVersionLocalizations")
  public AppStoreVersionRelationshipsAppStoreVersionLocalizations getAppStoreVersionLocalizations() {
    return appStoreVersionLocalizations;
  }

  public void setAppStoreVersionLocalizations(AppStoreVersionRelationshipsAppStoreVersionLocalizations appStoreVersionLocalizations) {
    this.appStoreVersionLocalizations = appStoreVersionLocalizations;
  }

  public AppStoreVersionRelationships appStoreVersionPhasedRelease(AppStoreVersionRelationshipsAppStoreVersionPhasedRelease appStoreVersionPhasedRelease) {
    this.appStoreVersionPhasedRelease = appStoreVersionPhasedRelease;
    return this;
  }

  /**
   * Get appStoreVersionPhasedRelease
   * @return appStoreVersionPhasedRelease
  */
  @Valid 
  @Schema(name = "appStoreVersionPhasedRelease", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appStoreVersionPhasedRelease")
  public AppStoreVersionRelationshipsAppStoreVersionPhasedRelease getAppStoreVersionPhasedRelease() {
    return appStoreVersionPhasedRelease;
  }

  public void setAppStoreVersionPhasedRelease(AppStoreVersionRelationshipsAppStoreVersionPhasedRelease appStoreVersionPhasedRelease) {
    this.appStoreVersionPhasedRelease = appStoreVersionPhasedRelease;
  }

  public AppStoreVersionRelationships appStoreVersionSubmission(AppStoreVersionRelationshipsAppStoreVersionSubmission appStoreVersionSubmission) {
    this.appStoreVersionSubmission = appStoreVersionSubmission;
    return this;
  }

  /**
   * Get appStoreVersionSubmission
   * @return appStoreVersionSubmission
  */
  @Valid 
  @Schema(name = "appStoreVersionSubmission", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appStoreVersionSubmission")
  public AppStoreVersionRelationshipsAppStoreVersionSubmission getAppStoreVersionSubmission() {
    return appStoreVersionSubmission;
  }

  public void setAppStoreVersionSubmission(AppStoreVersionRelationshipsAppStoreVersionSubmission appStoreVersionSubmission) {
    this.appStoreVersionSubmission = appStoreVersionSubmission;
  }

  public AppStoreVersionRelationships build(AppStoreVersionRelationshipsBuild build) {
    this.build = build;
    return this;
  }

  /**
   * Get build
   * @return build
  */
  @Valid 
  @Schema(name = "build", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("build")
  public AppStoreVersionRelationshipsBuild getBuild() {
    return build;
  }

  public void setBuild(AppStoreVersionRelationshipsBuild build) {
    this.build = build;
  }

  public AppStoreVersionRelationships idfaDeclaration(AppStoreVersionRelationshipsIdfaDeclaration idfaDeclaration) {
    this.idfaDeclaration = idfaDeclaration;
    return this;
  }

  /**
   * Get idfaDeclaration
   * @return idfaDeclaration
  */
  @Valid 
  @Schema(name = "idfaDeclaration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idfaDeclaration")
  public AppStoreVersionRelationshipsIdfaDeclaration getIdfaDeclaration() {
    return idfaDeclaration;
  }

  public void setIdfaDeclaration(AppStoreVersionRelationshipsIdfaDeclaration idfaDeclaration) {
    this.idfaDeclaration = idfaDeclaration;
  }

  public AppStoreVersionRelationships routingAppCoverage(AppStoreVersionRelationshipsRoutingAppCoverage routingAppCoverage) {
    this.routingAppCoverage = routingAppCoverage;
    return this;
  }

  /**
   * Get routingAppCoverage
   * @return routingAppCoverage
  */
  @Valid 
  @Schema(name = "routingAppCoverage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("routingAppCoverage")
  public AppStoreVersionRelationshipsRoutingAppCoverage getRoutingAppCoverage() {
    return routingAppCoverage;
  }

  public void setRoutingAppCoverage(AppStoreVersionRelationshipsRoutingAppCoverage routingAppCoverage) {
    this.routingAppCoverage = routingAppCoverage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreVersionRelationships appStoreVersionRelationships = (AppStoreVersionRelationships) o;
    return Objects.equals(this.ageRatingDeclaration, appStoreVersionRelationships.ageRatingDeclaration) &&
        Objects.equals(this.app, appStoreVersionRelationships.app) &&
        Objects.equals(this.appStoreReviewDetail, appStoreVersionRelationships.appStoreReviewDetail) &&
        Objects.equals(this.appStoreVersionLocalizations, appStoreVersionRelationships.appStoreVersionLocalizations) &&
        Objects.equals(this.appStoreVersionPhasedRelease, appStoreVersionRelationships.appStoreVersionPhasedRelease) &&
        Objects.equals(this.appStoreVersionSubmission, appStoreVersionRelationships.appStoreVersionSubmission) &&
        Objects.equals(this.build, appStoreVersionRelationships.build) &&
        Objects.equals(this.idfaDeclaration, appStoreVersionRelationships.idfaDeclaration) &&
        Objects.equals(this.routingAppCoverage, appStoreVersionRelationships.routingAppCoverage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageRatingDeclaration, app, appStoreReviewDetail, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, build, idfaDeclaration, routingAppCoverage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreVersionRelationships {\n");
    sb.append("    ageRatingDeclaration: ").append(toIndentedString(ageRatingDeclaration)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    appStoreReviewDetail: ").append(toIndentedString(appStoreReviewDetail)).append("\n");
    sb.append("    appStoreVersionLocalizations: ").append(toIndentedString(appStoreVersionLocalizations)).append("\n");
    sb.append("    appStoreVersionPhasedRelease: ").append(toIndentedString(appStoreVersionPhasedRelease)).append("\n");
    sb.append("    appStoreVersionSubmission: ").append(toIndentedString(appStoreVersionSubmission)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    idfaDeclaration: ").append(toIndentedString(idfaDeclaration)).append("\n");
    sb.append("    routingAppCoverage: ").append(toIndentedString(routingAppCoverage)).append("\n");
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

