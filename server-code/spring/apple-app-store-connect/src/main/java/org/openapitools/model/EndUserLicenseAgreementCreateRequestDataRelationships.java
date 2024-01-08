package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppPreOrderCreateRequestDataRelationshipsApp;
import org.openapitools.model.EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EndUserLicenseAgreementCreateRequestDataRelationships
 */

@JsonTypeName("EndUserLicenseAgreementCreateRequest_data_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class EndUserLicenseAgreementCreateRequestDataRelationships {

  private AppPreOrderCreateRequestDataRelationshipsApp app;

  private EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories territories;

  public EndUserLicenseAgreementCreateRequestDataRelationships() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EndUserLicenseAgreementCreateRequestDataRelationships(AppPreOrderCreateRequestDataRelationshipsApp app, EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories territories) {
    this.app = app;
    this.territories = territories;
  }

  public EndUserLicenseAgreementCreateRequestDataRelationships app(AppPreOrderCreateRequestDataRelationshipsApp app) {
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

  public EndUserLicenseAgreementCreateRequestDataRelationships territories(EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories territories) {
    this.territories = territories;
    return this;
  }

  /**
   * Get territories
   * @return territories
  */
  @NotNull @Valid 
  @Schema(name = "territories", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("territories")
  public EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories getTerritories() {
    return territories;
  }

  public void setTerritories(EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories territories) {
    this.territories = territories;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndUserLicenseAgreementCreateRequestDataRelationships endUserLicenseAgreementCreateRequestDataRelationships = (EndUserLicenseAgreementCreateRequestDataRelationships) o;
    return Objects.equals(this.app, endUserLicenseAgreementCreateRequestDataRelationships.app) &&
        Objects.equals(this.territories, endUserLicenseAgreementCreateRequestDataRelationships.territories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, territories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndUserLicenseAgreementCreateRequestDataRelationships {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    territories: ").append(toIndentedString(territories)).append("\n");
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

