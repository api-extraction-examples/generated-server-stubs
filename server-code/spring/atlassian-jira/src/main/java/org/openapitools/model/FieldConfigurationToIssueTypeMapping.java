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
 * The field configuration to issue type mapping.
 */

@Schema(name = "FieldConfigurationToIssueTypeMapping", description = "The field configuration to issue type mapping.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FieldConfigurationToIssueTypeMapping {

  private String fieldConfigurationId;

  private String issueTypeId;

  public FieldConfigurationToIssueTypeMapping() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FieldConfigurationToIssueTypeMapping(String fieldConfigurationId, String issueTypeId) {
    this.fieldConfigurationId = fieldConfigurationId;
    this.issueTypeId = issueTypeId;
  }

  public FieldConfigurationToIssueTypeMapping fieldConfigurationId(String fieldConfigurationId) {
    this.fieldConfigurationId = fieldConfigurationId;
    return this;
  }

  /**
   * The ID of the field configuration.
   * @return fieldConfigurationId
  */
  @NotNull 
  @Schema(name = "fieldConfigurationId", description = "The ID of the field configuration.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fieldConfigurationId")
  public String getFieldConfigurationId() {
    return fieldConfigurationId;
  }

  public void setFieldConfigurationId(String fieldConfigurationId) {
    this.fieldConfigurationId = fieldConfigurationId;
  }

  public FieldConfigurationToIssueTypeMapping issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

  /**
   * The ID of the issue type or *default*. When set to *default* this field configuration issue type item applies to all issue types without a field configuration. An issue type can be included only once in a request.
   * @return issueTypeId
  */
  @NotNull 
  @Schema(name = "issueTypeId", description = "The ID of the issue type or *default*. When set to *default* this field configuration issue type item applies to all issue types without a field configuration. An issue type can be included only once in a request.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueTypeId")
  public String getIssueTypeId() {
    return issueTypeId;
  }

  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldConfigurationToIssueTypeMapping fieldConfigurationToIssueTypeMapping = (FieldConfigurationToIssueTypeMapping) o;
    return Objects.equals(this.fieldConfigurationId, fieldConfigurationToIssueTypeMapping.fieldConfigurationId) &&
        Objects.equals(this.issueTypeId, fieldConfigurationToIssueTypeMapping.issueTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldConfigurationId, issueTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldConfigurationToIssueTypeMapping {\n");
    sb.append("    fieldConfigurationId: ").append(toIndentedString(fieldConfigurationId)).append("\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
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

