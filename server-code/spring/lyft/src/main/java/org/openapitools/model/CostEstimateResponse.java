package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CostEstimate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CostEstimateResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class CostEstimateResponse {

  @Valid
  private List<@Valid CostEstimate> costEstimates;

  public CostEstimateResponse costEstimates(List<@Valid CostEstimate> costEstimates) {
    this.costEstimates = costEstimates;
    return this;
  }

  public CostEstimateResponse addCostEstimatesItem(CostEstimate costEstimatesItem) {
    if (this.costEstimates == null) {
      this.costEstimates = new ArrayList<>();
    }
    this.costEstimates.add(costEstimatesItem);
    return this;
  }

  /**
   * Get costEstimates
   * @return costEstimates
  */
  @Valid 
  @Schema(name = "cost_estimates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cost_estimates")
  public List<@Valid CostEstimate> getCostEstimates() {
    return costEstimates;
  }

  public void setCostEstimates(List<@Valid CostEstimate> costEstimates) {
    this.costEstimates = costEstimates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostEstimateResponse costEstimateResponse = (CostEstimateResponse) o;
    return Objects.equals(this.costEstimates, costEstimateResponse.costEstimates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costEstimates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostEstimateResponse {\n");
    sb.append("    costEstimates: ").append(toIndentedString(costEstimates)).append("\n");
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

