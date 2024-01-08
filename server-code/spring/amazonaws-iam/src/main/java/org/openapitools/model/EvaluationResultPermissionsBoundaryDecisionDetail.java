package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EvaluationResultPermissionsBoundaryDecisionDetail
 */

@JsonTypeName("EvaluationResult_PermissionsBoundaryDecisionDetail")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class EvaluationResultPermissionsBoundaryDecisionDetail {

  private Boolean allowedByPermissionsBoundary;

  public EvaluationResultPermissionsBoundaryDecisionDetail allowedByPermissionsBoundary(Boolean allowedByPermissionsBoundary) {
    this.allowedByPermissionsBoundary = allowedByPermissionsBoundary;
    return this;
  }

  /**
   * Get allowedByPermissionsBoundary
   * @return allowedByPermissionsBoundary
  */
  
  @Schema(name = "AllowedByPermissionsBoundary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AllowedByPermissionsBoundary")
  public Boolean getAllowedByPermissionsBoundary() {
    return allowedByPermissionsBoundary;
  }

  public void setAllowedByPermissionsBoundary(Boolean allowedByPermissionsBoundary) {
    this.allowedByPermissionsBoundary = allowedByPermissionsBoundary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationResultPermissionsBoundaryDecisionDetail evaluationResultPermissionsBoundaryDecisionDetail = (EvaluationResultPermissionsBoundaryDecisionDetail) o;
    return Objects.equals(this.allowedByPermissionsBoundary, evaluationResultPermissionsBoundaryDecisionDetail.allowedByPermissionsBoundary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedByPermissionsBoundary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationResultPermissionsBoundaryDecisionDetail {\n");
    sb.append("    allowedByPermissionsBoundary: ").append(toIndentedString(allowedByPermissionsBoundary)).append("\n");
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

