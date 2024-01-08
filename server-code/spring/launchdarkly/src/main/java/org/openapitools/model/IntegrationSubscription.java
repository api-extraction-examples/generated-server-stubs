package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.HierarchicalLinks;
import org.openapitools.model.IntegrationSubscriptionStatus;
import org.openapitools.model.Statement;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * IntegrationSubscription
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class IntegrationSubscription {

  private String id;

  private HierarchicalLinks links;

  private IntegrationSubscriptionStatus status;

  private Object config;

  private String kind;

  private String name;

  private Boolean true;

  @Valid
  private List<@Valid Statement> statements;

  @Valid
  private List<String> tags;

  public IntegrationSubscription id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique resource id.
   * @return id
  */
  
  @Schema(name = "_id", example = "5a580a01b4ff89217bdf9dc1", description = "The unique resource id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IntegrationSubscription links(HierarchicalLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_links")
  public HierarchicalLinks getLinks() {
    return links;
  }

  public void setLinks(HierarchicalLinks links) {
    this.links = links;
  }

  public IntegrationSubscription status(IntegrationSubscriptionStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "_status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_status")
  public IntegrationSubscriptionStatus getStatus() {
    return status;
  }

  public void setStatus(IntegrationSubscriptionStatus status) {
    this.status = status;
  }

  public IntegrationSubscription config(Object config) {
    this.config = config;
    return this;
  }

  /**
   * A key-value mapping of configuration fields.
   * @return config
  */
  
  @Schema(name = "config", example = "{\"apiKey\":\"582**************************116\",\"hostURL\":\"https://api.datadoghq.com\"}", description = "A key-value mapping of configuration fields.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("config")
  public Object getConfig() {
    return config;
  }

  public void setConfig(Object config) {
    this.config = config;
  }

  public IntegrationSubscription kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The type of integration associated with this configuration.
   * @return kind
  */
  
  @Schema(name = "kind", example = "datadog", description = "The type of integration associated with this configuration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IntegrationSubscription name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The user-defined name associated with this configuration.
   * @return name
  */
  
  @Schema(name = "name", example = "V2", description = "The user-defined name associated with this configuration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IntegrationSubscription true(Boolean true) {
    this.true = true;
    return this;
  }

  /**
   * Whether or not the integration is currently active.
   * @return true
  */
  
  @Schema(name = "true", example = "true", description = "Whether or not the integration is currently active.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("true")
  public Boolean getTrue() {
    return true;
  }

  public void setTrue(Boolean true) {
    this.true = true;
  }

  public IntegrationSubscription statements(List<@Valid Statement> statements) {
    this.statements = statements;
    return this;
  }

  public IntegrationSubscription addStatementsItem(Statement statementsItem) {
    if (this.statements == null) {
      this.statements = new ArrayList<>();
    }
    this.statements.add(statementsItem);
    return this;
  }

  /**
   * Get statements
   * @return statements
  */
  @Valid 
  @Schema(name = "statements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statements")
  public List<@Valid Statement> getStatements() {
    return statements;
  }

  public void setStatements(List<@Valid Statement> statements) {
    this.statements = statements;
  }

  public IntegrationSubscription tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public IntegrationSubscription addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * An array of tags for this integration configuration.
   * @return tags
  */
  
  @Schema(name = "tags", description = "An array of tags for this integration configuration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationSubscription integrationSubscription = (IntegrationSubscription) o;
    return Objects.equals(this.id, integrationSubscription.id) &&
        Objects.equals(this.links, integrationSubscription.links) &&
        Objects.equals(this.status, integrationSubscription.status) &&
        Objects.equals(this.config, integrationSubscription.config) &&
        Objects.equals(this.kind, integrationSubscription.kind) &&
        Objects.equals(this.name, integrationSubscription.name) &&
        Objects.equals(this.true, integrationSubscription.true) &&
        Objects.equals(this.statements, integrationSubscription.statements) &&
        Objects.equals(this.tags, integrationSubscription.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, links, status, config, kind, name, true, statements, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationSubscription {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    true: ").append(toIndentedString(true)).append("\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

