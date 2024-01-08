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
 * A rule configuration.
 */

@Schema(name = "RuleConfiguration", description = "A rule configuration.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class RuleConfiguration {

  private Boolean disabled = false;

  private String tag;

  private String value;

  public RuleConfiguration() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RuleConfiguration(String value) {
    this.value = value;
  }

  public RuleConfiguration disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * EXPERIMENTAL: Whether the rule is disabled.
   * @return disabled
  */
  
  @Schema(name = "disabled", description = "EXPERIMENTAL: Whether the rule is disabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disabled")
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public RuleConfiguration tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * EXPERIMENTAL: A tag used to filter rules in [Get workflow transition rule configurations](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-workflow-transition-rules/#api-rest-api-3-workflow-rule-config-get).
   * @return tag
  */
  @Size(max = 255) 
  @Schema(name = "tag", description = "EXPERIMENTAL: A tag used to filter rules in [Get workflow transition rule configurations](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-workflow-transition-rules/#api-rest-api-3-workflow-rule-config-get).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public RuleConfiguration value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Configuration of the rule, as it is stored by the Connect or the Forge app on the rule configuration page.
   * @return value
  */
  @NotNull 
  @Schema(name = "value", description = "Configuration of the rule, as it is stored by the Connect or the Forge app on the rule configuration page.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    RuleConfiguration ruleConfiguration = (RuleConfiguration) o;
    return Objects.equals(this.disabled, ruleConfiguration.disabled) &&
        Objects.equals(this.tag, ruleConfiguration.tag) &&
        Objects.equals(this.value, ruleConfiguration.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, tag, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleConfiguration {\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

