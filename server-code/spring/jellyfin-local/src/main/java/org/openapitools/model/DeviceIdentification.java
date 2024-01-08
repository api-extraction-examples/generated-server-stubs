package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.HttpHeaderInfo;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DeviceIdentification
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class DeviceIdentification {

  private JsonNullable<String> friendlyName = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid HttpHeaderInfo>> headers = JsonNullable.<List<@Valid HttpHeaderInfo>>undefined();

  private JsonNullable<String> manufacturer = JsonNullable.<String>undefined();

  private JsonNullable<String> manufacturerUrl = JsonNullable.<String>undefined();

  private JsonNullable<String> modelDescription = JsonNullable.<String>undefined();

  private JsonNullable<String> modelName = JsonNullable.<String>undefined();

  private JsonNullable<String> modelNumber = JsonNullable.<String>undefined();

  private JsonNullable<String> modelUrl = JsonNullable.<String>undefined();

  private JsonNullable<String> serialNumber = JsonNullable.<String>undefined();

  public DeviceIdentification friendlyName(String friendlyName) {
    this.friendlyName = JsonNullable.of(friendlyName);
    return this;
  }

  /**
   * Gets or sets the name of the friendly.
   * @return friendlyName
  */
  
  @Schema(name = "FriendlyName", description = "Gets or sets the name of the friendly.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FriendlyName")
  public JsonNullable<String> getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(JsonNullable<String> friendlyName) {
    this.friendlyName = friendlyName;
  }

  public DeviceIdentification headers(List<@Valid HttpHeaderInfo> headers) {
    this.headers = JsonNullable.of(headers);
    return this;
  }

  public DeviceIdentification addHeadersItem(HttpHeaderInfo headersItem) {
    if (this.headers == null || !this.headers.isPresent()) {
      this.headers = JsonNullable.of(new ArrayList<>());
    }
    this.headers.get().add(headersItem);
    return this;
  }

  /**
   * Gets or sets the headers.
   * @return headers
  */
  @Valid 
  @Schema(name = "Headers", description = "Gets or sets the headers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Headers")
  public JsonNullable<List<@Valid HttpHeaderInfo>> getHeaders() {
    return headers;
  }

  public void setHeaders(JsonNullable<List<@Valid HttpHeaderInfo>> headers) {
    this.headers = headers;
  }

  public DeviceIdentification manufacturer(String manufacturer) {
    this.manufacturer = JsonNullable.of(manufacturer);
    return this;
  }

  /**
   * Gets or sets the manufacturer.
   * @return manufacturer
  */
  
  @Schema(name = "Manufacturer", description = "Gets or sets the manufacturer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Manufacturer")
  public JsonNullable<String> getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(JsonNullable<String> manufacturer) {
    this.manufacturer = manufacturer;
  }

  public DeviceIdentification manufacturerUrl(String manufacturerUrl) {
    this.manufacturerUrl = JsonNullable.of(manufacturerUrl);
    return this;
  }

  /**
   * Gets or sets the manufacturer URL.
   * @return manufacturerUrl
  */
  
  @Schema(name = "ManufacturerUrl", description = "Gets or sets the manufacturer URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ManufacturerUrl")
  public JsonNullable<String> getManufacturerUrl() {
    return manufacturerUrl;
  }

  public void setManufacturerUrl(JsonNullable<String> manufacturerUrl) {
    this.manufacturerUrl = manufacturerUrl;
  }

  public DeviceIdentification modelDescription(String modelDescription) {
    this.modelDescription = JsonNullable.of(modelDescription);
    return this;
  }

  /**
   * Gets or sets the model description.
   * @return modelDescription
  */
  
  @Schema(name = "ModelDescription", description = "Gets or sets the model description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ModelDescription")
  public JsonNullable<String> getModelDescription() {
    return modelDescription;
  }

  public void setModelDescription(JsonNullable<String> modelDescription) {
    this.modelDescription = modelDescription;
  }

  public DeviceIdentification modelName(String modelName) {
    this.modelName = JsonNullable.of(modelName);
    return this;
  }

  /**
   * Gets or sets the name of the model.
   * @return modelName
  */
  
  @Schema(name = "ModelName", description = "Gets or sets the name of the model.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ModelName")
  public JsonNullable<String> getModelName() {
    return modelName;
  }

  public void setModelName(JsonNullable<String> modelName) {
    this.modelName = modelName;
  }

  public DeviceIdentification modelNumber(String modelNumber) {
    this.modelNumber = JsonNullable.of(modelNumber);
    return this;
  }

  /**
   * Gets or sets the model number.
   * @return modelNumber
  */
  
  @Schema(name = "ModelNumber", description = "Gets or sets the model number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ModelNumber")
  public JsonNullable<String> getModelNumber() {
    return modelNumber;
  }

  public void setModelNumber(JsonNullable<String> modelNumber) {
    this.modelNumber = modelNumber;
  }

  public DeviceIdentification modelUrl(String modelUrl) {
    this.modelUrl = JsonNullable.of(modelUrl);
    return this;
  }

  /**
   * Gets or sets the model URL.
   * @return modelUrl
  */
  
  @Schema(name = "ModelUrl", description = "Gets or sets the model URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ModelUrl")
  public JsonNullable<String> getModelUrl() {
    return modelUrl;
  }

  public void setModelUrl(JsonNullable<String> modelUrl) {
    this.modelUrl = modelUrl;
  }

  public DeviceIdentification serialNumber(String serialNumber) {
    this.serialNumber = JsonNullable.of(serialNumber);
    return this;
  }

  /**
   * Gets or sets the serial number.
   * @return serialNumber
  */
  
  @Schema(name = "SerialNumber", description = "Gets or sets the serial number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SerialNumber")
  public JsonNullable<String> getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(JsonNullable<String> serialNumber) {
    this.serialNumber = serialNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceIdentification deviceIdentification = (DeviceIdentification) o;
    return equalsNullable(this.friendlyName, deviceIdentification.friendlyName) &&
        equalsNullable(this.headers, deviceIdentification.headers) &&
        equalsNullable(this.manufacturer, deviceIdentification.manufacturer) &&
        equalsNullable(this.manufacturerUrl, deviceIdentification.manufacturerUrl) &&
        equalsNullable(this.modelDescription, deviceIdentification.modelDescription) &&
        equalsNullable(this.modelName, deviceIdentification.modelName) &&
        equalsNullable(this.modelNumber, deviceIdentification.modelNumber) &&
        equalsNullable(this.modelUrl, deviceIdentification.modelUrl) &&
        equalsNullable(this.serialNumber, deviceIdentification.serialNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(friendlyName), hashCodeNullable(headers), hashCodeNullable(manufacturer), hashCodeNullable(manufacturerUrl), hashCodeNullable(modelDescription), hashCodeNullable(modelName), hashCodeNullable(modelNumber), hashCodeNullable(modelUrl), hashCodeNullable(serialNumber));
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
    sb.append("class DeviceIdentification {\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    manufacturerUrl: ").append(toIndentedString(manufacturerUrl)).append("\n");
    sb.append("    modelDescription: ").append(toIndentedString(modelDescription)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelNumber: ").append(toIndentedString(modelNumber)).append("\n");
    sb.append("    modelUrl: ").append(toIndentedString(modelUrl)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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

