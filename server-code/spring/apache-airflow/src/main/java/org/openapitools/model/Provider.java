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
 * The provider  *New in version 2.1.0* 
 */

@Schema(name = "Provider", description = "The provider  *New in version 2.1.0* ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class Provider {

  private String description;

  private String packageName;

  private String version;

  public Provider description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the provider.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the provider.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Provider packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * The package name of the provider.
   * @return packageName
  */
  
  @Schema(name = "package_name", description = "The package name of the provider.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("package_name")
  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  public Provider version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the provider.
   * @return version
  */
  
  @Schema(name = "version", description = "The version of the provider.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Provider provider = (Provider) o;
    return Objects.equals(this.description, provider.description) &&
        Objects.equals(this.packageName, provider.packageName) &&
        Objects.equals(this.version, provider.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, packageName, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Provider {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

