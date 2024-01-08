package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SimpleErrorCollection;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RemoveOptionFromIssuesResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class RemoveOptionFromIssuesResult {

  private SimpleErrorCollection errors;

  @Valid
  private List<Long> modifiedIssues;

  @Valid
  private List<Long> unmodifiedIssues;

  public RemoveOptionFromIssuesResult errors(SimpleErrorCollection errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @Valid 
  @Schema(name = "errors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public SimpleErrorCollection getErrors() {
    return errors;
  }

  public void setErrors(SimpleErrorCollection errors) {
    this.errors = errors;
  }

  public RemoveOptionFromIssuesResult modifiedIssues(List<Long> modifiedIssues) {
    this.modifiedIssues = modifiedIssues;
    return this;
  }

  public RemoveOptionFromIssuesResult addModifiedIssuesItem(Long modifiedIssuesItem) {
    if (this.modifiedIssues == null) {
      this.modifiedIssues = new ArrayList<>();
    }
    this.modifiedIssues.add(modifiedIssuesItem);
    return this;
  }

  /**
   * The IDs of the modified issues.
   * @return modifiedIssues
  */
  
  @Schema(name = "modifiedIssues", description = "The IDs of the modified issues.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modifiedIssues")
  public List<Long> getModifiedIssues() {
    return modifiedIssues;
  }

  public void setModifiedIssues(List<Long> modifiedIssues) {
    this.modifiedIssues = modifiedIssues;
  }

  public RemoveOptionFromIssuesResult unmodifiedIssues(List<Long> unmodifiedIssues) {
    this.unmodifiedIssues = unmodifiedIssues;
    return this;
  }

  public RemoveOptionFromIssuesResult addUnmodifiedIssuesItem(Long unmodifiedIssuesItem) {
    if (this.unmodifiedIssues == null) {
      this.unmodifiedIssues = new ArrayList<>();
    }
    this.unmodifiedIssues.add(unmodifiedIssuesItem);
    return this;
  }

  /**
   * The IDs of the unchanged issues, those issues where errors prevent modification.
   * @return unmodifiedIssues
  */
  
  @Schema(name = "unmodifiedIssues", description = "The IDs of the unchanged issues, those issues where errors prevent modification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unmodifiedIssues")
  public List<Long> getUnmodifiedIssues() {
    return unmodifiedIssues;
  }

  public void setUnmodifiedIssues(List<Long> unmodifiedIssues) {
    this.unmodifiedIssues = unmodifiedIssues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveOptionFromIssuesResult removeOptionFromIssuesResult = (RemoveOptionFromIssuesResult) o;
    return Objects.equals(this.errors, removeOptionFromIssuesResult.errors) &&
        Objects.equals(this.modifiedIssues, removeOptionFromIssuesResult.modifiedIssues) &&
        Objects.equals(this.unmodifiedIssues, removeOptionFromIssuesResult.unmodifiedIssues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, modifiedIssues, unmodifiedIssues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveOptionFromIssuesResult {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    modifiedIssues: ").append(toIndentedString(modifiedIssues)).append("\n");
    sb.append("    unmodifiedIssues: ").append(toIndentedString(unmodifiedIssues)).append("\n");
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

