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
 * Class reference
 */

@Schema(name = "ClassReference", description = "Class reference")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class ClassReference {

  private String className;

  private String modulePath;

  public ClassReference className(String className) {
    this.className = className;
    return this;
  }

  /**
   * Get className
   * @return className
  */
  
  @Schema(name = "class_name", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("class_name")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public ClassReference modulePath(String modulePath) {
    this.modulePath = modulePath;
    return this;
  }

  /**
   * Get modulePath
   * @return modulePath
  */
  
  @Schema(name = "module_path", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("module_path")
  public String getModulePath() {
    return modulePath;
  }

  public void setModulePath(String modulePath) {
    this.modulePath = modulePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassReference classReference = (ClassReference) o;
    return Objects.equals(this.className, classReference.className) &&
        Objects.equals(this.modulePath, classReference.modulePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(className, modulePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassReference {\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    modulePath: ").append(toIndentedString(modulePath)).append("\n");
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

