package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WorkflowSchemeAssociations;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A container for a list of workflow schemes together with the projects they are associated with.
 */

@Schema(name = "ContainerOfWorkflowSchemeAssociations", description = "A container for a list of workflow schemes together with the projects they are associated with.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ContainerOfWorkflowSchemeAssociations {

  @Valid
  private List<@Valid WorkflowSchemeAssociations> values = new ArrayList<>();

  public ContainerOfWorkflowSchemeAssociations() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContainerOfWorkflowSchemeAssociations(List<@Valid WorkflowSchemeAssociations> values) {
    this.values = values;
  }

  public ContainerOfWorkflowSchemeAssociations values(List<@Valid WorkflowSchemeAssociations> values) {
    this.values = values;
    return this;
  }

  public ContainerOfWorkflowSchemeAssociations addValuesItem(WorkflowSchemeAssociations valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * A list of workflow schemes together with projects they are associated with.
   * @return values
  */
  @NotNull @Valid 
  @Schema(name = "values", description = "A list of workflow schemes together with projects they are associated with.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("values")
  public List<@Valid WorkflowSchemeAssociations> getValues() {
    return values;
  }

  public void setValues(List<@Valid WorkflowSchemeAssociations> values) {
    this.values = values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerOfWorkflowSchemeAssociations containerOfWorkflowSchemeAssociations = (ContainerOfWorkflowSchemeAssociations) o;
    return Objects.equals(this.values, containerOfWorkflowSchemeAssociations.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerOfWorkflowSchemeAssociations {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

