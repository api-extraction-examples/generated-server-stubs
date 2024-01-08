package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BetaInviteType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BetaTesterAttributes
 */

@JsonTypeName("BetaTester_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaTesterAttributes {

  private String email;

  private String firstName;

  private BetaInviteType inviteType;

  private String lastName;

  public BetaTesterAttributes email(String email) {
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

  public BetaTesterAttributes firstName(String firstName) {
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

  public BetaTesterAttributes inviteType(BetaInviteType inviteType) {
    this.inviteType = inviteType;
    return this;
  }

  /**
   * Get inviteType
   * @return inviteType
  */
  @Valid 
  @Schema(name = "inviteType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inviteType")
  public BetaInviteType getInviteType() {
    return inviteType;
  }

  public void setInviteType(BetaInviteType inviteType) {
    this.inviteType = inviteType;
  }

  public BetaTesterAttributes lastName(String lastName) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetaTesterAttributes betaTesterAttributes = (BetaTesterAttributes) o;
    return Objects.equals(this.email, betaTesterAttributes.email) &&
        Objects.equals(this.firstName, betaTesterAttributes.firstName) &&
        Objects.equals(this.inviteType, betaTesterAttributes.inviteType) &&
        Objects.equals(this.lastName, betaTesterAttributes.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, inviteType, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaTesterAttributes {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    inviteType: ").append(toIndentedString(inviteType)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

