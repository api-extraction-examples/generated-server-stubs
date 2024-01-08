package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ForgotPasswordAction;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ForgotPasswordResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ForgotPasswordResult {

  private ForgotPasswordAction action;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> pinExpirationDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> pinFile = JsonNullable.<String>undefined();

  public ForgotPasswordResult action(ForgotPasswordAction action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  */
  @Valid 
  @Schema(name = "Action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Action")
  public ForgotPasswordAction getAction() {
    return action;
  }

  public void setAction(ForgotPasswordAction action) {
    this.action = action;
  }

  public ForgotPasswordResult pinExpirationDate(OffsetDateTime pinExpirationDate) {
    this.pinExpirationDate = JsonNullable.of(pinExpirationDate);
    return this;
  }

  /**
   * Gets or sets the pin expiration date.
   * @return pinExpirationDate
  */
  @Valid 
  @Schema(name = "PinExpirationDate", description = "Gets or sets the pin expiration date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PinExpirationDate")
  public JsonNullable<OffsetDateTime> getPinExpirationDate() {
    return pinExpirationDate;
  }

  public void setPinExpirationDate(JsonNullable<OffsetDateTime> pinExpirationDate) {
    this.pinExpirationDate = pinExpirationDate;
  }

  public ForgotPasswordResult pinFile(String pinFile) {
    this.pinFile = JsonNullable.of(pinFile);
    return this;
  }

  /**
   * Gets or sets the pin file.
   * @return pinFile
  */
  
  @Schema(name = "PinFile", description = "Gets or sets the pin file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PinFile")
  public JsonNullable<String> getPinFile() {
    return pinFile;
  }

  public void setPinFile(JsonNullable<String> pinFile) {
    this.pinFile = pinFile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForgotPasswordResult forgotPasswordResult = (ForgotPasswordResult) o;
    return Objects.equals(this.action, forgotPasswordResult.action) &&
        equalsNullable(this.pinExpirationDate, forgotPasswordResult.pinExpirationDate) &&
        equalsNullable(this.pinFile, forgotPasswordResult.pinFile);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, hashCodeNullable(pinExpirationDate), hashCodeNullable(pinFile));
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
    sb.append("class ForgotPasswordResult {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    pinExpirationDate: ").append(toIndentedString(pinExpirationDate)).append("\n");
    sb.append("    pinFile: ").append(toIndentedString(pinFile)).append("\n");
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

