package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppEncryptionDeclarationRelationshipsApp;
import org.openapitools.model.AppPriceRelationshipsPriceTier;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppPriceRelationships
 */

@JsonTypeName("AppPrice_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppPriceRelationships {

  private AppEncryptionDeclarationRelationshipsApp app;

  private AppPriceRelationshipsPriceTier priceTier;

  public AppPriceRelationships app(AppEncryptionDeclarationRelationshipsApp app) {
    this.app = app;
    return this;
  }

  /**
   * Get app
   * @return app
  */
  @Valid 
  @Schema(name = "app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app")
  public AppEncryptionDeclarationRelationshipsApp getApp() {
    return app;
  }

  public void setApp(AppEncryptionDeclarationRelationshipsApp app) {
    this.app = app;
  }

  public AppPriceRelationships priceTier(AppPriceRelationshipsPriceTier priceTier) {
    this.priceTier = priceTier;
    return this;
  }

  /**
   * Get priceTier
   * @return priceTier
  */
  @Valid 
  @Schema(name = "priceTier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priceTier")
  public AppPriceRelationshipsPriceTier getPriceTier() {
    return priceTier;
  }

  public void setPriceTier(AppPriceRelationshipsPriceTier priceTier) {
    this.priceTier = priceTier;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppPriceRelationships appPriceRelationships = (AppPriceRelationships) o;
    return Objects.equals(this.app, appPriceRelationships.app) &&
        Objects.equals(this.priceTier, appPriceRelationships.priceTier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, priceTier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPriceRelationships {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    priceTier: ").append(toIndentedString(priceTier)).append("\n");
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

