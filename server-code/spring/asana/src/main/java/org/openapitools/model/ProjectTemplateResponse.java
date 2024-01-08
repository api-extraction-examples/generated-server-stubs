package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DateVariableCompact;
import org.openapitools.model.ProjectTemplateBaseAllOfOwner;
import org.openapitools.model.ProjectTemplateBaseAllOfTeam;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProjectTemplateResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class ProjectTemplateResponse {

  private String gid;

  private String resourceType;

  private String name;

  /**
   * Color of the project template.
   */
  public enum ColorEnum {
    DARK_PINK("dark-pink"),
    
    DARK_GREEN("dark-green"),
    
    DARK_BLUE("dark-blue"),
    
    DARK_RED("dark-red"),
    
    DARK_TEAL("dark-teal"),
    
    DARK_BROWN("dark-brown"),
    
    DARK_ORANGE("dark-orange"),
    
    DARK_PURPLE("dark-purple"),
    
    DARK_WARM_GRAY("dark-warm-gray"),
    
    LIGHT_PINK("light-pink"),
    
    LIGHT_GREEN("light-green"),
    
    LIGHT_BLUE("light-blue"),
    
    LIGHT_RED("light-red"),
    
    LIGHT_TEAL("light-teal"),
    
    LIGHT_BROWN("light-brown"),
    
    LIGHT_ORANGE("light-orange"),
    
    LIGHT_PURPLE("light-purple"),
    
    LIGHT_WARM_GRAY("light-warm-gray");

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
      return null;
    }
  }

  private JsonNullable<ColorEnum> color = JsonNullable.<ColorEnum>undefined();

  private String description;

  private String htmlDescription;

  private JsonNullable<ProjectTemplateBaseAllOfOwner> owner = JsonNullable.<ProjectTemplateBaseAllOfOwner>undefined();

  private Boolean _public;

  @Valid
  private List<@Valid DateVariableCompact> requestedDates;

  private ProjectTemplateBaseAllOfTeam team;

  public ProjectTemplateResponse gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
  */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public ProjectTemplateResponse resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
  */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public ProjectTemplateResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the project template.
   * @return name
  */
  
  @Schema(name = "name", example = "Packing list", description = "Name of the project template.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectTemplateResponse color(ColorEnum color) {
    this.color = JsonNullable.of(color);
    return this;
  }

  /**
   * Color of the project template.
   * @return color
  */
  
  @Schema(name = "color", example = "light-green", description = "Color of the project template.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public JsonNullable<ColorEnum> getColor() {
    return color;
  }

  public void setColor(JsonNullable<ColorEnum> color) {
    this.color = color;
  }

  public ProjectTemplateResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Free-form textual information associated with the project template
   * @return description
  */
  
  @Schema(name = "description", example = "These are things we need to pack for a trip.", description = "Free-form textual information associated with the project template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProjectTemplateResponse htmlDescription(String htmlDescription) {
    this.htmlDescription = htmlDescription;
    return this;
  }

  /**
   * The description of the project template with formatting as HTML.
   * @return htmlDescription
  */
  
  @Schema(name = "html_description", example = "<body>These are things we need to pack for a trip.</body>", description = "The description of the project template with formatting as HTML.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_description")
  public String getHtmlDescription() {
    return htmlDescription;
  }

  public void setHtmlDescription(String htmlDescription) {
    this.htmlDescription = htmlDescription;
  }

  public ProjectTemplateResponse owner(ProjectTemplateBaseAllOfOwner owner) {
    this.owner = JsonNullable.of(owner);
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public JsonNullable<ProjectTemplateBaseAllOfOwner> getOwner() {
    return owner;
  }

  public void setOwner(JsonNullable<ProjectTemplateBaseAllOfOwner> owner) {
    this.owner = owner;
  }

  public ProjectTemplateResponse _public(Boolean _public) {
    this._public = _public;
    return this;
  }

  /**
   * True if the project template is public to its team.
   * @return _public
  */
  
  @Schema(name = "public", example = "false", description = "True if the project template is public to its team.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("public")
  public Boolean getPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public ProjectTemplateResponse requestedDates(List<@Valid DateVariableCompact> requestedDates) {
    this.requestedDates = requestedDates;
    return this;
  }

  public ProjectTemplateResponse addRequestedDatesItem(DateVariableCompact requestedDatesItem) {
    if (this.requestedDates == null) {
      this.requestedDates = new ArrayList<>();
    }
    this.requestedDates.add(requestedDatesItem);
    return this;
  }

  /**
   * Array of date variables in this project template. Calendar dates must be provided for these variables when instantiating a project.
   * @return requestedDates
  */
  @Valid 
  @Schema(name = "requested_dates", accessMode = Schema.AccessMode.READ_ONLY, description = "Array of date variables in this project template. Calendar dates must be provided for these variables when instantiating a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requested_dates")
  public List<@Valid DateVariableCompact> getRequestedDates() {
    return requestedDates;
  }

  public void setRequestedDates(List<@Valid DateVariableCompact> requestedDates) {
    this.requestedDates = requestedDates;
  }

  public ProjectTemplateResponse team(ProjectTemplateBaseAllOfTeam team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
  */
  @Valid 
  @Schema(name = "team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team")
  public ProjectTemplateBaseAllOfTeam getTeam() {
    return team;
  }

  public void setTeam(ProjectTemplateBaseAllOfTeam team) {
    this.team = team;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectTemplateResponse projectTemplateResponse = (ProjectTemplateResponse) o;
    return Objects.equals(this.gid, projectTemplateResponse.gid) &&
        Objects.equals(this.resourceType, projectTemplateResponse.resourceType) &&
        Objects.equals(this.name, projectTemplateResponse.name) &&
        equalsNullable(this.color, projectTemplateResponse.color) &&
        Objects.equals(this.description, projectTemplateResponse.description) &&
        Objects.equals(this.htmlDescription, projectTemplateResponse.htmlDescription) &&
        equalsNullable(this.owner, projectTemplateResponse.owner) &&
        Objects.equals(this._public, projectTemplateResponse._public) &&
        Objects.equals(this.requestedDates, projectTemplateResponse.requestedDates) &&
        Objects.equals(this.team, projectTemplateResponse.team);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, hashCodeNullable(color), description, htmlDescription, hashCodeNullable(owner), _public, requestedDates, team);
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
    sb.append("class ProjectTemplateResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    htmlDescription: ").append(toIndentedString(htmlDescription)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    requestedDates: ").append(toIndentedString(requestedDates)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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

