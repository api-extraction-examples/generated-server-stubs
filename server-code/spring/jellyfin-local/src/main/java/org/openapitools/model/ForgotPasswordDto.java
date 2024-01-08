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
 * Forgot Password request body DTO.
 */

@Schema(name = "ForgotPasswordDto", description = "Forgot Password request body DTO.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ForgotPasswordDto {

  private String enteredUsername;

  public ForgotPasswordDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ForgotPasswordDto(String enteredUsername) {
    this.enteredUsername = enteredUsername;
  }

  public ForgotPasswordDto enteredUsername(String enteredUsername) {
    this.enteredUsername = enteredUsername;
    return this;
  }

  /**
   * Gets or sets the entered username to have its password reset.
   * @return enteredUsername
  */
  @NotNull 
  @Schema(name = "EnteredUsername", description = "Gets or sets the entered username to have its password reset.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("EnteredUsername")
  public String getEnteredUsername() {
    return enteredUsername;
  }

  public void setEnteredUsername(String enteredUsername) {
    this.enteredUsername = enteredUsername;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForgotPasswordDto forgotPasswordDto = (ForgotPasswordDto) o;
    return Objects.equals(this.enteredUsername, forgotPasswordDto.enteredUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enteredUsername);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForgotPasswordDto {\n");
    sb.append("    enteredUsername: ").append(toIndentedString(enteredUsername)).append("\n");
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

