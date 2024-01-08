package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
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
 * BillStageSitting
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:54:38.614249-04:00[America/Lower_Princes]")
public class BillStageSitting {

  private Integer billId;

  private Integer billStageId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> date = JsonNullable.<OffsetDateTime>undefined();

  private Integer id;

  private Integer stageId;

  public BillStageSitting billId(Integer billId) {
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

  public BillStageSitting billStageId(Integer billStageId) {
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

  public BillStageSitting date(OffsetDateTime date) {
    this.date = JsonNullable.of(date);
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @Valid 
  @Schema(name = "date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public JsonNullable<OffsetDateTime> getDate() {
    return date;
  }

  public void setDate(JsonNullable<OffsetDateTime> date) {
    this.date = date;
  }

  public BillStageSitting id(Integer id) {
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

  public BillStageSitting stageId(Integer stageId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillStageSitting billStageSitting = (BillStageSitting) o;
    return Objects.equals(this.billId, billStageSitting.billId) &&
        Objects.equals(this.billStageId, billStageSitting.billStageId) &&
        equalsNullable(this.date, billStageSitting.date) &&
        Objects.equals(this.id, billStageSitting.id) &&
        Objects.equals(this.stageId, billStageSitting.stageId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(billId, billStageId, hashCodeNullable(date), id, stageId);
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
    sb.append("class BillStageSitting {\n");
    sb.append("    billId: ").append(toIndentedString(billId)).append("\n");
    sb.append("    billStageId: ").append(toIndentedString(billStageId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
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

