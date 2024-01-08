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
 * WorkManagementNavigationInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkManagementNavigationInfo {

  private String boardName;

  public WorkManagementNavigationInfo boardName(String boardName) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkManagementNavigationInfo workManagementNavigationInfo = (WorkManagementNavigationInfo) o;
    return Objects.equals(this.boardName, workManagementNavigationInfo.boardName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkManagementNavigationInfo {\n");
    sb.append("    boardName: ").append(toIndentedString(boardName)).append("\n");
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

