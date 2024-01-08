package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IssuePickerSuggestionsIssueType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A list of issues suggested for use in auto-completion.
 */

@Schema(name = "IssuePickerSuggestions", description = "A list of issues suggested for use in auto-completion.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssuePickerSuggestions {

  @Valid
  private List<@Valid IssuePickerSuggestionsIssueType> sections;

  public IssuePickerSuggestions sections(List<@Valid IssuePickerSuggestionsIssueType> sections) {
    this.sections = sections;
    return this;
  }

  public IssuePickerSuggestions addSectionsItem(IssuePickerSuggestionsIssueType sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

  /**
   * A list of issues for an issue type suggested for use in auto-completion.
   * @return sections
  */
  @Valid 
  @Schema(name = "sections", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of issues for an issue type suggested for use in auto-completion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sections")
  public List<@Valid IssuePickerSuggestionsIssueType> getSections() {
    return sections;
  }

  public void setSections(List<@Valid IssuePickerSuggestionsIssueType> sections) {
    this.sections = sections;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuePickerSuggestions issuePickerSuggestions = (IssuePickerSuggestions) o;
    return Objects.equals(this.sections, issuePickerSuggestions.sections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuePickerSuggestions {\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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

