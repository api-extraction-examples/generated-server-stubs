package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Role;
import org.openapitools.model.Statement;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostMembersRequestInner
 */

@JsonTypeName("postMembers_request_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class PostMembersRequestInner {

  @Valid
  private List<String> customRoles;

  private String email;

  private String firstName;

  @Valid
  private List<@Valid Statement> inlineRole;

  private String lastName;

  private Role role;

  public PostMembersRequestInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostMembersRequestInner(String email) {
    this.email = email;
  }

  public PostMembersRequestInner customRoles(List<String> customRoles) {
    this.customRoles = customRoles;
    return this;
  }

  public PostMembersRequestInner addCustomRolesItem(String customRolesItem) {
    if (this.customRoles == null) {
      this.customRoles = new ArrayList<>();
    }
    this.customRoles.add(customRolesItem);
    return this;
  }

  /**
   * Get customRoles
   * @return customRoles
  */
  
  @Schema(name = "customRoles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customRoles")
  public List<String> getCustomRoles() {
    return customRoles;
  }

  public void setCustomRoles(List<String> customRoles) {
    this.customRoles = customRoles;
  }

  public PostMembersRequestInner email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @NotNull 
  @Schema(name = "email", example = "exampleuser@email.com", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PostMembersRequestInner firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "firstName", example = "Bob", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PostMembersRequestInner inlineRole(List<@Valid Statement> inlineRole) {
    this.inlineRole = inlineRole;
    return this;
  }

  public PostMembersRequestInner addInlineRoleItem(Statement inlineRoleItem) {
    if (this.inlineRole == null) {
      this.inlineRole = new ArrayList<>();
    }
    this.inlineRole.add(inlineRoleItem);
    return this;
  }

  /**
   * Get inlineRole
   * @return inlineRole
  */
  @Valid 
  @Schema(name = "inlineRole", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inlineRole")
  public List<@Valid Statement> getInlineRole() {
    return inlineRole;
  }

  public void setInlineRole(List<@Valid Statement> inlineRole) {
    this.inlineRole = inlineRole;
  }

  public PostMembersRequestInner lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  
  @Schema(name = "lastName", example = "Loblaw", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PostMembersRequestInner role(Role role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @Valid 
  @Schema(name = "role", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostMembersRequestInner postMembersRequestInner = (PostMembersRequestInner) o;
    return Objects.equals(this.customRoles, postMembersRequestInner.customRoles) &&
        Objects.equals(this.email, postMembersRequestInner.email) &&
        Objects.equals(this.firstName, postMembersRequestInner.firstName) &&
        Objects.equals(this.inlineRole, postMembersRequestInner.inlineRole) &&
        Objects.equals(this.lastName, postMembersRequestInner.lastName) &&
        Objects.equals(this.role, postMembersRequestInner.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customRoles, email, firstName, inlineRole, lastName, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostMembersRequestInner {\n");
    sb.append("    customRoles: ").append(toIndentedString(customRoles)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    inlineRole: ").append(toIndentedString(inlineRole)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

