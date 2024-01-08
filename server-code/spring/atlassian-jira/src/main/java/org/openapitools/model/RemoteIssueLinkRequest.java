package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Application;
import org.openapitools.model.RemoteObject;
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
 * Details of a remote issue link.
 */

@Schema(name = "RemoteIssueLinkRequest", description = "Details of a remote issue link.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class RemoteIssueLinkRequest {

  private Application application;

  private String globalId;

  private RemoteObject _object;

  private String relationship;

  public RemoteIssueLinkRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RemoteIssueLinkRequest(RemoteObject _object) {
    this._object = _object;
  }

  public RemoteIssueLinkRequest application(Application application) {
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

  public RemoteIssueLinkRequest globalId(String globalId) {
    this.globalId = globalId;
    return this;
  }

  /**
   * An identifier for the remote item in the remote system. For example, the global ID for a remote item in Confluence would consist of the app ID and page ID, like this: `appId=456&pageId=123`.  Setting this field enables the remote issue link details to be updated or deleted using remote system and item details as the record identifier, rather than using the record's Jira ID.  The maximum length is 255 characters.
   * @return globalId
  */
  
  @Schema(name = "globalId", description = "An identifier for the remote item in the remote system. For example, the global ID for a remote item in Confluence would consist of the app ID and page ID, like this: `appId=456&pageId=123`.  Setting this field enables the remote issue link details to be updated or deleted using remote system and item details as the record identifier, rather than using the record's Jira ID.  The maximum length is 255 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("globalId")
  public String getGlobalId() {
    return globalId;
  }

  public void setGlobalId(String globalId) {
    this.globalId = globalId;
  }

  public RemoteIssueLinkRequest _object(RemoteObject _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
  */
  @NotNull @Valid 
  @Schema(name = "object", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public RemoteObject getObject() {
    return _object;
  }

  public void setObject(RemoteObject _object) {
    this._object = _object;
  }

  public RemoteIssueLinkRequest relationship(String relationship) {
    this.relationship = relationship;
    return this;
  }

  /**
   * Description of the relationship between the issue and the linked item. If not set, the relationship description \"links to\" is used in Jira.
   * @return relationship
  */
  
  @Schema(name = "relationship", description = "Description of the relationship between the issue and the linked item. If not set, the relationship description \"links to\" is used in Jira.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relationship")
  public String getRelationship() {
    return relationship;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
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
    public RemoteIssueLinkRequest putAdditionalProperty(String key, Object value) {
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
    RemoteIssueLinkRequest remoteIssueLinkRequest = (RemoteIssueLinkRequest) o;
    return Objects.equals(this.application, remoteIssueLinkRequest.application) &&
        Objects.equals(this.globalId, remoteIssueLinkRequest.globalId) &&
        Objects.equals(this._object, remoteIssueLinkRequest._object) &&
        Objects.equals(this.relationship, remoteIssueLinkRequest.relationship) &&
    Objects.equals(this.additionalProperties, remoteIssueLinkRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, globalId, _object, relationship, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteIssueLinkRequest {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    
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

