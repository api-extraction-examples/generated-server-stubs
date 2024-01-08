package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This extends from ExecuteRequestBase to add the preview_only option.  (1) Providers who allow side effects or (2) actions that do not have a side effect should use this class.
 */

@Schema(name = "ExecuteRequest", description = "This extends from ExecuteRequestBase to add the preview_only option.  (1) Providers who allow side effects or (2) actions that do not have a side effect should use this class.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:55:55.879556-04:00[America/Lower_Princes]")
public class ExecuteRequest {

  private String instructions;

  private Boolean previewOnly = false;

  public ExecuteRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExecuteRequest(String instructions) {
    this.instructions = instructions;
  }

  public ExecuteRequest instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  /**
   * Plain english instructions. Provide as much detail as possible, even if other fields are present.
   * @return instructions
  */
  @NotNull 
  @Schema(name = "instructions", description = "Plain english instructions. Provide as much detail as possible, even if other fields are present.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("instructions")
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public ExecuteRequest previewOnly(Boolean previewOnly) {
    this.previewOnly = previewOnly;
    return this;
  }

  /**
   * If true, we will not execute the action, but will return the params of the preview.
   * @return previewOnly
  */
  
  @Schema(name = "preview_only", description = "If true, we will not execute the action, but will return the params of the preview.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preview_only")
  public Boolean getPreviewOnly() {
    return previewOnly;
  }

  public void setPreviewOnly(Boolean previewOnly) {
    this.previewOnly = previewOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteRequest executeRequest = (ExecuteRequest) o;
    return Objects.equals(this.instructions, executeRequest.instructions) &&
        Objects.equals(this.previewOnly, executeRequest.previewOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructions, previewOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteRequest {\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    previewOnly: ").append(toIndentedString(previewOnly)).append("\n");
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

