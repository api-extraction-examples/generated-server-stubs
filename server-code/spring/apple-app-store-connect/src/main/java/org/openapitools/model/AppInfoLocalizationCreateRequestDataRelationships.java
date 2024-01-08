package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppInfoLocalizationCreateRequestDataRelationshipsAppInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppInfoLocalizationCreateRequestDataRelationships
 */

@JsonTypeName("AppInfoLocalizationCreateRequest_data_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppInfoLocalizationCreateRequestDataRelationships {

  private AppInfoLocalizationCreateRequestDataRelationshipsAppInfo appInfo;

  public AppInfoLocalizationCreateRequestDataRelationships() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppInfoLocalizationCreateRequestDataRelationships(AppInfoLocalizationCreateRequestDataRelationshipsAppInfo appInfo) {
    this.appInfo = appInfo;
  }

  public AppInfoLocalizationCreateRequestDataRelationships appInfo(AppInfoLocalizationCreateRequestDataRelationshipsAppInfo appInfo) {
    this.appInfo = appInfo;
    return this;
  }

  /**
   * Get appInfo
   * @return appInfo
  */
  @NotNull @Valid 
  @Schema(name = "appInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("appInfo")
  public AppInfoLocalizationCreateRequestDataRelationshipsAppInfo getAppInfo() {
    return appInfo;
  }

  public void setAppInfo(AppInfoLocalizationCreateRequestDataRelationshipsAppInfo appInfo) {
    this.appInfo = appInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppInfoLocalizationCreateRequestDataRelationships appInfoLocalizationCreateRequestDataRelationships = (AppInfoLocalizationCreateRequestDataRelationships) o;
    return Objects.equals(this.appInfo, appInfoLocalizationCreateRequestDataRelationships.appInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppInfoLocalizationCreateRequestDataRelationships {\n");
    sb.append("    appInfo: ").append(toIndentedString(appInfo)).append("\n");
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

