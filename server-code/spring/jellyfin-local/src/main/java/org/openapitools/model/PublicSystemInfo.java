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
 * PublicSystemInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class PublicSystemInfo {

  private JsonNullable<String> id = JsonNullable.<String>undefined();

  private JsonNullable<String> localAddress = JsonNullable.<String>undefined();

  private JsonNullable<String> operatingSystem = JsonNullable.<String>undefined();

  private JsonNullable<String> productName = JsonNullable.<String>undefined();

  private JsonNullable<String> serverName = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> startupWizardCompleted = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> version = JsonNullable.<String>undefined();

  public PublicSystemInfo id(String id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Gets or sets the id.
   * @return id
  */
  
  @Schema(name = "Id", description = "Gets or sets the id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public JsonNullable<String> getId() {
    return id;
  }

  public void setId(JsonNullable<String> id) {
    this.id = id;
  }

  public PublicSystemInfo localAddress(String localAddress) {
    this.localAddress = JsonNullable.of(localAddress);
    return this;
  }

  /**
   * Gets or sets the local address.
   * @return localAddress
  */
  
  @Schema(name = "LocalAddress", description = "Gets or sets the local address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LocalAddress")
  public JsonNullable<String> getLocalAddress() {
    return localAddress;
  }

  public void setLocalAddress(JsonNullable<String> localAddress) {
    this.localAddress = localAddress;
  }

  public PublicSystemInfo operatingSystem(String operatingSystem) {
    this.operatingSystem = JsonNullable.of(operatingSystem);
    return this;
  }

  /**
   * Gets or sets the operating system.
   * @return operatingSystem
  */
  
  @Schema(name = "OperatingSystem", description = "Gets or sets the operating system.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OperatingSystem")
  public JsonNullable<String> getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(JsonNullable<String> operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public PublicSystemInfo productName(String productName) {
    this.productName = JsonNullable.of(productName);
    return this;
  }

  /**
   * Gets or sets the product name. This is the AssemblyProduct name.
   * @return productName
  */
  
  @Schema(name = "ProductName", description = "Gets or sets the product name. This is the AssemblyProduct name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProductName")
  public JsonNullable<String> getProductName() {
    return productName;
  }

  public void setProductName(JsonNullable<String> productName) {
    this.productName = productName;
  }

  public PublicSystemInfo serverName(String serverName) {
    this.serverName = JsonNullable.of(serverName);
    return this;
  }

  /**
   * Gets or sets the name of the server.
   * @return serverName
  */
  
  @Schema(name = "ServerName", description = "Gets or sets the name of the server.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServerName")
  public JsonNullable<String> getServerName() {
    return serverName;
  }

  public void setServerName(JsonNullable<String> serverName) {
    this.serverName = serverName;
  }

  public PublicSystemInfo startupWizardCompleted(Boolean startupWizardCompleted) {
    this.startupWizardCompleted = JsonNullable.of(startupWizardCompleted);
    return this;
  }

  /**
   * Gets or sets a value indicating whether the startup wizard is completed.
   * @return startupWizardCompleted
  */
  
  @Schema(name = "StartupWizardCompleted", description = "Gets or sets a value indicating whether the startup wizard is completed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartupWizardCompleted")
  public JsonNullable<Boolean> getStartupWizardCompleted() {
    return startupWizardCompleted;
  }

  public void setStartupWizardCompleted(JsonNullable<Boolean> startupWizardCompleted) {
    this.startupWizardCompleted = startupWizardCompleted;
  }

  public PublicSystemInfo version(String version) {
    this.version = JsonNullable.of(version);
    return this;
  }

  /**
   * Gets or sets the server version.
   * @return version
  */
  
  @Schema(name = "Version", description = "Gets or sets the server version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PublicSystemInfo publicSystemInfo = (PublicSystemInfo) o;
    return equalsNullable(this.id, publicSystemInfo.id) &&
        equalsNullable(this.localAddress, publicSystemInfo.localAddress) &&
        equalsNullable(this.operatingSystem, publicSystemInfo.operatingSystem) &&
        equalsNullable(this.productName, publicSystemInfo.productName) &&
        equalsNullable(this.serverName, publicSystemInfo.serverName) &&
        equalsNullable(this.startupWizardCompleted, publicSystemInfo.startupWizardCompleted) &&
        equalsNullable(this.version, publicSystemInfo.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(localAddress), hashCodeNullable(operatingSystem), hashCodeNullable(productName), hashCodeNullable(serverName), hashCodeNullable(startupWizardCompleted), hashCodeNullable(version));
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
    sb.append("class PublicSystemInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localAddress: ").append(toIndentedString(localAddress)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    startupWizardCompleted: ").append(toIndentedString(startupWizardCompleted)).append("\n");
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

