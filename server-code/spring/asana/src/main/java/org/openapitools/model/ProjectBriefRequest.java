package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProjectBriefRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class ProjectBriefRequest {

  private String gid;

  private String resourceType;

  private String htmlText;

  private String title;

  private String text;

  public ProjectBriefRequest gid(String gid) {
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

  public ProjectBriefRequest resourceType(String resourceType) {
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

  public ProjectBriefRequest htmlText(String htmlText) {
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

  public ProjectBriefRequest title(String title) {
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

  public ProjectBriefRequest text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The plain text of the project brief. When writing to a project brief, you can specify either `html_text` (preferred) or `text`, but not both.
   * @return text
  */
  
  @Schema(name = "text", example = "This is a project brief.", description = "The plain text of the project brief. When writing to a project brief, you can specify either `html_text` (preferred) or `text`, but not both.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ProjectBriefRequest projectBriefRequest = (ProjectBriefRequest) o;
    return Objects.equals(this.gid, projectBriefRequest.gid) &&
        Objects.equals(this.resourceType, projectBriefRequest.resourceType) &&
        Objects.equals(this.htmlText, projectBriefRequest.htmlText) &&
        Objects.equals(this.title, projectBriefRequest.title) &&
        Objects.equals(this.text, projectBriefRequest.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, htmlText, title, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectBriefRequest {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

