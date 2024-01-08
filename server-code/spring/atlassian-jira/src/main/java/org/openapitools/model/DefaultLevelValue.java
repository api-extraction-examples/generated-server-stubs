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

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * Details of scheme and new default level.
 */

@Schema(name = "DefaultLevelValue", description = "Details of scheme and new default level.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class DefaultLevelValue {

  private String defaultLevelId;

  private String issueSecuritySchemeId;

  public DefaultLevelValue() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DefaultLevelValue(String defaultLevelId, String issueSecuritySchemeId) {
    this.defaultLevelId = defaultLevelId;
    this.issueSecuritySchemeId = issueSecuritySchemeId;
  }

  public DefaultLevelValue defaultLevelId(String defaultLevelId) {
    this.defaultLevelId = defaultLevelId;
    return this;
  }

  /**
   * The ID of the issue security level to set as default for the specified scheme. Providing null will reset the default level.
   * @return defaultLevelId
  */
  @NotNull 
  @Schema(name = "defaultLevelId", description = "The ID of the issue security level to set as default for the specified scheme. Providing null will reset the default level.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("defaultLevelId")
  public String getDefaultLevelId() {
    return defaultLevelId;
  }

  public void setDefaultLevelId(String defaultLevelId) {
    this.defaultLevelId = defaultLevelId;
  }

  public DefaultLevelValue issueSecuritySchemeId(String issueSecuritySchemeId) {
    this.issueSecuritySchemeId = issueSecuritySchemeId;
    return this;
  }

  /**
   * The ID of the issue security scheme to set default level for.
   * @return issueSecuritySchemeId
  */
  @NotNull 
  @Schema(name = "issueSecuritySchemeId", description = "The ID of the issue security scheme to set default level for.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueSecuritySchemeId")
  public String getIssueSecuritySchemeId() {
    return issueSecuritySchemeId;
  }

  public void setIssueSecuritySchemeId(String issueSecuritySchemeId) {
    this.issueSecuritySchemeId = issueSecuritySchemeId;
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
    public DefaultLevelValue putAdditionalProperty(String key, Object value) {
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
    DefaultLevelValue defaultLevelValue = (DefaultLevelValue) o;
    return Objects.equals(this.defaultLevelId, defaultLevelValue.defaultLevelId) &&
        Objects.equals(this.issueSecuritySchemeId, defaultLevelValue.issueSecuritySchemeId) &&
    Objects.equals(this.additionalProperties, defaultLevelValue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultLevelId, issueSecuritySchemeId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultLevelValue {\n");
    sb.append("    defaultLevelId: ").append(toIndentedString(defaultLevelId)).append("\n");
    sb.append("    issueSecuritySchemeId: ").append(toIndentedString(issueSecuritySchemeId)).append("\n");
    
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

