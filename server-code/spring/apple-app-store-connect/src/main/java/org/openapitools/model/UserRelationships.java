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
 * UserRelationships
 */

@JsonTypeName("User_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class UserRelationships {

  private BetaTesterRelationshipsApps visibleApps;

  public UserRelationships visibleApps(BetaTesterRelationshipsApps visibleApps) {
    this.visibleApps = visibleApps;
    return this;
  }

  /**
   * Get visibleApps
   * @return visibleApps
  */
  @Valid 
  @Schema(name = "visibleApps", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibleApps")
  public BetaTesterRelationshipsApps getVisibleApps() {
    return visibleApps;
  }

  public void setVisibleApps(BetaTesterRelationshipsApps visibleApps) {
    this.visibleApps = visibleApps;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRelationships userRelationships = (UserRelationships) o;
    return Objects.equals(this.visibleApps, userRelationships.visibleApps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visibleApps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRelationships {\n");
    sb.append("    visibleApps: ").append(toIndentedString(visibleApps)).append("\n");
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

