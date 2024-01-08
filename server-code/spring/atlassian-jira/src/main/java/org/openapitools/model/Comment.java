package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CommentAuthor;
import org.openapitools.model.CommentUpdateAuthor;
import org.openapitools.model.EntityProperty;
import org.openapitools.model.Visibility;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * A comment.
 */

@Schema(name = "Comment", description = "A comment.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Comment {

  private CommentAuthor author;

  private JsonNullable<Object> body = JsonNullable.<Object>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime created;

  private String id;

  private Boolean jsdAuthorCanSeeRequest;

  private Boolean jsdPublic;

  @Valid
  private List<@Valid EntityProperty> properties;

  private String renderedBody;

  private String self;

  private CommentUpdateAuthor updateAuthor;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updated;

  private Visibility visibility;

  public Comment author(CommentAuthor author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  */
  @Valid 
  @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author")
  public CommentAuthor getAuthor() {
    return author;
  }

  public void setAuthor(CommentAuthor author) {
    this.author = author;
  }

  public Comment body(Object body) {
    this.body = JsonNullable.of(body);
    return this;
  }

  /**
   * The comment text in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/).
   * @return body
  */
  
  @Schema(name = "body", description = "The comment text in [Atlassian Document Format](https://developer.atlassian.com/cloud/jira/platform/apis/document/structure/).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("body")
  public JsonNullable<Object> getBody() {
    return body;
  }

  public void setBody(JsonNullable<Object> body) {
    this.body = body;
  }

  public Comment created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The date and time at which the comment was created.
   * @return created
  */
  @Valid 
  @Schema(name = "created", accessMode = Schema.AccessMode.READ_ONLY, description = "The date and time at which the comment was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Comment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the comment.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the comment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Comment jsdAuthorCanSeeRequest(Boolean jsdAuthorCanSeeRequest) {
    this.jsdAuthorCanSeeRequest = jsdAuthorCanSeeRequest;
    return this;
  }

  /**
   * Whether the comment was added from an email sent by a person who is not part of the issue. See [Allow external emails to be added as comments on issues](https://support.atlassian.com/jira-service-management-cloud/docs/allow-external-emails-to-be-added-as-comments-on-issues/)for information on setting up this feature.
   * @return jsdAuthorCanSeeRequest
  */
  
  @Schema(name = "jsdAuthorCanSeeRequest", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the comment was added from an email sent by a person who is not part of the issue. See [Allow external emails to be added as comments on issues](https://support.atlassian.com/jira-service-management-cloud/docs/allow-external-emails-to-be-added-as-comments-on-issues/)for information on setting up this feature.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jsdAuthorCanSeeRequest")
  public Boolean getJsdAuthorCanSeeRequest() {
    return jsdAuthorCanSeeRequest;
  }

  public void setJsdAuthorCanSeeRequest(Boolean jsdAuthorCanSeeRequest) {
    this.jsdAuthorCanSeeRequest = jsdAuthorCanSeeRequest;
  }

  public Comment jsdPublic(Boolean jsdPublic) {
    this.jsdPublic = jsdPublic;
    return this;
  }

  /**
   * Whether the comment is visible in Jira Service Desk. Defaults to true when comments are created in the Jira Cloud Platform. This includes when the site doesn't use Jira Service Desk or the project isn't a Jira Service Desk project and, therefore, there is no Jira Service Desk for the issue to be visible on. To create a comment with its visibility in Jira Service Desk set to false, use the Jira Service Desk REST API [Create request comment](https://developer.atlassian.com/cloud/jira/service-desk/rest/#api-rest-servicedeskapi-request-issueIdOrKey-comment-post) operation.
   * @return jsdPublic
  */
  
  @Schema(name = "jsdPublic", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the comment is visible in Jira Service Desk. Defaults to true when comments are created in the Jira Cloud Platform. This includes when the site doesn't use Jira Service Desk or the project isn't a Jira Service Desk project and, therefore, there is no Jira Service Desk for the issue to be visible on. To create a comment with its visibility in Jira Service Desk set to false, use the Jira Service Desk REST API [Create request comment](https://developer.atlassian.com/cloud/jira/service-desk/rest/#api-rest-servicedeskapi-request-issueIdOrKey-comment-post) operation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jsdPublic")
  public Boolean getJsdPublic() {
    return jsdPublic;
  }

  public void setJsdPublic(Boolean jsdPublic) {
    this.jsdPublic = jsdPublic;
  }

  public Comment properties(List<@Valid EntityProperty> properties) {
    this.properties = properties;
    return this;
  }

  public Comment addPropertiesItem(EntityProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * A list of comment properties. Optional on create and update.
   * @return properties
  */
  @Valid 
  @Schema(name = "properties", description = "A list of comment properties. Optional on create and update.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public List<@Valid EntityProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<@Valid EntityProperty> properties) {
    this.properties = properties;
  }

  public Comment renderedBody(String renderedBody) {
    this.renderedBody = renderedBody;
    return this;
  }

  /**
   * The rendered version of the comment.
   * @return renderedBody
  */
  
  @Schema(name = "renderedBody", accessMode = Schema.AccessMode.READ_ONLY, description = "The rendered version of the comment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("renderedBody")
  public String getRenderedBody() {
    return renderedBody;
  }

  public void setRenderedBody(String renderedBody) {
    this.renderedBody = renderedBody;
  }

  public Comment self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the comment.
   * @return self
  */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the comment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public Comment updateAuthor(CommentUpdateAuthor updateAuthor) {
    this.updateAuthor = updateAuthor;
    return this;
  }

  /**
   * Get updateAuthor
   * @return updateAuthor
  */
  @Valid 
  @Schema(name = "updateAuthor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateAuthor")
  public CommentUpdateAuthor getUpdateAuthor() {
    return updateAuthor;
  }

  public void setUpdateAuthor(CommentUpdateAuthor updateAuthor) {
    this.updateAuthor = updateAuthor;
  }

  public Comment updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * The date and time at which the comment was updated last.
   * @return updated
  */
  @Valid 
  @Schema(name = "updated", accessMode = Schema.AccessMode.READ_ONLY, description = "The date and time at which the comment was updated last.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public Comment visibility(Visibility visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   * @return visibility
  */
  @Valid 
  @Schema(name = "visibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public Visibility getVisibility() {
    return visibility;
  }

  public void setVisibility(Visibility visibility) {
    this.visibility = visibility;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public Comment putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.author, comment.author) &&
        equalsNullable(this.body, comment.body) &&
        Objects.equals(this.created, comment.created) &&
        Objects.equals(this.id, comment.id) &&
        Objects.equals(this.jsdAuthorCanSeeRequest, comment.jsdAuthorCanSeeRequest) &&
        Objects.equals(this.jsdPublic, comment.jsdPublic) &&
        Objects.equals(this.properties, comment.properties) &&
        Objects.equals(this.renderedBody, comment.renderedBody) &&
        Objects.equals(this.self, comment.self) &&
        Objects.equals(this.updateAuthor, comment.updateAuthor) &&
        Objects.equals(this.updated, comment.updated) &&
        Objects.equals(this.visibility, comment.visibility) &&
    Objects.equals(this.additionalProperties, comment.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, hashCodeNullable(body), created, id, jsdAuthorCanSeeRequest, jsdPublic, properties, renderedBody, self, updateAuthor, updated, visibility, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jsdAuthorCanSeeRequest: ").append(toIndentedString(jsdAuthorCanSeeRequest)).append("\n");
    sb.append("    jsdPublic: ").append(toIndentedString(jsdPublic)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    renderedBody: ").append(toIndentedString(renderedBody)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    updateAuthor: ").append(toIndentedString(updateAuthor)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

