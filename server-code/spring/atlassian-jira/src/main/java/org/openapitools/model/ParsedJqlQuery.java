package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.JqlQuery;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of a parsed JQL query.
 */

@Schema(name = "ParsedJqlQuery", description = "Details of a parsed JQL query.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ParsedJqlQuery {

  @Valid
  private Set<String> errors;

  private String query;

  private JqlQuery structure;

  public ParsedJqlQuery() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ParsedJqlQuery(String query) {
    this.query = query;
  }

  public ParsedJqlQuery errors(Set<String> errors) {
    this.errors = errors;
    return this;
  }

  public ParsedJqlQuery addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new LinkedHashSet<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * The list of syntax or validation errors.
   * @return errors
  */
  
  @Schema(name = "errors", description = "The list of syntax or validation errors.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public Set<String> getErrors() {
    return errors;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setErrors(Set<String> errors) {
    this.errors = errors;
  }

  public ParsedJqlQuery query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The JQL query that was parsed and validated.
   * @return query
  */
  @NotNull 
  @Schema(name = "query", description = "The JQL query that was parsed and validated.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public ParsedJqlQuery structure(JqlQuery structure) {
    this.structure = structure;
    return this;
  }

  /**
   * Get structure
   * @return structure
  */
  @Valid 
  @Schema(name = "structure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("structure")
  public JqlQuery getStructure() {
    return structure;
  }

  public void setStructure(JqlQuery structure) {
    this.structure = structure;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParsedJqlQuery parsedJqlQuery = (ParsedJqlQuery) o;
    return Objects.equals(this.errors, parsedJqlQuery.errors) &&
        Objects.equals(this.query, parsedJqlQuery.query) &&
        Objects.equals(this.structure, parsedJqlQuery.structure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, query, structure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParsedJqlQuery {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    structure: ").append(toIndentedString(structure)).append("\n");
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

