package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BillStageSitting;
import org.openapitools.model.House;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StageSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:54:38.614249-04:00[America/Lower_Princes]")
public class StageSummary {

  private JsonNullable<String> abbreviation = JsonNullable.<String>undefined();

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private House house;

  private Integer id;

  private Integer sessionId;

  private Integer sortOrder;

  private Integer stageId;

  @Valid
  private JsonNullable<List<@Valid BillStageSitting>> stageSittings = JsonNullable.<List<@Valid BillStageSitting>>undefined();

  public StageSummary abbreviation(String abbreviation) {
    this.abbreviation = JsonNullable.of(abbreviation);
    return this;
  }

  /**
   * Get abbreviation
   * @return abbreviation
  */
  
  @Schema(name = "abbreviation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("abbreviation")
  public JsonNullable<String> getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(JsonNullable<String> abbreviation) {
    this.abbreviation = abbreviation;
  }

  public StageSummary description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public StageSummary house(House house) {
    this.house = house;
    return this;
  }

  /**
   * Get house
   * @return house
  */
  @Valid 
  @Schema(name = "house", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("house")
  public House getHouse() {
    return house;
  }

  public void setHouse(House house) {
    this.house = house;
  }

  public StageSummary id(Integer id) {
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

  public StageSummary sessionId(Integer sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Get sessionId
   * @return sessionId
  */
  
  @Schema(name = "sessionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sessionId")
  public Integer getSessionId() {
    return sessionId;
  }

  public void setSessionId(Integer sessionId) {
    this.sessionId = sessionId;
  }

  public StageSummary sortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * Get sortOrder
   * @return sortOrder
  */
  
  @Schema(name = "sortOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sortOrder")
  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public StageSummary stageId(Integer stageId) {
    this.stageId = stageId;
    return this;
  }

  /**
   * Get stageId
   * @return stageId
  */
  
  @Schema(name = "stageId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stageId")
  public Integer getStageId() {
    return stageId;
  }

  public void setStageId(Integer stageId) {
    this.stageId = stageId;
  }

  public StageSummary stageSittings(List<@Valid BillStageSitting> stageSittings) {
    this.stageSittings = JsonNullable.of(stageSittings);
    return this;
  }

  public StageSummary addStageSittingsItem(BillStageSitting stageSittingsItem) {
    if (this.stageSittings == null || !this.stageSittings.isPresent()) {
      this.stageSittings = JsonNullable.of(new ArrayList<>());
    }
    this.stageSittings.get().add(stageSittingsItem);
    return this;
  }

  /**
   * Get stageSittings
   * @return stageSittings
  */
  @Valid 
  @Schema(name = "stageSittings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stageSittings")
  public JsonNullable<List<@Valid BillStageSitting>> getStageSittings() {
    return stageSittings;
  }

  public void setStageSittings(JsonNullable<List<@Valid BillStageSitting>> stageSittings) {
    this.stageSittings = stageSittings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StageSummary stageSummary = (StageSummary) o;
    return equalsNullable(this.abbreviation, stageSummary.abbreviation) &&
        equalsNullable(this.description, stageSummary.description) &&
        Objects.equals(this.house, stageSummary.house) &&
        Objects.equals(this.id, stageSummary.id) &&
        Objects.equals(this.sessionId, stageSummary.sessionId) &&
        Objects.equals(this.sortOrder, stageSummary.sortOrder) &&
        Objects.equals(this.stageId, stageSummary.stageId) &&
        equalsNullable(this.stageSittings, stageSummary.stageSittings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(abbreviation), hashCodeNullable(description), house, id, sessionId, sortOrder, stageId, hashCodeNullable(stageSittings));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StageSummary {\n");
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    house: ").append(toIndentedString(house)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
    sb.append("    stageSittings: ").append(toIndentedString(stageSittings)).append("\n");
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

