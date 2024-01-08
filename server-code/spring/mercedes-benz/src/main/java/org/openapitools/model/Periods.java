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
 * Periods
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:25.642267-04:00[America/Lower_Princes]")
public class Periods {

  private String from;

  private String until;

  public Periods() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Periods(String from, String until) {
    this.from = from;
    this.until = until;
  }

  public Periods from(String from) {
    this.from = from;
    return this;
  }

  /**
   * from
   * @return from
  */
  @NotNull 
  @Schema(name = "from", description = "from", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("from")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public Periods until(String until) {
    this.until = until;
    return this;
  }

  /**
   * until
   * @return until
  */
  @NotNull 
  @Schema(name = "until", description = "until", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("until")
  public String getUntil() {
    return until;
  }

  public void setUntil(String until) {
    this.until = until;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Periods periods = (Periods) o;
    return Objects.equals(this.from, periods.from) &&
        Objects.equals(this.until, periods.until);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, until);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Periods {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
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

