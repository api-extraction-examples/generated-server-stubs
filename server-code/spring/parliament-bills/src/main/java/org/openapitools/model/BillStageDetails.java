package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BillStageSitting;
import org.openapitools.model.Committee;
import org.openapitools.model.House;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BillStageDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:54:38.614249-04:00[America/Lower_Princes]")
public class BillStageDetails {

  private JsonNullable<String> abbreviation = JsonNullable.<String>undefined();

  private Committee committee;

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private House house;

  private Integer id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdate;

  private JsonNullable<Integer> nextStageBillStageId = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> previousStageBillStageId = JsonNullable.<Integer>undefined();

  private Integer sessionId;

  private Integer sortOrder;

  private Integer stageId;

  @Valid
  private JsonNullable<List<@Valid BillStageSitting>> stageSittings = JsonNullable.<List<@Valid BillStageSitting>>undefined();

  public BillStageDetails abbreviation(String abbreviation) {
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

  public BillStageDetails committee(Committee committee) {
    this.committee = committee;
    return this;
  }

  /**
   * Get committee
   * @return committee
  */
  @Valid 
  @Schema(name = "committee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("committee")
  public Committee getCommittee() {
    return committee;
  }

  public void setCommittee(Committee committee) {
    this.committee = committee;
  }

  public BillStageDetails description(String description) {
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

  public BillStageDetails house(House house) {
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

  public BillStageDetails id(Integer id) {
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

  public BillStageDetails lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Get lastUpdate
   * @return lastUpdate
  */
  @Valid 
  @Schema(name = "lastUpdate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdate")
  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public BillStageDetails nextStageBillStageId(Integer nextStageBillStageId) {
    this.nextStageBillStageId = JsonNullable.of(nextStageBillStageId);
    return this;
  }

  /**
   * Get nextStageBillStageId
   * @return nextStageBillStageId
  */
  
  @Schema(name = "nextStageBillStageId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nextStageBillStageId")
  public JsonNullable<Integer> getNextStageBillStageId() {
    return nextStageBillStageId;
  }

  public void setNextStageBillStageId(JsonNullable<Integer> nextStageBillStageId) {
    this.nextStageBillStageId = nextStageBillStageId;
  }

  public BillStageDetails previousStageBillStageId(Integer previousStageBillStageId) {
    this.previousStageBillStageId = JsonNullable.of(previousStageBillStageId);
    return this;
  }

  /**
   * Get previousStageBillStageId
   * @return previousStageBillStageId
  */
  
  @Schema(name = "previousStageBillStageId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previousStageBillStageId")
  public JsonNullable<Integer> getPreviousStageBillStageId() {
    return previousStageBillStageId;
  }

  public void setPreviousStageBillStageId(JsonNullable<Integer> previousStageBillStageId) {
    this.previousStageBillStageId = previousStageBillStageId;
  }

  public BillStageDetails sessionId(Integer sessionId) {
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

  public BillStageDetails sortOrder(Integer sortOrder) {
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

  public BillStageDetails stageId(Integer stageId) {
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

  public BillStageDetails stageSittings(List<@Valid BillStageSitting> stageSittings) {
    this.stageSittings = JsonNullable.of(stageSittings);
    return this;
  }

  public BillStageDetails addStageSittingsItem(BillStageSitting stageSittingsItem) {
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
    BillStageDetails billStageDetails = (BillStageDetails) o;
    return equalsNullable(this.abbreviation, billStageDetails.abbreviation) &&
        Objects.equals(this.committee, billStageDetails.committee) &&
        equalsNullable(this.description, billStageDetails.description) &&
        Objects.equals(this.house, billStageDetails.house) &&
        Objects.equals(this.id, billStageDetails.id) &&
        Objects.equals(this.lastUpdate, billStageDetails.lastUpdate) &&
        equalsNullable(this.nextStageBillStageId, billStageDetails.nextStageBillStageId) &&
        equalsNullable(this.previousStageBillStageId, billStageDetails.previousStageBillStageId) &&
        Objects.equals(this.sessionId, billStageDetails.sessionId) &&
        Objects.equals(this.sortOrder, billStageDetails.sortOrder) &&
        Objects.equals(this.stageId, billStageDetails.stageId) &&
        equalsNullable(this.stageSittings, billStageDetails.stageSittings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(abbreviation), committee, hashCodeNullable(description), house, id, lastUpdate, hashCodeNullable(nextStageBillStageId), hashCodeNullable(previousStageBillStageId), sessionId, sortOrder, stageId, hashCodeNullable(stageSittings));
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
    sb.append("class BillStageDetails {\n");
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    committee: ").append(toIndentedString(committee)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    house: ").append(toIndentedString(house)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    nextStageBillStageId: ").append(toIndentedString(nextStageBillStageId)).append("\n");
    sb.append("    previousStageBillStageId: ").append(toIndentedString(previousStageBillStageId)).append("\n");
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

