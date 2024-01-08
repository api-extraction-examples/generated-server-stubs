package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AvailableDashboardGadget;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The list of available gadgets.
 */

@Schema(name = "AvailableDashboardGadgetsResponse", description = "The list of available gadgets.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AvailableDashboardGadgetsResponse {

  @Valid
  private List<@Valid AvailableDashboardGadget> gadgets = new ArrayList<>();

  public AvailableDashboardGadgetsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AvailableDashboardGadgetsResponse(List<@Valid AvailableDashboardGadget> gadgets) {
    this.gadgets = gadgets;
  }

  public AvailableDashboardGadgetsResponse gadgets(List<@Valid AvailableDashboardGadget> gadgets) {
    this.gadgets = gadgets;
    return this;
  }

  public AvailableDashboardGadgetsResponse addGadgetsItem(AvailableDashboardGadget gadgetsItem) {
    if (this.gadgets == null) {
      this.gadgets = new ArrayList<>();
    }
    this.gadgets.add(gadgetsItem);
    return this;
  }

  /**
   * The list of available gadgets.
   * @return gadgets
  */
  @Valid 
  @Schema(name = "gadgets", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of available gadgets.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("gadgets")
  public List<@Valid AvailableDashboardGadget> getGadgets() {
    return gadgets;
  }

  public void setGadgets(List<@Valid AvailableDashboardGadget> gadgets) {
    this.gadgets = gadgets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableDashboardGadgetsResponse availableDashboardGadgetsResponse = (AvailableDashboardGadgetsResponse) o;
    return Objects.equals(this.gadgets, availableDashboardGadgetsResponse.gadgets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gadgets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableDashboardGadgetsResponse {\n");
    sb.append("    gadgets: ").append(toIndentedString(gadgets)).append("\n");
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

