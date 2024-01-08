package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DashboardGadget;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The list of gadgets on the dashboard.
 */

@Schema(name = "DashboardGadgetResponse", description = "The list of gadgets on the dashboard.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class DashboardGadgetResponse {

  @Valid
  private List<@Valid DashboardGadget> gadgets = new ArrayList<>();

  public DashboardGadgetResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DashboardGadgetResponse(List<@Valid DashboardGadget> gadgets) {
    this.gadgets = gadgets;
  }

  public DashboardGadgetResponse gadgets(List<@Valid DashboardGadget> gadgets) {
    this.gadgets = gadgets;
    return this;
  }

  public DashboardGadgetResponse addGadgetsItem(DashboardGadget gadgetsItem) {
    if (this.gadgets == null) {
      this.gadgets = new ArrayList<>();
    }
    this.gadgets.add(gadgetsItem);
    return this;
  }

  /**
   * The list of gadgets.
   * @return gadgets
  */
  @Valid 
  @Schema(name = "gadgets", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of gadgets.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("gadgets")
  public List<@Valid DashboardGadget> getGadgets() {
    return gadgets;
  }

  public void setGadgets(List<@Valid DashboardGadget> gadgets) {
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
    DashboardGadgetResponse dashboardGadgetResponse = (DashboardGadgetResponse) o;
    return Objects.equals(this.gadgets, dashboardGadgetResponse.gadgets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gadgets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardGadgetResponse {\n");
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

