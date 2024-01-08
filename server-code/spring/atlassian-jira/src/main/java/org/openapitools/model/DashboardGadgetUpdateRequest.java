package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.DashboardGadgetPosition;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The details of the gadget to update.
 */

@Schema(name = "DashboardGadgetUpdateRequest", description = "The details of the gadget to update.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class DashboardGadgetUpdateRequest {

  private String color;

  private DashboardGadgetPosition position;

  private String title;

  public DashboardGadgetUpdateRequest color(String color) {
    this.color = color;
    return this;
  }

  /**
   * The color of the gadget. Should be one of `blue`, `red`, `yellow`, `green`, `cyan`, `purple`, `gray`, or `white`.
   * @return color
  */
  
  @Schema(name = "color", description = "The color of the gadget. Should be one of `blue`, `red`, `yellow`, `green`, `cyan`, `purple`, `gray`, or `white`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public DashboardGadgetUpdateRequest position(DashboardGadgetPosition position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
  */
  @Valid 
  @Schema(name = "position", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("position")
  public DashboardGadgetPosition getPosition() {
    return position;
  }

  public void setPosition(DashboardGadgetPosition position) {
    this.position = position;
  }

  public DashboardGadgetUpdateRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the gadget.
   * @return title
  */
  
  @Schema(name = "title", description = "The title of the gadget.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardGadgetUpdateRequest dashboardGadgetUpdateRequest = (DashboardGadgetUpdateRequest) o;
    return Objects.equals(this.color, dashboardGadgetUpdateRequest.color) &&
        Objects.equals(this.position, dashboardGadgetUpdateRequest.position) &&
        Objects.equals(this.title, dashboardGadgetUpdateRequest.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, position, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardGadgetUpdateRequest {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

