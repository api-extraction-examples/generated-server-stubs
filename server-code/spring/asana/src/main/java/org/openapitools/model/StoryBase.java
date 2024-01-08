package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StoryBase
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class StoryBase {

  private String gid;

  private String resourceType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private String htmlText;

  private Boolean isPinned;

  private String resourceSubtype;

  /**
   * The name of the sticker in this story. `null` if there is no sticker.
   */
  public enum StickerNameEnum {
    GREEN_CHECKMARK("green_checkmark"),
    
    PEOPLE_DANCING("people_dancing"),
    
    DANCING_UNICORN("dancing_unicorn"),
    
    HEART("heart"),
    
    PARTY_POPPER("party_popper"),
    
    PEOPLE_WAVING_FLAGS("people_waving_flags"),
    
    SPLASHING_NARWHAL("splashing_narwhal"),
    
    TROPHY("trophy"),
    
    YETI_RIDING_UNICORN("yeti_riding_unicorn"),
    
    CELEBRATING_PEOPLE("celebrating_people"),
    
    DETERMINED_CLIMBERS("determined_climbers"),
    
    PHOENIX_SPREADING_LOVE("phoenix_spreading_love");

    private String value;

    StickerNameEnum(String value) {
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
    public static StickerNameEnum fromValue(String value) {
      for (StickerNameEnum b : StickerNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StickerNameEnum stickerName;

  private String text;

  public StoryBase gid(String gid) {
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

  public StoryBase resourceType(String resourceType) {
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

  public StoryBase createdAt(OffsetDateTime createdAt) {
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

  public StoryBase htmlText(String htmlText) {
    this.htmlText = htmlText;
    return this;
  }

  /**
   * [Opt In](/docs/input-output-options). HTML formatted text for a comment. This will not include the name of the creator.
   * @return htmlText
  */
  
  @Schema(name = "html_text", example = "<body>This is a comment.</body>", description = "[Opt In](/docs/input-output-options). HTML formatted text for a comment. This will not include the name of the creator.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_text")
  public String getHtmlText() {
    return htmlText;
  }

  public void setHtmlText(String htmlText) {
    this.htmlText = htmlText;
  }

  public StoryBase isPinned(Boolean isPinned) {
    this.isPinned = isPinned;
    return this;
  }

  /**
   * *Conditional*. Whether the story should be pinned on the resource.
   * @return isPinned
  */
  
  @Schema(name = "is_pinned", example = "false", description = "*Conditional*. Whether the story should be pinned on the resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_pinned")
  public Boolean getIsPinned() {
    return isPinned;
  }

  public void setIsPinned(Boolean isPinned) {
    this.isPinned = isPinned;
  }

  public StoryBase resourceSubtype(String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   * @return resourceSubtype
  */
  
  @Schema(name = "resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "comment_added", description = "The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public String getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public StoryBase stickerName(StickerNameEnum stickerName) {
    this.stickerName = stickerName;
    return this;
  }

  /**
   * The name of the sticker in this story. `null` if there is no sticker.
   * @return stickerName
  */
  
  @Schema(name = "sticker_name", example = "dancing_unicorn", description = "The name of the sticker in this story. `null` if there is no sticker.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sticker_name")
  public StickerNameEnum getStickerName() {
    return stickerName;
  }

  public void setStickerName(StickerNameEnum stickerName) {
    this.stickerName = stickerName;
  }

  public StoryBase text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The plain text of the comment to add. Cannot be used with html_text.
   * @return text
  */
  
  @Schema(name = "text", example = "This is a comment.", description = "The plain text of the comment to add. Cannot be used with html_text.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    StoryBase storyBase = (StoryBase) o;
    return Objects.equals(this.gid, storyBase.gid) &&
        Objects.equals(this.resourceType, storyBase.resourceType) &&
        Objects.equals(this.createdAt, storyBase.createdAt) &&
        Objects.equals(this.htmlText, storyBase.htmlText) &&
        Objects.equals(this.isPinned, storyBase.isPinned) &&
        Objects.equals(this.resourceSubtype, storyBase.resourceSubtype) &&
        Objects.equals(this.stickerName, storyBase.stickerName) &&
        Objects.equals(this.text, storyBase.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, createdAt, htmlText, isPinned, resourceSubtype, stickerName, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoryBase {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    isPinned: ").append(toIndentedString(isPinned)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    stickerName: ").append(toIndentedString(stickerName)).append("\n");
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

