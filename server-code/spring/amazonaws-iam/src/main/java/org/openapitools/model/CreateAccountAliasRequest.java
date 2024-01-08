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
 * CreateAccountAliasRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreateAccountAliasRequest {

  private String accountAlias;

  public CreateAccountAliasRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateAccountAliasRequest(String accountAlias) {
    this.accountAlias = accountAlias;
  }

  public CreateAccountAliasRequest accountAlias(String accountAlias) {
    this.accountAlias = accountAlias;
    return this;
  }

  /**
   * Get accountAlias
   * @return accountAlias
  */
  @NotNull 
  @Schema(name = "AccountAlias", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AccountAlias")
  public String getAccountAlias() {
    return accountAlias;
  }

  public void setAccountAlias(String accountAlias) {
    this.accountAlias = accountAlias;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccountAliasRequest createAccountAliasRequest = (CreateAccountAliasRequest) o;
    return Objects.equals(this.accountAlias, createAccountAliasRequest.accountAlias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountAlias);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountAliasRequest {\n");
    sb.append("    accountAlias: ").append(toIndentedString(accountAlias)).append("\n");
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

