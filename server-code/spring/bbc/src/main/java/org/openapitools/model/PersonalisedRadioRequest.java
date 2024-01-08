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
 * PersonalisedRadioRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PersonalisedRadioRequest {

  private String action;

  private String addedAt;

  private String context;

  private PersonalisedRadioMetaData metadata;

  public PersonalisedRadioRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PersonalisedRadioRequest(String action) {
    this.action = action;
  }

  public PersonalisedRadioRequest action(String action) {
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

  public PersonalisedRadioRequest addedAt(String addedAt) {
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

  public PersonalisedRadioRequest context(String context) {
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

  public PersonalisedRadioRequest metadata(PersonalisedRadioMetaData metadata) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalisedRadioRequest personalisedRadioRequest = (PersonalisedRadioRequest) o;
    return Objects.equals(this.action, personalisedRadioRequest.action) &&
        Objects.equals(this.addedAt, personalisedRadioRequest.addedAt) &&
        Objects.equals(this.context, personalisedRadioRequest.context) &&
        Objects.equals(this.metadata, personalisedRadioRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, addedAt, context, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalisedRadioRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    addedAt: ").append(toIndentedString(addedAt)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

