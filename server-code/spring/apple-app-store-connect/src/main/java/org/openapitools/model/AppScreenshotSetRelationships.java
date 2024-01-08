package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppPreviewSetRelationshipsAppStoreVersionLocalization;
import org.openapitools.model.AppScreenshotSetRelationshipsAppScreenshots;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppScreenshotSetRelationships
 */

@JsonTypeName("AppScreenshotSet_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppScreenshotSetRelationships {

  private AppScreenshotSetRelationshipsAppScreenshots appScreenshots;

  private AppPreviewSetRelationshipsAppStoreVersionLocalization appStoreVersionLocalization;

  public AppScreenshotSetRelationships appScreenshots(AppScreenshotSetRelationshipsAppScreenshots appScreenshots) {
    this.appScreenshots = appScreenshots;
    return this;
  }

  /**
   * Get appScreenshots
   * @return appScreenshots
  */
  @Valid 
  @Schema(name = "appScreenshots", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appScreenshots")
  public AppScreenshotSetRelationshipsAppScreenshots getAppScreenshots() {
    return appScreenshots;
  }

  public void setAppScreenshots(AppScreenshotSetRelationshipsAppScreenshots appScreenshots) {
    this.appScreenshots = appScreenshots;
  }

  public AppScreenshotSetRelationships appStoreVersionLocalization(AppPreviewSetRelationshipsAppStoreVersionLocalization appStoreVersionLocalization) {
    this.appStoreVersionLocalization = appStoreVersionLocalization;
    return this;
  }

  /**
   * Get appStoreVersionLocalization
   * @return appStoreVersionLocalization
  */
  @Valid 
  @Schema(name = "appStoreVersionLocalization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appStoreVersionLocalization")
  public AppPreviewSetRelationshipsAppStoreVersionLocalization getAppStoreVersionLocalization() {
    return appStoreVersionLocalization;
  }

  public void setAppStoreVersionLocalization(AppPreviewSetRelationshipsAppStoreVersionLocalization appStoreVersionLocalization) {
    this.appStoreVersionLocalization = appStoreVersionLocalization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppScreenshotSetRelationships appScreenshotSetRelationships = (AppScreenshotSetRelationships) o;
    return Objects.equals(this.appScreenshots, appScreenshotSetRelationships.appScreenshots) &&
        Objects.equals(this.appStoreVersionLocalization, appScreenshotSetRelationships.appStoreVersionLocalization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appScreenshots, appStoreVersionLocalization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppScreenshotSetRelationships {\n");
    sb.append("    appScreenshots: ").append(toIndentedString(appScreenshots)).append("\n");
    sb.append("    appStoreVersionLocalization: ").append(toIndentedString(appStoreVersionLocalization)).append("\n");
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

