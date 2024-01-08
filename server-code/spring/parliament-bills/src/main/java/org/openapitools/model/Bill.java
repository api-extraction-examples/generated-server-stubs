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
import org.openapitools.model.BillAgent;
import org.openapitools.model.House;
import org.openapitools.model.Promoter;
import org.openapitools.model.Sponsor;
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
 * Bill
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:54:38.614249-04:00[America/Lower_Princes]")
public class Bill {

  private BillAgent agent;

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

  private JsonNullable<String> longTitle = JsonNullable.<String>undefined();

  private House originatingHouse;

  private JsonNullable<String> petitionInformation = JsonNullable.<String>undefined();

  private JsonNullable<String> petitioningPeriod = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid Promoter>> promoters = JsonNullable.<List<@Valid Promoter>>undefined();

  private JsonNullable<String> shortTitle = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid Sponsor>> sponsors = JsonNullable.<List<@Valid Sponsor>>undefined();

  private JsonNullable<String> summary = JsonNullable.<String>undefined();

  public Bill agent(BillAgent agent) {
    this.agent = agent;
    return this;
  }

  /**
   * Get agent
   * @return agent
  */
  @Valid 
  @Schema(name = "agent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agent")
  public BillAgent getAgent() {
    return agent;
  }

  public void setAgent(BillAgent agent) {
    this.agent = agent;
  }

