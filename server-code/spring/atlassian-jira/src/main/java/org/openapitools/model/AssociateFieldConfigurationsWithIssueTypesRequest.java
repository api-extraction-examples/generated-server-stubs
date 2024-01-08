package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.FieldConfigurationToIssueTypeMapping;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of a field configuration to issue type mappings.
 */

@Schema(name = "AssociateFieldConfigurationsWithIssueTypesRequest", description = "Details of a field configuration to issue type mappings.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AssociateFieldConfigurationsWithIssueTypesRequest {

  @Valid
  private Set<@Valid FieldConfigurationToIssueTypeMapping> mappings = new LinkedHashSet<>();

  public AssociateFieldConfigurationsWithIssueTypesRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AssociateFieldConfigurationsWithIssueTypesRequest(Set<@Valid FieldConfigurationToIssueTypeMapping> mappings) {
    this.mappings = mappings;
  }

  public AssociateFieldConfigurationsWithIssueTypesRequest mappings(Set<@Valid FieldConfigurationToIssueTypeMapping> mappings) {
    this.mappings = mappings;
    return this;
  }

  public AssociateFieldConfigurationsWithIssueTypesRequest addMappingsItem(FieldConfigurationToIssueTypeMapping mappingsItem) {
    if (this.mappings == null) {
      this.mappings = new LinkedHashSet<>();
    }
    this.mappings.add(mappingsItem);
    return this;
  }

  /**
   * Field configuration to issue type mappings.
   * @return mappings
  */
  @NotNull @Valid 
  @Schema(name = "mappings", description = "Field configuration to issue type mappings.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mappings")
  public Set<@Valid FieldConfigurationToIssueTypeMapping> getMappings() {
    return mappings;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setMappings(Set<@Valid FieldConfigurationToIssueTypeMapping> mappings) {
    this.mappings = mappings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociateFieldConfigurationsWithIssueTypesRequest associateFieldConfigurationsWithIssueTypesRequest = (AssociateFieldConfigurationsWithIssueTypesRequest) o;
    return Objects.equals(this.mappings, associateFieldConfigurationsWithIssueTypesRequest.mappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociateFieldConfigurationsWithIssueTypesRequest {\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
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

