package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppPreOrderCreateRequestDataRelationshipsApp;
import org.openapitools.model.BetaGroupCreateRequestDataRelationshipsBetaTesters;
import org.openapitools.model.BetaGroupCreateRequestDataRelationshipsBuilds;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BetaGroupCreateRequestDataRelationships
 */

@JsonTypeName("BetaGroupCreateRequest_data_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaGroupCreateRequestDataRelationships {

  private AppPreOrderCreateRequestDataRelationshipsApp app;

  private BetaGroupCreateRequestDataRelationshipsBetaTesters betaTesters;

  private BetaGroupCreateRequestDataRelationshipsBuilds builds;

  public BetaGroupCreateRequestDataRelationships() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BetaGroupCreateRequestDataRelationships(AppPreOrderCreateRequestDataRelationshipsApp app) {
    this.app = app;
  }

  public BetaGroupCreateRequestDataRelationships app(AppPreOrderCreateRequestDataRelationshipsApp app) {
    this.app = app;
    return this;
  }

  /**
   * Get app
   * @return app
  */
  @NotNull @Valid 
  @Schema(name = "app", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("app")
  public AppPreOrderCreateRequestDataRelationshipsApp getApp() {
    return app;
  }

  public void setApp(AppPreOrderCreateRequestDataRelationshipsApp app) {
    this.app = app;
  }

  public BetaGroupCreateRequestDataRelationships betaTesters(BetaGroupCreateRequestDataRelationshipsBetaTesters betaTesters) {
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
  public BetaGroupCreateRequestDataRelationshipsBetaTesters getBetaTesters() {
    return betaTesters;
  }

  public void setBetaTesters(BetaGroupCreateRequestDataRelationshipsBetaTesters betaTesters) {
    this.betaTesters = betaTesters;
  }

  public BetaGroupCreateRequestDataRelationships builds(BetaGroupCreateRequestDataRelationshipsBuilds builds) {
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
  public BetaGroupCreateRequestDataRelationshipsBuilds getBuilds() {
    return builds;
  }

  public void setBuilds(BetaGroupCreateRequestDataRelationshipsBuilds builds) {
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
    BetaGroupCreateRequestDataRelationships betaGroupCreateRequestDataRelationships = (BetaGroupCreateRequestDataRelationships) o;
    return Objects.equals(this.app, betaGroupCreateRequestDataRelationships.app) &&
        Objects.equals(this.betaTesters, betaGroupCreateRequestDataRelationships.betaTesters) &&
        Objects.equals(this.builds, betaGroupCreateRequestDataRelationships.builds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, betaTesters, builds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaGroupCreateRequestDataRelationships {\n");
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

