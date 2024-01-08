package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * The user details.
 */

@Schema(name = "NewUserDetails", description = "The user details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class NewUserDetails {

  @Valid
  private List<String> applicationKeys;

  private String displayName;

  private String emailAddress;

  private String key;

  private String name;

  private String password;

  @Valid
  private Set<String> products;

  private String self;

  public NewUserDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NewUserDetails(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public NewUserDetails applicationKeys(List<String> applicationKeys) {
    this.applicationKeys = applicationKeys;
    return this;
  }

  public NewUserDetails addApplicationKeysItem(String applicationKeysItem) {
    if (this.applicationKeys == null) {
      this.applicationKeys = new ArrayList<>();
    }
    this.applicationKeys.add(applicationKeysItem);
    return this;
  }

  /**
   * Deprecated, do not use.
   * @return applicationKeys
  */
  
  @Schema(name = "applicationKeys", description = "Deprecated, do not use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicationKeys")
  public List<String> getApplicationKeys() {
    return applicationKeys;
  }

  public void setApplicationKeys(List<String> applicationKeys) {
    this.applicationKeys = applicationKeys;
  }

  public NewUserDetails displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * This property is no longer available. If the user has an Atlassian account, their display name is not changed. If the user does not have an Atlassian account, they are sent an email asking them set up an account.
   * @return displayName
  */
  
  @Schema(name = "displayName", description = "This property is no longer available. If the user has an Atlassian account, their display name is not changed. If the user does not have an Atlassian account, they are sent an email asking them set up an account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public NewUserDetails emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * The email address for the user.
   * @return emailAddress
  */
  @NotNull 
  @Schema(name = "emailAddress", description = "The email address for the user.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public NewUserDetails key(String key) {
    this.key = key;
    return this;
  }

  /**
   * This property is no longer available. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return key
  */
  
  @Schema(name = "key", description = "This property is no longer available. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public NewUserDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * This property is no longer available. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return name
  */
  
  @Schema(name = "name", description = "This property is no longer available. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewUserDetails password(String password) {
    this.password = password;
    return this;
  }

  /**
   * This property is no longer available. If the user has an Atlassian account, their password is not changed. If the user does not have an Atlassian account, they are sent an email asking them set up an account.
   * @return password
  */
  
  @Schema(name = "password", description = "This property is no longer available. If the user has an Atlassian account, their password is not changed. If the user does not have an Atlassian account, they are sent an email asking them set up an account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public NewUserDetails products(Set<String> products) {
    this.products = products;
    return this;
  }

  public NewUserDetails addProductsItem(String productsItem) {
    if (this.products == null) {
      this.products = new LinkedHashSet<>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * Products the new user has access to. Valid products are: jira-core, jira-servicedesk, jira-product-discovery, jira-software. If left empty, the user will get default product access. To create a user without product access, set this field to be an empty array.
   * @return products
  */
  
  @Schema(name = "products", description = "Products the new user has access to. Valid products are: jira-core, jira-servicedesk, jira-product-discovery, jira-software. If left empty, the user will get default product access. To create a user without product access, set this field to be an empty array.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("products")
  public Set<String> getProducts() {
    return products;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setProducts(Set<String> products) {
    this.products = products;
  }

  public NewUserDetails self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the user.
   * @return self
  */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public NewUserDetails putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewUserDetails newUserDetails = (NewUserDetails) o;
    return Objects.equals(this.applicationKeys, newUserDetails.applicationKeys) &&
        Objects.equals(this.displayName, newUserDetails.displayName) &&
        Objects.equals(this.emailAddress, newUserDetails.emailAddress) &&
        Objects.equals(this.key, newUserDetails.key) &&
        Objects.equals(this.name, newUserDetails.name) &&
        Objects.equals(this.password, newUserDetails.password) &&
        Objects.equals(this.products, newUserDetails.products) &&
        Objects.equals(this.self, newUserDetails.self) &&
    Objects.equals(this.additionalProperties, newUserDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationKeys, displayName, emailAddress, key, name, password, products, self, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUserDetails {\n");
    sb.append("    applicationKeys: ").append(toIndentedString(applicationKeys)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

