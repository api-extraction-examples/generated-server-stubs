package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DisplayModule;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ExperienceResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class ExperienceResponse {

  private String $schema;

  @Valid
  private List<@Valid DisplayModule> data = new ArrayList<>();

  public ExperienceResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExperienceResponse(String $schema, List<@Valid DisplayModule> data) {
    this.$schema = $schema;
    this.data = data;
  }

  public ExperienceResponse $schema(String $schema) {
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

  public ExperienceResponse data(List<@Valid DisplayModule> data) {
    this.data = data;
    return this;
  }

  public ExperienceResponse addDataItem(DisplayModule dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public List<@Valid DisplayModule> getData() {
    return data;
  }

  public void setData(List<@Valid DisplayModule> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperienceResponse experienceResponse = (ExperienceResponse) o;
    return Objects.equals(this.$schema, experienceResponse.$schema) &&
        Objects.equals(this.data, experienceResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash($schema, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperienceResponse {\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

