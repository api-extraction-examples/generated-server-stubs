package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ProjectId;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The scope of the status.
 */

@Schema(name = "StatusScope", description = "The scope of the status.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class StatusScope {

  private ProjectId project;

  /**
   * The scope of the status. `GLOBAL` for company-managed projects and `PROJECT` for team-managed projects.
   */
  public enum TypeEnum {
    PROJECT("PROJECT"),
    
    GLOBAL("GLOBAL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  public StatusScope() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StatusScope(TypeEnum type) {
    this.type = type;
  }

  public StatusScope project(ProjectId project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
  */
  @Valid 
  @Schema(name = "project", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project")
  public ProjectId getProject() {
    return project;
  }

  public void setProject(ProjectId project) {
    this.project = project;
  }

  public StatusScope type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The scope of the status. `GLOBAL` for company-managed projects and `PROJECT` for team-managed projects.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "The scope of the status. `GLOBAL` for company-managed projects and `PROJECT` for team-managed projects.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusScope statusScope = (StatusScope) o;
    return Objects.equals(this.project, statusScope.project) &&
        Objects.equals(this.type, statusScope.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusScope {\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

