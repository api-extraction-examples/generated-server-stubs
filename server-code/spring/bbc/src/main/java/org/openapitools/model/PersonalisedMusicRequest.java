package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PersonalisedMusicMetaData;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PersonalisedMusicRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PersonalisedMusicRequest {

  private String action;

  private String addedAt;

  private String context;

  private PersonalisedMusicMetaData metaData;

  public PersonalisedMusicRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PersonalisedMusicRequest(String action) {
    this.action = action;
  }

  public PersonalisedMusicRequest action(String action) {
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

  public PersonalisedMusicRequest addedAt(String addedAt) {
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

  public PersonalisedMusicRequest context(String context) {
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

  public PersonalisedMusicRequest metaData(PersonalisedMusicMetaData metaData) {
    this.metaData = metaData;
    return this;
  }

  /**
   * Get metaData
   * @return metaData
  */
  @Valid 
  @Schema(name = "meta_data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meta_data")
  public PersonalisedMusicMetaData getMetaData() {
    return metaData;
  }

  public void setMetaData(PersonalisedMusicMetaData metaData) {
    this.metaData = metaData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalisedMusicRequest personalisedMusicRequest = (PersonalisedMusicRequest) o;
    return Objects.equals(this.action, personalisedMusicRequest.action) &&
        Objects.equals(this.addedAt, personalisedMusicRequest.addedAt) &&
        Objects.equals(this.context, personalisedMusicRequest.context) &&
        Objects.equals(this.metaData, personalisedMusicRequest.metaData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, addedAt, context, metaData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalisedMusicRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    addedAt: ").append(toIndentedString(addedAt)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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

