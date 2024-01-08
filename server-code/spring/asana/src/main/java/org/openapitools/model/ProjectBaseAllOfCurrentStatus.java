package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.model.UserCompact;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * *Deprecated: new integrations should prefer the &#x60;current_status_update&#x60; resource.*
 */

@Schema(name = "ProjectBase_allOf_current_status", description = "*Deprecated: new integrations should prefer the `current_status_update` resource.*")
@JsonTypeName("ProjectBase_allOf_current_status")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class ProjectBaseAllOfCurrentStatus {

  private String gid;

  private String resourceType;

  private String title;

  /**
   * The color associated with the status update.
   */
  public enum ColorEnum {
    GREEN("green"),
    
    YELLOW("yellow"),
    
    RED("red"),
    
    BLUE("blue");

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

  private String htmlText;

  private String text;

  private UserCompact author;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private UserCompact createdBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime modifiedAt;

  public ProjectBaseAllOfCurrentStatus() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProjectBaseAllOfCurrentStatus(ColorEnum color, String text) {
    this.color = color;
    this.text = text;
  }

  public ProjectBaseAllOfCurrentStatus gid(String gid) {
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

  public ProjectBaseAllOfCurrentStatus resourceType(String resourceType) {
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

  public ProjectBaseAllOfCurrentStatus title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the project status update.
   * @return title
  */
  
  @Schema(name = "title", example = "Status Update - Jun 15", description = "The title of the project status update.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ProjectBaseAllOfCurrentStatus color(ColorEnum color) {
    this.color = color;
    return this;
  }

  /**
   * The color associated with the status update.
   * @return color
  */
  @NotNull 
  @Schema(name = "color", description = "The color associated with the status update.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("color")
  public ColorEnum getColor() {
    return color;
  }

  public void setColor(ColorEnum color) {
    this.color = color;
  }

  public ProjectBaseAllOfCurrentStatus htmlText(String htmlText) {
    this.htmlText = htmlText;
    return this;
  }

  /**
   * [Opt In](/docs/input-output-options). The text content of the status update with formatting as HTML.
   * @return htmlText
  */
  
  @Schema(name = "html_text", example = "<body>The project <strong>is</strong> moving forward according to plan...</body>", description = "[Opt In](/docs/input-output-options). The text content of the status update with formatting as HTML.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_text")
  public String getHtmlText() {
    return htmlText;
  }

  public void setHtmlText(String htmlText) {
    this.htmlText = htmlText;
  }

  public ProjectBaseAllOfCurrentStatus text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The text content of the status update.
   * @return text
  */
  @NotNull 
  @Schema(name = "text", example = "The project is moving forward according to plan...", description = "The text content of the status update.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ProjectBaseAllOfCurrentStatus author(UserCompact author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  */
  @Valid 
  @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author")
  public UserCompact getAuthor() {
    return author;
  }

  public void setAuthor(UserCompact author) {
    this.author = author;
  }

  public ProjectBaseAllOfCurrentStatus createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which this resource was created.
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this resource was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ProjectBaseAllOfCurrentStatus createdBy(UserCompact createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  */
  @Valid 
  @Schema(name = "created_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by")
  public UserCompact getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(UserCompact createdBy) {
    this.createdBy = createdBy;
  }

  public ProjectBaseAllOfCurrentStatus modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The time at which this project status was last modified. *Note: This does not currently reflect any changes in associations such as comments that may have been added or removed from the project status.*
   * @return modifiedAt
  */
  @Valid 
  @Schema(name = "modified_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this project status was last modified. *Note: This does not currently reflect any changes in associations such as comments that may have been added or removed from the project status.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modified_at")
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectBaseAllOfCurrentStatus projectBaseAllOfCurrentStatus = (ProjectBaseAllOfCurrentStatus) o;
    return Objects.equals(this.gid, projectBaseAllOfCurrentStatus.gid) &&
        Objects.equals(this.resourceType, projectBaseAllOfCurrentStatus.resourceType) &&
        Objects.equals(this.title, projectBaseAllOfCurrentStatus.title) &&
        Objects.equals(this.color, projectBaseAllOfCurrentStatus.color) &&
        Objects.equals(this.htmlText, projectBaseAllOfCurrentStatus.htmlText) &&
        Objects.equals(this.text, projectBaseAllOfCurrentStatus.text) &&
        Objects.equals(this.author, projectBaseAllOfCurrentStatus.author) &&
        Objects.equals(this.createdAt, projectBaseAllOfCurrentStatus.createdAt) &&
        Objects.equals(this.createdBy, projectBaseAllOfCurrentStatus.createdBy) &&
        Objects.equals(this.modifiedAt, projectBaseAllOfCurrentStatus.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, title, color, htmlText, text, author, createdAt, createdBy, modifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectBaseAllOfCurrentStatus {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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

