package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.BetaAppReviewSubmissionCreateRequestDataRelationshipsBuild;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BetaAppReviewSubmissionCreateRequestDataRelationships
 */

@JsonTypeName("BetaAppReviewSubmissionCreateRequest_data_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaAppReviewSubmissionCreateRequestDataRelationships {

  private BetaAppReviewSubmissionCreateRequestDataRelationshipsBuild build;

  public BetaAppReviewSubmissionCreateRequestDataRelationships() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BetaAppReviewSubmissionCreateRequestDataRelationships(BetaAppReviewSubmissionCreateRequestDataRelationshipsBuild build) {
    this.build = build;
  }

  public BetaAppReviewSubmissionCreateRequestDataRelationships build(BetaAppReviewSubmissionCreateRequestDataRelationshipsBuild build) {
    this.build = build;
    return this;
  }

  /**
   * Get build
   * @return build
  */
  @NotNull @Valid 
  @Schema(name = "build", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("build")
  public BetaAppReviewSubmissionCreateRequestDataRelationshipsBuild getBuild() {
    return build;
  }

  public void setBuild(BetaAppReviewSubmissionCreateRequestDataRelationshipsBuild build) {
    this.build = build;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetaAppReviewSubmissionCreateRequestDataRelationships betaAppReviewSubmissionCreateRequestDataRelationships = (BetaAppReviewSubmissionCreateRequestDataRelationships) o;
    return Objects.equals(this.build, betaAppReviewSubmissionCreateRequestDataRelationships.build);
  }

  @Override
  public int hashCode() {
    return Objects.hash(build);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaAppReviewSubmissionCreateRequestDataRelationships {\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
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

