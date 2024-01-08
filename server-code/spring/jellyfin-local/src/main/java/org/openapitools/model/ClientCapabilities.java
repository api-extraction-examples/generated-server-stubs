package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DeviceProfile;
import org.openapitools.model.GeneralCommandType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ClientCapabilities
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ClientCapabilities {

  private JsonNullable<String> appStoreUrl = JsonNullable.<String>undefined();

  private DeviceProfile deviceProfile;

  private JsonNullable<String> iconUrl = JsonNullable.<String>undefined();

  private JsonNullable<String> messageCallbackUrl = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> playableMediaTypes = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<@Valid GeneralCommandType>> supportedCommands = JsonNullable.<List<@Valid GeneralCommandType>>undefined();

  private Boolean supportsContentUploading;

  private Boolean supportsMediaControl;

  private Boolean supportsPersistentIdentifier;

  private Boolean supportsSync;

  public ClientCapabilities appStoreUrl(String appStoreUrl) {
    this.appStoreUrl = JsonNullable.of(appStoreUrl);
    return this;
  }

  /**
   * Get appStoreUrl
   * @return appStoreUrl
  */
  
  @Schema(name = "AppStoreUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AppStoreUrl")
  public JsonNullable<String> getAppStoreUrl() {
    return appStoreUrl;
  }

  public void setAppStoreUrl(JsonNullable<String> appStoreUrl) {
    this.appStoreUrl = appStoreUrl;
  }

  public ClientCapabilities deviceProfile(DeviceProfile deviceProfile) {
    this.deviceProfile = deviceProfile;
    return this;
  }

  /**
   * Get deviceProfile
   * @return deviceProfile
  */
  @Valid 
  @Schema(name = "DeviceProfile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeviceProfile")
  public DeviceProfile getDeviceProfile() {
    return deviceProfile;
  }

  public void setDeviceProfile(DeviceProfile deviceProfile) {
    this.deviceProfile = deviceProfile;
  }

  public ClientCapabilities iconUrl(String iconUrl) {
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

  public ClientCapabilities messageCallbackUrl(String messageCallbackUrl) {
    this.messageCallbackUrl = JsonNullable.of(messageCallbackUrl);
    return this;
  }

  /**
   * Get messageCallbackUrl
   * @return messageCallbackUrl
  */
  
  @Schema(name = "MessageCallbackUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MessageCallbackUrl")
  public JsonNullable<String> getMessageCallbackUrl() {
    return messageCallbackUrl;
  }

  public void setMessageCallbackUrl(JsonNullable<String> messageCallbackUrl) {
    this.messageCallbackUrl = messageCallbackUrl;
  }

  public ClientCapabilities playableMediaTypes(List<String> playableMediaTypes) {
    this.playableMediaTypes = JsonNullable.of(playableMediaTypes);
    return this;
  }

  public ClientCapabilities addPlayableMediaTypesItem(String playableMediaTypesItem) {
    if (this.playableMediaTypes == null || !this.playableMediaTypes.isPresent()) {
      this.playableMediaTypes = JsonNullable.of(new ArrayList<>());
    }
    this.playableMediaTypes.get().add(playableMediaTypesItem);
    return this;
  }

  /**
   * Get playableMediaTypes
   * @return playableMediaTypes
  */
  
  @Schema(name = "PlayableMediaTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlayableMediaTypes")
  public JsonNullable<List<String>> getPlayableMediaTypes() {
    return playableMediaTypes;
  }

  public void setPlayableMediaTypes(JsonNullable<List<String>> playableMediaTypes) {
    this.playableMediaTypes = playableMediaTypes;
  }

  public ClientCapabilities supportedCommands(List<@Valid GeneralCommandType> supportedCommands) {
    this.supportedCommands = JsonNullable.of(supportedCommands);
    return this;
  }

  public ClientCapabilities addSupportedCommandsItem(GeneralCommandType supportedCommandsItem) {
    if (this.supportedCommands == null || !this.supportedCommands.isPresent()) {
      this.supportedCommands = JsonNullable.of(new ArrayList<>());
    }
    this.supportedCommands.get().add(supportedCommandsItem);
    return this;
  }

  /**
   * Get supportedCommands
   * @return supportedCommands
  */
  @Valid 
  @Schema(name = "SupportedCommands", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportedCommands")
  public JsonNullable<List<@Valid GeneralCommandType>> getSupportedCommands() {
    return supportedCommands;
  }

  public void setSupportedCommands(JsonNullable<List<@Valid GeneralCommandType>> supportedCommands) {
    this.supportedCommands = supportedCommands;
  }

  public ClientCapabilities supportsContentUploading(Boolean supportsContentUploading) {
    this.supportsContentUploading = supportsContentUploading;
    return this;
  }

  /**
   * Get supportsContentUploading
   * @return supportsContentUploading
  */
  
  @Schema(name = "SupportsContentUploading", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsContentUploading")
  public Boolean getSupportsContentUploading() {
    return supportsContentUploading;
  }

  public void setSupportsContentUploading(Boolean supportsContentUploading) {
    this.supportsContentUploading = supportsContentUploading;
  }

  public ClientCapabilities supportsMediaControl(Boolean supportsMediaControl) {
    this.supportsMediaControl = supportsMediaControl;
    return this;
  }

  /**
   * Get supportsMediaControl
   * @return supportsMediaControl
  */
  
  @Schema(name = "SupportsMediaControl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsMediaControl")
  public Boolean getSupportsMediaControl() {
    return supportsMediaControl;
  }

  public void setSupportsMediaControl(Boolean supportsMediaControl) {
    this.supportsMediaControl = supportsMediaControl;
  }

  public ClientCapabilities supportsPersistentIdentifier(Boolean supportsPersistentIdentifier) {
    this.supportsPersistentIdentifier = supportsPersistentIdentifier;
    return this;
  }

  /**
   * Get supportsPersistentIdentifier
   * @return supportsPersistentIdentifier
  */
  
  @Schema(name = "SupportsPersistentIdentifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsPersistentIdentifier")
  public Boolean getSupportsPersistentIdentifier() {
    return supportsPersistentIdentifier;
  }

  public void setSupportsPersistentIdentifier(Boolean supportsPersistentIdentifier) {
    this.supportsPersistentIdentifier = supportsPersistentIdentifier;
  }

  public ClientCapabilities supportsSync(Boolean supportsSync) {
    this.supportsSync = supportsSync;
    return this;
  }

  /**
   * Get supportsSync
   * @return supportsSync
  */
  
  @Schema(name = "SupportsSync", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsSync")
  public Boolean getSupportsSync() {
    return supportsSync;
  }

  public void setSupportsSync(Boolean supportsSync) {
    this.supportsSync = supportsSync;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientCapabilities clientCapabilities = (ClientCapabilities) o;
    return equalsNullable(this.appStoreUrl, clientCapabilities.appStoreUrl) &&
        Objects.equals(this.deviceProfile, clientCapabilities.deviceProfile) &&
        equalsNullable(this.iconUrl, clientCapabilities.iconUrl) &&
        equalsNullable(this.messageCallbackUrl, clientCapabilities.messageCallbackUrl) &&
        equalsNullable(this.playableMediaTypes, clientCapabilities.playableMediaTypes) &&
        equalsNullable(this.supportedCommands, clientCapabilities.supportedCommands) &&
        Objects.equals(this.supportsContentUploading, clientCapabilities.supportsContentUploading) &&
        Objects.equals(this.supportsMediaControl, clientCapabilities.supportsMediaControl) &&
        Objects.equals(this.supportsPersistentIdentifier, clientCapabilities.supportsPersistentIdentifier) &&
        Objects.equals(this.supportsSync, clientCapabilities.supportsSync);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(appStoreUrl), deviceProfile, hashCodeNullable(iconUrl), hashCodeNullable(messageCallbackUrl), hashCodeNullable(playableMediaTypes), hashCodeNullable(supportedCommands), supportsContentUploading, supportsMediaControl, supportsPersistentIdentifier, supportsSync);
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
    sb.append("class ClientCapabilities {\n");
    sb.append("    appStoreUrl: ").append(toIndentedString(appStoreUrl)).append("\n");
    sb.append("    deviceProfile: ").append(toIndentedString(deviceProfile)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    messageCallbackUrl: ").append(toIndentedString(messageCallbackUrl)).append("\n");
    sb.append("    playableMediaTypes: ").append(toIndentedString(playableMediaTypes)).append("\n");
    sb.append("    supportedCommands: ").append(toIndentedString(supportedCommands)).append("\n");
    sb.append("    supportsContentUploading: ").append(toIndentedString(supportsContentUploading)).append("\n");
    sb.append("    supportsMediaControl: ").append(toIndentedString(supportsMediaControl)).append("\n");
    sb.append("    supportsPersistentIdentifier: ").append(toIndentedString(supportsPersistentIdentifier)).append("\n");
    sb.append("    supportsSync: ").append(toIndentedString(supportsSync)).append("\n");
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

