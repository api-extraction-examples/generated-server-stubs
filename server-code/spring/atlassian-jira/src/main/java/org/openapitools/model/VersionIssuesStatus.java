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

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * Counts of the number of issues in various statuses.
 */

@Schema(name = "VersionIssuesStatus", description = "Counts of the number of issues in various statuses.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class VersionIssuesStatus {

  private Long done;

  private Long inProgress;

  private Long toDo;

  private Long unmapped;

  public VersionIssuesStatus done(Long done) {
    this.done = done;
    return this;
  }

  /**
   * Count of issues with status *done*.
   * @return done
  */
  
  @Schema(name = "done", accessMode = Schema.AccessMode.READ_ONLY, description = "Count of issues with status *done*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("done")
  public Long getDone() {
    return done;
  }

  public void setDone(Long done) {
    this.done = done;
  }

  public VersionIssuesStatus inProgress(Long inProgress) {
    this.inProgress = inProgress;
    return this;
  }

  /**
   * Count of issues with status *in progress*.
   * @return inProgress
  */
  
  @Schema(name = "inProgress", accessMode = Schema.AccessMode.READ_ONLY, description = "Count of issues with status *in progress*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inProgress")
  public Long getInProgress() {
    return inProgress;
  }

  public void setInProgress(Long inProgress) {
    this.inProgress = inProgress;
  }

  public VersionIssuesStatus toDo(Long toDo) {
    this.toDo = toDo;
    return this;
  }

  /**
   * Count of issues with status *to do*.
   * @return toDo
  */
  
  @Schema(name = "toDo", accessMode = Schema.AccessMode.READ_ONLY, description = "Count of issues with status *to do*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("toDo")
  public Long getToDo() {
    return toDo;
  }

  public void setToDo(Long toDo) {
    this.toDo = toDo;
  }

  public VersionIssuesStatus unmapped(Long unmapped) {
    this.unmapped = unmapped;
    return this;
  }

  /**
   * Count of issues with a status other than *to do*, *in progress*, and *done*.
   * @return unmapped
  */
  
  @Schema(name = "unmapped", accessMode = Schema.AccessMode.READ_ONLY, description = "Count of issues with a status other than *to do*, *in progress*, and *done*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unmapped")
  public Long getUnmapped() {
    return unmapped;
  }

  public void setUnmapped(Long unmapped) {
    this.unmapped = unmapped;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public VersionIssuesStatus putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionIssuesStatus versionIssuesStatus = (VersionIssuesStatus) o;
    return Objects.equals(this.done, versionIssuesStatus.done) &&
        Objects.equals(this.inProgress, versionIssuesStatus.inProgress) &&
        Objects.equals(this.toDo, versionIssuesStatus.toDo) &&
        Objects.equals(this.unmapped, versionIssuesStatus.unmapped) &&
    Objects.equals(this.additionalProperties, versionIssuesStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(done, inProgress, toDo, unmapped, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionIssuesStatus {\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
    sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
    sb.append("    toDo: ").append(toIndentedString(toDo)).append("\n");
    sb.append("    unmapped: ").append(toIndentedString(unmapped)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

