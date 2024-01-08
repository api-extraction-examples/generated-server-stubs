package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ScreenTypes;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of a screen scheme.
 */

@Schema(name = "ScreenSchemeDetails", description = "Details of a screen scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ScreenSchemeDetails {

  private String description;

  private String name;

  private ScreenTypes screens;

  public ScreenSchemeDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ScreenSchemeDetails(String name, ScreenTypes screens) {
    this.name = name;
    this.screens = screens;
  }

  public ScreenSchemeDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the screen scheme. The maximum length is 255 characters.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the screen scheme. The maximum length is 255 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ScreenSchemeDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the screen scheme. The name must be unique. The maximum length is 255 characters.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the screen scheme. The name must be unique. The maximum length is 255 characters.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScreenSchemeDetails screens(ScreenTypes screens) {
    this.screens = screens;
    return this;
  }

  /**
   * Get screens
   * @return screens
  */
  @NotNull @Valid 
  @Schema(name = "screens", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("screens")
  public ScreenTypes getScreens() {
    return screens;
  }

  public void setScreens(ScreenTypes screens) {
    this.screens = screens;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenSchemeDetails screenSchemeDetails = (ScreenSchemeDetails) o;
    return Objects.equals(this.description, screenSchemeDetails.description) &&
        Objects.equals(this.name, screenSchemeDetails.name) &&
        Objects.equals(this.screens, screenSchemeDetails.screens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, screens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenSchemeDetails {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    screens: ").append(toIndentedString(screens)).append("\n");
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

