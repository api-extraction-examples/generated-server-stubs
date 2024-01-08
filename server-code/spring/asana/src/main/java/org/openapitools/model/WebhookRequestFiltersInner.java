package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * WebhookRequestFiltersInner
 */

@JsonTypeName("WebhookRequest_filters_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class WebhookRequestFiltersInner {

  private String action;

  @Valid
  private List<String> fields;

  private String resourceSubtype;

  private String resourceType;

  public WebhookRequestFiltersInner action(String action) {
    this.action = action;
    return this;
  }

  /**
   * The type of change on the **resource** to pass through the filter. For more information refer to `Event.action` in the [Event](/docs/tocS_Event) schema. This can be one of `changed`, `added`, `removed`, `deleted`, and `undeleted` depending on the nature of what has occurred on the resource.
   * @return action
  */
  
  @Schema(name = "action", example = "changed", description = "The type of change on the **resource** to pass through the filter. For more information refer to `Event.action` in the [Event](/docs/tocS_Event) schema. This can be one of `changed`, `added`, `removed`, `deleted`, and `undeleted` depending on the nature of what has occurred on the resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public WebhookRequestFiltersInner fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public WebhookRequestFiltersInner addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * *Conditional.* A whitelist of fields for events which will pass the filter when the resource is changed. These can be any combination of the fields on the resources themselves. This field is only valid for `action` of type `changed`
   * @return fields
  */
  
  @Schema(name = "fields", example = "[due_at, due_on, dependencies]", description = "*Conditional.* A whitelist of fields for events which will pass the filter when the resource is changed. These can be any combination of the fields on the resources themselves. This field is only valid for `action` of type `changed`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  public WebhookRequestFiltersInner resourceSubtype(String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The resource subtype of the resource that the filter applies to. This should be set to the same value as is returned on the `resource_subtype` field on the resources themselves.
   * @return resourceSubtype
  */
  
  @Schema(name = "resource_subtype", example = "milestone", description = "The resource subtype of the resource that the filter applies to. This should be set to the same value as is returned on the `resource_subtype` field on the resources themselves.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public String getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public WebhookRequestFiltersInner resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The type of the resource which created the event when modified; for example, to filter to changes on regular tasks this field should be set to `task`.
   * @return resourceType
  */
  
  @Schema(name = "resource_type", example = "task", description = "The type of the resource which created the event when modified; for example, to filter to changes on regular tasks this field should be set to `task`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookRequestFiltersInner webhookRequestFiltersInner = (WebhookRequestFiltersInner) o;
    return Objects.equals(this.action, webhookRequestFiltersInner.action) &&
        Objects.equals(this.fields, webhookRequestFiltersInner.fields) &&
        Objects.equals(this.resourceSubtype, webhookRequestFiltersInner.resourceSubtype) &&
        Objects.equals(this.resourceType, webhookRequestFiltersInner.resourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, fields, resourceSubtype, resourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookRequestFiltersInner {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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

