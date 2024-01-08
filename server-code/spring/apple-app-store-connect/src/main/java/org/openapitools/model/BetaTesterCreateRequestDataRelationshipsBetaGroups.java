package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AppRelationshipsBetaGroupsDataInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BetaTesterCreateRequestDataRelationshipsBetaGroups
 */

@JsonTypeName("BetaTesterCreateRequest_data_relationships_betaGroups")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaTesterCreateRequestDataRelationshipsBetaGroups {

  @Valid
  private List<@Valid AppRelationshipsBetaGroupsDataInner> data;

  public BetaTesterCreateRequestDataRelationshipsBetaGroups data(List<@Valid AppRelationshipsBetaGroupsDataInner> data) {
    this.data = data;
    return this;
  }

  public BetaTesterCreateRequestDataRelationshipsBetaGroups addDataItem(AppRelationshipsBetaGroupsDataInner dataItem) {
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
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public List<@Valid AppRelationshipsBetaGroupsDataInner> getData() {
    return data;
  }

  public void setData(List<@Valid AppRelationshipsBetaGroupsDataInner> data) {
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
    BetaTesterCreateRequestDataRelationshipsBetaGroups betaTesterCreateRequestDataRelationshipsBetaGroups = (BetaTesterCreateRequestDataRelationshipsBetaGroups) o;
    return Objects.equals(this.data, betaTesterCreateRequestDataRelationshipsBetaGroups.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaTesterCreateRequestDataRelationshipsBetaGroups {\n");
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

