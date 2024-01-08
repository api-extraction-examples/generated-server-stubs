package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PodcastError;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PodcastErrorResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PodcastErrorResponse {

  private String $schema;

  @Valid
  private List<@Valid PodcastError> errors;

  public PodcastErrorResponse $schema(String $schema) {
    this.$schema = $schema;
    return this;
  }

  /**
   * Get $schema
   * @return $schema
  */
  
  @Schema(name = "$schema", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("$schema")
  public String get$Schema() {
    return $schema;
  }

  public void set$Schema(String $schema) {
    this.$schema = $schema;
  }

  public PodcastErrorResponse errors(List<@Valid PodcastError> errors) {
    this.errors = errors;
    return this;
  }

  public PodcastErrorResponse addErrorsItem(PodcastError errorsItem) {
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
  @Valid 
  @Schema(name = "errors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid PodcastError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid PodcastError> errors) {
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
    PodcastErrorResponse podcastErrorResponse = (PodcastErrorResponse) o;
    return Objects.equals(this.$schema, podcastErrorResponse.$schema) &&
        Objects.equals(this.errors, podcastErrorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash($schema, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodcastErrorResponse {\n");
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

