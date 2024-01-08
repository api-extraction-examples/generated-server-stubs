package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LiveTvServiceStatus;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class ServiceInfo.
 */

@Schema(name = "LiveTvServiceInfo", description = "Class ServiceInfo.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class LiveTvServiceInfo {

  private Boolean hasUpdateAvailable;

  private JsonNullable<String> homePageUrl = JsonNullable.<String>undefined();

  private Boolean isVisible;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private LiveTvServiceStatus status;

  private JsonNullable<String> statusMessage = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> tuners = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> version = JsonNullable.<String>undefined();

  public LiveTvServiceInfo hasUpdateAvailable(Boolean hasUpdateAvailable) {
    this.hasUpdateAvailable = hasUpdateAvailable;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance has update available.
   * @return hasUpdateAvailable
  */
  
  @Schema(name = "HasUpdateAvailable", description = "Gets or sets a value indicating whether this instance has update available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HasUpdateAvailable")
  public Boolean getHasUpdateAvailable() {
    return hasUpdateAvailable;
  }

  public void setHasUpdateAvailable(Boolean hasUpdateAvailable) {
    this.hasUpdateAvailable = hasUpdateAvailable;
  }

  public LiveTvServiceInfo homePageUrl(String homePageUrl) {
    this.homePageUrl = JsonNullable.of(homePageUrl);
    return this;
  }

  /**
   * Gets or sets the home page URL.
   * @return homePageUrl
  */
  
  @Schema(name = "HomePageUrl", description = "Gets or sets the home page URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HomePageUrl")
  public JsonNullable<String> getHomePageUrl() {
    return homePageUrl;
  }

  public void setHomePageUrl(JsonNullable<String> homePageUrl) {
    this.homePageUrl = homePageUrl;
  }

  public LiveTvServiceInfo isVisible(Boolean isVisible) {
    this.isVisible = isVisible;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is visible.
   * @return isVisible
  */
  
  @Schema(name = "IsVisible", description = "Gets or sets a value indicating whether this instance is visible.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsVisible")
  public Boolean getIsVisible() {
    return isVisible;
  }

  public void setIsVisible(Boolean isVisible) {
    this.isVisible = isVisible;
  }

  public LiveTvServiceInfo name(String name) {
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

  public LiveTvServiceInfo status(LiveTvServiceStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Status")
  public LiveTvServiceStatus getStatus() {
    return status;
  }

  public void setStatus(LiveTvServiceStatus status) {
    this.status = status;
  }

  public LiveTvServiceInfo statusMessage(String statusMessage) {
    this.statusMessage = JsonNullable.of(statusMessage);
    return this;
  }

  /**
   * Gets or sets the status message.
   * @return statusMessage
  */
  
  @Schema(name = "StatusMessage", description = "Gets or sets the status message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatusMessage")
  public JsonNullable<String> getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(JsonNullable<String> statusMessage) {
    this.statusMessage = statusMessage;
  }

  public LiveTvServiceInfo tuners(List<String> tuners) {
    this.tuners = JsonNullable.of(tuners);
    return this;
  }

  public LiveTvServiceInfo addTunersItem(String tunersItem) {
    if (this.tuners == null || !this.tuners.isPresent()) {
      this.tuners = JsonNullable.of(new ArrayList<>());
    }
    this.tuners.get().add(tunersItem);
    return this;
  }

  /**
   * Get tuners
   * @return tuners
  */
  
  @Schema(name = "Tuners", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Tuners")
  public JsonNullable<List<String>> getTuners() {
    return tuners;
  }

  public void setTuners(JsonNullable<List<String>> tuners) {
    this.tuners = tuners;
  }

  public LiveTvServiceInfo version(String version) {
    this.version = JsonNullable.of(version);
    return this;
  }

  /**
   * Gets or sets the version.
   * @return version
  */
  
  @Schema(name = "Version", description = "Gets or sets the version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Version")
  public JsonNullable<String> getVersion() {
    return version;
  }

  public void setVersion(JsonNullable<String> version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveTvServiceInfo liveTvServiceInfo = (LiveTvServiceInfo) o;
    return Objects.equals(this.hasUpdateAvailable, liveTvServiceInfo.hasUpdateAvailable) &&
        equalsNullable(this.homePageUrl, liveTvServiceInfo.homePageUrl) &&
        Objects.equals(this.isVisible, liveTvServiceInfo.isVisible) &&
        equalsNullable(this.name, liveTvServiceInfo.name) &&
        Objects.equals(this.status, liveTvServiceInfo.status) &&
        equalsNullable(this.statusMessage, liveTvServiceInfo.statusMessage) &&
        equalsNullable(this.tuners, liveTvServiceInfo.tuners) &&
        equalsNullable(this.version, liveTvServiceInfo.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasUpdateAvailable, hashCodeNullable(homePageUrl), isVisible, hashCodeNullable(name), status, hashCodeNullable(statusMessage), hashCodeNullable(tuners), hashCodeNullable(version));
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
    sb.append("class LiveTvServiceInfo {\n");
    sb.append("    hasUpdateAvailable: ").append(toIndentedString(hasUpdateAvailable)).append("\n");
    sb.append("    homePageUrl: ").append(toIndentedString(homePageUrl)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    tuners: ").append(toIndentedString(tuners)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

