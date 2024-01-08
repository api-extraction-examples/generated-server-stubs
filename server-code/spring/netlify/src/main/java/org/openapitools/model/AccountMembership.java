package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountMembershipCapabilities;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AccountMembership
 */

@JsonTypeName("accountMembership")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class AccountMembership {

  private String billingDetails;

  private String billingEmail;

  private String billingName;

  private String billingPeriod;

  private AccountMembershipCapabilities capabilities;

  private String createdAt;

  private String id;

  private String name;

  @Valid
  private List<String> ownerIds;

  private String paymentMethodId;

  @Valid
  private List<String> rolesAllowed;

  private String slug;

  private String type;

  private String typeId;

  private String typeName;

  private String updatedAt;

  public AccountMembership billingDetails(String billingDetails) {
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

  public AccountMembership billingEmail(String billingEmail) {
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

  public AccountMembership billingName(String billingName) {
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

  public AccountMembership billingPeriod(String billingPeriod) {
    this.billingPeriod = billingPeriod;
    return this;
  }

  /**
   * Get billingPeriod
   * @return billingPeriod
  */
  
  @Schema(name = "billing_period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_period")
  public String getBillingPeriod() {
    return billingPeriod;
  }

  public void setBillingPeriod(String billingPeriod) {
    this.billingPeriod = billingPeriod;
  }

  public AccountMembership capabilities(AccountMembershipCapabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  /**
   * Get capabilities
   * @return capabilities
  */
  @Valid 
  @Schema(name = "capabilities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("capabilities")
  public AccountMembershipCapabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(AccountMembershipCapabilities capabilities) {
    this.capabilities = capabilities;
  }

  public AccountMembership createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  
  @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public AccountMembership id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccountMembership name(String name) {
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

  public AccountMembership ownerIds(List<String> ownerIds) {
    this.ownerIds = ownerIds;
    return this;
  }

  public AccountMembership addOwnerIdsItem(String ownerIdsItem) {
    if (this.ownerIds == null) {
      this.ownerIds = new ArrayList<>();
    }
    this.ownerIds.add(ownerIdsItem);
    return this;
  }

  /**
   * Get ownerIds
   * @return ownerIds
  */
  
  @Schema(name = "owner_ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner_ids")
  public List<String> getOwnerIds() {
    return ownerIds;
  }

  public void setOwnerIds(List<String> ownerIds) {
    this.ownerIds = ownerIds;
  }

  public AccountMembership paymentMethodId(String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
    return this;
  }

  /**
   * Get paymentMethodId
   * @return paymentMethodId
  */
  
  @Schema(name = "payment_method_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payment_method_id")
  public String getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  public AccountMembership rolesAllowed(List<String> rolesAllowed) {
    this.rolesAllowed = rolesAllowed;
    return this;
  }

  public AccountMembership addRolesAllowedItem(String rolesAllowedItem) {
    if (this.rolesAllowed == null) {
      this.rolesAllowed = new ArrayList<>();
    }
    this.rolesAllowed.add(rolesAllowedItem);
    return this;
  }

  /**
   * Get rolesAllowed
   * @return rolesAllowed
  */
  
  @Schema(name = "roles_allowed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roles_allowed")
  public List<String> getRolesAllowed() {
    return rolesAllowed;
  }

  public void setRolesAllowed(List<String> rolesAllowed) {
    this.rolesAllowed = rolesAllowed;
  }

  public AccountMembership slug(String slug) {
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

  public AccountMembership type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AccountMembership typeId(String typeId) {
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

  public AccountMembership typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * Get typeName
   * @return typeName
  */
  
  @Schema(name = "type_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type_name")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public AccountMembership updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  
  @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountMembership accountMembership = (AccountMembership) o;
    return Objects.equals(this.billingDetails, accountMembership.billingDetails) &&
        Objects.equals(this.billingEmail, accountMembership.billingEmail) &&
        Objects.equals(this.billingName, accountMembership.billingName) &&
        Objects.equals(this.billingPeriod, accountMembership.billingPeriod) &&
        Objects.equals(this.capabilities, accountMembership.capabilities) &&
        Objects.equals(this.createdAt, accountMembership.createdAt) &&
        Objects.equals(this.id, accountMembership.id) &&
        Objects.equals(this.name, accountMembership.name) &&
        Objects.equals(this.ownerIds, accountMembership.ownerIds) &&
        Objects.equals(this.paymentMethodId, accountMembership.paymentMethodId) &&
        Objects.equals(this.rolesAllowed, accountMembership.rolesAllowed) &&
        Objects.equals(this.slug, accountMembership.slug) &&
        Objects.equals(this.type, accountMembership.type) &&
        Objects.equals(this.typeId, accountMembership.typeId) &&
        Objects.equals(this.typeName, accountMembership.typeName) &&
        Objects.equals(this.updatedAt, accountMembership.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingDetails, billingEmail, billingName, billingPeriod, capabilities, createdAt, id, name, ownerIds, paymentMethodId, rolesAllowed, slug, type, typeId, typeName, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountMembership {\n");
    sb.append("    billingDetails: ").append(toIndentedString(billingDetails)).append("\n");
    sb.append("    billingEmail: ").append(toIndentedString(billingEmail)).append("\n");
    sb.append("    billingName: ").append(toIndentedString(billingName)).append("\n");
    sb.append("    billingPeriod: ").append(toIndentedString(billingPeriod)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerIds: ").append(toIndentedString(ownerIds)).append("\n");
    sb.append("    paymentMethodId: ").append(toIndentedString(paymentMethodId)).append("\n");
    sb.append("    rolesAllowed: ").append(toIndentedString(rolesAllowed)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

