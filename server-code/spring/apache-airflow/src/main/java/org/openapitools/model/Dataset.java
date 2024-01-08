package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DagScheduleDatasetReference;
import org.openapitools.model.TaskOutletDatasetReference;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A dataset item.  *New in version 2.4.0* 
 */

@Schema(name = "Dataset", description = "A dataset item.  *New in version 2.4.0* ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class Dataset {

  @Valid
  private List<@Valid DagScheduleDatasetReference> consumingDags;

  private String createdAt;

  private JsonNullable<Object> extra = JsonNullable.<Object>undefined();

  private Integer id;

  @Valid
  private List<@Valid TaskOutletDatasetReference> producingTasks;

  private String updatedAt;

  private String uri;

  public Dataset consumingDags(List<@Valid DagScheduleDatasetReference> consumingDags) {
    this.consumingDags = consumingDags;
    return this;
  }

  public Dataset addConsumingDagsItem(DagScheduleDatasetReference consumingDagsItem) {
    if (this.consumingDags == null) {
      this.consumingDags = new ArrayList<>();
    }
    this.consumingDags.add(consumingDagsItem);
    return this;
  }

  /**
   * Get consumingDags
   * @return consumingDags
  */
  @Valid 
  @Schema(name = "consuming_dags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("consuming_dags")
  public List<@Valid DagScheduleDatasetReference> getConsumingDags() {
    return consumingDags;
  }

  public void setConsumingDags(List<@Valid DagScheduleDatasetReference> consumingDags) {
    this.consumingDags = consumingDags;
  }

  public Dataset createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The dataset creation time
   * @return createdAt
  */
  
  @Schema(name = "created_at", description = "The dataset creation time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Dataset extra(Object extra) {
    this.extra = JsonNullable.of(extra);
    return this;
  }

  /**
   * The dataset extra
   * @return extra
  */
  
  @Schema(name = "extra", description = "The dataset extra", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extra")
  public JsonNullable<Object> getExtra() {
    return extra;
  }

  public void setExtra(JsonNullable<Object> extra) {
    this.extra = extra;
  }

  public Dataset id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The dataset id
   * @return id
  */
  
  @Schema(name = "id", description = "The dataset id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Dataset producingTasks(List<@Valid TaskOutletDatasetReference> producingTasks) {
    this.producingTasks = producingTasks;
    return this;
  }

  public Dataset addProducingTasksItem(TaskOutletDatasetReference producingTasksItem) {
    if (this.producingTasks == null) {
      this.producingTasks = new ArrayList<>();
    }
    this.producingTasks.add(producingTasksItem);
    return this;
  }

  /**
   * Get producingTasks
   * @return producingTasks
  */
  @Valid 
  @Schema(name = "producing_tasks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("producing_tasks")
  public List<@Valid TaskOutletDatasetReference> getProducingTasks() {
    return producingTasks;
  }

  public void setProducingTasks(List<@Valid TaskOutletDatasetReference> producingTasks) {
    this.producingTasks = producingTasks;
  }

  public Dataset updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The dataset update time
   * @return updatedAt
  */
  
  @Schema(name = "updated_at", description = "The dataset update time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Dataset uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * The dataset uri
   * @return uri
  */
  
  @Schema(name = "uri", description = "The dataset uri", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dataset dataset = (Dataset) o;
    return Objects.equals(this.consumingDags, dataset.consumingDags) &&
        Objects.equals(this.createdAt, dataset.createdAt) &&
        equalsNullable(this.extra, dataset.extra) &&
        Objects.equals(this.id, dataset.id) &&
        Objects.equals(this.producingTasks, dataset.producingTasks) &&
        Objects.equals(this.updatedAt, dataset.updatedAt) &&
        Objects.equals(this.uri, dataset.uri);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumingDags, createdAt, hashCodeNullable(extra), id, producingTasks, updatedAt, uri);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dataset {\n");
    sb.append("    consumingDags: ").append(toIndentedString(consumingDags)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    producingTasks: ").append(toIndentedString(producingTasks)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

