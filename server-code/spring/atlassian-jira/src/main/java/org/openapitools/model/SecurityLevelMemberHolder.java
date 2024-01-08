package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The user or group being granted the permission. It consists of a &#x60;type&#x60; and a type-dependent &#x60;parameter&#x60;. See [Holder object](../api-group-permission-schemes/#holder-object) in *Get all permission schemes* for more information.
 */

@Schema(name = "SecurityLevelMember_holder", description = "The user or group being granted the permission. It consists of a `type` and a type-dependent `parameter`. See [Holder object](../api-group-permission-schemes/#holder-object) in *Get all permission schemes* for more information.")
@JsonTypeName("SecurityLevelMember_holder")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SecurityLevelMemberHolder {

  private String expand;

  private String parameter;

  private String type;

  private String value;

  public SecurityLevelMemberHolder() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SecurityLevelMemberHolder(String type) {
    this.type = type;
  }

  public SecurityLevelMemberHolder expand(String expand) {
    this.expand = expand;
    return this;
  }

  /**
   * Expand options that include additional permission holder details in the response.
   * @return expand
  */
  
  @Schema(name = "expand", accessMode = Schema.AccessMode.READ_ONLY, description = "Expand options that include additional permission holder details in the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expand")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public SecurityLevelMemberHolder parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

  /**
   * As a group's name can change, use of `value` is recommended. The identifier associated withthe `type` value that defines the holder of the permission.
   * @return parameter
  */
  
  @Schema(name = "parameter", description = "As a group's name can change, use of `value` is recommended. The identifier associated withthe `type` value that defines the holder of the permission.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameter")
  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

  public SecurityLevelMemberHolder type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of permission holder.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "The type of permission holder.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SecurityLevelMemberHolder value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The identifier associated with the `type` value that defines the holder of the permission.
   * @return value
  */
  
  @Schema(name = "value", description = "The identifier associated with the `type` value that defines the holder of the permission.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityLevelMemberHolder securityLevelMemberHolder = (SecurityLevelMemberHolder) o;
    return Objects.equals(this.expand, securityLevelMemberHolder.expand) &&
        Objects.equals(this.parameter, securityLevelMemberHolder.parameter) &&
        Objects.equals(this.type, securityLevelMemberHolder.type) &&
        Objects.equals(this.value, securityLevelMemberHolder.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, parameter, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityLevelMemberHolder {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

