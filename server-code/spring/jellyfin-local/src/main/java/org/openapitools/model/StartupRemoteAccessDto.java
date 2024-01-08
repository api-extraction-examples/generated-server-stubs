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
 * Startup remote access dto.
 */

@Schema(name = "StartupRemoteAccessDto", description = "Startup remote access dto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class StartupRemoteAccessDto {

  private Boolean enableAutomaticPortMapping;

  private Boolean enableRemoteAccess;

  public StartupRemoteAccessDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StartupRemoteAccessDto(Boolean enableAutomaticPortMapping, Boolean enableRemoteAccess) {
    this.enableAutomaticPortMapping = enableAutomaticPortMapping;
    this.enableRemoteAccess = enableRemoteAccess;
  }

  public StartupRemoteAccessDto enableAutomaticPortMapping(Boolean enableAutomaticPortMapping) {
    this.enableAutomaticPortMapping = enableAutomaticPortMapping;
    return this;
  }

  /**
   * Gets or sets a value indicating whether enable automatic port mapping.
   * @return enableAutomaticPortMapping
  */
  @NotNull 
  @Schema(name = "EnableAutomaticPortMapping", description = "Gets or sets a value indicating whether enable automatic port mapping.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("EnableAutomaticPortMapping")
  public Boolean getEnableAutomaticPortMapping() {
    return enableAutomaticPortMapping;
  }

  public void setEnableAutomaticPortMapping(Boolean enableAutomaticPortMapping) {
    this.enableAutomaticPortMapping = enableAutomaticPortMapping;
  }

  public StartupRemoteAccessDto enableRemoteAccess(Boolean enableRemoteAccess) {
    this.enableRemoteAccess = enableRemoteAccess;
    return this;
  }

  /**
   * Gets or sets a value indicating whether enable remote access.
   * @return enableRemoteAccess
  */
  @NotNull 
  @Schema(name = "EnableRemoteAccess", description = "Gets or sets a value indicating whether enable remote access.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("EnableRemoteAccess")
  public Boolean getEnableRemoteAccess() {
    return enableRemoteAccess;
  }

  public void setEnableRemoteAccess(Boolean enableRemoteAccess) {
    this.enableRemoteAccess = enableRemoteAccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartupRemoteAccessDto startupRemoteAccessDto = (StartupRemoteAccessDto) o;
    return Objects.equals(this.enableAutomaticPortMapping, startupRemoteAccessDto.enableAutomaticPortMapping) &&
        Objects.equals(this.enableRemoteAccess, startupRemoteAccessDto.enableRemoteAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableAutomaticPortMapping, enableRemoteAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartupRemoteAccessDto {\n");
    sb.append("    enableAutomaticPortMapping: ").append(toIndentedString(enableAutomaticPortMapping)).append("\n");
    sb.append("    enableRemoteAccess: ").append(toIndentedString(enableRemoteAccess)).append("\n");
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

