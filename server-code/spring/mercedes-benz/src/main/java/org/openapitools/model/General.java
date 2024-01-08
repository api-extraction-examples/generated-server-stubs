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
 * General
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:25.642267-04:00[America/Lower_Princes]")
public class General {

  private String email;

  private String facebook;

  private String fax;

  private String googlePlus;

  private String mobile;

  private String phone;

  private String twitter;

  private String website;

  public General email(String email) {
    this.email = email;
    return this;
  }

  /**
   * general email address
   * @return email
  */
  
  @Schema(name = "email", description = "general email address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public General facebook(String facebook) {
    this.facebook = facebook;
    return this;
  }

  /**
   * general facebook URL
   * @return facebook
  */
  
  @Schema(name = "facebook", description = "general facebook URL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("facebook")
  public String getFacebook() {
    return facebook;
  }

  public void setFacebook(String facebook) {
    this.facebook = facebook;
  }

  public General fax(String fax) {
    this.fax = fax;
    return this;
  }

  /**
   * general fax number
   * @return fax
  */
  
  @Schema(name = "fax", description = "general fax number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fax")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public General googlePlus(String googlePlus) {
    this.googlePlus = googlePlus;
    return this;
  }

  /**
   * general googlePlus account name
   * @return googlePlus
  */
  
  @Schema(name = "googlePlus", description = "general googlePlus account name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("googlePlus")
  public String getGooglePlus() {
    return googlePlus;
  }

  public void setGooglePlus(String googlePlus) {
    this.googlePlus = googlePlus;
  }

  public General mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  /**
   * general mobile phone number
   * @return mobile
  */
  
  @Schema(name = "mobile", description = "general mobile phone number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mobile")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public General phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * general phone number
   * @return phone
  */
  
  @Schema(name = "phone", description = "general phone number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public General twitter(String twitter) {
    this.twitter = twitter;
    return this;
  }

  /**
   * general twitter account name
   * @return twitter
  */
  
  @Schema(name = "twitter", description = "general twitter account name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("twitter")
  public String getTwitter() {
    return twitter;
  }

  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }

  public General website(String website) {
    this.website = website;
    return this;
  }

  /**
   * general website
   * @return website
  */
  
  @Schema(name = "website", description = "general website", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    General general = (General) o;
    return Objects.equals(this.email, general.email) &&
        Objects.equals(this.facebook, general.facebook) &&
        Objects.equals(this.fax, general.fax) &&
        Objects.equals(this.googlePlus, general.googlePlus) &&
        Objects.equals(this.mobile, general.mobile) &&
        Objects.equals(this.phone, general.phone) &&
        Objects.equals(this.twitter, general.twitter) &&
        Objects.equals(this.website, general.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, facebook, fax, googlePlus, mobile, phone, twitter, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class General {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    facebook: ").append(toIndentedString(facebook)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    googlePlus: ").append(toIndentedString(googlePlus)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

