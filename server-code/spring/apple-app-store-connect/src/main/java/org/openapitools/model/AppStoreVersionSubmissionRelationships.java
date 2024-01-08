package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppStoreReviewDetailRelationshipsAppStoreVersion;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppStoreVersionSubmissionRelationships
 */

@JsonTypeName("AppStoreVersionSubmission_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppStoreVersionSubmissionRelationships {

  private AppStoreReviewDetailRelationshipsAppStoreVersion appStoreVersion;

  public AppStoreVersionSubmissionRelationships appStoreVersion(AppStoreReviewDetailRelationshipsAppStoreVersion appStoreVersion) {
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
    AppStoreVersionSubmissionRelationships appStoreVersionSubmissionRelationships = (AppStoreVersionSubmissionRelationships) o;
    return Objects.equals(this.appStoreVersion, appStoreVersionSubmissionRelationships.appStoreVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appStoreVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreVersionSubmissionRelationships {\n");
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

