package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Eta;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EtaEstimateResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class EtaEstimateResponse {

  @Valid
  private List<@Valid Eta> etaEstimates;

  public EtaEstimateResponse etaEstimates(List<@Valid Eta> etaEstimates) {
    this.etaEstimates = etaEstimates;
    return this;
  }

  public EtaEstimateResponse addEtaEstimatesItem(Eta etaEstimatesItem) {
    if (this.etaEstimates == null) {
      this.etaEstimates = new ArrayList<>();
    }
    this.etaEstimates.add(etaEstimatesItem);
    return this;
  }

  /**
   * Get etaEstimates
   * @return etaEstimates
  */
  @Valid 
  @Schema(name = "eta_estimates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eta_estimates")
  public List<@Valid Eta> getEtaEstimates() {
    return etaEstimates;
  }

  public void setEtaEstimates(List<@Valid Eta> etaEstimates) {
    this.etaEstimates = etaEstimates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EtaEstimateResponse etaEstimateResponse = (EtaEstimateResponse) o;
    return Objects.equals(this.etaEstimates, etaEstimateResponse.etaEstimates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etaEstimates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EtaEstimateResponse {\n");
    sb.append("    etaEstimates: ").append(toIndentedString(etaEstimates)).append("\n");
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

