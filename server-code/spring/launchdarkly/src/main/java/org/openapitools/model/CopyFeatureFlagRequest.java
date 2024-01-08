package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CopyActions;
import org.openapitools.model.FeatureFlagCopyObject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CopyFeatureFlagRequest
 */

@JsonTypeName("copyFeatureFlag_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class CopyFeatureFlagRequest {

  private String comment;

  @Valid
  private List<@Valid CopyActions> excludedActions;

  @Valid
  private List<@Valid CopyActions> includedActions;

  private FeatureFlagCopyObject source;

  private FeatureFlagCopyObject target;

  public CopyFeatureFlagRequest comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * comment will be included in audit log item for change.
   * @return comment
  */
  
  @Schema(name = "comment", example = "This is a comment string", description = "comment will be included in audit log item for change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public CopyFeatureFlagRequest excludedActions(List<@Valid CopyActions> excludedActions) {
    this.excludedActions = excludedActions;
    return this;
  }

  public CopyFeatureFlagRequest addExcludedActionsItem(CopyActions excludedActionsItem) {
    if (this.excludedActions == null) {
      this.excludedActions = new ArrayList<>();
    }
    this.excludedActions.add(excludedActionsItem);
    return this;
  }

  /**
   * Define the parts of the flag configuration that will not be copied.
   * @return excludedActions
  */
  @Valid 
  @Schema(name = "excludedActions", description = "Define the parts of the flag configuration that will not be copied.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excludedActions")
  public List<@Valid CopyActions> getExcludedActions() {
    return excludedActions;
  }

  public void setExcludedActions(List<@Valid CopyActions> excludedActions) {
    this.excludedActions = excludedActions;
  }

  public CopyFeatureFlagRequest includedActions(List<@Valid CopyActions> includedActions) {
    this.includedActions = includedActions;
    return this;
  }

  public CopyFeatureFlagRequest addIncludedActionsItem(CopyActions includedActionsItem) {
    if (this.includedActions == null) {
      this.includedActions = new ArrayList<>();
    }
    this.includedActions.add(includedActionsItem);
    return this;
  }

  /**
   * Define the parts of the flag configuration that will be copied.
   * @return includedActions
  */
  @Valid 
  @Schema(name = "includedActions", description = "Define the parts of the flag configuration that will be copied.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includedActions")
  public List<@Valid CopyActions> getIncludedActions() {
    return includedActions;
  }

  public void setIncludedActions(List<@Valid CopyActions> includedActions) {
    this.includedActions = includedActions;
  }

  public CopyFeatureFlagRequest source(FeatureFlagCopyObject source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
  @Valid 
  @Schema(name = "source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public FeatureFlagCopyObject getSource() {
    return source;
  }

  public void setSource(FeatureFlagCopyObject source) {
    this.source = source;
  }

  public CopyFeatureFlagRequest target(FeatureFlagCopyObject target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
  */
  @Valid 
  @Schema(name = "target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("target")
  public FeatureFlagCopyObject getTarget() {
    return target;
  }

  public void setTarget(FeatureFlagCopyObject target) {
    this.target = target;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopyFeatureFlagRequest copyFeatureFlagRequest = (CopyFeatureFlagRequest) o;
    return Objects.equals(this.comment, copyFeatureFlagRequest.comment) &&
        Objects.equals(this.excludedActions, copyFeatureFlagRequest.excludedActions) &&
        Objects.equals(this.includedActions, copyFeatureFlagRequest.includedActions) &&
        Objects.equals(this.source, copyFeatureFlagRequest.source) &&
        Objects.equals(this.target, copyFeatureFlagRequest.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, excludedActions, includedActions, source, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopyFeatureFlagRequest {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    excludedActions: ").append(toIndentedString(excludedActions)).append("\n");
    sb.append("    includedActions: ").append(toIndentedString(includedActions)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

