package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.HistoryMetadataParticipant;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The history metadata associated with the changed.
 */

@Schema(name = "Changelog_historyMetadata", description = "The history metadata associated with the changed.")
@JsonTypeName("Changelog_historyMetadata")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ChangelogHistoryMetadata {

  private String activityDescription;

  private String activityDescriptionKey;

  private HistoryMetadataParticipant actor;

  private HistoryMetadataParticipant cause;

  private String description;

  private String descriptionKey;

  private String emailDescription;

  private String emailDescriptionKey;

  @Valid
  private Map<String, String> extraData = new HashMap<>();

  private HistoryMetadataParticipant generator;

  private String type;

  public ChangelogHistoryMetadata activityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
    return this;
  }

  /**
   * The activity described in the history record.
   * @return activityDescription
  */
  
  @Schema(name = "activityDescription", description = "The activity described in the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityDescription")
  public String getActivityDescription() {
    return activityDescription;
  }

  public void setActivityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
  }

  public ChangelogHistoryMetadata activityDescriptionKey(String activityDescriptionKey) {
    this.activityDescriptionKey = activityDescriptionKey;
    return this;
  }

  /**
   * The key of the activity described in the history record.
   * @return activityDescriptionKey
  */
  
  @Schema(name = "activityDescriptionKey", description = "The key of the activity described in the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityDescriptionKey")
  public String getActivityDescriptionKey() {
    return activityDescriptionKey;
  }

  public void setActivityDescriptionKey(String activityDescriptionKey) {
    this.activityDescriptionKey = activityDescriptionKey;
  }

  public ChangelogHistoryMetadata actor(HistoryMetadataParticipant actor) {
    this.actor = actor;
    return this;
  }

  /**
   * Get actor
   * @return actor
  */
  @Valid 
  @Schema(name = "actor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actor")
  public HistoryMetadataParticipant getActor() {
    return actor;
  }

  public void setActor(HistoryMetadataParticipant actor) {
    this.actor = actor;
  }

  public ChangelogHistoryMetadata cause(HistoryMetadataParticipant cause) {
    this.cause = cause;
    return this;
  }

  /**
   * Get cause
   * @return cause
  */
  @Valid 
  @Schema(name = "cause", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cause")
  public HistoryMetadataParticipant getCause() {
    return cause;
  }

  public void setCause(HistoryMetadataParticipant cause) {
    this.cause = cause;
  }

  public ChangelogHistoryMetadata description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the history record.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ChangelogHistoryMetadata descriptionKey(String descriptionKey) {
    this.descriptionKey = descriptionKey;
    return this;
  }

  /**
   * The description key of the history record.
   * @return descriptionKey
  */
  
  @Schema(name = "descriptionKey", description = "The description key of the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("descriptionKey")
  public String getDescriptionKey() {
    return descriptionKey;
  }

  public void setDescriptionKey(String descriptionKey) {
    this.descriptionKey = descriptionKey;
  }

  public ChangelogHistoryMetadata emailDescription(String emailDescription) {
    this.emailDescription = emailDescription;
    return this;
  }

  /**
   * The description of the email address associated the history record.
   * @return emailDescription
  */
  
  @Schema(name = "emailDescription", description = "The description of the email address associated the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailDescription")
  public String getEmailDescription() {
    return emailDescription;
  }

  public void setEmailDescription(String emailDescription) {
    this.emailDescription = emailDescription;
  }

  public ChangelogHistoryMetadata emailDescriptionKey(String emailDescriptionKey) {
    this.emailDescriptionKey = emailDescriptionKey;
    return this;
  }

  /**
   * The description key of the email address associated the history record.
   * @return emailDescriptionKey
  */
  
  @Schema(name = "emailDescriptionKey", description = "The description key of the email address associated the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailDescriptionKey")
  public String getEmailDescriptionKey() {
    return emailDescriptionKey;
  }

  public void setEmailDescriptionKey(String emailDescriptionKey) {
    this.emailDescriptionKey = emailDescriptionKey;
  }

  public ChangelogHistoryMetadata extraData(Map<String, String> extraData) {
    this.extraData = extraData;
    return this;
  }

  public ChangelogHistoryMetadata putExtraDataItem(String key, String extraDataItem) {
    if (this.extraData == null) {
      this.extraData = new HashMap<>();
    }
    this.extraData.put(key, extraDataItem);
    return this;
  }

  /**
   * Additional arbitrary information about the history record.
   * @return extraData
  */
  
  @Schema(name = "extraData", description = "Additional arbitrary information about the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extraData")
  public Map<String, String> getExtraData() {
    return extraData;
  }

  public void setExtraData(Map<String, String> extraData) {
    this.extraData = extraData;
  }

  public ChangelogHistoryMetadata generator(HistoryMetadataParticipant generator) {
    this.generator = generator;
    return this;
  }

  /**
   * Get generator
   * @return generator
  */
  @Valid 
  @Schema(name = "generator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generator")
  public HistoryMetadataParticipant getGenerator() {
    return generator;
  }

  public void setGenerator(HistoryMetadataParticipant generator) {
    this.generator = generator;
  }

  public ChangelogHistoryMetadata type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the history record.
   * @return type
  */
  
  @Schema(name = "type", description = "The type of the history record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ChangelogHistoryMetadata changelogHistoryMetadata = (ChangelogHistoryMetadata) o;
    return Objects.equals(this.activityDescription, changelogHistoryMetadata.activityDescription) &&
        Objects.equals(this.activityDescriptionKey, changelogHistoryMetadata.activityDescriptionKey) &&
        Objects.equals(this.actor, changelogHistoryMetadata.actor) &&
        Objects.equals(this.cause, changelogHistoryMetadata.cause) &&
        Objects.equals(this.description, changelogHistoryMetadata.description) &&
        Objects.equals(this.descriptionKey, changelogHistoryMetadata.descriptionKey) &&
        Objects.equals(this.emailDescription, changelogHistoryMetadata.emailDescription) &&
        Objects.equals(this.emailDescriptionKey, changelogHistoryMetadata.emailDescriptionKey) &&
        Objects.equals(this.extraData, changelogHistoryMetadata.extraData) &&
        Objects.equals(this.generator, changelogHistoryMetadata.generator) &&
        Objects.equals(this.type, changelogHistoryMetadata.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityDescription, activityDescriptionKey, actor, cause, description, descriptionKey, emailDescription, emailDescriptionKey, extraData, generator, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangelogHistoryMetadata {\n");
    sb.append("    activityDescription: ").append(toIndentedString(activityDescription)).append("\n");
    sb.append("    activityDescriptionKey: ").append(toIndentedString(activityDescriptionKey)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionKey: ").append(toIndentedString(descriptionKey)).append("\n");
    sb.append("    emailDescription: ").append(toIndentedString(emailDescription)).append("\n");
    sb.append("    emailDescriptionKey: ").append(toIndentedString(emailDescriptionKey)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("    generator: ").append(toIndentedString(generator)).append("\n");
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

