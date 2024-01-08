package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EnableMFADeviceRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class EnableMFADeviceRequest {

  private String userName;

  private String serialNumber;

  private String authenticationCode1;

  private String authenticationCode2;

  public EnableMFADeviceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EnableMFADeviceRequest(String userName, String serialNumber, String authenticationCode1, String authenticationCode2) {
    this.userName = userName;
    this.serialNumber = serialNumber;
    this.authenticationCode1 = authenticationCode1;
    this.authenticationCode2 = authenticationCode2;
  }

  public EnableMFADeviceRequest userName(String userName) {
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

  public EnableMFADeviceRequest serialNumber(String serialNumber) {
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

  public EnableMFADeviceRequest authenticationCode1(String authenticationCode1) {
    this.authenticationCode1 = authenticationCode1;
    return this;
  }

  /**
   * Get authenticationCode1
   * @return authenticationCode1
  */
  @NotNull 
  @Schema(name = "AuthenticationCode1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AuthenticationCode1")
  public String getAuthenticationCode1() {
    return authenticationCode1;
  }

  public void setAuthenticationCode1(String authenticationCode1) {
    this.authenticationCode1 = authenticationCode1;
  }

  public EnableMFADeviceRequest authenticationCode2(String authenticationCode2) {
    this.authenticationCode2 = authenticationCode2;
    return this;
  }

  /**
   * Get authenticationCode2
   * @return authenticationCode2
  */
  @NotNull 
  @Schema(name = "AuthenticationCode2", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AuthenticationCode2")
  public String getAuthenticationCode2() {
    return authenticationCode2;
  }

  public void setAuthenticationCode2(String authenticationCode2) {
    this.authenticationCode2 = authenticationCode2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnableMFADeviceRequest enableMFADeviceRequest = (EnableMFADeviceRequest) o;
    return Objects.equals(this.userName, enableMFADeviceRequest.userName) &&
        Objects.equals(this.serialNumber, enableMFADeviceRequest.serialNumber) &&
        Objects.equals(this.authenticationCode1, enableMFADeviceRequest.authenticationCode1) &&
        Objects.equals(this.authenticationCode2, enableMFADeviceRequest.authenticationCode2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, serialNumber, authenticationCode1, authenticationCode2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnableMFADeviceRequest {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    authenticationCode1: ").append(toIndentedString(authenticationCode1)).append("\n");
    sb.append("    authenticationCode2: ").append(toIndentedString(authenticationCode2)).append("\n");
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

