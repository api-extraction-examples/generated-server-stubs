package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SecuritySchemeLevelBean;
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
 * Issue security scheme and it&#39;s details
 */

@Schema(name = "CreateIssueSecuritySchemeDetails", description = "Issue security scheme and it's details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CreateIssueSecuritySchemeDetails {

  private String description;

  @Valid
  private List<@Valid SecuritySchemeLevelBean> levels;

  private String name;

  public CreateIssueSecuritySchemeDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateIssueSecuritySchemeDetails(String name) {
    this.name = name;
  }

  public CreateIssueSecuritySchemeDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the issue security scheme.
   * @return description
  */
  @Size(max = 255) 
  @Schema(name = "description", description = "The description of the issue security scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateIssueSecuritySchemeDetails levels(List<@Valid SecuritySchemeLevelBean> levels) {
    this.levels = levels;
    return this;
  }

  public CreateIssueSecuritySchemeDetails addLevelsItem(SecuritySchemeLevelBean levelsItem) {
    if (this.levels == null) {
      this.levels = new ArrayList<>();
    }
    this.levels.add(levelsItem);
    return this;
  }

  /**
   * The list of scheme levels which should be added to the security scheme.
   * @return levels
  */
  @Valid 
  @Schema(name = "levels", description = "The list of scheme levels which should be added to the security scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("levels")
  public List<@Valid SecuritySchemeLevelBean> getLevels() {
    return levels;
  }

  public void setLevels(List<@Valid SecuritySchemeLevelBean> levels) {
    this.levels = levels;
  }

  public CreateIssueSecuritySchemeDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue security scheme. Must be unique (case-insensitive).
   * @return name
  */
  @NotNull @Size(max = 60) 
  @Schema(name = "name", description = "The name of the issue security scheme. Must be unique (case-insensitive).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
    public CreateIssueSecuritySchemeDetails putAdditionalProperty(String key, Object value) {
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
    CreateIssueSecuritySchemeDetails createIssueSecuritySchemeDetails = (CreateIssueSecuritySchemeDetails) o;
    return Objects.equals(this.description, createIssueSecuritySchemeDetails.description) &&
        Objects.equals(this.levels, createIssueSecuritySchemeDetails.levels) &&
        Objects.equals(this.name, createIssueSecuritySchemeDetails.name) &&
    Objects.equals(this.additionalProperties, createIssueSecuritySchemeDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, levels, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIssueSecuritySchemeDetails {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    
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

