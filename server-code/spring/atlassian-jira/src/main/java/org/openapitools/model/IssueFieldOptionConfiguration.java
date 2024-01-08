package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.IssueFieldOptionScopeBean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the projects the option is available in.
 */

@Schema(name = "IssueFieldOptionConfiguration", description = "Details of the projects the option is available in.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueFieldOptionConfiguration {

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

  private IssueFieldOptionScopeBean scope;

  public IssueFieldOptionConfiguration attributes(Set<AttributesEnum> attributes) {
    this.attributes = attributes;
    return this;
  }

  public IssueFieldOptionConfiguration addAttributesItem(AttributesEnum attributesItem) {
    if (this.attributes == null) {
      this.attributes = new LinkedHashSet<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * DEPRECATED
   * @return attributes
  */
  
  @Schema(name = "attributes", description = "DEPRECATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributes")
  public Set<AttributesEnum> getAttributes() {
    return attributes;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setAttributes(Set<AttributesEnum> attributes) {
    this.attributes = attributes;
  }

  public IssueFieldOptionConfiguration scope(IssueFieldOptionScopeBean scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  */
  @Valid 
  @Schema(name = "scope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scope")
  public IssueFieldOptionScopeBean getScope() {
    return scope;
  }

  public void setScope(IssueFieldOptionScopeBean scope) {
    this.scope = scope;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueFieldOptionConfiguration issueFieldOptionConfiguration = (IssueFieldOptionConfiguration) o;
    return Objects.equals(this.attributes, issueFieldOptionConfiguration.attributes) &&
        Objects.equals(this.scope, issueFieldOptionConfiguration.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueFieldOptionConfiguration {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

