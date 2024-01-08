package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CategoryError;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CategoryErrorResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class CategoryErrorResponse {

  private String $schema;

  @Valid
  private List<@Valid CategoryError> errors = new ArrayList<>();

  public CategoryErrorResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CategoryErrorResponse(String $schema, List<@Valid CategoryError> errors) {
    this.$schema = $schema;
    this.errors = errors;
  }

  public CategoryErrorResponse $schema(String $schema) {
    this.$schema = $schema;
    return this;
  }

  /**
   * Get $schema
   * @return $schema
  */
  @NotNull 
  @Schema(name = "$schema", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("$schema")
  public String get$Schema() {
    return $schema;
  }

  public void set$Schema(String $schema) {
    this.$schema = $schema;
  }

  public CategoryErrorResponse errors(List<@Valid CategoryError> errors) {
    this.errors = errors;
    return this;
  }

  public CategoryErrorResponse addErrorsItem(CategoryError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @NotNull @Valid 
  @Schema(name = "errors", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errors")
  public List<@Valid CategoryError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid CategoryError> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryErrorResponse categoryErrorResponse = (CategoryErrorResponse) o;
    return Objects.equals(this.$schema, categoryErrorResponse.$schema) &&
        Objects.equals(this.errors, categoryErrorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash($schema, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryErrorResponse {\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

