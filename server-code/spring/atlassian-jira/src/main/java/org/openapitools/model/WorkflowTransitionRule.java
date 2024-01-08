package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A workflow transition rule.
 */

@Schema(name = "WorkflowTransitionRule", description = "A workflow transition rule.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowTransitionRule {

  private JsonNullable<Object> _configuration = JsonNullable.<Object>undefined();

  private String type;

  public WorkflowTransitionRule() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkflowTransitionRule(String type) {
    this.type = type;
  }

  public WorkflowTransitionRule _configuration(Object _configuration) {
    this._configuration = JsonNullable.of(_configuration);
    return this;
  }

  /**
   * EXPERIMENTAL. The configuration of the transition rule.
   * @return _configuration
  */
  
  @Schema(name = "configuration", description = "EXPERIMENTAL. The configuration of the transition rule.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configuration")
  public JsonNullable<Object> getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(JsonNullable<Object> _configuration) {
    this._configuration = _configuration;
  }

  public WorkflowTransitionRule type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the transition rule.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "The type of the transition rule.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowTransitionRule workflowTransitionRule = (WorkflowTransitionRule) o;
    return equalsNullable(this._configuration, workflowTransitionRule._configuration) &&
        Objects.equals(this.type, workflowTransitionRule.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(_configuration), type);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTransitionRule {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

