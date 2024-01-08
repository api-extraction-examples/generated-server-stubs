package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppPreviewSetRelationshipsAppPreviews;
import org.openapitools.model.AppPreviewSetRelationshipsAppStoreVersionLocalization;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppPreviewSetRelationships
 */

@JsonTypeName("AppPreviewSet_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppPreviewSetRelationships {

  private AppPreviewSetRelationshipsAppPreviews appPreviews;

  private AppPreviewSetRelationshipsAppStoreVersionLocalization appStoreVersionLocalization;

  public AppPreviewSetRelationships appPreviews(AppPreviewSetRelationshipsAppPreviews appPreviews) {
    this.appPreviews = appPreviews;
    return this;
  }

  /**
   * Get appPreviews
   * @return appPreviews
  */
  @Valid 
  @Schema(name = "appPreviews", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appPreviews")
  public AppPreviewSetRelationshipsAppPreviews getAppPreviews() {
    return appPreviews;
  }

  public void setAppPreviews(AppPreviewSetRelationshipsAppPreviews appPreviews) {
    this.appPreviews = appPreviews;
  }

  public AppPreviewSetRelationships appStoreVersionLocalization(AppPreviewSetRelationshipsAppStoreVersionLocalization appStoreVersionLocalization) {
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
    AppPreviewSetRelationships appPreviewSetRelationships = (AppPreviewSetRelationships) o;
    return Objects.equals(this.appPreviews, appPreviewSetRelationships.appPreviews) &&
        Objects.equals(this.appStoreVersionLocalization, appPreviewSetRelationships.appStoreVersionLocalization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appPreviews, appStoreVersionLocalization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPreviewSetRelationships {\n");
    sb.append("    appPreviews: ").append(toIndentedString(appPreviews)).append("\n");
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

