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
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This is a summary of the results given the action that was executed.
 */

@Schema(name = "ExecuteResponse", description = "This is a summary of the results given the action that was executed.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:55:55.879556-04:00[America/Lower_Princes]")
public class ExecuteResponse {

  private String actionUsed;

  @Valid
  private List<Object> additionalResults = new ArrayList<>();

  private String assistantHint;

  private String error;

  private String id;

  private Object inputParams;

  private Object result;

  private Object resultFieldLabels;

  private String reviewUrl;

  /**
   * The status of the execution.
   */
  public enum StatusEnum {
    SUCCESS("success"),
    
    ERROR("error"),
    
    EMPTY("empty"),
    
    PREVIEW("preview");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status = StatusEnum.SUCCESS;

  public ExecuteResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExecuteResponse(String actionUsed, List<Object> additionalResults, String id, Object inputParams, String reviewUrl) {
    this.actionUsed = actionUsed;
    this.additionalResults = additionalResults;
    this.id = id;
    this.inputParams = inputParams;
    this.reviewUrl = reviewUrl;
  }

  public ExecuteResponse actionUsed(String actionUsed) {
    this.actionUsed = actionUsed;
    return this;
  }

  /**
   * The name of the action that was executed.
   * @return actionUsed
  */
  @NotNull 
  @Schema(name = "action_used", description = "The name of the action that was executed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action_used")
  public String getActionUsed() {
    return actionUsed;
  }

  public void setActionUsed(String actionUsed) {
    this.actionUsed = actionUsed;
  }

  public ExecuteResponse additionalResults(List<Object> additionalResults) {
    this.additionalResults = additionalResults;
    return this;
  }

  public ExecuteResponse addAdditionalResultsItem(Object additionalResultsItem) {
    if (this.additionalResults == null) {
      this.additionalResults = new ArrayList<>();
    }
    this.additionalResults.add(additionalResultsItem);
    return this;
  }

  /**
   * The rest of the full results. Always returns an array of objects
   * @return additionalResults
  */
  @NotNull 
  @Schema(name = "additional_results", description = "The rest of the full results. Always returns an array of objects", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("additional_results")
  public List<Object> getAdditionalResults() {
    return additionalResults;
  }

  public void setAdditionalResults(List<Object> additionalResults) {
    this.additionalResults = additionalResults;
  }

  public ExecuteResponse assistantHint(String assistantHint) {
    this.assistantHint = assistantHint;
    return this;
  }

  /**
   * A hint for the assistant on what to do next.
   * @return assistantHint
  */
  
  @Schema(name = "assistant_hint", description = "A hint for the assistant on what to do next.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assistant_hint")
  public String getAssistantHint() {
    return assistantHint;
  }

  public void setAssistantHint(String assistantHint) {
    this.assistantHint = assistantHint;
  }

  public ExecuteResponse error(String error) {
    this.error = error;
    return this;
  }

  /**
   * The error message if the execution failed.
   * @return error
  */
  
  @Schema(name = "error", description = "The error message if the execution failed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ExecuteResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the execution log.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The id of the execution log.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ExecuteResponse inputParams(Object inputParams) {
    this.inputParams = inputParams;
    return this;
  }

  /**
   * The params we used / will use to execute the action.
   * @return inputParams
  */
  @NotNull 
  @Schema(name = "input_params", description = "The params we used / will use to execute the action.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("input_params")
  public Object getInputParams() {
    return inputParams;
  }

  public void setInputParams(Object inputParams) {
    this.inputParams = inputParams;
  }

  public ExecuteResponse result(Object result) {
    this.result = result;
    return this;
  }

  /**
   * A trimmed down result of the first item of the full results. Ideal for humans and language models!
   * @return result
  */
  
  @Schema(name = "result", description = "A trimmed down result of the first item of the full results. Ideal for humans and language models!", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("result")
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public ExecuteResponse resultFieldLabels(Object resultFieldLabels) {
    this.resultFieldLabels = resultFieldLabels;
    return this;
  }

  /**
   * Human readable labels for some of the keys in the result.
   * @return resultFieldLabels
  */
  
  @Schema(name = "result_field_labels", description = "Human readable labels for some of the keys in the result.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("result_field_labels")
  public Object getResultFieldLabels() {
    return resultFieldLabels;
  }

  public void setResultFieldLabels(Object resultFieldLabels) {
    this.resultFieldLabels = resultFieldLabels;
  }

  public ExecuteResponse reviewUrl(String reviewUrl) {
    this.reviewUrl = reviewUrl;
    return this;
  }

  /**
   * The URL to run the action or review the AI choices the AI made for input_params given instructions.
   * @return reviewUrl
  */
  @NotNull 
  @Schema(name = "review_url", description = "The URL to run the action or review the AI choices the AI made for input_params given instructions.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("review_url")
  public String getReviewUrl() {
    return reviewUrl;
  }

  public void setReviewUrl(String reviewUrl) {
    this.reviewUrl = reviewUrl;
  }

  public ExecuteResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the execution.
   * @return status
  */
  
  @Schema(name = "status", description = "The status of the execution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteResponse executeResponse = (ExecuteResponse) o;
    return Objects.equals(this.actionUsed, executeResponse.actionUsed) &&
        Objects.equals(this.additionalResults, executeResponse.additionalResults) &&
        Objects.equals(this.assistantHint, executeResponse.assistantHint) &&
        Objects.equals(this.error, executeResponse.error) &&
        Objects.equals(this.id, executeResponse.id) &&
        Objects.equals(this.inputParams, executeResponse.inputParams) &&
        Objects.equals(this.result, executeResponse.result) &&
        Objects.equals(this.resultFieldLabels, executeResponse.resultFieldLabels) &&
        Objects.equals(this.reviewUrl, executeResponse.reviewUrl) &&
        Objects.equals(this.status, executeResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionUsed, additionalResults, assistantHint, error, id, inputParams, result, resultFieldLabels, reviewUrl, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteResponse {\n");
    sb.append("    actionUsed: ").append(toIndentedString(actionUsed)).append("\n");
    sb.append("    additionalResults: ").append(toIndentedString(additionalResults)).append("\n");
    sb.append("    assistantHint: ").append(toIndentedString(assistantHint)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputParams: ").append(toIndentedString(inputParams)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultFieldLabels: ").append(toIndentedString(resultFieldLabels)).append("\n");
    sb.append("    reviewUrl: ").append(toIndentedString(reviewUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

