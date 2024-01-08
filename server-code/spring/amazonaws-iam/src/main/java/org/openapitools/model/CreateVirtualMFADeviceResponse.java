package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CreateVirtualMFADeviceResponseVirtualMFADevice;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;CreateVirtualMFADevice&lt;/a&gt; request. 
 */

@Schema(name = "CreateVirtualMFADeviceResponse", description = "Contains the response to a successful <a>CreateVirtualMFADevice</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreateVirtualMFADeviceResponse {

  private CreateVirtualMFADeviceResponseVirtualMFADevice virtualMFADevice;

  public CreateVirtualMFADeviceResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateVirtualMFADeviceResponse(CreateVirtualMFADeviceResponseVirtualMFADevice virtualMFADevice) {
    this.virtualMFADevice = virtualMFADevice;
  }

  public CreateVirtualMFADeviceResponse virtualMFADevice(CreateVirtualMFADeviceResponseVirtualMFADevice virtualMFADevice) {
    this.virtualMFADevice = virtualMFADevice;
    return this;
  }

  /**
   * Get virtualMFADevice
   * @return virtualMFADevice
  */
  @NotNull @Valid 
  @Schema(name = "VirtualMFADevice", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("VirtualMFADevice")
  public CreateVirtualMFADeviceResponseVirtualMFADevice getVirtualMFADevice() {
    return virtualMFADevice;
  }

  public void setVirtualMFADevice(CreateVirtualMFADeviceResponseVirtualMFADevice virtualMFADevice) {
    this.virtualMFADevice = virtualMFADevice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVirtualMFADeviceResponse createVirtualMFADeviceResponse = (CreateVirtualMFADeviceResponse) o;
    return Objects.equals(this.virtualMFADevice, createVirtualMFADeviceResponse.virtualMFADevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(virtualMFADevice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVirtualMFADeviceResponse {\n");
    sb.append("    virtualMFADevice: ").append(toIndentedString(virtualMFADevice)).append("\n");
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

