package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RelationshipInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:07.987869-04:00[America/Lower_Princes]")
public class RelationshipInfo {

  /**
   * Status of incoming relationship
   */
  public enum IncomingStatusEnum {
    NONE("none"),
    
    FOLLOWED_BY("followed_by"),
    
    REQUESTED_BY("requested_by");

    private String value;

    IncomingStatusEnum(String value) {
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
    public static IncomingStatusEnum fromValue(String value) {
      for (IncomingStatusEnum b : IncomingStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private IncomingStatusEnum incomingStatus;

  /**
   * Status of outgoing relationship
   */
  public enum OutgoingStatusEnum {
    NONE("none"),
    
    FOLLOWS("follows"),
    
    REQUESTED("requested");

    private String value;

    OutgoingStatusEnum(String value) {
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
    public static OutgoingStatusEnum fromValue(String value) {
      for (OutgoingStatusEnum b : OutgoingStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OutgoingStatusEnum outgoingStatus;

  private Boolean targetUserIsPrivate;

  public RelationshipInfo incomingStatus(IncomingStatusEnum incomingStatus) {
    this.incomingStatus = incomingStatus;
    return this;
  }

  /**
   * Status of incoming relationship
   * @return incomingStatus
  */
  
  @Schema(name = "incoming_status", description = "Status of incoming relationship", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incoming_status")
  public IncomingStatusEnum getIncomingStatus() {
    return incomingStatus;
  }

  public void setIncomingStatus(IncomingStatusEnum incomingStatus) {
    this.incomingStatus = incomingStatus;
  }

  public RelationshipInfo outgoingStatus(OutgoingStatusEnum outgoingStatus) {
    this.outgoingStatus = outgoingStatus;
    return this;
  }

  /**
   * Status of outgoing relationship
   * @return outgoingStatus
  */
  
  @Schema(name = "outgoing_status", description = "Status of outgoing relationship", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outgoing_status")
  public OutgoingStatusEnum getOutgoingStatus() {
    return outgoingStatus;
  }

  public void setOutgoingStatus(OutgoingStatusEnum outgoingStatus) {
    this.outgoingStatus = outgoingStatus;
  }

  public RelationshipInfo targetUserIsPrivate(Boolean targetUserIsPrivate) {
    this.targetUserIsPrivate = targetUserIsPrivate;
    return this;
  }

  /**
   * Indicates whether target user is private or not
   * @return targetUserIsPrivate
  */
  
  @Schema(name = "target_user_is_private", description = "Indicates whether target user is private or not", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("target_user_is_private")
  public Boolean getTargetUserIsPrivate() {
    return targetUserIsPrivate;
  }

  public void setTargetUserIsPrivate(Boolean targetUserIsPrivate) {
    this.targetUserIsPrivate = targetUserIsPrivate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipInfo relationshipInfo = (RelationshipInfo) o;
    return Objects.equals(this.incomingStatus, relationshipInfo.incomingStatus) &&
        Objects.equals(this.outgoingStatus, relationshipInfo.outgoingStatus) &&
        Objects.equals(this.targetUserIsPrivate, relationshipInfo.targetUserIsPrivate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incomingStatus, outgoingStatus, targetUserIsPrivate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipInfo {\n");
    sb.append("    incomingStatus: ").append(toIndentedString(incomingStatus)).append("\n");
    sb.append("    outgoingStatus: ").append(toIndentedString(outgoingStatus)).append("\n");
    sb.append("    targetUserIsPrivate: ").append(toIndentedString(targetUserIsPrivate)).append("\n");
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

