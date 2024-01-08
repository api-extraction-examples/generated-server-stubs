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

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * IssueFieldOptionCreateBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueFieldOptionCreateBean {

  private IssueFieldOptionConfiguration config;

  @Valid
  private Map<String, Object> properties = new HashMap<>();

  private String value;

  public IssueFieldOptionCreateBean() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueFieldOptionCreateBean(String value) {
    this.value = value;
  }

  public IssueFieldOptionCreateBean config(IssueFieldOptionConfiguration config) {
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

  public IssueFieldOptionCreateBean properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  public IssueFieldOptionCreateBean putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * The properties of the option as arbitrary key-value pairs. These properties can be searched using JQL, if the extractions (see https://developer.atlassian.com/cloud/jira/platform/modules/issue-field-option-property-index/) are defined in the descriptor for the issue field module.
   * @return properties
  */
  
  @Schema(name = "properties", description = "The properties of the option as arbitrary key-value pairs. These properties can be searched using JQL, if the extractions (see https://developer.atlassian.com/cloud/jira/platform/modules/issue-field-option-property-index/) are defined in the descriptor for the issue field module.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public Map<String, Object> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  public IssueFieldOptionCreateBean value(String value) {
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
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public IssueFieldOptionCreateBean putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueFieldOptionCreateBean issueFieldOptionCreateBean = (IssueFieldOptionCreateBean) o;
    return Objects.equals(this.config, issueFieldOptionCreateBean.config) &&
        Objects.equals(this.properties, issueFieldOptionCreateBean.properties) &&
        Objects.equals(this.value, issueFieldOptionCreateBean.value) &&
    Objects.equals(this.additionalProperties, issueFieldOptionCreateBean.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, properties, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueFieldOptionCreateBean {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

