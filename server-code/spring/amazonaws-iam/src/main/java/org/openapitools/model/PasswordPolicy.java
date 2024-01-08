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
 * &lt;p&gt;Contains information about the account password policy.&lt;/p&gt; &lt;p&gt; This data type is used as a response element in the &lt;a&gt;GetAccountPasswordPolicy&lt;/a&gt; operation. &lt;/p&gt;
 */

@Schema(name = "PasswordPolicy", description = "<p>Contains information about the account password policy.</p> <p> This data type is used as a response element in the <a>GetAccountPasswordPolicy</a> operation. </p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class PasswordPolicy {

  private Integer minimumPasswordLength;

  private Boolean requireSymbols;

  private Boolean requireNumbers;

  private Boolean requireUppercaseCharacters;

  private Boolean requireLowercaseCharacters;

  private Boolean allowUsersToChangePassword;

  private Boolean expirePasswords;

  private Integer maxPasswordAge;

  private Integer passwordReusePrevention;

  private Boolean hardExpiry;

  public PasswordPolicy minimumPasswordLength(Integer minimumPasswordLength) {
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

  public PasswordPolicy requireSymbols(Boolean requireSymbols) {
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

  public PasswordPolicy requireNumbers(Boolean requireNumbers) {
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

  public PasswordPolicy requireUppercaseCharacters(Boolean requireUppercaseCharacters) {
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

  public PasswordPolicy requireLowercaseCharacters(Boolean requireLowercaseCharacters) {
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

  public PasswordPolicy allowUsersToChangePassword(Boolean allowUsersToChangePassword) {
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

  public PasswordPolicy expirePasswords(Boolean expirePasswords) {
    this.expirePasswords = expirePasswords;
    return this;
  }

  /**
   * Get expirePasswords
   * @return expirePasswords
  */
  
  @Schema(name = "ExpirePasswords", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExpirePasswords")
  public Boolean getExpirePasswords() {
    return expirePasswords;
  }

  public void setExpirePasswords(Boolean expirePasswords) {
    this.expirePasswords = expirePasswords;
  }

  public PasswordPolicy maxPasswordAge(Integer maxPasswordAge) {
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

  public PasswordPolicy passwordReusePrevention(Integer passwordReusePrevention) {
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

  public PasswordPolicy hardExpiry(Boolean hardExpiry) {
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
    PasswordPolicy passwordPolicy = (PasswordPolicy) o;
    return Objects.equals(this.minimumPasswordLength, passwordPolicy.minimumPasswordLength) &&
        Objects.equals(this.requireSymbols, passwordPolicy.requireSymbols) &&
        Objects.equals(this.requireNumbers, passwordPolicy.requireNumbers) &&
        Objects.equals(this.requireUppercaseCharacters, passwordPolicy.requireUppercaseCharacters) &&
        Objects.equals(this.requireLowercaseCharacters, passwordPolicy.requireLowercaseCharacters) &&
        Objects.equals(this.allowUsersToChangePassword, passwordPolicy.allowUsersToChangePassword) &&
        Objects.equals(this.expirePasswords, passwordPolicy.expirePasswords) &&
        Objects.equals(this.maxPasswordAge, passwordPolicy.maxPasswordAge) &&
        Objects.equals(this.passwordReusePrevention, passwordPolicy.passwordReusePrevention) &&
        Objects.equals(this.hardExpiry, passwordPolicy.hardExpiry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumPasswordLength, requireSymbols, requireNumbers, requireUppercaseCharacters, requireLowercaseCharacters, allowUsersToChangePassword, expirePasswords, maxPasswordAge, passwordReusePrevention, hardExpiry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicy {\n");
    sb.append("    minimumPasswordLength: ").append(toIndentedString(minimumPasswordLength)).append("\n");
    sb.append("    requireSymbols: ").append(toIndentedString(requireSymbols)).append("\n");
    sb.append("    requireNumbers: ").append(toIndentedString(requireNumbers)).append("\n");
    sb.append("    requireUppercaseCharacters: ").append(toIndentedString(requireUppercaseCharacters)).append("\n");
    sb.append("    requireLowercaseCharacters: ").append(toIndentedString(requireLowercaseCharacters)).append("\n");
    sb.append("    allowUsersToChangePassword: ").append(toIndentedString(allowUsersToChangePassword)).append("\n");
    sb.append("    expirePasswords: ").append(toIndentedString(expirePasswords)).append("\n");
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

