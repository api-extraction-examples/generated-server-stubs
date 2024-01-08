package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppPreOrderCreateRequestDataRelationshipsApp;
import org.openapitools.model.BetaTesterInvitationCreateRequestDataRelationshipsBetaTester;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BetaTesterInvitationCreateRequestDataRelationships
 */

@JsonTypeName("BetaTesterInvitationCreateRequest_data_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaTesterInvitationCreateRequestDataRelationships {

  private AppPreOrderCreateRequestDataRelationshipsApp app;

  private BetaTesterInvitationCreateRequestDataRelationshipsBetaTester betaTester;

  public BetaTesterInvitationCreateRequestDataRelationships() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BetaTesterInvitationCreateRequestDataRelationships(AppPreOrderCreateRequestDataRelationshipsApp app, BetaTesterInvitationCreateRequestDataRelationshipsBetaTester betaTester) {
    this.app = app;
    this.betaTester = betaTester;
  }

  public BetaTesterInvitationCreateRequestDataRelationships app(AppPreOrderCreateRequestDataRelationshipsApp app) {
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

  public BetaTesterInvitationCreateRequestDataRelationships betaTester(BetaTesterInvitationCreateRequestDataRelationshipsBetaTester betaTester) {
    this.betaTester = betaTester;
    return this;
  }

  /**
   * Get betaTester
   * @return betaTester
  */
  @NotNull @Valid 
  @Schema(name = "betaTester", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("betaTester")
  public BetaTesterInvitationCreateRequestDataRelationshipsBetaTester getBetaTester() {
    return betaTester;
  }

  public void setBetaTester(BetaTesterInvitationCreateRequestDataRelationshipsBetaTester betaTester) {
    this.betaTester = betaTester;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetaTesterInvitationCreateRequestDataRelationships betaTesterInvitationCreateRequestDataRelationships = (BetaTesterInvitationCreateRequestDataRelationships) o;
    return Objects.equals(this.app, betaTesterInvitationCreateRequestDataRelationships.app) &&
        Objects.equals(this.betaTester, betaTesterInvitationCreateRequestDataRelationships.betaTester);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, betaTester);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaTesterInvitationCreateRequestDataRelationships {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    betaTester: ").append(toIndentedString(betaTester)).append("\n");
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

