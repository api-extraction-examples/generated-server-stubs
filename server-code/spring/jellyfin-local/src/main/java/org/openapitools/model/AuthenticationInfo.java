package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
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
 * AuthenticationInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class AuthenticationInfo {

  private JsonNullable<String> accessToken = JsonNullable.<String>undefined();

  private JsonNullable<String> appName = JsonNullable.<String>undefined();

  private JsonNullable<String> appVersion = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dateCreated;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dateLastActivity;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dateRevoked = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> deviceId = JsonNullable.<String>undefined();

  private JsonNullable<String> deviceName = JsonNullable.<String>undefined();

  private Long id;

  private Boolean isActive;

  private UUID userId;

  private JsonNullable<String> userName = JsonNullable.<String>undefined();

  public AuthenticationInfo accessToken(String accessToken) {
    this.accessToken = JsonNullable.of(accessToken);
    return this;
  }

  /**
   * Gets or sets the access token.
   * @return accessToken
  */
  
  @Schema(name = "AccessToken", description = "Gets or sets the access token.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AccessToken")
  public JsonNullable<String> getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(JsonNullable<String> accessToken) {
    this.accessToken = accessToken;
  }

  public AuthenticationInfo appName(String appName) {
    this.appName = JsonNullable.of(appName);
    return this;
  }

  /**
   * Gets or sets the name of the application.
   * @return appName
  */
  
  @Schema(name = "AppName", description = "Gets or sets the name of the application.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AppName")
  public JsonNullable<String> getAppName() {
    return appName;
  }

  public void setAppName(JsonNullable<String> appName) {
    this.appName = appName;
  }

  public AuthenticationInfo appVersion(String appVersion) {
    this.appVersion = JsonNullable.of(appVersion);
    return this;
  }

  /**
   * Gets or sets the application version.
   * @return appVersion
  */
  
  @Schema(name = "AppVersion", description = "Gets or sets the application version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AppVersion")
  public JsonNullable<String> getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(JsonNullable<String> appVersion) {
    this.appVersion = appVersion;
  }

  public AuthenticationInfo dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Gets or sets the date created.
   * @return dateCreated
  */
  @Valid 
  @Schema(name = "DateCreated", description = "Gets or sets the date created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DateCreated")
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public AuthenticationInfo dateLastActivity(OffsetDateTime dateLastActivity) {
    this.dateLastActivity = dateLastActivity;
    return this;
  }

  /**
   * Get dateLastActivity
   * @return dateLastActivity
  */
  @Valid 
  @Schema(name = "DateLastActivity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DateLastActivity")
  public OffsetDateTime getDateLastActivity() {
    return dateLastActivity;
  }

  public void setDateLastActivity(OffsetDateTime dateLastActivity) {
    this.dateLastActivity = dateLastActivity;
  }

  public AuthenticationInfo dateRevoked(OffsetDateTime dateRevoked) {
    this.dateRevoked = JsonNullable.of(dateRevoked);
    return this;
  }

  /**
   * Gets or sets the date revoked.
   * @return dateRevoked
  */
  @Valid 
  @Schema(name = "DateRevoked", description = "Gets or sets the date revoked.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DateRevoked")
  public JsonNullable<OffsetDateTime> getDateRevoked() {
    return dateRevoked;
  }

  public void setDateRevoked(JsonNullable<OffsetDateTime> dateRevoked) {
    this.dateRevoked = dateRevoked;
  }

  public AuthenticationInfo deviceId(String deviceId) {
    this.deviceId = JsonNullable.of(deviceId);
    return this;
  }

  /**
   * Gets or sets the device identifier.
   * @return deviceId
  */
  
  @Schema(name = "DeviceId", description = "Gets or sets the device identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeviceId")
  public JsonNullable<String> getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(JsonNullable<String> deviceId) {
    this.deviceId = deviceId;
  }

  public AuthenticationInfo deviceName(String deviceName) {
    this.deviceName = JsonNullable.of(deviceName);
    return this;
  }

  /**
   * Gets or sets the name of the device.
   * @return deviceName
  */
  
  @Schema(name = "DeviceName", description = "Gets or sets the name of the device.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeviceName")
  public JsonNullable<String> getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(JsonNullable<String> deviceName) {
    this.deviceName = deviceName;
  }

  public AuthenticationInfo id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Gets or sets the identifier.
   * @return id
  */
  
  @Schema(name = "Id", description = "Gets or sets the identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AuthenticationInfo isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is active.
   * @return isActive
  */
  
  @Schema(name = "IsActive", description = "Gets or sets a value indicating whether this instance is active.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsActive")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public AuthenticationInfo userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Gets or sets the user identifier.
   * @return userId
  */
  @Valid 
  @Schema(name = "UserId", description = "Gets or sets the user identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserId")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public AuthenticationInfo userName(String userName) {
    this.userName = JsonNullable.of(userName);
    return this;
  }

  /**
   * Get userName
   * @return userName
  */
  
  @Schema(name = "UserName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserName")
  public JsonNullable<String> getUserName() {
    return userName;
  }

  public void setUserName(JsonNullable<String> userName) {
    this.userName = userName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationInfo authenticationInfo = (AuthenticationInfo) o;
    return equalsNullable(this.accessToken, authenticationInfo.accessToken) &&
        equalsNullable(this.appName, authenticationInfo.appName) &&
        equalsNullable(this.appVersion, authenticationInfo.appVersion) &&
        Objects.equals(this.dateCreated, authenticationInfo.dateCreated) &&
        Objects.equals(this.dateLastActivity, authenticationInfo.dateLastActivity) &&
        equalsNullable(this.dateRevoked, authenticationInfo.dateRevoked) &&
        equalsNullable(this.deviceId, authenticationInfo.deviceId) &&
        equalsNullable(this.deviceName, authenticationInfo.deviceName) &&
        Objects.equals(this.id, authenticationInfo.id) &&
        Objects.equals(this.isActive, authenticationInfo.isActive) &&
        Objects.equals(this.userId, authenticationInfo.userId) &&
        equalsNullable(this.userName, authenticationInfo.userName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(accessToken), hashCodeNullable(appName), hashCodeNullable(appVersion), dateCreated, dateLastActivity, hashCodeNullable(dateRevoked), hashCodeNullable(deviceId), hashCodeNullable(deviceName), id, isActive, userId, hashCodeNullable(userName));
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
    sb.append("class AuthenticationInfo {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateLastActivity: ").append(toIndentedString(dateLastActivity)).append("\n");
    sb.append("    dateRevoked: ").append(toIndentedString(dateRevoked)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

