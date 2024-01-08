package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConfigurationPageType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The configuration page info.
 */

@Schema(name = "ConfigurationPageInfo", description = "The configuration page info.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ConfigurationPageInfo {

  private ConfigurationPageType configurationPageType;

  private JsonNullable<String> displayName = JsonNullable.<String>undefined();

  private Boolean enableInMainMenu;

  private JsonNullable<String> menuIcon = JsonNullable.<String>undefined();

  private JsonNullable<String> menuSection = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<UUID> pluginId = JsonNullable.<UUID>undefined();

  public ConfigurationPageInfo configurationPageType(ConfigurationPageType configurationPageType) {
    this.configurationPageType = configurationPageType;
    return this;
  }

  /**
   * Get configurationPageType
   * @return configurationPageType
  */
  @Valid 
  @Schema(name = "ConfigurationPageType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ConfigurationPageType")
  public ConfigurationPageType getConfigurationPageType() {
    return configurationPageType;
  }

  public void setConfigurationPageType(ConfigurationPageType configurationPageType) {
    this.configurationPageType = configurationPageType;
  }

  public ConfigurationPageInfo displayName(String displayName) {
    this.displayName = JsonNullable.of(displayName);
    return this;
  }

  /**
   * Gets or sets the display name.
   * @return displayName
  */
  
  @Schema(name = "DisplayName", description = "Gets or sets the display name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DisplayName")
  public JsonNullable<String> getDisplayName() {
    return displayName;
  }

  public void setDisplayName(JsonNullable<String> displayName) {
    this.displayName = displayName;
  }

  public ConfigurationPageInfo enableInMainMenu(Boolean enableInMainMenu) {
    this.enableInMainMenu = enableInMainMenu;
    return this;
  }

  /**
   * Gets or sets a value indicating whether the configurations page is enabled in the main menu.
   * @return enableInMainMenu
  */
  
  @Schema(name = "EnableInMainMenu", description = "Gets or sets a value indicating whether the configurations page is enabled in the main menu.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableInMainMenu")
  public Boolean getEnableInMainMenu() {
    return enableInMainMenu;
  }

  public void setEnableInMainMenu(Boolean enableInMainMenu) {
    this.enableInMainMenu = enableInMainMenu;
  }

  public ConfigurationPageInfo menuIcon(String menuIcon) {
    this.menuIcon = JsonNullable.of(menuIcon);
    return this;
  }

  /**
   * Gets or sets the menu icon.
   * @return menuIcon
  */
  
  @Schema(name = "MenuIcon", description = "Gets or sets the menu icon.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MenuIcon")
  public JsonNullable<String> getMenuIcon() {
    return menuIcon;
  }

  public void setMenuIcon(JsonNullable<String> menuIcon) {
    this.menuIcon = menuIcon;
  }

  public ConfigurationPageInfo menuSection(String menuSection) {
    this.menuSection = JsonNullable.of(menuSection);
    return this;
  }

  /**
   * Gets or sets the menu section.
   * @return menuSection
  */
  
  @Schema(name = "MenuSection", description = "Gets or sets the menu section.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MenuSection")
  public JsonNullable<String> getMenuSection() {
    return menuSection;
  }

  public void setMenuSection(JsonNullable<String> menuSection) {
    this.menuSection = menuSection;
  }

  public ConfigurationPageInfo name(String name) {
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

  public ConfigurationPageInfo pluginId(UUID pluginId) {
    this.pluginId = JsonNullable.of(pluginId);
    return this;
  }

  /**
   * Gets or sets the plugin id.
   * @return pluginId
  */
  @Valid 
  @Schema(name = "PluginId", description = "Gets or sets the plugin id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PluginId")
  public JsonNullable<UUID> getPluginId() {
    return pluginId;
  }

  public void setPluginId(JsonNullable<UUID> pluginId) {
    this.pluginId = pluginId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationPageInfo configurationPageInfo = (ConfigurationPageInfo) o;
    return Objects.equals(this.configurationPageType, configurationPageInfo.configurationPageType) &&
        equalsNullable(this.displayName, configurationPageInfo.displayName) &&
        Objects.equals(this.enableInMainMenu, configurationPageInfo.enableInMainMenu) &&
        equalsNullable(this.menuIcon, configurationPageInfo.menuIcon) &&
        equalsNullable(this.menuSection, configurationPageInfo.menuSection) &&
        equalsNullable(this.name, configurationPageInfo.name) &&
        equalsNullable(this.pluginId, configurationPageInfo.pluginId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationPageType, hashCodeNullable(displayName), enableInMainMenu, hashCodeNullable(menuIcon), hashCodeNullable(menuSection), hashCodeNullable(name), hashCodeNullable(pluginId));
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
    sb.append("class ConfigurationPageInfo {\n");
    sb.append("    configurationPageType: ").append(toIndentedString(configurationPageType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enableInMainMenu: ").append(toIndentedString(enableInMainMenu)).append("\n");
    sb.append("    menuIcon: ").append(toIndentedString(menuIcon)).append("\n");
    sb.append("    menuSection: ").append(toIndentedString(menuSection)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
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

