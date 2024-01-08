package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.DashboardGadgetPosition;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of a gadget.
 */

@Schema(name = "DashboardGadget", description = "Details of a gadget.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class DashboardGadget {

  /**
   * The color of the gadget. Should be one of `blue`, `red`, `yellow`, `green`, `cyan`, `purple`, `gray`, or `white`.
   */
  public enum ColorEnum {
    BLUE("blue"),
    
    RED("red"),
    
    YELLOW("yellow"),
    
    GREEN("green"),
    
    CYAN("cyan"),
    
    PURPLE("purple"),
    
    GRAY("gray"),
    
    WHITE("white");

    private String value;

    ColorEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ColorEnum fromValue(String value) {
      for (ColorEnum b : ColorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ColorEnum color;

  private Long id;

  private String moduleKey;

  private DashboardGadgetPosition position;

  private String title;

  private String uri;

  public DashboardGadget() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DashboardGadget(ColorEnum color, Long id, DashboardGadgetPosition position, String title) {
    this.color = color;
    this.id = id;
    this.position = position;
    this.title = title;
  }

  public DashboardGadget color(ColorEnum color) {
    this.color = color;
    return this;
  }

  /**
   * The color of the gadget. Should be one of `blue`, `red`, `yellow`, `green`, `cyan`, `purple`, `gray`, or `white`.
   * @return color
  */
  
  @Schema(name = "color", accessMode = Schema.AccessMode.READ_ONLY, description = "The color of the gadget. Should be one of `blue`, `red`, `yellow`, `green`, `cyan`, `purple`, `gray`, or `white`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("color")
  public ColorEnum getColor() {
    return color;
  }

  public void setColor(ColorEnum color) {
    this.color = color;
  }

  public DashboardGadget id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the gadget instance.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the gadget instance.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DashboardGadget moduleKey(String moduleKey) {
    this.moduleKey = moduleKey;
    return this;
  }

  /**
   * The module key of the gadget type.
   * @return moduleKey
  */
  
  @Schema(name = "moduleKey", accessMode = Schema.AccessMode.READ_ONLY, description = "The module key of the gadget type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("moduleKey")
  public String getModuleKey() {
    return moduleKey;
  }

  public void setModuleKey(String moduleKey) {
    this.moduleKey = moduleKey;
  }

  public DashboardGadget position(DashboardGadgetPosition position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
  */
  @NotNull @Valid 
  @Schema(name = "position", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("position")
  public DashboardGadgetPosition getPosition() {
    return position;
  }

  public void setPosition(DashboardGadgetPosition position) {
    this.position = position;
  }

  public DashboardGadget title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the gadget.
   * @return title
  */
  
  @Schema(name = "title", accessMode = Schema.AccessMode.READ_ONLY, description = "The title of the gadget.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public DashboardGadget uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * The URI of the gadget type.
   * @return uri
  */
  
  @Schema(name = "uri", accessMode = Schema.AccessMode.READ_ONLY, description = "The URI of the gadget type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    DashboardGadget dashboardGadget = (DashboardGadget) o;
    return Objects.equals(this.color, dashboardGadget.color) &&
        Objects.equals(this.id, dashboardGadget.id) &&
        Objects.equals(this.moduleKey, dashboardGadget.moduleKey) &&
        Objects.equals(this.position, dashboardGadget.position) &&
        Objects.equals(this.title, dashboardGadget.title) &&
        Objects.equals(this.uri, dashboardGadget.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, id, moduleKey, position, title, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardGadget {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

