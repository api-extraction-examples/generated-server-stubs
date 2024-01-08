package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListDagRunsForm
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class ListDagRunsForm {

  @Valid
  private List<String> dagIds;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDateGte;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDateLte;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime executionDateGte;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime executionDateLte;

  private String orderBy;

  private Integer pageLimit = 100;

  private Integer pageOffset;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDateGte;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDateLte;

  @Valid
  private List<String> states;

  public ListDagRunsForm dagIds(List<String> dagIds) {
    this.dagIds = dagIds;
    return this;
  }

  public ListDagRunsForm addDagIdsItem(String dagIdsItem) {
    if (this.dagIds == null) {
      this.dagIds = new ArrayList<>();
    }
    this.dagIds.add(dagIdsItem);
    return this;
  }

  /**
   * Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition).
   * @return dagIds
  */
  
  @Schema(name = "dag_ids", description = "Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dag_ids")
  public List<String> getDagIds() {
    return dagIds;
  }

  public void setDagIds(List<String> dagIds) {
    this.dagIds = dagIds;
  }

  public ListDagRunsForm endDateGte(OffsetDateTime endDateGte) {
    this.endDateGte = endDateGte;
    return this;
  }

  /**
   * Returns objects greater or equal the specified date.  This can be combined with end_date_lte parameter to receive only the selected period. 
   * @return endDateGte
  */
  @Valid 
  @Schema(name = "end_date_gte", description = "Returns objects greater or equal the specified date.  This can be combined with end_date_lte parameter to receive only the selected period. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_date_gte")
  public OffsetDateTime getEndDateGte() {
    return endDateGte;
  }

  public void setEndDateGte(OffsetDateTime endDateGte) {
    this.endDateGte = endDateGte;
  }

  public ListDagRunsForm endDateLte(OffsetDateTime endDateLte) {
    this.endDateLte = endDateLte;
    return this;
  }

  /**
   * Returns objects less than or equal to the specified date.  This can be combined with end_date_gte parameter to receive only the selected period. 
   * @return endDateLte
  */
  @Valid 
  @Schema(name = "end_date_lte", description = "Returns objects less than or equal to the specified date.  This can be combined with end_date_gte parameter to receive only the selected period. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_date_lte")
  public OffsetDateTime getEndDateLte() {
    return endDateLte;
  }

  public void setEndDateLte(OffsetDateTime endDateLte) {
    this.endDateLte = endDateLte;
  }

  public ListDagRunsForm executionDateGte(OffsetDateTime executionDateGte) {
    this.executionDateGte = executionDateGte;
    return this;
  }

  /**
   * Returns objects greater or equal to the specified date.  This can be combined with execution_date_lte key to receive only the selected period. 
   * @return executionDateGte
  */
  @Valid 
  @Schema(name = "execution_date_gte", description = "Returns objects greater or equal to the specified date.  This can be combined with execution_date_lte key to receive only the selected period. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("execution_date_gte")
  public OffsetDateTime getExecutionDateGte() {
    return executionDateGte;
  }

  public void setExecutionDateGte(OffsetDateTime executionDateGte) {
    this.executionDateGte = executionDateGte;
  }

  public ListDagRunsForm executionDateLte(OffsetDateTime executionDateLte) {
    this.executionDateLte = executionDateLte;
    return this;
  }

  /**
   * Returns objects less than or equal to the specified date.  This can be combined with execution_date_gte key to receive only the selected period. 
   * @return executionDateLte
  */
  @Valid 
  @Schema(name = "execution_date_lte", description = "Returns objects less than or equal to the specified date.  This can be combined with execution_date_gte key to receive only the selected period. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("execution_date_lte")
  public OffsetDateTime getExecutionDateLte() {
    return executionDateLte;
  }

  public void setExecutionDateLte(OffsetDateTime executionDateLte) {
    this.executionDateLte = executionDateLte;
  }

  public ListDagRunsForm orderBy(String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * The name of the field to order the results by. Prefix a field name with `-` to reverse the sort order.  *New in version 2.1.0* 
   * @return orderBy
  */
  
  @Schema(name = "order_by", description = "The name of the field to order the results by. Prefix a field name with `-` to reverse the sort order.  *New in version 2.1.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order_by")
  public String getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

  public ListDagRunsForm pageLimit(Integer pageLimit) {
    this.pageLimit = pageLimit;
    return this;
  }

  /**
   * The numbers of items to return.
   * minimum: 1
   * @return pageLimit
  */
  @Min(1) 
  @Schema(name = "page_limit", description = "The numbers of items to return.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page_limit")
  public Integer getPageLimit() {
    return pageLimit;
  }

  public void setPageLimit(Integer pageLimit) {
    this.pageLimit = pageLimit;
  }

  public ListDagRunsForm pageOffset(Integer pageOffset) {
    this.pageOffset = pageOffset;
    return this;
  }

  /**
   * The number of items to skip before starting to collect the result set.
   * minimum: 0
   * @return pageOffset
  */
  @Min(0) 
  @Schema(name = "page_offset", description = "The number of items to skip before starting to collect the result set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page_offset")
  public Integer getPageOffset() {
    return pageOffset;
  }

  public void setPageOffset(Integer pageOffset) {
    this.pageOffset = pageOffset;
  }

  public ListDagRunsForm startDateGte(OffsetDateTime startDateGte) {
    this.startDateGte = startDateGte;
    return this;
  }

  /**
   * Returns objects greater or equal the specified date.  This can be combined with start_date_lte key to receive only the selected period. 
   * @return startDateGte
  */
  @Valid 
  @Schema(name = "start_date_gte", description = "Returns objects greater or equal the specified date.  This can be combined with start_date_lte key to receive only the selected period. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_date_gte")
  public OffsetDateTime getStartDateGte() {
    return startDateGte;
  }

  public void setStartDateGte(OffsetDateTime startDateGte) {
    this.startDateGte = startDateGte;
  }

  public ListDagRunsForm startDateLte(OffsetDateTime startDateLte) {
    this.startDateLte = startDateLte;
    return this;
  }

  /**
   * Returns objects less or equal the specified date.  This can be combined with start_date_gte parameter to receive only the selected period 
   * @return startDateLte
  */
  @Valid 
  @Schema(name = "start_date_lte", description = "Returns objects less or equal the specified date.  This can be combined with start_date_gte parameter to receive only the selected period ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_date_lte")
  public OffsetDateTime getStartDateLte() {
    return startDateLte;
  }

  public void setStartDateLte(OffsetDateTime startDateLte) {
    this.startDateLte = startDateLte;
  }

  public ListDagRunsForm states(List<String> states) {
    this.states = states;
    return this;
  }

  public ListDagRunsForm addStatesItem(String statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<>();
    }
    this.states.add(statesItem);
    return this;
  }

  /**
   * Return objects with specific states. The value can be repeated to retrieve multiple matching values (OR condition).
   * @return states
  */
  
  @Schema(name = "states", description = "Return objects with specific states. The value can be repeated to retrieve multiple matching values (OR condition).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("states")
  public List<String> getStates() {
    return states;
  }

  public void setStates(List<String> states) {
    this.states = states;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDagRunsForm listDagRunsForm = (ListDagRunsForm) o;
    return Objects.equals(this.dagIds, listDagRunsForm.dagIds) &&
        Objects.equals(this.endDateGte, listDagRunsForm.endDateGte) &&
        Objects.equals(this.endDateLte, listDagRunsForm.endDateLte) &&
        Objects.equals(this.executionDateGte, listDagRunsForm.executionDateGte) &&
        Objects.equals(this.executionDateLte, listDagRunsForm.executionDateLte) &&
        Objects.equals(this.orderBy, listDagRunsForm.orderBy) &&
        Objects.equals(this.pageLimit, listDagRunsForm.pageLimit) &&
        Objects.equals(this.pageOffset, listDagRunsForm.pageOffset) &&
        Objects.equals(this.startDateGte, listDagRunsForm.startDateGte) &&
        Objects.equals(this.startDateLte, listDagRunsForm.startDateLte) &&
        Objects.equals(this.states, listDagRunsForm.states);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dagIds, endDateGte, endDateLte, executionDateGte, executionDateLte, orderBy, pageLimit, pageOffset, startDateGte, startDateLte, states);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDagRunsForm {\n");
    sb.append("    dagIds: ").append(toIndentedString(dagIds)).append("\n");
    sb.append("    endDateGte: ").append(toIndentedString(endDateGte)).append("\n");
    sb.append("    endDateLte: ").append(toIndentedString(endDateLte)).append("\n");
    sb.append("    executionDateGte: ").append(toIndentedString(executionDateGte)).append("\n");
    sb.append("    executionDateLte: ").append(toIndentedString(executionDateLte)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    pageLimit: ").append(toIndentedString(pageLimit)).append("\n");
    sb.append("    pageOffset: ").append(toIndentedString(pageOffset)).append("\n");
    sb.append("    startDateGte: ").append(toIndentedString(startDateGte)).append("\n");
    sb.append("    startDateLte: ").append(toIndentedString(startDateLte)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
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

