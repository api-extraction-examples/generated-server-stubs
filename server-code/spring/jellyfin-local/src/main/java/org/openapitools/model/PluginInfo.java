package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PluginStatus;
import org.openapitools.model.Version;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This is a serializable stub class that is used by the api to provide information about installed plugins.
 */

@Schema(name = "PluginInfo", description = "This is a serializable stub class that is used by the api to provide information about installed plugins.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class PluginInfo {

  private Boolean canUninstall;

  private JsonNullable<String> configurationFileName = JsonNullable.<String>undefined();

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private Boolean hasImage;

  private UUID id;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private PluginStatus status;

  private Version version;

  public PluginInfo canUninstall(Boolean canUninstall) {
    this.canUninstall = canUninstall;
    return this;
  }

  /**
   * Gets or sets a value indicating whether the plugin can be uninstalled.
   * @return canUninstall
  */
  
  @Schema(name = "CanUninstall", description = "Gets or sets a value indicating whether the plugin can be uninstalled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CanUninstall")
  public Boolean getCanUninstall() {
    return canUninstall;
  }

  public void setCanUninstall(Boolean canUninstall) {
    this.canUninstall = canUninstall;
  }

  public PluginInfo configurationFileName(String configurationFileName) {
    this.configurationFileName = JsonNullable.of(configurationFileName);
    return this;
  }

  /**
   * Gets or sets the name of the configuration file.
   * @return configurationFileName
  */
  
  @Schema(name = "ConfigurationFileName", description = "Gets or sets the name of the configuration file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ConfigurationFileName")
  public JsonNullable<String> getConfigurationFileName() {
    return configurationFileName;
  }

  public void setConfigurationFileName(JsonNullable<String> configurationFileName) {
    this.configurationFileName = configurationFileName;
  }

  public PluginInfo description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Gets or sets the description.
   * @return description
  */
  
  @Schema(name = "Description", description = "Gets or sets the description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public PluginInfo hasImage(Boolean hasImage) {
    this.hasImage = hasImage;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this plugin has a valid image.
   * @return hasImage
  */
  
  @Schema(name = "HasImage", description = "Gets or sets a value indicating whether this plugin has a valid image.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HasImage")
  public Boolean getHasImage() {
    return hasImage;
  }

  public void setHasImage(Boolean hasImage) {
    this.hasImage = hasImage;
  }

  public PluginInfo id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Gets or sets the unique id.
   * @return id
  */
  @Valid 
  @Schema(name = "Id", description = "Gets or sets the unique id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public PluginInfo name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets or sets the name.
   * @return name
  */
  
  @Schema(name = "Name", description = "Gets or sets the name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public PluginInfo status(PluginStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Status")
  public PluginStatus getStatus() {
    return status;
  }

  public void setStatus(PluginStatus status) {
    this.status = status;
  }

  public PluginInfo version(Version version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  @Valid 
  @Schema(name = "Version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Version")
  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
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
    PluginInfo pluginInfo = (PluginInfo) o;
    return Objects.equals(this.canUninstall, pluginInfo.canUninstall) &&
        equalsNullable(this.configurationFileName, pluginInfo.configurationFileName) &&
        equalsNullable(this.description, pluginInfo.description) &&
        Objects.equals(this.hasImage, pluginInfo.hasImage) &&
        Objects.equals(this.id, pluginInfo.id) &&
        equalsNullable(this.name, pluginInfo.name) &&
        Objects.equals(this.status, pluginInfo.status) &&
        Objects.equals(this.version, pluginInfo.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(canUninstall, hashCodeNullable(configurationFileName), hashCodeNullable(description), hasImage, id, hashCodeNullable(name), status, version);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginInfo {\n");
    sb.append("    canUninstall: ").append(toIndentedString(canUninstall)).append("\n");
    sb.append("    configurationFileName: ").append(toIndentedString(configurationFileName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hasImage: ").append(toIndentedString(hasImage)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

