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
 * PluginRun
 */

@JsonTypeName("pluginRun")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class PluginRun {

  private String _package;

  private String reportingEvent;

  private String state;

  private String summary;

  private String text;

  private String title;

  private String version;

  private String deployId;

  public PluginRun _package(String _package) {
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

  public PluginRun reportingEvent(String reportingEvent) {
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

  public PluginRun state(String state) {
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

  public PluginRun summary(String summary) {
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

  public PluginRun text(String text) {
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

  public PluginRun title(String title) {
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

  public PluginRun version(String version) {
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

  public PluginRun deployId(String deployId) {
    this.deployId = deployId;
    return this;
  }

  /**
   * Get deployId
   * @return deployId
  */
  
  @Schema(name = "deploy_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploy_id")
  public String getDeployId() {
    return deployId;
  }

  public void setDeployId(String deployId) {
    this.deployId = deployId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginRun pluginRun = (PluginRun) o;
    return Objects.equals(this._package, pluginRun._package) &&
        Objects.equals(this.reportingEvent, pluginRun.reportingEvent) &&
        Objects.equals(this.state, pluginRun.state) &&
        Objects.equals(this.summary, pluginRun.summary) &&
        Objects.equals(this.text, pluginRun.text) &&
        Objects.equals(this.title, pluginRun.title) &&
        Objects.equals(this.version, pluginRun.version) &&
        Objects.equals(this.deployId, pluginRun.deployId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_package, reportingEvent, state, summary, text, title, version, deployId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginRun {\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    reportingEvent: ").append(toIndentedString(reportingEvent)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    deployId: ").append(toIndentedString(deployId)).append("\n");
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

