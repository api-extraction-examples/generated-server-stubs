package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ClassReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TaskExtraLinksInner
 */

@JsonTypeName("Task_extra_links_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class TaskExtraLinksInner {

  private ClassReference classRef;

  public TaskExtraLinksInner classRef(ClassReference classRef) {
    this.classRef = classRef;
    return this;
  }

  /**
   * Get classRef
   * @return classRef
  */
  @Valid 
  @Schema(name = "class_ref", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("class_ref")
  public ClassReference getClassRef() {
    return classRef;
  }

  public void setClassRef(ClassReference classRef) {
    this.classRef = classRef;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskExtraLinksInner taskExtraLinksInner = (TaskExtraLinksInner) o;
    return Objects.equals(this.classRef, taskExtraLinksInner.classRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskExtraLinksInner {\n");
    sb.append("    classRef: ").append(toIndentedString(classRef)).append("\n");
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

