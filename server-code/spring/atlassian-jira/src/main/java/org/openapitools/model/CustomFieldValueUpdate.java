package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * A list of issue IDs and the value to update a custom field to.
 */

@Schema(name = "CustomFieldValueUpdate", description = "A list of issue IDs and the value to update a custom field to.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldValueUpdate {

  @Valid
  private List<Long> issueIds = new ArrayList<>();

  private JsonNullable<Object> value = JsonNullable.<Object>undefined();

  public CustomFieldValueUpdate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldValueUpdate(List<Long> issueIds, Object value) {
    this.issueIds = issueIds;
    this.value = JsonNullable.of(value);
  }

  public CustomFieldValueUpdate issueIds(List<Long> issueIds) {
    this.issueIds = issueIds;
    return this;
  }

  public CustomFieldValueUpdate addIssueIdsItem(Long issueIdsItem) {
    if (this.issueIds == null) {
      this.issueIds = new ArrayList<>();
    }
    this.issueIds.add(issueIdsItem);
    return this;
  }

  /**
   * The list of issue IDs.
   * @return issueIds
  */
  @NotNull 
  @Schema(name = "issueIds", description = "The list of issue IDs.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueIds")
  public List<Long> getIssueIds() {
    return issueIds;
  }

  public void setIssueIds(List<Long> issueIds) {
    this.issueIds = issueIds;
  }

  public CustomFieldValueUpdate value(Object value) {
    this.value = JsonNullable.of(value);
    return this;
  }

  /**
   * The value for the custom field. The value must be compatible with the [custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#data-types) as follows:   *  `string` the value must be a string.  *  `number` the value must be a number.  *  `datetime` the value must be a string that represents a date in the ISO format or the simplified extended ISO format. For example, `\"2023-01-18T12:00:00-03:00\"` or `\"2023-01-18T12:00:00.000Z\"`. However, the milliseconds part is ignored.  *  `user` the value must be an object that contains the `accountId` field.  *  `group` the value must be an object that contains the group `name` or `groupId` field. Because group names can change, we recommend using `groupId`.  A list of appropriate values must be provided if the field is of the `list` [collection type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#collection-types).
   * @return value
  */
  @NotNull 
  @Schema(name = "value", description = "The value for the custom field. The value must be compatible with the [custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#data-types) as follows:   *  `string` the value must be a string.  *  `number` the value must be a number.  *  `datetime` the value must be a string that represents a date in the ISO format or the simplified extended ISO format. For example, `\"2023-01-18T12:00:00-03:00\"` or `\"2023-01-18T12:00:00.000Z\"`. However, the milliseconds part is ignored.  *  `user` the value must be an object that contains the `accountId` field.  *  `group` the value must be an object that contains the group `name` or `groupId` field. Because group names can change, we recommend using `groupId`.  A list of appropriate values must be provided if the field is of the `list` [collection type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#collection-types).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public JsonNullable<Object> getValue() {
    return value;
  }

  public void setValue(JsonNullable<Object> value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldValueUpdate customFieldValueUpdate = (CustomFieldValueUpdate) o;
    return Objects.equals(this.issueIds, customFieldValueUpdate.issueIds) &&
        Objects.equals(this.value, customFieldValueUpdate.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueIds, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldValueUpdate {\n");
    sb.append("    issueIds: ").append(toIndentedString(issueIds)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

