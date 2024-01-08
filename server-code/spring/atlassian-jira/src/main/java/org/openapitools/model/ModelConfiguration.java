package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigurationTimeTrackingConfiguration;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about the configuration of Jira.
 */

@Schema(name = "Configuration", description = "Details about the configuration of Jira.")
@JsonTypeName("Configuration")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ModelConfiguration {

  private Boolean attachmentsEnabled;

  private Boolean issueLinkingEnabled;

  private Boolean subTasksEnabled;

  private ConfigurationTimeTrackingConfiguration timeTrackingConfiguration;

  private Boolean timeTrackingEnabled;

  private Boolean unassignedIssuesAllowed;

  private Boolean votingEnabled;

  private Boolean watchingEnabled;

  public ModelConfiguration attachmentsEnabled(Boolean attachmentsEnabled) {
    this.attachmentsEnabled = attachmentsEnabled;
    return this;
  }

  /**
   * Whether the ability to add attachments to issues is enabled.
   * @return attachmentsEnabled
  */
  
  @Schema(name = "attachmentsEnabled", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the ability to add attachments to issues is enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachmentsEnabled")
  public Boolean getAttachmentsEnabled() {
    return attachmentsEnabled;
  }

  public void setAttachmentsEnabled(Boolean attachmentsEnabled) {
    this.attachmentsEnabled = attachmentsEnabled;
  }

  public ModelConfiguration issueLinkingEnabled(Boolean issueLinkingEnabled) {
    this.issueLinkingEnabled = issueLinkingEnabled;
    return this;
  }

  /**
   * Whether the ability to link issues is enabled.
   * @return issueLinkingEnabled
  */
  
  @Schema(name = "issueLinkingEnabled", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the ability to link issues is enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueLinkingEnabled")
  public Boolean getIssueLinkingEnabled() {
    return issueLinkingEnabled;
  }

  public void setIssueLinkingEnabled(Boolean issueLinkingEnabled) {
    this.issueLinkingEnabled = issueLinkingEnabled;
  }

  public ModelConfiguration subTasksEnabled(Boolean subTasksEnabled) {
    this.subTasksEnabled = subTasksEnabled;
    return this;
  }

  /**
   * Whether the ability to create subtasks for issues is enabled.
   * @return subTasksEnabled
  */
  
  @Schema(name = "subTasksEnabled", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the ability to create subtasks for issues is enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subTasksEnabled")
  public Boolean getSubTasksEnabled() {
    return subTasksEnabled;
  }

  public void setSubTasksEnabled(Boolean subTasksEnabled) {
    this.subTasksEnabled = subTasksEnabled;
  }

  public ModelConfiguration timeTrackingConfiguration(ConfigurationTimeTrackingConfiguration timeTrackingConfiguration) {
    this.timeTrackingConfiguration = timeTrackingConfiguration;
    return this;
  }

  /**
   * Get timeTrackingConfiguration
   * @return timeTrackingConfiguration
  */
  @Valid 
  @Schema(name = "timeTrackingConfiguration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeTrackingConfiguration")
  public ConfigurationTimeTrackingConfiguration getTimeTrackingConfiguration() {
    return timeTrackingConfiguration;
  }

  public void setTimeTrackingConfiguration(ConfigurationTimeTrackingConfiguration timeTrackingConfiguration) {
    this.timeTrackingConfiguration = timeTrackingConfiguration;
  }

  public ModelConfiguration timeTrackingEnabled(Boolean timeTrackingEnabled) {
    this.timeTrackingEnabled = timeTrackingEnabled;
    return this;
  }

  /**
   * Whether the ability to track time is enabled. This property is deprecated.
   * @return timeTrackingEnabled
  */
  
  @Schema(name = "timeTrackingEnabled", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the ability to track time is enabled. This property is deprecated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeTrackingEnabled")
  public Boolean getTimeTrackingEnabled() {
    return timeTrackingEnabled;
  }

  public void setTimeTrackingEnabled(Boolean timeTrackingEnabled) {
    this.timeTrackingEnabled = timeTrackingEnabled;
  }

  public ModelConfiguration unassignedIssuesAllowed(Boolean unassignedIssuesAllowed) {
    this.unassignedIssuesAllowed = unassignedIssuesAllowed;
    return this;
  }

  /**
   * Whether the ability to create unassigned issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
   * @return unassignedIssuesAllowed
  */
  
  @Schema(name = "unassignedIssuesAllowed", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the ability to create unassigned issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unassignedIssuesAllowed")
  public Boolean getUnassignedIssuesAllowed() {
    return unassignedIssuesAllowed;
  }

  public void setUnassignedIssuesAllowed(Boolean unassignedIssuesAllowed) {
    this.unassignedIssuesAllowed = unassignedIssuesAllowed;
  }

  public ModelConfiguration votingEnabled(Boolean votingEnabled) {
    this.votingEnabled = votingEnabled;
    return this;
  }

  /**
   * Whether the ability for users to vote on issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
   * @return votingEnabled
  */
  
  @Schema(name = "votingEnabled", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the ability for users to vote on issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("votingEnabled")
  public Boolean getVotingEnabled() {
    return votingEnabled;
  }

  public void setVotingEnabled(Boolean votingEnabled) {
    this.votingEnabled = votingEnabled;
  }

  public ModelConfiguration watchingEnabled(Boolean watchingEnabled) {
    this.watchingEnabled = watchingEnabled;
    return this;
  }

  /**
   * Whether the ability for users to watch issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
   * @return watchingEnabled
  */
  
  @Schema(name = "watchingEnabled", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the ability for users to watch issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("watchingEnabled")
  public Boolean getWatchingEnabled() {
    return watchingEnabled;
  }

  public void setWatchingEnabled(Boolean watchingEnabled) {
    this.watchingEnabled = watchingEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelConfiguration _configuration = (ModelConfiguration) o;
    return Objects.equals(this.attachmentsEnabled, _configuration.attachmentsEnabled) &&
        Objects.equals(this.issueLinkingEnabled, _configuration.issueLinkingEnabled) &&
        Objects.equals(this.subTasksEnabled, _configuration.subTasksEnabled) &&
        Objects.equals(this.timeTrackingConfiguration, _configuration.timeTrackingConfiguration) &&
        Objects.equals(this.timeTrackingEnabled, _configuration.timeTrackingEnabled) &&
        Objects.equals(this.unassignedIssuesAllowed, _configuration.unassignedIssuesAllowed) &&
        Objects.equals(this.votingEnabled, _configuration.votingEnabled) &&
        Objects.equals(this.watchingEnabled, _configuration.watchingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentsEnabled, issueLinkingEnabled, subTasksEnabled, timeTrackingConfiguration, timeTrackingEnabled, unassignedIssuesAllowed, votingEnabled, watchingEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelConfiguration {\n");
    sb.append("    attachmentsEnabled: ").append(toIndentedString(attachmentsEnabled)).append("\n");
    sb.append("    issueLinkingEnabled: ").append(toIndentedString(issueLinkingEnabled)).append("\n");
    sb.append("    subTasksEnabled: ").append(toIndentedString(subTasksEnabled)).append("\n");
    sb.append("    timeTrackingConfiguration: ").append(toIndentedString(timeTrackingConfiguration)).append("\n");
    sb.append("    timeTrackingEnabled: ").append(toIndentedString(timeTrackingEnabled)).append("\n");
    sb.append("    unassignedIssuesAllowed: ").append(toIndentedString(unassignedIssuesAllowed)).append("\n");
    sb.append("    votingEnabled: ").append(toIndentedString(votingEnabled)).append("\n");
    sb.append("    watchingEnabled: ").append(toIndentedString(watchingEnabled)).append("\n");
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

