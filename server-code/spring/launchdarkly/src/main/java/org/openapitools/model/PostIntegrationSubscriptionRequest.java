package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Statement;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostIntegrationSubscriptionRequest
 */

@JsonTypeName("postIntegrationSubscription_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class PostIntegrationSubscriptionRequest {

  private Object config;

  private String name;

  private Boolean true;

  @Valid
  private List<@Valid Statement> statements;

  @Valid
  private List<String> tags;

  public PostIntegrationSubscriptionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostIntegrationSubscriptionRequest(Object config, String name) {
    this.config = config;
    this.name = name;
  }

  public PostIntegrationSubscriptionRequest config(Object config) {
    this.config = config;
    return this;
  }

  /**
   * Integration-specific configuration fields.
   * @return config
  */
  @NotNull 
  @Schema(name = "config", example = "{\"apiKey\":\"582**************************116\",\"hostURL\":\"https://api.datadoghq.com\"}", description = "Integration-specific configuration fields.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("config")
  public Object getConfig() {
    return config;
  }

  public void setConfig(Object config) {
    this.config = config;
  }

  public PostIntegrationSubscriptionRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-readable name for your subscription configuration.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Example Datadog Integration", description = "A human-readable name for your subscription configuration.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostIntegrationSubscriptionRequest true(Boolean true) {
    this.true = true;
    return this;
  }

  /**
   * Whether the integration subscription is active or not.
   * @return true
  */
  
  @Schema(name = "true", example = "true", description = "Whether the integration subscription is active or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("true")
  public Boolean getTrue() {
    return true;
  }

  public void setTrue(Boolean true) {
    this.true = true;
  }

  public PostIntegrationSubscriptionRequest statements(List<@Valid Statement> statements) {
    this.statements = statements;
    return this;
  }

  public PostIntegrationSubscriptionRequest addStatementsItem(Statement statementsItem) {
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

  public PostIntegrationSubscriptionRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public PostIntegrationSubscriptionRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags for the integration subscription.
   * @return tags
  */
  
  @Schema(name = "tags", example = "[]", description = "Tags for the integration subscription.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PostIntegrationSubscriptionRequest postIntegrationSubscriptionRequest = (PostIntegrationSubscriptionRequest) o;
    return Objects.equals(this.config, postIntegrationSubscriptionRequest.config) &&
        Objects.equals(this.name, postIntegrationSubscriptionRequest.name) &&
        Objects.equals(this.true, postIntegrationSubscriptionRequest.true) &&
        Objects.equals(this.statements, postIntegrationSubscriptionRequest.statements) &&
        Objects.equals(this.tags, postIntegrationSubscriptionRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, name, true, statements, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostIntegrationSubscriptionRequest {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

