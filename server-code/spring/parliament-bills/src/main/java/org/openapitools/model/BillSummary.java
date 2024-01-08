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
import org.openapitools.model.House;
import org.openapitools.model.StageSummary;
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
 * BillSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:54:38.614249-04:00[America/Lower_Princes]")
public class BillSummary {

  private Integer billId;

  private Integer billTypeId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> billWithdrawn = JsonNullable.<OffsetDateTime>undefined();

  private House currentHouse;

  private StageSummary currentStage;

  @Valid
  private JsonNullable<List<Integer>> includedSessionIds = JsonNullable.<List<Integer>>undefined();

  private Integer introducedSessionId;

  private Boolean isAct;

  private Boolean isDefeated;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdate;

  private House originatingHouse;

  private JsonNullable<String> shortTitle = JsonNullable.<String>undefined();

  public BillSummary billId(Integer billId) {
    this.billId = billId;
    return this;
  }

  /**
   * Get billId
   * @return billId
  */
  
  @Schema(name = "billId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billId")
  public Integer getBillId() {
    return billId;
  }

  public void setBillId(Integer billId) {
    this.billId = billId;
  }

  public BillSummary billTypeId(Integer billTypeId) {
    this.billTypeId = billTypeId;
    return this;
  }

  /**
   * Get billTypeId
   * @return billTypeId
  */
  
  @Schema(name = "billTypeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billTypeId")
  public Integer getBillTypeId() {
    return billTypeId;
  }

  public void setBillTypeId(Integer billTypeId) {
    this.billTypeId = billTypeId;
  }

  public BillSummary billWithdrawn(OffsetDateTime billWithdrawn) {
    this.billWithdrawn = JsonNullable.of(billWithdrawn);
    return this;
  }

  /**
   * Get billWithdrawn
   * @return billWithdrawn
  */
  @Valid 
  @Schema(name = "billWithdrawn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billWithdrawn")
  public JsonNullable<OffsetDateTime> getBillWithdrawn() {
    return billWithdrawn;
  }

  public void setBillWithdrawn(JsonNullable<OffsetDateTime> billWithdrawn) {
    this.billWithdrawn = billWithdrawn;
  }

  public BillSummary currentHouse(House currentHouse) {
    this.currentHouse = currentHouse;
    return this;
  }

  /**
   * Get currentHouse
   * @return currentHouse
  */
  @Valid 
  @Schema(name = "currentHouse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentHouse")
  public House getCurrentHouse() {
    return currentHouse;
  }

  public void setCurrentHouse(House currentHouse) {
    this.currentHouse = currentHouse;
  }

  public BillSummary currentStage(StageSummary currentStage) {
    this.currentStage = currentStage;
    return this;
  }

  /**
   * Get currentStage
   * @return currentStage
  */
  @Valid 
  @Schema(name = "currentStage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentStage")
  public StageSummary getCurrentStage() {
    return currentStage;
  }

  public void setCurrentStage(StageSummary currentStage) {
    this.currentStage = currentStage;
  }

  public BillSummary includedSessionIds(List<Integer> includedSessionIds) {
    this.includedSessionIds = JsonNullable.of(includedSessionIds);
    return this;
  }

  public BillSummary addIncludedSessionIdsItem(Integer includedSessionIdsItem) {
    if (this.includedSessionIds == null || !this.includedSessionIds.isPresent()) {
      this.includedSessionIds = JsonNullable.of(new ArrayList<>());
    }
    this.includedSessionIds.get().add(includedSessionIdsItem);
    return this;
  }

  /**
   * Get includedSessionIds
   * @return includedSessionIds
  */
  
  @Schema(name = "includedSessionIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includedSessionIds")
  public JsonNullable<List<Integer>> getIncludedSessionIds() {
    return includedSessionIds;
  }

  public void setIncludedSessionIds(JsonNullable<List<Integer>> includedSessionIds) {
    this.includedSessionIds = includedSessionIds;
  }

  public BillSummary introducedSessionId(Integer introducedSessionId) {
    this.introducedSessionId = introducedSessionId;
    return this;
  }

  /**
   * Get introducedSessionId
   * @return introducedSessionId
  */
  
