package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.ProjectIssueTypes;
import org.openapitools.model.StatusScope;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of a status.
 */

@Schema(name = "JiraStatus", description = "Details of a status.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JiraStatus {

  private String description;

  private String id;

  private String name;

  private StatusScope scope;

  /**
   * The category of the status.
   */
  public enum StatusCategoryEnum {
    TODO("TODO"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    DONE("DONE");

    private String value;

    StatusCategoryEnum(String value) {
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
    public static StatusCategoryEnum fromValue(String value) {
      for (StatusCategoryEnum b : StatusCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusCategoryEnum statusCategory;

  @Valid
  private Set<@Valid ProjectIssueTypes> usages;

  public JiraStatus description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the status.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JiraStatus id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the status.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public JiraStatus name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the status.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JiraStatus scope(StatusScope scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  */
  @Valid 
  @Schema(name = "scope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scope")
  public StatusScope getScope() {
    return scope;
  }

  public void setScope(StatusScope scope) {
    this.scope = scope;
  }

  public JiraStatus statusCategory(StatusCategoryEnum statusCategory) {
    this.statusCategory = statusCategory;
    return this;
  }

  /**
   * The category of the status.
   * @return statusCategory
  */
  
  @Schema(name = "statusCategory", description = "The category of the status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusCategory")
  public StatusCategoryEnum getStatusCategory() {
    return statusCategory;
  }

  public void setStatusCategory(StatusCategoryEnum statusCategory) {
    this.statusCategory = statusCategory;
  }

  public JiraStatus usages(Set<@Valid ProjectIssueTypes> usages) {
    this.usages = usages;
    return this;
  }

  public JiraStatus addUsagesItem(ProjectIssueTypes usagesItem) {
    if (this.usages == null) {
      this.usages = new LinkedHashSet<>();
    }
    this.usages.add(usagesItem);
    return this;
  }

  /**
   * Projects and issue types where the status is used. Only available if the `usages` expand is requested.
   * @return usages
  */
  @Valid 
  @Schema(name = "usages", description = "Projects and issue types where the status is used. Only available if the `usages` expand is requested.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usages")
  public Set<@Valid ProjectIssueTypes> getUsages() {
    return usages;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setUsages(Set<@Valid ProjectIssueTypes> usages) {
    this.usages = usages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraStatus jiraStatus = (JiraStatus) o;
    return Objects.equals(this.description, jiraStatus.description) &&
        Objects.equals(this.id, jiraStatus.id) &&
        Objects.equals(this.name, jiraStatus.name) &&
        Objects.equals(this.scope, jiraStatus.scope) &&
        Objects.equals(this.statusCategory, jiraStatus.statusCategory) &&
        Objects.equals(this.usages, jiraStatus.usages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, scope, statusCategory, usages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraStatus {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
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

