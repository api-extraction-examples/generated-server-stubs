package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.StatusDetailsStatusCategory;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The status of the linked issue.
 */

@Schema(name = "Fields_status", description = "The status of the linked issue.")
@JsonTypeName("Fields_status")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FieldsStatus {

  private String description;

  private String iconUrl;

  private String id;

  private String name;

  private String self;

  private StatusDetailsStatusCategory statusCategory;

  public FieldsStatus description(String description) {
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

  public FieldsStatus iconUrl(String iconUrl) {
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

  public FieldsStatus id(String id) {
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

  public FieldsStatus name(String name) {
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

  public FieldsStatus self(String self) {
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

  public FieldsStatus statusCategory(StatusDetailsStatusCategory statusCategory) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldsStatus fieldsStatus = (FieldsStatus) o;
    return Objects.equals(this.description, fieldsStatus.description) &&
        Objects.equals(this.iconUrl, fieldsStatus.iconUrl) &&
        Objects.equals(this.id, fieldsStatus.id) &&
        Objects.equals(this.name, fieldsStatus.name) &&
        Objects.equals(this.self, fieldsStatus.self) &&
        Objects.equals(this.statusCategory, fieldsStatus.statusCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, iconUrl, id, name, self, statusCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldsStatus {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
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

