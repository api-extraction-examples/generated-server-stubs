package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PluginRunData
 */

@JsonTypeName("pluginRunData")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class PluginRunData {

  private String _package;

  private String reportingEvent;

  private String state;

  private String summary;

  private String text;

  private String title;

  private String version;

  public PluginRunData _package(String _package) {
    this._package = _package;
    return this;
  }

  /**
   * Get _package
   * @return _package
  */
  
  @Schema(name = "package", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("package")
  public String getPackage() {
    return _package;
  }

  public void setPackage(String _package) {
    this._package = _package;
  }

  public PluginRunData reportingEvent(String reportingEvent) {
    this.reportingEvent = reportingEvent;
    return this;
  }

  /**
   * Get reportingEvent
   * @return reportingEvent
  */
  
  @Schema(name = "reporting_event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reporting_event")
  public String getReportingEvent() {
    return reportingEvent;
  }

  public void setReportingEvent(String reportingEvent) {
    this.reportingEvent = reportingEvent;
  }

  public PluginRunData state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public PluginRunData summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
  */
  
  @Schema(name = "summary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public PluginRunData text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  */
  
  @Schema(name = "text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public PluginRunData title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PluginRunData version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginRunData pluginRunData = (PluginRunData) o;
    return Objects.equals(this._package, pluginRunData._package) &&
        Objects.equals(this.reportingEvent, pluginRunData.reportingEvent) &&
        Objects.equals(this.state, pluginRunData.state) &&
        Objects.equals(this.summary, pluginRunData.summary) &&
        Objects.equals(this.text, pluginRunData.text) &&
        Objects.equals(this.title, pluginRunData.title) &&
        Objects.equals(this.version, pluginRunData.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_package, reportingEvent, state, summary, text, title, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginRunData {\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    reportingEvent: ").append(toIndentedString(reportingEvent)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

