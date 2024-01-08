package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ReportStateType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;GenerateCredentialReport&lt;/a&gt; request. 
 */

@Schema(name = "GenerateCredentialReportResponse", description = "Contains the response to a successful <a>GenerateCredentialReport</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GenerateCredentialReportResponse {

  private ReportStateType state;

  private String description;

  public GenerateCredentialReportResponse state(ReportStateType state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @Valid 
  @Schema(name = "State", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("State")
  public ReportStateType getState() {
    return state;
  }

  public void setState(ReportStateType state) {
    this.state = state;
  }

  public GenerateCredentialReportResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "Description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateCredentialReportResponse generateCredentialReportResponse = (GenerateCredentialReportResponse) o;
    return Objects.equals(this.state, generateCredentialReportResponse.state) &&
        Objects.equals(this.description, generateCredentialReportResponse.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateCredentialReportResponse {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

