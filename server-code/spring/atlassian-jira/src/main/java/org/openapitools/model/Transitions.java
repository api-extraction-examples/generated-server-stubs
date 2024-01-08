package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IssueTransition;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * List of issue transitions.
 */

@Schema(name = "Transitions", description = "List of issue transitions.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Transitions {

  private String expand;

  @Valid
  private List<@Valid IssueTransition> transitions;

  public Transitions expand(String expand) {
    this.expand = expand;
    return this;
  }

  /**
   * Expand options that include additional transitions details in the response.
   * @return expand
  */
  
  @Schema(name = "expand", accessMode = Schema.AccessMode.READ_ONLY, description = "Expand options that include additional transitions details in the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expand")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public Transitions transitions(List<@Valid IssueTransition> transitions) {
    this.transitions = transitions;
    return this;
  }

  public Transitions addTransitionsItem(IssueTransition transitionsItem) {
    if (this.transitions == null) {
      this.transitions = new ArrayList<>();
    }
    this.transitions.add(transitionsItem);
    return this;
  }

  /**
   * List of issue transitions.
   * @return transitions
  */
  @Valid 
  @Schema(name = "transitions", accessMode = Schema.AccessMode.READ_ONLY, description = "List of issue transitions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transitions")
  public List<@Valid IssueTransition> getTransitions() {
    return transitions;
  }

  public void setTransitions(List<@Valid IssueTransition> transitions) {
    this.transitions = transitions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transitions transitions = (Transitions) o;
    return Objects.equals(this.expand, transitions.expand) &&
        Objects.equals(this.transitions, transitions.transitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, transitions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transitions {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    transitions: ").append(toIndentedString(transitions)).append("\n");
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

