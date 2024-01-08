package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.IssueFieldOptionConfiguration;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the options for a select list issue field.
 */

@Schema(name = "IssueFieldOption", description = "Details of the options for a select list issue field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueFieldOption {

  private IssueFieldOptionConfiguration config;

  private Long id;

  @Valid
  private Map<String, Object> properties = new HashMap<>();

  private String value;

  public IssueFieldOption() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueFieldOption(Long id, String value) {
    this.id = id;
    this.value = value;
  }

  public IssueFieldOption config(IssueFieldOptionConfiguration config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
  */
  @Valid 
  @Schema(name = "config", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("config")
  public IssueFieldOptionConfiguration getConfig() {
    return config;
  }

  public void setConfig(IssueFieldOptionConfiguration config) {
    this.config = config;
  }

  public IssueFieldOption id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the option. This is only unique within the select field's set of options.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The unique identifier for the option. This is only unique within the select field's set of options.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public IssueFieldOption properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  public IssueFieldOption putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * The properties of the object, as arbitrary key-value pairs. These properties can be searched using JQL, if the extractions (see [Issue Field Option Property Index](https://developer.atlassian.com/cloud/jira/platform/modules/issue-field-option-property-index/)) are defined in the descriptor for the issue field module.
   * @return properties
  */
  
  @Schema(name = "properties", description = "The properties of the object, as arbitrary key-value pairs. These properties can be searched using JQL, if the extractions (see [Issue Field Option Property Index](https://developer.atlassian.com/cloud/jira/platform/modules/issue-field-option-property-index/)) are defined in the descriptor for the issue field module.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public Map<String, Object> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  public IssueFieldOption value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The option's name, which is displayed in Jira.
   * @return value
  */
  @NotNull 
  @Schema(name = "value", description = "The option's name, which is displayed in Jira.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    IssueFieldOption issueFieldOption = (IssueFieldOption) o;
    return Objects.equals(this.config, issueFieldOption.config) &&
        Objects.equals(this.id, issueFieldOption.id) &&
        Objects.equals(this.properties, issueFieldOption.properties) &&
        Objects.equals(this.value, issueFieldOption.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, id, properties, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueFieldOption {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

