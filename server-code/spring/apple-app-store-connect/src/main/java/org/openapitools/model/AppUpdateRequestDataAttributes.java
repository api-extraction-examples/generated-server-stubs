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
 * AppUpdateRequestDataAttributes
 */

@JsonTypeName("AppUpdateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppUpdateRequestDataAttributes {

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

  private String primaryLocale;

  public AppUpdateRequestDataAttributes availableInNewTerritories(Boolean availableInNewTerritories) {
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

  public AppUpdateRequestDataAttributes bundleId(String bundleId) {
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

  public AppUpdateRequestDataAttributes contentRightsDeclaration(ContentRightsDeclarationEnum contentRightsDeclaration) {
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

  public AppUpdateRequestDataAttributes primaryLocale(String primaryLocale) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppUpdateRequestDataAttributes appUpdateRequestDataAttributes = (AppUpdateRequestDataAttributes) o;
    return Objects.equals(this.availableInNewTerritories, appUpdateRequestDataAttributes.availableInNewTerritories) &&
        Objects.equals(this.bundleId, appUpdateRequestDataAttributes.bundleId) &&
        Objects.equals(this.contentRightsDeclaration, appUpdateRequestDataAttributes.contentRightsDeclaration) &&
        Objects.equals(this.primaryLocale, appUpdateRequestDataAttributes.primaryLocale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableInNewTerritories, bundleId, contentRightsDeclaration, primaryLocale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppUpdateRequestDataAttributes {\n");
    sb.append("    availableInNewTerritories: ").append(toIndentedString(availableInNewTerritories)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    contentRightsDeclaration: ").append(toIndentedString(contentRightsDeclaration)).append("\n");
    sb.append("    primaryLocale: ").append(toIndentedString(primaryLocale)).append("\n");
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

