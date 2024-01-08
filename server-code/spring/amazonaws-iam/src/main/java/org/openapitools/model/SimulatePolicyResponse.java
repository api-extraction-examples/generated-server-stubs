package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;SimulatePrincipalPolicy&lt;/a&gt; or &lt;a&gt;SimulateCustomPolicy&lt;/a&gt; request.
 */

@Schema(name = "SimulatePolicyResponse", description = "Contains the response to a successful <a>SimulatePrincipalPolicy</a> or <a>SimulateCustomPolicy</a> request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class SimulatePolicyResponse {

  private List evaluationResults;

  private Boolean isTruncated;

  private String marker;

  public SimulatePolicyResponse evaluationResults(List evaluationResults) {
    this.evaluationResults = evaluationResults;
    return this;
  }

  /**
   * Get evaluationResults
   * @return evaluationResults
  */
  @Valid 
  @Schema(name = "EvaluationResults", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EvaluationResults")
  public List getEvaluationResults() {
    return evaluationResults;
  }

  public void setEvaluationResults(List evaluationResults) {
    this.evaluationResults = evaluationResults;
  }

  public SimulatePolicyResponse isTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
    return this;
  }

  /**
   * Get isTruncated
   * @return isTruncated
  */
  
  @Schema(name = "IsTruncated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsTruncated")
  public Boolean getIsTruncated() {
    return isTruncated;
  }

  public void setIsTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
  }

  public SimulatePolicyResponse marker(String marker) {
    this.marker = marker;
    return this;
  }

  /**
   * Get marker
   * @return marker
  */
  
  @Schema(name = "Marker", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Marker")
  public String getMarker() {
    return marker;
  }

  public void setMarker(String marker) {
    this.marker = marker;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulatePolicyResponse simulatePolicyResponse = (SimulatePolicyResponse) o;
    return Objects.equals(this.evaluationResults, simulatePolicyResponse.evaluationResults) &&
        Objects.equals(this.isTruncated, simulatePolicyResponse.isTruncated) &&
        Objects.equals(this.marker, simulatePolicyResponse.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationResults, isTruncated, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimulatePolicyResponse {\n");
    sb.append("    evaluationResults: ").append(toIndentedString(evaluationResults)).append("\n");
    sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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

