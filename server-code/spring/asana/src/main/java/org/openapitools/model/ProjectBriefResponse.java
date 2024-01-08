package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ProjectBriefResponseAllOfProject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProjectBriefResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class ProjectBriefResponse {

  private String gid;

  private String resourceType;

  private String htmlText;

  private String title;

  private String permalinkUrl;

  private ProjectBriefResponseAllOfProject project;

  private String text;

  public ProjectBriefResponse gid(String gid) {
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

  public ProjectBriefResponse resourceType(String resourceType) {
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

  public ProjectBriefResponse htmlText(String htmlText) {
    this.htmlText = htmlText;
    return this;
  }

  /**
   * HTML formatted text for the project brief.
   * @return htmlText
  */
  
  @Schema(name = "html_text", example = "<body>This is a <strong>project brief</strong>.</body>", description = "HTML formatted text for the project brief.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_text")
  public String getHtmlText() {
    return htmlText;
  }

  public void setHtmlText(String htmlText) {
    this.htmlText = htmlText;
  }

  public ProjectBriefResponse title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the project brief.
   * @return title
  */
  
  @Schema(name = "title", example = "Stuff to buy — Project Brief", description = "The title of the project brief.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ProjectBriefResponse permalinkUrl(String permalinkUrl) {
    this.permalinkUrl = permalinkUrl;
    return this;
  }

  /**
   * A url that points directly to the object within Asana.
   * @return permalinkUrl
  */
  
  @Schema(name = "permalink_url", accessMode = Schema.AccessMode.READ_ONLY, example = "https://app.asana.com/0/11111111/22222222", description = "A url that points directly to the object within Asana.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permalink_url")
  public String getPermalinkUrl() {
    return permalinkUrl;
  }

  public void setPermalinkUrl(String permalinkUrl) {
    this.permalinkUrl = permalinkUrl;
  }

  public ProjectBriefResponse project(ProjectBriefResponseAllOfProject project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
  */
  @Valid 
  @Schema(name = "project", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project")
  public ProjectBriefResponseAllOfProject getProject() {
    return project;
  }

  public void setProject(ProjectBriefResponseAllOfProject project) {
    this.project = project;
  }

  public ProjectBriefResponse text(String text) {
    this.text = text;
    return this;
  }

  /**
   * [Opt In](/docs/input-output-options). The plain text of the project brief.
   * @return text
  */
  
  @Schema(name = "text", example = "This is a project brief.", description = "[Opt In](/docs/input-output-options). The plain text of the project brief.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectBriefResponse projectBriefResponse = (ProjectBriefResponse) o;
    return Objects.equals(this.gid, projectBriefResponse.gid) &&
        Objects.equals(this.resourceType, projectBriefResponse.resourceType) &&
        Objects.equals(this.htmlText, projectBriefResponse.htmlText) &&
        Objects.equals(this.title, projectBriefResponse.title) &&
        Objects.equals(this.permalinkUrl, projectBriefResponse.permalinkUrl) &&
        Objects.equals(this.project, projectBriefResponse.project) &&
        Objects.equals(this.text, projectBriefResponse.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, htmlText, title, permalinkUrl, project, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectBriefResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    permalinkUrl: ").append(toIndentedString(permalinkUrl)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

