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
 * Represents daily usage history of a hashtag.
 */

@Schema(name = "History", description = "Represents daily usage history of a hashtag.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class History {

  private String accounts;

  private String day;

  private String uses;

  public History() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public History(String accounts, String day, String uses) {
    this.accounts = accounts;
    this.day = day;
    this.uses = uses;
  }

  public History accounts(String accounts) {
    this.accounts = accounts;
    return this;
  }

  /**
   * the total of accounts using the tag within that day. Cast from an integer.
   * @return accounts
  */
  @NotNull 
  @Schema(name = "accounts", description = "the total of accounts using the tag within that day. Cast from an integer.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accounts")
  public String getAccounts() {
    return accounts;
  }

  public void setAccounts(String accounts) {
    this.accounts = accounts;
  }

  public History day(String day) {
    this.day = day;
    return this;
  }

  /**
   * UNIX timestamp on midnight of the given day.
   * @return day
  */
  @NotNull 
  @Schema(name = "day", description = "UNIX timestamp on midnight of the given day.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("day")
  public String getDay() {
    return day;
  }

  public void setDay(String day) {
    this.day = day;
  }

  public History uses(String uses) {
    this.uses = uses;
    return this;
  }

  /**
   * the counted usage of the tag within that day. Cast from an integer.
   * @return uses
  */
  @NotNull 
  @Schema(name = "uses", description = "the counted usage of the tag within that day. Cast from an integer.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("uses")
  public String getUses() {
    return uses;
  }

  public void setUses(String uses) {
    this.uses = uses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    History history = (History) o;
    return Objects.equals(this.accounts, history.accounts) &&
        Objects.equals(this.day, history.day) &&
        Objects.equals(this.uses, history.uses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, day, uses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class History {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    uses: ").append(toIndentedString(uses)).append("\n");
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

