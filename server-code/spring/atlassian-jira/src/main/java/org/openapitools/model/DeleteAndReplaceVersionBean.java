package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CustomFieldReplacement;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DeleteAndReplaceVersionBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class DeleteAndReplaceVersionBean {

  @Valid
  private List<@Valid CustomFieldReplacement> customFieldReplacementList;

  private Long moveAffectedIssuesTo;

  private Long moveFixIssuesTo;

  public DeleteAndReplaceVersionBean customFieldReplacementList(List<@Valid CustomFieldReplacement> customFieldReplacementList) {
    this.customFieldReplacementList = customFieldReplacementList;
    return this;
  }

  public DeleteAndReplaceVersionBean addCustomFieldReplacementListItem(CustomFieldReplacement customFieldReplacementListItem) {
    if (this.customFieldReplacementList == null) {
      this.customFieldReplacementList = new ArrayList<>();
    }
    this.customFieldReplacementList.add(customFieldReplacementListItem);
    return this;
  }

  /**
   * An array of custom field IDs (`customFieldId`) and version IDs (`moveTo`) to update when the fields contain the deleted version.
   * @return customFieldReplacementList
  */
  @Valid 
  @Schema(name = "customFieldReplacementList", description = "An array of custom field IDs (`customFieldId`) and version IDs (`moveTo`) to update when the fields contain the deleted version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customFieldReplacementList")
  public List<@Valid CustomFieldReplacement> getCustomFieldReplacementList() {
    return customFieldReplacementList;
  }

  public void setCustomFieldReplacementList(List<@Valid CustomFieldReplacement> customFieldReplacementList) {
    this.customFieldReplacementList = customFieldReplacementList;
  }

  public DeleteAndReplaceVersionBean moveAffectedIssuesTo(Long moveAffectedIssuesTo) {
    this.moveAffectedIssuesTo = moveAffectedIssuesTo;
    return this;
  }

  /**
   * The ID of the version to update `affectedVersion` to when the field contains the deleted version.
   * @return moveAffectedIssuesTo
  */
  
  @Schema(name = "moveAffectedIssuesTo", description = "The ID of the version to update `affectedVersion` to when the field contains the deleted version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("moveAffectedIssuesTo")
  public Long getMoveAffectedIssuesTo() {
    return moveAffectedIssuesTo;
  }

  public void setMoveAffectedIssuesTo(Long moveAffectedIssuesTo) {
    this.moveAffectedIssuesTo = moveAffectedIssuesTo;
  }

  public DeleteAndReplaceVersionBean moveFixIssuesTo(Long moveFixIssuesTo) {
    this.moveFixIssuesTo = moveFixIssuesTo;
    return this;
  }

  /**
   * The ID of the version to update `fixVersion` to when the field contains the deleted version.
   * @return moveFixIssuesTo
  */
  
  @Schema(name = "moveFixIssuesTo", description = "The ID of the version to update `fixVersion` to when the field contains the deleted version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("moveFixIssuesTo")
  public Long getMoveFixIssuesTo() {
    return moveFixIssuesTo;
  }

  public void setMoveFixIssuesTo(Long moveFixIssuesTo) {
    this.moveFixIssuesTo = moveFixIssuesTo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteAndReplaceVersionBean deleteAndReplaceVersionBean = (DeleteAndReplaceVersionBean) o;
    return Objects.equals(this.customFieldReplacementList, deleteAndReplaceVersionBean.customFieldReplacementList) &&
        Objects.equals(this.moveAffectedIssuesTo, deleteAndReplaceVersionBean.moveAffectedIssuesTo) &&
        Objects.equals(this.moveFixIssuesTo, deleteAndReplaceVersionBean.moveFixIssuesTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFieldReplacementList, moveAffectedIssuesTo, moveFixIssuesTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteAndReplaceVersionBean {\n");
    sb.append("    customFieldReplacementList: ").append(toIndentedString(customFieldReplacementList)).append("\n");
    sb.append("    moveAffectedIssuesTo: ").append(toIndentedString(moveAffectedIssuesTo)).append("\n");
    sb.append("    moveFixIssuesTo: ").append(toIndentedString(moveFixIssuesTo)).append("\n");
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

