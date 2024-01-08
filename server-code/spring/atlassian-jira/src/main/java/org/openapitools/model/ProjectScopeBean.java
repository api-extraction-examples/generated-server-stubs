package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProjectScopeBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ProjectScopeBean {

  /**
   * Gets or Sets attributes
   */
  public enum AttributesEnum {
    NOTSELECTABLE("notSelectable"),
    
    DEFAULTVALUE("defaultValue");

    private String value;

    AttributesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AttributesEnum fromValue(String value) {
      for (AttributesEnum b : AttributesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private Set<AttributesEnum> attributes;

  private Long id;

  public ProjectScopeBean attributes(Set<AttributesEnum> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ProjectScopeBean addAttributesItem(AttributesEnum attributesItem) {
    if (this.attributes == null) {
      this.attributes = new LinkedHashSet<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Defines the behavior of the option in the project.If notSelectable is set, the option cannot be set as the field's value. This is useful for archiving an option that has previously been selected but shouldn't be used anymore.If defaultValue is set, the option is selected by default.
   * @return attributes
  */
  
  @Schema(name = "attributes", description = "Defines the behavior of the option in the project.If notSelectable is set, the option cannot be set as the field's value. This is useful for archiving an option that has previously been selected but shouldn't be used anymore.If defaultValue is set, the option is selected by default.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributes")
  public Set<AttributesEnum> getAttributes() {
    return attributes;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setAttributes(Set<AttributesEnum> attributes) {
    this.attributes = attributes;
  }

  public ProjectScopeBean id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the project that the option's behavior applies to.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the project that the option's behavior applies to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectScopeBean projectScopeBean = (ProjectScopeBean) o;
    return Objects.equals(this.attributes, projectScopeBean.attributes) &&
        Objects.equals(this.id, projectScopeBean.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectScopeBean {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

