package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.BigSegmentTargetChanges;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateBigSegmentTargetsRequest
 */

@JsonTypeName("updateBigSegmentTargets_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class UpdateBigSegmentTargetsRequest {

  private BigSegmentTargetChanges excluded;

  private BigSegmentTargetChanges included;

  public UpdateBigSegmentTargetsRequest excluded(BigSegmentTargetChanges excluded) {
    this.excluded = excluded;
    return this;
  }

  /**
   * Get excluded
   * @return excluded
  */
  @Valid 
  @Schema(name = "excluded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excluded")
  public BigSegmentTargetChanges getExcluded() {
    return excluded;
  }

  public void setExcluded(BigSegmentTargetChanges excluded) {
    this.excluded = excluded;
  }

  public UpdateBigSegmentTargetsRequest included(BigSegmentTargetChanges included) {
    this.included = included;
    return this;
  }

  /**
   * Get included
   * @return included
  */
  @Valid 
  @Schema(name = "included", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("included")
  public BigSegmentTargetChanges getIncluded() {
    return included;
  }

  public void setIncluded(BigSegmentTargetChanges included) {
    this.included = included;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBigSegmentTargetsRequest updateBigSegmentTargetsRequest = (UpdateBigSegmentTargetsRequest) o;
    return Objects.equals(this.excluded, updateBigSegmentTargetsRequest.excluded) &&
        Objects.equals(this.included, updateBigSegmentTargetsRequest.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excluded, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBigSegmentTargetsRequest {\n");
    sb.append("    excluded: ").append(toIndentedString(excluded)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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

