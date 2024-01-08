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
 * ClearDagRun
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class ClearDagRun {

  private Boolean dryRun = true;

  public ClearDagRun dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * If set, don't actually run this operation. The response will contain a list of task instances planned to be cleaned, but not modified in any way. 
   * @return dryRun
  */
  
  @Schema(name = "dry_run", description = "If set, don't actually run this operation. The response will contain a list of task instances planned to be cleaned, but not modified in any way. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dry_run")
  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearDagRun clearDagRun = (ClearDagRun) o;
    return Objects.equals(this.dryRun, clearDagRun.dryRun);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearDagRun {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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

