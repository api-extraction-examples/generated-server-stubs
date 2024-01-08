package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StatusUpdateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class StatusUpdateRequest {

  private String gid;

  private String resourceType;

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The `resource_subtype`s for `status` objects represent the type of their parent.
   */
  public enum ResourceSubtypeEnum {
    PROJECT_STATUS_UPDATE("project_status_update"),
    
    PORTFOLIO_STATUS_UPDATE("portfolio_status_update"),
    
    GOAL_STATUS_UPDATE("goal_status_update");

    private String value;

    ResourceSubtypeEnum(String value) {
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
    public static ResourceSubtypeEnum fromValue(String value) {
      for (ResourceSubtypeEnum b : ResourceSubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ResourceSubtypeEnum resourceSubtype;

  private String title;

  private String htmlText;

  /**
   * The type associated with the status update. This represents the current state of the object this object is on.
   */
  public enum StatusTypeEnum {
    ON_TRACK("on_track"),
    
    AT_RISK("at_risk"),
    
    OFF_TRACK("off_track"),
    
    ON_HOLD("on_hold"),
    
    COMPLETE("complete"),
    
    ACHIEVED("achieved"),
    
    PARTIAL("partial"),
    
    MISSED("missed"),
    
    DROPPED("dropped");

    private String value;

    StatusTypeEnum(String value) {
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
    public static StatusTypeEnum fromValue(String value) {
      for (StatusTypeEnum b : StatusTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusTypeEnum statusType;

  private String text;

  private Object parent;

  public StatusUpdateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StatusUpdateRequest(StatusTypeEnum statusType, String text, Object parent) {
    this.statusType = statusType;
    this.text = text;
    this.parent = parent;
  }

  public StatusUpdateRequest gid(String gid) {
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

  public StatusUpdateRequest resourceType(String resourceType) {
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

  public StatusUpdateRequest resourceSubtype(ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The `resource_subtype`s for `status` objects represent the type of their parent.
   * @return resourceSubtype
  */
  
  @Schema(name = "resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "project_status_update", description = "The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The `resource_subtype`s for `status` objects represent the type of their parent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public ResourceSubtypeEnum getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public StatusUpdateRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the status update.
   * @return title
  */
  
  @Schema(name = "title", example = "Status Update - Jun 15", description = "The title of the status update.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public StatusUpdateRequest htmlText(String htmlText) {
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

  public StatusUpdateRequest statusType(StatusTypeEnum statusType) {
    this.statusType = statusType;
    return this;
  }

  /**
   * The type associated with the status update. This represents the current state of the object this object is on.
   * @return statusType
  */
  @NotNull 
  @Schema(name = "status_type", description = "The type associated with the status update. This represents the current state of the object this object is on.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status_type")
  public StatusTypeEnum getStatusType() {
    return statusType;
  }

  public void setStatusType(StatusTypeEnum statusType) {
    this.statusType = statusType;
  }

  public StatusUpdateRequest text(String text) {
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

  public StatusUpdateRequest parent(Object parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
  */
  @NotNull 
  @Schema(name = "parent", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parent")
  public Object getParent() {
    return parent;
  }

  public void setParent(Object parent) {
    this.parent = parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusUpdateRequest statusUpdateRequest = (StatusUpdateRequest) o;
    return Objects.equals(this.gid, statusUpdateRequest.gid) &&
        Objects.equals(this.resourceType, statusUpdateRequest.resourceType) &&
        Objects.equals(this.resourceSubtype, statusUpdateRequest.resourceSubtype) &&
        Objects.equals(this.title, statusUpdateRequest.title) &&
        Objects.equals(this.htmlText, statusUpdateRequest.htmlText) &&
        Objects.equals(this.statusType, statusUpdateRequest.statusType) &&
        Objects.equals(this.text, statusUpdateRequest.text) &&
        Objects.equals(this.parent, statusUpdateRequest.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, resourceSubtype, title, htmlText, statusType, text, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusUpdateRequest {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

