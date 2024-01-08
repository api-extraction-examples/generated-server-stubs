package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.JqlQueryFieldEntityProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A field used in a JQL query. See [Advanced searching - fields reference](https://confluence.atlassian.com/x/dAiiLQ) for more information about fields in JQL queries.
 */

@Schema(name = "JqlQueryField", description = "A field used in a JQL query. See [Advanced searching - fields reference](https://confluence.atlassian.com/x/dAiiLQ) for more information about fields in JQL queries.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JqlQueryField {

  private String encodedName;

  private String name;

  @Valid
  private List<@Valid JqlQueryFieldEntityProperty> property;

  public JqlQueryField() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JqlQueryField(String name) {
    this.name = name;
  }

  public JqlQueryField encodedName(String encodedName) {
    this.encodedName = encodedName;
    return this;
  }

  /**
   * The encoded name of the field, which can be used directly in a JQL query.
   * @return encodedName
  */
  
  @Schema(name = "encodedName", description = "The encoded name of the field, which can be used directly in a JQL query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("encodedName")
  public String getEncodedName() {
    return encodedName;
  }

  public void setEncodedName(String encodedName) {
    this.encodedName = encodedName;
  }

  public JqlQueryField name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the field.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the field.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JqlQueryField property(List<@Valid JqlQueryFieldEntityProperty> property) {
    this.property = property;
    return this;
  }

  public JqlQueryField addPropertyItem(JqlQueryFieldEntityProperty propertyItem) {
    if (this.property == null) {
      this.property = new ArrayList<>();
    }
    this.property.add(propertyItem);
    return this;
  }

  /**
   * When the field refers to a value in an entity property, details of the entity property value.
   * @return property
  */
  @Valid 
  @Schema(name = "property", description = "When the field refers to a value in an entity property, details of the entity property value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("property")
  public List<@Valid JqlQueryFieldEntityProperty> getProperty() {
    return property;
  }

  public void setProperty(List<@Valid JqlQueryFieldEntityProperty> property) {
    this.property = property;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQueryField jqlQueryField = (JqlQueryField) o;
    return Objects.equals(this.encodedName, jqlQueryField.encodedName) &&
        Objects.equals(this.name, jqlQueryField.name) &&
        Objects.equals(this.property, jqlQueryField.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodedName, name, property);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueryField {\n");
    sb.append("    encodedName: ").append(toIndentedString(encodedName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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

