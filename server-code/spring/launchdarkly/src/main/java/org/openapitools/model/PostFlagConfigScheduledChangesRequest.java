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
 * PostFlagConfigScheduledChangesRequest
 */

@JsonTypeName("postFlagConfigScheduledChanges_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class PostFlagConfigScheduledChangesRequest {

  private String comment;

  private Integer executionDate;

  @Valid
  private List<@Valid SemanticPatchInstructionInner> instructions;

  public PostFlagConfigScheduledChangesRequest comment(String comment) {
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

  public PostFlagConfigScheduledChangesRequest executionDate(Integer executionDate) {
    this.executionDate = executionDate;
    return this;
  }

  /**
   * A unix epoch time in milliseconds specifying the date the scheduled changes will be applied
   * @return executionDate
  */
  
  @Schema(name = "executionDate", description = "A unix epoch time in milliseconds specifying the date the scheduled changes will be applied", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionDate")
  public Integer getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(Integer executionDate) {
    this.executionDate = executionDate;
  }

  public PostFlagConfigScheduledChangesRequest instructions(List<@Valid SemanticPatchInstructionInner> instructions) {
    this.instructions = instructions;
    return this;
  }

  public PostFlagConfigScheduledChangesRequest addInstructionsItem(SemanticPatchInstructionInner instructionsItem) {
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
    PostFlagConfigScheduledChangesRequest postFlagConfigScheduledChangesRequest = (PostFlagConfigScheduledChangesRequest) o;
    return Objects.equals(this.comment, postFlagConfigScheduledChangesRequest.comment) &&
        Objects.equals(this.executionDate, postFlagConfigScheduledChangesRequest.executionDate) &&
        Objects.equals(this.instructions, postFlagConfigScheduledChangesRequest.instructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, executionDate, instructions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostFlagConfigScheduledChangesRequest {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
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

