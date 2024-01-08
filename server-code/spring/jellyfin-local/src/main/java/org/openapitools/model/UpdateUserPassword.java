package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The update user password request body.
 */

@Schema(name = "UpdateUserPassword", description = "The update user password request body.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class UpdateUserPassword {

  private JsonNullable<String> currentPassword = JsonNullable.<String>undefined();

  private JsonNullable<String> currentPw = JsonNullable.<String>undefined();

  private JsonNullable<String> newPw = JsonNullable.<String>undefined();

  private Boolean resetPassword;

  public UpdateUserPassword currentPassword(String currentPassword) {
    this.currentPassword = JsonNullable.of(currentPassword);
    return this;
  }

  /**
   * Gets or sets the current sha1-hashed password.
   * @return currentPassword
  */
  
  @Schema(name = "CurrentPassword", description = "Gets or sets the current sha1-hashed password.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CurrentPassword")
  public JsonNullable<String> getCurrentPassword() {
    return currentPassword;
  }

  public void setCurrentPassword(JsonNullable<String> currentPassword) {
    this.currentPassword = currentPassword;
  }

  public UpdateUserPassword currentPw(String currentPw) {
    this.currentPw = JsonNullable.of(currentPw);
    return this;
  }

  /**
   * Gets or sets the current plain text password.
   * @return currentPw
  */
  
  @Schema(name = "CurrentPw", description = "Gets or sets the current plain text password.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CurrentPw")
  public JsonNullable<String> getCurrentPw() {
    return currentPw;
  }

  public void setCurrentPw(JsonNullable<String> currentPw) {
    this.currentPw = currentPw;
  }

  public UpdateUserPassword newPw(String newPw) {
    this.newPw = JsonNullable.of(newPw);
    return this;
  }

  /**
   * Gets or sets the new plain text password.
   * @return newPw
  */
  
  @Schema(name = "NewPw", description = "Gets or sets the new plain text password.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NewPw")
  public JsonNullable<String> getNewPw() {
    return newPw;
  }

  public void setNewPw(JsonNullable<String> newPw) {
    this.newPw = newPw;
  }

  public UpdateUserPassword resetPassword(Boolean resetPassword) {
    this.resetPassword = resetPassword;
    return this;
  }

  /**
   * Gets or sets a value indicating whether to reset the password.
   * @return resetPassword
  */
  
  @Schema(name = "ResetPassword", description = "Gets or sets a value indicating whether to reset the password.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ResetPassword")
  public Boolean getResetPassword() {
    return resetPassword;
  }

  public void setResetPassword(Boolean resetPassword) {
    this.resetPassword = resetPassword;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserPassword updateUserPassword = (UpdateUserPassword) o;
    return equalsNullable(this.currentPassword, updateUserPassword.currentPassword) &&
        equalsNullable(this.currentPw, updateUserPassword.currentPw) &&
        equalsNullable(this.newPw, updateUserPassword.newPw) &&
        Objects.equals(this.resetPassword, updateUserPassword.resetPassword);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(currentPassword), hashCodeNullable(currentPw), hashCodeNullable(newPw), resetPassword);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserPassword {\n");
    sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
    sb.append("    currentPw: ").append(toIndentedString(currentPw)).append("\n");
    sb.append("    newPw: ").append(toIndentedString(newPw)).append("\n");
    sb.append("    resetPassword: ").append(toIndentedString(resetPassword)).append("\n");
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

