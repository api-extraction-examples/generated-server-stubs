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
 * PersonalisedMusicBatchRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PersonalisedMusicBatchRequest {

  private String action;

  private String addedAt;

  private String context;

  private String domain;

  private String id;

  private PersonalisedMusicMetaData metaData;

  private String type;

  public PersonalisedMusicBatchRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PersonalisedMusicBatchRequest(String action, String domain, String id, String type) {
    this.action = action;
    this.domain = domain;
    this.id = id;
    this.type = type;
  }

  public PersonalisedMusicBatchRequest action(String action) {
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

  public PersonalisedMusicBatchRequest addedAt(String addedAt) {
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

  public PersonalisedMusicBatchRequest context(String context) {
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

  public PersonalisedMusicBatchRequest domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Get domain
   * @return domain
  */
  @NotNull 
  @Schema(name = "domain", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public PersonalisedMusicBatchRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PersonalisedMusicBatchRequest metaData(PersonalisedMusicMetaData metaData) {
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

  public PersonalisedMusicBatchRequest type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
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
    PersonalisedMusicBatchRequest personalisedMusicBatchRequest = (PersonalisedMusicBatchRequest) o;
    return Objects.equals(this.action, personalisedMusicBatchRequest.action) &&
        Objects.equals(this.addedAt, personalisedMusicBatchRequest.addedAt) &&
        Objects.equals(this.context, personalisedMusicBatchRequest.context) &&
        Objects.equals(this.domain, personalisedMusicBatchRequest.domain) &&
        Objects.equals(this.id, personalisedMusicBatchRequest.id) &&
        Objects.equals(this.metaData, personalisedMusicBatchRequest.metaData) &&
        Objects.equals(this.type, personalisedMusicBatchRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, addedAt, context, domain, id, metaData, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalisedMusicBatchRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    addedAt: ").append(toIndentedString(addedAt)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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

