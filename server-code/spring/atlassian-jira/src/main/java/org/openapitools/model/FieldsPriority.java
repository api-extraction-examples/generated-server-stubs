package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The priority of the linked issue.
 */

@Schema(name = "Fields_priority", description = "The priority of the linked issue.")
@JsonTypeName("Fields_priority")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FieldsPriority {

  private String description;

  private String iconUrl;

  private String id;

  private Boolean isDefault;

  private String name;

  private String self;

  private String statusColor;

  public FieldsPriority description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the issue priority.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the issue priority.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FieldsPriority iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * The URL of the icon for the issue priority.
   * @return iconUrl
  */
  
  @Schema(name = "iconUrl", description = "The URL of the icon for the issue priority.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iconUrl")
  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  public FieldsPriority id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the issue priority.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the issue priority.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FieldsPriority isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether this priority is the default.
   * @return isDefault
  */
  
  @Schema(name = "isDefault", description = "Whether this priority is the default.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDefault")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public FieldsPriority name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue priority.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the issue priority.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FieldsPriority self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the issue priority.
   * @return self
  */
  
  @Schema(name = "self", description = "The URL of the issue priority.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public FieldsPriority statusColor(String statusColor) {
    this.statusColor = statusColor;
    return this;
  }

  /**
   * The color used to indicate the issue priority.
   * @return statusColor
  */
  
  @Schema(name = "statusColor", description = "The color used to indicate the issue priority.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusColor")
  public String getStatusColor() {
    return statusColor;
  }

  public void setStatusColor(String statusColor) {
    this.statusColor = statusColor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldsPriority fieldsPriority = (FieldsPriority) o;
    return Objects.equals(this.description, fieldsPriority.description) &&
        Objects.equals(this.iconUrl, fieldsPriority.iconUrl) &&
        Objects.equals(this.id, fieldsPriority.id) &&
        Objects.equals(this.isDefault, fieldsPriority.isDefault) &&
        Objects.equals(this.name, fieldsPriority.name) &&
        Objects.equals(this.self, fieldsPriority.self) &&
        Objects.equals(this.statusColor, fieldsPriority.statusColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, iconUrl, id, isDefault, name, self, statusColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldsPriority {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    statusColor: ").append(toIndentedString(statusColor)).append("\n");
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

