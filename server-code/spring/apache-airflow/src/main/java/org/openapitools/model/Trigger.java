package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Trigger
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class Trigger {

  private String classpath;

  private String createdDate;

  private Integer id;

  private String kwargs;

  private JsonNullable<Integer> triggererId = JsonNullable.<Integer>undefined();

  public Trigger classpath(String classpath) {
    this.classpath = classpath;
    return this;
  }

  /**
   * Get classpath
   * @return classpath
  */
  
  @Schema(name = "classpath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("classpath")
  public String getClasspath() {
    return classpath;
  }

  public void setClasspath(String classpath) {
    this.classpath = classpath;
  }

  public Trigger createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  
  @Schema(name = "created_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_date")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public Trigger id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Trigger kwargs(String kwargs) {
    this.kwargs = kwargs;
    return this;
  }

  /**
   * Get kwargs
   * @return kwargs
  */
  
  @Schema(name = "kwargs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kwargs")
  public String getKwargs() {
    return kwargs;
  }

  public void setKwargs(String kwargs) {
    this.kwargs = kwargs;
  }

  public Trigger triggererId(Integer triggererId) {
    this.triggererId = JsonNullable.of(triggererId);
    return this;
  }

  /**
   * Get triggererId
   * @return triggererId
  */
  
  @Schema(name = "triggerer_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("triggerer_id")
  public JsonNullable<Integer> getTriggererId() {
    return triggererId;
  }

  public void setTriggererId(JsonNullable<Integer> triggererId) {
    this.triggererId = triggererId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trigger trigger = (Trigger) o;
    return Objects.equals(this.classpath, trigger.classpath) &&
        Objects.equals(this.createdDate, trigger.createdDate) &&
        Objects.equals(this.id, trigger.id) &&
        Objects.equals(this.kwargs, trigger.kwargs) &&
        equalsNullable(this.triggererId, trigger.triggererId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(classpath, createdDate, id, kwargs, hashCodeNullable(triggererId));
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
    sb.append("class Trigger {\n");
    sb.append("    classpath: ").append(toIndentedString(classpath)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kwargs: ").append(toIndentedString(kwargs)).append("\n");
    sb.append("    triggererId: ").append(toIndentedString(triggererId)).append("\n");
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

