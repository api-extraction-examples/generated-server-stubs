package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LiveTvServiceInfo;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LiveTvInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class LiveTvInfo {

  @Valid
  private JsonNullable<List<String>> enabledUsers = JsonNullable.<List<String>>undefined();

  private Boolean isEnabled;

  @Valid
  private JsonNullable<List<@Valid LiveTvServiceInfo>> services = JsonNullable.<List<@Valid LiveTvServiceInfo>>undefined();

  public LiveTvInfo enabledUsers(List<String> enabledUsers) {
    this.enabledUsers = JsonNullable.of(enabledUsers);
    return this;
  }

  public LiveTvInfo addEnabledUsersItem(String enabledUsersItem) {
    if (this.enabledUsers == null || !this.enabledUsers.isPresent()) {
      this.enabledUsers = JsonNullable.of(new ArrayList<>());
    }
    this.enabledUsers.get().add(enabledUsersItem);
    return this;
  }

  /**
   * Gets or sets the enabled users.
   * @return enabledUsers
  */
  
  @Schema(name = "EnabledUsers", description = "Gets or sets the enabled users.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnabledUsers")
  public JsonNullable<List<String>> getEnabledUsers() {
    return enabledUsers;
  }

  public void setEnabledUsers(JsonNullable<List<String>> enabledUsers) {
    this.enabledUsers = enabledUsers;
  }

  public LiveTvInfo isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is enabled.
   * @return isEnabled
  */
  
  @Schema(name = "IsEnabled", description = "Gets or sets a value indicating whether this instance is enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsEnabled")
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public LiveTvInfo services(List<@Valid LiveTvServiceInfo> services) {
    this.services = JsonNullable.of(services);
    return this;
  }

  public LiveTvInfo addServicesItem(LiveTvServiceInfo servicesItem) {
    if (this.services == null || !this.services.isPresent()) {
      this.services = JsonNullable.of(new ArrayList<>());
    }
    this.services.get().add(servicesItem);
    return this;
  }

  /**
   * Gets or sets the services.
   * @return services
  */
  @Valid 
  @Schema(name = "Services", description = "Gets or sets the services.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Services")
  public JsonNullable<List<@Valid LiveTvServiceInfo>> getServices() {
    return services;
  }

  public void setServices(JsonNullable<List<@Valid LiveTvServiceInfo>> services) {
    this.services = services;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveTvInfo liveTvInfo = (LiveTvInfo) o;
    return equalsNullable(this.enabledUsers, liveTvInfo.enabledUsers) &&
        Objects.equals(this.isEnabled, liveTvInfo.isEnabled) &&
        equalsNullable(this.services, liveTvInfo.services);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(enabledUsers), isEnabled, hashCodeNullable(services));
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
    sb.append("class LiveTvInfo {\n");
    sb.append("    enabledUsers: ").append(toIndentedString(enabledUsers)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

