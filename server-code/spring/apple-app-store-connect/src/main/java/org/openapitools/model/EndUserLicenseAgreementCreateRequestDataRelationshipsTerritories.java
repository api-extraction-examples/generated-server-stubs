package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AppRelationshipsAvailableTerritoriesDataInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories
 */

@JsonTypeName("EndUserLicenseAgreementCreateRequest_data_relationships_territories")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories {

  @Valid
  private List<@Valid AppRelationshipsAvailableTerritoriesDataInner> data = new ArrayList<>();

  public EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories(List<@Valid AppRelationshipsAvailableTerritoriesDataInner> data) {
    this.data = data;
  }

  public EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories data(List<@Valid AppRelationshipsAvailableTerritoriesDataInner> data) {
    this.data = data;
    return this;
  }

  public EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories addDataItem(AppRelationshipsAvailableTerritoriesDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public List<@Valid AppRelationshipsAvailableTerritoriesDataInner> getData() {
    return data;
  }

  public void setData(List<@Valid AppRelationshipsAvailableTerritoriesDataInner> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories endUserLicenseAgreementCreateRequestDataRelationshipsTerritories = (EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories) o;
    return Objects.equals(this.data, endUserLicenseAgreementCreateRequestDataRelationshipsTerritories.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

