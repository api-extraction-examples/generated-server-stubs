package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.UserConfiguration;
import org.openapitools.model.UserPolicy;
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
 * Class UserDto.
 */

@Schema(name = "UserDto", description = "Class UserDto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class UserDto {

  private UserConfiguration _configuration;

  private JsonNullable<Boolean> enableAutoLogin = JsonNullable.<Boolean>undefined();

  private Boolean hasConfiguredEasyPassword;

  private Boolean hasConfiguredPassword;

  private Boolean hasPassword;

  private UUID id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> lastActivityDate = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> lastLoginDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private UserPolicy policy;

  private JsonNullable<Double> primaryImageAspectRatio = JsonNullable.<Double>undefined();

  private JsonNullable<String> primaryImageTag = JsonNullable.<String>undefined();

  private JsonNullable<String> serverId = JsonNullable.<String>undefined();

  private JsonNullable<String> serverName = JsonNullable.<String>undefined();

  public UserDto _configuration(UserConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * Get _configuration
   * @return _configuration
  */
  @Valid 
  @Schema(name = "Configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Configuration")
  public UserConfiguration getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(UserConfiguration _configuration) {
    this._configuration = _configuration;
  }

  public UserDto enableAutoLogin(Boolean enableAutoLogin) {
    this.enableAutoLogin = JsonNullable.of(enableAutoLogin);
    return this;
  }

  /**
   * Gets or sets whether async login is enabled or not.
   * @return enableAutoLogin
  */
  
  @Schema(name = "EnableAutoLogin", description = "Gets or sets whether async login is enabled or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableAutoLogin")
  public JsonNullable<Boolean> getEnableAutoLogin() {
    return enableAutoLogin;
  }

  public void setEnableAutoLogin(JsonNullable<Boolean> enableAutoLogin) {
    this.enableAutoLogin = enableAutoLogin;
  }

  public UserDto hasConfiguredEasyPassword(Boolean hasConfiguredEasyPassword) {
    this.hasConfiguredEasyPassword = hasConfiguredEasyPassword;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance has configured easy password.
   * @return hasConfiguredEasyPassword
  */
  
  @Schema(name = "HasConfiguredEasyPassword", description = "Gets or sets a value indicating whether this instance has configured easy password.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HasConfiguredEasyPassword")
  public Boolean getHasConfiguredEasyPassword() {
    return hasConfiguredEasyPassword;
  }

  public void setHasConfiguredEasyPassword(Boolean hasConfiguredEasyPassword) {
    this.hasConfiguredEasyPassword = hasConfiguredEasyPassword;
  }

  public UserDto hasConfiguredPassword(Boolean hasConfiguredPassword) {
    this.hasConfiguredPassword = hasConfiguredPassword;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance has configured password.
   * @return hasConfiguredPassword
  */
  
  @Schema(name = "HasConfiguredPassword", description = "Gets or sets a value indicating whether this instance has configured password.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HasConfiguredPassword")
  public Boolean getHasConfiguredPassword() {
    return hasConfiguredPassword;
  }

  public void setHasConfiguredPassword(Boolean hasConfiguredPassword) {
    this.hasConfiguredPassword = hasConfiguredPassword;
  }

  public UserDto hasPassword(Boolean hasPassword) {
    this.hasPassword = hasPassword;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance has password.
   * @return hasPassword
  */
  
  @Schema(name = "HasPassword", description = "Gets or sets a value indicating whether this instance has password.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HasPassword")
  public Boolean getHasPassword() {
    return hasPassword;
  }

  public void setHasPassword(Boolean hasPassword) {
    this.hasPassword = hasPassword;
  }

  public UserDto id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Gets or sets the id.
   * @return id
  */
  @Valid 
  @Schema(name = "Id", description = "Gets or sets the id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UserDto lastActivityDate(OffsetDateTime lastActivityDate) {
    this.lastActivityDate = JsonNullable.of(lastActivityDate);
    return this;
  }

  /**
   * Gets or sets the last activity date.
   * @return lastActivityDate
  */
  @Valid 
  @Schema(name = "LastActivityDate", description = "Gets or sets the last activity date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastActivityDate")
  public JsonNullable<OffsetDateTime> getLastActivityDate() {
    return lastActivityDate;
  }

  public void setLastActivityDate(JsonNullable<OffsetDateTime> lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
  }

  public UserDto lastLoginDate(OffsetDateTime lastLoginDate) {
    this.lastLoginDate = JsonNullable.of(lastLoginDate);
    return this;
  }

  /**
   * Gets or sets the last login date.
   * @return lastLoginDate
  */
  @Valid 
  @Schema(name = "LastLoginDate", description = "Gets or sets the last login date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastLoginDate")
  public JsonNullable<OffsetDateTime> getLastLoginDate() {
    return lastLoginDate;
  }

  public void setLastLoginDate(JsonNullable<OffsetDateTime> lastLoginDate) {
    this.lastLoginDate = lastLoginDate;
  }

  public UserDto name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets or sets the name.
   * @return name
  */
  
  @Schema(name = "Name", description = "Gets or sets the name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public UserDto policy(UserPolicy policy) {
    this.policy = policy;
    return this;
  }

  /**
   * Get policy
   * @return policy
  */
  @Valid 
  @Schema(name = "Policy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Policy")
  public UserPolicy getPolicy() {
    return policy;
  }

  public void setPolicy(UserPolicy policy) {
    this.policy = policy;
  }

  public UserDto primaryImageAspectRatio(Double primaryImageAspectRatio) {
    this.primaryImageAspectRatio = JsonNullable.of(primaryImageAspectRatio);
    return this;
  }

  /**
   * Gets or sets the primary image aspect ratio.
   * @return primaryImageAspectRatio
  */
  
  @Schema(name = "PrimaryImageAspectRatio", description = "Gets or sets the primary image aspect ratio.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PrimaryImageAspectRatio")
  public JsonNullable<Double> getPrimaryImageAspectRatio() {
    return primaryImageAspectRatio;
  }

  public void setPrimaryImageAspectRatio(JsonNullable<Double> primaryImageAspectRatio) {
    this.primaryImageAspectRatio = primaryImageAspectRatio;
  }

  public UserDto primaryImageTag(String primaryImageTag) {
    this.primaryImageTag = JsonNullable.of(primaryImageTag);
    return this;
  }

  /**
   * Gets or sets the primary image tag.
   * @return primaryImageTag
  */
  
  @Schema(name = "PrimaryImageTag", description = "Gets or sets the primary image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PrimaryImageTag")
  public JsonNullable<String> getPrimaryImageTag() {
    return primaryImageTag;
  }

  public void setPrimaryImageTag(JsonNullable<String> primaryImageTag) {
    this.primaryImageTag = primaryImageTag;
  }

  public UserDto serverId(String serverId) {
    this.serverId = JsonNullable.of(serverId);
    return this;
  }

  /**
   * Gets or sets the server identifier.
   * @return serverId
  */
  
  @Schema(name = "ServerId", description = "Gets or sets the server identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServerId")
  public JsonNullable<String> getServerId() {
    return serverId;
  }

  public void setServerId(JsonNullable<String> serverId) {
    this.serverId = serverId;
  }

  public UserDto serverName(String serverName) {
    this.serverName = JsonNullable.of(serverName);
    return this;
  }

  /**
   * Gets or sets the name of the server.  This is not used by the server and is for client-side usage only.
   * @return serverName
  */
  
  @Schema(name = "ServerName", description = "Gets or sets the name of the server.  This is not used by the server and is for client-side usage only.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServerName")
  public JsonNullable<String> getServerName() {
    return serverName;
  }

  public void setServerName(JsonNullable<String> serverName) {
    this.serverName = serverName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDto userDto = (UserDto) o;
    return Objects.equals(this._configuration, userDto._configuration) &&
        equalsNullable(this.enableAutoLogin, userDto.enableAutoLogin) &&
        Objects.equals(this.hasConfiguredEasyPassword, userDto.hasConfiguredEasyPassword) &&
        Objects.equals(this.hasConfiguredPassword, userDto.hasConfiguredPassword) &&
        Objects.equals(this.hasPassword, userDto.hasPassword) &&
        Objects.equals(this.id, userDto.id) &&
        equalsNullable(this.lastActivityDate, userDto.lastActivityDate) &&
        equalsNullable(this.lastLoginDate, userDto.lastLoginDate) &&
        equalsNullable(this.name, userDto.name) &&
        Objects.equals(this.policy, userDto.policy) &&
        equalsNullable(this.primaryImageAspectRatio, userDto.primaryImageAspectRatio) &&
        equalsNullable(this.primaryImageTag, userDto.primaryImageTag) &&
        equalsNullable(this.serverId, userDto.serverId) &&
        equalsNullable(this.serverName, userDto.serverName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, hashCodeNullable(enableAutoLogin), hasConfiguredEasyPassword, hasConfiguredPassword, hasPassword, id, hashCodeNullable(lastActivityDate), hashCodeNullable(lastLoginDate), hashCodeNullable(name), policy, hashCodeNullable(primaryImageAspectRatio), hashCodeNullable(primaryImageTag), hashCodeNullable(serverId), hashCodeNullable(serverName));
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
    sb.append("class UserDto {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    enableAutoLogin: ").append(toIndentedString(enableAutoLogin)).append("\n");
    sb.append("    hasConfiguredEasyPassword: ").append(toIndentedString(hasConfiguredEasyPassword)).append("\n");
    sb.append("    hasConfiguredPassword: ").append(toIndentedString(hasConfiguredPassword)).append("\n");
    sb.append("    hasPassword: ").append(toIndentedString(hasPassword)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
    sb.append("    lastLoginDate: ").append(toIndentedString(lastLoginDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    primaryImageAspectRatio: ").append(toIndentedString(primaryImageAspectRatio)).append("\n");
    sb.append("    primaryImageTag: ").append(toIndentedString(primaryImageTag)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
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

