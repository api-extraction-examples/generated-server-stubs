package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The position of the gadget.
 */

@Schema(name = "DashboardGadget_position", description = "The position of the gadget.")
@JsonTypeName("DashboardGadget_position")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class DashboardGadgetPosition {

  private Integer theColumnPositionOfTheGadget;

  private Integer theRowPositionOfTheGadget;

  public DashboardGadgetPosition() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DashboardGadgetPosition(Integer theColumnPositionOfTheGadget, Integer theRowPositionOfTheGadget) {
    this.theColumnPositionOfTheGadget = theColumnPositionOfTheGadget;
    this.theRowPositionOfTheGadget = theRowPositionOfTheGadget;
  }

  public DashboardGadgetPosition theColumnPositionOfTheGadget(Integer theColumnPositionOfTheGadget) {
    this.theColumnPositionOfTheGadget = theColumnPositionOfTheGadget;
    return this;
  }

  /**
   * Get theColumnPositionOfTheGadget
   * @return theColumnPositionOfTheGadget
  */
  @NotNull 
  @Schema(name = "The column position of the gadget.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("The column position of the gadget.")
  public Integer getTheColumnPositionOfTheGadget() {
    return theColumnPositionOfTheGadget;
  }

  public void setTheColumnPositionOfTheGadget(Integer theColumnPositionOfTheGadget) {
    this.theColumnPositionOfTheGadget = theColumnPositionOfTheGadget;
  }

  public DashboardGadgetPosition theRowPositionOfTheGadget(Integer theRowPositionOfTheGadget) {
    this.theRowPositionOfTheGadget = theRowPositionOfTheGadget;
    return this;
  }

  /**
   * Get theRowPositionOfTheGadget
   * @return theRowPositionOfTheGadget
  */
  @NotNull 
  @Schema(name = "The row position of the gadget.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("The row position of the gadget.")
  public Integer getTheRowPositionOfTheGadget() {
    return theRowPositionOfTheGadget;
  }

  public void setTheRowPositionOfTheGadget(Integer theRowPositionOfTheGadget) {
    this.theRowPositionOfTheGadget = theRowPositionOfTheGadget;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardGadgetPosition dashboardGadgetPosition = (DashboardGadgetPosition) o;
    return Objects.equals(this.theColumnPositionOfTheGadget, dashboardGadgetPosition.theColumnPositionOfTheGadget) &&
        Objects.equals(this.theRowPositionOfTheGadget, dashboardGadgetPosition.theRowPositionOfTheGadget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(theColumnPositionOfTheGadget, theRowPositionOfTheGadget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardGadgetPosition {\n");
    sb.append("    theColumnPositionOfTheGadget: ").append(toIndentedString(theColumnPositionOfTheGadget)).append("\n");
    sb.append("    theRowPositionOfTheGadget: ").append(toIndentedString(theRowPositionOfTheGadget)).append("\n");
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

