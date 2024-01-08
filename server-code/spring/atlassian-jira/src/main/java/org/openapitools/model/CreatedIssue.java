package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CreatedIssueTransition;
import org.openapitools.model.CreatedIssueWatchers;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a created issue or subtask.
 */

@Schema(name = "CreatedIssue", description = "Details about a created issue or subtask.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CreatedIssue {

  private String id;

  private String key;

  private String self;

  private CreatedIssueTransition transition;

  private CreatedIssueWatchers watchers;

  public CreatedIssue id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the created issue or subtask.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the created issue or subtask.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreatedIssue key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the created issue or subtask.
   * @return key
  */
  
  @Schema(name = "key", accessMode = Schema.AccessMode.READ_ONLY, description = "The key of the created issue or subtask.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CreatedIssue self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the created issue or subtask.
   * @return self
  */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the created issue or subtask.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public CreatedIssue transition(CreatedIssueTransition transition) {
    this.transition = transition;
    return this;
  }

  /**
   * Get transition
   * @return transition
  */
  @Valid 
  @Schema(name = "transition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transition")
  public CreatedIssueTransition getTransition() {
    return transition;
  }

  public void setTransition(CreatedIssueTransition transition) {
    this.transition = transition;
  }

  public CreatedIssue watchers(CreatedIssueWatchers watchers) {
    this.watchers = watchers;
    return this;
  }

  /**
   * Get watchers
   * @return watchers
  */
  @Valid 
  @Schema(name = "watchers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("watchers")
  public CreatedIssueWatchers getWatchers() {
    return watchers;
  }

  public void setWatchers(CreatedIssueWatchers watchers) {
    this.watchers = watchers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedIssue createdIssue = (CreatedIssue) o;
    return Objects.equals(this.id, createdIssue.id) &&
        Objects.equals(this.key, createdIssue.key) &&
        Objects.equals(this.self, createdIssue.self) &&
        Objects.equals(this.transition, createdIssue.transition) &&
        Objects.equals(this.watchers, createdIssue.watchers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, self, transition, watchers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedIssue {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    transition: ").append(toIndentedString(transition)).append("\n");
    sb.append("    watchers: ").append(toIndentedString(watchers)).append("\n");
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

