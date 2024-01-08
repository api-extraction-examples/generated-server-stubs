package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.StatusDetailsStatusCategory;
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
 * A status.
 */

@Schema(name = "StatusDetails", description = "A status.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class StatusDetails {

  private String description;

  private String iconUrl;

  private String id;

  private String name;

  private String self;

  private StatusDetailsStatusCategory statusCategory;

  public StatusDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the status.
   * @return description
  */
  
  @Schema(name = "description", accessMode = Schema.AccessMode.READ_ONLY, description = "The description of the status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StatusDetails iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * The URL of the icon used to represent the status.
   * @return iconUrl
  */
  
  @Schema(name = "iconUrl", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the icon used to represent the status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iconUrl")
  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  public StatusDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the status.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StatusDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the status.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StatusDetails self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the status.
   * @return self
  */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public StatusDetails statusCategory(StatusDetailsStatusCategory statusCategory) {
    this.statusCategory = statusCategory;
    return this;
  }

  /**
   * Get statusCategory
   * @return statusCategory
  */
  @Valid 
  @Schema(name = "statusCategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusCategory")
  public StatusDetailsStatusCategory getStatusCategory() {
    return statusCategory;
  }

  public void setStatusCategory(StatusDetailsStatusCategory statusCategory) {
    this.statusCategory = statusCategory;
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
    public StatusDetails putAdditionalProperty(String key, Object value) {
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
    StatusDetails statusDetails = (StatusDetails) o;
    return Objects.equals(this.description, statusDetails.description) &&
        Objects.equals(this.iconUrl, statusDetails.iconUrl) &&
        Objects.equals(this.id, statusDetails.id) &&
        Objects.equals(this.name, statusDetails.name) &&
        Objects.equals(this.self, statusDetails.self) &&
        Objects.equals(this.statusCategory, statusDetails.statusCategory) &&
    Objects.equals(this.additionalProperties, statusDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, iconUrl, id, name, self, statusCategory, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusDetails {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
    
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
