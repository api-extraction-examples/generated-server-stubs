package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;GetAccountSummary&lt;/a&gt; request. 
 */

@Schema(name = "GetAccountSummaryResponse", description = "Contains the response to a successful <a>GetAccountSummary</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetAccountSummaryResponse {

  private Map summaryMap;

  public GetAccountSummaryResponse summaryMap(Map summaryMap) {
    this.summaryMap = summaryMap;
    return this;
  }

  /**
   * Get summaryMap
   * @return summaryMap
  */
  @Valid 
  @Schema(name = "SummaryMap", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SummaryMap")
  public Map getSummaryMap() {
    return summaryMap;
  }

  public void setSummaryMap(Map summaryMap) {
    this.summaryMap = summaryMap;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountSummaryResponse getAccountSummaryResponse = (GetAccountSummaryResponse) o;
    return Objects.equals(this.summaryMap, getAccountSummaryResponse.summaryMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summaryMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountSummaryResponse {\n");
    sb.append("    summaryMap: ").append(toIndentedString(summaryMap)).append("\n");
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

