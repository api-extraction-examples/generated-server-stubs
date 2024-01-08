package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssociatedItemBean;
import org.openapitools.model.ChangedValueBean;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An audit record.
 */

@Schema(name = "AuditRecordBean", description = "An audit record.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AuditRecordBean {

  @Valid
  private List<@Valid AssociatedItemBean> associatedItems;

  private String authorKey;

  private String category;

  @Valid
  private List<@Valid ChangedValueBean> changedValues;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime created;

  private String description;

  private String eventSource;

  private Long id;

  private AssociatedItemBean objectItem;

  private String remoteAddress;

  private String summary;

  public AuditRecordBean associatedItems(List<@Valid AssociatedItemBean> associatedItems) {
    this.associatedItems = associatedItems;
    return this;
  }

  public AuditRecordBean addAssociatedItemsItem(AssociatedItemBean associatedItemsItem) {
    if (this.associatedItems == null) {
      this.associatedItems = new ArrayList<>();
    }
    this.associatedItems.add(associatedItemsItem);
    return this;
  }

  /**
   * The list of items associated with the changed record.
   * @return associatedItems
  */
  @Valid 
  @Schema(name = "associatedItems", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of items associated with the changed record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("associatedItems")
  public List<@Valid AssociatedItemBean> getAssociatedItems() {
    return associatedItems;
  }

  public void setAssociatedItems(List<@Valid AssociatedItemBean> associatedItems) {
    this.associatedItems = associatedItems;
  }

  public AuditRecordBean authorKey(String authorKey) {
    this.authorKey = authorKey;
    return this;
  }

  /**
   * Deprecated, use `authorAccountId` instead. The key of the user who created the audit record.
   * @return authorKey
  */
  
  @Schema(name = "authorKey", accessMode = Schema.AccessMode.READ_ONLY, description = "Deprecated, use `authorAccountId` instead. The key of the user who created the audit record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorKey")
  public String getAuthorKey() {
    return authorKey;
  }

  public void setAuthorKey(String authorKey) {
    this.authorKey = authorKey;
  }

  public AuditRecordBean category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The category of the audit record. For a list of these categories, see the help article [Auditing in Jira applications](https://confluence.atlassian.com/x/noXKM).
   * @return category
  */
  
  @Schema(name = "category", accessMode = Schema.AccessMode.READ_ONLY, description = "The category of the audit record. For a list of these categories, see the help article [Auditing in Jira applications](https://confluence.atlassian.com/x/noXKM).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public AuditRecordBean changedValues(List<@Valid ChangedValueBean> changedValues) {
    this.changedValues = changedValues;
    return this;
  }

  public AuditRecordBean addChangedValuesItem(ChangedValueBean changedValuesItem) {
    if (this.changedValues == null) {
      this.changedValues = new ArrayList<>();
    }
    this.changedValues.add(changedValuesItem);
    return this;
  }

  /**
   * The list of values changed in the record event.
   * @return changedValues
  */
  @Valid 
  @Schema(name = "changedValues", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of values changed in the record event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changedValues")
  public List<@Valid ChangedValueBean> getChangedValues() {
    return changedValues;
  }

  public void setChangedValues(List<@Valid ChangedValueBean> changedValues) {
    this.changedValues = changedValues;
  }

  public AuditRecordBean created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The date and time on which the audit record was created.
   * @return created
  */
  @Valid 
  @Schema(name = "created", accessMode = Schema.AccessMode.READ_ONLY, description = "The date and time on which the audit record was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public AuditRecordBean description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the audit record.
   * @return description
  */
  
  @Schema(name = "description", accessMode = Schema.AccessMode.READ_ONLY, description = "The description of the audit record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AuditRecordBean eventSource(String eventSource) {
    this.eventSource = eventSource;
    return this;
  }

  /**
   * The event the audit record originated from.
   * @return eventSource
  */
  
  @Schema(name = "eventSource", accessMode = Schema.AccessMode.READ_ONLY, description = "The event the audit record originated from.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventSource")
  public String getEventSource() {
    return eventSource;
  }

  public void setEventSource(String eventSource) {
    this.eventSource = eventSource;
  }

  public AuditRecordBean id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the audit record.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the audit record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AuditRecordBean objectItem(AssociatedItemBean objectItem) {
    this.objectItem = objectItem;
    return this;
  }

  /**
   * Get objectItem
   * @return objectItem
  */
  @Valid 
  @Schema(name = "objectItem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("objectItem")
  public AssociatedItemBean getObjectItem() {
    return objectItem;
  }

  public void setObjectItem(AssociatedItemBean objectItem) {
    this.objectItem = objectItem;
  }

  public AuditRecordBean remoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
    return this;
  }

  /**
   * The URL of the computer where the creation of the audit record was initiated.
   * @return remoteAddress
  */
  
  @Schema(name = "remoteAddress", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the computer where the creation of the audit record was initiated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remoteAddress")
  public String getRemoteAddress() {
    return remoteAddress;
  }

  public void setRemoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
  }

  public AuditRecordBean summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * The summary of the audit record.
   * @return summary
  */
  
  @Schema(name = "summary", accessMode = Schema.AccessMode.READ_ONLY, description = "The summary of the audit record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditRecordBean auditRecordBean = (AuditRecordBean) o;
    return Objects.equals(this.associatedItems, auditRecordBean.associatedItems) &&
        Objects.equals(this.authorKey, auditRecordBean.authorKey) &&
        Objects.equals(this.category, auditRecordBean.category) &&
        Objects.equals(this.changedValues, auditRecordBean.changedValues) &&
        Objects.equals(this.created, auditRecordBean.created) &&
        Objects.equals(this.description, auditRecordBean.description) &&
        Objects.equals(this.eventSource, auditRecordBean.eventSource) &&
        Objects.equals(this.id, auditRecordBean.id) &&
        Objects.equals(this.objectItem, auditRecordBean.objectItem) &&
        Objects.equals(this.remoteAddress, auditRecordBean.remoteAddress) &&
        Objects.equals(this.summary, auditRecordBean.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedItems, authorKey, category, changedValues, created, description, eventSource, id, objectItem, remoteAddress, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditRecordBean {\n");
    sb.append("    associatedItems: ").append(toIndentedString(associatedItems)).append("\n");
    sb.append("    authorKey: ").append(toIndentedString(authorKey)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    changedValues: ").append(toIndentedString(changedValues)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    objectItem: ").append(toIndentedString(objectItem)).append("\n");
    sb.append("    remoteAddress: ").append(toIndentedString(remoteAddress)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

