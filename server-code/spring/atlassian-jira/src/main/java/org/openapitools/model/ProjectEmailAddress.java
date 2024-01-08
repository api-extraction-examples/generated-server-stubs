package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A project&#39;s sender email address.
 */

@Schema(name = "ProjectEmailAddress", description = "A project's sender email address.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ProjectEmailAddress {

  private String emailAddress;

  @Valid
  private List<String> emailAddressStatus;

  public ProjectEmailAddress emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * The email address.
   * @return emailAddress
  */
  
  @Schema(name = "emailAddress", description = "The email address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public ProjectEmailAddress emailAddressStatus(List<String> emailAddressStatus) {
    this.emailAddressStatus = emailAddressStatus;
    return this;
  }

  public ProjectEmailAddress addEmailAddressStatusItem(String emailAddressStatusItem) {
    if (this.emailAddressStatus == null) {
      this.emailAddressStatus = new ArrayList<>();
    }
    this.emailAddressStatus.add(emailAddressStatusItem);
    return this;
  }

  /**
   * When using a custom domain, the status of the email address.
   * @return emailAddressStatus
  */
  
  @Schema(name = "emailAddressStatus", description = "When using a custom domain, the status of the email address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailAddressStatus")
  public List<String> getEmailAddressStatus() {
    return emailAddressStatus;
  }

  public void setEmailAddressStatus(List<String> emailAddressStatus) {
    this.emailAddressStatus = emailAddressStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectEmailAddress projectEmailAddress = (ProjectEmailAddress) o;
    return Objects.equals(this.emailAddress, projectEmailAddress.emailAddress) &&
        Objects.equals(this.emailAddressStatus, projectEmailAddress.emailAddressStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, emailAddressStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectEmailAddress {\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    emailAddressStatus: ").append(toIndentedString(emailAddressStatus)).append("\n");
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

