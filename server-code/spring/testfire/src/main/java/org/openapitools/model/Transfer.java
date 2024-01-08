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
 * Transfer
 */

@JsonTypeName("transfer")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:55:43.475854-04:00[America/Lower_Princes]")
public class Transfer {

  private String fromAccount;

  private String toAccount;

  private String transferAmount;

  public Transfer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Transfer(String fromAccount, String toAccount, String transferAmount) {
    this.fromAccount = fromAccount;
    this.toAccount = toAccount;
    this.transferAmount = transferAmount;
  }

  public Transfer fromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
    return this;
  }

  /**
   * Get fromAccount
   * @return fromAccount
  */
  @NotNull 
  @Schema(name = "fromAccount", example = "800003", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fromAccount")
  public String getFromAccount() {
    return fromAccount;
  }

  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }

  public Transfer toAccount(String toAccount) {
    this.toAccount = toAccount;
    return this;
  }

  /**
   * Get toAccount
   * @return toAccount
  */
  @NotNull 
  @Schema(name = "toAccount", example = "800002", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("toAccount")
  public String getToAccount() {
    return toAccount;
  }

  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }

  public Transfer transferAmount(String transferAmount) {
    this.transferAmount = transferAmount;
    return this;
  }

  /**
   * Get transferAmount
   * @return transferAmount
  */
  @NotNull 
  @Schema(name = "transferAmount", example = "200", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transferAmount")
  public String getTransferAmount() {
    return transferAmount;
  }

  public void setTransferAmount(String transferAmount) {
    this.transferAmount = transferAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transfer transfer = (Transfer) o;
    return Objects.equals(this.fromAccount, transfer.fromAccount) &&
        Objects.equals(this.toAccount, transfer.toAccount) &&
        Objects.equals(this.transferAmount, transfer.transferAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, toAccount, transferAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transfer {\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
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

