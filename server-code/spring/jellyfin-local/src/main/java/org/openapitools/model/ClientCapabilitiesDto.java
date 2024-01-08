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
 * Client capabilities dto.
 */

@Schema(name = "ClientCapabilitiesDto", description = "Client capabilities dto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ClientCapabilitiesDto {

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

  public ClientCapabilitiesDto appStoreUrl(String appStoreUrl) {
    this.appStoreUrl = JsonNullable.of(appStoreUrl);
    return this;
  }

  /**
   * Gets or sets the app store url.
   * @return appStoreUrl
  */
  
  @Schema(name = "AppStoreUrl", description = "Gets or sets the app store url.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AppStoreUrl")
  public JsonNullable<String> getAppStoreUrl() {
    return appStoreUrl;
  }

  public void setAppStoreUrl(JsonNullable<String> appStoreUrl) {
    this.appStoreUrl = appStoreUrl;
  }

  public ClientCapabilitiesDto deviceProfile(DeviceProfile deviceProfile) {
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

  public ClientCapabilitiesDto iconUrl(String iconUrl) {
    this.iconUrl = JsonNullable.of(iconUrl);
    return this;
  }

  /**
   * Gets or sets the icon url.
   * @return iconUrl
  */
  
  @Schema(name = "IconUrl", description = "Gets or sets the icon url.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IconUrl")
  public JsonNullable<String> getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(JsonNullable<String> iconUrl) {
    this.iconUrl = iconUrl;
  }

  public ClientCapabilitiesDto messageCallbackUrl(String messageCallbackUrl) {
    this.messageCallbackUrl = JsonNullable.of(messageCallbackUrl);
    return this;
  }

  /**
   * Gets or sets the message callback url.
   * @return messageCallbackUrl
  */
  
  @Schema(name = "MessageCallbackUrl", description = "Gets or sets the message callback url.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MessageCallbackUrl")
  public JsonNullable<String> getMessageCallbackUrl() {
    return messageCallbackUrl;
  }

  public void setMessageCallbackUrl(JsonNullable<String> messageCallbackUrl) {
    this.messageCallbackUrl = messageCallbackUrl;
  }

  public ClientCapabilitiesDto playableMediaTypes(List<String> playableMediaTypes) {
    this.playableMediaTypes = JsonNullable.of(playableMediaTypes);
    return this;
  }

  public ClientCapabilitiesDto addPlayableMediaTypesItem(String playableMediaTypesItem) {
    if (this.playableMediaTypes == null || !this.playableMediaTypes.isPresent()) {
      this.playableMediaTypes = JsonNullable.of(new ArrayList<>());
    }
    this.playableMediaTypes.get().add(playableMediaTypesItem);
    return this;
  }

  /**
   * Gets or sets the list of playable media types.
   * @return playableMediaTypes
  */
  
  @Schema(name = "PlayableMediaTypes", description = "Gets or sets the list of playable media types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlayableMediaTypes")
  public JsonNullable<List<String>> getPlayableMediaTypes() {
    return playableMediaTypes;
  }

  public void setPlayableMediaTypes(JsonNullable<List<String>> playableMediaTypes) {
    this.playableMediaTypes = playableMediaTypes;
  }

  public ClientCapabilitiesDto supportedCommands(List<@Valid GeneralCommandType> supportedCommands) {
    this.supportedCommands = JsonNullable.of(supportedCommands);
    return this;
  }

  public ClientCapabilitiesDto addSupportedCommandsItem(GeneralCommandType supportedCommandsItem) {
    if (this.supportedCommands == null || !this.supportedCommands.isPresent()) {
      this.supportedCommands = JsonNullable.of(new ArrayList<>());
    }
    this.supportedCommands.get().add(supportedCommandsItem);
    return this;
  }

  /**
   * Gets or sets the list of supported commands.
   * @return supportedCommands
  */
  @Valid 
  @Schema(name = "SupportedCommands", description = "Gets or sets the list of supported commands.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportedCommands")
  public JsonNullable<List<@Valid GeneralCommandType>> getSupportedCommands() {
    return supportedCommands;
  }

  public void setSupportedCommands(JsonNullable<List<@Valid GeneralCommandType>> supportedCommands) {
    this.supportedCommands = supportedCommands;
  }

  public ClientCapabilitiesDto supportsContentUploading(Boolean supportsContentUploading) {
    this.supportsContentUploading = supportsContentUploading;
    return this;
  }

  /**
   * Gets or sets a value indicating whether session supports content uploading.
   * @return supportsContentUploading
  */
  
  @Schema(name = "SupportsContentUploading", description = "Gets or sets a value indicating whether session supports content uploading.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsContentUploading")
  public Boolean getSupportsContentUploading() {
    return supportsContentUploading;
  }

  public void setSupportsContentUploading(Boolean supportsContentUploading) {
    this.supportsContentUploading = supportsContentUploading;
  }

  public ClientCapabilitiesDto supportsMediaControl(Boolean supportsMediaControl) {
    this.supportsMediaControl = supportsMediaControl;
    return this;
  }

  /**
   * Gets or sets a value indicating whether session supports media control.
   * @return supportsMediaControl
  */
  
  @Schema(name = "SupportsMediaControl", description = "Gets or sets a value indicating whether session supports media control.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsMediaControl")
  public Boolean getSupportsMediaControl() {
    return supportsMediaControl;
  }

  public void setSupportsMediaControl(Boolean supportsMediaControl) {
    this.supportsMediaControl = supportsMediaControl;
  }

  public ClientCapabilitiesDto supportsPersistentIdentifier(Boolean supportsPersistentIdentifier) {
    this.supportsPersistentIdentifier = supportsPersistentIdentifier;
    return this;
  }

  /**
   * Gets or sets a value indicating whether session supports a persistent identifier.
   * @return supportsPersistentIdentifier
  */
  
  @Schema(name = "SupportsPersistentIdentifier", description = "Gets or sets a value indicating whether session supports a persistent identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsPersistentIdentifier")
  public Boolean getSupportsPersistentIdentifier() {
    return supportsPersistentIdentifier;
  }

  public void setSupportsPersistentIdentifier(Boolean supportsPersistentIdentifier) {
    this.supportsPersistentIdentifier = supportsPersistentIdentifier;
  }

  public ClientCapabilitiesDto supportsSync(Boolean supportsSync) {
    this.supportsSync = supportsSync;
    return this;
  }

  /**
   * Gets or sets a value indicating whether session supports sync.
   * @return supportsSync
  */
  
  @Schema(name = "SupportsSync", description = "Gets or sets a value indicating whether session supports sync.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ClientCapabilitiesDto clientCapabilitiesDto = (ClientCapabilitiesDto) o;
    return equalsNullable(this.appStoreUrl, clientCapabilitiesDto.appStoreUrl) &&
        Objects.equals(this.deviceProfile, clientCapabilitiesDto.deviceProfile) &&
        equalsNullable(this.iconUrl, clientCapabilitiesDto.iconUrl) &&
        equalsNullable(this.messageCallbackUrl, clientCapabilitiesDto.messageCallbackUrl) &&
        equalsNullable(this.playableMediaTypes, clientCapabilitiesDto.playableMediaTypes) &&
        equalsNullable(this.supportedCommands, clientCapabilitiesDto.supportedCommands) &&
        Objects.equals(this.supportsContentUploading, clientCapabilitiesDto.supportsContentUploading) &&
        Objects.equals(this.supportsMediaControl, clientCapabilitiesDto.supportsMediaControl) &&
        Objects.equals(this.supportsPersistentIdentifier, clientCapabilitiesDto.supportsPersistentIdentifier) &&
        Objects.equals(this.supportsSync, clientCapabilitiesDto.supportsSync);
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
    sb.append("class ClientCapabilitiesDto {\n");
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

