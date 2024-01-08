package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.UserAvatarUrls;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the user who created the worklog.
 */

@Schema(name = "Worklog_author", description = "Details of the user who created the worklog.")
@JsonTypeName("Worklog_author")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorklogAuthor {

  private String accountId;

  private String accountType;

  private Boolean active;

  private UserAvatarUrls avatarUrls;

  private String displayName;

  private String emailAddress;

  private String key;

  private String name;

  private String self;

  private String timeZone;

  public WorklogAuthor accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
   * @return accountId
  */
  @Size(max = 128) 
  @Schema(name = "accountId", description = "The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public WorklogAuthor accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * The type of account represented by this user. This will be one of 'atlassian' (normal users), 'app' (application user) or 'customer' (Jira Service Desk customer user)
   * @return accountType
  */
  
  @Schema(name = "accountType", accessMode = Schema.AccessMode.READ_ONLY, description = "The type of account represented by this user. This will be one of 'atlassian' (normal users), 'app' (application user) or 'customer' (Jira Service Desk customer user)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountType")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public WorklogAuthor active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Whether the user is active.
   * @return active
  */
  
  @Schema(name = "active", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the user is active.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public WorklogAuthor avatarUrls(UserAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
    return this;
  }

  /**
   * Get avatarUrls
   * @return avatarUrls
  */
  @Valid 
  @Schema(name = "avatarUrls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatarUrls")
  public UserAvatarUrls getAvatarUrls() {
    return avatarUrls;
  }

  public void setAvatarUrls(UserAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
  }

  public WorklogAuthor displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the user. Depending on the user’s privacy settings, this may return an alternative value.
   * @return displayName
  */
  
  @Schema(name = "displayName", accessMode = Schema.AccessMode.READ_ONLY, description = "The display name of the user. Depending on the user’s privacy settings, this may return an alternative value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public WorklogAuthor emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * The email address of the user. Depending on the user’s privacy settings, this may be returned as null.
   * @return emailAddress
  */
  
  @Schema(name = "emailAddress", accessMode = Schema.AccessMode.READ_ONLY, description = "The email address of the user. Depending on the user’s privacy settings, this may be returned as null.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public WorklogAuthor key(String key) {
    this.key = key;
    return this;
  }

  /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return key
  */
  
  @Schema(name = "key", accessMode = Schema.AccessMode.READ_ONLY, description = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public WorklogAuthor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorklogAuthor self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the user.
   * @return self
  */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public WorklogAuthor timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * The time zone specified in the user's profile. Depending on the user’s privacy settings, this may be returned as null.
   * @return timeZone
  */
  
  @Schema(name = "timeZone", accessMode = Schema.AccessMode.READ_ONLY, description = "The time zone specified in the user's profile. Depending on the user’s privacy settings, this may be returned as null.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorklogAuthor worklogAuthor = (WorklogAuthor) o;
    return Objects.equals(this.accountId, worklogAuthor.accountId) &&
        Objects.equals(this.accountType, worklogAuthor.accountType) &&
        Objects.equals(this.active, worklogAuthor.active) &&
        Objects.equals(this.avatarUrls, worklogAuthor.avatarUrls) &&
        Objects.equals(this.displayName, worklogAuthor.displayName) &&
        Objects.equals(this.emailAddress, worklogAuthor.emailAddress) &&
        Objects.equals(this.key, worklogAuthor.key) &&
        Objects.equals(this.name, worklogAuthor.name) &&
        Objects.equals(this.self, worklogAuthor.self) &&
        Objects.equals(this.timeZone, worklogAuthor.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, active, avatarUrls, displayName, emailAddress, key, name, self, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorklogAuthor {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

