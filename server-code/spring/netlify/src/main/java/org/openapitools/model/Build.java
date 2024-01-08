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
 * Build
 */

@JsonTypeName("build")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class Build {

  private String createdAt;

  private String deployId;

  private Boolean done;

  private String error;

  private String id;

  private String sha;

  public Build createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  
  @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Build deployId(String deployId) {
    this.deployId = deployId;
    return this;
  }

  /**
   * Get deployId
   * @return deployId
  */
  
  @Schema(name = "deploy_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploy_id")
  public String getDeployId() {
    return deployId;
  }

  public void setDeployId(String deployId) {
    this.deployId = deployId;
  }

  public Build done(Boolean done) {
    this.done = done;
    return this;
  }

  /**
   * Get done
   * @return done
  */
  
  @Schema(name = "done", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("done")
  public Boolean getDone() {
    return done;
  }

  public void setDone(Boolean done) {
    this.done = done;
  }

  public Build error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
  
  @Schema(name = "error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public Build id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Build sha(String sha) {
    this.sha = sha;
    return this;
  }

  /**
   * Get sha
   * @return sha
  */
  
  @Schema(name = "sha", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sha")
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Build build = (Build) o;
    return Objects.equals(this.createdAt, build.createdAt) &&
        Objects.equals(this.deployId, build.deployId) &&
        Objects.equals(this.done, build.done) &&
        Objects.equals(this.error, build.error) &&
        Objects.equals(this.id, build.id) &&
        Objects.equals(this.sha, build.sha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, deployId, done, error, id, sha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Build {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deployId: ").append(toIndentedString(deployId)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
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

