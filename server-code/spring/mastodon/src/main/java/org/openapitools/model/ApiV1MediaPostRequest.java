package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApiV1MediaPostRequest
 */

@JsonTypeName("_api_v1_media_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1MediaPostRequest {

  private String description;

  private org.springframework.core.io.Resource file;

  private String focus;

  private org.springframework.core.io.Resource thumbnail;

  public ApiV1MediaPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApiV1MediaPostRequest(org.springframework.core.io.Resource file) {
    this.file = file;
  }

  public ApiV1MediaPostRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A plain-text description of the media, for accessibility purposes.
   * @return description
  */
  
  @Schema(name = "description", description = "A plain-text description of the media, for accessibility purposes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ApiV1MediaPostRequest file(org.springframework.core.io.Resource file) {
    this.file = file;
    return this;
  }

  /**
   * The file to be attached, using multipart form data.
   * @return file
  */
  @NotNull @Valid 
  @Schema(name = "file", description = "The file to be attached, using multipart form data.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("file")
  public org.springframework.core.io.Resource getFile() {
    return file;
  }

  public void setFile(org.springframework.core.io.Resource file) {
    this.file = file;
  }

  public ApiV1MediaPostRequest focus(String focus) {
    this.focus = focus;
    return this;
  }

  /**
   * Two floating points (x,y), comma-delimited, ranging from -1.0 to 1.0 (see “Focal points” below)
   * @return focus
  */
  
  @Schema(name = "focus", description = "Two floating points (x,y), comma-delimited, ranging from -1.0 to 1.0 (see “Focal points” below)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("focus")
  public String getFocus() {
    return focus;
  }

  public void setFocus(String focus) {
    this.focus = focus;
  }

  public ApiV1MediaPostRequest thumbnail(org.springframework.core.io.Resource thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * The custom thumbnail of the media to be attached, using multipart form data.
   * @return thumbnail
  */
  @Valid 
  @Schema(name = "thumbnail", description = "The custom thumbnail of the media to be attached, using multipart form data.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thumbnail")
  public org.springframework.core.io.Resource getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(org.springframework.core.io.Resource thumbnail) {
    this.thumbnail = thumbnail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1MediaPostRequest apiV1MediaPostRequest = (ApiV1MediaPostRequest) o;
    return Objects.equals(this.description, apiV1MediaPostRequest.description) &&
        Objects.equals(this.file, apiV1MediaPostRequest.file) &&
        Objects.equals(this.focus, apiV1MediaPostRequest.focus) &&
        Objects.equals(this.thumbnail, apiV1MediaPostRequest.thumbnail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, file, focus, thumbnail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1MediaPostRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    focus: ").append(toIndentedString(focus)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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

