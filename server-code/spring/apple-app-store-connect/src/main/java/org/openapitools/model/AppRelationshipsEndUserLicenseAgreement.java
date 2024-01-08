package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppRelationshipsAppInfosLinks;
import org.openapitools.model.AppRelationshipsEndUserLicenseAgreementData;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppRelationshipsEndUserLicenseAgreement
 */

@JsonTypeName("App_relationships_endUserLicenseAgreement")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppRelationshipsEndUserLicenseAgreement {

  private AppRelationshipsEndUserLicenseAgreementData data;

  private AppRelationshipsAppInfosLinks links;

  public AppRelationshipsEndUserLicenseAgreement data(AppRelationshipsEndUserLicenseAgreementData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public AppRelationshipsEndUserLicenseAgreementData getData() {
    return data;
  }

  public void setData(AppRelationshipsEndUserLicenseAgreementData data) {
    this.data = data;
  }

  public AppRelationshipsEndUserLicenseAgreement links(AppRelationshipsAppInfosLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("links")
  public AppRelationshipsAppInfosLinks getLinks() {
    return links;
  }

  public void setLinks(AppRelationshipsAppInfosLinks links) {
    this.links = links;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppRelationshipsEndUserLicenseAgreement appRelationshipsEndUserLicenseAgreement = (AppRelationshipsEndUserLicenseAgreement) o;
    return Objects.equals(this.data, appRelationshipsEndUserLicenseAgreement.data) &&
        Objects.equals(this.links, appRelationshipsEndUserLicenseAgreement.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppRelationshipsEndUserLicenseAgreement {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

