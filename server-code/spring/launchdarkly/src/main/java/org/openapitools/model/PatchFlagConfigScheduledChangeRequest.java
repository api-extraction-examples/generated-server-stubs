package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SemanticPatchInstructionInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PatchFlagConfigScheduledChangeRequest
 */

@JsonTypeName("patchFlagConfigScheduledChange_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class PatchFlagConfigScheduledChangeRequest {

  private String comment;

  @Valid
  private List<@Valid SemanticPatchInstructionInner> instructions;

  public PatchFlagConfigScheduledChangeRequest comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Used to describe the scheduled changes.
   * @return comment
  */
  
  @Schema(name = "comment", description = "Used to describe the scheduled changes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public PatchFlagConfigScheduledChangeRequest instructions(List<@Valid SemanticPatchInstructionInner> instructions) {
    this.instructions = instructions;
    return this;
  }

  public PatchFlagConfigScheduledChangeRequest addInstructionsItem(SemanticPatchInstructionInner instructionsItem) {
    if (this.instructions == null) {
      this.instructions = new ArrayList<>();
    }
    this.instructions.add(instructionsItem);
    return this;
  }

  /**
   * Get instructions
   * @return instructions
  */
  @Valid 
  @Schema(name = "instructions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instructions")
  public List<@Valid SemanticPatchInstructionInner> getInstructions() {
    return instructions;
  }

  public void setInstructions(List<@Valid SemanticPatchInstructionInner> instructions) {
    this.instructions = instructions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchFlagConfigScheduledChangeRequest patchFlagConfigScheduledChangeRequest = (PatchFlagConfigScheduledChangeRequest) o;
    return Objects.equals(this.comment, patchFlagConfigScheduledChangeRequest.comment) &&
        Objects.equals(this.instructions, patchFlagConfigScheduledChangeRequest.instructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, instructions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchFlagConfigScheduledChangeRequest {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
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

