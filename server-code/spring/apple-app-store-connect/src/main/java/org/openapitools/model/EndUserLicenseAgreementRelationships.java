package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppEncryptionDeclarationRelationshipsApp;
import org.openapitools.model.AppRelationshipsAvailableTerritories;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EndUserLicenseAgreementRelationships
 */

@JsonTypeName("EndUserLicenseAgreement_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class EndUserLicenseAgreementRelationships {

  private AppEncryptionDeclarationRelationshipsApp app;

  private AppRelationshipsAvailableTerritories territories;

  public EndUserLicenseAgreementRelationships app(AppEncryptionDeclarationRelationshipsApp app) {
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

  public EndUserLicenseAgreementRelationships territories(AppRelationshipsAvailableTerritories territories) {
    this.territories = territories;
    return this;
  }

  /**
   * Get territories
   * @return territories
  */
  @Valid 
  @Schema(name = "territories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("territories")
  public AppRelationshipsAvailableTerritories getTerritories() {
    return territories;
  }

  public void setTerritories(AppRelationshipsAvailableTerritories territories) {
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
    EndUserLicenseAgreementRelationships endUserLicenseAgreementRelationships = (EndUserLicenseAgreementRelationships) o;
    return Objects.equals(this.app, endUserLicenseAgreementRelationships.app) &&
        Objects.equals(this.territories, endUserLicenseAgreementRelationships.territories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, territories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndUserLicenseAgreementRelationships {\n");
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

