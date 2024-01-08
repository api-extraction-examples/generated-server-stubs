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
 * The category assigned to the status.
 */

@Schema(name = "StatusDetails_statusCategory", description = "The category assigned to the status.")
@JsonTypeName("StatusDetails_statusCategory")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class StatusDetailsStatusCategory {

  private String colorName;

  private Long id;

  private String key;

  private String name;

  private String self;

  public StatusDetailsStatusCategory colorName(String colorName) {
    this.colorName = colorName;
    return this;
  }

  /**
   * The name of the color used to represent the status category.
   * @return colorName
  */
  
  @Schema(name = "colorName", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the color used to represent the status category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("colorName")
  public String getColorName() {
    return colorName;
  }

  public void setColorName(String colorName) {
    this.colorName = colorName;
  }

  public StatusDetailsStatusCategory id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the status category.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the status category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public StatusDetailsStatusCategory key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the status category.
   * @return key
  */
  
  @Schema(name = "key", accessMode = Schema.AccessMode.READ_ONLY, description = "The key of the status category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public StatusDetailsStatusCategory name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the status category.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the status category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StatusDetailsStatusCategory self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the status category.
   * @return self
  */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the status category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusDetailsStatusCategory statusDetailsStatusCategory = (StatusDetailsStatusCategory) o;
    return Objects.equals(this.colorName, statusDetailsStatusCategory.colorName) &&
        Objects.equals(this.id, statusDetailsStatusCategory.id) &&
        Objects.equals(this.key, statusDetailsStatusCategory.key) &&
        Objects.equals(this.name, statusDetailsStatusCategory.name) &&
        Objects.equals(this.self, statusDetailsStatusCategory.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorName, id, key, name, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusDetailsStatusCategory {\n");
    sb.append("    colorName: ").append(toIndentedString(colorName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

