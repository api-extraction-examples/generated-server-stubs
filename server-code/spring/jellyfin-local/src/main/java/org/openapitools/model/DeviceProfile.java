package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CodecProfile;
import org.openapitools.model.ContainerProfile;
import org.openapitools.model.DeviceIdentification;
import org.openapitools.model.DirectPlayProfile;
import org.openapitools.model.ResponseProfile;
import org.openapitools.model.SubtitleProfile;
import org.openapitools.model.TranscodingProfile;
import org.openapitools.model.XmlAttribute;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Defines the MediaBrowser.Model.Dlna.DeviceProfile.
 */

@Schema(name = "DeviceProfile", description = "Defines the MediaBrowser.Model.Dlna.DeviceProfile.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class DeviceProfile {

  private JsonNullable<String> albumArtPn = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid CodecProfile>> codecProfiles = JsonNullable.<List<@Valid CodecProfile>>undefined();

  @Valid
  private JsonNullable<List<@Valid ContainerProfile>> containerProfiles = JsonNullable.<List<@Valid ContainerProfile>>undefined();

  @Valid
  private JsonNullable<List<@Valid DirectPlayProfile>> directPlayProfiles = JsonNullable.<List<@Valid DirectPlayProfile>>undefined();

  private Boolean enableAlbumArtInDidl;

  private Boolean enableMSMediaReceiverRegistrar;

  private Boolean enableSingleAlbumArtLimit;

  private Boolean enableSingleSubtitleLimit;

  private JsonNullable<String> friendlyName = JsonNullable.<String>undefined();

  private JsonNullable<String> id = JsonNullable.<String>undefined();

  private DeviceIdentification identification;

  private Boolean ignoreTranscodeByteRangeRequests;

  private JsonNullable<String> manufacturer = JsonNullable.<String>undefined();

  private JsonNullable<String> manufacturerUrl = JsonNullable.<String>undefined();

  private Integer maxAlbumArtHeight;

  private Integer maxAlbumArtWidth;

  private JsonNullable<Integer> maxIconHeight = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> maxIconWidth = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> maxStaticBitrate = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> maxStaticMusicBitrate = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> maxStreamingBitrate = JsonNullable.<Integer>undefined();

  private JsonNullable<String> modelDescription = JsonNullable.<String>undefined();

  private JsonNullable<String> modelName = JsonNullable.<String>undefined();

  private JsonNullable<String> modelNumber = JsonNullable.<String>undefined();

  private JsonNullable<String> modelUrl = JsonNullable.<String>undefined();

  private JsonNullable<Integer> musicStreamingTranscodingBitrate = JsonNullable.<Integer>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> protocolInfo = JsonNullable.<String>undefined();

  private Boolean requiresPlainFolders;

  private Boolean requiresPlainVideoItems;

  @Valid
  private JsonNullable<List<@Valid ResponseProfile>> responseProfiles = JsonNullable.<List<@Valid ResponseProfile>>undefined();

  private JsonNullable<String> serialNumber = JsonNullable.<String>undefined();

  private JsonNullable<String> sonyAggregationFlags = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid SubtitleProfile>> subtitleProfiles = JsonNullable.<List<@Valid SubtitleProfile>>undefined();

  private JsonNullable<String> supportedMediaTypes = JsonNullable.<String>undefined();

  private Integer timelineOffsetSeconds;

  @Valid
  private JsonNullable<List<@Valid TranscodingProfile>> transcodingProfiles = JsonNullable.<List<@Valid TranscodingProfile>>undefined();

  private JsonNullable<String> userId = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid XmlAttribute>> xmlRootAttributes = JsonNullable.<List<@Valid XmlAttribute>>undefined();

  public DeviceProfile albumArtPn(String albumArtPn) {
    this.albumArtPn = JsonNullable.of(albumArtPn);
    return this;
  }

  /**
   * Gets or sets the AlbumArtPn.
   * @return albumArtPn
  */
  
  @Schema(name = "AlbumArtPn", description = "Gets or sets the AlbumArtPn.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AlbumArtPn")
  public JsonNullable<String> getAlbumArtPn() {
    return albumArtPn;
  }

  public void setAlbumArtPn(JsonNullable<String> albumArtPn) {
    this.albumArtPn = albumArtPn;
  }

  public DeviceProfile codecProfiles(List<@Valid CodecProfile> codecProfiles) {
    this.codecProfiles = JsonNullable.of(codecProfiles);
    return this;
  }

  public DeviceProfile addCodecProfilesItem(CodecProfile codecProfilesItem) {
    if (this.codecProfiles == null || !this.codecProfiles.isPresent()) {
      this.codecProfiles = JsonNullable.of(new ArrayList<>());
    }
    this.codecProfiles.get().add(codecProfilesItem);
    return this;
  }

  /**
   * Gets or sets the CodecProfiles.
   * @return codecProfiles
  */
  @Valid 
  @Schema(name = "CodecProfiles", description = "Gets or sets the CodecProfiles.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CodecProfiles")
  public JsonNullable<List<@Valid CodecProfile>> getCodecProfiles() {
    return codecProfiles;
  }

  public void setCodecProfiles(JsonNullable<List<@Valid CodecProfile>> codecProfiles) {
    this.codecProfiles = codecProfiles;
  }

  public DeviceProfile containerProfiles(List<@Valid ContainerProfile> containerProfiles) {
    this.containerProfiles = JsonNullable.of(containerProfiles);
    return this;
  }

  public DeviceProfile addContainerProfilesItem(ContainerProfile containerProfilesItem) {
    if (this.containerProfiles == null || !this.containerProfiles.isPresent()) {
      this.containerProfiles = JsonNullable.of(new ArrayList<>());
    }
    this.containerProfiles.get().add(containerProfilesItem);
    return this;
  }

  /**
   * Gets or sets the ContainerProfiles.
   * @return containerProfiles
  */
  @Valid 
  @Schema(name = "ContainerProfiles", description = "Gets or sets the ContainerProfiles.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContainerProfiles")
  public JsonNullable<List<@Valid ContainerProfile>> getContainerProfiles() {
    return containerProfiles;
  }

  public void setContainerProfiles(JsonNullable<List<@Valid ContainerProfile>> containerProfiles) {
    this.containerProfiles = containerProfiles;
  }

  public DeviceProfile directPlayProfiles(List<@Valid DirectPlayProfile> directPlayProfiles) {
    this.directPlayProfiles = JsonNullable.of(directPlayProfiles);
    return this;
  }

  public DeviceProfile addDirectPlayProfilesItem(DirectPlayProfile directPlayProfilesItem) {
    if (this.directPlayProfiles == null || !this.directPlayProfiles.isPresent()) {
      this.directPlayProfiles = JsonNullable.of(new ArrayList<>());
    }
    this.directPlayProfiles.get().add(directPlayProfilesItem);
    return this;
  }

  /**
   * Gets or sets the direct play profiles.
   * @return directPlayProfiles
  */
  @Valid 
  @Schema(name = "DirectPlayProfiles", description = "Gets or sets the direct play profiles.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DirectPlayProfiles")
  public JsonNullable<List<@Valid DirectPlayProfile>> getDirectPlayProfiles() {
    return directPlayProfiles;
  }

  public void setDirectPlayProfiles(JsonNullable<List<@Valid DirectPlayProfile>> directPlayProfiles) {
    this.directPlayProfiles = directPlayProfiles;
  }

  public DeviceProfile enableAlbumArtInDidl(Boolean enableAlbumArtInDidl) {
    this.enableAlbumArtInDidl = enableAlbumArtInDidl;
    return this;
  }

  /**
   * Gets or sets a value indicating whether EnableAlbumArtInDidl.
   * @return enableAlbumArtInDidl
  */
  
  @Schema(name = "EnableAlbumArtInDidl", description = "Gets or sets a value indicating whether EnableAlbumArtInDidl.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableAlbumArtInDidl")
  public Boolean getEnableAlbumArtInDidl() {
    return enableAlbumArtInDidl;
  }

  public void setEnableAlbumArtInDidl(Boolean enableAlbumArtInDidl) {
    this.enableAlbumArtInDidl = enableAlbumArtInDidl;
  }

  public DeviceProfile enableMSMediaReceiverRegistrar(Boolean enableMSMediaReceiverRegistrar) {
    this.enableMSMediaReceiverRegistrar = enableMSMediaReceiverRegistrar;
    return this;
  }

  /**
   * Gets or sets a value indicating whether EnableMSMediaReceiverRegistrar.
   * @return enableMSMediaReceiverRegistrar
  */
  
  @Schema(name = "EnableMSMediaReceiverRegistrar", description = "Gets or sets a value indicating whether EnableMSMediaReceiverRegistrar.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableMSMediaReceiverRegistrar")
  public Boolean getEnableMSMediaReceiverRegistrar() {
    return enableMSMediaReceiverRegistrar;
  }

  public void setEnableMSMediaReceiverRegistrar(Boolean enableMSMediaReceiverRegistrar) {
    this.enableMSMediaReceiverRegistrar = enableMSMediaReceiverRegistrar;
  }

  public DeviceProfile enableSingleAlbumArtLimit(Boolean enableSingleAlbumArtLimit) {
    this.enableSingleAlbumArtLimit = enableSingleAlbumArtLimit;
    return this;
  }

  /**
   * Gets or sets a value indicating whether EnableSingleAlbumArtLimit.
   * @return enableSingleAlbumArtLimit
  */
  
  @Schema(name = "EnableSingleAlbumArtLimit", description = "Gets or sets a value indicating whether EnableSingleAlbumArtLimit.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableSingleAlbumArtLimit")
  public Boolean getEnableSingleAlbumArtLimit() {
    return enableSingleAlbumArtLimit;
  }

  public void setEnableSingleAlbumArtLimit(Boolean enableSingleAlbumArtLimit) {
    this.enableSingleAlbumArtLimit = enableSingleAlbumArtLimit;
  }

  public DeviceProfile enableSingleSubtitleLimit(Boolean enableSingleSubtitleLimit) {
    this.enableSingleSubtitleLimit = enableSingleSubtitleLimit;
    return this;
  }

  /**
   * Gets or sets a value indicating whether EnableSingleSubtitleLimit.
   * @return enableSingleSubtitleLimit
  */
  
  @Schema(name = "EnableSingleSubtitleLimit", description = "Gets or sets a value indicating whether EnableSingleSubtitleLimit.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableSingleSubtitleLimit")
  public Boolean getEnableSingleSubtitleLimit() {
    return enableSingleSubtitleLimit;
  }

  public void setEnableSingleSubtitleLimit(Boolean enableSingleSubtitleLimit) {
    this.enableSingleSubtitleLimit = enableSingleSubtitleLimit;
  }

  public DeviceProfile friendlyName(String friendlyName) {
    this.friendlyName = JsonNullable.of(friendlyName);
    return this;
  }

  /**
   * Gets or sets the FriendlyName.
   * @return friendlyName
  */
  
  @Schema(name = "FriendlyName", description = "Gets or sets the FriendlyName.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FriendlyName")
  public JsonNullable<String> getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(JsonNullable<String> friendlyName) {
    this.friendlyName = friendlyName;
  }

  public DeviceProfile id(String id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Gets or sets the Id.
   * @return id
  */
  
  @Schema(name = "Id", description = "Gets or sets the Id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public JsonNullable<String> getId() {
    return id;
  }

  public void setId(JsonNullable<String> id) {
    this.id = id;
  }

  public DeviceProfile identification(DeviceIdentification identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  */
  @Valid 
  @Schema(name = "Identification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Identification")
  public DeviceIdentification getIdentification() {
    return identification;
  }

  public void setIdentification(DeviceIdentification identification) {
    this.identification = identification;
  }

  public DeviceProfile ignoreTranscodeByteRangeRequests(Boolean ignoreTranscodeByteRangeRequests) {
    this.ignoreTranscodeByteRangeRequests = ignoreTranscodeByteRangeRequests;
    return this;
  }

  /**
   * Gets or sets a value indicating whether IgnoreTranscodeByteRangeRequests.
   * @return ignoreTranscodeByteRangeRequests
  */
  
  @Schema(name = "IgnoreTranscodeByteRangeRequests", description = "Gets or sets a value indicating whether IgnoreTranscodeByteRangeRequests.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IgnoreTranscodeByteRangeRequests")
  public Boolean getIgnoreTranscodeByteRangeRequests() {
    return ignoreTranscodeByteRangeRequests;
  }

  public void setIgnoreTranscodeByteRangeRequests(Boolean ignoreTranscodeByteRangeRequests) {
    this.ignoreTranscodeByteRangeRequests = ignoreTranscodeByteRangeRequests;
  }

  public DeviceProfile manufacturer(String manufacturer) {
    this.manufacturer = JsonNullable.of(manufacturer);
    return this;
  }

  /**
   * Gets or sets the Manufacturer.
   * @return manufacturer
  */
  
  @Schema(name = "Manufacturer", description = "Gets or sets the Manufacturer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Manufacturer")
  public JsonNullable<String> getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(JsonNullable<String> manufacturer) {
    this.manufacturer = manufacturer;
  }

  public DeviceProfile manufacturerUrl(String manufacturerUrl) {
    this.manufacturerUrl = JsonNullable.of(manufacturerUrl);
    return this;
  }

  /**
   * Gets or sets the ManufacturerUrl.
   * @return manufacturerUrl
  */
  
  @Schema(name = "ManufacturerUrl", description = "Gets or sets the ManufacturerUrl.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ManufacturerUrl")
  public JsonNullable<String> getManufacturerUrl() {
    return manufacturerUrl;
  }

  public void setManufacturerUrl(JsonNullable<String> manufacturerUrl) {
    this.manufacturerUrl = manufacturerUrl;
  }

  public DeviceProfile maxAlbumArtHeight(Integer maxAlbumArtHeight) {
    this.maxAlbumArtHeight = maxAlbumArtHeight;
    return this;
  }

  /**
   * Gets or sets the MaxAlbumArtHeight.
   * @return maxAlbumArtHeight
  */
  
  @Schema(name = "MaxAlbumArtHeight", description = "Gets or sets the MaxAlbumArtHeight.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxAlbumArtHeight")
  public Integer getMaxAlbumArtHeight() {
    return maxAlbumArtHeight;
  }

  public void setMaxAlbumArtHeight(Integer maxAlbumArtHeight) {
    this.maxAlbumArtHeight = maxAlbumArtHeight;
  }

  public DeviceProfile maxAlbumArtWidth(Integer maxAlbumArtWidth) {
    this.maxAlbumArtWidth = maxAlbumArtWidth;
    return this;
  }

  /**
   * Gets or sets the MaxAlbumArtWidth.
   * @return maxAlbumArtWidth
  */
  
  @Schema(name = "MaxAlbumArtWidth", description = "Gets or sets the MaxAlbumArtWidth.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxAlbumArtWidth")
  public Integer getMaxAlbumArtWidth() {
    return maxAlbumArtWidth;
  }

  public void setMaxAlbumArtWidth(Integer maxAlbumArtWidth) {
    this.maxAlbumArtWidth = maxAlbumArtWidth;
  }

  public DeviceProfile maxIconHeight(Integer maxIconHeight) {
    this.maxIconHeight = JsonNullable.of(maxIconHeight);
    return this;
  }

  /**
   * Gets or sets the MaxIconHeight.
   * @return maxIconHeight
  */
  
  @Schema(name = "MaxIconHeight", description = "Gets or sets the MaxIconHeight.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxIconHeight")
  public JsonNullable<Integer> getMaxIconHeight() {
    return maxIconHeight;
  }

  public void setMaxIconHeight(JsonNullable<Integer> maxIconHeight) {
    this.maxIconHeight = maxIconHeight;
  }

  public DeviceProfile maxIconWidth(Integer maxIconWidth) {
    this.maxIconWidth = JsonNullable.of(maxIconWidth);
    return this;
  }

  /**
   * Gets or sets the MaxIconWidth.
   * @return maxIconWidth
  */
  
  @Schema(name = "MaxIconWidth", description = "Gets or sets the MaxIconWidth.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxIconWidth")
  public JsonNullable<Integer> getMaxIconWidth() {
    return maxIconWidth;
  }

  public void setMaxIconWidth(JsonNullable<Integer> maxIconWidth) {
    this.maxIconWidth = maxIconWidth;
  }

  public DeviceProfile maxStaticBitrate(Integer maxStaticBitrate) {
    this.maxStaticBitrate = JsonNullable.of(maxStaticBitrate);
    return this;
  }

  /**
   * Gets or sets the MaxStaticBitrate.
   * @return maxStaticBitrate
  */
  
  @Schema(name = "MaxStaticBitrate", description = "Gets or sets the MaxStaticBitrate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxStaticBitrate")
  public JsonNullable<Integer> getMaxStaticBitrate() {
    return maxStaticBitrate;
  }

  public void setMaxStaticBitrate(JsonNullable<Integer> maxStaticBitrate) {
    this.maxStaticBitrate = maxStaticBitrate;
  }

  public DeviceProfile maxStaticMusicBitrate(Integer maxStaticMusicBitrate) {
    this.maxStaticMusicBitrate = JsonNullable.of(maxStaticMusicBitrate);
    return this;
  }

  /**
   * Gets or sets the MaxStaticMusicBitrate.
   * @return maxStaticMusicBitrate
  */
  
  @Schema(name = "MaxStaticMusicBitrate", description = "Gets or sets the MaxStaticMusicBitrate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxStaticMusicBitrate")
  public JsonNullable<Integer> getMaxStaticMusicBitrate() {
    return maxStaticMusicBitrate;
  }

  public void setMaxStaticMusicBitrate(JsonNullable<Integer> maxStaticMusicBitrate) {
    this.maxStaticMusicBitrate = maxStaticMusicBitrate;
  }

  public DeviceProfile maxStreamingBitrate(Integer maxStreamingBitrate) {
    this.maxStreamingBitrate = JsonNullable.of(maxStreamingBitrate);
    return this;
  }

  /**
   * Gets or sets the MaxStreamingBitrate.
   * @return maxStreamingBitrate
  */
  
  @Schema(name = "MaxStreamingBitrate", description = "Gets or sets the MaxStreamingBitrate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxStreamingBitrate")
  public JsonNullable<Integer> getMaxStreamingBitrate() {
    return maxStreamingBitrate;
  }

  public void setMaxStreamingBitrate(JsonNullable<Integer> maxStreamingBitrate) {
    this.maxStreamingBitrate = maxStreamingBitrate;
  }

  public DeviceProfile modelDescription(String modelDescription) {
    this.modelDescription = JsonNullable.of(modelDescription);
    return this;
  }

  /**
   * Gets or sets the ModelDescription.
   * @return modelDescription
  */
  
  @Schema(name = "ModelDescription", description = "Gets or sets the ModelDescription.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ModelDescription")
  public JsonNullable<String> getModelDescription() {
    return modelDescription;
  }

  public void setModelDescription(JsonNullable<String> modelDescription) {
    this.modelDescription = modelDescription;
  }

  public DeviceProfile modelName(String modelName) {
    this.modelName = JsonNullable.of(modelName);
    return this;
  }

  /**
   * Gets or sets the ModelName.
   * @return modelName
  */
  
  @Schema(name = "ModelName", description = "Gets or sets the ModelName.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ModelName")
  public JsonNullable<String> getModelName() {
    return modelName;
  }

  public void setModelName(JsonNullable<String> modelName) {
    this.modelName = modelName;
  }

  public DeviceProfile modelNumber(String modelNumber) {
    this.modelNumber = JsonNullable.of(modelNumber);
    return this;
  }

  /**
   * Gets or sets the ModelNumber.
   * @return modelNumber
  */
  
  @Schema(name = "ModelNumber", description = "Gets or sets the ModelNumber.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ModelNumber")
  public JsonNullable<String> getModelNumber() {
    return modelNumber;
  }

  public void setModelNumber(JsonNullable<String> modelNumber) {
    this.modelNumber = modelNumber;
  }

  public DeviceProfile modelUrl(String modelUrl) {
    this.modelUrl = JsonNullable.of(modelUrl);
    return this;
  }

  /**
   * Gets or sets the ModelUrl.
   * @return modelUrl
  */
  
  @Schema(name = "ModelUrl", description = "Gets or sets the ModelUrl.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ModelUrl")
  public JsonNullable<String> getModelUrl() {
    return modelUrl;
  }

  public void setModelUrl(JsonNullable<String> modelUrl) {
    this.modelUrl = modelUrl;
  }

  public DeviceProfile musicStreamingTranscodingBitrate(Integer musicStreamingTranscodingBitrate) {
    this.musicStreamingTranscodingBitrate = JsonNullable.of(musicStreamingTranscodingBitrate);
    return this;
  }

  /**
   * Gets or sets the MusicStreamingTranscodingBitrate.
   * @return musicStreamingTranscodingBitrate
  */
  
  @Schema(name = "MusicStreamingTranscodingBitrate", description = "Gets or sets the MusicStreamingTranscodingBitrate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MusicStreamingTranscodingBitrate")
  public JsonNullable<Integer> getMusicStreamingTranscodingBitrate() {
    return musicStreamingTranscodingBitrate;
  }

  public void setMusicStreamingTranscodingBitrate(JsonNullable<Integer> musicStreamingTranscodingBitrate) {
    this.musicStreamingTranscodingBitrate = musicStreamingTranscodingBitrate;
  }

  public DeviceProfile name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets or sets the Name.
   * @return name
  */
  
  @Schema(name = "Name", description = "Gets or sets the Name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public DeviceProfile protocolInfo(String protocolInfo) {
    this.protocolInfo = JsonNullable.of(protocolInfo);
    return this;
  }

  /**
   * Gets or sets the ProtocolInfo.
   * @return protocolInfo
  */
  
  @Schema(name = "ProtocolInfo", description = "Gets or sets the ProtocolInfo.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProtocolInfo")
  public JsonNullable<String> getProtocolInfo() {
    return protocolInfo;
  }

  public void setProtocolInfo(JsonNullable<String> protocolInfo) {
    this.protocolInfo = protocolInfo;
  }

  public DeviceProfile requiresPlainFolders(Boolean requiresPlainFolders) {
    this.requiresPlainFolders = requiresPlainFolders;
    return this;
  }

  /**
   * Gets or sets a value indicating whether RequiresPlainFolders.
   * @return requiresPlainFolders
  */
  
  @Schema(name = "RequiresPlainFolders", description = "Gets or sets a value indicating whether RequiresPlainFolders.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RequiresPlainFolders")
  public Boolean getRequiresPlainFolders() {
    return requiresPlainFolders;
  }

  public void setRequiresPlainFolders(Boolean requiresPlainFolders) {
    this.requiresPlainFolders = requiresPlainFolders;
  }

  public DeviceProfile requiresPlainVideoItems(Boolean requiresPlainVideoItems) {
    this.requiresPlainVideoItems = requiresPlainVideoItems;
    return this;
  }

  /**
   * Gets or sets a value indicating whether RequiresPlainVideoItems.
   * @return requiresPlainVideoItems
  */
  
  @Schema(name = "RequiresPlainVideoItems", description = "Gets or sets a value indicating whether RequiresPlainVideoItems.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RequiresPlainVideoItems")
  public Boolean getRequiresPlainVideoItems() {
    return requiresPlainVideoItems;
  }

  public void setRequiresPlainVideoItems(Boolean requiresPlainVideoItems) {
    this.requiresPlainVideoItems = requiresPlainVideoItems;
  }

  public DeviceProfile responseProfiles(List<@Valid ResponseProfile> responseProfiles) {
    this.responseProfiles = JsonNullable.of(responseProfiles);
    return this;
  }

  public DeviceProfile addResponseProfilesItem(ResponseProfile responseProfilesItem) {
    if (this.responseProfiles == null || !this.responseProfiles.isPresent()) {
      this.responseProfiles = JsonNullable.of(new ArrayList<>());
    }
    this.responseProfiles.get().add(responseProfilesItem);
    return this;
  }

  /**
   * Gets or sets the ResponseProfiles.
   * @return responseProfiles
  */
  @Valid 
  @Schema(name = "ResponseProfiles", description = "Gets or sets the ResponseProfiles.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ResponseProfiles")
  public JsonNullable<List<@Valid ResponseProfile>> getResponseProfiles() {
    return responseProfiles;
  }

  public void setResponseProfiles(JsonNullable<List<@Valid ResponseProfile>> responseProfiles) {
    this.responseProfiles = responseProfiles;
  }

  public DeviceProfile serialNumber(String serialNumber) {
    this.serialNumber = JsonNullable.of(serialNumber);
    return this;
  }

  /**
   * Gets or sets the SerialNumber.
   * @return serialNumber
  */
  
  @Schema(name = "SerialNumber", description = "Gets or sets the SerialNumber.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SerialNumber")
  public JsonNullable<String> getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(JsonNullable<String> serialNumber) {
    this.serialNumber = serialNumber;
  }

  public DeviceProfile sonyAggregationFlags(String sonyAggregationFlags) {
    this.sonyAggregationFlags = JsonNullable.of(sonyAggregationFlags);
    return this;
  }

  /**
   * Gets or sets the content of the aggregationFlags element in the urn:schemas-sonycom:av namespace.
   * @return sonyAggregationFlags
  */
  
  @Schema(name = "SonyAggregationFlags", description = "Gets or sets the content of the aggregationFlags element in the urn:schemas-sonycom:av namespace.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SonyAggregationFlags")
  public JsonNullable<String> getSonyAggregationFlags() {
    return sonyAggregationFlags;
  }

  public void setSonyAggregationFlags(JsonNullable<String> sonyAggregationFlags) {
    this.sonyAggregationFlags = sonyAggregationFlags;
  }

  public DeviceProfile subtitleProfiles(List<@Valid SubtitleProfile> subtitleProfiles) {
    this.subtitleProfiles = JsonNullable.of(subtitleProfiles);
    return this;
  }

  public DeviceProfile addSubtitleProfilesItem(SubtitleProfile subtitleProfilesItem) {
    if (this.subtitleProfiles == null || !this.subtitleProfiles.isPresent()) {
      this.subtitleProfiles = JsonNullable.of(new ArrayList<>());
    }
    this.subtitleProfiles.get().add(subtitleProfilesItem);
    return this;
  }

  /**
   * Gets or sets the SubtitleProfiles.
   * @return subtitleProfiles
  */
  @Valid 
  @Schema(name = "SubtitleProfiles", description = "Gets or sets the SubtitleProfiles.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SubtitleProfiles")
  public JsonNullable<List<@Valid SubtitleProfile>> getSubtitleProfiles() {
    return subtitleProfiles;
  }

  public void setSubtitleProfiles(JsonNullable<List<@Valid SubtitleProfile>> subtitleProfiles) {
    this.subtitleProfiles = subtitleProfiles;
  }

  public DeviceProfile supportedMediaTypes(String supportedMediaTypes) {
    this.supportedMediaTypes = JsonNullable.of(supportedMediaTypes);
    return this;
  }

  /**
   * Gets or sets the SupportedMediaTypes.
   * @return supportedMediaTypes
  */
  
  @Schema(name = "SupportedMediaTypes", description = "Gets or sets the SupportedMediaTypes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportedMediaTypes")
  public JsonNullable<String> getSupportedMediaTypes() {
    return supportedMediaTypes;
  }

  public void setSupportedMediaTypes(JsonNullable<String> supportedMediaTypes) {
    this.supportedMediaTypes = supportedMediaTypes;
  }

  public DeviceProfile timelineOffsetSeconds(Integer timelineOffsetSeconds) {
    this.timelineOffsetSeconds = timelineOffsetSeconds;
    return this;
  }

  /**
   * Gets or sets the TimelineOffsetSeconds.
   * @return timelineOffsetSeconds
  */
  
  @Schema(name = "TimelineOffsetSeconds", description = "Gets or sets the TimelineOffsetSeconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TimelineOffsetSeconds")
  public Integer getTimelineOffsetSeconds() {
    return timelineOffsetSeconds;
  }

  public void setTimelineOffsetSeconds(Integer timelineOffsetSeconds) {
    this.timelineOffsetSeconds = timelineOffsetSeconds;
  }

  public DeviceProfile transcodingProfiles(List<@Valid TranscodingProfile> transcodingProfiles) {
    this.transcodingProfiles = JsonNullable.of(transcodingProfiles);
    return this;
  }

  public DeviceProfile addTranscodingProfilesItem(TranscodingProfile transcodingProfilesItem) {
    if (this.transcodingProfiles == null || !this.transcodingProfiles.isPresent()) {
      this.transcodingProfiles = JsonNullable.of(new ArrayList<>());
    }
    this.transcodingProfiles.get().add(transcodingProfilesItem);
    return this;
  }

  /**
   * Gets or sets the transcoding profiles.
   * @return transcodingProfiles
  */
  @Valid 
  @Schema(name = "TranscodingProfiles", description = "Gets or sets the transcoding profiles.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TranscodingProfiles")
  public JsonNullable<List<@Valid TranscodingProfile>> getTranscodingProfiles() {
    return transcodingProfiles;
  }

  public void setTranscodingProfiles(JsonNullable<List<@Valid TranscodingProfile>> transcodingProfiles) {
    this.transcodingProfiles = transcodingProfiles;
  }

  public DeviceProfile userId(String userId) {
    this.userId = JsonNullable.of(userId);
    return this;
  }

  /**
   * Gets or sets the UserId.
   * @return userId
  */
  
  @Schema(name = "UserId", description = "Gets or sets the UserId.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserId")
  public JsonNullable<String> getUserId() {
    return userId;
  }

  public void setUserId(JsonNullable<String> userId) {
    this.userId = userId;
  }

  public DeviceProfile xmlRootAttributes(List<@Valid XmlAttribute> xmlRootAttributes) {
    this.xmlRootAttributes = JsonNullable.of(xmlRootAttributes);
    return this;
  }

  public DeviceProfile addXmlRootAttributesItem(XmlAttribute xmlRootAttributesItem) {
    if (this.xmlRootAttributes == null || !this.xmlRootAttributes.isPresent()) {
      this.xmlRootAttributes = JsonNullable.of(new ArrayList<>());
    }
    this.xmlRootAttributes.get().add(xmlRootAttributesItem);
    return this;
  }

  /**
   * Gets or sets the XmlRootAttributes.
   * @return xmlRootAttributes
  */
  @Valid 
  @Schema(name = "XmlRootAttributes", description = "Gets or sets the XmlRootAttributes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("XmlRootAttributes")
  public JsonNullable<List<@Valid XmlAttribute>> getXmlRootAttributes() {
    return xmlRootAttributes;
  }

  public void setXmlRootAttributes(JsonNullable<List<@Valid XmlAttribute>> xmlRootAttributes) {
    this.xmlRootAttributes = xmlRootAttributes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceProfile deviceProfile = (DeviceProfile) o;
    return equalsNullable(this.albumArtPn, deviceProfile.albumArtPn) &&
        equalsNullable(this.codecProfiles, deviceProfile.codecProfiles) &&
        equalsNullable(this.containerProfiles, deviceProfile.containerProfiles) &&
        equalsNullable(this.directPlayProfiles, deviceProfile.directPlayProfiles) &&
        Objects.equals(this.enableAlbumArtInDidl, deviceProfile.enableAlbumArtInDidl) &&
        Objects.equals(this.enableMSMediaReceiverRegistrar, deviceProfile.enableMSMediaReceiverRegistrar) &&
        Objects.equals(this.enableSingleAlbumArtLimit, deviceProfile.enableSingleAlbumArtLimit) &&
        Objects.equals(this.enableSingleSubtitleLimit, deviceProfile.enableSingleSubtitleLimit) &&
        equalsNullable(this.friendlyName, deviceProfile.friendlyName) &&
        equalsNullable(this.id, deviceProfile.id) &&
        Objects.equals(this.identification, deviceProfile.identification) &&
        Objects.equals(this.ignoreTranscodeByteRangeRequests, deviceProfile.ignoreTranscodeByteRangeRequests) &&
        equalsNullable(this.manufacturer, deviceProfile.manufacturer) &&
        equalsNullable(this.manufacturerUrl, deviceProfile.manufacturerUrl) &&
        Objects.equals(this.maxAlbumArtHeight, deviceProfile.maxAlbumArtHeight) &&
        Objects.equals(this.maxAlbumArtWidth, deviceProfile.maxAlbumArtWidth) &&
        equalsNullable(this.maxIconHeight, deviceProfile.maxIconHeight) &&
        equalsNullable(this.maxIconWidth, deviceProfile.maxIconWidth) &&
        equalsNullable(this.maxStaticBitrate, deviceProfile.maxStaticBitrate) &&
        equalsNullable(this.maxStaticMusicBitrate, deviceProfile.maxStaticMusicBitrate) &&
        equalsNullable(this.maxStreamingBitrate, deviceProfile.maxStreamingBitrate) &&
        equalsNullable(this.modelDescription, deviceProfile.modelDescription) &&
        equalsNullable(this.modelName, deviceProfile.modelName) &&
        equalsNullable(this.modelNumber, deviceProfile.modelNumber) &&
        equalsNullable(this.modelUrl, deviceProfile.modelUrl) &&
        equalsNullable(this.musicStreamingTranscodingBitrate, deviceProfile.musicStreamingTranscodingBitrate) &&
        equalsNullable(this.name, deviceProfile.name) &&
        equalsNullable(this.protocolInfo, deviceProfile.protocolInfo) &&
        Objects.equals(this.requiresPlainFolders, deviceProfile.requiresPlainFolders) &&
        Objects.equals(this.requiresPlainVideoItems, deviceProfile.requiresPlainVideoItems) &&
        equalsNullable(this.responseProfiles, deviceProfile.responseProfiles) &&
        equalsNullable(this.serialNumber, deviceProfile.serialNumber) &&
        equalsNullable(this.sonyAggregationFlags, deviceProfile.sonyAggregationFlags) &&
        equalsNullable(this.subtitleProfiles, deviceProfile.subtitleProfiles) &&
        equalsNullable(this.supportedMediaTypes, deviceProfile.supportedMediaTypes) &&
        Objects.equals(this.timelineOffsetSeconds, deviceProfile.timelineOffsetSeconds) &&
        equalsNullable(this.transcodingProfiles, deviceProfile.transcodingProfiles) &&
        equalsNullable(this.userId, deviceProfile.userId) &&
        equalsNullable(this.xmlRootAttributes, deviceProfile.xmlRootAttributes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(albumArtPn), hashCodeNullable(codecProfiles), hashCodeNullable(containerProfiles), hashCodeNullable(directPlayProfiles), enableAlbumArtInDidl, enableMSMediaReceiverRegistrar, enableSingleAlbumArtLimit, enableSingleSubtitleLimit, hashCodeNullable(friendlyName), hashCodeNullable(id), identification, ignoreTranscodeByteRangeRequests, hashCodeNullable(manufacturer), hashCodeNullable(manufacturerUrl), maxAlbumArtHeight, maxAlbumArtWidth, hashCodeNullable(maxIconHeight), hashCodeNullable(maxIconWidth), hashCodeNullable(maxStaticBitrate), hashCodeNullable(maxStaticMusicBitrate), hashCodeNullable(maxStreamingBitrate), hashCodeNullable(modelDescription), hashCodeNullable(modelName), hashCodeNullable(modelNumber), hashCodeNullable(modelUrl), hashCodeNullable(musicStreamingTranscodingBitrate), hashCodeNullable(name), hashCodeNullable(protocolInfo), requiresPlainFolders, requiresPlainVideoItems, hashCodeNullable(responseProfiles), hashCodeNullable(serialNumber), hashCodeNullable(sonyAggregationFlags), hashCodeNullable(subtitleProfiles), hashCodeNullable(supportedMediaTypes), timelineOffsetSeconds, hashCodeNullable(transcodingProfiles), hashCodeNullable(userId), hashCodeNullable(xmlRootAttributes));
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
    sb.append("class DeviceProfile {\n");
    sb.append("    albumArtPn: ").append(toIndentedString(albumArtPn)).append("\n");
    sb.append("    codecProfiles: ").append(toIndentedString(codecProfiles)).append("\n");
    sb.append("    containerProfiles: ").append(toIndentedString(containerProfiles)).append("\n");
    sb.append("    directPlayProfiles: ").append(toIndentedString(directPlayProfiles)).append("\n");
    sb.append("    enableAlbumArtInDidl: ").append(toIndentedString(enableAlbumArtInDidl)).append("\n");
    sb.append("    enableMSMediaReceiverRegistrar: ").append(toIndentedString(enableMSMediaReceiverRegistrar)).append("\n");
    sb.append("    enableSingleAlbumArtLimit: ").append(toIndentedString(enableSingleAlbumArtLimit)).append("\n");
    sb.append("    enableSingleSubtitleLimit: ").append(toIndentedString(enableSingleSubtitleLimit)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    ignoreTranscodeByteRangeRequests: ").append(toIndentedString(ignoreTranscodeByteRangeRequests)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    manufacturerUrl: ").append(toIndentedString(manufacturerUrl)).append("\n");
    sb.append("    maxAlbumArtHeight: ").append(toIndentedString(maxAlbumArtHeight)).append("\n");
    sb.append("    maxAlbumArtWidth: ").append(toIndentedString(maxAlbumArtWidth)).append("\n");
    sb.append("    maxIconHeight: ").append(toIndentedString(maxIconHeight)).append("\n");
    sb.append("    maxIconWidth: ").append(toIndentedString(maxIconWidth)).append("\n");
    sb.append("    maxStaticBitrate: ").append(toIndentedString(maxStaticBitrate)).append("\n");
    sb.append("    maxStaticMusicBitrate: ").append(toIndentedString(maxStaticMusicBitrate)).append("\n");
    sb.append("    maxStreamingBitrate: ").append(toIndentedString(maxStreamingBitrate)).append("\n");
    sb.append("    modelDescription: ").append(toIndentedString(modelDescription)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelNumber: ").append(toIndentedString(modelNumber)).append("\n");
    sb.append("    modelUrl: ").append(toIndentedString(modelUrl)).append("\n");
    sb.append("    musicStreamingTranscodingBitrate: ").append(toIndentedString(musicStreamingTranscodingBitrate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocolInfo: ").append(toIndentedString(protocolInfo)).append("\n");
    sb.append("    requiresPlainFolders: ").append(toIndentedString(requiresPlainFolders)).append("\n");
    sb.append("    requiresPlainVideoItems: ").append(toIndentedString(requiresPlainVideoItems)).append("\n");
    sb.append("    responseProfiles: ").append(toIndentedString(responseProfiles)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    sonyAggregationFlags: ").append(toIndentedString(sonyAggregationFlags)).append("\n");
    sb.append("    subtitleProfiles: ").append(toIndentedString(subtitleProfiles)).append("\n");
    sb.append("    supportedMediaTypes: ").append(toIndentedString(supportedMediaTypes)).append("\n");
    sb.append("    timelineOffsetSeconds: ").append(toIndentedString(timelineOffsetSeconds)).append("\n");
    sb.append("    transcodingProfiles: ").append(toIndentedString(transcodingProfiles)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    xmlRootAttributes: ").append(toIndentedString(xmlRootAttributes)).append("\n");
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

