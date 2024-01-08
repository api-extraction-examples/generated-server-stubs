package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Associated field configuration scheme and project.
 */

@Schema(name = "FieldConfigurationSchemeProjectAssociation", description = "Associated field configuration scheme and project.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FieldConfigurationSchemeProjectAssociation {

  private String fieldConfigurationSchemeId;

  private String projectId;

  public FieldConfigurationSchemeProjectAssociation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FieldConfigurationSchemeProjectAssociation(String projectId) {
    this.projectId = projectId;
  }

  public FieldConfigurationSchemeProjectAssociation fieldConfigurationSchemeId(String fieldConfigurationSchemeId) {
    this.fieldConfigurationSchemeId = fieldConfigurationSchemeId;
    return this;
  }

  /**
   * The ID of the field configuration scheme. If the field configuration scheme ID is `null`, the operation assigns the default field configuration scheme.
   * @return fieldConfigurationSchemeId
  */
  
  @Schema(name = "fieldConfigurationSchemeId", description = "The ID of the field configuration scheme. If the field configuration scheme ID is `null`, the operation assigns the default field configuration scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldConfigurationSchemeId")
  public String getFieldConfigurationSchemeId() {
    return fieldConfigurationSchemeId;
  }

  public void setFieldConfigurationSchemeId(String fieldConfigurationSchemeId) {
    this.fieldConfigurationSchemeId = fieldConfigurationSchemeId;
  }

  public FieldConfigurationSchemeProjectAssociation projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the project.
   * @return projectId
  */
  @NotNull 
  @Schema(name = "projectId", description = "The ID of the project.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldConfigurationSchemeProjectAssociation fieldConfigurationSchemeProjectAssociation = (FieldConfigurationSchemeProjectAssociation) o;
    return Objects.equals(this.fieldConfigurationSchemeId, fieldConfigurationSchemeProjectAssociation.fieldConfigurationSchemeId) &&
        Objects.equals(this.projectId, fieldConfigurationSchemeProjectAssociation.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldConfigurationSchemeId, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldConfigurationSchemeProjectAssociation {\n");
    sb.append("    fieldConfigurationSchemeId: ").append(toIndentedString(fieldConfigurationSchemeId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

