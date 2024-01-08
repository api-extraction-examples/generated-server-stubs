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
 * SecuritySchemeLevelMemberBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SecuritySchemeLevelMemberBean {

  private String parameter;

  private String type;

  public SecuritySchemeLevelMemberBean() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SecuritySchemeLevelMemberBean(String type) {
    this.type = type;
  }

  public SecuritySchemeLevelMemberBean parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

  /**
   * The value corresponding to the specified member type.
   * @return parameter
  */
  
  @Schema(name = "parameter", description = "The value corresponding to the specified member type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameter")
  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

  public SecuritySchemeLevelMemberBean type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The issue security level member type, e.g `reporter`, `group`, `user`.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "The issue security level member type, e.g `reporter`, `group`, `user`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritySchemeLevelMemberBean securitySchemeLevelMemberBean = (SecuritySchemeLevelMemberBean) o;
    return Objects.equals(this.parameter, securitySchemeLevelMemberBean.parameter) &&
        Objects.equals(this.type, securitySchemeLevelMemberBean.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameter, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritySchemeLevelMemberBean {\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

