package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Links;
import org.openapitools.model.Statement;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Webhook
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class Webhook {

  private String id;

  private Links links;

  private String name;

  private Boolean true;

  private String secret;

  @Valid
  private List<@Valid Statement> statements;

  @Valid
  private List<String> tags;

  private String url;

  public Webhook id(String id) {
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

  public Webhook links(Links links) {
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
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public Webhook name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the webhook.
   * @return name
  */
  
  @Schema(name = "name", example = "Example hook", description = "The name of the webhook.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Webhook true(Boolean true) {
    this.true = true;
    return this;
  }

  /**
   * Whether this webhook is enabled or not.
   * @return true
  */
  
  @Schema(name = "true", example = "true", description = "Whether this webhook is enabled or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("true")
  public Boolean getTrue() {
    return true;
  }

  public void setTrue(Boolean true) {
    this.true = true;
  }

  public Webhook secret(String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * If defined, the webhooks post request will include a X-LD-Signature header whose value will contain an HMAC SHA256 hex digest of the webhook payload, using the secret as the key.
   * @return secret
  */
  
  @Schema(name = "secret", example = "frobozz", description = "If defined, the webhooks post request will include a X-LD-Signature header whose value will contain an HMAC SHA256 hex digest of the webhook payload, using the secret as the key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secret")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public Webhook statements(List<@Valid Statement> statements) {
    this.statements = statements;
    return this;
  }

  public Webhook addStatementsItem(Statement statementsItem) {
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

  public Webhook tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Webhook addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags assigned to this webhook.
   * @return tags
  */
  
  @Schema(name = "tags", description = "Tags assigned to this webhook.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Webhook url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL of the remote webhook.
   * @return url
  */
  
  @Schema(name = "url", example = "https://example.com/example", description = "The URL of the remote webhook.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.id, webhook.id) &&
        Objects.equals(this.links, webhook.links) &&
        Objects.equals(this.name, webhook.name) &&
        Objects.equals(this.true, webhook.true) &&
        Objects.equals(this.secret, webhook.secret) &&
        Objects.equals(this.statements, webhook.statements) &&
        Objects.equals(this.tags, webhook.tags) &&
        Objects.equals(this.url, webhook.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, links, name, true, secret, statements, tags, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    true: ").append(toIndentedString(true)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

