package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppEncryptionDeclarationRelationshipsApp;
import org.openapitools.model.AppRelationshipsBuilds;
import org.openapitools.model.BetaGroupRelationshipsBetaTesters;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BetaGroupRelationships
 */

@JsonTypeName("BetaGroup_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaGroupRelationships {

  private AppEncryptionDeclarationRelationshipsApp app;

  private BetaGroupRelationshipsBetaTesters betaTesters;

  private AppRelationshipsBuilds builds;

  public BetaGroupRelationships app(AppEncryptionDeclarationRelationshipsApp app) {
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

  public BetaGroupRelationships betaTesters(BetaGroupRelationshipsBetaTesters betaTesters) {
    this.betaTesters = betaTesters;
    return this;
  }

  /**
   * Get betaTesters
   * @return betaTesters
  */
  @Valid 
  @Schema(name = "betaTesters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("betaTesters")
  public BetaGroupRelationshipsBetaTesters getBetaTesters() {
    return betaTesters;
  }

  public void setBetaTesters(BetaGroupRelationshipsBetaTesters betaTesters) {
    this.betaTesters = betaTesters;
  }

  public BetaGroupRelationships builds(AppRelationshipsBuilds builds) {
    this.builds = builds;
    return this;
  }

  /**
   * Get builds
   * @return builds
  */
  @Valid 
  @Schema(name = "builds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("builds")
  public AppRelationshipsBuilds getBuilds() {
    return builds;
  }

  public void setBuilds(AppRelationshipsBuilds builds) {
    this.builds = builds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetaGroupRelationships betaGroupRelationships = (BetaGroupRelationships) o;
    return Objects.equals(this.app, betaGroupRelationships.app) &&
        Objects.equals(this.betaTesters, betaGroupRelationships.betaTesters) &&
        Objects.equals(this.builds, betaGroupRelationships.builds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, betaTesters, builds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaGroupRelationships {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    betaTesters: ").append(toIndentedString(betaTesters)).append("\n");
    sb.append("    builds: ").append(toIndentedString(builds)).append("\n");
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

