package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Air00;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Cluster Output Object
 */

@Schema(name = "air01", description = "Cluster Output Object")
@JsonTypeName("air01")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:47.778831-04:00[America/Lower_Princes]")
public class Air01 {

  @Valid
  private List<@Valid Air00> clusterData;

  public Air01 clusterData(List<@Valid Air00> clusterData) {
    this.clusterData = clusterData;
    return this;
  }

  public Air01 addClusterDataItem(Air00 clusterDataItem) {
    if (this.clusterData == null) {
      this.clusterData = new ArrayList<>();
    }
    this.clusterData.add(clusterDataItem);
    return this;
  }

  /**
   * An array of state, county, or zip code cluster information
   * @return clusterData
  */
  @Valid 
  @Schema(name = "ClusterData", description = "An array of state, county, or zip code cluster information", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ClusterData")
  public List<@Valid Air00> getClusterData() {
    return clusterData;
  }

  public void setClusterData(List<@Valid Air00> clusterData) {
    this.clusterData = clusterData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Air01 air01 = (Air01) o;
    return Objects.equals(this.clusterData, air01.clusterData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Air01 {\n");
    sb.append("    clusterData: ").append(toIndentedString(clusterData)).append("\n");
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

