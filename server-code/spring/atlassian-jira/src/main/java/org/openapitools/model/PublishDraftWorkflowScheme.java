package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.StatusMapping;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about the status mappings for publishing a draft workflow scheme.
 */

@Schema(name = "PublishDraftWorkflowScheme", description = "Details about the status mappings for publishing a draft workflow scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class PublishDraftWorkflowScheme {

  @Valid
  private Set<@Valid StatusMapping> statusMappings;

  public PublishDraftWorkflowScheme statusMappings(Set<@Valid StatusMapping> statusMappings) {
    this.statusMappings = statusMappings;
    return this;
  }

  public PublishDraftWorkflowScheme addStatusMappingsItem(StatusMapping statusMappingsItem) {
    if (this.statusMappings == null) {
      this.statusMappings = new LinkedHashSet<>();
    }
    this.statusMappings.add(statusMappingsItem);
    return this;
  }

  /**
   * Mappings of statuses to new statuses for issue types.
   * @return statusMappings
  */
  @Valid 
  @Schema(name = "statusMappings", description = "Mappings of statuses to new statuses for issue types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusMappings")
  public Set<@Valid StatusMapping> getStatusMappings() {
    return statusMappings;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setStatusMappings(Set<@Valid StatusMapping> statusMappings) {
    this.statusMappings = statusMappings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishDraftWorkflowScheme publishDraftWorkflowScheme = (PublishDraftWorkflowScheme) o;
    return Objects.equals(this.statusMappings, publishDraftWorkflowScheme.statusMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishDraftWorkflowScheme {\n");
    sb.append("    statusMappings: ").append(toIndentedString(statusMappings)).append("\n");
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

