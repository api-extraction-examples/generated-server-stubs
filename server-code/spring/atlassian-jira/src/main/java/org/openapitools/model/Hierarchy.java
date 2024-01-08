package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SimplifiedHierarchyLevel;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The project issue type hierarchy.
 */

@Schema(name = "Hierarchy", description = "The project issue type hierarchy.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Hierarchy {

  private Long baseLevelId;

  @Valid
  private List<@Valid SimplifiedHierarchyLevel> levels;

  public Hierarchy baseLevelId(Long baseLevelId) {
    this.baseLevelId = baseLevelId;
    return this;
  }

  /**
   * The ID of the base level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
   * @return baseLevelId
  */
  
  @Schema(name = "baseLevelId", description = "The ID of the base level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("baseLevelId")
  public Long getBaseLevelId() {
    return baseLevelId;
  }

  public void setBaseLevelId(Long baseLevelId) {
    this.baseLevelId = baseLevelId;
  }

  public Hierarchy levels(List<@Valid SimplifiedHierarchyLevel> levels) {
    this.levels = levels;
    return this;
  }

  public Hierarchy addLevelsItem(SimplifiedHierarchyLevel levelsItem) {
    if (this.levels == null) {
      this.levels = new ArrayList<>();
    }
    this.levels.add(levelsItem);
    return this;
  }

  /**
   * Details about the hierarchy level.
   * @return levels
  */
  @Valid 
  @Schema(name = "levels", accessMode = Schema.AccessMode.READ_ONLY, description = "Details about the hierarchy level.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("levels")
  public List<@Valid SimplifiedHierarchyLevel> getLevels() {
    return levels;
  }

  public void setLevels(List<@Valid SimplifiedHierarchyLevel> levels) {
    this.levels = levels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hierarchy hierarchy = (Hierarchy) o;
    return Objects.equals(this.baseLevelId, hierarchy.baseLevelId) &&
        Objects.equals(this.levels, hierarchy.levels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseLevelId, levels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hierarchy {\n");
    sb.append("    baseLevelId: ").append(toIndentedString(baseLevelId)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
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

