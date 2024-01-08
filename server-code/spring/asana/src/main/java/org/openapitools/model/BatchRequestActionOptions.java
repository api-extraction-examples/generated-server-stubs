package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Pagination (&#x60;limit&#x60; and &#x60;offset&#x60;) and output options (&#x60;fields&#x60; or &#x60;expand&#x60;) for the action. “Pretty” JSON output is not an available option on individual actions; if you want pretty output, specify that option on the parent request.
 */

@Schema(name = "BatchRequestAction_options", description = "Pagination (`limit` and `offset`) and output options (`fields` or `expand`) for the action. “Pretty” JSON output is not an available option on individual actions; if you want pretty output, specify that option on the parent request.")
@JsonTypeName("BatchRequestAction_options")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class BatchRequestActionOptions {

  @Valid
  private List<String> fields;

  private Integer limit;

  private Integer offset;

  public BatchRequestActionOptions fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public BatchRequestActionOptions addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * The fields to retrieve in the request.
   * @return fields
  */
  
  @Schema(name = "fields", example = "[\"name\",\"gid\",\"notes\",\"completed\"]", description = "The fields to retrieve in the request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  public BatchRequestActionOptions limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Pagination limit for the request.
   * @return limit
  */
  
  @Schema(name = "limit", example = "50", description = "Pagination limit for the request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public BatchRequestActionOptions offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Pagination offset for the request.
   * @return offset
  */
  
  @Schema(name = "offset", description = "Pagination offset for the request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequestActionOptions batchRequestActionOptions = (BatchRequestActionOptions) o;
    return Objects.equals(this.fields, batchRequestActionOptions.fields) &&
        Objects.equals(this.limit, batchRequestActionOptions.limit) &&
        Objects.equals(this.offset, batchRequestActionOptions.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, limit, offset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequestActionOptions {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

