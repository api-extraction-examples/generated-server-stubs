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
 * ApiV1PollsIdPostRequest
 */

@JsonTypeName("_api_v1_polls__id__post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1PollsIdPostRequest {

  @Valid
  private List<String> choices = new ArrayList<>();

  public ApiV1PollsIdPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApiV1PollsIdPostRequest(List<String> choices) {
    this.choices = choices;
  }

  public ApiV1PollsIdPostRequest choices(List<String> choices) {
    this.choices = choices;
    return this;
  }

  public ApiV1PollsIdPostRequest addChoicesItem(String choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }
    this.choices.add(choicesItem);
    return this;
  }

  /**
   * Get choices
   * @return choices
  */
  @NotNull 
  @Schema(name = "choices", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("choices")
  public List<String> getChoices() {
    return choices;
  }

  public void setChoices(List<String> choices) {
    this.choices = choices;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1PollsIdPostRequest apiV1PollsIdPostRequest = (ApiV1PollsIdPostRequest) o;
    return Objects.equals(this.choices, apiV1PollsIdPostRequest.choices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(choices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1PollsIdPostRequest {\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
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

