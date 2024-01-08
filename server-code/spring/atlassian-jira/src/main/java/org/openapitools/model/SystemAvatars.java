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
 * List of system avatars.
 */

@Schema(name = "SystemAvatars", description = "List of system avatars.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SystemAvatars {

  @Valid
  private List<@Valid Avatar> system;

  public SystemAvatars system(List<@Valid Avatar> system) {
    this.system = system;
    return this;
  }

  public SystemAvatars addSystemItem(Avatar systemItem) {
    if (this.system == null) {
      this.system = new ArrayList<>();
    }
    this.system.add(systemItem);
    return this;
  }

  /**
   * A list of avatar details.
   * @return system
  */
  @Valid 
  @Schema(name = "system", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of avatar details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    SystemAvatars systemAvatars = (SystemAvatars) o;
    return Objects.equals(this.system, systemAvatars.system);
  }

  @Override
  public int hashCode() {
    return Objects.hash(system);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemAvatars {\n");
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

