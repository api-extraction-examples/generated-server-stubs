package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppStoreVersionRelationshipsBuild;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BetaAppReviewSubmissionRelationships
 */

@JsonTypeName("BetaAppReviewSubmission_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaAppReviewSubmissionRelationships {

  private AppStoreVersionRelationshipsBuild build;

  public BetaAppReviewSubmissionRelationships build(AppStoreVersionRelationshipsBuild build) {
    this.build = build;
    return this;
  }

  /**
   * Get build
   * @return build
  */
  @Valid 
  @Schema(name = "build", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("build")
  public AppStoreVersionRelationshipsBuild getBuild() {
    return build;
  }

  public void setBuild(AppStoreVersionRelationshipsBuild build) {
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
    BetaAppReviewSubmissionRelationships betaAppReviewSubmissionRelationships = (BetaAppReviewSubmissionRelationships) o;
    return Objects.equals(this.build, betaAppReviewSubmissionRelationships.build);
  }

  @Override
  public int hashCode() {
    return Objects.hash(build);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaAppReviewSubmissionRelationships {\n");
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

