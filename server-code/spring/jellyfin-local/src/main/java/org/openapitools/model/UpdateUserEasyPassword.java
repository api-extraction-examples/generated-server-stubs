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
 * The update user easy password request body.
 */

@Schema(name = "UpdateUserEasyPassword", description = "The update user easy password request body.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class UpdateUserEasyPassword {

  private JsonNullable<String> newPassword = JsonNullable.<String>undefined();

  private JsonNullable<String> newPw = JsonNullable.<String>undefined();

  private Boolean resetPassword;

  public UpdateUserEasyPassword newPassword(String newPassword) {
    this.newPassword = JsonNullable.of(newPassword);
    return this;
  }

  /**
   * Gets or sets the new sha1-hashed password.
   * @return newPassword
  */
  
  @Schema(name = "NewPassword", description = "Gets or sets the new sha1-hashed password.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NewPassword")
  public JsonNullable<String> getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(JsonNullable<String> newPassword) {
    this.newPassword = newPassword;
  }

  public UpdateUserEasyPassword newPw(String newPw) {
    this.newPw = JsonNullable.of(newPw);
    return this;
  }

  /**
   * Gets or sets the new password.
   * @return newPw
  */
  
  @Schema(name = "NewPw", description = "Gets or sets the new password.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NewPw")
  public JsonNullable<String> getNewPw() {
    return newPw;
  }

  public void setNewPw(JsonNullable<String> newPw) {
    this.newPw = newPw;
  }

  public UpdateUserEasyPassword resetPassword(Boolean resetPassword) {
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
    UpdateUserEasyPassword updateUserEasyPassword = (UpdateUserEasyPassword) o;
    return equalsNullable(this.newPassword, updateUserEasyPassword.newPassword) &&
        equalsNullable(this.newPw, updateUserEasyPassword.newPw) &&
        Objects.equals(this.resetPassword, updateUserEasyPassword.resetPassword);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(newPassword), hashCodeNullable(newPw), resetPassword);
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
    sb.append("class UpdateUserEasyPassword {\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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

