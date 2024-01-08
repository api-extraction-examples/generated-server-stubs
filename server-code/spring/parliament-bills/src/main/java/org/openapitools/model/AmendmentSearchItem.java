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
import org.openapitools.model.AmendmentDecision;
import org.openapitools.model.AmendmentMember;
import org.openapitools.model.AmendmentType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AmendmentSearchItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:54:38.614249-04:00[America/Lower_Princes]")
public class AmendmentSearchItem {

  private Integer amendmentId;

  private JsonNullable<String> amendmentPosition = JsonNullable.<String>undefined();

  private AmendmentType amendmentType;

  private Integer billId;

  private Integer billStageId;

  private JsonNullable<Integer> clause = JsonNullable.<Integer>undefined();

  private AmendmentDecision decision;

  private JsonNullable<Integer> lineNumber = JsonNullable.<Integer>undefined();

  private JsonNullable<String> marshalledListText = JsonNullable.<String>undefined();

  private JsonNullable<Integer> pageNumber = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> schedule = JsonNullable.<Integer>undefined();

  @Valid
  private JsonNullable<List<@Valid AmendmentMember>> sponsors = JsonNullable.<List<@Valid AmendmentMember>>undefined();

  @Valid
  private JsonNullable<List<String>> summaryText = JsonNullable.<List<String>>undefined();

  public AmendmentSearchItem amendmentId(Integer amendmentId) {
    this.amendmentId = amendmentId;
    return this;
  }

  /**
   * Get amendmentId
   * @return amendmentId
  */
  
  @Schema(name = "amendmentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amendmentId")
  public Integer getAmendmentId() {
    return amendmentId;
  }

  public void setAmendmentId(Integer amendmentId) {
    this.amendmentId = amendmentId;
  }

  public AmendmentSearchItem amendmentPosition(String amendmentPosition) {
    this.amendmentPosition = JsonNullable.of(amendmentPosition);
    return this;
  }

  /**
   * Get amendmentPosition
   * @return amendmentPosition
  */
  
  @Schema(name = "amendmentPosition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amendmentPosition")
  public JsonNullable<String> getAmendmentPosition() {
    return amendmentPosition;
  }

  public void setAmendmentPosition(JsonNullable<String> amendmentPosition) {
    this.amendmentPosition = amendmentPosition;
  }

  public AmendmentSearchItem amendmentType(AmendmentType amendmentType) {
    this.amendmentType = amendmentType;
    return this;
  }

  /**
   * Get amendmentType
   * @return amendmentType
  */
  @Valid 
  @Schema(name = "amendmentType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amendmentType")
  public AmendmentType getAmendmentType() {
    return amendmentType;
  }

  public void setAmendmentType(AmendmentType amendmentType) {
    this.amendmentType = amendmentType;
  }

