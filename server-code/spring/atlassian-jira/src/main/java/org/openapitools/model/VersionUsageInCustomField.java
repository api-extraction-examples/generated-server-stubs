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

/**
 * List of custom fields using the version.
 */

@Schema(name = "VersionUsageInCustomField", description = "List of custom fields using the version.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class VersionUsageInCustomField {

  private Long customFieldId;

  private String fieldName;

  private Long issueCountWithVersionInCustomField;

  public VersionUsageInCustomField customFieldId(Long customFieldId) {
    this.customFieldId = customFieldId;
    return this;
  }

  /**
   * The ID of the custom field.
   * @return customFieldId
  */
  
  @Schema(name = "customFieldId", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customFieldId")
  public Long getCustomFieldId() {
    return customFieldId;
  }

  public void setCustomFieldId(Long customFieldId) {
    this.customFieldId = customFieldId;
  }

  public VersionUsageInCustomField fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * The name of the custom field.
   * @return fieldName
  */
  
  @Schema(name = "fieldName", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldName")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public VersionUsageInCustomField issueCountWithVersionInCustomField(Long issueCountWithVersionInCustomField) {
    this.issueCountWithVersionInCustomField = issueCountWithVersionInCustomField;
    return this;
  }

  /**
   * Count of the issues where the custom field contains the version.
   * @return issueCountWithVersionInCustomField
  */
  
  @Schema(name = "issueCountWithVersionInCustomField", accessMode = Schema.AccessMode.READ_ONLY, description = "Count of the issues where the custom field contains the version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueCountWithVersionInCustomField")
  public Long getIssueCountWithVersionInCustomField() {
    return issueCountWithVersionInCustomField;
  }

  public void setIssueCountWithVersionInCustomField(Long issueCountWithVersionInCustomField) {
    this.issueCountWithVersionInCustomField = issueCountWithVersionInCustomField;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionUsageInCustomField versionUsageInCustomField = (VersionUsageInCustomField) o;
    return Objects.equals(this.customFieldId, versionUsageInCustomField.customFieldId) &&
        Objects.equals(this.fieldName, versionUsageInCustomField.fieldName) &&
        Objects.equals(this.issueCountWithVersionInCustomField, versionUsageInCustomField.issueCountWithVersionInCustomField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFieldId, fieldName, issueCountWithVersionInCustomField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionUsageInCustomField {\n");
    sb.append("    customFieldId: ").append(toIndentedString(customFieldId)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    issueCountWithVersionInCustomField: ").append(toIndentedString(issueCountWithVersionInCustomField)).append("\n");
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

