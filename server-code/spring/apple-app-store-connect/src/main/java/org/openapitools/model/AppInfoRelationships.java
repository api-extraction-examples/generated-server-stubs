package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppCategoryRelationshipsParent;
import org.openapitools.model.AppEncryptionDeclarationRelationshipsApp;
import org.openapitools.model.AppInfoRelationshipsAgeRatingDeclaration;
import org.openapitools.model.AppInfoRelationshipsAppInfoLocalizations;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppInfoRelationships
 */

@JsonTypeName("AppInfo_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppInfoRelationships {

  private AppInfoRelationshipsAgeRatingDeclaration ageRatingDeclaration;

  private AppEncryptionDeclarationRelationshipsApp app;

  private AppInfoRelationshipsAppInfoLocalizations appInfoLocalizations;

  private AppCategoryRelationshipsParent primaryCategory;

  private AppCategoryRelationshipsParent primarySubcategoryOne;

  private AppCategoryRelationshipsParent primarySubcategoryTwo;

  private AppCategoryRelationshipsParent secondaryCategory;

  private AppCategoryRelationshipsParent secondarySubcategoryOne;

  private AppCategoryRelationshipsParent secondarySubcategoryTwo;

  public AppInfoRelationships ageRatingDeclaration(AppInfoRelationshipsAgeRatingDeclaration ageRatingDeclaration) {
    this.ageRatingDeclaration = ageRatingDeclaration;
    return this;
  }

  /**
   * Get ageRatingDeclaration
   * @return ageRatingDeclaration
  */
  @Valid 
  @Schema(name = "ageRatingDeclaration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ageRatingDeclaration")
  public AppInfoRelationshipsAgeRatingDeclaration getAgeRatingDeclaration() {
    return ageRatingDeclaration;
  }

  public void setAgeRatingDeclaration(AppInfoRelationshipsAgeRatingDeclaration ageRatingDeclaration) {
    this.ageRatingDeclaration = ageRatingDeclaration;
  }

  public AppInfoRelationships app(AppEncryptionDeclarationRelationshipsApp app) {
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

  public AppInfoRelationships appInfoLocalizations(AppInfoRelationshipsAppInfoLocalizations appInfoLocalizations) {
    this.appInfoLocalizations = appInfoLocalizations;
    return this;
  }

  /**
   * Get appInfoLocalizations
   * @return appInfoLocalizations
  */
  @Valid 
  @Schema(name = "appInfoLocalizations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appInfoLocalizations")
  public AppInfoRelationshipsAppInfoLocalizations getAppInfoLocalizations() {
    return appInfoLocalizations;
  }

  public void setAppInfoLocalizations(AppInfoRelationshipsAppInfoLocalizations appInfoLocalizations) {
    this.appInfoLocalizations = appInfoLocalizations;
  }

  public AppInfoRelationships primaryCategory(AppCategoryRelationshipsParent primaryCategory) {
    this.primaryCategory = primaryCategory;
    return this;
  }

  /**
   * Get primaryCategory
   * @return primaryCategory
  */
  @Valid 
  @Schema(name = "primaryCategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primaryCategory")
  public AppCategoryRelationshipsParent getPrimaryCategory() {
    return primaryCategory;
  }

  public void setPrimaryCategory(AppCategoryRelationshipsParent primaryCategory) {
    this.primaryCategory = primaryCategory;
  }

  public AppInfoRelationships primarySubcategoryOne(AppCategoryRelationshipsParent primarySubcategoryOne) {
    this.primarySubcategoryOne = primarySubcategoryOne;
    return this;
  }

  /**
   * Get primarySubcategoryOne
   * @return primarySubcategoryOne
  */
  @Valid 
  @Schema(name = "primarySubcategoryOne", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primarySubcategoryOne")
  public AppCategoryRelationshipsParent getPrimarySubcategoryOne() {
    return primarySubcategoryOne;
  }

  public void setPrimarySubcategoryOne(AppCategoryRelationshipsParent primarySubcategoryOne) {
    this.primarySubcategoryOne = primarySubcategoryOne;
  }

  public AppInfoRelationships primarySubcategoryTwo(AppCategoryRelationshipsParent primarySubcategoryTwo) {
    this.primarySubcategoryTwo = primarySubcategoryTwo;
    return this;
  }

  /**
   * Get primarySubcategoryTwo
   * @return primarySubcategoryTwo
  */
  @Valid 
  @Schema(name = "primarySubcategoryTwo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primarySubcategoryTwo")
  public AppCategoryRelationshipsParent getPrimarySubcategoryTwo() {
    return primarySubcategoryTwo;
  }

  public void setPrimarySubcategoryTwo(AppCategoryRelationshipsParent primarySubcategoryTwo) {
    this.primarySubcategoryTwo = primarySubcategoryTwo;
  }

  public AppInfoRelationships secondaryCategory(AppCategoryRelationshipsParent secondaryCategory) {
    this.secondaryCategory = secondaryCategory;
    return this;
  }

  /**
   * Get secondaryCategory
   * @return secondaryCategory
  */
  @Valid 
  @Schema(name = "secondaryCategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondaryCategory")
  public AppCategoryRelationshipsParent getSecondaryCategory() {
    return secondaryCategory;
  }

  public void setSecondaryCategory(AppCategoryRelationshipsParent secondaryCategory) {
    this.secondaryCategory = secondaryCategory;
  }

  public AppInfoRelationships secondarySubcategoryOne(AppCategoryRelationshipsParent secondarySubcategoryOne) {
    this.secondarySubcategoryOne = secondarySubcategoryOne;
    return this;
  }

  /**
   * Get secondarySubcategoryOne
   * @return secondarySubcategoryOne
  */
  @Valid 
  @Schema(name = "secondarySubcategoryOne", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondarySubcategoryOne")
  public AppCategoryRelationshipsParent getSecondarySubcategoryOne() {
    return secondarySubcategoryOne;
  }

  public void setSecondarySubcategoryOne(AppCategoryRelationshipsParent secondarySubcategoryOne) {
    this.secondarySubcategoryOne = secondarySubcategoryOne;
  }

  public AppInfoRelationships secondarySubcategoryTwo(AppCategoryRelationshipsParent secondarySubcategoryTwo) {
    this.secondarySubcategoryTwo = secondarySubcategoryTwo;
    return this;
  }

  /**
   * Get secondarySubcategoryTwo
   * @return secondarySubcategoryTwo
  */
  @Valid 
  @Schema(name = "secondarySubcategoryTwo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondarySubcategoryTwo")
  public AppCategoryRelationshipsParent getSecondarySubcategoryTwo() {
    return secondarySubcategoryTwo;
  }

  public void setSecondarySubcategoryTwo(AppCategoryRelationshipsParent secondarySubcategoryTwo) {
    this.secondarySubcategoryTwo = secondarySubcategoryTwo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppInfoRelationships appInfoRelationships = (AppInfoRelationships) o;
    return Objects.equals(this.ageRatingDeclaration, appInfoRelationships.ageRatingDeclaration) &&
        Objects.equals(this.app, appInfoRelationships.app) &&
        Objects.equals(this.appInfoLocalizations, appInfoRelationships.appInfoLocalizations) &&
        Objects.equals(this.primaryCategory, appInfoRelationships.primaryCategory) &&
        Objects.equals(this.primarySubcategoryOne, appInfoRelationships.primarySubcategoryOne) &&
        Objects.equals(this.primarySubcategoryTwo, appInfoRelationships.primarySubcategoryTwo) &&
        Objects.equals(this.secondaryCategory, appInfoRelationships.secondaryCategory) &&
        Objects.equals(this.secondarySubcategoryOne, appInfoRelationships.secondarySubcategoryOne) &&
        Objects.equals(this.secondarySubcategoryTwo, appInfoRelationships.secondarySubcategoryTwo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageRatingDeclaration, app, appInfoLocalizations, primaryCategory, primarySubcategoryOne, primarySubcategoryTwo, secondaryCategory, secondarySubcategoryOne, secondarySubcategoryTwo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppInfoRelationships {\n");
    sb.append("    ageRatingDeclaration: ").append(toIndentedString(ageRatingDeclaration)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    appInfoLocalizations: ").append(toIndentedString(appInfoLocalizations)).append("\n");
    sb.append("    primaryCategory: ").append(toIndentedString(primaryCategory)).append("\n");
    sb.append("    primarySubcategoryOne: ").append(toIndentedString(primarySubcategoryOne)).append("\n");
    sb.append("    primarySubcategoryTwo: ").append(toIndentedString(primarySubcategoryTwo)).append("\n");
    sb.append("    secondaryCategory: ").append(toIndentedString(secondaryCategory)).append("\n");
    sb.append("    secondarySubcategoryOne: ").append(toIndentedString(secondarySubcategoryOne)).append("\n");
    sb.append("    secondarySubcategoryTwo: ").append(toIndentedString(secondarySubcategoryTwo)).append("\n");
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

