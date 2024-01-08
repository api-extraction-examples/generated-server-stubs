package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TagInstanceProfileRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class TagInstanceProfileRequest {

  private String instanceProfileName;

  private List tags;

  public TagInstanceProfileRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TagInstanceProfileRequest(String instanceProfileName, List tags) {
    this.instanceProfileName = instanceProfileName;
    this.tags = tags;
  }

  public TagInstanceProfileRequest instanceProfileName(String instanceProfileName) {
    this.instanceProfileName = instanceProfileName;
    return this;
  }

  /**
   * Get instanceProfileName
   * @return instanceProfileName
  */
  @NotNull 
  @Schema(name = "InstanceProfileName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("InstanceProfileName")
  public String getInstanceProfileName() {
    return instanceProfileName;
  }

  public void setInstanceProfileName(String instanceProfileName) {
    this.instanceProfileName = instanceProfileName;
  }

  public TagInstanceProfileRequest tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @NotNull @Valid 
  @Schema(name = "Tags", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Tags")
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagInstanceProfileRequest tagInstanceProfileRequest = (TagInstanceProfileRequest) o;
    return Objects.equals(this.instanceProfileName, tagInstanceProfileRequest.instanceProfileName) &&
        Objects.equals(this.tags, tagInstanceProfileRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceProfileName, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagInstanceProfileRequest {\n");
    sb.append("    instanceProfileName: ").append(toIndentedString(instanceProfileName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

