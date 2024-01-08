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
 * SoftwareNavigationInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SoftwareNavigationInfo {

  private Long boardId;

  private String boardName;

  private Boolean simpleBoard;

  private Long totalBoardsInProject;

  public SoftwareNavigationInfo boardId(Long boardId) {
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

  public SoftwareNavigationInfo boardName(String boardName) {
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

  public SoftwareNavigationInfo simpleBoard(Boolean simpleBoard) {
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

  public SoftwareNavigationInfo totalBoardsInProject(Long totalBoardsInProject) {
    this.totalBoardsInProject = totalBoardsInProject;
    return this;
  }

  /**
   * Get totalBoardsInProject
   * @return totalBoardsInProject
  */
  
  @Schema(name = "totalBoardsInProject", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalBoardsInProject")
  public Long getTotalBoardsInProject() {
    return totalBoardsInProject;
  }

  public void setTotalBoardsInProject(Long totalBoardsInProject) {
    this.totalBoardsInProject = totalBoardsInProject;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwareNavigationInfo softwareNavigationInfo = (SoftwareNavigationInfo) o;
    return Objects.equals(this.boardId, softwareNavigationInfo.boardId) &&
        Objects.equals(this.boardName, softwareNavigationInfo.boardName) &&
        Objects.equals(this.simpleBoard, softwareNavigationInfo.simpleBoard) &&
        Objects.equals(this.totalBoardsInProject, softwareNavigationInfo.totalBoardsInProject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardId, boardName, simpleBoard, totalBoardsInProject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareNavigationInfo {\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    boardName: ").append(toIndentedString(boardName)).append("\n");
    sb.append("    simpleBoard: ").append(toIndentedString(simpleBoard)).append("\n");
    sb.append("    totalBoardsInProject: ").append(toIndentedString(totalBoardsInProject)).append("\n");
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

