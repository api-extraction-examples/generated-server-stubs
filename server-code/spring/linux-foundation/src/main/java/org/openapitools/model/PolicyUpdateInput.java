package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Contact;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Reimbursement update information
 */

@Schema(name = "policy-update-input", description = "Reimbursement update information")
@JsonTypeName("policy-update-input")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:46.390673-04:00[America/Lower_Princes]")
public class PolicyUpdateInput {

  @Valid
  private List<@Valid Contact> beneficiaries;

  @Valid
  private List<String> categories = new ArrayList<>();

  private String entityType;

  private Contact owner;

  private String projectURL;

  public PolicyUpdateInput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PolicyUpdateInput(List<String> categories, Contact owner, String projectURL) {
    this.categories = categories;
    this.owner = owner;
    this.projectURL = projectURL;
  }

  public PolicyUpdateInput beneficiaries(List<@Valid Contact> beneficiaries) {
    this.beneficiaries = beneficiaries;
    return this;
  }

  public PolicyUpdateInput addBeneficiariesItem(Contact beneficiariesItem) {
    if (this.beneficiaries == null) {
      this.beneficiaries = new ArrayList<>();
    }
    this.beneficiaries.add(beneficiariesItem);
    return this;
  }

  /**
   * Get beneficiaries
   * @return beneficiaries
  */
  @Valid 
  @Schema(name = "Beneficiaries", example = "[{EmailAddress=DaffyDuck@example.org, Name=Daffy Duck}, {EmailAddress=PorkyPig@example.org, Name=Porky Pik}]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Beneficiaries")
  public List<@Valid Contact> getBeneficiaries() {
    return beneficiaries;
  }

  public void setBeneficiaries(List<@Valid Contact> beneficiaries) {
    this.beneficiaries = beneficiaries;
  }

  public PolicyUpdateInput categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public PolicyUpdateInput addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
  */
  @NotNull 
  @Schema(name = "Categories", example = "[Anvils, Carrots, Travel]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Categories")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public PolicyUpdateInput entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Get entityType
   * @return entityType
  */
  
  @Schema(name = "EntityType", example = "other", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EntityType")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public PolicyUpdateInput owner(Contact owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @NotNull @Valid 
  @Schema(name = "Owner", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Owner")
  public Contact getOwner() {
    return owner;
  }

  public void setOwner(Contact owner) {
    this.owner = owner;
  }

  public PolicyUpdateInput projectURL(String projectURL) {
    this.projectURL = projectURL;
    return this;
  }

  /**
   * Get projectURL
   * @return projectURL
  */
  @NotNull 
  @Schema(name = "ProjectURL", example = "https://funding.dev.platform.linuxfoundation.org/projects/asp-net", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ProjectURL")
  public String getProjectURL() {
    return projectURL;
  }

  public void setProjectURL(String projectURL) {
    this.projectURL = projectURL;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyUpdateInput policyUpdateInput = (PolicyUpdateInput) o;
    return Objects.equals(this.beneficiaries, policyUpdateInput.beneficiaries) &&
        Objects.equals(this.categories, policyUpdateInput.categories) &&
        Objects.equals(this.entityType, policyUpdateInput.entityType) &&
        Objects.equals(this.owner, policyUpdateInput.owner) &&
        Objects.equals(this.projectURL, policyUpdateInput.projectURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiaries, categories, entityType, owner, projectURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyUpdateInput {\n");
    sb.append("    beneficiaries: ").append(toIndentedString(beneficiaries)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    projectURL: ").append(toIndentedString(projectURL)).append("\n");
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

