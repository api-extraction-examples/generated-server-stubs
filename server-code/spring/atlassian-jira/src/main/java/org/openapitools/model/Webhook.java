package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * A webhook.
 */

@Schema(name = "Webhook", description = "A webhook.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Webhook {

  /**
   * Gets or Sets events
   */
  public enum EventsEnum {
    JIRA_ISSUE_CREATED("jira:issue_created"),
    
    JIRA_ISSUE_UPDATED("jira:issue_updated"),
    
    JIRA_ISSUE_DELETED("jira:issue_deleted"),
    
    COMMENT_CREATED("comment_created"),
    
    COMMENT_UPDATED("comment_updated"),
    
    COMMENT_DELETED("comment_deleted"),
    
    ISSUE_PROPERTY_SET("issue_property_set"),
    
    ISSUE_PROPERTY_DELETED("issue_property_deleted");

    private String value;

    EventsEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventsEnum fromValue(String value) {
      for (EventsEnum b : EventsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<EventsEnum> events = new ArrayList<>();

  private Long expirationDate;

  @Valid
  private List<String> fieldIdsFilter;

  private Long id;

  @Valid
  private List<String> issuePropertyKeysFilter;

  private String jqlFilter;

  public Webhook() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Webhook(List<EventsEnum> events, Long id, String jqlFilter) {
    this.events = events;
    this.id = id;
    this.jqlFilter = jqlFilter;
  }

  public Webhook events(List<EventsEnum> events) {
    this.events = events;
    return this;
  }

  public Webhook addEventsItem(EventsEnum eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * The Jira events that trigger the webhook.
   * @return events
  */
  @NotNull 
  @Schema(name = "events", description = "The Jira events that trigger the webhook.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("events")
  public List<EventsEnum> getEvents() {
    return events;
  }

  public void setEvents(List<EventsEnum> events) {
    this.events = events;
  }

  public Webhook expirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * The date after which the webhook is no longer sent. Use [Extend webhook life](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-webhooks/#api-rest-api-3-webhook-refresh-put) to extend the date.
   * @return expirationDate
  */
  
  @Schema(name = "expirationDate", accessMode = Schema.AccessMode.READ_ONLY, description = "The date after which the webhook is no longer sent. Use [Extend webhook life](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-webhooks/#api-rest-api-3-webhook-refresh-put) to extend the date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationDate")
  public Long getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
  }

  public Webhook fieldIdsFilter(List<String> fieldIdsFilter) {
    this.fieldIdsFilter = fieldIdsFilter;
    return this;
  }

  public Webhook addFieldIdsFilterItem(String fieldIdsFilterItem) {
    if (this.fieldIdsFilter == null) {
      this.fieldIdsFilter = new ArrayList<>();
    }
    this.fieldIdsFilter.add(fieldIdsFilterItem);
    return this;
  }

  /**
   * A list of field IDs. When the issue changelog contains any of the fields, the webhook `jira:issue_updated` is sent. If this parameter is not present, the app is notified about all field updates.
   * @return fieldIdsFilter
  */
  
  @Schema(name = "fieldIdsFilter", description = "A list of field IDs. When the issue changelog contains any of the fields, the webhook `jira:issue_updated` is sent. If this parameter is not present, the app is notified about all field updates.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldIdsFilter")
  public List<String> getFieldIdsFilter() {
    return fieldIdsFilter;
  }

  public void setFieldIdsFilter(List<String> fieldIdsFilter) {
    this.fieldIdsFilter = fieldIdsFilter;
  }

  public Webhook id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the webhook.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the webhook.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Webhook issuePropertyKeysFilter(List<String> issuePropertyKeysFilter) {
    this.issuePropertyKeysFilter = issuePropertyKeysFilter;
    return this;
  }

  public Webhook addIssuePropertyKeysFilterItem(String issuePropertyKeysFilterItem) {
    if (this.issuePropertyKeysFilter == null) {
      this.issuePropertyKeysFilter = new ArrayList<>();
    }
    this.issuePropertyKeysFilter.add(issuePropertyKeysFilterItem);
    return this;
  }

  /**
   * A list of issue property keys. A change of those issue properties triggers the `issue_property_set` or `issue_property_deleted` webhooks. If this parameter is not present, the app is notified about all issue property updates.
   * @return issuePropertyKeysFilter
  */
  
  @Schema(name = "issuePropertyKeysFilter", description = "A list of issue property keys. A change of those issue properties triggers the `issue_property_set` or `issue_property_deleted` webhooks. If this parameter is not present, the app is notified about all issue property updates.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuePropertyKeysFilter")
  public List<String> getIssuePropertyKeysFilter() {
    return issuePropertyKeysFilter;
  }

  public void setIssuePropertyKeysFilter(List<String> issuePropertyKeysFilter) {
    this.issuePropertyKeysFilter = issuePropertyKeysFilter;
  }

  public Webhook jqlFilter(String jqlFilter) {
    this.jqlFilter = jqlFilter;
    return this;
  }

  /**
   * The JQL filter that specifies which issues the webhook is sent for.
   * @return jqlFilter
  */
  @NotNull 
  @Schema(name = "jqlFilter", description = "The JQL filter that specifies which issues the webhook is sent for.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("jqlFilter")
  public String getJqlFilter() {
    return jqlFilter;
  }

  public void setJqlFilter(String jqlFilter) {
    this.jqlFilter = jqlFilter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.events, webhook.events) &&
        Objects.equals(this.expirationDate, webhook.expirationDate) &&
        Objects.equals(this.fieldIdsFilter, webhook.fieldIdsFilter) &&
        Objects.equals(this.id, webhook.id) &&
        Objects.equals(this.issuePropertyKeysFilter, webhook.issuePropertyKeysFilter) &&
        Objects.equals(this.jqlFilter, webhook.jqlFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, expirationDate, fieldIdsFilter, id, issuePropertyKeysFilter, jqlFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    fieldIdsFilter: ").append(toIndentedString(fieldIdsFilter)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuePropertyKeysFilter: ").append(toIndentedString(issuePropertyKeysFilter)).append("\n");
    sb.append("    jqlFilter: ").append(toIndentedString(jqlFilter)).append("\n");
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

