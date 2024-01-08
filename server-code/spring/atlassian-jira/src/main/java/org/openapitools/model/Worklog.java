package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EntityProperty;
import org.openapitools.model.Visibility;
import org.openapitools.model.WorklogAuthor;
import org.openapitools.model.WorklogUpdateAuthor;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
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
 * Details of a worklog.
 */

@Schema(name = "Worklog", description = "Details of a worklog.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Worklog {

  private WorklogAuthor author;

  private JsonNullable<Object> comment = JsonNullable.<Object>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime created;

  private String id;

  private String issueId;

  @Valid
  private List<@Valid EntityProperty> properties;

  private URI self;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime started;

  private String timeSpent;

  private Long timeSpentSeconds;

  private WorklogUpdateAuthor updateAuthor;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updated;

  private Visibility visibility;

  public Worklog author(WorklogAuthor author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  */
  @Valid 
  @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author")
  public WorklogAuthor getAuthor() {
    return author;
  }

  public void setAuthor(WorklogAuthor author) {
    this.author = author;
  }

  public Worklog comment(Object comment) {
    this.comment = JsonNullable.of(comment);
    return this;
  }

  /**
   * A comment about the worklog in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/). Optional when creating or updating a worklog.
   * @return comment
  */
  
  @Schema(name = "comment", description = "A comment about the worklog in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/). Optional when creating or updating a worklog.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public JsonNullable<Object> getComment() {
    return comment;
  }

  public void setComment(JsonNullable<Object> comment) {
    this.comment = comment;
  }

  public Worklog created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The datetime on which the worklog was created.
   * @return created
  */
  @Valid 
  @Schema(name = "created", accessMode = Schema.AccessMode.READ_ONLY, description = "The datetime on which the worklog was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Worklog id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the worklog record.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the worklog record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Worklog issueId(String issueId) {
    this.issueId = issueId;
    return this;
  }

  /**
   * The ID of the issue this worklog is for.
   * @return issueId
  */
  
  @Schema(name = "issueId", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the issue this worklog is for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueId")
  public String getIssueId() {
    return issueId;
  }

  public void setIssueId(String issueId) {
    this.issueId = issueId;
  }

  public Worklog properties(List<@Valid EntityProperty> properties) {
    this.properties = properties;
    return this;
  }

  public Worklog addPropertiesItem(EntityProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * Details of properties for the worklog. Optional when creating or updating a worklog.
   * @return properties
  */
  @Valid 
  @Schema(name = "properties", description = "Details of properties for the worklog. Optional when creating or updating a worklog.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public List<@Valid EntityProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<@Valid EntityProperty> properties) {
    this.properties = properties;
  }

  public Worklog self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the worklog item.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the worklog item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public Worklog started(OffsetDateTime started) {
    this.started = started;
    return this;
  }

  /**
   * The datetime on which the worklog effort was started. Required when creating a worklog. Optional when updating a worklog.
   * @return started
  */
  @Valid 
  @Schema(name = "started", description = "The datetime on which the worklog effort was started. Required when creating a worklog. Optional when updating a worklog.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("started")
  public OffsetDateTime getStarted() {
    return started;
  }

  public void setStarted(OffsetDateTime started) {
    this.started = started;
  }

  public Worklog timeSpent(String timeSpent) {
    this.timeSpent = timeSpent;
    return this;
  }

  /**
   * The time spent working on the issue as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). Required when creating a worklog if `timeSpentSeconds` isn't provided. Optional when updating a worklog. Cannot be provided if `timeSpentSecond` is provided.
   * @return timeSpent
  */
  
  @Schema(name = "timeSpent", description = "The time spent working on the issue as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). Required when creating a worklog if `timeSpentSeconds` isn't provided. Optional when updating a worklog. Cannot be provided if `timeSpentSecond` is provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeSpent")
  public String getTimeSpent() {
    return timeSpent;
  }

  public void setTimeSpent(String timeSpent) {
    this.timeSpent = timeSpent;
  }

  public Worklog timeSpentSeconds(Long timeSpentSeconds) {
    this.timeSpentSeconds = timeSpentSeconds;
    return this;
  }

  /**
   * The time in seconds spent working on the issue. Required when creating a worklog if `timeSpent` isn't provided. Optional when updating a worklog. Cannot be provided if `timeSpent` is provided.
   * @return timeSpentSeconds
  */
  
  @Schema(name = "timeSpentSeconds", description = "The time in seconds spent working on the issue. Required when creating a worklog if `timeSpent` isn't provided. Optional when updating a worklog. Cannot be provided if `timeSpent` is provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeSpentSeconds")
  public Long getTimeSpentSeconds() {
    return timeSpentSeconds;
  }

  public void setTimeSpentSeconds(Long timeSpentSeconds) {
    this.timeSpentSeconds = timeSpentSeconds;
  }

  public Worklog updateAuthor(WorklogUpdateAuthor updateAuthor) {
    this.updateAuthor = updateAuthor;
    return this;
  }

  /**
   * Get updateAuthor
   * @return updateAuthor
  */
  @Valid 
  @Schema(name = "updateAuthor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateAuthor")
  public WorklogUpdateAuthor getUpdateAuthor() {
    return updateAuthor;
  }

  public void setUpdateAuthor(WorklogUpdateAuthor updateAuthor) {
    this.updateAuthor = updateAuthor;
  }

  public Worklog updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * The datetime on which the worklog was last updated.
   * @return updated
  */
  @Valid 
  @Schema(name = "updated", accessMode = Schema.AccessMode.READ_ONLY, description = "The datetime on which the worklog was last updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public Worklog visibility(Visibility visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   * @return visibility
  */
  @Valid 
  @Schema(name = "visibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public Visibility getVisibility() {
    return visibility;
  }

  public void setVisibility(Visibility visibility) {
    this.visibility = visibility;
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
    public Worklog putAdditionalProperty(String key, Object value) {
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
    Worklog worklog = (Worklog) o;
    return Objects.equals(this.author, worklog.author) &&
        equalsNullable(this.comment, worklog.comment) &&
        Objects.equals(this.created, worklog.created) &&
        Objects.equals(this.id, worklog.id) &&
        Objects.equals(this.issueId, worklog.issueId) &&
        Objects.equals(this.properties, worklog.properties) &&
        Objects.equals(this.self, worklog.self) &&
        Objects.equals(this.started, worklog.started) &&
        Objects.equals(this.timeSpent, worklog.timeSpent) &&
        Objects.equals(this.timeSpentSeconds, worklog.timeSpentSeconds) &&
        Objects.equals(this.updateAuthor, worklog.updateAuthor) &&
        Objects.equals(this.updated, worklog.updated) &&
        Objects.equals(this.visibility, worklog.visibility) &&
    Objects.equals(this.additionalProperties, worklog.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, hashCodeNullable(comment), created, id, issueId, properties, self, started, timeSpent, timeSpentSeconds, updateAuthor, updated, visibility, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Worklog {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    timeSpent: ").append(toIndentedString(timeSpent)).append("\n");
    sb.append("    timeSpentSeconds: ").append(toIndentedString(timeSpentSeconds)).append("\n");
    sb.append("    updateAuthor: ").append(toIndentedString(updateAuthor)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    
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

