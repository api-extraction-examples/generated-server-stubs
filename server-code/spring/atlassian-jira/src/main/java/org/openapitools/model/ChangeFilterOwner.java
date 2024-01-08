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
 * The account ID of the new owner.
 */

@Schema(name = "ChangeFilterOwner", description = "The account ID of the new owner.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ChangeFilterOwner {

  private String accountId;

  public ChangeFilterOwner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChangeFilterOwner(String accountId) {
    this.accountId = accountId;
  }

  public ChangeFilterOwner accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account ID of the new owner.
   * @return accountId
  */
  @NotNull 
  @Schema(name = "accountId", description = "The account ID of the new owner.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeFilterOwner changeFilterOwner = (ChangeFilterOwner) o;
    return Objects.equals(this.accountId, changeFilterOwner.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeFilterOwner {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

