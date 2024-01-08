package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import org.openapitools.model.VirtualMFADeviceUser;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateVirtualMFADeviceResponseVirtualMFADevice
 */

@JsonTypeName("CreateVirtualMFADeviceResponse_VirtualMFADevice")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreateVirtualMFADeviceResponseVirtualMFADevice {

  private String serialNumber;

  private String base32StringSeed;

  private String qrCodePNG;

  private VirtualMFADeviceUser user;

  private OffsetDateTime enableDate;

  private List tags;

  public CreateVirtualMFADeviceResponseVirtualMFADevice() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateVirtualMFADeviceResponseVirtualMFADevice(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public CreateVirtualMFADeviceResponseVirtualMFADevice serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
  */
  @NotNull 
  @Schema(name = "SerialNumber", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SerialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public CreateVirtualMFADeviceResponseVirtualMFADevice base32StringSeed(String base32StringSeed) {
    this.base32StringSeed = base32StringSeed;
    return this;
  }

  /**
   * Get base32StringSeed
   * @return base32StringSeed
  */
  
  @Schema(name = "Base32StringSeed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Base32StringSeed")
  public String getBase32StringSeed() {
    return base32StringSeed;
  }

  public void setBase32StringSeed(String base32StringSeed) {
    this.base32StringSeed = base32StringSeed;
  }

  public CreateVirtualMFADeviceResponseVirtualMFADevice qrCodePNG(String qrCodePNG) {
    this.qrCodePNG = qrCodePNG;
    return this;
  }

  /**
   * Get qrCodePNG
   * @return qrCodePNG
  */
  
  @Schema(name = "QRCodePNG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("QRCodePNG")
  public String getQrCodePNG() {
    return qrCodePNG;
  }

  public void setQrCodePNG(String qrCodePNG) {
    this.qrCodePNG = qrCodePNG;
  }

  public CreateVirtualMFADeviceResponseVirtualMFADevice user(VirtualMFADeviceUser user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @Valid 
  @Schema(name = "User", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("User")
  public VirtualMFADeviceUser getUser() {
    return user;
  }

  public void setUser(VirtualMFADeviceUser user) {
    this.user = user;
  }

  public CreateVirtualMFADeviceResponseVirtualMFADevice enableDate(OffsetDateTime enableDate) {
    this.enableDate = enableDate;
    return this;
  }

  /**
   * Get enableDate
   * @return enableDate
  */
  @Valid 
  @Schema(name = "EnableDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableDate")
  public OffsetDateTime getEnableDate() {
    return enableDate;
  }

  public void setEnableDate(OffsetDateTime enableDate) {
    this.enableDate = enableDate;
  }

  public CreateVirtualMFADeviceResponseVirtualMFADevice tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @Valid 
  @Schema(name = "Tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Tags")
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVirtualMFADeviceResponseVirtualMFADevice createVirtualMFADeviceResponseVirtualMFADevice = (CreateVirtualMFADeviceResponseVirtualMFADevice) o;
    return Objects.equals(this.serialNumber, createVirtualMFADeviceResponseVirtualMFADevice.serialNumber) &&
        Objects.equals(this.base32StringSeed, createVirtualMFADeviceResponseVirtualMFADevice.base32StringSeed) &&
        Objects.equals(this.qrCodePNG, createVirtualMFADeviceResponseVirtualMFADevice.qrCodePNG) &&
        Objects.equals(this.user, createVirtualMFADeviceResponseVirtualMFADevice.user) &&
        Objects.equals(this.enableDate, createVirtualMFADeviceResponseVirtualMFADevice.enableDate) &&
        Objects.equals(this.tags, createVirtualMFADeviceResponseVirtualMFADevice.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serialNumber, base32StringSeed, qrCodePNG, user, enableDate, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVirtualMFADeviceResponseVirtualMFADevice {\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    base32StringSeed: ").append(toIndentedString(base32StringSeed)).append("\n");
    sb.append("    qrCodePNG: ").append(toIndentedString(qrCodePNG)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    enableDate: ").append(toIndentedString(enableDate)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

