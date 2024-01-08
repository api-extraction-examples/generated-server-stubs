package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Avatar;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about system and custom avatars.
 */

@Schema(name = "Avatars", description = "Details about system and custom avatars.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Avatars {

  @Valid
  private List<@Valid Avatar> custom;

  @Valid
  private List<@Valid Avatar> system;

  public Avatars custom(List<@Valid Avatar> custom) {
    this.custom = custom;
    return this;
  }

  public Avatars addCustomItem(Avatar customItem) {
    if (this.custom == null) {
      this.custom = new ArrayList<>();
    }
    this.custom.add(customItem);
    return this;
  }

  /**
   * Custom avatars list.
   * @return custom
  */
  @Valid 
  @Schema(name = "custom", accessMode = Schema.AccessMode.READ_ONLY, description = "Custom avatars list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom")
  public List<@Valid Avatar> getCustom() {
    return custom;
  }

  public void setCustom(List<@Valid Avatar> custom) {
    this.custom = custom;
  }

  public Avatars system(List<@Valid Avatar> system) {
    this.system = system;
    return this;
  }

  public Avatars addSystemItem(Avatar systemItem) {
    if (this.system == null) {
      this.system = new ArrayList<>();
    }
    this.system.add(systemItem);
    return this;
  }

  /**
   * System avatars list.
   * @return system
  */
  @Valid 
  @Schema(name = "system", accessMode = Schema.AccessMode.READ_ONLY, description = "System avatars list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("system")
  public List<@Valid Avatar> getSystem() {
    return system;
  }

  public void setSystem(List<@Valid Avatar> system) {
    this.system = system;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Avatars avatars = (Avatars) o;
    return Objects.equals(this.custom, avatars.custom) &&
        Objects.equals(this.system, avatars.system);
  }

  @Override
  public int hashCode() {
    return Objects.hash(custom, system);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Avatars {\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
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

