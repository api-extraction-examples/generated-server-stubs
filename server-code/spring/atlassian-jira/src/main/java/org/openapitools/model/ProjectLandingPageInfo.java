package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The project landing page info.
 */

@Schema(name = "Project_landingPageInfo", description = "The project landing page info.")
@JsonTypeName("Project_landingPageInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ProjectLandingPageInfo {

  @Valid
  private Map<String, String> attributes = new HashMap<>();

  private Long boardId;

  private String boardName;

  private String projectKey;

  private String projectType;

  private String queueCategory;

  private Long queueId;

  private String queueName;

  private Boolean simpleBoard;

  private Boolean simplified;

  private String url;

  public ProjectLandingPageInfo attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ProjectLandingPageInfo putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributes")
  public Map<String, String> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  public ProjectLandingPageInfo boardId(Long boardId) {
    this.boardId = boardId;
    return this;
  }

  /**
   * Get boardId
   * @return boardId
  */
  
  @Schema(name = "boardId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("boardId")
  public Long getBoardId() {
    return boardId;
  }

  public void setBoardId(Long boardId) {
    this.boardId = boardId;
  }

  public ProjectLandingPageInfo boardName(String boardName) {
    this.boardName = boardName;
    return this;
  }

  /**
   * Get boardName
   * @return boardName
  */
  
  @Schema(name = "boardName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("boardName")
  public String getBoardName() {
    return boardName;
  }

  public void setBoardName(String boardName) {
    this.boardName = boardName;
  }

  public ProjectLandingPageInfo projectKey(String projectKey) {
    this.projectKey = projectKey;
    return this;
  }

  /**
   * Get projectKey
   * @return projectKey
  */
  
  @Schema(name = "projectKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectKey")
  public String getProjectKey() {
    return projectKey;
  }

  public void setProjectKey(String projectKey) {
    this.projectKey = projectKey;
  }

  public ProjectLandingPageInfo projectType(String projectType) {
    this.projectType = projectType;
    return this;
  }

  /**
   * Get projectType
   * @return projectType
  */
  
  @Schema(name = "projectType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectType")
  public String getProjectType() {
    return projectType;
  }

  public void setProjectType(String projectType) {
    this.projectType = projectType;
  }

  public ProjectLandingPageInfo queueCategory(String queueCategory) {
    this.queueCategory = queueCategory;
    return this;
  }

  /**
   * Get queueCategory
   * @return queueCategory
  */
  
  @Schema(name = "queueCategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queueCategory")
  public String getQueueCategory() {
    return queueCategory;
  }

  public void setQueueCategory(String queueCategory) {
    this.queueCategory = queueCategory;
  }

  public ProjectLandingPageInfo queueId(Long queueId) {
    this.queueId = queueId;
    return this;
  }

  /**
   * Get queueId
   * @return queueId
  */
  
  @Schema(name = "queueId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queueId")
  public Long getQueueId() {
    return queueId;
  }

  public void setQueueId(Long queueId) {
    this.queueId = queueId;
  }

  public ProjectLandingPageInfo queueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

  /**
   * Get queueName
   * @return queueName
  */
  
  @Schema(name = "queueName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queueName")
  public String getQueueName() {
    return queueName;
  }

  public void setQueueName(String queueName) {
    this.queueName = queueName;
  }

  public ProjectLandingPageInfo simpleBoard(Boolean simpleBoard) {
    this.simpleBoard = simpleBoard;
    return this;
  }

  /**
   * Get simpleBoard
   * @return simpleBoard
  */
  
  @Schema(name = "simpleBoard", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("simpleBoard")
  public Boolean getSimpleBoard() {
    return simpleBoard;
  }

  public void setSimpleBoard(Boolean simpleBoard) {
    this.simpleBoard = simpleBoard;
  }

  public ProjectLandingPageInfo simplified(Boolean simplified) {
    this.simplified = simplified;
    return this;
  }

  /**
   * Get simplified
   * @return simplified
  */
  
  @Schema(name = "simplified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("simplified")
  public Boolean getSimplified() {
    return simplified;
  }

  public void setSimplified(Boolean simplified) {
    this.simplified = simplified;
  }

  public ProjectLandingPageInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectLandingPageInfo projectLandingPageInfo = (ProjectLandingPageInfo) o;
    return Objects.equals(this.attributes, projectLandingPageInfo.attributes) &&
        Objects.equals(this.boardId, projectLandingPageInfo.boardId) &&
        Objects.equals(this.boardName, projectLandingPageInfo.boardName) &&
        Objects.equals(this.projectKey, projectLandingPageInfo.projectKey) &&
        Objects.equals(this.projectType, projectLandingPageInfo.projectType) &&
        Objects.equals(this.queueCategory, projectLandingPageInfo.queueCategory) &&
        Objects.equals(this.queueId, projectLandingPageInfo.queueId) &&
        Objects.equals(this.queueName, projectLandingPageInfo.queueName) &&
        Objects.equals(this.simpleBoard, projectLandingPageInfo.simpleBoard) &&
        Objects.equals(this.simplified, projectLandingPageInfo.simplified) &&
        Objects.equals(this.url, projectLandingPageInfo.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, boardId, boardName, projectKey, projectType, queueCategory, queueId, queueName, simpleBoard, simplified, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectLandingPageInfo {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    boardName: ").append(toIndentedString(boardName)).append("\n");
    sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
    sb.append("    projectType: ").append(toIndentedString(projectType)).append("\n");
    sb.append("    queueCategory: ").append(toIndentedString(queueCategory)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    simpleBoard: ").append(toIndentedString(simpleBoard)).append("\n");
    sb.append("    simplified: ").append(toIndentedString(simplified)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

