package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ActionResource;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * a role item.  *New in version 2.1.0* 
 */

@Schema(name = "Role", description = "a role item.  *New in version 2.1.0* ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class Role {

  @Valid
  private List<@Valid ActionResource> actions;

  private String name;

  public Role actions(List<@Valid ActionResource> actions) {
    this.actions = actions;
    return this;
  }

  public Role addActionsItem(ActionResource actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Get actions
   * @return actions
  */
  @Valid 
  @Schema(name = "actions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actions")
  public List<@Valid ActionResource> getActions() {
    return actions;
  }

  public void setActions(List<@Valid ActionResource> actions) {
    this.actions = actions;
  }

  public Role name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the role  *Changed in version 2.3.0*&#58; A minimum character length requirement ('minLength') is added. 
   * @return name
  */
  @Size(min = 1) 
  @Schema(name = "name", description = "The name of the role  *Changed in version 2.3.0*&#58; A minimum character length requirement ('minLength') is added. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.actions, role.actions) &&
        Objects.equals(this.name, role.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

