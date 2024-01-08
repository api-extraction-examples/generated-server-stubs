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
 * Artifact
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:13.970205-04:00[America/Lower_Princes]")
public class Artifact {

  private Integer nodeIndex;

  private String path;

  private String prettyPath;

  private String url;

  public Artifact nodeIndex(Integer nodeIndex) {
    this.nodeIndex = nodeIndex;
    return this;
  }

  /**
   * Get nodeIndex
   * @return nodeIndex
  */
  
  @Schema(name = "node_index", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("node_index")
  public Integer getNodeIndex() {
    return nodeIndex;
  }

  public void setNodeIndex(Integer nodeIndex) {
    this.nodeIndex = nodeIndex;
  }

  public Artifact path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  
  @Schema(name = "path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Artifact prettyPath(String prettyPath) {
    this.prettyPath = prettyPath;
    return this;
  }

  /**
   * Get prettyPath
   * @return prettyPath
  */
  
  @Schema(name = "pretty_path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pretty_path")
  public String getPrettyPath() {
    return prettyPath;
  }

  public void setPrettyPath(String prettyPath) {
    this.prettyPath = prettyPath;
  }

  public Artifact url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Artifact artifact = (Artifact) o;
    return Objects.equals(this.nodeIndex, artifact.nodeIndex) &&
        Objects.equals(this.path, artifact.path) &&
        Objects.equals(this.prettyPath, artifact.prettyPath) &&
        Objects.equals(this.url, artifact.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeIndex, path, prettyPath, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Artifact {\n");
    sb.append("    nodeIndex: ").append(toIndentedString(nodeIndex)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    prettyPath: ").append(toIndentedString(prettyPath)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

