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
 * Metadata about collection.
 */

@Schema(name = "CollectionInfo", description = "Metadata about collection.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class CollectionInfo {

  private Integer totalEntries;

  public CollectionInfo totalEntries(Integer totalEntries) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionInfo collectionInfo = (CollectionInfo) o;
    return Objects.equals(this.totalEntries, collectionInfo.totalEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionInfo {\n");
    sb.append("    totalEntries: ").append(toIndentedString(totalEntries)).append("\n");
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

