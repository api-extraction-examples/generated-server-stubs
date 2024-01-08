package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppEncryptionDeclarationRelationshipsApp;
import org.openapitools.model.AppRelationshipsGameCenterEnabledVersions;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GameCenterEnabledVersionRelationships
 */

@JsonTypeName("GameCenterEnabledVersion_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class GameCenterEnabledVersionRelationships {

  private AppEncryptionDeclarationRelationshipsApp app;

  private AppRelationshipsGameCenterEnabledVersions compatibleVersions;

  public GameCenterEnabledVersionRelationships app(AppEncryptionDeclarationRelationshipsApp app) {
    this.app = app;
    return this;
  }

  /**
   * Get app
   * @return app
  */
  @Valid 
  @Schema(name = "app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app")
  public AppEncryptionDeclarationRelationshipsApp getApp() {
    return app;
  }

  public void setApp(AppEncryptionDeclarationRelationshipsApp app) {
    this.app = app;
  }

  public GameCenterEnabledVersionRelationships compatibleVersions(AppRelationshipsGameCenterEnabledVersions compatibleVersions) {
    this.compatibleVersions = compatibleVersions;
    return this;
  }

  /**
   * Get compatibleVersions
   * @return compatibleVersions
  */
  @Valid 
  @Schema(name = "compatibleVersions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compatibleVersions")
  public AppRelationshipsGameCenterEnabledVersions getCompatibleVersions() {
    return compatibleVersions;
  }

  public void setCompatibleVersions(AppRelationshipsGameCenterEnabledVersions compatibleVersions) {
    this.compatibleVersions = compatibleVersions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterEnabledVersionRelationships gameCenterEnabledVersionRelationships = (GameCenterEnabledVersionRelationships) o;
    return Objects.equals(this.app, gameCenterEnabledVersionRelationships.app) &&
        Objects.equals(this.compatibleVersions, gameCenterEnabledVersionRelationships.compatibleVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, compatibleVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterEnabledVersionRelationships {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    compatibleVersions: ").append(toIndentedString(compatibleVersions)).append("\n");
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

