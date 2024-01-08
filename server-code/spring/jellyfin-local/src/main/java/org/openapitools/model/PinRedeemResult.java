package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * PinRedeemResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class PinRedeemResult {

  private Boolean success;

  @Valid
  private JsonNullable<List<String>> usersReset = JsonNullable.<List<String>>undefined();

  public PinRedeemResult success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this MediaBrowser.Model.Users.PinRedeemResult is success.
   * @return success
  */
  
  @Schema(name = "Success", description = "Gets or sets a value indicating whether this MediaBrowser.Model.Users.PinRedeemResult is success.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Success")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public PinRedeemResult usersReset(List<String> usersReset) {
    this.usersReset = JsonNullable.of(usersReset);
    return this;
  }

  public PinRedeemResult addUsersResetItem(String usersResetItem) {
    if (this.usersReset == null || !this.usersReset.isPresent()) {
      this.usersReset = JsonNullable.of(new ArrayList<>());
    }
    this.usersReset.get().add(usersResetItem);
    return this;
  }

  /**
   * Gets or sets the users reset.
   * @return usersReset
  */
  
  @Schema(name = "UsersReset", description = "Gets or sets the users reset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UsersReset")
  public JsonNullable<List<String>> getUsersReset() {
    return usersReset;
  }

  public void setUsersReset(JsonNullable<List<String>> usersReset) {
    this.usersReset = usersReset;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinRedeemResult pinRedeemResult = (PinRedeemResult) o;
    return Objects.equals(this.success, pinRedeemResult.success) &&
        equalsNullable(this.usersReset, pinRedeemResult.usersReset);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, hashCodeNullable(usersReset));
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
    sb.append("class PinRedeemResult {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    usersReset: ").append(toIndentedString(usersReset)).append("\n");
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

