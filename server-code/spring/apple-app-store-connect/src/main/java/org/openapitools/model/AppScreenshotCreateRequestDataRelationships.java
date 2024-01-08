package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppScreenshotCreateRequestDataRelationshipsAppScreenshotSet;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppScreenshotCreateRequestDataRelationships
 */

@JsonTypeName("AppScreenshotCreateRequest_data_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppScreenshotCreateRequestDataRelationships {

  private AppScreenshotCreateRequestDataRelationshipsAppScreenshotSet appScreenshotSet;

  public AppScreenshotCreateRequestDataRelationships() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppScreenshotCreateRequestDataRelationships(AppScreenshotCreateRequestDataRelationshipsAppScreenshotSet appScreenshotSet) {
    this.appScreenshotSet = appScreenshotSet;
  }

  public AppScreenshotCreateRequestDataRelationships appScreenshotSet(AppScreenshotCreateRequestDataRelationshipsAppScreenshotSet appScreenshotSet) {
    this.appScreenshotSet = appScreenshotSet;
    return this;
  }

  /**
   * Get appScreenshotSet
   * @return appScreenshotSet
  */
  @NotNull @Valid 
  @Schema(name = "appScreenshotSet", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("appScreenshotSet")
  public AppScreenshotCreateRequestDataRelationshipsAppScreenshotSet getAppScreenshotSet() {
    return appScreenshotSet;
  }

  public void setAppScreenshotSet(AppScreenshotCreateRequestDataRelationshipsAppScreenshotSet appScreenshotSet) {
    this.appScreenshotSet = appScreenshotSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppScreenshotCreateRequestDataRelationships appScreenshotCreateRequestDataRelationships = (AppScreenshotCreateRequestDataRelationships) o;
    return Objects.equals(this.appScreenshotSet, appScreenshotCreateRequestDataRelationships.appScreenshotSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appScreenshotSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppScreenshotCreateRequestDataRelationships {\n");
    sb.append("    appScreenshotSet: ").append(toIndentedString(appScreenshotSet)).append("\n");
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

