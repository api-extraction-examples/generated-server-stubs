package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * IssueTypeCreateBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeCreateBean {

  private String description;

  private Integer hierarchyLevel;

  private String name;

  /**
   * Deprecated. Use `hierarchyLevel` instead. See the [deprecation notice](https://community.developer.atlassian.com/t/deprecation-of-the-epic-link-parent-link-and-other-related-fields-in-rest-apis-and-webhooks/54048) for details.  Whether the issue type is `subtype` or `standard`. Defaults to `standard`.
   */
  public enum TypeEnum {
    SUBTASK("subtask"),
    
    STANDARD("standard");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  public IssueTypeCreateBean() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTypeCreateBean(String name) {
    this.name = name;
  }

  public IssueTypeCreateBean description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the issue type.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the issue type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IssueTypeCreateBean hierarchyLevel(Integer hierarchyLevel) {
    this.hierarchyLevel = hierarchyLevel;
    return this;
  }

  /**
   * The hierarchy level of the issue type. Use:   *  `-1` for Subtask.  *  `0` for Base.  Defaults to `0`.
   * @return hierarchyLevel
  */
  
  @Schema(name = "hierarchyLevel", description = "The hierarchy level of the issue type. Use:   *  `-1` for Subtask.  *  `0` for Base.  Defaults to `0`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hierarchyLevel")
  public Integer getHierarchyLevel() {
    return hierarchyLevel;
  }

  public void setHierarchyLevel(Integer hierarchyLevel) {
    this.hierarchyLevel = hierarchyLevel;
  }

  public IssueTypeCreateBean name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The unique name for the issue type. The maximum length is 60 characters.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The unique name for the issue type. The maximum length is 60 characters.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IssueTypeCreateBean type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Deprecated. Use `hierarchyLevel` instead. See the [deprecation notice](https://community.developer.atlassian.com/t/deprecation-of-the-epic-link-parent-link-and-other-related-fields-in-rest-apis-and-webhooks/54048) for details.  Whether the issue type is `subtype` or `standard`. Defaults to `standard`.
   * @return type
  */
  
  @Schema(name = "type", description = "Deprecated. Use `hierarchyLevel` instead. See the [deprecation notice](https://community.developer.atlassian.com/t/deprecation-of-the-epic-link-parent-link-and-other-related-fields-in-rest-apis-and-webhooks/54048) for details.  Whether the issue type is `subtype` or `standard`. Defaults to `standard`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    IssueTypeCreateBean issueTypeCreateBean = (IssueTypeCreateBean) o;
    return Objects.equals(this.description, issueTypeCreateBean.description) &&
        Objects.equals(this.hierarchyLevel, issueTypeCreateBean.hierarchyLevel) &&
        Objects.equals(this.name, issueTypeCreateBean.name) &&
        Objects.equals(this.type, issueTypeCreateBean.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, hierarchyLevel, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeCreateBean {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hierarchyLevel: ").append(toIndentedString(hierarchyLevel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

