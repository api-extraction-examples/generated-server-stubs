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
import org.openapitools.model.AmendmentLine;
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
 * AmendmentDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:54:38.614249-04:00[America/Lower_Princes]")
public class AmendmentDetail {

  private Integer amendmentId;

  @Valid
  private JsonNullable<List<@Valid AmendmentLine>> amendmentLines = JsonNullable.<List<@Valid AmendmentLine>>undefined();

  private JsonNullable<String> amendmentNote = JsonNullable.<String>undefined();

  private JsonNullable<String> amendmentPosition = JsonNullable.<String>undefined();

  private AmendmentType amendmentType;

  private Integer billId;

  private Integer billStageId;

  private JsonNullable<Integer> clause = JsonNullable.<Integer>undefined();

  private AmendmentDecision decision;

  private JsonNullable<String> explanatoryText = JsonNullable.<String>undefined();

  private JsonNullable<String> explanatoryTextPrefix = JsonNullable.<String>undefined();

  private JsonNullable<Integer> lineNumber = JsonNullable.<Integer>undefined();

  private JsonNullable<String> marshalledListText = JsonNullable.<String>undefined();

  private JsonNullable<Integer> pageNumber = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> schedule = JsonNullable.<Integer>undefined();

  @Valid
  private JsonNullable<List<@Valid AmendmentMember>> sponsors = JsonNullable.<List<@Valid AmendmentMember>>undefined();

