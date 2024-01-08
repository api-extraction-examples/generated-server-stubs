package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppPriceTierRelationshipsPricePoints;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppPriceTierRelationships
 */

@JsonTypeName("AppPriceTier_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppPriceTierRelationships {

  private AppPriceTierRelationshipsPricePoints pricePoints;

  public AppPriceTierRelationships pricePoints(AppPriceTierRelationshipsPricePoints pricePoints) {
    this.pricePoints = pricePoints;
    return this;
  }

  /**
   * Get pricePoints
   * @return pricePoints
  */
  @Valid 
  @Schema(name = "pricePoints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pricePoints")
  public AppPriceTierRelationshipsPricePoints getPricePoints() {
    return pricePoints;
  }

  public void setPricePoints(AppPriceTierRelationshipsPricePoints pricePoints) {
    this.pricePoints = pricePoints;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppPriceTierRelationships appPriceTierRelationships = (AppPriceTierRelationships) o;
    return Objects.equals(this.pricePoints, appPriceTierRelationships.pricePoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pricePoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPriceTierRelationships {\n");
    sb.append("    pricePoints: ").append(toIndentedString(pricePoints)).append("\n");
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

