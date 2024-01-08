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
 * Plugin
 */

@JsonTypeName("plugin")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class Plugin {

  private String _package;

  private String pinnedVersion;

  public Plugin _package(String _package) {
    this._package = _package;
    return this;
  }

  /**
   * Get _package
   * @return _package
  */
  
  @Schema(name = "package", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("package")
  public String getPackage() {
    return _package;
  }

  public void setPackage(String _package) {
    this._package = _package;
  }

  public Plugin pinnedVersion(String pinnedVersion) {
    this.pinnedVersion = pinnedVersion;
    return this;
  }

  /**
   * Get pinnedVersion
   * @return pinnedVersion
  */
  
  @Schema(name = "pinned_version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pinned_version")
  public String getPinnedVersion() {
    return pinnedVersion;
  }

  public void setPinnedVersion(String pinnedVersion) {
    this.pinnedVersion = pinnedVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plugin plugin = (Plugin) o;
    return Objects.equals(this._package, plugin._package) &&
        Objects.equals(this.pinnedVersion, plugin.pinnedVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_package, pinnedVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plugin {\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    pinnedVersion: ").append(toIndentedString(pinnedVersion)).append("\n");
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

