package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import org.openapitools.model.UserApplicationRoles;
import org.openapitools.model.UserAvatarUrls;
import org.openapitools.model.UserGroups;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The user who marked the project as deleted.
 */

@Schema(name = "Project_deletedBy", description = "The user who marked the project as deleted.")
@JsonTypeName("Project_deletedBy")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ProjectDeletedBy {

  private String accountId;

  /**
   * The user account type. Can take the following values:   *  `atlassian` regular Atlassian user account  *  `app` system account used for Connect applications and OAuth to represent external systems  *  `customer` Jira Service Desk account representing an external service desk
   */
  public enum AccountTypeEnum {
    ATLASSIAN("atlassian"),
    
    APP("app"),
    
    CUSTOMER("customer"),
    
    UNKNOWN("unknown");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AccountTypeEnum accountType;

  private Boolean active;

  private UserApplicationRoles applicationRoles;

  private UserAvatarUrls avatarUrls;

  private String displayName;

  private String emailAddress;

  private String expand;

  private UserGroups groups;

  private String key;

  private String locale;

  private String name;

  private URI self;

  private String timeZone;

  public ProjectDeletedBy accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.
   * @return accountId
  */
  @Size(max = 128) 
  @Schema(name = "accountId", description = "The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public ProjectDeletedBy accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * The user account type. Can take the following values:   *  `atlassian` regular Atlassian user account  *  `app` system account used for Connect applications and OAuth to represent external systems  *  `customer` Jira Service Desk account representing an external service desk
   * @return accountType
  */
  
  @Schema(name = "accountType", accessMode = Schema.AccessMode.READ_ONLY, description = "The user account type. Can take the following values:   *  `atlassian` regular Atlassian user account  *  `app` system account used for Connect applications and OAuth to represent external systems  *  `customer` Jira Service Desk account representing an external service desk", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountType")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public ProjectDeletedBy active(Boolean active) {
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

  public ProjectDeletedBy applicationRoles(UserApplicationRoles applicationRoles) {
    this.applicationRoles = applicationRoles;
    return this;
  }

  /**
   * Get applicationRoles
   * @return applicationRoles
  */
  @Valid 
  @Schema(name = "applicationRoles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicationRoles")
  public UserApplicationRoles getApplicationRoles() {
    return applicationRoles;
  }

  public void setApplicationRoles(UserApplicationRoles applicationRoles) {
    this.applicationRoles = applicationRoles;
  }

  public ProjectDeletedBy avatarUrls(UserAvatarUrls avatarUrls) {
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

  public ProjectDeletedBy displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
   * @return displayName
  */
  
  @Schema(name = "displayName", accessMode = Schema.AccessMode.READ_ONLY, description = "The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ProjectDeletedBy emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * The email address of the user. Depending on the user’s privacy setting, this may be returned as null.
   * @return emailAddress
  */
  
  @Schema(name = "emailAddress", accessMode = Schema.AccessMode.READ_ONLY, description = "The email address of the user. Depending on the user’s privacy setting, this may be returned as null.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public ProjectDeletedBy expand(String expand) {
    this.expand = expand;
    return this;
  }

  /**
   * Expand options that include additional user details in the response.
   * @return expand
  */
  
  @Schema(name = "expand", accessMode = Schema.AccessMode.READ_ONLY, description = "Expand options that include additional user details in the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expand")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public ProjectDeletedBy groups(UserGroups groups) {
    this.groups = groups;
    return this;
  }

  /**
   * Get groups
   * @return groups
  */
  @Valid 
  @Schema(name = "groups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groups")
  public UserGroups getGroups() {
    return groups;
  }

  public void setGroups(UserGroups groups) {
    this.groups = groups;
  }

  public ProjectDeletedBy key(String key) {
    this.key = key;
    return this;
  }

  /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return key
  */
  
  @Schema(name = "key", description = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ProjectDeletedBy locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * The locale of the user. Depending on the user’s privacy setting, this may be returned as null.
   * @return locale
  */
  
  @Schema(name = "locale", accessMode = Schema.AccessMode.READ_ONLY, description = "The locale of the user. Depending on the user’s privacy setting, this may be returned as null.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public ProjectDeletedBy name(String name) {
    this.name = name;
    return this;
  }

  /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return name
  */
  
  @Schema(name = "name", description = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectDeletedBy self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the user.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public ProjectDeletedBy timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * The time zone specified in the user's profile. Depending on the user’s privacy setting, this may be returned as null.
   * @return timeZone
  */
  
  @Schema(name = "timeZone", accessMode = Schema.AccessMode.READ_ONLY, description = "The time zone specified in the user's profile. Depending on the user’s privacy setting, this may be returned as null.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ProjectDeletedBy projectDeletedBy = (ProjectDeletedBy) o;
    return Objects.equals(this.accountId, projectDeletedBy.accountId) &&
        Objects.equals(this.accountType, projectDeletedBy.accountType) &&
        Objects.equals(this.active, projectDeletedBy.active) &&
        Objects.equals(this.applicationRoles, projectDeletedBy.applicationRoles) &&
        Objects.equals(this.avatarUrls, projectDeletedBy.avatarUrls) &&
        Objects.equals(this.displayName, projectDeletedBy.displayName) &&
        Objects.equals(this.emailAddress, projectDeletedBy.emailAddress) &&
        Objects.equals(this.expand, projectDeletedBy.expand) &&
        Objects.equals(this.groups, projectDeletedBy.groups) &&
        Objects.equals(this.key, projectDeletedBy.key) &&
        Objects.equals(this.locale, projectDeletedBy.locale) &&
        Objects.equals(this.name, projectDeletedBy.name) &&
        Objects.equals(this.self, projectDeletedBy.self) &&
        Objects.equals(this.timeZone, projectDeletedBy.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, active, applicationRoles, avatarUrls, displayName, emailAddress, expand, groups, key, locale, name, self, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDeletedBy {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    applicationRoles: ").append(toIndentedString(applicationRoles)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

