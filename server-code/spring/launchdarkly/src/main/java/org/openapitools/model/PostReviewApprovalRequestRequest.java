package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostReviewApprovalRequestRequest
 */

@JsonTypeName("postReviewApprovalRequest_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class PostReviewApprovalRequestRequest {

  private String comment;

  /**
   * One of approve, decline, or comment.
   */
  public enum KindEnum {
    APPROVE("approve"),
    
    DECLINE("decline"),
    
    COMMENT("comment");

    private String value;

    KindEnum(String value) {
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
    public static KindEnum fromValue(String value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private KindEnum kind;

  public PostReviewApprovalRequestRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostReviewApprovalRequestRequest(KindEnum kind) {
    this.kind = kind;
  }

  public PostReviewApprovalRequestRequest comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * comment will be included in audit log item for change.
   * @return comment
  */
  
  @Schema(name = "comment", example = "This is a comment string", description = "comment will be included in audit log item for change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public PostReviewApprovalRequestRequest kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

  /**
   * One of approve, decline, or comment.
   * @return kind
  */
  @NotNull 
  @Schema(name = "kind", example = "approve", description = "One of approve, decline, or comment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("kind")
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostReviewApprovalRequestRequest postReviewApprovalRequestRequest = (PostReviewApprovalRequestRequest) o;
    return Objects.equals(this.comment, postReviewApprovalRequestRequest.comment) &&
        Objects.equals(this.kind, postReviewApprovalRequestRequest.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, kind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostReviewApprovalRequestRequest {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

