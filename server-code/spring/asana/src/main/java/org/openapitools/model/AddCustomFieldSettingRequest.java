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
 * AddCustomFieldSettingRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class AddCustomFieldSettingRequest {

  private String customField;

  private String insertAfter;

  private String insertBefore;

  private Boolean isImportant;

  public AddCustomFieldSettingRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AddCustomFieldSettingRequest(String customField) {
    this.customField = customField;
  }

  public AddCustomFieldSettingRequest customField(String customField) {
    this.customField = customField;
    return this;
  }

  /**
   * The custom field to associate with this container.
   * @return customField
  */
  @NotNull 
  @Schema(name = "custom_field", example = "14916", description = "The custom field to associate with this container.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("custom_field")
  public String getCustomField() {
    return customField;
  }

  public void setCustomField(String customField) {
    this.customField = customField;
  }

  public AddCustomFieldSettingRequest insertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
    return this;
  }

  /**
   * A gid of a Custom Field Setting on this container, after which the new Custom Field Setting will be added.  `insert_before` and `insert_after` parameters cannot both be specified.
   * @return insertAfter
  */
  
  @Schema(name = "insert_after", example = "1331", description = "A gid of a Custom Field Setting on this container, after which the new Custom Field Setting will be added.  `insert_before` and `insert_after` parameters cannot both be specified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_after")
  public String getInsertAfter() {
    return insertAfter;
  }

  public void setInsertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
  }

  public AddCustomFieldSettingRequest insertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
    return this;
  }

  /**
   * A gid of a Custom Field Setting on this container, before which the new Custom Field Setting will be added.  `insert_before` and `insert_after` parameters cannot both be specified.
   * @return insertBefore
  */
  
  @Schema(name = "insert_before", example = "1331", description = "A gid of a Custom Field Setting on this container, before which the new Custom Field Setting will be added.  `insert_before` and `insert_after` parameters cannot both be specified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_before")
  public String getInsertBefore() {
    return insertBefore;
  }

  public void setInsertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
  }

  public AddCustomFieldSettingRequest isImportant(Boolean isImportant) {
    this.isImportant = isImportant;
    return this;
  }

  /**
   * Whether this field should be considered important to this container (for instance, to display in the list view of items in the container).
   * @return isImportant
  */
  
  @Schema(name = "is_important", example = "true", description = "Whether this field should be considered important to this container (for instance, to display in the list view of items in the container).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_important")
  public Boolean getIsImportant() {
    return isImportant;
  }

  public void setIsImportant(Boolean isImportant) {
    this.isImportant = isImportant;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddCustomFieldSettingRequest addCustomFieldSettingRequest = (AddCustomFieldSettingRequest) o;
    return Objects.equals(this.customField, addCustomFieldSettingRequest.customField) &&
        Objects.equals(this.insertAfter, addCustomFieldSettingRequest.insertAfter) &&
        Objects.equals(this.insertBefore, addCustomFieldSettingRequest.insertBefore) &&
        Objects.equals(this.isImportant, addCustomFieldSettingRequest.isImportant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customField, insertAfter, insertBefore, isImportant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCustomFieldSettingRequest {\n");
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
    sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
    sb.append("    isImportant: ").append(toIndentedString(isImportant)).append("\n");
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

