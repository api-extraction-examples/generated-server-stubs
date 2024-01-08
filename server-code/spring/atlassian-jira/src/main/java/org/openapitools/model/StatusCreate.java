package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the status being created.
 */

@Schema(name = "StatusCreate", description = "Details of the status being created.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class StatusCreate {

  private String description;

  private String name;

  /**
   * The category of the status.
   */
  public enum StatusCategoryEnum {
    TODO("TODO"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    DONE("DONE");

    private String value;

    StatusCategoryEnum(String value) {
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
    public static StatusCategoryEnum fromValue(String value) {
      for (StatusCategoryEnum b : StatusCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusCategoryEnum statusCategory;

  public StatusCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StatusCreate(String name, StatusCategoryEnum statusCategory) {
    this.name = name;
    this.statusCategory = statusCategory;
  }

  public StatusCreate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the status.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StatusCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the status.
   * @return name
  */
  @NotNull @Size(max = 255) 
  @Schema(name = "name", description = "The name of the status.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StatusCreate statusCategory(StatusCategoryEnum statusCategory) {
    this.statusCategory = statusCategory;
    return this;
  }

  /**
   * The category of the status.
   * @return statusCategory
  */
  @NotNull 
  @Schema(name = "statusCategory", description = "The category of the status.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("statusCategory")
  public StatusCategoryEnum getStatusCategory() {
    return statusCategory;
  }

  public void setStatusCategory(StatusCategoryEnum statusCategory) {
    this.statusCategory = statusCategory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCreate statusCreate = (StatusCreate) o;
    return Objects.equals(this.description, statusCreate.description) &&
        Objects.equals(this.name, statusCreate.name) &&
        Objects.equals(this.statusCategory, statusCreate.statusCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, statusCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCreate {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
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

