package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppStoreReviewDetailAttributes
 */

@JsonTypeName("AppStoreReviewDetail_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppStoreReviewDetailAttributes {

  private String contactEmail;

  private String contactFirstName;

  private String contactLastName;

  private String contactPhone;

  private String demoAccountName;

  private String demoAccountPassword;

  private Boolean demoAccountRequired;

  private String notes;

  public AppStoreReviewDetailAttributes contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

  /**
   * Get contactEmail
   * @return contactEmail
  */
  
  @Schema(name = "contactEmail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactEmail")
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public AppStoreReviewDetailAttributes contactFirstName(String contactFirstName) {
    this.contactFirstName = contactFirstName;
    return this;
  }

  /**
   * Get contactFirstName
   * @return contactFirstName
  */
  
  @Schema(name = "contactFirstName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactFirstName")
  public String getContactFirstName() {
    return contactFirstName;
  }

  public void setContactFirstName(String contactFirstName) {
    this.contactFirstName = contactFirstName;
  }

  public AppStoreReviewDetailAttributes contactLastName(String contactLastName) {
    this.contactLastName = contactLastName;
    return this;
  }

  /**
   * Get contactLastName
   * @return contactLastName
  */
  
  @Schema(name = "contactLastName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactLastName")
  public String getContactLastName() {
    return contactLastName;
  }

  public void setContactLastName(String contactLastName) {
    this.contactLastName = contactLastName;
  }

  public AppStoreReviewDetailAttributes contactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
    return this;
  }

  /**
   * Get contactPhone
   * @return contactPhone
  */
  
  @Schema(name = "contactPhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactPhone")
  public String getContactPhone() {
    return contactPhone;
  }

  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  public AppStoreReviewDetailAttributes demoAccountName(String demoAccountName) {
    this.demoAccountName = demoAccountName;
    return this;
  }

  /**
   * Get demoAccountName
   * @return demoAccountName
  */
  
  @Schema(name = "demoAccountName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("demoAccountName")
  public String getDemoAccountName() {
    return demoAccountName;
  }

  public void setDemoAccountName(String demoAccountName) {
    this.demoAccountName = demoAccountName;
  }

  public AppStoreReviewDetailAttributes demoAccountPassword(String demoAccountPassword) {
    this.demoAccountPassword = demoAccountPassword;
    return this;
  }

  /**
   * Get demoAccountPassword
   * @return demoAccountPassword
  */
  
  @Schema(name = "demoAccountPassword", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("demoAccountPassword")
  public String getDemoAccountPassword() {
    return demoAccountPassword;
  }

  public void setDemoAccountPassword(String demoAccountPassword) {
    this.demoAccountPassword = demoAccountPassword;
  }

  public AppStoreReviewDetailAttributes demoAccountRequired(Boolean demoAccountRequired) {
    this.demoAccountRequired = demoAccountRequired;
    return this;
  }

  /**
   * Get demoAccountRequired
   * @return demoAccountRequired
  */
  
  @Schema(name = "demoAccountRequired", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("demoAccountRequired")
  public Boolean getDemoAccountRequired() {
    return demoAccountRequired;
  }

  public void setDemoAccountRequired(Boolean demoAccountRequired) {
    this.demoAccountRequired = demoAccountRequired;
  }

  public AppStoreReviewDetailAttributes notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
  */
  
  @Schema(name = "notes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreReviewDetailAttributes appStoreReviewDetailAttributes = (AppStoreReviewDetailAttributes) o;
    return Objects.equals(this.contactEmail, appStoreReviewDetailAttributes.contactEmail) &&
        Objects.equals(this.contactFirstName, appStoreReviewDetailAttributes.contactFirstName) &&
        Objects.equals(this.contactLastName, appStoreReviewDetailAttributes.contactLastName) &&
        Objects.equals(this.contactPhone, appStoreReviewDetailAttributes.contactPhone) &&
        Objects.equals(this.demoAccountName, appStoreReviewDetailAttributes.demoAccountName) &&
        Objects.equals(this.demoAccountPassword, appStoreReviewDetailAttributes.demoAccountPassword) &&
        Objects.equals(this.demoAccountRequired, appStoreReviewDetailAttributes.demoAccountRequired) &&
        Objects.equals(this.notes, appStoreReviewDetailAttributes.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactEmail, contactFirstName, contactLastName, contactPhone, demoAccountName, demoAccountPassword, demoAccountRequired, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreReviewDetailAttributes {\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    contactFirstName: ").append(toIndentedString(contactFirstName)).append("\n");
    sb.append("    contactLastName: ").append(toIndentedString(contactLastName)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    demoAccountName: ").append(toIndentedString(demoAccountName)).append("\n");
    sb.append("    demoAccountPassword: ").append(toIndentedString(demoAccountPassword)).append("\n");
    sb.append("    demoAccountRequired: ").append(toIndentedString(demoAccountRequired)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

