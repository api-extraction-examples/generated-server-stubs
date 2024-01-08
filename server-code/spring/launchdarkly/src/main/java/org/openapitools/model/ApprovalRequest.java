package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ApprovalRequestReview;
import org.openapitools.model.ApprovalRequestReviewStatus;
import org.openapitools.model.SemanticPatchInstructionInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApprovalRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class ApprovalRequest {

  private String id;

  private Integer version;

  @Valid
  private List<@Valid ApprovalRequestReview> allReviews;

  private String appliedByMemberID;

  private Integer appliedDate;

  private Integer creationDate;

  private Long executionDate;

  @Valid
  private List<@Valid SemanticPatchInstructionInner> instructions;

  @Valid
  private List<String> notifyMemberIds;

  private String operatingOnId;

  private String requestorId;

  private ApprovalRequestReviewStatus reviewStatus;

  /**
   * | Name      | Description | | ---------:| ----------- | | pending   | the approval request has not been applied yet | | completed | the approval request has been applied successfully | | scheduled | the approval request for a scheduled change has been applied successfully | | failed    | the approval request has been applied but the changes were not applied successfully | 
   */
  public enum StatusEnum {
    PENDING("pending"),
    
    COMPLETED("completed"),
    
    SCHEDULED("scheduled"),
    
    FAILED("failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  public ApprovalRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique resource id.
   * @return id
  */
  
  @Schema(name = "_id", example = "5a580a01b4ff89217bdf9dc1", description = "The unique resource id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ApprovalRequest version(Integer version) {
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

  public ApprovalRequest allReviews(List<@Valid ApprovalRequestReview> allReviews) {
    this.allReviews = allReviews;
    return this;
  }

  public ApprovalRequest addAllReviewsItem(ApprovalRequestReview allReviewsItem) {
    if (this.allReviews == null) {
      this.allReviews = new ArrayList<>();
    }
    this.allReviews.add(allReviewsItem);
    return this;
  }

  /**
   * Get allReviews
   * @return allReviews
  */
  @Valid 
  @Schema(name = "allReviews", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allReviews")
  public List<@Valid ApprovalRequestReview> getAllReviews() {
    return allReviews;
  }

  public void setAllReviews(List<@Valid ApprovalRequestReview> allReviews) {
    this.allReviews = allReviews;
  }

  public ApprovalRequest appliedByMemberID(String appliedByMemberID) {
    this.appliedByMemberID = appliedByMemberID;
    return this;
  }

  /**
   * The id of the member that applied the approval request
   * @return appliedByMemberID
  */
  
  @Schema(name = "appliedByMemberID", description = "The id of the member that applied the approval request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appliedByMemberID")
  public String getAppliedByMemberID() {
    return appliedByMemberID;
  }

  public void setAppliedByMemberID(String appliedByMemberID) {
    this.appliedByMemberID = appliedByMemberID;
  }

  public ApprovalRequest appliedDate(Integer appliedDate) {
    this.appliedDate = appliedDate;
    return this;
  }

  /**
   * A unix epoch time in milliseconds specifying the date the approval request was applied
   * @return appliedDate
  */
  
  @Schema(name = "appliedDate", description = "A unix epoch time in milliseconds specifying the date the approval request was applied", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appliedDate")
  public Integer getAppliedDate() {
    return appliedDate;
  }

  public void setAppliedDate(Integer appliedDate) {
    this.appliedDate = appliedDate;
  }

  public ApprovalRequest creationDate(Integer creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * A unix epoch time in milliseconds specifying the date the approval request was requested
   * @return creationDate
  */
  
  @Schema(name = "creationDate", description = "A unix epoch time in milliseconds specifying the date the approval request was requested", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationDate")
  public Integer getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Integer creationDate) {
    this.creationDate = creationDate;
  }

  public ApprovalRequest executionDate(Long executionDate) {
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

  public ApprovalRequest instructions(List<@Valid SemanticPatchInstructionInner> instructions) {
    this.instructions = instructions;
    return this;
  }

  public ApprovalRequest addInstructionsItem(SemanticPatchInstructionInner instructionsItem) {
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

  public ApprovalRequest notifyMemberIds(List<String> notifyMemberIds) {
    this.notifyMemberIds = notifyMemberIds;
    return this;
  }

  public ApprovalRequest addNotifyMemberIdsItem(String notifyMemberIdsItem) {
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
  
  @Schema(name = "notifyMemberIds", example = "[memberId, memberId2]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifyMemberIds")
  public List<String> getNotifyMemberIds() {
    return notifyMemberIds;
  }

  public void setNotifyMemberIds(List<String> notifyMemberIds) {
    this.notifyMemberIds = notifyMemberIds;
  }

  public ApprovalRequest operatingOnId(String operatingOnId) {
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

  public ApprovalRequest requestorId(String requestorId) {
    this.requestorId = requestorId;
    return this;
  }

  /**
   * The id of the member that requested the change
   * @return requestorId
  */
  
  @Schema(name = "requestorId", description = "The id of the member that requested the change", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestorId")
  public String getRequestorId() {
    return requestorId;
  }

  public void setRequestorId(String requestorId) {
    this.requestorId = requestorId;
  }

  public ApprovalRequest reviewStatus(ApprovalRequestReviewStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
    return this;
  }

  /**
   * Get reviewStatus
   * @return reviewStatus
  */
  @Valid 
  @Schema(name = "reviewStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reviewStatus")
  public ApprovalRequestReviewStatus getReviewStatus() {
    return reviewStatus;
  }

  public void setReviewStatus(ApprovalRequestReviewStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

  public ApprovalRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * | Name      | Description | | ---------:| ----------- | | pending   | the approval request has not been applied yet | | completed | the approval request has been applied successfully | | scheduled | the approval request for a scheduled change has been applied successfully | | failed    | the approval request has been applied but the changes were not applied successfully | 
   * @return status
  */
  
  @Schema(name = "status", description = "| Name      | Description | | ---------:| ----------- | | pending   | the approval request has not been applied yet | | completed | the approval request has been applied successfully | | scheduled | the approval request for a scheduled change has been applied successfully | | failed    | the approval request has been applied but the changes were not applied successfully | ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprovalRequest approvalRequest = (ApprovalRequest) o;
    return Objects.equals(this.id, approvalRequest.id) &&
        Objects.equals(this.version, approvalRequest.version) &&
        Objects.equals(this.allReviews, approvalRequest.allReviews) &&
        Objects.equals(this.appliedByMemberID, approvalRequest.appliedByMemberID) &&
        Objects.equals(this.appliedDate, approvalRequest.appliedDate) &&
        Objects.equals(this.creationDate, approvalRequest.creationDate) &&
        Objects.equals(this.executionDate, approvalRequest.executionDate) &&
        Objects.equals(this.instructions, approvalRequest.instructions) &&
        Objects.equals(this.notifyMemberIds, approvalRequest.notifyMemberIds) &&
        Objects.equals(this.operatingOnId, approvalRequest.operatingOnId) &&
        Objects.equals(this.requestorId, approvalRequest.requestorId) &&
        Objects.equals(this.reviewStatus, approvalRequest.reviewStatus) &&
        Objects.equals(this.status, approvalRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, allReviews, appliedByMemberID, appliedDate, creationDate, executionDate, instructions, notifyMemberIds, operatingOnId, requestorId, reviewStatus, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    allReviews: ").append(toIndentedString(allReviews)).append("\n");
    sb.append("    appliedByMemberID: ").append(toIndentedString(appliedByMemberID)).append("\n");
    sb.append("    appliedDate: ").append(toIndentedString(appliedDate)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    notifyMemberIds: ").append(toIndentedString(notifyMemberIds)).append("\n");
    sb.append("    operatingOnId: ").append(toIndentedString(operatingOnId)).append("\n");
    sb.append("    requestorId: ").append(toIndentedString(requestorId)).append("\n");
    sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

