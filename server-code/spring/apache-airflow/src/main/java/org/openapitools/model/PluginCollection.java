package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PluginCollectionItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A collection of plugin.  *New in version 2.1.0* 
 */

@Schema(name = "PluginCollection", description = "A collection of plugin.  *New in version 2.1.0* ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class PluginCollection {

  private Integer totalEntries;

  @Valid
  private List<@Valid PluginCollectionItem> plugins;

  public PluginCollection totalEntries(Integer totalEntries) {
    this.totalEntries = totalEntries;
    return this;
  }

  /**
   * Count of total objects in the current result set before pagination parameters (limit, offset) are applied. 
   * @return totalEntries
  */
  
  @Schema(name = "total_entries", description = "Count of total objects in the current result set before pagination parameters (limit, offset) are applied. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_entries")
  public Integer getTotalEntries() {
    return totalEntries;
  }

  public void setTotalEntries(Integer totalEntries) {
    this.totalEntries = totalEntries;
  }

  public PluginCollection plugins(List<@Valid PluginCollectionItem> plugins) {
    this.plugins = plugins;
    return this;
  }

  public PluginCollection addPluginsItem(PluginCollectionItem pluginsItem) {
    if (this.plugins == null) {
      this.plugins = new ArrayList<>();
    }
    this.plugins.add(pluginsItem);
    return this;
  }

  /**
   * Get plugins
   * @return plugins
  */
  @Valid 
  @Schema(name = "plugins", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("plugins")
  public List<@Valid PluginCollectionItem> getPlugins() {
    return plugins;
  }

  public void setPlugins(List<@Valid PluginCollectionItem> plugins) {
    this.plugins = plugins;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginCollection pluginCollection = (PluginCollection) o;
    return Objects.equals(this.totalEntries, pluginCollection.totalEntries) &&
        Objects.equals(this.plugins, pluginCollection.plugins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalEntries, plugins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginCollection {\n");
    sb.append("    totalEntries: ").append(toIndentedString(totalEntries)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
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

