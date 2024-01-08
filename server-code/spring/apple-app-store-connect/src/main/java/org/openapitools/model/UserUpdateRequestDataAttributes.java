package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UserRole;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserUpdateRequestDataAttributes
 */

@JsonTypeName("UserUpdateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class UserUpdateRequestDataAttributes {

  private Boolean allAppsVisible;

  private Boolean provisioningAllowed;

  @Valid
  private List<@Valid UserRole> roles;

  public UserUpdateRequestDataAttributes allAppsVisible(Boolean allAppsVisible) {
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

  public UserUpdateRequestDataAttributes provisioningAllowed(Boolean provisioningAllowed) {
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

  public UserUpdateRequestDataAttributes roles(List<@Valid UserRole> roles) {
    this.roles = roles;
    return this;
  }

  public UserUpdateRequestDataAttributes addRolesItem(UserRole rolesItem) {
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
    UserUpdateRequestDataAttributes userUpdateRequestDataAttributes = (UserUpdateRequestDataAttributes) o;
    return Objects.equals(this.allAppsVisible, userUpdateRequestDataAttributes.allAppsVisible) &&
        Objects.equals(this.provisioningAllowed, userUpdateRequestDataAttributes.provisioningAllowed) &&
        Objects.equals(this.roles, userUpdateRequestDataAttributes.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allAppsVisible, provisioningAllowed, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdateRequestDataAttributes {\n");
    sb.append("    allAppsVisible: ").append(toIndentedString(allAppsVisible)).append("\n");
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

