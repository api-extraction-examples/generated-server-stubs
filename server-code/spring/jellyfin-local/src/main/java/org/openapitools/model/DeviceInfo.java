package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ClientCapabilities;
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
 * DeviceInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class DeviceInfo {

  private JsonNullable<String> appName = JsonNullable.<String>undefined();

  private JsonNullable<String> appVersion = JsonNullable.<String>undefined();

  private ClientCapabilities capabilities;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dateLastActivity;

  private JsonNullable<String> iconUrl = JsonNullable.<String>undefined();

  private JsonNullable<String> id = JsonNullable.<String>undefined();

  private UUID lastUserId;

  private JsonNullable<String> lastUserName = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public DeviceInfo appName(String appName) {
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

  public DeviceInfo appVersion(String appVersion) {
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

  public DeviceInfo capabilities(ClientCapabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  /**
   * Get capabilities
   * @return capabilities
  */
  @Valid 
  @Schema(name = "Capabilities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Capabilities")
  public ClientCapabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(ClientCapabilities capabilities) {
    this.capabilities = capabilities;
  }

  public DeviceInfo dateLastActivity(OffsetDateTime dateLastActivity) {
    this.dateLastActivity = dateLastActivity;
    return this;
  }

  /**
   * Gets or sets the date last modified.
   * @return dateLastActivity
  */
  @Valid 
  @Schema(name = "DateLastActivity", description = "Gets or sets the date last modified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DateLastActivity")
  public OffsetDateTime getDateLastActivity() {
    return dateLastActivity;
  }

  public void setDateLastActivity(OffsetDateTime dateLastActivity) {
    this.dateLastActivity = dateLastActivity;
  }

  public DeviceInfo iconUrl(String iconUrl) {
    this.iconUrl = JsonNullable.of(iconUrl);
    return this;
  }

  /**
   * Get iconUrl
   * @return iconUrl
  */
  
  @Schema(name = "IconUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IconUrl")
  public JsonNullable<String> getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(JsonNullable<String> iconUrl) {
    this.iconUrl = iconUrl;
  }

  public DeviceInfo id(String id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Gets or sets the identifier.
   * @return id
  */
  
  @Schema(name = "Id", description = "Gets or sets the identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public JsonNullable<String> getId() {
    return id;
  }

  public void setId(JsonNullable<String> id) {
    this.id = id;
  }

  public DeviceInfo lastUserId(UUID lastUserId) {
    this.lastUserId = lastUserId;
    return this;
  }

  /**
   * Gets or sets the last user identifier.
   * @return lastUserId
  */
  @Valid 
  @Schema(name = "LastUserId", description = "Gets or sets the last user identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastUserId")
  public UUID getLastUserId() {
    return lastUserId;
  }

  public void setLastUserId(UUID lastUserId) {
    this.lastUserId = lastUserId;
  }

  public DeviceInfo lastUserName(String lastUserName) {
    this.lastUserName = JsonNullable.of(lastUserName);
    return this;
  }

  /**
   * Gets or sets the last name of the user.
   * @return lastUserName
  */
  
  @Schema(name = "LastUserName", description = "Gets or sets the last name of the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastUserName")
  public JsonNullable<String> getLastUserName() {
    return lastUserName;
  }

  public void setLastUserName(JsonNullable<String> lastUserName) {
    this.lastUserName = lastUserName;
  }

  public DeviceInfo name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceInfo deviceInfo = (DeviceInfo) o;
    return equalsNullable(this.appName, deviceInfo.appName) &&
        equalsNullable(this.appVersion, deviceInfo.appVersion) &&
        Objects.equals(this.capabilities, deviceInfo.capabilities) &&
        Objects.equals(this.dateLastActivity, deviceInfo.dateLastActivity) &&
        equalsNullable(this.iconUrl, deviceInfo.iconUrl) &&
        equalsNullable(this.id, deviceInfo.id) &&
        Objects.equals(this.lastUserId, deviceInfo.lastUserId) &&
        equalsNullable(this.lastUserName, deviceInfo.lastUserName) &&
        equalsNullable(this.name, deviceInfo.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(appName), hashCodeNullable(appVersion), capabilities, dateLastActivity, hashCodeNullable(iconUrl), hashCodeNullable(id), lastUserId, hashCodeNullable(lastUserName), hashCodeNullable(name));
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
    sb.append("class DeviceInfo {\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    dateLastActivity: ").append(toIndentedString(dateLastActivity)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUserId: ").append(toIndentedString(lastUserId)).append("\n");
    sb.append("    lastUserName: ").append(toIndentedString(lastUserName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

