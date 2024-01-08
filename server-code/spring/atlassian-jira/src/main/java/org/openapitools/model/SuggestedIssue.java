package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An issue suggested for use in the issue picker auto-completion.
 */

@Schema(name = "SuggestedIssue", description = "An issue suggested for use in the issue picker auto-completion.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SuggestedIssue {

  private Long id;

  private String img;

  private String key;

  private String keyHtml;

  private String summary;

  private String summaryText;

  public SuggestedIssue id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the issue.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SuggestedIssue img(String img) {
    this.img = img;
    return this;
  }

  /**
   * The URL of the issue type's avatar.
   * @return img
  */
  
  @Schema(name = "img", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the issue type's avatar.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("img")
  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public SuggestedIssue key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the issue.
   * @return key
  */
  
  @Schema(name = "key", accessMode = Schema.AccessMode.READ_ONLY, description = "The key of the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public SuggestedIssue keyHtml(String keyHtml) {
    this.keyHtml = keyHtml;
    return this;
  }

  /**
   * The key of the issue in HTML format.
   * @return keyHtml
  */
  
  @Schema(name = "keyHtml", accessMode = Schema.AccessMode.READ_ONLY, description = "The key of the issue in HTML format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keyHtml")
  public String getKeyHtml() {
    return keyHtml;
  }

  public void setKeyHtml(String keyHtml) {
    this.keyHtml = keyHtml;
  }

  public SuggestedIssue summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * The phrase containing the query string in HTML format, with the string highlighted with HTML bold tags.
   * @return summary
  */
  
  @Schema(name = "summary", accessMode = Schema.AccessMode.READ_ONLY, description = "The phrase containing the query string in HTML format, with the string highlighted with HTML bold tags.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public SuggestedIssue summaryText(String summaryText) {
    this.summaryText = summaryText;
    return this;
  }

  /**
   * The phrase containing the query string, as plain text.
   * @return summaryText
  */
  
  @Schema(name = "summaryText", accessMode = Schema.AccessMode.READ_ONLY, description = "The phrase containing the query string, as plain text.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summaryText")
  public String getSummaryText() {
    return summaryText;
  }

  public void setSummaryText(String summaryText) {
    this.summaryText = summaryText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestedIssue suggestedIssue = (SuggestedIssue) o;
    return Objects.equals(this.id, suggestedIssue.id) &&
        Objects.equals(this.img, suggestedIssue.img) &&
        Objects.equals(this.key, suggestedIssue.key) &&
        Objects.equals(this.keyHtml, suggestedIssue.keyHtml) &&
        Objects.equals(this.summary, suggestedIssue.summary) &&
        Objects.equals(this.summaryText, suggestedIssue.summaryText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, img, key, keyHtml, summary, summaryText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestedIssue {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyHtml: ").append(toIndentedString(keyHtml)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    summaryText: ").append(toIndentedString(summaryText)).append("\n");
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