  public AmendmentSearchItem billId(Integer billId) {
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

  public AmendmentSearchItem billStageId(Integer billStageId) {
    this.billStageId = billStageId;
    return this;
  }

  /**
   * Get billStageId
   * @return billStageId
  */
  
  @Schema(name = "billStageId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billStageId")
  public Integer getBillStageId() {
    return billStageId;
  }

  public void setBillStageId(Integer billStageId) {
    this.billStageId = billStageId;
  }

  public AmendmentSearchItem clause(Integer clause) {
    this.clause = JsonNullable.of(clause);
    return this;
  }

  /**
   * Get clause
   * @return clause
  */
  
  @Schema(name = "clause", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clause")
  public JsonNullable<Integer> getClause() {
    return clause;
  }

  public void setClause(JsonNullable<Integer> clause) {
    this.clause = clause;
  }

  public AmendmentSearchItem decision(AmendmentDecision decision) {
    this.decision = decision;
    return this;
  }

  /**
   * Get decision
   * @return decision
  */
  @Valid 
  @Schema(name = "decision", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decision")
  public AmendmentDecision getDecision() {
    return decision;
  }

  public void setDecision(AmendmentDecision decision) {
    this.decision = decision;
  }

  public AmendmentSearchItem lineNumber(Integer lineNumber) {
    this.lineNumber = JsonNullable.of(lineNumber);
    return this;
  }

  /**
   * Get lineNumber
   * @return lineNumber
  */
  
  @Schema(name = "lineNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lineNumber")
  public JsonNullable<Integer> getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(JsonNullable<Integer> lineNumber) {
    this.lineNumber = lineNumber;
  }

  public AmendmentSearchItem marshalledListText(String marshalledListText) {
    this.marshalledListText = JsonNullable.of(marshalledListText);
    return this;
  }

  /**
   * Get marshalledListText
   * @return marshalledListText
  */
  
  @Schema(name = "marshalledListText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marshalledListText")
  public JsonNullable<String> getMarshalledListText() {
    return marshalledListText;
  }

  public void setMarshalledListText(JsonNullable<String> marshalledListText) {
    this.marshalledListText = marshalledListText;
  }

  public AmendmentSearchItem pageNumber(Integer pageNumber) {
    this.pageNumber = JsonNullable.of(pageNumber);
    return this;
  }

  /**
   * Get pageNumber
   * @return pageNumber
  */
  
  @Schema(name = "pageNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageNumber")
  public JsonNullable<Integer> getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(JsonNullable<Integer> pageNumber) {
    this.pageNumber = pageNumber;
  }

  public AmendmentSearchItem schedule(Integer schedule) {
    this.schedule = JsonNullable.of(schedule);
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  */
  
  @Schema(name = "schedule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedule")
  public JsonNullable<Integer> getSchedule() {
    return schedule;
  }

  public void setSchedule(JsonNullable<Integer> schedule) {
    this.schedule = schedule;
  }

  public AmendmentSearchItem sponsors(List<@Valid AmendmentMember> sponsors) {
    this.sponsors = JsonNullable.of(sponsors);
    return this;
  }

  public AmendmentSearchItem addSponsorsItem(AmendmentMember sponsorsItem) {
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
  public JsonNullable<List<@Valid AmendmentMember>> getSponsors() {
    return sponsors;
  }

  public void setSponsors(JsonNullable<List<@Valid AmendmentMember>> sponsors) {
    this.sponsors = sponsors;
  }

  public AmendmentSearchItem summaryText(List<String> summaryText) {
    this.summaryText = JsonNullable.of(summaryText);
    return this;
  }

  public AmendmentSearchItem addSummaryTextItem(String summaryTextItem) {
    if (this.summaryText == null || !this.summaryText.isPresent()) {
      this.summaryText = JsonNullable.of(new ArrayList<>());
    }
    this.summaryText.get().add(summaryTextItem);
    return this;
  }

  /**
   * Get summaryText
   * @return summaryText
  */
  
  @Schema(name = "summaryText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summaryText")
  public JsonNullable<List<String>> getSummaryText() {
    return summaryText;
  }

  public void setSummaryText(JsonNullable<List<String>> summaryText) {
    this.summaryText = summaryText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmendmentSearchItem amendmentSearchItem = (AmendmentSearchItem) o;
    return Objects.equals(this.amendmentId, amendmentSearchItem.amendmentId) &&
        equalsNullable(this.amendmentPosition, amendmentSearchItem.amendmentPosition) &&
        Objects.equals(this.amendmentType, amendmentSearchItem.amendmentType) &&
        Objects.equals(this.billId, amendmentSearchItem.billId) &&
        Objects.equals(this.billStageId, amendmentSearchItem.billStageId) &&
        equalsNullable(this.clause, amendmentSearchItem.clause) &&
        Objects.equals(this.decision, amendmentSearchItem.decision) &&
        equalsNullable(this.lineNumber, amendmentSearchItem.lineNumber) &&
        equalsNullable(this.marshalledListText, amendmentSearchItem.marshalledListText) &&
        equalsNullable(this.pageNumber, amendmentSearchItem.pageNumber) &&
        equalsNullable(this.schedule, amendmentSearchItem.schedule) &&
        equalsNullable(this.sponsors, amendmentSearchItem.sponsors) &&
        equalsNullable(this.summaryText, amendmentSearchItem.summaryText);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amendmentId, hashCodeNullable(amendmentPosition), amendmentType, billId, billStageId, hashCodeNullable(clause), decision, hashCodeNullable(lineNumber), hashCodeNullable(marshalledListText), hashCodeNullable(pageNumber), hashCodeNullable(schedule), hashCodeNullable(sponsors), hashCodeNullable(summaryText));
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
    sb.append("class AmendmentSearchItem {\n");
    sb.append("    amendmentId: ").append(toIndentedString(amendmentId)).append("\n");
    sb.append("    amendmentPosition: ").append(toIndentedString(amendmentPosition)).append("\n");
    sb.append("    amendmentType: ").append(toIndentedString(amendmentType)).append("\n");
    sb.append("    billId: ").append(toIndentedString(billId)).append("\n");
    sb.append("    billStageId: ").append(toIndentedString(billStageId)).append("\n");
    sb.append("    clause: ").append(toIndentedString(clause)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    marshalledListText: ").append(toIndentedString(marshalledListText)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    sponsors: ").append(toIndentedString(sponsors)).append("\n");
    sb.append("    summaryText: ").append(toIndentedString(summaryText)).append("\n");
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

