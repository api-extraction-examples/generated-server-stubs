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
 * UntagInstanceProfileRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UntagInstanceProfileRequest {

  private String instanceProfileName;

  private List tagKeys;

  public UntagInstanceProfileRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UntagInstanceProfileRequest(String instanceProfileName, List tagKeys) {
    this.instanceProfileName = instanceProfileName;
    this.tagKeys = tagKeys;
  }

  public UntagInstanceProfileRequest instanceProfileName(String instanceProfileName) {
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

  public UntagInstanceProfileRequest tagKeys(List tagKeys) {
    this.tagKeys = tagKeys;
    return this;
  }

  /**
   * Get tagKeys
   * @return tagKeys
  */
  @NotNull @Valid 
  @Schema(name = "TagKeys", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TagKeys")
  public List getTagKeys() {
    return tagKeys;
  }

  public void setTagKeys(List tagKeys) {
    this.tagKeys = tagKeys;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UntagInstanceProfileRequest untagInstanceProfileRequest = (UntagInstanceProfileRequest) o;
    return Objects.equals(this.instanceProfileName, untagInstanceProfileRequest.instanceProfileName) &&
        Objects.equals(this.tagKeys, untagInstanceProfileRequest.tagKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceProfileName, tagKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UntagInstanceProfileRequest {\n");
    sb.append("    instanceProfileName: ").append(toIndentedString(instanceProfileName)).append("\n");
    sb.append("    tagKeys: ").append(toIndentedString(tagKeys)).append("\n");
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

