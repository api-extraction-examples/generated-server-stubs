package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppUpdateRequestDataRelationshipsAvailableTerritories;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EndUserLicenseAgreementUpdateRequestDataRelationships
 */

@JsonTypeName("EndUserLicenseAgreementUpdateRequest_data_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class EndUserLicenseAgreementUpdateRequestDataRelationships {

  private AppUpdateRequestDataRelationshipsAvailableTerritories territories;

  public EndUserLicenseAgreementUpdateRequestDataRelationships territories(AppUpdateRequestDataRelationshipsAvailableTerritories territories) {
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
  public AppUpdateRequestDataRelationshipsAvailableTerritories getTerritories() {
    return territories;
  }

  public void setTerritories(AppUpdateRequestDataRelationshipsAvailableTerritories territories) {
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
    EndUserLicenseAgreementUpdateRequestDataRelationships endUserLicenseAgreementUpdateRequestDataRelationships = (EndUserLicenseAgreementUpdateRequestDataRelationships) o;
    return Objects.equals(this.territories, endUserLicenseAgreementUpdateRequestDataRelationships.territories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(territories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndUserLicenseAgreementUpdateRequestDataRelationships {\n");
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

