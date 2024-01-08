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
 * ApiV1AccountsPostRequest
 */

@JsonTypeName("_api_v1_accounts_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1AccountsPostRequest {

  private Boolean agreement;

  private String email;

  private String locale;

  private String password;

  private String reason;

  private String username;

  public ApiV1AccountsPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApiV1AccountsPostRequest(Boolean agreement, String email, String locale, String password, String username) {
    this.agreement = agreement;
    this.email = email;
    this.locale = locale;
    this.password = password;
    this.username = username;
  }

  public ApiV1AccountsPostRequest agreement(Boolean agreement) {
    this.agreement = agreement;
    return this;
  }

  /**
   * Whether the user agrees to the local rules, terms, and policies. These should be presented to the user in order to allow them to consent before setting this parameter to TRUE.
   * @return agreement
  */
  @NotNull 
  @Schema(name = "agreement", description = "Whether the user agrees to the local rules, terms, and policies. These should be presented to the user in order to allow them to consent before setting this parameter to TRUE.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("agreement")
  public Boolean getAgreement() {
    return agreement;
  }

  public void setAgreement(Boolean agreement) {
    this.agreement = agreement;
  }

  public ApiV1AccountsPostRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address to be used for login
   * @return email
  */
  @NotNull 
  @Schema(name = "email", description = "The email address to be used for login", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ApiV1AccountsPostRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * The language of the confirmation email that will be sent
   * @return locale
  */
  @NotNull 
  @Schema(name = "locale", description = "The language of the confirmation email that will be sent", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public ApiV1AccountsPostRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The password to be used for login
   * @return password
  */
  @NotNull 
  @Schema(name = "password", description = "The password to be used for login", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ApiV1AccountsPostRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Text that will be reviewed by moderators if registrations require manual approval.
   * @return reason
  */
  
  @Schema(name = "reason", description = "Text that will be reviewed by moderators if registrations require manual approval.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ApiV1AccountsPostRequest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The desired username for the account
   * @return username
  */
  @NotNull 
  @Schema(name = "username", description = "The desired username for the account", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1AccountsPostRequest apiV1AccountsPostRequest = (ApiV1AccountsPostRequest) o;
    return Objects.equals(this.agreement, apiV1AccountsPostRequest.agreement) &&
        Objects.equals(this.email, apiV1AccountsPostRequest.email) &&
        Objects.equals(this.locale, apiV1AccountsPostRequest.locale) &&
        Objects.equals(this.password, apiV1AccountsPostRequest.password) &&
        Objects.equals(this.reason, apiV1AccountsPostRequest.reason) &&
        Objects.equals(this.username, apiV1AccountsPostRequest.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreement, email, locale, password, reason, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1AccountsPostRequest {\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    password: ").append("*").append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

