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
 * Marchant Object
 */

@Schema(name = "Merchant", description = "Marchant Object")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class Merchant {

  private String id;

  private String name;

  public Merchant() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Merchant(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public Merchant id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Merchant id
   * @return id
  */
  @NotNull @Size(min = 1, max = 256) 
  @Schema(name = "id", example = "MerchantId", description = "Merchant id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Merchant name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Merchant name
   * @return name
  */
  @NotNull @Size(min = 1, max = 256) 
  @Schema(name = "name", example = "MerchantName", description = "Merchant name", requiredMode = Schema.RequiredMode.REQUIRED)
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
    Merchant merchant = (Merchant) o;
    return Objects.equals(this.id, merchant.id) &&
        Objects.equals(this.name, merchant.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Merchant {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

