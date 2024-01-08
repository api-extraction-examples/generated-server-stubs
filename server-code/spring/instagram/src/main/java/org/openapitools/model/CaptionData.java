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
 * CaptionData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:07.987869-04:00[America/Lower_Princes]")
public class CaptionData {

  private String createdTime;

  private UserShortInfo from;

  private String id;

  private String text;

  public CaptionData createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Caption creation UNIX timestamp
   * @return createdTime
  */
  
  @Schema(name = "created_time", description = "Caption creation UNIX timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public CaptionData from(UserShortInfo from) {
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

  public CaptionData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of this caption
   * @return id
  */
  
  @Schema(name = "id", description = "ID of this caption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CaptionData text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Caption text
   * @return text
  */
  
  @Schema(name = "text", description = "Caption text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    CaptionData captionData = (CaptionData) o;
    return Objects.equals(this.createdTime, captionData.createdTime) &&
        Objects.equals(this.from, captionData.from) &&
        Objects.equals(this.id, captionData.id) &&
        Objects.equals(this.text, captionData.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTime, from, id, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptionData {\n");
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

