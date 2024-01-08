package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.model.Account;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Admin-level information about a given account.
 */

@Schema(name = "AdminAccount", description = "Admin-level information about a given account.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class AdminAccount {

  private Account account;

  private Boolean approved;

  private Boolean confirmed;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private String createdByApplicationId;

  private Boolean disabled;

  private String email;

  private String id;

  private String inviteRequest;

  private String invitedByAccountId;

  private String ip;

  private String locale;

  private String role;

  private Boolean silenced;

  private Boolean suspended;

  private String username;

  public AdminAccount account(Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @Valid 
  @Schema(name = "account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account")
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public AdminAccount approved(Boolean approved) {
    this.approved = approved;
    return this;
  }

  /**
   * Whether the account is currently approved.
   * @return approved
  */
  
  @Schema(name = "approved", description = "Whether the account is currently approved.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approved")
  public Boolean getApproved() {
    return approved;
  }

  public void setApproved(Boolean approved) {
    this.approved = approved;
  }

  public AdminAccount confirmed(Boolean confirmed) {
    this.confirmed = confirmed;
    return this;
  }

  /**
   * Whether the account has confirmed their email address.
   * @return confirmed
  */
  
  @Schema(name = "confirmed", description = "Whether the account has confirmed their email address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("confirmed")
  public Boolean getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Boolean confirmed) {
    this.confirmed = confirmed;
  }

  public AdminAccount createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When the account was first discovered.
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", description = "When the account was first discovered.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AdminAccount createdByApplicationId(String createdByApplicationId) {
    this.createdByApplicationId = createdByApplicationId;
    return this;
  }

  /**
   * The ID of the application that created this account. Cast from an integer, but not guaranteed to be a number.
   * @return createdByApplicationId
  */
  
  @Schema(name = "created_by_application_id", description = "The ID of the application that created this account. Cast from an integer, but not guaranteed to be a number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by_application_id")
  public String getCreatedByApplicationId() {
    return createdByApplicationId;
  }

  public void setCreatedByApplicationId(String createdByApplicationId) {
    this.createdByApplicationId = createdByApplicationId;
  }

  public AdminAccount disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Whether the account is currently disabled.
   * @return disabled
  */
  
  @Schema(name = "disabled", description = "Whether the account is currently disabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disabled")
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public AdminAccount email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address associated with the account.
   * @return email
  */
  
  @Schema(name = "email", description = "The email address associated with the account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AdminAccount id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the account in the database. Cast from an integer, but not guaranteed to be a number.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the account in the database. Cast from an integer, but not guaranteed to be a number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdminAccount inviteRequest(String inviteRequest) {
    this.inviteRequest = inviteRequest;
    return this;
  }

  /**
   * Invite request text ???
   * @return inviteRequest
  */
  
  @Schema(name = "invite_request", description = "Invite request text ???", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invite_request")
  public String getInviteRequest() {
    return inviteRequest;
  }

  public void setInviteRequest(String inviteRequest) {
    this.inviteRequest = inviteRequest;
  }

  public AdminAccount invitedByAccountId(String invitedByAccountId) {
    this.invitedByAccountId = invitedByAccountId;
    return this;
  }

  /**
   * The ID of the account that invited this user. Cast from an integer, but not guaranteed to be a number.
   * @return invitedByAccountId
  */
  
  @Schema(name = "invited_by_account_id", description = "The ID of the account that invited this user. Cast from an integer, but not guaranteed to be a number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invited_by_account_id")
  public String getInvitedByAccountId() {
    return invitedByAccountId;
  }

  public void setInvitedByAccountId(String invitedByAccountId) {
    this.invitedByAccountId = invitedByAccountId;
  }

  public AdminAccount ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * The IP address last used to login to this account.
   * @return ip
  */
  
  @Schema(name = "ip", description = "The IP address last used to login to this account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public AdminAccount locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * The locale of the account. ISO 639 Part 1 two-letter language code.
   * @return locale
  */
  
  @Schema(name = "locale", description = "The locale of the account. ISO 639 Part 1 two-letter language code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public AdminAccount role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The current role of the account. Enumerable oneOf.
   * @return role
  */
  
  @Schema(name = "role", description = "The current role of the account. Enumerable oneOf.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public AdminAccount silenced(Boolean silenced) {
    this.silenced = silenced;
    return this;
  }

  /**
   * Whether the account is currently silenced.
   * @return silenced
  */
  
  @Schema(name = "silenced", description = "Whether the account is currently silenced.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("silenced")
  public Boolean getSilenced() {
    return silenced;
  }

  public void setSilenced(Boolean silenced) {
    this.silenced = silenced;
  }

  public AdminAccount suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Whether the account is currently suspended.
   * @return suspended
  */
  
  @Schema(name = "suspended", description = "Whether the account is currently suspended.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public AdminAccount username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The username of the account.
   * @return username
  */
  
  @Schema(name = "username", description = "The username of the account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    AdminAccount adminAccount = (AdminAccount) o;
    return Objects.equals(this.account, adminAccount.account) &&
        Objects.equals(this.approved, adminAccount.approved) &&
        Objects.equals(this.confirmed, adminAccount.confirmed) &&
        Objects.equals(this.createdAt, adminAccount.createdAt) &&
        Objects.equals(this.createdByApplicationId, adminAccount.createdByApplicationId) &&
        Objects.equals(this.disabled, adminAccount.disabled) &&
        Objects.equals(this.email, adminAccount.email) &&
        Objects.equals(this.id, adminAccount.id) &&
        Objects.equals(this.inviteRequest, adminAccount.inviteRequest) &&
        Objects.equals(this.invitedByAccountId, adminAccount.invitedByAccountId) &&
        Objects.equals(this.ip, adminAccount.ip) &&
        Objects.equals(this.locale, adminAccount.locale) &&
        Objects.equals(this.role, adminAccount.role) &&
        Objects.equals(this.silenced, adminAccount.silenced) &&
        Objects.equals(this.suspended, adminAccount.suspended) &&
        Objects.equals(this.username, adminAccount.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, approved, confirmed, createdAt, createdByApplicationId, disabled, email, id, inviteRequest, invitedByAccountId, ip, locale, role, silenced, suspended, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminAccount {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdByApplicationId: ").append(toIndentedString(createdByApplicationId)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inviteRequest: ").append(toIndentedString(inviteRequest)).append("\n");
    sb.append("    invitedByAccountId: ").append(toIndentedString(invitedByAccountId)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    silenced: ").append(toIndentedString(silenced)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
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

