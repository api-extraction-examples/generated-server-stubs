package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NotificationSchemeAndProjectMappingJsonBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class NotificationSchemeAndProjectMappingJsonBean {

  private String notificationSchemeId;

  private String projectId;

  public NotificationSchemeAndProjectMappingJsonBean notificationSchemeId(String notificationSchemeId) {
    this.notificationSchemeId = notificationSchemeId;
    return this;
  }

  /**
   * Get notificationSchemeId
   * @return notificationSchemeId
  */
  
  @Schema(name = "notificationSchemeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notificationSchemeId")
  public String getNotificationSchemeId() {
    return notificationSchemeId;
  }

  public void setNotificationSchemeId(String notificationSchemeId) {
    this.notificationSchemeId = notificationSchemeId;
  }

  public NotificationSchemeAndProjectMappingJsonBean projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
  */
  
  @Schema(name = "projectId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSchemeAndProjectMappingJsonBean notificationSchemeAndProjectMappingJsonBean = (NotificationSchemeAndProjectMappingJsonBean) o;
    return Objects.equals(this.notificationSchemeId, notificationSchemeAndProjectMappingJsonBean.notificationSchemeId) &&
        Objects.equals(this.projectId, notificationSchemeAndProjectMappingJsonBean.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationSchemeId, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSchemeAndProjectMappingJsonBean {\n");
    sb.append("    notificationSchemeId: ").append(toIndentedString(notificationSchemeId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

