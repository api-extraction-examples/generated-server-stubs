package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppPreviewRelationshipsAppPreviewSetData;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppPreviewCreateRequestDataRelationshipsAppPreviewSet
 */

@JsonTypeName("AppPreviewCreateRequest_data_relationships_appPreviewSet")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppPreviewCreateRequestDataRelationshipsAppPreviewSet {

  private AppPreviewRelationshipsAppPreviewSetData data;

  public AppPreviewCreateRequestDataRelationshipsAppPreviewSet() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppPreviewCreateRequestDataRelationshipsAppPreviewSet(AppPreviewRelationshipsAppPreviewSetData data) {
    this.data = data;
  }

  public AppPreviewCreateRequestDataRelationshipsAppPreviewSet data(AppPreviewRelationshipsAppPreviewSetData data) {
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
  public AppPreviewRelationshipsAppPreviewSetData getData() {
    return data;
  }

  public void setData(AppPreviewRelationshipsAppPreviewSetData data) {
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
    AppPreviewCreateRequestDataRelationshipsAppPreviewSet appPreviewCreateRequestDataRelationshipsAppPreviewSet = (AppPreviewCreateRequestDataRelationshipsAppPreviewSet) o;
    return Objects.equals(this.data, appPreviewCreateRequestDataRelationshipsAppPreviewSet.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPreviewCreateRequestDataRelationshipsAppPreviewSet {\n");
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

