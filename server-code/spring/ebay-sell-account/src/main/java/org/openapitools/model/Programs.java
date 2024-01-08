package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Program;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The base response type of the &lt;b&gt;getOptedInPrograms&lt;/b&gt; method.
 */

@Schema(name = "Programs", description = "The base response type of the <b>getOptedInPrograms</b> method.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class Programs {

  @Valid
  private List<@Valid Program> programs;

  public Programs programs(List<@Valid Program> programs) {
    this.programs = programs;
    return this;
  }

  public Programs addProgramsItem(Program programsItem) {
    if (this.programs == null) {
      this.programs = new ArrayList<>();
    }
    this.programs.add(programsItem);
    return this;
  }

  /**
   * An array of seller programs that the seller's account is opted in to.
   * @return programs
  */
  @Valid 
  @Schema(name = "programs", description = "An array of seller programs that the seller's account is opted in to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("programs")
  public List<@Valid Program> getPrograms() {
    return programs;
  }

  public void setPrograms(List<@Valid Program> programs) {
    this.programs = programs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Programs programs = (Programs) o;
    return Objects.equals(this.programs, programs.programs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Programs {\n");
    sb.append("    programs: ").append(toIndentedString(programs)).append("\n");
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

