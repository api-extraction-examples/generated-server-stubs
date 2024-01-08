package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A plugin Item.  *New in version 2.1.0* 
 */

@Schema(name = "PluginCollectionItem", description = "A plugin Item.  *New in version 2.1.0* ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class PluginCollectionItem {

  @Valid
  private List<Object> appbuilderMenuItems;

  @Valid
  private List<Object> appbuilderViews;

  @Valid
  private List<String> executors;

  @Valid
  private List<Object> flaskBlueprints;

  @Valid
  private List<Object> globalOperatorExtraLinks;

  @Valid
  private List<String> hooks;

  @Valid
  private List<Object> macros;

  private String name;

  @Valid
  private List<Object> operatorExtraLinks;

  private JsonNullable<String> source = JsonNullable.<String>undefined();

  public PluginCollectionItem appbuilderMenuItems(List<Object> appbuilderMenuItems) {
    this.appbuilderMenuItems = appbuilderMenuItems;
    return this;
  }

  public PluginCollectionItem addAppbuilderMenuItemsItem(Object appbuilderMenuItemsItem) {
    if (this.appbuilderMenuItems == null) {
      this.appbuilderMenuItems = new ArrayList<>();
    }
    this.appbuilderMenuItems.add(appbuilderMenuItemsItem);
    return this;
  }

  /**
   * The Flask Appbuilder menu items
   * @return appbuilderMenuItems
  */
  
  @Schema(name = "appbuilder_menu_items", description = "The Flask Appbuilder menu items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appbuilder_menu_items")
  public List<Object> getAppbuilderMenuItems() {
    return appbuilderMenuItems;
  }

  public void setAppbuilderMenuItems(List<Object> appbuilderMenuItems) {
    this.appbuilderMenuItems = appbuilderMenuItems;
  }

  public PluginCollectionItem appbuilderViews(List<Object> appbuilderViews) {
    this.appbuilderViews = appbuilderViews;
    return this;
  }

  public PluginCollectionItem addAppbuilderViewsItem(Object appbuilderViewsItem) {
    if (this.appbuilderViews == null) {
      this.appbuilderViews = new ArrayList<>();
    }
    this.appbuilderViews.add(appbuilderViewsItem);
    return this;
  }

  /**
   * The appuilder views
   * @return appbuilderViews
  */
  
  @Schema(name = "appbuilder_views", description = "The appuilder views", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appbuilder_views")
  public List<Object> getAppbuilderViews() {
    return appbuilderViews;
  }

  public void setAppbuilderViews(List<Object> appbuilderViews) {
    this.appbuilderViews = appbuilderViews;
  }

  public PluginCollectionItem executors(List<String> executors) {
    this.executors = executors;
    return this;
  }

  public PluginCollectionItem addExecutorsItem(String executorsItem) {
    if (this.executors == null) {
      this.executors = new ArrayList<>();
    }
    this.executors.add(executorsItem);
    return this;
  }

  /**
   * The plugin executors
   * @return executors
  */
  
  @Schema(name = "executors", description = "The plugin executors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executors")
  public List<String> getExecutors() {
    return executors;
  }

  public void setExecutors(List<String> executors) {
    this.executors = executors;
  }

  public PluginCollectionItem flaskBlueprints(List<Object> flaskBlueprints) {
    this.flaskBlueprints = flaskBlueprints;
    return this;
  }

  public PluginCollectionItem addFlaskBlueprintsItem(Object flaskBlueprintsItem) {
    if (this.flaskBlueprints == null) {
      this.flaskBlueprints = new ArrayList<>();
    }
    this.flaskBlueprints.add(flaskBlueprintsItem);
    return this;
  }

  /**
   * The flask blueprints
   * @return flaskBlueprints
  */
  
  @Schema(name = "flask_blueprints", description = "The flask blueprints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flask_blueprints")
  public List<Object> getFlaskBlueprints() {
    return flaskBlueprints;
  }

  public void setFlaskBlueprints(List<Object> flaskBlueprints) {
    this.flaskBlueprints = flaskBlueprints;
  }

  public PluginCollectionItem globalOperatorExtraLinks(List<Object> globalOperatorExtraLinks) {
    this.globalOperatorExtraLinks = globalOperatorExtraLinks;
    return this;
  }

  public PluginCollectionItem addGlobalOperatorExtraLinksItem(Object globalOperatorExtraLinksItem) {
    if (this.globalOperatorExtraLinks == null) {
      this.globalOperatorExtraLinks = new ArrayList<>();
    }
    this.globalOperatorExtraLinks.add(globalOperatorExtraLinksItem);
    return this;
  }

  /**
   * The global operator extra links
   * @return globalOperatorExtraLinks
  */
  
  @Schema(name = "global_operator_extra_links", description = "The global operator extra links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("global_operator_extra_links")
  public List<Object> getGlobalOperatorExtraLinks() {
    return globalOperatorExtraLinks;
  }

  public void setGlobalOperatorExtraLinks(List<Object> globalOperatorExtraLinks) {
    this.globalOperatorExtraLinks = globalOperatorExtraLinks;
  }

  public PluginCollectionItem hooks(List<String> hooks) {
    this.hooks = hooks;
    return this;
  }

  public PluginCollectionItem addHooksItem(String hooksItem) {
    if (this.hooks == null) {
      this.hooks = new ArrayList<>();
    }
    this.hooks.add(hooksItem);
    return this;
  }

  /**
   * The plugin hooks
   * @return hooks
  */
  
  @Schema(name = "hooks", description = "The plugin hooks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hooks")
  public List<String> getHooks() {
    return hooks;
  }

  public void setHooks(List<String> hooks) {
    this.hooks = hooks;
  }

  public PluginCollectionItem macros(List<Object> macros) {
    this.macros = macros;
    return this;
  }

  public PluginCollectionItem addMacrosItem(Object macrosItem) {
    if (this.macros == null) {
      this.macros = new ArrayList<>();
    }
    this.macros.add(macrosItem);
    return this;
  }

  /**
   * The plugin macros
   * @return macros
  */
  
  @Schema(name = "macros", description = "The plugin macros", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("macros")
  public List<Object> getMacros() {
    return macros;
  }

  public void setMacros(List<Object> macros) {
    this.macros = macros;
  }

  public PluginCollectionItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the plugin
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the plugin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PluginCollectionItem operatorExtraLinks(List<Object> operatorExtraLinks) {
    this.operatorExtraLinks = operatorExtraLinks;
    return this;
  }

  public PluginCollectionItem addOperatorExtraLinksItem(Object operatorExtraLinksItem) {
    if (this.operatorExtraLinks == null) {
      this.operatorExtraLinks = new ArrayList<>();
    }
    this.operatorExtraLinks.add(operatorExtraLinksItem);
    return this;
  }

  /**
   * Operator extra links
   * @return operatorExtraLinks
  */
  
  @Schema(name = "operator_extra_links", description = "Operator extra links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operator_extra_links")
  public List<Object> getOperatorExtraLinks() {
    return operatorExtraLinks;
  }

  public void setOperatorExtraLinks(List<Object> operatorExtraLinks) {
    this.operatorExtraLinks = operatorExtraLinks;
  }

  public PluginCollectionItem source(String source) {
    this.source = JsonNullable.of(source);
    return this;
  }

  /**
   * The plugin source
   * @return source
  */
  
  @Schema(name = "source", description = "The plugin source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public JsonNullable<String> getSource() {
    return source;
  }

  public void setSource(JsonNullable<String> source) {
    this.source = source;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginCollectionItem pluginCollectionItem = (PluginCollectionItem) o;
    return Objects.equals(this.appbuilderMenuItems, pluginCollectionItem.appbuilderMenuItems) &&
        Objects.equals(this.appbuilderViews, pluginCollectionItem.appbuilderViews) &&
        Objects.equals(this.executors, pluginCollectionItem.executors) &&
        Objects.equals(this.flaskBlueprints, pluginCollectionItem.flaskBlueprints) &&
        Objects.equals(this.globalOperatorExtraLinks, pluginCollectionItem.globalOperatorExtraLinks) &&
        Objects.equals(this.hooks, pluginCollectionItem.hooks) &&
        Objects.equals(this.macros, pluginCollectionItem.macros) &&
        Objects.equals(this.name, pluginCollectionItem.name) &&
        Objects.equals(this.operatorExtraLinks, pluginCollectionItem.operatorExtraLinks) &&
        equalsNullable(this.source, pluginCollectionItem.source);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appbuilderMenuItems, appbuilderViews, executors, flaskBlueprints, globalOperatorExtraLinks, hooks, macros, name, operatorExtraLinks, hashCodeNullable(source));
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
    sb.append("class PluginCollectionItem {\n");
    sb.append("    appbuilderMenuItems: ").append(toIndentedString(appbuilderMenuItems)).append("\n");
    sb.append("    appbuilderViews: ").append(toIndentedString(appbuilderViews)).append("\n");
    sb.append("    executors: ").append(toIndentedString(executors)).append("\n");
    sb.append("    flaskBlueprints: ").append(toIndentedString(flaskBlueprints)).append("\n");
    sb.append("    globalOperatorExtraLinks: ").append(toIndentedString(globalOperatorExtraLinks)).append("\n");
    sb.append("    hooks: ").append(toIndentedString(hooks)).append("\n");
    sb.append("    macros: ").append(toIndentedString(macros)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operatorExtraLinks: ").append(toIndentedString(operatorExtraLinks)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

