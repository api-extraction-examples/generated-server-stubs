package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProjectRoleActorsUpdateBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ProjectRoleActorsUpdateBean {

  @Valid
  private Map<String, List<String>> categorisedActors = new HashMap<>();

  private Long id;

  public ProjectRoleActorsUpdateBean categorisedActors(Map<String, List<String>> categorisedActors) {
    this.categorisedActors = categorisedActors;
    return this;
  }

  public ProjectRoleActorsUpdateBean putCategorisedActorsItem(String key, List<String> categorisedActorsItem) {
    if (this.categorisedActors == null) {
      this.categorisedActors = new HashMap<>();
    }
    this.categorisedActors.put(key, categorisedActorsItem);
    return this;
  }

  /**
   * The actors to add to the project role.  Add groups using:   *  `atlassian-group-role-actor` and a list of group names.  *  `atlassian-group-role-actor-id` and a list of group IDs.  As a group's name can change, use of `atlassian-group-role-actor-id` is recommended. For example, `\"atlassian-group-role-actor-id\":[\"eef79f81-0b89-4fca-a736-4be531a10869\",\"77f6ab39-e755-4570-a6ae-2d7a8df0bcb8\"]`.  Add users using `atlassian-user-role-actor` and a list of account IDs. For example, `\"atlassian-user-role-actor\":[\"12345678-9abc-def1-2345-6789abcdef12\", \"abcdef12-3456-789a-bcde-f123456789ab\"]`.
   * @return categorisedActors
  */
  @Valid 
  @Schema(name = "categorisedActors", description = "The actors to add to the project role.  Add groups using:   *  `atlassian-group-role-actor` and a list of group names.  *  `atlassian-group-role-actor-id` and a list of group IDs.  As a group's name can change, use of `atlassian-group-role-actor-id` is recommended. For example, `\"atlassian-group-role-actor-id\":[\"eef79f81-0b89-4fca-a736-4be531a10869\",\"77f6ab39-e755-4570-a6ae-2d7a8df0bcb8\"]`.  Add users using `atlassian-user-role-actor` and a list of account IDs. For example, `\"atlassian-user-role-actor\":[\"12345678-9abc-def1-2345-6789abcdef12\", \"abcdef12-3456-789a-bcde-f123456789ab\"]`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categorisedActors")
  public Map<String, List<String>> getCategorisedActors() {
    return categorisedActors;
  }

  public void setCategorisedActors(Map<String, List<String>> categorisedActors) {
    this.categorisedActors = categorisedActors;
  }

  public ProjectRoleActorsUpdateBean id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRoleActorsUpdateBean projectRoleActorsUpdateBean = (ProjectRoleActorsUpdateBean) o;
    return Objects.equals(this.categorisedActors, projectRoleActorsUpdateBean.categorisedActors) &&
        Objects.equals(this.id, projectRoleActorsUpdateBean.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categorisedActors, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRoleActorsUpdateBean {\n");
    sb.append("    categorisedActors: ").append(toIndentedString(categorisedActors)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

