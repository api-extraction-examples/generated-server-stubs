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
 * CancellationRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class CancellationRequest {

  private String cancelConfirmationToken;

  public CancellationRequest cancelConfirmationToken(String cancelConfirmationToken) {
    this.cancelConfirmationToken = cancelConfirmationToken;
    return this;
  }

  /**
   * Token affirming the user accepts the cancellation fee. Required if a cancellation fee is in effect.
   * @return cancelConfirmationToken
  */
  
  @Schema(name = "cancel_confirmation_token", description = "Token affirming the user accepts the cancellation fee. Required if a cancellation fee is in effect.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cancel_confirmation_token")
  public String getCancelConfirmationToken() {
    return cancelConfirmationToken;
  }

  public void setCancelConfirmationToken(String cancelConfirmationToken) {
    this.cancelConfirmationToken = cancelConfirmationToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancellationRequest cancellationRequest = (CancellationRequest) o;
    return Objects.equals(this.cancelConfirmationToken, cancellationRequest.cancelConfirmationToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelConfirmationToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancellationRequest {\n");
    sb.append("    cancelConfirmationToken: ").append(toIndentedString(cancelConfirmationToken)).append("\n");
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

