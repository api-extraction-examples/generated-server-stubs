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
 * AccountUpdateSetup
 */

@JsonTypeName("accountUpdateSetup")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class AccountUpdateSetup {

  private String billingDetails;

  private String billingEmail;

  private String billingName;

  private Integer extraSeatsBlock;

  private String name;

  private String slug;

  private String typeId;

  public AccountUpdateSetup billingDetails(String billingDetails) {
    this.billingDetails = billingDetails;
    return this;
  }

  /**
   * Get billingDetails
   * @return billingDetails
  */
  
  @Schema(name = "billing_details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_details")
  public String getBillingDetails() {
    return billingDetails;
  }

  public void setBillingDetails(String billingDetails) {
    this.billingDetails = billingDetails;
  }

  public AccountUpdateSetup billingEmail(String billingEmail) {
    this.billingEmail = billingEmail;
    return this;
  }

  /**
   * Get billingEmail
   * @return billingEmail
  */
  
  @Schema(name = "billing_email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_email")
  public String getBillingEmail() {
    return billingEmail;
  }

  public void setBillingEmail(String billingEmail) {
    this.billingEmail = billingEmail;
  }

  public AccountUpdateSetup billingName(String billingName) {
    this.billingName = billingName;
    return this;
  }

  /**
   * Get billingName
   * @return billingName
  */
  
  @Schema(name = "billing_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_name")
  public String getBillingName() {
    return billingName;
  }

  public void setBillingName(String billingName) {
    this.billingName = billingName;
  }

  public AccountUpdateSetup extraSeatsBlock(Integer extraSeatsBlock) {
    this.extraSeatsBlock = extraSeatsBlock;
    return this;
  }

  /**
   * Get extraSeatsBlock
   * @return extraSeatsBlock
  */
  
  @Schema(name = "extra_seats_block", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extra_seats_block")
  public Integer getExtraSeatsBlock() {
    return extraSeatsBlock;
  }

  public void setExtraSeatsBlock(Integer extraSeatsBlock) {
    this.extraSeatsBlock = extraSeatsBlock;
  }

  public AccountUpdateSetup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountUpdateSetup slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Get slug
   * @return slug
  */
  
  @Schema(name = "slug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slug")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public AccountUpdateSetup typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * Get typeId
   * @return typeId
  */
  
  @Schema(name = "type_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type_id")
  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUpdateSetup accountUpdateSetup = (AccountUpdateSetup) o;
    return Objects.equals(this.billingDetails, accountUpdateSetup.billingDetails) &&
        Objects.equals(this.billingEmail, accountUpdateSetup.billingEmail) &&
        Objects.equals(this.billingName, accountUpdateSetup.billingName) &&
        Objects.equals(this.extraSeatsBlock, accountUpdateSetup.extraSeatsBlock) &&
        Objects.equals(this.name, accountUpdateSetup.name) &&
        Objects.equals(this.slug, accountUpdateSetup.slug) &&
        Objects.equals(this.typeId, accountUpdateSetup.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingDetails, billingEmail, billingName, extraSeatsBlock, name, slug, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUpdateSetup {\n");
    sb.append("    billingDetails: ").append(toIndentedString(billingDetails)).append("\n");
    sb.append("    billingEmail: ").append(toIndentedString(billingEmail)).append("\n");
    sb.append("    billingName: ").append(toIndentedString(billingName)).append("\n");
    sb.append("    extraSeatsBlock: ").append(toIndentedString(extraSeatsBlock)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

