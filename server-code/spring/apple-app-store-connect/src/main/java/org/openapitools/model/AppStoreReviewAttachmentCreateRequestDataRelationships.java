package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetail;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppStoreReviewAttachmentCreateRequestDataRelationships
 */

@JsonTypeName("AppStoreReviewAttachmentCreateRequest_data_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppStoreReviewAttachmentCreateRequestDataRelationships {

  private AppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetail appStoreReviewDetail;

  public AppStoreReviewAttachmentCreateRequestDataRelationships() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppStoreReviewAttachmentCreateRequestDataRelationships(AppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetail appStoreReviewDetail) {
    this.appStoreReviewDetail = appStoreReviewDetail;
  }

  public AppStoreReviewAttachmentCreateRequestDataRelationships appStoreReviewDetail(AppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetail appStoreReviewDetail) {
    this.appStoreReviewDetail = appStoreReviewDetail;
    return this;
  }

  /**
   * Get appStoreReviewDetail
   * @return appStoreReviewDetail
  */
  @NotNull @Valid 
  @Schema(name = "appStoreReviewDetail", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("appStoreReviewDetail")
  public AppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetail getAppStoreReviewDetail() {
    return appStoreReviewDetail;
  }

  public void setAppStoreReviewDetail(AppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetail appStoreReviewDetail) {
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
    AppStoreReviewAttachmentCreateRequestDataRelationships appStoreReviewAttachmentCreateRequestDataRelationships = (AppStoreReviewAttachmentCreateRequestDataRelationships) o;
    return Objects.equals(this.appStoreReviewDetail, appStoreReviewAttachmentCreateRequestDataRelationships.appStoreReviewDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appStoreReviewDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreReviewAttachmentCreateRequestDataRelationships {\n");
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

