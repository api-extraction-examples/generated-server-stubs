package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppPreviewCreateRequestDataRelationshipsAppPreviewSet;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppPreviewCreateRequestDataRelationships
 */

@JsonTypeName("AppPreviewCreateRequest_data_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppPreviewCreateRequestDataRelationships {

  private AppPreviewCreateRequestDataRelationshipsAppPreviewSet appPreviewSet;

  public AppPreviewCreateRequestDataRelationships() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppPreviewCreateRequestDataRelationships(AppPreviewCreateRequestDataRelationshipsAppPreviewSet appPreviewSet) {
    this.appPreviewSet = appPreviewSet;
  }

  public AppPreviewCreateRequestDataRelationships appPreviewSet(AppPreviewCreateRequestDataRelationshipsAppPreviewSet appPreviewSet) {
    this.appPreviewSet = appPreviewSet;
    return this;
  }

  /**
   * Get appPreviewSet
   * @return appPreviewSet
  */
  @NotNull @Valid 
  @Schema(name = "appPreviewSet", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("appPreviewSet")
  public AppPreviewCreateRequestDataRelationshipsAppPreviewSet getAppPreviewSet() {
    return appPreviewSet;
  }

  public void setAppPreviewSet(AppPreviewCreateRequestDataRelationshipsAppPreviewSet appPreviewSet) {
    this.appPreviewSet = appPreviewSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppPreviewCreateRequestDataRelationships appPreviewCreateRequestDataRelationships = (AppPreviewCreateRequestDataRelationships) o;
    return Objects.equals(this.appPreviewSet, appPreviewCreateRequestDataRelationships.appPreviewSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appPreviewSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPreviewCreateRequestDataRelationships {\n");
    sb.append("    appPreviewSet: ").append(toIndentedString(appPreviewSet)).append("\n");
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

