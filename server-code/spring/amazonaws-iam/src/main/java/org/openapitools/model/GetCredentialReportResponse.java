package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.model.ReportFormatType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;GetCredentialReport&lt;/a&gt; request. 
 */

@Schema(name = "GetCredentialReportResponse", description = "Contains the response to a successful <a>GetCredentialReport</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetCredentialReportResponse {

  private String content;

  private ReportFormatType reportFormat;

  private OffsetDateTime generatedTime;

  public GetCredentialReportResponse content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  
  @Schema(name = "Content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public GetCredentialReportResponse reportFormat(ReportFormatType reportFormat) {
    this.reportFormat = reportFormat;
    return this;
  }

  /**
   * Get reportFormat
   * @return reportFormat
  */
  @Valid 
  @Schema(name = "ReportFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ReportFormat")
  public ReportFormatType getReportFormat() {
    return reportFormat;
  }

  public void setReportFormat(ReportFormatType reportFormat) {
    this.reportFormat = reportFormat;
  }

  public GetCredentialReportResponse generatedTime(OffsetDateTime generatedTime) {
    this.generatedTime = generatedTime;
    return this;
  }

  /**
   * Get generatedTime
   * @return generatedTime
  */
  @Valid 
  @Schema(name = "GeneratedTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GeneratedTime")
  public OffsetDateTime getGeneratedTime() {
    return generatedTime;
  }

  public void setGeneratedTime(OffsetDateTime generatedTime) {
    this.generatedTime = generatedTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCredentialReportResponse getCredentialReportResponse = (GetCredentialReportResponse) o;
    return Objects.equals(this.content, getCredentialReportResponse.content) &&
        Objects.equals(this.reportFormat, getCredentialReportResponse.reportFormat) &&
        Objects.equals(this.generatedTime, getCredentialReportResponse.generatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, reportFormat, generatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCredentialReportResponse {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    reportFormat: ").append(toIndentedString(reportFormat)).append("\n");
    sb.append("    generatedTime: ").append(toIndentedString(generatedTime)).append("\n");
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

