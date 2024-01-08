package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PatchOperation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PatchFeatureFlagRequest
 */

@JsonTypeName("patchFeatureFlag_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class PatchFeatureFlagRequest {

  private String comment;

  @Valid
  private List<@Valid PatchOperation> patch;

  public PatchFeatureFlagRequest comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  */
  
  @Schema(name = "comment", example = "This is a comment string", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public PatchFeatureFlagRequest patch(List<@Valid PatchOperation> patch) {
    this.patch = patch;
    return this;
  }

  public PatchFeatureFlagRequest addPatchItem(PatchOperation patchItem) {
    if (this.patch == null) {
      this.patch = new ArrayList<>();
    }
    this.patch.add(patchItem);
    return this;
  }

  /**
   * Get patch
   * @return patch
  */
  @Valid 
  @Schema(name = "patch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("patch")
  public List<@Valid PatchOperation> getPatch() {
    return patch;
  }

  public void setPatch(List<@Valid PatchOperation> patch) {
    this.patch = patch;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchFeatureFlagRequest patchFeatureFlagRequest = (PatchFeatureFlagRequest) o;
    return Objects.equals(this.comment, patchFeatureFlagRequest.comment) &&
        Objects.equals(this.patch, patchFeatureFlagRequest.patch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, patch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchFeatureFlagRequest {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
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

