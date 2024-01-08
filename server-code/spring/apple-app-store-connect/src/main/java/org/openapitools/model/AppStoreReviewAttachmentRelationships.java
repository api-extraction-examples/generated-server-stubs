package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppStoreReviewAttachmentRelationships
 */

@JsonTypeName("AppStoreReviewAttachment_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppStoreReviewAttachmentRelationships {

  private AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail appStoreReviewDetail;

  public AppStoreReviewAttachmentRelationships appStoreReviewDetail(AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail appStoreReviewDetail) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreReviewAttachmentRelationships appStoreReviewAttachmentRelationships = (AppStoreReviewAttachmentRelationships) o;
    return Objects.equals(this.appStoreReviewDetail, appStoreReviewAttachmentRelationships.appStoreReviewDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appStoreReviewDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreReviewAttachmentRelationships {\n");
    sb.append("    appStoreReviewDetail: ").append(toIndentedString(appStoreReviewDetail)).append("\n");
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

