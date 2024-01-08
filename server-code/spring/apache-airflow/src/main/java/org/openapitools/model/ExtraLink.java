package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ClassReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Additional links containing additional information about the task.
 */

@Schema(name = "ExtraLink", description = "Additional links containing additional information about the task.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class ExtraLink {

  private ClassReference classRef;

  private String href;

  private String name;

  public ExtraLink classRef(ClassReference classRef) {
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

  public ExtraLink href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
  */
  
  @Schema(name = "href", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ExtraLink name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraLink extraLink = (ExtraLink) o;
    return Objects.equals(this.classRef, extraLink.classRef) &&
        Objects.equals(this.href, extraLink.href) &&
        Objects.equals(this.name, extraLink.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classRef, href, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraLink {\n");
    sb.append("    classRef: ").append(toIndentedString(classRef)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

