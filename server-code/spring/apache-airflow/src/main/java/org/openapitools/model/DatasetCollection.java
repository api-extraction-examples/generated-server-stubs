package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Dataset;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A collection of datasets.  *New in version 2.4.0* 
 */

@Schema(name = "DatasetCollection", description = "A collection of datasets.  *New in version 2.4.0* ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class DatasetCollection {

  private Integer totalEntries;

  @Valid
  private List<@Valid Dataset> datasets;

  public DatasetCollection totalEntries(Integer totalEntries) {
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

  public DatasetCollection datasets(List<@Valid Dataset> datasets) {
    this.datasets = datasets;
    return this;
  }

  public DatasetCollection addDatasetsItem(Dataset datasetsItem) {
    if (this.datasets == null) {
      this.datasets = new ArrayList<>();
    }
    this.datasets.add(datasetsItem);
    return this;
  }

  /**
   * Get datasets
   * @return datasets
  */
  @Valid 
  @Schema(name = "datasets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("datasets")
  public List<@Valid Dataset> getDatasets() {
    return datasets;
  }

  public void setDatasets(List<@Valid Dataset> datasets) {
    this.datasets = datasets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetCollection datasetCollection = (DatasetCollection) o;
    return Objects.equals(this.totalEntries, datasetCollection.totalEntries) &&
        Objects.equals(this.datasets, datasetCollection.datasets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalEntries, datasets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetCollection {\n");
    sb.append("    totalEntries: ").append(toIndentedString(totalEntries)).append("\n");
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
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

