package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TunerHostInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class TunerHostInfo {

  private Boolean allowHWTranscoding;

  private JsonNullable<String> deviceId = JsonNullable.<String>undefined();

  private Boolean enableStreamLooping;

  private JsonNullable<String> friendlyName = JsonNullable.<String>undefined();

  private JsonNullable<String> id = JsonNullable.<String>undefined();

  private Boolean importFavoritesOnly;

  private JsonNullable<String> source = JsonNullable.<String>undefined();

  private Integer tunerCount;

  private JsonNullable<String> type = JsonNullable.<String>undefined();

  private JsonNullable<String> url = JsonNullable.<String>undefined();

  private JsonNullable<String> userAgent = JsonNullable.<String>undefined();

  public TunerHostInfo allowHWTranscoding(Boolean allowHWTranscoding) {
    this.allowHWTranscoding = allowHWTranscoding;
    return this;
  }

  /**
   * Get allowHWTranscoding
   * @return allowHWTranscoding
  */
  
  @Schema(name = "AllowHWTranscoding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AllowHWTranscoding")
  public Boolean getAllowHWTranscoding() {
    return allowHWTranscoding;
  }

  public void setAllowHWTranscoding(Boolean allowHWTranscoding) {
    this.allowHWTranscoding = allowHWTranscoding;
  }

  public TunerHostInfo deviceId(String deviceId) {
    this.deviceId = JsonNullable.of(deviceId);
    return this;
  }

  /**
   * Get deviceId
   * @return deviceId
  */
  
  @Schema(name = "DeviceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeviceId")
  public JsonNullable<String> getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(JsonNullable<String> deviceId) {
    this.deviceId = deviceId;
  }

  public TunerHostInfo enableStreamLooping(Boolean enableStreamLooping) {
    this.enableStreamLooping = enableStreamLooping;
    return this;
  }

  /**
   * Get enableStreamLooping
   * @return enableStreamLooping
  */
  
  @Schema(name = "EnableStreamLooping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableStreamLooping")
  public Boolean getEnableStreamLooping() {
    return enableStreamLooping;
  }

  public void setEnableStreamLooping(Boolean enableStreamLooping) {
    this.enableStreamLooping = enableStreamLooping;
  }

  public TunerHostInfo friendlyName(String friendlyName) {
    this.friendlyName = JsonNullable.of(friendlyName);
    return this;
  }

  /**
   * Get friendlyName
   * @return friendlyName
  */
  
  @Schema(name = "FriendlyName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FriendlyName")
  public JsonNullable<String> getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(JsonNullable<String> friendlyName) {
    this.friendlyName = friendlyName;
  }

  public TunerHostInfo id(String id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "Id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public JsonNullable<String> getId() {
    return id;
  }

  public void setId(JsonNullable<String> id) {
    this.id = id;
  }

  public TunerHostInfo importFavoritesOnly(Boolean importFavoritesOnly) {
    this.importFavoritesOnly = importFavoritesOnly;
    return this;
  }

  /**
   * Get importFavoritesOnly
   * @return importFavoritesOnly
  */
  
  @Schema(name = "ImportFavoritesOnly", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImportFavoritesOnly")
  public Boolean getImportFavoritesOnly() {
    return importFavoritesOnly;
  }

  public void setImportFavoritesOnly(Boolean importFavoritesOnly) {
    this.importFavoritesOnly = importFavoritesOnly;
  }

  public TunerHostInfo source(String source) {
    this.source = JsonNullable.of(source);
    return this;
  }

  /**
   * Get source
   * @return source
  */
  
  @Schema(name = "Source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Source")
  public JsonNullable<String> getSource() {
    return source;
  }

  public void setSource(JsonNullable<String> source) {
    this.source = source;
  }

  public TunerHostInfo tunerCount(Integer tunerCount) {
    this.tunerCount = tunerCount;
    return this;
  }

  /**
   * Get tunerCount
   * @return tunerCount
  */
  
  @Schema(name = "TunerCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TunerCount")
  public Integer getTunerCount() {
    return tunerCount;
  }

  public void setTunerCount(Integer tunerCount) {
    this.tunerCount = tunerCount;
  }

  public TunerHostInfo type(String type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "Type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public JsonNullable<String> getType() {
    return type;
  }

  public void setType(JsonNullable<String> type) {
    this.type = type;
  }

  public TunerHostInfo url(String url) {
    this.url = JsonNullable.of(url);
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "Url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Url")
  public JsonNullable<String> getUrl() {
    return url;
  }

  public void setUrl(JsonNullable<String> url) {
    this.url = url;
  }

  public TunerHostInfo userAgent(String userAgent) {
    this.userAgent = JsonNullable.of(userAgent);
    return this;
  }

  /**
   * Get userAgent
   * @return userAgent
  */
  
  @Schema(name = "UserAgent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserAgent")
  public JsonNullable<String> getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(JsonNullable<String> userAgent) {
    this.userAgent = userAgent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TunerHostInfo tunerHostInfo = (TunerHostInfo) o;
    return Objects.equals(this.allowHWTranscoding, tunerHostInfo.allowHWTranscoding) &&
        equalsNullable(this.deviceId, tunerHostInfo.deviceId) &&
        Objects.equals(this.enableStreamLooping, tunerHostInfo.enableStreamLooping) &&
        equalsNullable(this.friendlyName, tunerHostInfo.friendlyName) &&
        equalsNullable(this.id, tunerHostInfo.id) &&
        Objects.equals(this.importFavoritesOnly, tunerHostInfo.importFavoritesOnly) &&
        equalsNullable(this.source, tunerHostInfo.source) &&
        Objects.equals(this.tunerCount, tunerHostInfo.tunerCount) &&
        equalsNullable(this.type, tunerHostInfo.type) &&
        equalsNullable(this.url, tunerHostInfo.url) &&
        equalsNullable(this.userAgent, tunerHostInfo.userAgent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowHWTranscoding, hashCodeNullable(deviceId), enableStreamLooping, hashCodeNullable(friendlyName), hashCodeNullable(id), importFavoritesOnly, hashCodeNullable(source), tunerCount, hashCodeNullable(type), hashCodeNullable(url), hashCodeNullable(userAgent));
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
    sb.append("class TunerHostInfo {\n");
    sb.append("    allowHWTranscoding: ").append(toIndentedString(allowHWTranscoding)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    enableStreamLooping: ").append(toIndentedString(enableStreamLooping)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    importFavoritesOnly: ").append(toIndentedString(importFavoritesOnly)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    tunerCount: ").append(toIndentedString(tunerCount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

