package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppEncryptionDeclarationRelationshipsApp;
import org.openapitools.model.AppStoreReviewDetailRelationshipsAppStoreVersion;
import org.openapitools.model.BetaGroupRelationshipsBetaTesters;
import org.openapitools.model.BuildRelationshipsAppEncryptionDeclaration;
import org.openapitools.model.BuildRelationshipsBetaAppReviewSubmission;
import org.openapitools.model.BuildRelationshipsBetaBuildLocalizations;
import org.openapitools.model.BuildRelationshipsBuildBetaDetail;
import org.openapitools.model.BuildRelationshipsIcons;
import org.openapitools.model.BuildRelationshipsPreReleaseVersion;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BuildRelationships
 */

@JsonTypeName("Build_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BuildRelationships {

  private AppEncryptionDeclarationRelationshipsApp app;

  private BuildRelationshipsAppEncryptionDeclaration appEncryptionDeclaration;

  private AppStoreReviewDetailRelationshipsAppStoreVersion appStoreVersion;

  private BuildRelationshipsBetaAppReviewSubmission betaAppReviewSubmission;

  private BuildRelationshipsBetaBuildLocalizations betaBuildLocalizations;

  private BuildRelationshipsBuildBetaDetail buildBetaDetail;

  private BuildRelationshipsIcons icons;

  private BetaGroupRelationshipsBetaTesters individualTesters;

  private BuildRelationshipsPreReleaseVersion preReleaseVersion;

  public BuildRelationships app(AppEncryptionDeclarationRelationshipsApp app) {
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

  public BuildRelationships appEncryptionDeclaration(BuildRelationshipsAppEncryptionDeclaration appEncryptionDeclaration) {
    this.appEncryptionDeclaration = appEncryptionDeclaration;
    return this;
  }

  /**
   * Get appEncryptionDeclaration
   * @return appEncryptionDeclaration
  */
  @Valid 
  @Schema(name = "appEncryptionDeclaration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appEncryptionDeclaration")
  public BuildRelationshipsAppEncryptionDeclaration getAppEncryptionDeclaration() {
    return appEncryptionDeclaration;
  }

  public void setAppEncryptionDeclaration(BuildRelationshipsAppEncryptionDeclaration appEncryptionDeclaration) {
    this.appEncryptionDeclaration = appEncryptionDeclaration;
  }

  public BuildRelationships appStoreVersion(AppStoreReviewDetailRelationshipsAppStoreVersion appStoreVersion) {
    this.appStoreVersion = appStoreVersion;
    return this;
  }

  /**
   * Get appStoreVersion
   * @return appStoreVersion
  */
  @Valid 
  @Schema(name = "appStoreVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appStoreVersion")
  public AppStoreReviewDetailRelationshipsAppStoreVersion getAppStoreVersion() {
    return appStoreVersion;
  }

  public void setAppStoreVersion(AppStoreReviewDetailRelationshipsAppStoreVersion appStoreVersion) {
    this.appStoreVersion = appStoreVersion;
  }

  public BuildRelationships betaAppReviewSubmission(BuildRelationshipsBetaAppReviewSubmission betaAppReviewSubmission) {
    this.betaAppReviewSubmission = betaAppReviewSubmission;
    return this;
  }

  /**
   * Get betaAppReviewSubmission
   * @return betaAppReviewSubmission
  */
  @Valid 
  @Schema(name = "betaAppReviewSubmission", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("betaAppReviewSubmission")
  public BuildRelationshipsBetaAppReviewSubmission getBetaAppReviewSubmission() {
    return betaAppReviewSubmission;
  }

  public void setBetaAppReviewSubmission(BuildRelationshipsBetaAppReviewSubmission betaAppReviewSubmission) {
    this.betaAppReviewSubmission = betaAppReviewSubmission;
  }

  public BuildRelationships betaBuildLocalizations(BuildRelationshipsBetaBuildLocalizations betaBuildLocalizations) {
    this.betaBuildLocalizations = betaBuildLocalizations;
    return this;
  }

  /**
   * Get betaBuildLocalizations
   * @return betaBuildLocalizations
  */
  @Valid 
  @Schema(name = "betaBuildLocalizations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("betaBuildLocalizations")
  public BuildRelationshipsBetaBuildLocalizations getBetaBuildLocalizations() {
    return betaBuildLocalizations;
  }

  public void setBetaBuildLocalizations(BuildRelationshipsBetaBuildLocalizations betaBuildLocalizations) {
    this.betaBuildLocalizations = betaBuildLocalizations;
  }

  public BuildRelationships buildBetaDetail(BuildRelationshipsBuildBetaDetail buildBetaDetail) {
    this.buildBetaDetail = buildBetaDetail;
    return this;
  }

  /**
   * Get buildBetaDetail
   * @return buildBetaDetail
  */
  @Valid 
  @Schema(name = "buildBetaDetail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buildBetaDetail")
  public BuildRelationshipsBuildBetaDetail getBuildBetaDetail() {
    return buildBetaDetail;
  }

  public void setBuildBetaDetail(BuildRelationshipsBuildBetaDetail buildBetaDetail) {
    this.buildBetaDetail = buildBetaDetail;
  }

  public BuildRelationships icons(BuildRelationshipsIcons icons) {
    this.icons = icons;
    return this;
  }

  /**
   * Get icons
   * @return icons
  */
  @Valid 
  @Schema(name = "icons", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("icons")
  public BuildRelationshipsIcons getIcons() {
    return icons;
  }

  public void setIcons(BuildRelationshipsIcons icons) {
    this.icons = icons;
  }

  public BuildRelationships individualTesters(BetaGroupRelationshipsBetaTesters individualTesters) {
    this.individualTesters = individualTesters;
    return this;
  }

  /**
   * Get individualTesters
   * @return individualTesters
  */
  @Valid 
  @Schema(name = "individualTesters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("individualTesters")
  public BetaGroupRelationshipsBetaTesters getIndividualTesters() {
    return individualTesters;
  }

  public void setIndividualTesters(BetaGroupRelationshipsBetaTesters individualTesters) {
    this.individualTesters = individualTesters;
  }

  public BuildRelationships preReleaseVersion(BuildRelationshipsPreReleaseVersion preReleaseVersion) {
    this.preReleaseVersion = preReleaseVersion;
    return this;
  }

  /**
   * Get preReleaseVersion
   * @return preReleaseVersion
  */
  @Valid 
  @Schema(name = "preReleaseVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preReleaseVersion")
  public BuildRelationshipsPreReleaseVersion getPreReleaseVersion() {
    return preReleaseVersion;
  }

  public void setPreReleaseVersion(BuildRelationshipsPreReleaseVersion preReleaseVersion) {
    this.preReleaseVersion = preReleaseVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildRelationships buildRelationships = (BuildRelationships) o;
    return Objects.equals(this.app, buildRelationships.app) &&
        Objects.equals(this.appEncryptionDeclaration, buildRelationships.appEncryptionDeclaration) &&
        Objects.equals(this.appStoreVersion, buildRelationships.appStoreVersion) &&
        Objects.equals(this.betaAppReviewSubmission, buildRelationships.betaAppReviewSubmission) &&
        Objects.equals(this.betaBuildLocalizations, buildRelationships.betaBuildLocalizations) &&
        Objects.equals(this.buildBetaDetail, buildRelationships.buildBetaDetail) &&
        Objects.equals(this.icons, buildRelationships.icons) &&
        Objects.equals(this.individualTesters, buildRelationships.individualTesters) &&
        Objects.equals(this.preReleaseVersion, buildRelationships.preReleaseVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, buildBetaDetail, icons, individualTesters, preReleaseVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildRelationships {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    appEncryptionDeclaration: ").append(toIndentedString(appEncryptionDeclaration)).append("\n");
    sb.append("    appStoreVersion: ").append(toIndentedString(appStoreVersion)).append("\n");
    sb.append("    betaAppReviewSubmission: ").append(toIndentedString(betaAppReviewSubmission)).append("\n");
    sb.append("    betaBuildLocalizations: ").append(toIndentedString(betaBuildLocalizations)).append("\n");
    sb.append("    buildBetaDetail: ").append(toIndentedString(buildBetaDetail)).append("\n");
    sb.append("    icons: ").append(toIndentedString(icons)).append("\n");
    sb.append("    individualTesters: ").append(toIndentedString(individualTesters)).append("\n");
    sb.append("    preReleaseVersion: ").append(toIndentedString(preReleaseVersion)).append("\n");
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

