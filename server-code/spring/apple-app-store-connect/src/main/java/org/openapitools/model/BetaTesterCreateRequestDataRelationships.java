package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.BetaGroupCreateRequestDataRelationshipsBuilds;
import org.openapitools.model.BetaTesterCreateRequestDataRelationshipsBetaGroups;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BetaTesterCreateRequestDataRelationships
 */

@JsonTypeName("BetaTesterCreateRequest_data_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaTesterCreateRequestDataRelationships {

  private BetaTesterCreateRequestDataRelationshipsBetaGroups betaGroups;

  private BetaGroupCreateRequestDataRelationshipsBuilds builds;

  public BetaTesterCreateRequestDataRelationships betaGroups(BetaTesterCreateRequestDataRelationshipsBetaGroups betaGroups) {
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
  public BetaTesterCreateRequestDataRelationshipsBetaGroups getBetaGroups() {
    return betaGroups;
  }

  public void setBetaGroups(BetaTesterCreateRequestDataRelationshipsBetaGroups betaGroups) {
    this.betaGroups = betaGroups;
  }

  public BetaTesterCreateRequestDataRelationships builds(BetaGroupCreateRequestDataRelationshipsBuilds builds) {
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
    BetaTesterCreateRequestDataRelationships betaTesterCreateRequestDataRelationships = (BetaTesterCreateRequestDataRelationships) o;
    return Objects.equals(this.betaGroups, betaTesterCreateRequestDataRelationships.betaGroups) &&
        Objects.equals(this.builds, betaTesterCreateRequestDataRelationships.builds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(betaGroups, builds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaTesterCreateRequestDataRelationships {\n");
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

