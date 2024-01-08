package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ApprovalRequestReviewStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApprovalRequestReview
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class ApprovalRequestReview {

  private String id;

  private Integer creationDate;

  private ApprovalRequestReviewStatus kind;

  private String memberId;

  public ApprovalRequestReview id(String id) {
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

  public ApprovalRequestReview creationDate(Integer creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * A unix epoch time in milliseconds specifying the date the approval request was reviewed
   * @return creationDate
  */
  
  @Schema(name = "creationDate", description = "A unix epoch time in milliseconds specifying the date the approval request was reviewed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationDate")
  public Integer getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Integer creationDate) {
    this.creationDate = creationDate;
  }

  public ApprovalRequestReview kind(ApprovalRequestReviewStatus kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
  */
  @Valid 
  @Schema(name = "kind", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public ApprovalRequestReviewStatus getKind() {
    return kind;
  }

  public void setKind(ApprovalRequestReviewStatus kind) {
    this.kind = kind;
  }

  public ApprovalRequestReview memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * The unique resource id.
   * @return memberId
  */
  
  @Schema(name = "memberId", example = "5a580a01b4ff89217bdf9dc1", description = "The unique resource id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("memberId")
  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprovalRequestReview approvalRequestReview = (ApprovalRequestReview) o;
    return Objects.equals(this.id, approvalRequestReview.id) &&
        Objects.equals(this.creationDate, approvalRequestReview.creationDate) &&
        Objects.equals(this.kind, approvalRequestReview.kind) &&
        Objects.equals(this.memberId, approvalRequestReview.memberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creationDate, kind, memberId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalRequestReview {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
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