  public Bill billId(Integer billId) {
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

  public Bill billTypeId(Integer billTypeId) {
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

  public Bill billWithdrawn(OffsetDateTime billWithdrawn) {
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

  public Bill currentHouse(House currentHouse) {
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

  public Bill currentStage(StageSummary currentStage) {
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

  public Bill includedSessionIds(List<Integer> includedSessionIds) {
    this.includedSessionIds = JsonNullable.of(includedSessionIds);
    return this;
  }

  public Bill addIncludedSessionIdsItem(Integer includedSessionIdsItem) {
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

  public Bill introducedSessionId(Integer introducedSessionId) {
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

  public Bill isAct(Boolean isAct) {
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

  public Bill isDefeated(Boolean isDefeated) {
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

  public Bill lastUpdate(OffsetDateTime lastUpdate) {
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

  public Bill longTitle(String longTitle) {
    this.longTitle = JsonNullable.of(longTitle);
    return this;
  }

  /**
   * Get longTitle
   * @return longTitle
  */
  
  @Schema(name = "longTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longTitle")
  public JsonNullable<String> getLongTitle() {
    return longTitle;
  }

  public void setLongTitle(JsonNullable<String> longTitle) {
    this.longTitle = longTitle;
  }

  public Bill originatingHouse(House originatingHouse) {
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

  public Bill petitionInformation(String petitionInformation) {
    this.petitionInformation = JsonNullable.of(petitionInformation);
    return this;
  }

  /**
   * Get petitionInformation
   * @return petitionInformation
  */
  
  @Schema(name = "petitionInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("petitionInformation")
  public JsonNullable<String> getPetitionInformation() {
    return petitionInformation;
  }

  public void setPetitionInformation(JsonNullable<String> petitionInformation) {
    this.petitionInformation = petitionInformation;
  }

  public Bill petitioningPeriod(String petitioningPeriod) {
    this.petitioningPeriod = JsonNullable.of(petitioningPeriod);
    return this;
  }

  /**
   * Get petitioningPeriod
   * @return petitioningPeriod
  */
  
  @Schema(name = "petitioningPeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("petitioningPeriod")
  public JsonNullable<String> getPetitioningPeriod() {
    return petitioningPeriod;
  }

  public void setPetitioningPeriod(JsonNullable<String> petitioningPeriod) {
    this.petitioningPeriod = petitioningPeriod;
  }

  public Bill promoters(List<@Valid Promoter> promoters) {
    this.promoters = JsonNullable.of(promoters);
    return this;
  }

  public Bill addPromotersItem(Promoter promotersItem) {
    if (this.promoters == null || !this.promoters.isPresent()) {
      this.promoters = JsonNullable.of(new ArrayList<>());
    }
    this.promoters.get().add(promotersItem);
    return this;
  }

  /**
   * Get promoters
   * @return promoters
  */
  @Valid 
  @Schema(name = "promoters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promoters")
  public JsonNullable<List<@Valid Promoter>> getPromoters() {
    return promoters;
  }

  public void setPromoters(JsonNullable<List<@Valid Promoter>> promoters) {
    this.promoters = promoters;
  }

  public Bill shortTitle(String shortTitle) {
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

  public Bill sponsors(List<@Valid Sponsor> sponsors) {
    this.sponsors = JsonNullable.of(sponsors);
    return this;
  }

  public Bill addSponsorsItem(Sponsor sponsorsItem) {
    if (this.sponsors == null || !this.sponsors.isPresent()) {
      this.sponsors = JsonNullable.of(new ArrayList<>());
    }
    this.sponsors.get().add(sponsorsItem);
    return this;
  }

  /**
   * Get sponsors
   * @return sponsors
  */
  @Valid 
  @Schema(name = "sponsors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sponsors")
  public JsonNullable<List<@Valid Sponsor>> getSponsors() {
    return sponsors;
  }

  public void setSponsors(JsonNullable<List<@Valid Sponsor>> sponsors) {
    this.sponsors = sponsors;
  }

  public Bill summary(String summary) {
    this.summary = JsonNullable.of(summary);
    return this;
  }

  /**
   * Get summary
   * @return summary
  */
  
  @Schema(name = "summary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary")
  public JsonNullable<String> getSummary() {
    return summary;
  }

  public void setSummary(JsonNullable<String> summary) {
    this.summary = summary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bill bill = (Bill) o;
    return Objects.equals(this.agent, bill.agent) &&
        Objects.equals(this.billId, bill.billId) &&
        Objects.equals(this.billTypeId, bill.billTypeId) &&
        equalsNullable(this.billWithdrawn, bill.billWithdrawn) &&
        Objects.equals(this.currentHouse, bill.currentHouse) &&
        Objects.equals(this.currentStage, bill.currentStage) &&
        equalsNullable(this.includedSessionIds, bill.includedSessionIds) &&
        Objects.equals(this.introducedSessionId, bill.introducedSessionId) &&
        Objects.equals(this.isAct, bill.isAct) &&
        Objects.equals(this.isDefeated, bill.isDefeated) &&
        Objects.equals(this.lastUpdate, bill.lastUpdate) &&
        equalsNullable(this.longTitle, bill.longTitle) &&
        Objects.equals(this.originatingHouse, bill.originatingHouse) &&
        equalsNullable(this.petitionInformation, bill.petitionInformation) &&
        equalsNullable(this.petitioningPeriod, bill.petitioningPeriod) &&
        equalsNullable(this.promoters, bill.promoters) &&
        equalsNullable(this.shortTitle, bill.shortTitle) &&
        equalsNullable(this.sponsors, bill.sponsors) &&
        equalsNullable(this.summary, bill.summary);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, billId, billTypeId, hashCodeNullable(billWithdrawn), currentHouse, currentStage, hashCodeNullable(includedSessionIds), introducedSessionId, isAct, isDefeated, lastUpdate, hashCodeNullable(longTitle), originatingHouse, hashCodeNullable(petitionInformation), hashCodeNullable(petitioningPeriod), hashCodeNullable(promoters), hashCodeNullable(shortTitle), hashCodeNullable(sponsors), hashCodeNullable(summary));
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
    sb.append("class Bill {\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
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
    sb.append("    longTitle: ").append(toIndentedString(longTitle)).append("\n");
    sb.append("    originatingHouse: ").append(toIndentedString(originatingHouse)).append("\n");
    sb.append("    petitionInformation: ").append(toIndentedString(petitionInformation)).append("\n");
    sb.append("    petitioningPeriod: ").append(toIndentedString(petitioningPeriod)).append("\n");
    sb.append("    promoters: ").append(toIndentedString(promoters)).append("\n");
    sb.append("    shortTitle: ").append(toIndentedString(shortTitle)).append("\n");
    sb.append("    sponsors: ").append(toIndentedString(sponsors)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

