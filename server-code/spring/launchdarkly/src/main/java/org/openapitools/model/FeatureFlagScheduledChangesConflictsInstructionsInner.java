package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ScheduledChangesFeatureFlagConflict;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FeatureFlagScheduledChangesConflictsInstructionsInner
 */

@JsonTypeName("FeatureFlagScheduledChangesConflicts_instructions_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class FeatureFlagScheduledChangesConflictsInstructionsInner {

  @Valid
  private List<@Valid ScheduledChangesFeatureFlagConflict> conflicts;

  private String kind;

  public FeatureFlagScheduledChangesConflictsInstructionsInner conflicts(List<@Valid ScheduledChangesFeatureFlagConflict> conflicts) {
    this.conflicts = conflicts;
    return this;
  }

  public FeatureFlagScheduledChangesConflictsInstructionsInner addConflictsItem(ScheduledChangesFeatureFlagConflict conflictsItem) {
    if (this.conflicts == null) {
      this.conflicts = new ArrayList<>();
    }
    this.conflicts.add(conflictsItem);
    return this;
  }

  /**
   * Get conflicts
   * @return conflicts
  */
  @Valid 
  @Schema(name = "conflicts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conflicts")
  public List<@Valid ScheduledChangesFeatureFlagConflict> getConflicts() {
    return conflicts;
  }

  public void setConflicts(List<@Valid ScheduledChangesFeatureFlagConflict> conflicts) {
    this.conflicts = conflicts;
  }

  public FeatureFlagScheduledChangesConflictsInstructionsInner kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of the modification you would like to perform on a resource.
   * @return kind
  */
  
  @Schema(name = "kind", example = "removeUserTargets", description = "The name of the modification you would like to perform on a resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagScheduledChangesConflictsInstructionsInner featureFlagScheduledChangesConflictsInstructionsInner = (FeatureFlagScheduledChangesConflictsInstructionsInner) o;
    return Objects.equals(this.conflicts, featureFlagScheduledChangesConflictsInstructionsInner.conflicts) &&
        Objects.equals(this.kind, featureFlagScheduledChangesConflictsInstructionsInner.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conflicts, kind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagScheduledChangesConflictsInstructionsInner {\n");
    sb.append("    conflicts: ").append(toIndentedString(conflicts)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

