package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Expensify policy tag information
 */

@Schema(name = "policy-tag-input", description = "Expensify policy tag information")
@JsonTypeName("policy-tag-input")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:46.390673-04:00[America/Lower_Princes]")
public class PolicyTagInput {

  private String email;

  private String ticketID;

  private String txnType;

  private String username;

  public PolicyTagInput email(String email) {
    this.email = email;
    return this;
  }

  /**
   * email of the individual or beneficiary
   * @return email
  */
  
  @Schema(name = "Email", example = "john-doe@email.com", description = "email of the individual or beneficiary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PolicyTagInput ticketID(String ticketID) {
    this.ticketID = ticketID;
    return this;
  }

  /**
   * Unique ID of the ticket - required for travel funds
   * @return ticketID
  */
  
  @Schema(name = "TicketID", example = "F11B6C1D67DC6A3D", description = "Unique ID of the ticket - required for travel funds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TicketID")
  public String getTicketID() {
    return ticketID;
  }

  public void setTicketID(String ticketID) {
    this.ticketID = ticketID;
  }

  public PolicyTagInput txnType(String txnType) {
    this.txnType = txnType;
    return this;
  }

  /**
   * Type of transaction
   * @return txnType
  */
  
  @Schema(name = "TxnType", example = "Travel Fund", description = "Type of transaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TxnType")
  public String getTxnType() {
    return txnType;
  }

  public void setTxnType(String txnType) {
    this.txnType = txnType;
  }

  public PolicyTagInput username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Unique username or lfId of the individual
   * @return username
  */
  
  @Schema(name = "Username", example = "john_doe", description = "Unique username or lfId of the individual", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyTagInput policyTagInput = (PolicyTagInput) o;
    return Objects.equals(this.email, policyTagInput.email) &&
        Objects.equals(this.ticketID, policyTagInput.ticketID) &&
        Objects.equals(this.txnType, policyTagInput.txnType) &&
        Objects.equals(this.username, policyTagInput.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, ticketID, txnType, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyTagInput {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    ticketID: ").append(toIndentedString(ticketID)).append("\n");
    sb.append("    txnType: ").append(toIndentedString(txnType)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

