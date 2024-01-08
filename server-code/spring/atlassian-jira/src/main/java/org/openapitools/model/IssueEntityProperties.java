package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapitools.model.JsonNode;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Lists of issues and entity properties. See [Entity properties](https://developer.atlassian.com/cloud/jira/platform/jira-entity-properties/) for more information.
 */

@Schema(name = "IssueEntityProperties", description = "Lists of issues and entity properties. See [Entity properties](https://developer.atlassian.com/cloud/jira/platform/jira-entity-properties/) for more information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueEntityProperties {

  @Valid
  private Set<Long> entitiesIds;

  @Valid
  private Map<String, JsonNode> properties = new HashMap<>();

  public IssueEntityProperties entitiesIds(Set<Long> entitiesIds) {
    this.entitiesIds = entitiesIds;
    return this;
  }

  public IssueEntityProperties addEntitiesIdsItem(Long entitiesIdsItem) {
    if (this.entitiesIds == null) {
      this.entitiesIds = new LinkedHashSet<>();
    }
    this.entitiesIds.add(entitiesIdsItem);
    return this;
  }

  /**
   * A list of entity property IDs.
   * @return entitiesIds
  */
  @Size(min = 1, max = 10000) 
  @Schema(name = "entitiesIds", description = "A list of entity property IDs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entitiesIds")
  public Set<Long> getEntitiesIds() {
    return entitiesIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setEntitiesIds(Set<Long> entitiesIds) {
    this.entitiesIds = entitiesIds;
  }

  public IssueEntityProperties properties(Map<String, JsonNode> properties) {
    this.properties = properties;
    return this;
  }

  public IssueEntityProperties putPropertiesItem(String key, JsonNode propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * A list of entity property keys and values.
   * @return properties
  */
  @Valid @Size(min = 1, max = 10) 
  @Schema(name = "properties", description = "A list of entity property keys and values.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public Map<String, JsonNode> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, JsonNode> properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueEntityProperties issueEntityProperties = (IssueEntityProperties) o;
    return Objects.equals(this.entitiesIds, issueEntityProperties.entitiesIds) &&
        Objects.equals(this.properties, issueEntityProperties.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitiesIds, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueEntityProperties {\n");
    sb.append("    entitiesIds: ").append(toIndentedString(entitiesIds)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

