package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.App;
import org.openapitools.model.BetaLicenseAgreement;
import org.openapitools.model.DocumentLinks;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BetaLicenseAgreementResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaLicenseAgreementResponse {

  private BetaLicenseAgreement data;

  @Valid
  private List<@Valid App> included;

  private DocumentLinks links;

  public BetaLicenseAgreementResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BetaLicenseAgreementResponse(BetaLicenseAgreement data, DocumentLinks links) {
    this.data = data;
    this.links = links;
  }

  public BetaLicenseAgreementResponse data(BetaLicenseAgreement data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public BetaLicenseAgreement getData() {
    return data;
  }

  public void setData(BetaLicenseAgreement data) {
    this.data = data;
  }

  public BetaLicenseAgreementResponse included(List<@Valid App> included) {
    this.included = included;
    return this;
  }

  public BetaLicenseAgreementResponse addIncludedItem(App includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    return this;
  }

  /**
   * Get included
   * @return included
  */
  @Valid 
  @Schema(name = "included", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("included")
  public List<@Valid App> getIncluded() {
    return included;
  }

  public void setIncluded(List<@Valid App> included) {
    this.included = included;
  }

  public BetaLicenseAgreementResponse links(DocumentLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @NotNull @Valid 
  @Schema(name = "links", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("links")
  public DocumentLinks getLinks() {
    return links;
  }

  public void setLinks(DocumentLinks links) {
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
    BetaLicenseAgreementResponse betaLicenseAgreementResponse = (BetaLicenseAgreementResponse) o;
    return Objects.equals(this.data, betaLicenseAgreementResponse.data) &&
        Objects.equals(this.included, betaLicenseAgreementResponse.included) &&
        Objects.equals(this.links, betaLicenseAgreementResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaLicenseAgreementResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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

