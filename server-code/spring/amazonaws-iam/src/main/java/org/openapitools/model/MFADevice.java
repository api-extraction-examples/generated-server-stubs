package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;Contains information about an MFA device.&lt;/p&gt; &lt;p&gt;This data type is used as a response element in the &lt;a&gt;ListMFADevices&lt;/a&gt; operation.&lt;/p&gt;
 */

@Schema(name = "MFADevice", description = "<p>Contains information about an MFA device.</p> <p>This data type is used as a response element in the <a>ListMFADevices</a> operation.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class MFADevice {

  private String userName;

  private String serialNumber;

  private OffsetDateTime enableDate;

  public MFADevice() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MFADevice(String userName, String serialNumber, OffsetDateTime enableDate) {
    this.userName = userName;
    this.serialNumber = serialNumber;
    this.enableDate = enableDate;
  }

  public MFADevice userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  */
  @NotNull 
  @Schema(name = "UserName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("UserName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public MFADevice serialNumber(String serialNumber) {
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

  public MFADevice enableDate(OffsetDateTime enableDate) {
    this.enableDate = enableDate;
    return this;
  }

  /**
   * Get enableDate
   * @return enableDate
  */
  @NotNull @Valid 
  @Schema(name = "EnableDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("EnableDate")
  public OffsetDateTime getEnableDate() {
    return enableDate;
  }

  public void setEnableDate(OffsetDateTime enableDate) {
    this.enableDate = enableDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MFADevice mfADevice = (MFADevice) o;
    return Objects.equals(this.userName, mfADevice.userName) &&
        Objects.equals(this.serialNumber, mfADevice.serialNumber) &&
        Objects.equals(this.enableDate, mfADevice.enableDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, serialNumber, enableDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MFADevice {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    enableDate: ").append(toIndentedString(enableDate)).append("\n");
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

