package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BetaReviewState;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BetaAppReviewSubmissionAttributes
 */

@JsonTypeName("BetaAppReviewSubmission_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaAppReviewSubmissionAttributes {

  private BetaReviewState betaReviewState;

  public BetaAppReviewSubmissionAttributes betaReviewState(BetaReviewState betaReviewState) {
    this.betaReviewState = betaReviewState;
    return this;
  }

  /**
   * Get betaReviewState
   * @return betaReviewState
  */
  @Valid 
  @Schema(name = "betaReviewState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("betaReviewState")
  public BetaReviewState getBetaReviewState() {
    return betaReviewState;
  }

  public void setBetaReviewState(BetaReviewState betaReviewState) {
    this.betaReviewState = betaReviewState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetaAppReviewSubmissionAttributes betaAppReviewSubmissionAttributes = (BetaAppReviewSubmissionAttributes) o;
    return Objects.equals(this.betaReviewState, betaAppReviewSubmissionAttributes.betaReviewState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(betaReviewState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaAppReviewSubmissionAttributes {\n");
    sb.append("    betaReviewState: ").append(toIndentedString(betaReviewState)).append("\n");
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

