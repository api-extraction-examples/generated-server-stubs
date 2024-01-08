package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppRelationshipsBetaGroups;
import org.openapitools.model.AppRelationshipsBuilds;
import org.openapitools.model.BetaTesterRelationshipsApps;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BetaTesterRelationships
 */

@JsonTypeName("BetaTester_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaTesterRelationships {

  private BetaTesterRelationshipsApps apps;

  private AppRelationshipsBetaGroups betaGroups;

  private AppRelationshipsBuilds builds;

  public BetaTesterRelationships apps(BetaTesterRelationshipsApps apps) {
    this.apps = apps;
    return this;
  }

  /**
   * Get apps
   * @return apps
  */
  @Valid 
  @Schema(name = "apps", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("apps")
  public BetaTesterRelationshipsApps getApps() {
    return apps;
  }

  public void setApps(BetaTesterRelationshipsApps apps) {
    this.apps = apps;
  }

  public BetaTesterRelationships betaGroups(AppRelationshipsBetaGroups betaGroups) {
    this.betaGroups = betaGroups;
    return this;
  }

  /**
   * Get betaGroups
   * @return betaGroups
  */
  @Valid 
  @Schema(name = "betaGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("betaGroups")
  public AppRelationshipsBetaGroups getBetaGroups() {
    return betaGroups;
  }

  public void setBetaGroups(AppRelationshipsBetaGroups betaGroups) {
    this.betaGroups = betaGroups;
  }

  public BetaTesterRelationships builds(AppRelationshipsBuilds builds) {
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
    BetaTesterRelationships betaTesterRelationships = (BetaTesterRelationships) o;
    return Objects.equals(this.apps, betaTesterRelationships.apps) &&
        Objects.equals(this.betaGroups, betaTesterRelationships.betaGroups) &&
        Objects.equals(this.builds, betaTesterRelationships.builds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apps, betaGroups, builds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaTesterRelationships {\n");
    sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
    sb.append("    betaGroups: ").append(toIndentedString(betaGroups)).append("\n");
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

