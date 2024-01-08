package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppInfoLocalizationRelationshipsAppInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppInfoLocalizationRelationships
 */

@JsonTypeName("AppInfoLocalization_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppInfoLocalizationRelationships {

  private AppInfoLocalizationRelationshipsAppInfo appInfo;

  public AppInfoLocalizationRelationships appInfo(AppInfoLocalizationRelationshipsAppInfo appInfo) {
    this.appInfo = appInfo;
    return this;
  }

  /**
   * Get appInfo
   * @return appInfo
  */
  @Valid 
  @Schema(name = "appInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appInfo")
  public AppInfoLocalizationRelationshipsAppInfo getAppInfo() {
    return appInfo;
  }

  public void setAppInfo(AppInfoLocalizationRelationshipsAppInfo appInfo) {
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
    AppInfoLocalizationRelationships appInfoLocalizationRelationships = (AppInfoLocalizationRelationships) o;
    return Objects.equals(this.appInfo, appInfoLocalizationRelationships.appInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppInfoLocalizationRelationships {\n");
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

