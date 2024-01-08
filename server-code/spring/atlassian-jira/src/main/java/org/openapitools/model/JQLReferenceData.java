package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FieldReferenceData;
import org.openapitools.model.FunctionReferenceData;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Lists of JQL reference data.
 */

@Schema(name = "JQLReferenceData", description = "Lists of JQL reference data.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JQLReferenceData {

  @Valid
  private List<String> jqlReservedWords;

  @Valid
  private List<@Valid FieldReferenceData> visibleFieldNames;

  @Valid
  private List<@Valid FunctionReferenceData> visibleFunctionNames;

  public JQLReferenceData jqlReservedWords(List<String> jqlReservedWords) {
    this.jqlReservedWords = jqlReservedWords;
    return this;
  }

  public JQLReferenceData addJqlReservedWordsItem(String jqlReservedWordsItem) {
    if (this.jqlReservedWords == null) {
      this.jqlReservedWords = new ArrayList<>();
    }
    this.jqlReservedWords.add(jqlReservedWordsItem);
    return this;
  }

  /**
   * List of JQL query reserved words.
   * @return jqlReservedWords
  */
  
  @Schema(name = "jqlReservedWords", description = "List of JQL query reserved words.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jqlReservedWords")
  public List<String> getJqlReservedWords() {
    return jqlReservedWords;
  }

  public void setJqlReservedWords(List<String> jqlReservedWords) {
    this.jqlReservedWords = jqlReservedWords;
  }

  public JQLReferenceData visibleFieldNames(List<@Valid FieldReferenceData> visibleFieldNames) {
    this.visibleFieldNames = visibleFieldNames;
    return this;
  }

  public JQLReferenceData addVisibleFieldNamesItem(FieldReferenceData visibleFieldNamesItem) {
    if (this.visibleFieldNames == null) {
      this.visibleFieldNames = new ArrayList<>();
    }
    this.visibleFieldNames.add(visibleFieldNamesItem);
    return this;
  }

  /**
   * List of fields usable in JQL queries.
   * @return visibleFieldNames
  */
  @Valid 
  @Schema(name = "visibleFieldNames", description = "List of fields usable in JQL queries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibleFieldNames")
  public List<@Valid FieldReferenceData> getVisibleFieldNames() {
    return visibleFieldNames;
  }

  public void setVisibleFieldNames(List<@Valid FieldReferenceData> visibleFieldNames) {
    this.visibleFieldNames = visibleFieldNames;
  }

  public JQLReferenceData visibleFunctionNames(List<@Valid FunctionReferenceData> visibleFunctionNames) {
    this.visibleFunctionNames = visibleFunctionNames;
    return this;
  }

  public JQLReferenceData addVisibleFunctionNamesItem(FunctionReferenceData visibleFunctionNamesItem) {
    if (this.visibleFunctionNames == null) {
      this.visibleFunctionNames = new ArrayList<>();
    }
    this.visibleFunctionNames.add(visibleFunctionNamesItem);
    return this;
  }

  /**
   * List of functions usable in JQL queries.
   * @return visibleFunctionNames
  */
  @Valid 
  @Schema(name = "visibleFunctionNames", description = "List of functions usable in JQL queries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibleFunctionNames")
  public List<@Valid FunctionReferenceData> getVisibleFunctionNames() {
    return visibleFunctionNames;
  }

  public void setVisibleFunctionNames(List<@Valid FunctionReferenceData> visibleFunctionNames) {
    this.visibleFunctionNames = visibleFunctionNames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JQLReferenceData jqLReferenceData = (JQLReferenceData) o;
    return Objects.equals(this.jqlReservedWords, jqLReferenceData.jqlReservedWords) &&
        Objects.equals(this.visibleFieldNames, jqLReferenceData.visibleFieldNames) &&
        Objects.equals(this.visibleFunctionNames, jqLReferenceData.visibleFunctionNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jqlReservedWords, visibleFieldNames, visibleFunctionNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JQLReferenceData {\n");
    sb.append("    jqlReservedWords: ").append(toIndentedString(jqlReservedWords)).append("\n");
    sb.append("    visibleFieldNames: ").append(toIndentedString(visibleFieldNames)).append("\n");
    sb.append("    visibleFunctionNames: ").append(toIndentedString(visibleFunctionNames)).append("\n");
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

