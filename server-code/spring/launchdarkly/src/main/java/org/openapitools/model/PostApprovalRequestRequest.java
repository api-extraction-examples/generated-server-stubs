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
 * PostApprovalRequestRequest
 */

@JsonTypeName("postApprovalRequest_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class PostApprovalRequestRequest {

  private String comment;

  private String description;

  private Long executionDate;

  @Valid
  private List<@Valid SemanticPatchInstructionInner> instructions = new ArrayList<>();

  @Valid
  private List<String> notifyMemberIds = new ArrayList<>();

  private String operatingOnId;

  public PostApprovalRequestRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostApprovalRequestRequest(String description, List<@Valid SemanticPatchInstructionInner> instructions, List<String> notifyMemberIds) {
    this.description = description;
    this.instructions = instructions;
    this.notifyMemberIds = notifyMemberIds;
  }

  public PostApprovalRequestRequest comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * comment will be included in audit log item for change.
   * @return comment
  */
  
  @Schema(name = "comment", description = "comment will be included in audit log item for change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public PostApprovalRequestRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A name that describes the changes you would like to apply to a feature flag configuration
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "A name that describes the changes you would like to apply to a feature flag configuration", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PostApprovalRequestRequest executionDate(Long executionDate) {
    this.executionDate = executionDate;
    return this;
  }

  /**
   * Timestamp for when instructions will be executed
   * @return executionDate
  */
  
  @Schema(name = "executionDate", description = "Timestamp for when instructions will be executed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionDate")
  public Long getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(Long executionDate) {
    this.executionDate = executionDate;
  }

  public PostApprovalRequestRequest instructions(List<@Valid SemanticPatchInstructionInner> instructions) {
    this.instructions = instructions;
    return this;
  }

  public PostApprovalRequestRequest addInstructionsItem(SemanticPatchInstructionInner instructionsItem) {
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
  @NotNull @Valid 
  @Schema(name = "instructions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("instructions")
  public List<@Valid SemanticPatchInstructionInner> getInstructions() {
    return instructions;
  }

  public void setInstructions(List<@Valid SemanticPatchInstructionInner> instructions) {
    this.instructions = instructions;
  }

  public PostApprovalRequestRequest notifyMemberIds(List<String> notifyMemberIds) {
    this.notifyMemberIds = notifyMemberIds;
    return this;
  }

  public PostApprovalRequestRequest addNotifyMemberIdsItem(String notifyMemberIdsItem) {
    if (this.notifyMemberIds == null) {
      this.notifyMemberIds = new ArrayList<>();
    }
    this.notifyMemberIds.add(notifyMemberIdsItem);
    return this;
  }

  /**
   * Get notifyMemberIds
   * @return notifyMemberIds
  */
  @NotNull 
  @Schema(name = "notifyMemberIds", example = "[memberId, memberId2]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("notifyMemberIds")
  public List<String> getNotifyMemberIds() {
    return notifyMemberIds;
  }

  public void setNotifyMemberIds(List<String> notifyMemberIds) {
    this.notifyMemberIds = notifyMemberIds;
  }

  public PostApprovalRequestRequest operatingOnId(String operatingOnId) {
    this.operatingOnId = operatingOnId;
    return this;
  }

  /**
   * ID of scheduled change to edit or delete
   * @return operatingOnId
  */
  
  @Schema(name = "operatingOnId", description = "ID of scheduled change to edit or delete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operatingOnId")
  public String getOperatingOnId() {
    return operatingOnId;
  }

  public void setOperatingOnId(String operatingOnId) {
    this.operatingOnId = operatingOnId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostApprovalRequestRequest postApprovalRequestRequest = (PostApprovalRequestRequest) o;
    return Objects.equals(this.comment, postApprovalRequestRequest.comment) &&
        Objects.equals(this.description, postApprovalRequestRequest.description) &&
        Objects.equals(this.executionDate, postApprovalRequestRequest.executionDate) &&
        Objects.equals(this.instructions, postApprovalRequestRequest.instructions) &&
        Objects.equals(this.notifyMemberIds, postApprovalRequestRequest.notifyMemberIds) &&
        Objects.equals(this.operatingOnId, postApprovalRequestRequest.operatingOnId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, description, executionDate, instructions, notifyMemberIds, operatingOnId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostApprovalRequestRequest {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    notifyMemberIds: ").append(toIndentedString(notifyMemberIds)).append("\n");
    sb.append("    operatingOnId: ").append(toIndentedString(operatingOnId)).append("\n");
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

