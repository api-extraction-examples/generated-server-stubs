package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppPreviewSetRelationshipsAppStoreVersionLocalizationData;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization
 */

@JsonTypeName("AppPreviewSetCreateRequest_data_relationships_appStoreVersionLocalization")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization {

  private AppPreviewSetRelationshipsAppStoreVersionLocalizationData data;

  public AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization(AppPreviewSetRelationshipsAppStoreVersionLocalizationData data) {
    this.data = data;
  }

  public AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization data(AppPreviewSetRelationshipsAppStoreVersionLocalizationData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public AppPreviewSetRelationshipsAppStoreVersionLocalizationData getData() {
    return data;
  }

  public void setData(AppPreviewSetRelationshipsAppStoreVersionLocalizationData data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization appPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization = (AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization) o;
    return Objects.equals(this.data, appPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

