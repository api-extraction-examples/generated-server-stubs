package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.DashboardGadgetPosition;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the settings for a dashboard gadget.
 */

@Schema(name = "DashboardGadgetSettings", description = "Details of the settings for a dashboard gadget.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class DashboardGadgetSettings {

  private String color;

  private Boolean ignoreUriAndModuleKeyValidation;

  private String moduleKey;

  private DashboardGadgetPosition position;

  private String title;

  private String uri;

  public DashboardGadgetSettings color(String color) {
    this.color = color;
    return this;
  }

  /**
   * The color of the gadget. Should be one of `blue`, `red`, `yellow`, `green`, `cyan`, `purple`, `gray`, or `white`.
   * @return color
  */
  
  @Schema(name = "color", description = "The color of the gadget. Should be one of `blue`, `red`, `yellow`, `green`, `cyan`, `purple`, `gray`, or `white`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public DashboardGadgetSettings ignoreUriAndModuleKeyValidation(Boolean ignoreUriAndModuleKeyValidation) {
    this.ignoreUriAndModuleKeyValidation = ignoreUriAndModuleKeyValidation;
    return this;
  }

  /**
   * Whether to ignore the validation of module key and URI. For example, when a gadget is created that is a part of an application that isn't installed.
   * @return ignoreUriAndModuleKeyValidation
  */
  
  @Schema(name = "ignoreUriAndModuleKeyValidation", description = "Whether to ignore the validation of module key and URI. For example, when a gadget is created that is a part of an application that isn't installed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ignoreUriAndModuleKeyValidation")
  public Boolean getIgnoreUriAndModuleKeyValidation() {
    return ignoreUriAndModuleKeyValidation;
  }

  public void setIgnoreUriAndModuleKeyValidation(Boolean ignoreUriAndModuleKeyValidation) {
    this.ignoreUriAndModuleKeyValidation = ignoreUriAndModuleKeyValidation;
  }

  public DashboardGadgetSettings moduleKey(String moduleKey) {
    this.moduleKey = moduleKey;
    return this;
  }

  /**
   * The module key of the gadget type. Can't be provided with `uri`.
   * @return moduleKey
  */
  
  @Schema(name = "moduleKey", description = "The module key of the gadget type. Can't be provided with `uri`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("moduleKey")
  public String getModuleKey() {
    return moduleKey;
  }

  public void setModuleKey(String moduleKey) {
    this.moduleKey = moduleKey;
  }

  public DashboardGadgetSettings position(DashboardGadgetPosition position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
  */
  @Valid 
  @Schema(name = "position", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("position")
  public DashboardGadgetPosition getPosition() {
    return position;
  }

  public void setPosition(DashboardGadgetPosition position) {
    this.position = position;
  }

  public DashboardGadgetSettings title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the gadget.
   * @return title
  */
  
  @Schema(name = "title", description = "The title of the gadget.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public DashboardGadgetSettings uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * The URI of the gadget type. Can't be provided with `moduleKey`.
   * @return uri
  */
  
  @Schema(name = "uri", description = "The URI of the gadget type. Can't be provided with `moduleKey`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardGadgetSettings dashboardGadgetSettings = (DashboardGadgetSettings) o;
    return Objects.equals(this.color, dashboardGadgetSettings.color) &&
        Objects.equals(this.ignoreUriAndModuleKeyValidation, dashboardGadgetSettings.ignoreUriAndModuleKeyValidation) &&
        Objects.equals(this.moduleKey, dashboardGadgetSettings.moduleKey) &&
        Objects.equals(this.position, dashboardGadgetSettings.position) &&
        Objects.equals(this.title, dashboardGadgetSettings.title) &&
        Objects.equals(this.uri, dashboardGadgetSettings.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, ignoreUriAndModuleKeyValidation, moduleKey, position, title, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardGadgetSettings {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    ignoreUriAndModuleKeyValidation: ").append(toIndentedString(ignoreUriAndModuleKeyValidation)).append("\n");
    sb.append("    moduleKey: ").append(toIndentedString(moduleKey)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

