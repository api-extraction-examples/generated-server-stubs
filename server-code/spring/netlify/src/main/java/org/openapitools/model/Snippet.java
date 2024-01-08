package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Snippet
 */

@JsonTypeName("snippet")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class Snippet {

  private String general;

  private String generalPosition;

  private String goal;

  private String goalPosition;

  private Integer id;

  private String siteId;

  private String title;

  public Snippet general(String general) {
    this.general = general;
    return this;
  }

  /**
   * Get general
   * @return general
  */
  
  @Schema(name = "general", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("general")
  public String getGeneral() {
    return general;
  }

  public void setGeneral(String general) {
    this.general = general;
  }

  public Snippet generalPosition(String generalPosition) {
    this.generalPosition = generalPosition;
    return this;
  }

  /**
   * Get generalPosition
   * @return generalPosition
  */
  
  @Schema(name = "general_position", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("general_position")
  public String getGeneralPosition() {
    return generalPosition;
  }

  public void setGeneralPosition(String generalPosition) {
    this.generalPosition = generalPosition;
  }

  public Snippet goal(String goal) {
    this.goal = goal;
    return this;
  }

  /**
   * Get goal
   * @return goal
  */
  
  @Schema(name = "goal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("goal")
  public String getGoal() {
    return goal;
  }

  public void setGoal(String goal) {
    this.goal = goal;
  }

  public Snippet goalPosition(String goalPosition) {
    this.goalPosition = goalPosition;
    return this;
  }

  /**
   * Get goalPosition
   * @return goalPosition
  */
  
  @Schema(name = "goal_position", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("goal_position")
  public String getGoalPosition() {
    return goalPosition;
  }

  public void setGoalPosition(String goalPosition) {
    this.goalPosition = goalPosition;
  }

  public Snippet id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Snippet siteId(String siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Get siteId
   * @return siteId
  */
  
  @Schema(name = "site_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("site_id")
  public String getSiteId() {
    return siteId;
  }

  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }

  public Snippet title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Snippet snippet = (Snippet) o;
    return Objects.equals(this.general, snippet.general) &&
        Objects.equals(this.generalPosition, snippet.generalPosition) &&
        Objects.equals(this.goal, snippet.goal) &&
        Objects.equals(this.goalPosition, snippet.goalPosition) &&
        Objects.equals(this.id, snippet.id) &&
        Objects.equals(this.siteId, snippet.siteId) &&
        Objects.equals(this.title, snippet.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(general, generalPosition, goal, goalPosition, id, siteId, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Snippet {\n");
    sb.append("    general: ").append(toIndentedString(general)).append("\n");
    sb.append("    generalPosition: ").append(toIndentedString(generalPosition)).append("\n");
    sb.append("    goal: ").append(toIndentedString(goal)).append("\n");
    sb.append("    goalPosition: ").append(toIndentedString(goalPosition)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