  public AmendmentDetail amendmentId(Integer amendmentId) {
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

  public AmendmentDetail amendmentLines(List<@Valid AmendmentLine> amendmentLines) {
    this.amendmentLines = JsonNullable.of(amendmentLines);
    return this;
  }

  public AmendmentDetail addAmendmentLinesItem(AmendmentLine amendmentLinesItem) {
    if (this.amendmentLines == null || !this.amendmentLines.isPresent()) {
      this.amendmentLines = JsonNullable.of(new ArrayList<>());
    }
    this.amendmentLines.get().add(amendmentLinesItem);
    return this;
  }

  /**
   * Get amendmentLines
   * @return amendmentLines
  */
  @Valid 
  @Schema(name = "amendmentLines", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amendmentLines")
  public JsonNullable<List<@Valid AmendmentLine>> getAmendmentLines() {
    return amendmentLines;
  }

  public void setAmendmentLines(JsonNullable<List<@Valid AmendmentLine>> amendmentLines) {
    this.amendmentLines = amendmentLines;
  }

  public AmendmentDetail amendmentNote(String amendmentNote) {
    this.amendmentNote = JsonNullable.of(amendmentNote);
    return this;
  }

  /**
   * Get amendmentNote
   * @return amendmentNote
  */
  
  @Schema(name = "amendmentNote", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amendmentNote")
  public JsonNullable<String> getAmendmentNote() {
    return amendmentNote;
  }

  public void setAmendmentNote(JsonNullable<String> amendmentNote) {
    this.amendmentNote = amendmentNote;
  }

  public AmendmentDetail amendmentPosition(String amendmentPosition) {
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

  public AmendmentDetail amendmentType(AmendmentType amendmentType) {
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

  public AmendmentDetail billId(Integer billId) {
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

  public AmendmentDetail billStageId(Integer billStageId) {
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

  public AmendmentDetail clause(Integer clause) {
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

  public AmendmentDetail decision(AmendmentDecision decision) {
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

  public AmendmentDetail explanatoryText(String explanatoryText) {
    this.explanatoryText = JsonNullable.of(explanatoryText);
    return this;
  }

  /**
   * Get explanatoryText
   * @return explanatoryText
  */
  
  @Schema(name = "explanatoryText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explanatoryText")
  public JsonNullable<String> getExplanatoryText() {
    return explanatoryText;
  }

  public void setExplanatoryText(JsonNullable<String> explanatoryText) {
    this.explanatoryText = explanatoryText;
  }

  public AmendmentDetail explanatoryTextPrefix(String explanatoryTextPrefix) {
    this.explanatoryTextPrefix = JsonNullable.of(explanatoryTextPrefix);
    return this;
  }

  /**
   * Get explanatoryTextPrefix
   * @return explanatoryTextPrefix
  */
  
  @Schema(name = "explanatoryTextPrefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explanatoryTextPrefix")
  public JsonNullable<String> getExplanatoryTextPrefix() {
    return explanatoryTextPrefix;
  }

  public void setExplanatoryTextPrefix(JsonNullable<String> explanatoryTextPrefix) {
    this.explanatoryTextPrefix = explanatoryTextPrefix;
  }

  public AmendmentDetail lineNumber(Integer lineNumber) {
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

  public AmendmentDetail marshalledListText(String marshalledListText) {
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

  public AmendmentDetail pageNumber(Integer pageNumber) {
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

  public AmendmentDetail schedule(Integer schedule) {
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

  public AmendmentDetail sponsors(List<@Valid AmendmentMember> sponsors) {
    this.sponsors = JsonNullable.of(sponsors);
    return this;
  }

  public AmendmentDetail addSponsorsItem(AmendmentMember sponsorsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmendmentDetail amendmentDetail = (AmendmentDetail) o;
    return Objects.equals(this.amendmentId, amendmentDetail.amendmentId) &&
        equalsNullable(this.amendmentLines, amendmentDetail.amendmentLines) &&
        equalsNullable(this.amendmentNote, amendmentDetail.amendmentNote) &&
        equalsNullable(this.amendmentPosition, amendmentDetail.amendmentPosition) &&
        Objects.equals(this.amendmentType, amendmentDetail.amendmentType) &&
        Objects.equals(this.billId, amendmentDetail.billId) &&
        Objects.equals(this.billStageId, amendmentDetail.billStageId) &&
        equalsNullable(this.clause, amendmentDetail.clause) &&
        Objects.equals(this.decision, amendmentDetail.decision) &&
        equalsNullable(this.explanatoryText, amendmentDetail.explanatoryText) &&
        equalsNullable(this.explanatoryTextPrefix, amendmentDetail.explanatoryTextPrefix) &&
        equalsNullable(this.lineNumber, amendmentDetail.lineNumber) &&
        equalsNullable(this.marshalledListText, amendmentDetail.marshalledListText) &&
        equalsNullable(this.pageNumber, amendmentDetail.pageNumber) &&
        equalsNullable(this.schedule, amendmentDetail.schedule) &&
        equalsNullable(this.sponsors, amendmentDetail.sponsors);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amendmentId, hashCodeNullable(amendmentLines), hashCodeNullable(amendmentNote), hashCodeNullable(amendmentPosition), amendmentType, billId, billStageId, hashCodeNullable(clause), decision, hashCodeNullable(explanatoryText), hashCodeNullable(explanatoryTextPrefix), hashCodeNullable(lineNumber), hashCodeNullable(marshalledListText), hashCodeNullable(pageNumber), hashCodeNullable(schedule), hashCodeNullable(sponsors));
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
    sb.append("class AmendmentDetail {\n");
    sb.append("    amendmentId: ").append(toIndentedString(amendmentId)).append("\n");
    sb.append("    amendmentLines: ").append(toIndentedString(amendmentLines)).append("\n");
    sb.append("    amendmentNote: ").append(toIndentedString(amendmentNote)).append("\n");
    sb.append("    amendmentPosition: ").append(toIndentedString(amendmentPosition)).append("\n");
    sb.append("    amendmentType: ").append(toIndentedString(amendmentType)).append("\n");
    sb.append("    billId: ").append(toIndentedString(billId)).append("\n");
    sb.append("    billStageId: ").append(toIndentedString(billStageId)).append("\n");
    sb.append("    clause: ").append(toIndentedString(clause)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    explanatoryText: ").append(toIndentedString(explanatoryText)).append("\n");
    sb.append("    explanatoryTextPrefix: ").append(toIndentedString(explanatoryTextPrefix)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    marshalledListText: ").append(toIndentedString(marshalledListText)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    sponsors: ").append(toIndentedString(sponsors)).append("\n");
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

