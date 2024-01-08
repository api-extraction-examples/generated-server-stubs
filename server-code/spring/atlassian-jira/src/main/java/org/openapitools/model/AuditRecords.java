package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AuditRecordBean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Container for a list of audit records.
 */

@Schema(name = "AuditRecords", description = "Container for a list of audit records.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AuditRecords {

  private Integer limit;

  private Integer offset;

  @Valid
  private List<@Valid AuditRecordBean> records;

  private Long total;

  public AuditRecords limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The requested or default limit on the number of audit items to be returned.
   * @return limit
  */
  
  @Schema(name = "limit", accessMode = Schema.AccessMode.READ_ONLY, description = "The requested or default limit on the number of audit items to be returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public AuditRecords offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * The number of audit items skipped before the first item in this list.
   * @return offset
  */
  
  @Schema(name = "offset", accessMode = Schema.AccessMode.READ_ONLY, description = "The number of audit items skipped before the first item in this list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public AuditRecords records(List<@Valid AuditRecordBean> records) {
    this.records = records;
    return this;
  }

  public AuditRecords addRecordsItem(AuditRecordBean recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<>();
    }
    this.records.add(recordsItem);
    return this;
  }

  /**
   * The list of audit items.
   * @return records
  */
  @Valid 
  @Schema(name = "records", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of audit items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("records")
  public List<@Valid AuditRecordBean> getRecords() {
    return records;
  }

  public void setRecords(List<@Valid AuditRecordBean> records) {
    this.records = records;
  }

  public AuditRecords total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * The total number of audit items returned.
   * @return total
  */
  
  @Schema(name = "total", accessMode = Schema.AccessMode.READ_ONLY, description = "The total number of audit items returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditRecords auditRecords = (AuditRecords) o;
    return Objects.equals(this.limit, auditRecords.limit) &&
        Objects.equals(this.offset, auditRecords.offset) &&
        Objects.equals(this.records, auditRecords.records) &&
        Objects.equals(this.total, auditRecords.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, records, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditRecords {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

