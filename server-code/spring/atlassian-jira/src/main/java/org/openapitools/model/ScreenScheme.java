package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PageBeanIssueTypeScreenScheme;
import org.openapitools.model.ScreenTypes;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A screen scheme.
 */

@Schema(name = "ScreenScheme", description = "A screen scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ScreenScheme {

  private String description;

  private Long id;

  private PageBeanIssueTypeScreenScheme issueTypeScreenSchemes;

  private String name;

  private ScreenTypes screens;

  public ScreenScheme description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the screen scheme.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the screen scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ScreenScheme id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the screen scheme.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the screen scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ScreenScheme issueTypeScreenSchemes(PageBeanIssueTypeScreenScheme issueTypeScreenSchemes) {
    this.issueTypeScreenSchemes = issueTypeScreenSchemes;
    return this;
  }

  /**
   * Get issueTypeScreenSchemes
   * @return issueTypeScreenSchemes
  */
  @Valid 
  @Schema(name = "issueTypeScreenSchemes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueTypeScreenSchemes")
  public PageBeanIssueTypeScreenScheme getIssueTypeScreenSchemes() {
    return issueTypeScreenSchemes;
  }

  public void setIssueTypeScreenSchemes(PageBeanIssueTypeScreenScheme issueTypeScreenSchemes) {
    this.issueTypeScreenSchemes = issueTypeScreenSchemes;
  }

  public ScreenScheme name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the screen scheme.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the screen scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScreenScheme screens(ScreenTypes screens) {
    this.screens = screens;
    return this;
  }

  /**
   * Get screens
   * @return screens
  */
  @Valid 
  @Schema(name = "screens", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ScreenScheme screenScheme = (ScreenScheme) o;
    return Objects.equals(this.description, screenScheme.description) &&
        Objects.equals(this.id, screenScheme.id) &&
        Objects.equals(this.issueTypeScreenSchemes, screenScheme.issueTypeScreenSchemes) &&
        Objects.equals(this.name, screenScheme.name) &&
        Objects.equals(this.screens, screenScheme.screens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, issueTypeScreenSchemes, name, screens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenScheme {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueTypeScreenSchemes: ").append(toIndentedString(issueTypeScreenSchemes)).append("\n");
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

