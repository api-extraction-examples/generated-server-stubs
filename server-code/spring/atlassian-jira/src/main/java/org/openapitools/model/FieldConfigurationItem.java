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
 * A field within a field configuration.
 */

@Schema(name = "FieldConfigurationItem", description = "A field within a field configuration.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FieldConfigurationItem {

  private String description;

  private String id;

  private Boolean isHidden;

  private Boolean isRequired;

  private String renderer;

  public FieldConfigurationItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FieldConfigurationItem(String id) {
    this.id = id;
  }

  public FieldConfigurationItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the field within the field configuration.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the field within the field configuration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FieldConfigurationItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the field within the field configuration.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the field within the field configuration.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FieldConfigurationItem isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  /**
   * Whether the field is hidden in the field configuration.
   * @return isHidden
  */
  
  @Schema(name = "isHidden", description = "Whether the field is hidden in the field configuration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isHidden")
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public FieldConfigurationItem isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

  /**
   * Whether the field is required in the field configuration.
   * @return isRequired
  */
  
  @Schema(name = "isRequired", description = "Whether the field is required in the field configuration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isRequired")
  public Boolean getIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public FieldConfigurationItem renderer(String renderer) {
    this.renderer = renderer;
    return this;
  }

  /**
   * The renderer type for the field within the field configuration.
   * @return renderer
  */
  
  @Schema(name = "renderer", description = "The renderer type for the field within the field configuration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("renderer")
  public String getRenderer() {
    return renderer;
  }

  public void setRenderer(String renderer) {
    this.renderer = renderer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldConfigurationItem fieldConfigurationItem = (FieldConfigurationItem) o;
    return Objects.equals(this.description, fieldConfigurationItem.description) &&
        Objects.equals(this.id, fieldConfigurationItem.id) &&
        Objects.equals(this.isHidden, fieldConfigurationItem.isHidden) &&
        Objects.equals(this.isRequired, fieldConfigurationItem.isRequired) &&
        Objects.equals(this.renderer, fieldConfigurationItem.renderer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, isHidden, isRequired, renderer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldConfigurationItem {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    renderer: ").append(toIndentedString(renderer)).append("\n");
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

