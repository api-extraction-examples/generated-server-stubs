package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.BetaTesterRelationshipsApps;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InAppPurchaseRelationships
 */

@JsonTypeName("InAppPurchase_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class InAppPurchaseRelationships {

  private BetaTesterRelationshipsApps apps;

  public InAppPurchaseRelationships apps(BetaTesterRelationshipsApps apps) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InAppPurchaseRelationships inAppPurchaseRelationships = (InAppPurchaseRelationships) o;
    return Objects.equals(this.apps, inAppPurchaseRelationships.apps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InAppPurchaseRelationships {\n");
    sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
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

