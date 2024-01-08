package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppPricePointRelationshipsTerritory;
import org.openapitools.model.AppPriceRelationshipsPriceTier;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppPricePointRelationships
 */

@JsonTypeName("AppPricePoint_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppPricePointRelationships {

  private AppPriceRelationshipsPriceTier priceTier;

  private AppPricePointRelationshipsTerritory territory;

  public AppPricePointRelationships priceTier(AppPriceRelationshipsPriceTier priceTier) {
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

  public AppPricePointRelationships territory(AppPricePointRelationshipsTerritory territory) {
    this.territory = territory;
    return this;
  }

  /**
   * Get territory
   * @return territory
  */
  @Valid 
  @Schema(name = "territory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("territory")
  public AppPricePointRelationshipsTerritory getTerritory() {
    return territory;
  }

  public void setTerritory(AppPricePointRelationshipsTerritory territory) {
    this.territory = territory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppPricePointRelationships appPricePointRelationships = (AppPricePointRelationships) o;
    return Objects.equals(this.priceTier, appPricePointRelationships.priceTier) &&
        Objects.equals(this.territory, appPricePointRelationships.territory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceTier, territory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPricePointRelationships {\n");
    sb.append("    priceTier: ").append(toIndentedString(priceTier)).append("\n");
    sb.append("    territory: ").append(toIndentedString(territory)).append("\n");
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

