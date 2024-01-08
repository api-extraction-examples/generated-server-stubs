package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UserRole;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserInvitationAttributes
 */

@JsonTypeName("UserInvitation_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class UserInvitationAttributes {

  private Boolean allAppsVisible;

  private String email;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expirationDate;

  private String firstName;

  private String lastName;

  private Boolean provisioningAllowed;

  @Valid
  private List<@Valid UserRole> roles;

  public UserInvitationAttributes allAppsVisible(Boolean allAppsVisible) {
    this.allAppsVisible = allAppsVisible;
    return this;
  }

  /**
   * Get allAppsVisible
   * @return allAppsVisible
  */
  
  @Schema(name = "allAppsVisible", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allAppsVisible")
  public Boolean getAllAppsVisible() {
    return allAppsVisible;
  }

  public void setAllAppsVisible(Boolean allAppsVisible) {
    this.allAppsVisible = allAppsVisible;
  }

  public UserInvitationAttributes email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @javax.validation.constraints.Email 
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserInvitationAttributes expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
  */
  @Valid 
  @Schema(name = "expirationDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationDate")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public UserInvitationAttributes firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "firstName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserInvitationAttributes lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  
  @Schema(name = "lastName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserInvitationAttributes provisioningAllowed(Boolean provisioningAllowed) {
    this.provisioningAllowed = provisioningAllowed;
    return this;
  }

  /**
   * Get provisioningAllowed
   * @return provisioningAllowed
  */
  
  @Schema(name = "provisioningAllowed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provisioningAllowed")
  public Boolean getProvisioningAllowed() {
    return provisioningAllowed;
  }

  public void setProvisioningAllowed(Boolean provisioningAllowed) {
    this.provisioningAllowed = provisioningAllowed;
  }

  public UserInvitationAttributes roles(List<@Valid UserRole> roles) {
    this.roles = roles;
    return this;
  }

  public UserInvitationAttributes addRolesItem(UserRole rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
  */
  @Valid 
  @Schema(name = "roles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roles")
  public List<@Valid UserRole> getRoles() {
    return roles;
  }

  public void setRoles(List<@Valid UserRole> roles) {
    this.roles = roles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInvitationAttributes userInvitationAttributes = (UserInvitationAttributes) o;
    return Objects.equals(this.allAppsVisible, userInvitationAttributes.allAppsVisible) &&
        Objects.equals(this.email, userInvitationAttributes.email) &&
        Objects.equals(this.expirationDate, userInvitationAttributes.expirationDate) &&
        Objects.equals(this.firstName, userInvitationAttributes.firstName) &&
        Objects.equals(this.lastName, userInvitationAttributes.lastName) &&
        Objects.equals(this.provisioningAllowed, userInvitationAttributes.provisioningAllowed) &&
        Objects.equals(this.roles, userInvitationAttributes.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allAppsVisible, email, expirationDate, firstName, lastName, provisioningAllowed, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInvitationAttributes {\n");
    sb.append("    allAppsVisible: ").append(toIndentedString(allAppsVisible)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    provisioningAllowed: ").append(toIndentedString(provisioningAllowed)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

