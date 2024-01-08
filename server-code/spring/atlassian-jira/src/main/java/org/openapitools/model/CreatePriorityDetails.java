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

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * Details of an issue priority.
 */

@Schema(name = "CreatePriorityDetails", description = "Details of an issue priority.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CreatePriorityDetails {

  private String description;

  /**
   * The URL of an icon for the priority. Accepted protocols are HTTP and HTTPS. Built in icons can also be used.
   */
  public enum IconUrlEnum {
    BLOCKER_PNG("/images/icons/priorities/blocker.png"),
    
    CRITICAL_PNG("/images/icons/priorities/critical.png"),
    
    HIGH_PNG("/images/icons/priorities/high.png"),
    
    HIGHEST_PNG("/images/icons/priorities/highest.png"),
    
    LOW_PNG("/images/icons/priorities/low.png"),
    
    LOWEST_PNG("/images/icons/priorities/lowest.png"),
    
    MAJOR_PNG("/images/icons/priorities/major.png"),
    
    MEDIUM_PNG("/images/icons/priorities/medium.png"),
    
    MINOR_PNG("/images/icons/priorities/minor.png"),
    
    TRIVIAL_PNG("/images/icons/priorities/trivial.png");

    private String value;

    IconUrlEnum(String value) {
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
    public static IconUrlEnum fromValue(String value) {
      for (IconUrlEnum b : IconUrlEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private IconUrlEnum iconUrl;

  private String name;

  private String statusColor;

  public CreatePriorityDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreatePriorityDetails(String name, String statusColor) {
    this.name = name;
    this.statusColor = statusColor;
  }

  public CreatePriorityDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the priority.
   * @return description
  */
  @Size(max = 255) 
  @Schema(name = "description", description = "The description of the priority.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreatePriorityDetails iconUrl(IconUrlEnum iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * The URL of an icon for the priority. Accepted protocols are HTTP and HTTPS. Built in icons can also be used.
   * @return iconUrl
  */
  @Size(max = 255) 
  @Schema(name = "iconUrl", description = "The URL of an icon for the priority. Accepted protocols are HTTP and HTTPS. Built in icons can also be used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iconUrl")
  public IconUrlEnum getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(IconUrlEnum iconUrl) {
    this.iconUrl = iconUrl;
  }

  public CreatePriorityDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the priority. Must be unique.
   * @return name
  */
  @NotNull @Size(max = 60) 
  @Schema(name = "name", description = "The name of the priority. Must be unique.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreatePriorityDetails statusColor(String statusColor) {
    this.statusColor = statusColor;
    return this;
  }

  /**
   * The status color of the priority in 3-digit or 6-digit hexadecimal format.
   * @return statusColor
  */
  @NotNull 
  @Schema(name = "statusColor", description = "The status color of the priority in 3-digit or 6-digit hexadecimal format.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("statusColor")
  public String getStatusColor() {
    return statusColor;
  }

  public void setStatusColor(String statusColor) {
    this.statusColor = statusColor;
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
    public CreatePriorityDetails putAdditionalProperty(String key, Object value) {
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
    CreatePriorityDetails createPriorityDetails = (CreatePriorityDetails) o;
    return Objects.equals(this.description, createPriorityDetails.description) &&
        Objects.equals(this.iconUrl, createPriorityDetails.iconUrl) &&
        Objects.equals(this.name, createPriorityDetails.name) &&
        Objects.equals(this.statusColor, createPriorityDetails.statusColor) &&
    Objects.equals(this.additionalProperties, createPriorityDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, iconUrl, name, statusColor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePriorityDetails {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statusColor: ").append(toIndentedString(statusColor)).append("\n");
    
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

