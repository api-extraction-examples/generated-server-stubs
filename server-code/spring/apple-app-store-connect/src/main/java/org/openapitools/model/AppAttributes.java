package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppAttributes
 */

@JsonTypeName("App_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppAttributes {

  private Boolean availableInNewTerritories;

  private String bundleId;

  /**
   * Gets or Sets contentRightsDeclaration
   */
  public enum ContentRightsDeclarationEnum {
    DOES_NOT_USE_THIRD_PARTY_CONTENT("DOES_NOT_USE_THIRD_PARTY_CONTENT"),
    
    USES_THIRD_PARTY_CONTENT("USES_THIRD_PARTY_CONTENT");

    private String value;

    ContentRightsDeclarationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContentRightsDeclarationEnum fromValue(String value) {
      for (ContentRightsDeclarationEnum b : ContentRightsDeclarationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ContentRightsDeclarationEnum contentRightsDeclaration;

  private Boolean isOrEverWasMadeForKids;

  private String name;

  private String primaryLocale;

  private String sku;

  public AppAttributes availableInNewTerritories(Boolean availableInNewTerritories) {
    this.availableInNewTerritories = availableInNewTerritories;
    return this;
  }

  /**
   * Get availableInNewTerritories
   * @return availableInNewTerritories
  */
  
  @Schema(name = "availableInNewTerritories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availableInNewTerritories")
  public Boolean getAvailableInNewTerritories() {
    return availableInNewTerritories;
  }

  public void setAvailableInNewTerritories(Boolean availableInNewTerritories) {
    this.availableInNewTerritories = availableInNewTerritories;
  }

  public AppAttributes bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

  /**
   * Get bundleId
   * @return bundleId
  */
  
  @Schema(name = "bundleId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bundleId")
  public String getBundleId() {
    return bundleId;
  }

  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }

  public AppAttributes contentRightsDeclaration(ContentRightsDeclarationEnum contentRightsDeclaration) {
    this.contentRightsDeclaration = contentRightsDeclaration;
    return this;
  }

  /**
   * Get contentRightsDeclaration
   * @return contentRightsDeclaration
  */
  
  @Schema(name = "contentRightsDeclaration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentRightsDeclaration")
  public ContentRightsDeclarationEnum getContentRightsDeclaration() {
    return contentRightsDeclaration;
  }

  public void setContentRightsDeclaration(ContentRightsDeclarationEnum contentRightsDeclaration) {
    this.contentRightsDeclaration = contentRightsDeclaration;
  }

  public AppAttributes isOrEverWasMadeForKids(Boolean isOrEverWasMadeForKids) {
    this.isOrEverWasMadeForKids = isOrEverWasMadeForKids;
    return this;
  }

  /**
   * Get isOrEverWasMadeForKids
   * @return isOrEverWasMadeForKids
  */
  
  @Schema(name = "isOrEverWasMadeForKids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isOrEverWasMadeForKids")
  public Boolean getIsOrEverWasMadeForKids() {
    return isOrEverWasMadeForKids;
  }

  public void setIsOrEverWasMadeForKids(Boolean isOrEverWasMadeForKids) {
    this.isOrEverWasMadeForKids = isOrEverWasMadeForKids;
  }

  public AppAttributes name(String name) {
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

  public AppAttributes primaryLocale(String primaryLocale) {
    this.primaryLocale = primaryLocale;
    return this;
  }

  /**
   * Get primaryLocale
   * @return primaryLocale
  */
  
  @Schema(name = "primaryLocale", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primaryLocale")
  public String getPrimaryLocale() {
    return primaryLocale;
  }

  public void setPrimaryLocale(String primaryLocale) {
    this.primaryLocale = primaryLocale;
  }

  public AppAttributes sku(String sku) {
    this.sku = sku;
    return this;
  }

  /**
   * Get sku
   * @return sku
  */
  
  @Schema(name = "sku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppAttributes appAttributes = (AppAttributes) o;
    return Objects.equals(this.availableInNewTerritories, appAttributes.availableInNewTerritories) &&
        Objects.equals(this.bundleId, appAttributes.bundleId) &&
        Objects.equals(this.contentRightsDeclaration, appAttributes.contentRightsDeclaration) &&
        Objects.equals(this.isOrEverWasMadeForKids, appAttributes.isOrEverWasMadeForKids) &&
        Objects.equals(this.name, appAttributes.name) &&
        Objects.equals(this.primaryLocale, appAttributes.primaryLocale) &&
        Objects.equals(this.sku, appAttributes.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableInNewTerritories, bundleId, contentRightsDeclaration, isOrEverWasMadeForKids, name, primaryLocale, sku);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppAttributes {\n");
    sb.append("    availableInNewTerritories: ").append(toIndentedString(availableInNewTerritories)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    contentRightsDeclaration: ").append(toIndentedString(contentRightsDeclaration)).append("\n");
    sb.append("    isOrEverWasMadeForKids: ").append(toIndentedString(isOrEverWasMadeForKids)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primaryLocale: ").append(toIndentedString(primaryLocale)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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

