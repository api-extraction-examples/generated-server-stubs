package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * FeatureFlagScheduledChange
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class FeatureFlagScheduledChange {

  private String id;

  private Integer version;

  private Integer executionDate;

  @Valid
  private List<@Valid SemanticPatchInstructionInner> instructions;

  public FeatureFlagScheduledChange id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FeatureFlagScheduledChange version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "_version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public FeatureFlagScheduledChange executionDate(Integer executionDate) {
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

  public FeatureFlagScheduledChange instructions(List<@Valid SemanticPatchInstructionInner> instructions) {
    this.instructions = instructions;
    return this;
  }

  public FeatureFlagScheduledChange addInstructionsItem(SemanticPatchInstructionInner instructionsItem) {
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
    FeatureFlagScheduledChange featureFlagScheduledChange = (FeatureFlagScheduledChange) o;
    return Objects.equals(this.id, featureFlagScheduledChange.id) &&
        Objects.equals(this.version, featureFlagScheduledChange.version) &&
        Objects.equals(this.executionDate, featureFlagScheduledChange.executionDate) &&
        Objects.equals(this.instructions, featureFlagScheduledChange.instructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, executionDate, instructions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagScheduledChange {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

