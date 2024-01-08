package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EntityProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of a changed worklog.
 */

@Schema(name = "ChangedWorklog", description = "Details of a changed worklog.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ChangedWorklog {

  @Valid
  private List<@Valid EntityProperty> properties;

  private Long updatedTime;

  private Long worklogId;

  public ChangedWorklog properties(List<@Valid EntityProperty> properties) {
    this.properties = properties;
    return this;
  }

  public ChangedWorklog addPropertiesItem(EntityProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * Details of properties associated with the change.
   * @return properties
  */
  @Valid 
  @Schema(name = "properties", accessMode = Schema.AccessMode.READ_ONLY, description = "Details of properties associated with the change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public List<@Valid EntityProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<@Valid EntityProperty> properties) {
    this.properties = properties;
  }

  public ChangedWorklog updatedTime(Long updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * The datetime of the change.
   * @return updatedTime
  */
  
  @Schema(name = "updatedTime", accessMode = Schema.AccessMode.READ_ONLY, description = "The datetime of the change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedTime")
  public Long getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Long updatedTime) {
    this.updatedTime = updatedTime;
  }

  public ChangedWorklog worklogId(Long worklogId) {
    this.worklogId = worklogId;
    return this;
  }

  /**
   * The ID of the worklog.
   * @return worklogId
  */
  
  @Schema(name = "worklogId", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the worklog.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("worklogId")
  public Long getWorklogId() {
    return worklogId;
  }

  public void setWorklogId(Long worklogId) {
    this.worklogId = worklogId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangedWorklog changedWorklog = (ChangedWorklog) o;
    return Objects.equals(this.properties, changedWorklog.properties) &&
        Objects.equals(this.updatedTime, changedWorklog.updatedTime) &&
        Objects.equals(this.worklogId, changedWorklog.worklogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, updatedTime, worklogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangedWorklog {\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    worklogId: ").append(toIndentedString(worklogId)).append("\n");
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

