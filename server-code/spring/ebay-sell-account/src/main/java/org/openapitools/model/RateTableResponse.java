package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RateTable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This type is the base response of the &lt;b&gt;getRateTables&lt;/b&gt; method.
 */

@Schema(name = "RateTableResponse", description = "This type is the base response of the <b>getRateTables</b> method.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class RateTableResponse {

  @Valid
  private List<@Valid RateTable> rateTables;

  public RateTableResponse rateTables(List<@Valid RateTable> rateTables) {
    this.rateTables = rateTables;
    return this;
  }

  public RateTableResponse addRateTablesItem(RateTable rateTablesItem) {
    if (this.rateTables == null) {
      this.rateTables = new ArrayList<>();
    }
    this.rateTables.add(rateTablesItem);
    return this;
  }

  /**
   * An array of all shipping rate tables defined for a marketplace (or all marketplaces if no <b>country_code</b> query parameter is used). This array will be returned as empty if the seller has no defined shipping rate tables for the specified marketplace.
   * @return rateTables
  */
  @Valid 
  @Schema(name = "rateTables", description = "An array of all shipping rate tables defined for a marketplace (or all marketplaces if no <b>country_code</b> query parameter is used). This array will be returned as empty if the seller has no defined shipping rate tables for the specified marketplace.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateTables")
  public List<@Valid RateTable> getRateTables() {
    return rateTables;
  }

  public void setRateTables(List<@Valid RateTable> rateTables) {
    this.rateTables = rateTables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateTableResponse rateTableResponse = (RateTableResponse) o;
    return Objects.equals(this.rateTables, rateTableResponse.rateTables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateTables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateTableResponse {\n");
    sb.append("    rateTables: ").append(toIndentedString(rateTables)).append("\n");
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

