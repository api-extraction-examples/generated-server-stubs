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
 * PostWebhookRequest
 */

@JsonTypeName("postWebhook_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class PostWebhookRequest {

  private String name;

  private Boolean true;

  private String secret;

  private Boolean sign;

  @Valid
  private List<@Valid Statement> statements;

  @Valid
  private List<String> tags;

  private String url;

  public PostWebhookRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostWebhookRequest(Boolean sign, String url) {
    this.sign = sign;
    this.url = url;
  }

  public PostWebhookRequest name(String name) {
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

  public PostWebhookRequest true(Boolean true) {
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

  public PostWebhookRequest secret(String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * If sign is true, and the secret attribute is omitted, LaunchDarkly will automatically generate a secret for you.
   * @return secret
  */
  
  @Schema(name = "secret", example = "<password>", description = "If sign is true, and the secret attribute is omitted, LaunchDarkly will automatically generate a secret for you.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secret")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public PostWebhookRequest sign(Boolean sign) {
    this.sign = sign;
    return this;
  }

  /**
   * If sign is false, the webhook will not include a signature header, and the secret can be omitted.
   * @return sign
  */
  @NotNull 
  @Schema(name = "sign", description = "If sign is false, the webhook will not include a signature header, and the secret can be omitted.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sign")
  public Boolean getSign() {
    return sign;
  }

  public void setSign(Boolean sign) {
    this.sign = sign;
  }

  public PostWebhookRequest statements(List<@Valid Statement> statements) {
    this.statements = statements;
    return this;
  }

  public PostWebhookRequest addStatementsItem(Statement statementsItem) {
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

  public PostWebhookRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public PostWebhookRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags for the webhook.
   * @return tags
  */
  
  @Schema(name = "tags", example = "[]", description = "Tags for the webhook.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public PostWebhookRequest url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL of the remote webhook.
   * @return url
  */
  @NotNull 
  @Schema(name = "url", example = "https://example.com/example", description = "The URL of the remote webhook.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    PostWebhookRequest postWebhookRequest = (PostWebhookRequest) o;
    return Objects.equals(this.name, postWebhookRequest.name) &&
        Objects.equals(this.true, postWebhookRequest.true) &&
        Objects.equals(this.secret, postWebhookRequest.secret) &&
        Objects.equals(this.sign, postWebhookRequest.sign) &&
        Objects.equals(this.statements, postWebhookRequest.statements) &&
        Objects.equals(this.tags, postWebhookRequest.tags) &&
        Objects.equals(this.url, postWebhookRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, true, secret, sign, statements, tags, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostWebhookRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    true: ").append(toIndentedString(true)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    sign: ").append(toIndentedString(sign)).append("\n");
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

