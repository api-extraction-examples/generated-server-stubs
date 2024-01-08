package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.UserCollectionItemRolesInner;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A user object.  *New in version 2.1.0* 
 */

@Schema(name = "UserCollectionItem", description = "A user object.  *New in version 2.1.0* ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class UserCollectionItem {

  private JsonNullable<Boolean> active = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> changedOn = JsonNullable.<String>undefined();

  private JsonNullable<String> createdOn = JsonNullable.<String>undefined();

  private String email;

  private JsonNullable<Integer> failedLoginCount = JsonNullable.<Integer>undefined();

  private String firstName;

  private JsonNullable<String> lastLogin = JsonNullable.<String>undefined();

  private String lastName;

  private JsonNullable<Integer> loginCount = JsonNullable.<Integer>undefined();

  @Valid
  private List<@Valid UserCollectionItemRolesInner> roles;

  private String username;

  public UserCollectionItem active(Boolean active) {
    this.active = JsonNullable.of(active);
    return this;
  }

  /**
   * Whether the user is active
   * @return active
  */
  
  @Schema(name = "active", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the user is active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public JsonNullable<Boolean> getActive() {
    return active;
  }

  public void setActive(JsonNullable<Boolean> active) {
    this.active = active;
  }

  public UserCollectionItem changedOn(String changedOn) {
    this.changedOn = JsonNullable.of(changedOn);
    return this;
  }

  /**
   * The date user was changed
   * @return changedOn
  */
  
  @Schema(name = "changed_on", accessMode = Schema.AccessMode.READ_ONLY, description = "The date user was changed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changed_on")
  public JsonNullable<String> getChangedOn() {
    return changedOn;
  }

  public void setChangedOn(JsonNullable<String> changedOn) {
    this.changedOn = changedOn;
  }

  public UserCollectionItem createdOn(String createdOn) {
    this.createdOn = JsonNullable.of(createdOn);
    return this;
  }

  /**
   * The date user was created
   * @return createdOn
  */
  
  @Schema(name = "created_on", accessMode = Schema.AccessMode.READ_ONLY, description = "The date user was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_on")
  public JsonNullable<String> getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(JsonNullable<String> createdOn) {
    this.createdOn = createdOn;
  }

  public UserCollectionItem email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The user's email.  *Changed in version 2.2.0*&#58; A minimum character length requirement ('minLength') is added. 
   * @return email
  */
  @Size(min = 1) 
  @Schema(name = "email", description = "The user's email.  *Changed in version 2.2.0*&#58; A minimum character length requirement ('minLength') is added. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserCollectionItem failedLoginCount(Integer failedLoginCount) {
    this.failedLoginCount = JsonNullable.of(failedLoginCount);
    return this;
  }

  /**
   * The number of times the login failed
   * @return failedLoginCount
  */
  
  @Schema(name = "failed_login_count", accessMode = Schema.AccessMode.READ_ONLY, description = "The number of times the login failed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failed_login_count")
  public JsonNullable<Integer> getFailedLoginCount() {
    return failedLoginCount;
  }

  public void setFailedLoginCount(JsonNullable<Integer> failedLoginCount) {
    this.failedLoginCount = failedLoginCount;
  }

  public UserCollectionItem firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The user's first name.  *Changed in version 2.4.0*&#58; The requirement for this to be non-empty was removed. 
   * @return firstName
  */
  
  @Schema(name = "first_name", description = "The user's first name.  *Changed in version 2.4.0*&#58; The requirement for this to be non-empty was removed. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserCollectionItem lastLogin(String lastLogin) {
    this.lastLogin = JsonNullable.of(lastLogin);
    return this;
  }

  /**
   * The last user login
   * @return lastLogin
  */
  
  @Schema(name = "last_login", accessMode = Schema.AccessMode.READ_ONLY, description = "The last user login", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_login")
  public JsonNullable<String> getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(JsonNullable<String> lastLogin) {
    this.lastLogin = lastLogin;
  }

  public UserCollectionItem lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The user's last name.  *Changed in version 2.4.0*&#58; The requirement for this to be non-empty was removed. 
   * @return lastName
  */
  
  @Schema(name = "last_name", description = "The user's last name.  *Changed in version 2.4.0*&#58; The requirement for this to be non-empty was removed. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserCollectionItem loginCount(Integer loginCount) {
    this.loginCount = JsonNullable.of(loginCount);
    return this;
  }

  /**
   * The login count
   * @return loginCount
  */
  
  @Schema(name = "login_count", accessMode = Schema.AccessMode.READ_ONLY, description = "The login count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("login_count")
  public JsonNullable<Integer> getLoginCount() {
    return loginCount;
  }

  public void setLoginCount(JsonNullable<Integer> loginCount) {
    this.loginCount = loginCount;
  }

  public UserCollectionItem roles(List<@Valid UserCollectionItemRolesInner> roles) {
    this.roles = roles;
    return this;
  }

  public UserCollectionItem addRolesItem(UserCollectionItemRolesInner rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * User roles.  *Changed in version 2.2.0*&#58; Field is no longer read-only. 
   * @return roles
  */
  @Valid 
  @Schema(name = "roles", description = "User roles.  *Changed in version 2.2.0*&#58; Field is no longer read-only. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roles")
  public List<@Valid UserCollectionItemRolesInner> getRoles() {
    return roles;
  }

  public void setRoles(List<@Valid UserCollectionItemRolesInner> roles) {
    this.roles = roles;
  }

  public UserCollectionItem username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The username.  *Changed in version 2.2.0*&#58; A minimum character length requirement ('minLength') is added. 
   * @return username
  */
  @Size(min = 1) 
  @Schema(name = "username", description = "The username.  *Changed in version 2.2.0*&#58; A minimum character length requirement ('minLength') is added. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCollectionItem userCollectionItem = (UserCollectionItem) o;
    return equalsNullable(this.active, userCollectionItem.active) &&
        equalsNullable(this.changedOn, userCollectionItem.changedOn) &&
        equalsNullable(this.createdOn, userCollectionItem.createdOn) &&
        Objects.equals(this.email, userCollectionItem.email) &&
        equalsNullable(this.failedLoginCount, userCollectionItem.failedLoginCount) &&
        Objects.equals(this.firstName, userCollectionItem.firstName) &&
        equalsNullable(this.lastLogin, userCollectionItem.lastLogin) &&
        Objects.equals(this.lastName, userCollectionItem.lastName) &&
        equalsNullable(this.loginCount, userCollectionItem.loginCount) &&
        Objects.equals(this.roles, userCollectionItem.roles) &&
        Objects.equals(this.username, userCollectionItem.username);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(active), hashCodeNullable(changedOn), hashCodeNullable(createdOn), email, hashCodeNullable(failedLoginCount), firstName, hashCodeNullable(lastLogin), lastName, hashCodeNullable(loginCount), roles, username);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCollectionItem {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    changedOn: ").append(toIndentedString(changedOn)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    failedLoginCount: ").append(toIndentedString(failedLoginCount)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    loginCount: ").append(toIndentedString(loginCount)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

