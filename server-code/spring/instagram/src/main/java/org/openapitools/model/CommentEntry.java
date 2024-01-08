package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.UserShortInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CommentEntry
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:07.987869-04:00[America/Lower_Princes]")
public class CommentEntry {

  private String createdTime;

  private UserShortInfo from;

  private String id;

  private String text;

  public CommentEntry createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Comment creation UNIX timestamp
   * @return createdTime
  */
  
  @Schema(name = "created_time", description = "Comment creation UNIX timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public CommentEntry from(UserShortInfo from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
  */
  @Valid 
  @Schema(name = "from", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("from")
  public UserShortInfo getFrom() {
    return from;
  }

  public void setFrom(UserShortInfo from) {
    this.from = from;
  }

  public CommentEntry id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of this comment
   * @return id
  */
  
  @Schema(name = "id", description = "ID of this comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CommentEntry text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Text of the comment
   * @return text
  */
  
  @Schema(name = "text", description = "Text of the comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    CommentEntry commentEntry = (CommentEntry) o;
    return Objects.equals(this.createdTime, commentEntry.createdTime) &&
        Objects.equals(this.from, commentEntry.from) &&
        Objects.equals(this.id, commentEntry.id) &&
        Objects.equals(this.text, commentEntry.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTime, from, id, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentEntry {\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

