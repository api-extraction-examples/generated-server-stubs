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
 * UpdateAccountPasswordPolicyRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UpdateAccountPasswordPolicyRequest {

  private Integer minimumPasswordLength;

  private Boolean requireSymbols;

  private Boolean requireNumbers;

  private Boolean requireUppercaseCharacters;

  private Boolean requireLowercaseCharacters;

  private Boolean allowUsersToChangePassword;

  private Integer maxPasswordAge;

  private Integer passwordReusePrevention;

  private Boolean hardExpiry;

  public UpdateAccountPasswordPolicyRequest minimumPasswordLength(Integer minimumPasswordLength) {
    this.minimumPasswordLength = minimumPasswordLength;
    return this;
  }

  /**
   * Get minimumPasswordLength
   * @return minimumPasswordLength
  */
  
  @Schema(name = "MinimumPasswordLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MinimumPasswordLength")
  public Integer getMinimumPasswordLength() {
    return minimumPasswordLength;
  }

  public void setMinimumPasswordLength(Integer minimumPasswordLength) {
    this.minimumPasswordLength = minimumPasswordLength;
  }

  public UpdateAccountPasswordPolicyRequest requireSymbols(Boolean requireSymbols) {
    this.requireSymbols = requireSymbols;
    return this;
  }

  /**
   * Get requireSymbols
   * @return requireSymbols
  */
  
  @Schema(name = "RequireSymbols", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RequireSymbols")
  public Boolean getRequireSymbols() {
    return requireSymbols;
  }

  public void setRequireSymbols(Boolean requireSymbols) {
    this.requireSymbols = requireSymbols;
  }

  public UpdateAccountPasswordPolicyRequest requireNumbers(Boolean requireNumbers) {
    this.requireNumbers = requireNumbers;
    return this;
  }

  /**
   * Get requireNumbers
   * @return requireNumbers
  */
  
  @Schema(name = "RequireNumbers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RequireNumbers")
  public Boolean getRequireNumbers() {
    return requireNumbers;
  }

  public void setRequireNumbers(Boolean requireNumbers) {
    this.requireNumbers = requireNumbers;
  }

  public UpdateAccountPasswordPolicyRequest requireUppercaseCharacters(Boolean requireUppercaseCharacters) {
    this.requireUppercaseCharacters = requireUppercaseCharacters;
    return this;
  }

  /**
   * Get requireUppercaseCharacters
   * @return requireUppercaseCharacters
  */
  
  @Schema(name = "RequireUppercaseCharacters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RequireUppercaseCharacters")
  public Boolean getRequireUppercaseCharacters() {
    return requireUppercaseCharacters;
  }

  public void setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
    this.requireUppercaseCharacters = requireUppercaseCharacters;
  }

  public UpdateAccountPasswordPolicyRequest requireLowercaseCharacters(Boolean requireLowercaseCharacters) {
    this.requireLowercaseCharacters = requireLowercaseCharacters;
    return this;
  }

  /**
   * Get requireLowercaseCharacters
   * @return requireLowercaseCharacters
  */
  
  @Schema(name = "RequireLowercaseCharacters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RequireLowercaseCharacters")
  public Boolean getRequireLowercaseCharacters() {
    return requireLowercaseCharacters;
  }

  public void setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
    this.requireLowercaseCharacters = requireLowercaseCharacters;
  }

  public UpdateAccountPasswordPolicyRequest allowUsersToChangePassword(Boolean allowUsersToChangePassword) {
    this.allowUsersToChangePassword = allowUsersToChangePassword;
    return this;
  }

  /**
   * Get allowUsersToChangePassword
   * @return allowUsersToChangePassword
  */
  
  @Schema(name = "AllowUsersToChangePassword", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AllowUsersToChangePassword")
  public Boolean getAllowUsersToChangePassword() {
    return allowUsersToChangePassword;
  }

  public void setAllowUsersToChangePassword(Boolean allowUsersToChangePassword) {
    this.allowUsersToChangePassword = allowUsersToChangePassword;
  }

  public UpdateAccountPasswordPolicyRequest maxPasswordAge(Integer maxPasswordAge) {
    this.maxPasswordAge = maxPasswordAge;
    return this;
  }

  /**
   * Get maxPasswordAge
   * @return maxPasswordAge
  */
  
  @Schema(name = "MaxPasswordAge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxPasswordAge")
  public Integer getMaxPasswordAge() {
    return maxPasswordAge;
  }

  public void setMaxPasswordAge(Integer maxPasswordAge) {
    this.maxPasswordAge = maxPasswordAge;
  }

  public UpdateAccountPasswordPolicyRequest passwordReusePrevention(Integer passwordReusePrevention) {
    this.passwordReusePrevention = passwordReusePrevention;
    return this;
  }

  /**
   * Get passwordReusePrevention
   * @return passwordReusePrevention
  */
  
  @Schema(name = "PasswordReusePrevention", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PasswordReusePrevention")
  public Integer getPasswordReusePrevention() {
    return passwordReusePrevention;
  }

  public void setPasswordReusePrevention(Integer passwordReusePrevention) {
    this.passwordReusePrevention = passwordReusePrevention;
  }

  public UpdateAccountPasswordPolicyRequest hardExpiry(Boolean hardExpiry) {
    this.hardExpiry = hardExpiry;
    return this;
  }

  /**
   * Get hardExpiry
   * @return hardExpiry
  */
  
  @Schema(name = "HardExpiry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HardExpiry")
  public Boolean getHardExpiry() {
    return hardExpiry;
  }

  public void setHardExpiry(Boolean hardExpiry) {
    this.hardExpiry = hardExpiry;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAccountPasswordPolicyRequest updateAccountPasswordPolicyRequest = (UpdateAccountPasswordPolicyRequest) o;
    return Objects.equals(this.minimumPasswordLength, updateAccountPasswordPolicyRequest.minimumPasswordLength) &&
        Objects.equals(this.requireSymbols, updateAccountPasswordPolicyRequest.requireSymbols) &&
        Objects.equals(this.requireNumbers, updateAccountPasswordPolicyRequest.requireNumbers) &&
        Objects.equals(this.requireUppercaseCharacters, updateAccountPasswordPolicyRequest.requireUppercaseCharacters) &&
        Objects.equals(this.requireLowercaseCharacters, updateAccountPasswordPolicyRequest.requireLowercaseCharacters) &&
        Objects.equals(this.allowUsersToChangePassword, updateAccountPasswordPolicyRequest.allowUsersToChangePassword) &&
        Objects.equals(this.maxPasswordAge, updateAccountPasswordPolicyRequest.maxPasswordAge) &&
        Objects.equals(this.passwordReusePrevention, updateAccountPasswordPolicyRequest.passwordReusePrevention) &&
        Objects.equals(this.hardExpiry, updateAccountPasswordPolicyRequest.hardExpiry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumPasswordLength, requireSymbols, requireNumbers, requireUppercaseCharacters, requireLowercaseCharacters, allowUsersToChangePassword, maxPasswordAge, passwordReusePrevention, hardExpiry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAccountPasswordPolicyRequest {\n");
    sb.append("    minimumPasswordLength: ").append(toIndentedString(minimumPasswordLength)).append("\n");
    sb.append("    requireSymbols: ").append(toIndentedString(requireSymbols)).append("\n");
    sb.append("    requireNumbers: ").append(toIndentedString(requireNumbers)).append("\n");
    sb.append("    requireUppercaseCharacters: ").append(toIndentedString(requireUppercaseCharacters)).append("\n");
    sb.append("    requireLowercaseCharacters: ").append(toIndentedString(requireLowercaseCharacters)).append("\n");
    sb.append("    allowUsersToChangePassword: ").append(toIndentedString(allowUsersToChangePassword)).append("\n");
    sb.append("    maxPasswordAge: ").append(toIndentedString(maxPasswordAge)).append("\n");
    sb.append("    passwordReusePrevention: ").append(toIndentedString(passwordReusePrevention)).append("\n");
    sb.append("    hardExpiry: ").append(toIndentedString(hardExpiry)).append("\n");
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

