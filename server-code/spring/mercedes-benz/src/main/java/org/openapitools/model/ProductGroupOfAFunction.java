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
 * ProductGroupOfAFunction
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:25.642267-04:00[America/Lower_Princes]")
public class ProductGroupOfAFunction {

  private String code;

  private String name;

  public ProductGroupOfAFunction() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProductGroupOfAFunction(String code, String name) {
    this.code = code;
    this.name = name;
  }

  public ProductGroupOfAFunction code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The product group code, valid values are:   * PASSENGER-CAR   * VAN
   * @return code
  */
  @NotNull 
  @Schema(name = "code", description = "The product group code, valid values are:   * PASSENGER-CAR   * VAN", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ProductGroupOfAFunction name(String name) {
    this.name = name;
    return this;
  }

  /**
   * product group name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "product group name", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ProductGroupOfAFunction productGroupOfAFunction = (ProductGroupOfAFunction) o;
    return Objects.equals(this.code, productGroupOfAFunction.code) &&
        Objects.equals(this.name, productGroupOfAFunction.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroupOfAFunction {\n");
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

