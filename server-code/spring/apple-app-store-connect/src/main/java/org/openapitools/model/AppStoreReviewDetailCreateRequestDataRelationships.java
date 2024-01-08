package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppStoreReviewDetailCreateRequestDataRelationships
 */

@JsonTypeName("AppStoreReviewDetailCreateRequest_data_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppStoreReviewDetailCreateRequestDataRelationships {

  private AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion appStoreVersion;

  public AppStoreReviewDetailCreateRequestDataRelationships() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppStoreReviewDetailCreateRequestDataRelationships(AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion appStoreVersion) {
    this.appStoreVersion = appStoreVersion;
  }

  public AppStoreReviewDetailCreateRequestDataRelationships appStoreVersion(AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion appStoreVersion) {
    this.appStoreVersion = appStoreVersion;
    return this;
  }

  /**
   * Get appStoreVersion
   * @return appStoreVersion
  */
  @NotNull @Valid 
  @Schema(name = "appStoreVersion", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("appStoreVersion")
  public AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion getAppStoreVersion() {
    return appStoreVersion;
  }

  public void setAppStoreVersion(AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion appStoreVersion) {
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
    AppStoreReviewDetailCreateRequestDataRelationships appStoreReviewDetailCreateRequestDataRelationships = (AppStoreReviewDetailCreateRequestDataRelationships) o;
    return Objects.equals(this.appStoreVersion, appStoreReviewDetailCreateRequestDataRelationships.appStoreVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appStoreVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreReviewDetailCreateRequestDataRelationships {\n");
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

