package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
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
 * Defines the MediaBrowser.Common.Plugins.IPlugin.
 */

@Schema(name = "IPlugin", description = "Defines the MediaBrowser.Common.Plugins.IPlugin.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class IPlugin {

  private JsonNullable<String> assemblyFilePath = JsonNullable.<String>undefined();

  private Boolean canUninstall;

  private JsonNullable<String> dataFolderPath = JsonNullable.<String>undefined();

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private UUID id;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private Version version;

  public IPlugin assemblyFilePath(String assemblyFilePath) {
    this.assemblyFilePath = JsonNullable.of(assemblyFilePath);
    return this;
  }

  /**
   * Gets the path to the assembly file.
   * @return assemblyFilePath
  */
  
  @Schema(name = "AssemblyFilePath", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets the path to the assembly file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AssemblyFilePath")
  public JsonNullable<String> getAssemblyFilePath() {
    return assemblyFilePath;
  }

  public void setAssemblyFilePath(JsonNullable<String> assemblyFilePath) {
    this.assemblyFilePath = assemblyFilePath;
  }

  public IPlugin canUninstall(Boolean canUninstall) {
    this.canUninstall = canUninstall;
    return this;
  }

  /**
   * Gets a value indicating whether the plugin can be uninstalled.
   * @return canUninstall
  */
  
  @Schema(name = "CanUninstall", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets a value indicating whether the plugin can be uninstalled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CanUninstall")
  public Boolean getCanUninstall() {
    return canUninstall;
  }

  public void setCanUninstall(Boolean canUninstall) {
    this.canUninstall = canUninstall;
  }

  public IPlugin dataFolderPath(String dataFolderPath) {
    this.dataFolderPath = JsonNullable.of(dataFolderPath);
    return this;
  }

  /**
   * Gets the full path to the data folder, where the plugin can store any miscellaneous files needed.
   * @return dataFolderPath
  */
  
  @Schema(name = "DataFolderPath", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets the full path to the data folder, where the plugin can store any miscellaneous files needed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DataFolderPath")
  public JsonNullable<String> getDataFolderPath() {
    return dataFolderPath;
  }

  public void setDataFolderPath(JsonNullable<String> dataFolderPath) {
    this.dataFolderPath = dataFolderPath;
  }

  public IPlugin description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Gets the Description.
   * @return description
  */
  
  @Schema(name = "Description", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets the Description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public IPlugin id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Gets the unique id.
   * @return id
  */
  @Valid 
  @Schema(name = "Id", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets the unique id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public IPlugin name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets the name of the plugin.
   * @return name
  */
  
  @Schema(name = "Name", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets the name of the plugin.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public IPlugin version(Version version) {
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
    IPlugin iplugin = (IPlugin) o;
    return equalsNullable(this.assemblyFilePath, iplugin.assemblyFilePath) &&
        Objects.equals(this.canUninstall, iplugin.canUninstall) &&
        equalsNullable(this.dataFolderPath, iplugin.dataFolderPath) &&
        equalsNullable(this.description, iplugin.description) &&
        Objects.equals(this.id, iplugin.id) &&
        equalsNullable(this.name, iplugin.name) &&
        Objects.equals(this.version, iplugin.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(assemblyFilePath), canUninstall, hashCodeNullable(dataFolderPath), hashCodeNullable(description), id, hashCodeNullable(name), version);
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
    sb.append("class IPlugin {\n");
    sb.append("    assemblyFilePath: ").append(toIndentedString(assemblyFilePath)).append("\n");
    sb.append("    canUninstall: ").append(toIndentedString(canUninstall)).append("\n");
    sb.append("    dataFolderPath: ").append(toIndentedString(dataFolderPath)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

