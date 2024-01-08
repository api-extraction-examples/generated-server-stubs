package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CreateGroupResponseGroup;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;CreateGroup&lt;/a&gt; request. 
 */

@Schema(name = "CreateGroupResponse", description = "Contains the response to a successful <a>CreateGroup</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreateGroupResponse {

  private CreateGroupResponseGroup group;

  public CreateGroupResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateGroupResponse(CreateGroupResponseGroup group) {
    this.group = group;
  }

  public CreateGroupResponse group(CreateGroupResponseGroup group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  */
  @NotNull @Valid 
  @Schema(name = "Group", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Group")
  public CreateGroupResponseGroup getGroup() {
    return group;
  }

  public void setGroup(CreateGroupResponseGroup group) {
    this.group = group;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupResponse createGroupResponse = (CreateGroupResponse) o;
    return Objects.equals(this.group, createGroupResponse.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupResponse {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

