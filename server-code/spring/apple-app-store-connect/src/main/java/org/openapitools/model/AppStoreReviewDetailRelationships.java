package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppStoreReviewDetailRelationshipsAppStoreReviewAttachments;
import org.openapitools.model.AppStoreReviewDetailRelationshipsAppStoreVersion;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppStoreReviewDetailRelationships
 */

@JsonTypeName("AppStoreReviewDetail_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppStoreReviewDetailRelationships {

  private AppStoreReviewDetailRelationshipsAppStoreReviewAttachments appStoreReviewAttachments;

  private AppStoreReviewDetailRelationshipsAppStoreVersion appStoreVersion;

  public AppStoreReviewDetailRelationships appStoreReviewAttachments(AppStoreReviewDetailRelationshipsAppStoreReviewAttachments appStoreReviewAttachments) {
    this.appStoreReviewAttachments = appStoreReviewAttachments;
    return this;
  }

  /**
   * Get appStoreReviewAttachments
   * @return appStoreReviewAttachments
  */
  @Valid 
  @Schema(name = "appStoreReviewAttachments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appStoreReviewAttachments")
  public AppStoreReviewDetailRelationshipsAppStoreReviewAttachments getAppStoreReviewAttachments() {
    return appStoreReviewAttachments;
  }

  public void setAppStoreReviewAttachments(AppStoreReviewDetailRelationshipsAppStoreReviewAttachments appStoreReviewAttachments) {
    this.appStoreReviewAttachments = appStoreReviewAttachments;
  }

  public AppStoreReviewDetailRelationships appStoreVersion(AppStoreReviewDetailRelationshipsAppStoreVersion appStoreVersion) {
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
    AppStoreReviewDetailRelationships appStoreReviewDetailRelationships = (AppStoreReviewDetailRelationships) o;
    return Objects.equals(this.appStoreReviewAttachments, appStoreReviewDetailRelationships.appStoreReviewAttachments) &&
        Objects.equals(this.appStoreVersion, appStoreReviewDetailRelationships.appStoreVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appStoreReviewAttachments, appStoreVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreReviewDetailRelationships {\n");
    sb.append("    appStoreReviewAttachments: ").append(toIndentedString(appStoreReviewAttachments)).append("\n");
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

