package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.TeamResponseAllOfOrganization;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TeamResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class TeamResponse {

  private String gid;

  private String resourceType;

  private String name;

  private String description;

  private String htmlDescription;

  private TeamResponseAllOfOrganization organization;

  private String permalinkUrl;

  /**
   * The visibility of the team to users in the same organization 
   */
  public enum VisibilityEnum {
    SECRET("secret"),
    
    REQUEST_TO_JOIN("request_to_join"),
    
    PUBLIC("public");

    private String value;

    VisibilityEnum(String value) {
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
    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private VisibilityEnum visibility;

  public TeamResponse gid(String gid) {
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

  public TeamResponse resourceType(String resourceType) {
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

  public TeamResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the team.
   * @return name
  */
  
  @Schema(name = "name", example = "Marketing", description = "The name of the team.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TeamResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * [Opt In](/docs/input-output-options). The description of the team. 
   * @return description
  */
  
  @Schema(name = "description", example = "All developers should be members of this team.", description = "[Opt In](/docs/input-output-options). The description of the team. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TeamResponse htmlDescription(String htmlDescription) {
    this.htmlDescription = htmlDescription;
    return this;
  }

  /**
   * [Opt In](/docs/input-output-options). The description of the team with formatting as HTML. 
   * @return htmlDescription
  */
  
  @Schema(name = "html_description", example = "<body><em>All</em> developers should be members of this team.</body>", description = "[Opt In](/docs/input-output-options). The description of the team with formatting as HTML. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_description")
  public String getHtmlDescription() {
    return htmlDescription;
  }

  public void setHtmlDescription(String htmlDescription) {
    this.htmlDescription = htmlDescription;
  }

  public TeamResponse organization(TeamResponseAllOfOrganization organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
  */
  @Valid 
  @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organization")
  public TeamResponseAllOfOrganization getOrganization() {
    return organization;
  }

  public void setOrganization(TeamResponseAllOfOrganization organization) {
    this.organization = organization;
  }

  public TeamResponse permalinkUrl(String permalinkUrl) {
    this.permalinkUrl = permalinkUrl;
    return this;
  }

  /**
   * A url that points directly to the object within Asana.
   * @return permalinkUrl
  */
  
  @Schema(name = "permalink_url", accessMode = Schema.AccessMode.READ_ONLY, example = "https://app.asana.com/0/resource/123456789/list", description = "A url that points directly to the object within Asana.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permalink_url")
  public String getPermalinkUrl() {
    return permalinkUrl;
  }

  public void setPermalinkUrl(String permalinkUrl) {
    this.permalinkUrl = permalinkUrl;
  }

  public TeamResponse visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * The visibility of the team to users in the same organization 
   * @return visibility
  */
  
  @Schema(name = "visibility", description = "The visibility of the team to users in the same organization ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamResponse teamResponse = (TeamResponse) o;
    return Objects.equals(this.gid, teamResponse.gid) &&
        Objects.equals(this.resourceType, teamResponse.resourceType) &&
        Objects.equals(this.name, teamResponse.name) &&
        Objects.equals(this.description, teamResponse.description) &&
        Objects.equals(this.htmlDescription, teamResponse.htmlDescription) &&
        Objects.equals(this.organization, teamResponse.organization) &&
        Objects.equals(this.permalinkUrl, teamResponse.permalinkUrl) &&
        Objects.equals(this.visibility, teamResponse.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, description, htmlDescription, organization, permalinkUrl, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    htmlDescription: ").append(toIndentedString(htmlDescription)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    permalinkUrl: ").append(toIndentedString(permalinkUrl)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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

