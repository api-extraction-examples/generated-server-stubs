package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.StatusDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Status details for an issue type.
 */

@Schema(name = "IssueTypeWithStatus", description = "Status details for an issue type.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeWithStatus {

  private String id;

  private String name;

  private String self;

  @Valid
  private List<@Valid StatusDetails> statuses = new ArrayList<>();

  private Boolean subtask;

  public IssueTypeWithStatus() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTypeWithStatus(String id, String name, String self, List<@Valid StatusDetails> statuses, Boolean subtask) {
    this.id = id;
    this.name = name;
    this.self = self;
    this.statuses = statuses;
    this.subtask = subtask;
  }

  public IssueTypeWithStatus id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the issue type.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the issue type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IssueTypeWithStatus name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue type.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the issue type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IssueTypeWithStatus self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the issue type's status details.
   * @return self
  */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the issue type's status details.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public IssueTypeWithStatus statuses(List<@Valid StatusDetails> statuses) {
    this.statuses = statuses;
    return this;
  }

  public IssueTypeWithStatus addStatusesItem(StatusDetails statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * List of status details for the issue type.
   * @return statuses
  */
  @Valid 
  @Schema(name = "statuses", accessMode = Schema.AccessMode.READ_ONLY, description = "List of status details for the issue type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("statuses")
  public List<@Valid StatusDetails> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<@Valid StatusDetails> statuses) {
    this.statuses = statuses;
  }

  public IssueTypeWithStatus subtask(Boolean subtask) {
    this.subtask = subtask;
    return this;
  }

  /**
   * Whether this issue type represents subtasks.
   * @return subtask
  */
  
  @Schema(name = "subtask", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether this issue type represents subtasks.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subtask")
  public Boolean getSubtask() {
    return subtask;
  }

  public void setSubtask(Boolean subtask) {
    this.subtask = subtask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeWithStatus issueTypeWithStatus = (IssueTypeWithStatus) o;
    return Objects.equals(this.id, issueTypeWithStatus.id) &&
        Objects.equals(this.name, issueTypeWithStatus.name) &&
        Objects.equals(this.self, issueTypeWithStatus.self) &&
        Objects.equals(this.statuses, issueTypeWithStatus.statuses) &&
        Objects.equals(this.subtask, issueTypeWithStatus.subtask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, self, statuses, subtask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeWithStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    subtask: ").append(toIndentedString(subtask)).append("\n");
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

