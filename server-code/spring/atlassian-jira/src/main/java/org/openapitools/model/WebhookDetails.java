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
 * A list of webhooks.
 */

@Schema(name = "WebhookDetails", description = "A list of webhooks.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WebhookDetails {

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

  @Valid
  private List<String> fieldIdsFilter;

  @Valid
  private List<String> issuePropertyKeysFilter;

  private String jqlFilter;

  public WebhookDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WebhookDetails(List<EventsEnum> events, String jqlFilter) {
    this.events = events;
    this.jqlFilter = jqlFilter;
  }

  public WebhookDetails events(List<EventsEnum> events) {
    this.events = events;
    return this;
  }

  public WebhookDetails addEventsItem(EventsEnum eventsItem) {
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

  public WebhookDetails fieldIdsFilter(List<String> fieldIdsFilter) {
    this.fieldIdsFilter = fieldIdsFilter;
    return this;
  }

  public WebhookDetails addFieldIdsFilterItem(String fieldIdsFilterItem) {
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

  public WebhookDetails issuePropertyKeysFilter(List<String> issuePropertyKeysFilter) {
    this.issuePropertyKeysFilter = issuePropertyKeysFilter;
    return this;
  }

  public WebhookDetails addIssuePropertyKeysFilterItem(String issuePropertyKeysFilterItem) {
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

  public WebhookDetails jqlFilter(String jqlFilter) {
    this.jqlFilter = jqlFilter;
    return this;
  }

  /**
   * The JQL filter that specifies which issues the webhook is sent for. Only a subset of JQL can be used. The supported elements are:   *  Fields: `issueKey`, `project`, `issuetype`, `status`, `assignee`, `reporter`, `issue.property`, and `cf[id]`. For custom fields (`cf[id]`), only the epic label custom field is supported.\".  *  Operators: `=`, `!=`, `IN`, and `NOT IN`.
   * @return jqlFilter
  */
  @NotNull 
  @Schema(name = "jqlFilter", description = "The JQL filter that specifies which issues the webhook is sent for. Only a subset of JQL can be used. The supported elements are:   *  Fields: `issueKey`, `project`, `issuetype`, `status`, `assignee`, `reporter`, `issue.property`, and `cf[id]`. For custom fields (`cf[id]`), only the epic label custom field is supported.\".  *  Operators: `=`, `!=`, `IN`, and `NOT IN`.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    WebhookDetails webhookDetails = (WebhookDetails) o;
    return Objects.equals(this.events, webhookDetails.events) &&
        Objects.equals(this.fieldIdsFilter, webhookDetails.fieldIdsFilter) &&
        Objects.equals(this.issuePropertyKeysFilter, webhookDetails.issuePropertyKeysFilter) &&
        Objects.equals(this.jqlFilter, webhookDetails.jqlFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, fieldIdsFilter, issuePropertyKeysFilter, jqlFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookDetails {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    fieldIdsFilter: ").append(toIndentedString(fieldIdsFilter)).append("\n");
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

