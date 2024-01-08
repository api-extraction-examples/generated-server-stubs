package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PersonalisedMusicError;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PersonalisedMusicErrorResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PersonalisedMusicErrorResponse {

  @Valid
  private List<@Valid PersonalisedMusicError> errors = new ArrayList<>();

  private String schema;

  public PersonalisedMusicErrorResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PersonalisedMusicErrorResponse(List<@Valid PersonalisedMusicError> errors, String schema) {
    this.errors = errors;
    this.schema = schema;
  }

  public PersonalisedMusicErrorResponse errors(List<@Valid PersonalisedMusicError> errors) {
    this.errors = errors;
    return this;
  }

  public PersonalisedMusicErrorResponse addErrorsItem(PersonalisedMusicError errorsItem) {
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
  public List<@Valid PersonalisedMusicError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid PersonalisedMusicError> errors) {
    this.errors = errors;
  }

  public PersonalisedMusicErrorResponse schema(String schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   * @return schema
  */
  @NotNull 
  @Schema(name = "schema", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schema")
  public String getSchema() {
    return schema;
  }

  public void setSchema(String schema) {
    this.schema = schema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalisedMusicErrorResponse personalisedMusicErrorResponse = (PersonalisedMusicErrorResponse) o;
    return Objects.equals(this.errors, personalisedMusicErrorResponse.errors) &&
        Objects.equals(this.schema, personalisedMusicErrorResponse.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalisedMusicErrorResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

