package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * Details of a project feature.
 */

@Schema(name = "ProjectFeature", description = "Details of a project feature.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ProjectFeature {

  private String feature;

  private String imageUri;

  private String localisedDescription;

  private String localisedName;

  @Valid
  private List<String> prerequisites;

  private Long projectId;

  /**
   * The state of the feature. When updating the state of a feature, only ENABLED and DISABLED are supported. Responses can contain all values
   */
  public enum StateEnum {
    ENABLED("ENABLED"),
    
    DISABLED("DISABLED"),
    
    COMING_SOON("COMING_SOON");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StateEnum state;

  private Boolean toggleLocked;

  public ProjectFeature feature(String feature) {
    this.feature = feature;
    return this;
  }

  /**
   * The key of the feature.
   * @return feature
  */
  
  @Schema(name = "feature", description = "The key of the feature.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feature")
  public String getFeature() {
    return feature;
  }

  public void setFeature(String feature) {
    this.feature = feature;
  }

  public ProjectFeature imageUri(String imageUri) {
    this.imageUri = imageUri;
    return this;
  }

  /**
   * URI for the image representing the feature.
   * @return imageUri
  */
  
  @Schema(name = "imageUri", description = "URI for the image representing the feature.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageUri")
  public String getImageUri() {
    return imageUri;
  }

  public void setImageUri(String imageUri) {
    this.imageUri = imageUri;
  }

  public ProjectFeature localisedDescription(String localisedDescription) {
    this.localisedDescription = localisedDescription;
    return this;
  }

  /**
   * Localized display description for the feature.
   * @return localisedDescription
  */
  
  @Schema(name = "localisedDescription", description = "Localized display description for the feature.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("localisedDescription")
  public String getLocalisedDescription() {
    return localisedDescription;
  }

  public void setLocalisedDescription(String localisedDescription) {
    this.localisedDescription = localisedDescription;
  }

  public ProjectFeature localisedName(String localisedName) {
    this.localisedName = localisedName;
    return this;
  }

  /**
   * Localized display name for the feature.
   * @return localisedName
  */
  
  @Schema(name = "localisedName", description = "Localized display name for the feature.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("localisedName")
  public String getLocalisedName() {
    return localisedName;
  }

  public void setLocalisedName(String localisedName) {
    this.localisedName = localisedName;
  }

  public ProjectFeature prerequisites(List<String> prerequisites) {
    this.prerequisites = prerequisites;
    return this;
  }

  public ProjectFeature addPrerequisitesItem(String prerequisitesItem) {
    if (this.prerequisites == null) {
      this.prerequisites = new ArrayList<>();
    }
    this.prerequisites.add(prerequisitesItem);
    return this;
  }

  /**
   * List of keys of the features required to enable the feature.
   * @return prerequisites
  */
  
  @Schema(name = "prerequisites", description = "List of keys of the features required to enable the feature.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prerequisites")
  public List<String> getPrerequisites() {
    return prerequisites;
  }

  public void setPrerequisites(List<String> prerequisites) {
    this.prerequisites = prerequisites;
  }

  public ProjectFeature projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the project.
   * @return projectId
  */
  
  @Schema(name = "projectId", description = "The ID of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectId")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public ProjectFeature state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * The state of the feature. When updating the state of a feature, only ENABLED and DISABLED are supported. Responses can contain all values
   * @return state
  */
  
  @Schema(name = "state", description = "The state of the feature. When updating the state of a feature, only ENABLED and DISABLED are supported. Responses can contain all values", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public ProjectFeature toggleLocked(Boolean toggleLocked) {
    this.toggleLocked = toggleLocked;
    return this;
  }

  /**
   * Whether the state of the feature can be updated.
   * @return toggleLocked
  */
  
  @Schema(name = "toggleLocked", description = "Whether the state of the feature can be updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("toggleLocked")
  public Boolean getToggleLocked() {
    return toggleLocked;
  }

  public void setToggleLocked(Boolean toggleLocked) {
    this.toggleLocked = toggleLocked;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectFeature projectFeature = (ProjectFeature) o;
    return Objects.equals(this.feature, projectFeature.feature) &&
        Objects.equals(this.imageUri, projectFeature.imageUri) &&
        Objects.equals(this.localisedDescription, projectFeature.localisedDescription) &&
        Objects.equals(this.localisedName, projectFeature.localisedName) &&
        Objects.equals(this.prerequisites, projectFeature.prerequisites) &&
        Objects.equals(this.projectId, projectFeature.projectId) &&
        Objects.equals(this.state, projectFeature.state) &&
        Objects.equals(this.toggleLocked, projectFeature.toggleLocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feature, imageUri, localisedDescription, localisedName, prerequisites, projectId, state, toggleLocked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectFeature {\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    imageUri: ").append(toIndentedString(imageUri)).append("\n");
    sb.append("    localisedDescription: ").append(toIndentedString(localisedDescription)).append("\n");
    sb.append("    localisedName: ").append(toIndentedString(localisedName)).append("\n");
    sb.append("    prerequisites: ").append(toIndentedString(prerequisites)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    toggleLocked: ").append(toIndentedString(toggleLocked)).append("\n");
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

