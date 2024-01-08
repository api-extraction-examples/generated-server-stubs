package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostUserSegmentRequest
 */

@JsonTypeName("postUserSegment_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class PostUserSegmentRequest {

  private String description;

  private String key;

  private String name;

  @Valid
  private List<String> tags;

  private Boolean unbounded;

  public PostUserSegmentRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostUserSegmentRequest(String key, String name) {
    this.key = key;
    this.name = name;
  }

  public PostUserSegmentRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description for the user segment.
   * @return description
  */
  
  @Schema(name = "description", example = "Users in this segment will have access to beta features.", description = "A description for the user segment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PostUserSegmentRequest key(String key) {
    this.key = key;
    return this;
  }

  /**
   * A unique key that will be used to reference the user segment in feature flags.
   * @return key
  */
  @NotNull 
  @Schema(name = "key", example = "new-segment", description = "A unique key that will be used to reference the user segment in feature flags.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public PostUserSegmentRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly name for the user segment.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "new segment", description = "A human-friendly name for the user segment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostUserSegmentRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public PostUserSegmentRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags for the user segment.
   * @return tags
  */
  
  @Schema(name = "tags", description = "Tags for the user segment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public PostUserSegmentRequest unbounded(Boolean unbounded) {
    this.unbounded = unbounded;
    return this;
  }

  /**
   * Controls whether this is considered a \"big segment\" which can support an unlimited numbers of users. Include/exclude lists sent with this payload are not used in big segments. Contact your account manager for early access to this feature.
   * @return unbounded
  */
  
  @Schema(name = "unbounded", example = "false", description = "Controls whether this is considered a \"big segment\" which can support an unlimited numbers of users. Include/exclude lists sent with this payload are not used in big segments. Contact your account manager for early access to this feature.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unbounded")
  public Boolean getUnbounded() {
    return unbounded;
  }

  public void setUnbounded(Boolean unbounded) {
    this.unbounded = unbounded;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostUserSegmentRequest postUserSegmentRequest = (PostUserSegmentRequest) o;
    return Objects.equals(this.description, postUserSegmentRequest.description) &&
        Objects.equals(this.key, postUserSegmentRequest.key) &&
        Objects.equals(this.name, postUserSegmentRequest.name) &&
        Objects.equals(this.tags, postUserSegmentRequest.tags) &&
        Objects.equals(this.unbounded, postUserSegmentRequest.unbounded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, key, name, tags, unbounded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUserSegmentRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    unbounded: ").append(toIndentedString(unbounded)).append("\n");
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

