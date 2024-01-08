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
 * ActivityOfAFunction
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:25.642267-04:00[America/Lower_Princes]")
public class ActivityOfAFunction {

  private String code;

  private String name;

  public ActivityOfAFunction() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ActivityOfAFunction(String code, String name) {
    this.code = code;
    this.name = name;
  }

  public ActivityOfAFunction code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The activity of the dealer, valid actitvity values are:   * PARTS: Spare Parts Sales   * SALES: Sales of new vehicles   * SERVICE: Maintaining and repair   * USED-VEHICLES-TRADE: Sales of used vehicles
   * @return code
  */
  @NotNull 
  @Schema(name = "code", description = "The activity of the dealer, valid actitvity values are:   * PARTS: Spare Parts Sales   * SALES: Sales of new vehicles   * SERVICE: Maintaining and repair   * USED-VEHICLES-TRADE: Sales of used vehicles", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ActivityOfAFunction name(String name) {
    this.name = name;
    return this;
  }

  /**
   * the corresponding activity name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "the corresponding activity name", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ActivityOfAFunction activityOfAFunction = (ActivityOfAFunction) o;
    return Objects.equals(this.code, activityOfAFunction.code) &&
        Objects.equals(this.name, activityOfAFunction.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityOfAFunction {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

