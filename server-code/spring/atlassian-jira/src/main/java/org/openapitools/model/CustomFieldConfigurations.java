package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.ContextualConfiguration;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of configurations for a custom field.
 */

@Schema(name = "CustomFieldConfigurations", description = "Details of configurations for a custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldConfigurations {

  @Valid
  private Set<@Valid ContextualConfiguration> configurations = new LinkedHashSet<>();

  public CustomFieldConfigurations() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldConfigurations(Set<@Valid ContextualConfiguration> configurations) {
    this.configurations = configurations;
  }

  public CustomFieldConfigurations configurations(Set<@Valid ContextualConfiguration> configurations) {
    this.configurations = configurations;
    return this;
  }

  public CustomFieldConfigurations addConfigurationsItem(ContextualConfiguration configurationsItem) {
    if (this.configurations == null) {
      this.configurations = new LinkedHashSet<>();
    }
    this.configurations.add(configurationsItem);
    return this;
  }

  /**
   * The list of custom field configuration details.
   * @return configurations
  */
  @NotNull @Valid @Size(min = 1, max = 1000) 
  @Schema(name = "configurations", description = "The list of custom field configuration details.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("configurations")
  public Set<@Valid ContextualConfiguration> getConfigurations() {
    return configurations;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setConfigurations(Set<@Valid ContextualConfiguration> configurations) {
    this.configurations = configurations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldConfigurations customFieldConfigurations = (CustomFieldConfigurations) o;
    return Objects.equals(this.configurations, customFieldConfigurations.configurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldConfigurations {\n");
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
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

