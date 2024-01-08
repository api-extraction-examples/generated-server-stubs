package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppStoreReviewDetailRelationshipsAppStoreVersion;
import org.openapitools.model.AppStoreVersionLocalizationRelationshipsAppPreviewSets;
import org.openapitools.model.AppStoreVersionLocalizationRelationshipsAppScreenshotSets;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppStoreVersionLocalizationRelationships
 */

@JsonTypeName("AppStoreVersionLocalization_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppStoreVersionLocalizationRelationships {

  private AppStoreVersionLocalizationRelationshipsAppPreviewSets appPreviewSets;

  private AppStoreVersionLocalizationRelationshipsAppScreenshotSets appScreenshotSets;

  private AppStoreReviewDetailRelationshipsAppStoreVersion appStoreVersion;

  public AppStoreVersionLocalizationRelationships appPreviewSets(AppStoreVersionLocalizationRelationshipsAppPreviewSets appPreviewSets) {
    this.appPreviewSets = appPreviewSets;
    return this;
  }

  /**
   * Get appPreviewSets
   * @return appPreviewSets
  */
  @Valid 
  @Schema(name = "appPreviewSets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appPreviewSets")
  public AppStoreVersionLocalizationRelationshipsAppPreviewSets getAppPreviewSets() {
    return appPreviewSets;
  }

  public void setAppPreviewSets(AppStoreVersionLocalizationRelationshipsAppPreviewSets appPreviewSets) {
    this.appPreviewSets = appPreviewSets;
  }

  public AppStoreVersionLocalizationRelationships appScreenshotSets(AppStoreVersionLocalizationRelationshipsAppScreenshotSets appScreenshotSets) {
    this.appScreenshotSets = appScreenshotSets;
    return this;
  }

  /**
   * Get appScreenshotSets
   * @return appScreenshotSets
  */
  @Valid 
  @Schema(name = "appScreenshotSets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appScreenshotSets")
  public AppStoreVersionLocalizationRelationshipsAppScreenshotSets getAppScreenshotSets() {
    return appScreenshotSets;
  }

  public void setAppScreenshotSets(AppStoreVersionLocalizationRelationshipsAppScreenshotSets appScreenshotSets) {
    this.appScreenshotSets = appScreenshotSets;
  }

  public AppStoreVersionLocalizationRelationships appStoreVersion(AppStoreReviewDetailRelationshipsAppStoreVersion appStoreVersion) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreVersionLocalizationRelationships appStoreVersionLocalizationRelationships = (AppStoreVersionLocalizationRelationships) o;
    return Objects.equals(this.appPreviewSets, appStoreVersionLocalizationRelationships.appPreviewSets) &&
        Objects.equals(this.appScreenshotSets, appStoreVersionLocalizationRelationships.appScreenshotSets) &&
        Objects.equals(this.appStoreVersion, appStoreVersionLocalizationRelationships.appStoreVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appPreviewSets, appScreenshotSets, appStoreVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreVersionLocalizationRelationships {\n");
    sb.append("    appPreviewSets: ").append(toIndentedString(appPreviewSets)).append("\n");
    sb.append("    appScreenshotSets: ").append(toIndentedString(appScreenshotSets)).append("\n");
    sb.append("    appStoreVersion: ").append(toIndentedString(appStoreVersion)).append("\n");
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