  @Schema(name = "introducedSessionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("introducedSessionId")
  public Integer getIntroducedSessionId() {
    return introducedSessionId;
  }

  public void setIntroducedSessionId(Integer introducedSessionId) {
    this.introducedSessionId = introducedSessionId;
  }

  public BillSummary isAct(Boolean isAct) {
    this.isAct = isAct;
    return this;
  }

  /**
   * Get isAct
   * @return isAct
  */
  
  @Schema(name = "isAct", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isAct")
  public Boolean getIsAct() {
    return isAct;
  }

  public void setIsAct(Boolean isAct) {
    this.isAct = isAct;
  }

  public BillSummary isDefeated(Boolean isDefeated) {
    this.isDefeated = isDefeated;
    return this;
  }

  /**
   * Get isDefeated
   * @return isDefeated
  */
  
  @Schema(name = "isDefeated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDefeated")
  public Boolean getIsDefeated() {
    return isDefeated;
  }

  public void setIsDefeated(Boolean isDefeated) {
    this.isDefeated = isDefeated;
  }

  public BillSummary lastUpdate(OffsetDateTime lastUpdate) {
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

  public BillSummary originatingHouse(House originatingHouse) {
    this.originatingHouse = originatingHouse;
    return this;
  }

  /**
   * Get originatingHouse
   * @return originatingHouse
  */
  @Valid 
  @Schema(name = "originatingHouse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("originatingHouse")
  public House getOriginatingHouse() {
    return originatingHouse;
  }

  public void setOriginatingHouse(House originatingHouse) {
    this.originatingHouse = originatingHouse;
  }

  public BillSummary shortTitle(String shortTitle) {
    this.shortTitle = JsonNullable.of(shortTitle);
    return this;
  }

  /**
   * Get shortTitle
   * @return shortTitle
  */
  
  @Schema(name = "shortTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shortTitle")
  public JsonNullable<String> getShortTitle() {
    return shortTitle;
  }

  public void setShortTitle(JsonNullable<String> shortTitle) {
    this.shortTitle = shortTitle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillSummary billSummary = (BillSummary) o;
    return Objects.equals(this.billId, billSummary.billId) &&
        Objects.equals(this.billTypeId, billSummary.billTypeId) &&
        equalsNullable(this.billWithdrawn, billSummary.billWithdrawn) &&
        Objects.equals(this.currentHouse, billSummary.currentHouse) &&
        Objects.equals(this.currentStage, billSummary.currentStage) &&
        equalsNullable(this.includedSessionIds, billSummary.includedSessionIds) &&
        Objects.equals(this.introducedSessionId, billSummary.introducedSessionId) &&
        Objects.equals(this.isAct, billSummary.isAct) &&
        Objects.equals(this.isDefeated, billSummary.isDefeated) &&
        Objects.equals(this.lastUpdate, billSummary.lastUpdate) &&
        Objects.equals(this.originatingHouse, billSummary.originatingHouse) &&
        equalsNullable(this.shortTitle, billSummary.shortTitle);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(billId, billTypeId, hashCodeNullable(billWithdrawn), currentHouse, currentStage, hashCodeNullable(includedSessionIds), introducedSessionId, isAct, isDefeated, lastUpdate, originatingHouse, hashCodeNullable(shortTitle));
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
    sb.append("class BillSummary {\n");
    sb.append("    billId: ").append(toIndentedString(billId)).append("\n");
    sb.append("    billTypeId: ").append(toIndentedString(billTypeId)).append("\n");
    sb.append("    billWithdrawn: ").append(toIndentedString(billWithdrawn)).append("\n");
    sb.append("    currentHouse: ").append(toIndentedString(currentHouse)).append("\n");
    sb.append("    currentStage: ").append(toIndentedString(currentStage)).append("\n");
    sb.append("    includedSessionIds: ").append(toIndentedString(includedSessionIds)).append("\n");
    sb.append("    introducedSessionId: ").append(toIndentedString(introducedSessionId)).append("\n");
    sb.append("    isAct: ").append(toIndentedString(isAct)).append("\n");
    sb.append("    isDefeated: ").append(toIndentedString(isDefeated)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    originatingHouse: ").append(toIndentedString(originatingHouse)).append("\n");
    sb.append("    shortTitle: ").append(toIndentedString(shortTitle)).append("\n");
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

