package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DagWarning;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Collection of DAG warnings. 
 */

@Schema(name = "DagWarningCollection", description = "Collection of DAG warnings. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class DagWarningCollection {

  private Integer totalEntries;

  @Valid
  private List<@Valid DagWarning> importErrors;

  public DagWarningCollection totalEntries(Integer totalEntries) {
    this.totalEntries = totalEntries;
    return this;
  }

  /**
   * Count of total objects in the current result set before pagination parameters (limit, offset) are applied. 
   * @return totalEntries
  */
  
  @Schema(name = "total_entries", description = "Count of total objects in the current result set before pagination parameters (limit, offset) are applied. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_entries")
  public Integer getTotalEntries() {
    return totalEntries;
  }

  public void setTotalEntries(Integer totalEntries) {
    this.totalEntries = totalEntries;
  }

  public DagWarningCollection importErrors(List<@Valid DagWarning> importErrors) {
    this.importErrors = importErrors;
    return this;
  }

  public DagWarningCollection addImportErrorsItem(DagWarning importErrorsItem) {
    if (this.importErrors == null) {
      this.importErrors = new ArrayList<>();
    }
    this.importErrors.add(importErrorsItem);
    return this;
  }

  /**
   * Get importErrors
   * @return importErrors
  */
  @Valid 
  @Schema(name = "import_errors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("import_errors")
  public List<@Valid DagWarning> getImportErrors() {
    return importErrors;
  }

  public void setImportErrors(List<@Valid DagWarning> importErrors) {
    this.importErrors = importErrors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DagWarningCollection dagWarningCollection = (DagWarningCollection) o;
    return Objects.equals(this.totalEntries, dagWarningCollection.totalEntries) &&
        Objects.equals(this.importErrors, dagWarningCollection.importErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalEntries, importErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DagWarningCollection {\n");
    sb.append("    totalEntries: ").append(toIndentedString(totalEntries)).append("\n");
    sb.append("    importErrors: ").append(toIndentedString(importErrors)).append("\n");
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

