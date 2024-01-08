package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PersonalisedRadioMetaData;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PersonalisedRadioBatchRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PersonalisedRadioBatchRequest {

  private String action;

  private String addedAt;

  private String context;

  private String id;

  private PersonalisedRadioMetaData metadata;

  private String type;

  public PersonalisedRadioBatchRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PersonalisedRadioBatchRequest(String action) {
    this.action = action;
  }

  public PersonalisedRadioBatchRequest action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  */
  @NotNull 
  @Schema(name = "action", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public PersonalisedRadioBatchRequest addedAt(String addedAt) {
    this.addedAt = addedAt;
    return this;
  }

  /**
   * Get addedAt
   * @return addedAt
  */
  
  @Schema(name = "added_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("added_at")
  public String getAddedAt() {
    return addedAt;
  }

  public void setAddedAt(String addedAt) {
    this.addedAt = addedAt;
  }

  public PersonalisedRadioBatchRequest context(String context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
  */
  
  @Schema(name = "context", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("context")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public PersonalisedRadioBatchRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PersonalisedRadioBatchRequest metadata(PersonalisedRadioMetaData metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @Valid 
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public PersonalisedRadioMetaData getMetadata() {
    return metadata;
  }

  public void setMetadata(PersonalisedRadioMetaData metadata) {
    this.metadata = metadata;
  }

  public PersonalisedRadioBatchRequest type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalisedRadioBatchRequest personalisedRadioBatchRequest = (PersonalisedRadioBatchRequest) o;
    return Objects.equals(this.action, personalisedRadioBatchRequest.action) &&
        Objects.equals(this.addedAt, personalisedRadioBatchRequest.addedAt) &&
        Objects.equals(this.context, personalisedRadioBatchRequest.context) &&
        Objects.equals(this.id, personalisedRadioBatchRequest.id) &&
        Objects.equals(this.metadata, personalisedRadioBatchRequest.metadata) &&
        Objects.equals(this.type, personalisedRadioBatchRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, addedAt, context, id, metadata, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalisedRadioBatchRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    addedAt: ").append(toIndentedString(addedAt)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

