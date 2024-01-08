package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppPreviewSetCreateRequestDataRelationships
 */

@JsonTypeName("AppPreviewSetCreateRequest_data_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppPreviewSetCreateRequestDataRelationships {

  private AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization appStoreVersionLocalization;

  public AppPreviewSetCreateRequestDataRelationships() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppPreviewSetCreateRequestDataRelationships(AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization appStoreVersionLocalization) {
    this.appStoreVersionLocalization = appStoreVersionLocalization;
  }

  public AppPreviewSetCreateRequestDataRelationships appStoreVersionLocalization(AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization appStoreVersionLocalization) {
    this.appStoreVersionLocalization = appStoreVersionLocalization;
    return this;
  }

  /**
   * Get appStoreVersionLocalization
   * @return appStoreVersionLocalization
  */
  @NotNull @Valid 
  @Schema(name = "appStoreVersionLocalization", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("appStoreVersionLocalization")
  public AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization getAppStoreVersionLocalization() {
    return appStoreVersionLocalization;
  }

  public void setAppStoreVersionLocalization(AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization appStoreVersionLocalization) {
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
    AppPreviewSetCreateRequestDataRelationships appPreviewSetCreateRequestDataRelationships = (AppPreviewSetCreateRequestDataRelationships) o;
    return Objects.equals(this.appStoreVersionLocalization, appPreviewSetCreateRequestDataRelationships.appStoreVersionLocalization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appStoreVersionLocalization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPreviewSetCreateRequestDataRelationships {\n");
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

