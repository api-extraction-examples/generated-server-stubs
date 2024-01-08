package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateLoginProfileResponseLoginProfile
 */

@JsonTypeName("CreateLoginProfileResponse_LoginProfile")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreateLoginProfileResponseLoginProfile {

  private String userName;

  private OffsetDateTime createDate;

  private Boolean passwordResetRequired;

  public CreateLoginProfileResponseLoginProfile() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateLoginProfileResponseLoginProfile(String userName, OffsetDateTime createDate) {
    this.userName = userName;
    this.createDate = createDate;
  }

  public CreateLoginProfileResponseLoginProfile userName(String userName) {
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

  public CreateLoginProfileResponseLoginProfile createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
  */
  @NotNull @Valid 
  @Schema(name = "CreateDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CreateDate")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public CreateLoginProfileResponseLoginProfile passwordResetRequired(Boolean passwordResetRequired) {
    this.passwordResetRequired = passwordResetRequired;
    return this;
  }

  /**
   * Get passwordResetRequired
   * @return passwordResetRequired
  */
  
  @Schema(name = "PasswordResetRequired", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PasswordResetRequired")
  public Boolean getPasswordResetRequired() {
    return passwordResetRequired;
  }

  public void setPasswordResetRequired(Boolean passwordResetRequired) {
    this.passwordResetRequired = passwordResetRequired;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLoginProfileResponseLoginProfile createLoginProfileResponseLoginProfile = (CreateLoginProfileResponseLoginProfile) o;
    return Objects.equals(this.userName, createLoginProfileResponseLoginProfile.userName) &&
        Objects.equals(this.createDate, createLoginProfileResponseLoginProfile.createDate) &&
        Objects.equals(this.passwordResetRequired, createLoginProfileResponseLoginProfile.passwordResetRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, createDate, passwordResetRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLoginProfileResponseLoginProfile {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    passwordResetRequired: ").append(toIndentedString(passwordResetRequired)).append("\n");
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

