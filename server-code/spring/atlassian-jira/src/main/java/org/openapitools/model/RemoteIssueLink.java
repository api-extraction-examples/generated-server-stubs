package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.model.Application;
import org.openapitools.model.RemoteObject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of an issue remote link.
 */

@Schema(name = "RemoteIssueLink", description = "Details of an issue remote link.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class RemoteIssueLink {

  private Application application;

  private String globalId;

  private Long id;

  private RemoteObject _object;

  private String relationship;

  private URI self;

  public RemoteIssueLink application(Application application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
  */
  @Valid 
  @Schema(name = "application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public RemoteIssueLink globalId(String globalId) {
    this.globalId = globalId;
    return this;
  }

  /**
   * The global ID of the link, such as the ID of the item on the remote system.
   * @return globalId
  */
  
  @Schema(name = "globalId", description = "The global ID of the link, such as the ID of the item on the remote system.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("globalId")
  public String getGlobalId() {
    return globalId;
  }

  public void setGlobalId(String globalId) {
    this.globalId = globalId;
  }

  public RemoteIssueLink id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the link.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RemoteIssueLink _object(RemoteObject _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
  */
  @Valid 
  @Schema(name = "object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("object")
  public RemoteObject getObject() {
    return _object;
  }

  public void setObject(RemoteObject _object) {
    this._object = _object;
  }

  public RemoteIssueLink relationship(String relationship) {
    this.relationship = relationship;
    return this;
  }

  /**
   * Description of the relationship between the issue and the linked item.
   * @return relationship
  */
  
  @Schema(name = "relationship", description = "Description of the relationship between the issue and the linked item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relationship")
  public String getRelationship() {
    return relationship;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }

  public RemoteIssueLink self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the link.
   * @return self
  */
  @Valid 
  @Schema(name = "self", description = "The URL of the link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteIssueLink remoteIssueLink = (RemoteIssueLink) o;
    return Objects.equals(this.application, remoteIssueLink.application) &&
        Objects.equals(this.globalId, remoteIssueLink.globalId) &&
        Objects.equals(this.id, remoteIssueLink.id) &&
        Objects.equals(this._object, remoteIssueLink._object) &&
        Objects.equals(this.relationship, remoteIssueLink.relationship) &&
        Objects.equals(this.self, remoteIssueLink.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, globalId, id, _object, relationship, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteIssueLink {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

