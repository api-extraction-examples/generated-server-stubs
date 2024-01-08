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
 * RelationshipStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:07.987869-04:00[America/Lower_Princes]")
public class RelationshipStatus {

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

  public RelationshipStatus outgoingStatus(OutgoingStatusEnum outgoingStatus) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipStatus relationshipStatus = (RelationshipStatus) o;
    return Objects.equals(this.outgoingStatus, relationshipStatus.outgoingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outgoingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipStatus {\n");
    sb.append("    outgoingStatus: ").append(toIndentedString(outgoingStatus)).append("\n");
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

